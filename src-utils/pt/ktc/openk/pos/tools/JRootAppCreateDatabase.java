/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.tools;

import java.awt.ComponentOrientation;
import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import pt.ktc.openk.pos.aspects.AppLocal;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.JMessageDialog;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.loader.BatchSentence;
import com.openbravo.data.loader.BatchSentenceResource;
import com.openbravo.data.loader.Session;
import com.openbravo.pos.forms.AppProperties;
import com.openbravo.pos.forms.AppUserView;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.AppViewConnection;
import com.openbravo.pos.forms.BeanFactory;
import com.openbravo.pos.forms.BeanFactoryApp;
import com.openbravo.pos.forms.BeanFactoryException;
import com.openbravo.pos.forms.BeanFactoryObj;
import com.openbravo.pos.forms.BeanFactoryScript;
import com.openbravo.pos.forms.JPrincipalApp;
import com.openbravo.pos.printer.DeviceTicket;
import com.openbravo.pos.printer.TicketParser;
import com.openbravo.pos.scale.DeviceScale;
import com.openbravo.pos.scanpal2.DeviceScanner;

public class JRootAppCreateDatabase extends JPanel implements AppView {

	private AppProperties m_props;
	private Session session;     
	private com.openbravo.pos.forms.DataLogicSystem m_dlSystem;

	private Properties m_propsdb = null;
	private String m_sActiveCashIndex;
	private int m_iActiveCashSequence;
	private Date m_dActiveCashDateStart;
	private Date m_dActiveCashDateEnd;

	private String m_sInventoryLocation;

	private StringBuffer inputtext;

	private DeviceScale m_Scale;
	private DeviceScanner m_Scanner;
	private DeviceTicket m_TP;   
	private TicketParser m_TTP;

	private Map<String, BeanFactory> m_aBeanFactories;

	private JPrincipalApp m_principalapp = null;

	private static HashMap<String, String> m_oldclasses; // This is for backwards compatibility purposes

	static {        
	  initOldClasses();
	}

	/** Creates new form JRootApp */
	public JRootAppCreateDatabase() {    

	  m_aBeanFactories = new HashMap<String, BeanFactory>();
	  
	  // Inicializo los componentes visuales
	  //initComponents ();            
	  //jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(35, 35));   
	}

	public boolean initApp(AppProperties props, String versao) {

		boolean continuar=false;
		m_props = props;
		//setPreferredSize(new java.awt.Dimension(800, 600));

		// support for different component orientation languages.
		applyComponentOrientation(ComponentOrientation.getOrientation(Locale.getDefault()));

		// Database start
		try {
			session = AppViewConnection.createSession(m_props);
		} catch (BasicException e) {
			JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_DANGER, e.getMessage(), e));
			return false;
		}

		m_dlSystem = (com.openbravo.pos.forms.DataLogicSystem) getBean(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_forms_DataLogicSystem));

		// Verificar se a base de dados existe....
		String sDBVersion = readDataBaseVersion();        
		if (sDBVersion==null) {
			int resposta=JOptionPane.showConfirmDialog(this
					, "Por favor confirme que a base de dados <"+props.getProperty("db.name")+"> foi criada vazia. Nesse caso responda afirmativamente para continuar."
					, "Aviso"
					, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (resposta== JOptionPane.YES_OPTION) {
				continuar=true;
			}
		} 
		else {
			JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_DANGER, "Aparentemente a base de dados <"+props.getProperty("db.name")+"> existe e não está vazia. Deve criar uma base de dados vazia.")); 

			session.close();
			return false;
		}

		// Create the database
		String sScript="";
		if (versao.compareTo("demo")==0)
			sScript = "/pt/ktc/openk/pos/tools/scripts/demo/" + session.DB.getName() + StringConstants.getString(StringEnumerates._create_sql);
		else
			sScript = "/pt/ktc/openk/pos/tools/scripts/" + session.DB.getName() + StringConstants.getString(StringEnumerates._create_sql);
			
		if (JRootAppCreateDatabase.class.getResource(sScript) == null) {
			JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_DANGER, 
					com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_databasenotsupported), this.session.DB.getName()))); // Create script does not exist.
			this.session.close();
			return false;
		} else {
//			// Create or upgrade script exists.
//			if (JOptionPane.showConfirmDialog(this
//					, com.openbravo.pos.forms.AppLocal.getIntString(sDBVersion == null ? StringConstants.getString(StringEnumerates.message_createdatabase) : StringConstants.getString(StringEnumerates.message_updatedatabase))
//					, com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_title))
//					, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) 
			{  

				try {
					BatchSentence bsentence = new pt.ktc.openk.pos.data.loader.BatchSentenceResource(this.session, sScript);
					bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_ID), Matcher.quoteReplacement(AppLocal.OPENKPOS_APP_ID));
					bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_NAME), Matcher.quoteReplacement(AppLocal.OPENKPOS_APP_NAME));
					bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_VERSION), Matcher.quoteReplacement(AppLocal.OPENKPOS_APP_VERSION));

					java.util.List l = bsentence.list();
					if (l.size() > 0) {
						JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_WARNING, "A criação da base de dados executou com as seguintes mensagens:", l.toArray(new Throwable[l.size()])));
					}

					MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, StringConstants.getString(StringEnumerates.Actualizacao_executada), StringConstants.getString(StringEnumerates.Mensagem));
					msg.show(this);
					session.close();
					return false;           
				} catch (BasicException e) {
					JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_DANGER, com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.Database_ScriptError)), e));
					this.session.close();
					return false;
				}     
			} 
//			else {
//				this.session.close();
//				return false;
//			}
		}   
	}

	private String readDataBaseVersion() {
	  try {
	      return m_dlSystem.findVersion();
	  } catch (BasicException ed) {
	      return null;
	  }
	}

	public Object getBean(String beanfactory) throws BeanFactoryException {
	  
	  // For backwards compatibility
	  beanfactory = mapNewClass(beanfactory);
	  
	  
	  BeanFactory bf = m_aBeanFactories.get(beanfactory);
	  if (bf == null) {   
	      
	      // testing sripts
	      if (beanfactory.startsWith(StringConstants.getString(StringEnumerates._slash))) {
	          bf = new BeanFactoryScript(beanfactory);               
	      } else {
	          // Class BeanFactory
	          try {
	              Class bfclass = Class.forName(beanfactory);

	              if (BeanFactory.class.isAssignableFrom(bfclass)) {
	                  bf = (BeanFactory) bfclass.newInstance();             
	              } else {
	                  // the old construction for beans...
	                  Constructor constMyView = bfclass.getConstructor(new Class[] {AppView.class});
	                  Object bean = constMyView.newInstance(new Object[] {this});

	                  bf = new BeanFactoryObj(bean);
	              }

	          } catch (Exception e) {
	              // ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
	              throw new BeanFactoryException(e);
	          }
	      }
	      
	      // cache the factory
	      m_aBeanFactories.put(beanfactory, bf);         
	      
	      // Initialize if it is a BeanFactoryApp
	      if (bf instanceof BeanFactoryApp) {
	          ((BeanFactoryApp) bf).init(this);
	      }
	  }
	  return bf.getBean();
	}

	private static String mapNewClass(String classname) {
	    String newclass = m_oldclasses.get(classname);
	    return newclass == null 
	            ? classname 
	            : newclass;
	}

	private static void initOldClasses() {
	    m_oldclasses = new HashMap<String, String>();
	    
	    // update bean names from 2.00 to 2.20    
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportCustomers), StringConstants.getString(StringEnumerates._com_openbravo_reports_customers_bs));
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportCustomersB), StringConstants.getString(StringEnumerates._com_openbravo_reports_customersb_bs));
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportClosedPos), StringConstants.getString(StringEnumerates._com_openbravo_reports_closedpos_bs));
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportClosedProducts), StringConstants.getString(StringEnumerates._com_openbravo_reports_closedproducts_bs));
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JChartSales), StringConstants.getString(StringEnumerates._com_openbravo_reports_chartsales_bs));
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportInventory), StringConstants.getString(StringEnumerates._com_openbravo_reports_inventory_bs));
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportInventory2), StringConstants.getString(StringEnumerates._com_openbravo_reports_inventoryb_bs));
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportInventoryBroken), StringConstants.getString(StringEnumerates._com_openbravo_reports_inventorybroken_bs));
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportInventoryDiff), StringConstants.getString(StringEnumerates._com_openbravo_reports_inventorydiff_bs));
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportPeople), StringConstants.getString(StringEnumerates._com_openbravo_reports_people_bs));
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportTaxes), StringConstants.getString(StringEnumerates._com_openbravo_reports_taxes_bs));
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportUserSales), StringConstants.getString(StringEnumerates._com_openbravo_reports_usersales_bs));
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportProducts), StringConstants.getString(StringEnumerates._com_openbravo_reports_products_bs));
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportCatalog), StringConstants.getString(StringEnumerates._com_openbravo_reports_productscatalog_bs));
	    
	    // update bean names from 2.10 to 2.20
	    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_panels_JPanelTax), StringConstants.getString(StringEnumerates.com_openbravo_pos_inventory_TaxPanel));
	   
	}

	@Override
	public DeviceScale getDeviceScale() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeviceTicket getDeviceTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeviceScanner getDeviceScanner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session getSession() {
		// TODO Auto-generated method stub
	    return session;
	}

	@Override
	public AppProperties getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setActiveCash(String value, int iSeq, Date dStart, Date dEnd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getActiveCashIndex() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getActiveCashSequence() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Date getActiveCashDateStart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getActiveCashDateEnd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInventoryLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void waitCursorBegin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitCursorEnd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AppUserView getAppUserView() {
		// TODO Auto-generated method stub
		return null;
	}

}

