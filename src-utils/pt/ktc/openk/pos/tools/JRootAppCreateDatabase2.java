/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.tools;

import java.awt.ComponentOrientation;
import java.io.File;
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
import com.openbravo.pos.forms.DriverWrapper;
import com.openbravo.pos.forms.JPrincipalApp;
import com.openbravo.pos.printer.DeviceTicket;
import com.openbravo.pos.printer.TicketParser;
import com.openbravo.pos.scale.DeviceScale;
import com.openbravo.pos.scanpal2.DeviceScanner;
import com.openbravo.pos.util.AltEncrypter;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.Session;


public class JRootAppCreateDatabase2 implements AppView {

	private Properties m_props;
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

	/** Creates new form JRootApp */
	public JRootAppCreateDatabase2() {    

	  m_aBeanFactories = new HashMap<String, BeanFactory>();
	  
	  // Inicializo los componentes visuales
	  //initComponents ();            
	  //jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(35, 35));   
	}
	
    public static Session createSession(Properties props) throws BasicException {
        
        try{

            ClassLoader cloader = new URLClassLoader(new URL[] {new File(props.getProperty("db.driverlib")).toURI().toURL()});
            DriverManager.registerDriver(new DriverWrapper((Driver) Class.forName(props.getProperty("db.driver"), true, cloader).newInstance()));
 
            String sDBUser = props.getProperty("db.user");
            String sDBPassword = props.getProperty("db.password");        
            if (sDBUser != null && sDBPassword != null && sDBPassword.startsWith("crypt:")) {
                // the password is encrypted
                AltEncrypter cypher = new AltEncrypter("cypherkey" + sDBUser);
                sDBPassword = cypher.decrypt(sDBPassword.substring(6));
            }   

             return new Session(props.getProperty("db.URL"), sDBUser,sDBPassword);     

        } catch (InstantiationException e) {
            throw new BasicException("message.databasedrivererror", e);
        } catch (IllegalAccessException eIA) {
            throw new BasicException("message.databasedrivererror", eIA);
        } catch (MalformedURLException eMURL) {
            throw new BasicException("message.databasedrivererror", eMURL);
        } catch (ClassNotFoundException eCNF) {
            throw new BasicException("message.databasedrivererror", eCNF);
        } catch (SQLException eSQL) {
            throw new BasicException("message.databaseconnectionerror", eSQL);
        }   
    }

	public boolean initApp(Properties props, String versao) {

		boolean continuar=false;
		m_props = props;
		//setPreferredSize(new java.awt.Dimension(800, 600));

		// support for different component orientation languages.
		//applyComponentOrientation(ComponentOrientation.getOrientation(Locale.getDefault()));

		// Database start
		try {
			session = createSession(m_props);
		} catch (BasicException e) {
			//JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_DANGER, e.getMessage(), e));
			System.out.println(e.getMessage());
			return false;
		}

//		m_dlSystem = (com.openbravo.pos.forms.DataLogicSystem) getBean(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_forms_DataLogicSystem));
//
//		// Verificar se a base de dados existe....
//		String sDBVersion = readDataBaseVersion();        
//		if (sDBVersion!=null) {
//			System.out.println("Aparentemente a base de dados <"+props.getProperty("db.name")+"> existe e não está vazia. Deve criar uma base de dados vazia.");
//			session.close();
//			return false;
//		}

		// Create the database
		String sScript="";
		if (versao.compareTo("demo")==0)
			sScript = "/pt/ktc/openk/pos/tools/scripts/demo/" + session.DB.getName() + StringConstants.getString(StringEnumerates._create_sql);
		else
			sScript = "/pt/ktc/openk/pos/tools/scripts/" + session.DB.getName() + StringConstants.getString(StringEnumerates._create_sql);
			
		if (JRootAppCreateDatabase2.class.getResource(sScript) == null) {
			System.out.println(StringConstants.getString(StringEnumerates.message_databasenotsupported));
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
					//System.out.println(StringConstants.getString(StringEnumerates.APP_ID));
					BatchSentence bsentence = new pt.ktc.openk.pos.data.loader.BatchSentenceResource(this.session, sScript);
					bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_ID), Matcher.quoteReplacement(AppLocal.OPENKPOS_APP_ID));
					bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_NAME), Matcher.quoteReplacement(AppLocal.OPENKPOS_APP_NAME));
					bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_VERSION), Matcher.quoteReplacement(AppLocal.OPENKPOS_APP_VERSION));

					java.util.List l = bsentence.list();
					if (l.size() > 0) {
						System.out.println("A criação da base de dados executou com as seguintes mensagens:");
						for (Object s: l) {
							System.out.println(s.toString());
						}
						//JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_WARNING, "A criação da base de dados executou com as seguintes mensagens:", l.toArray(new Throwable[l.size()])));
					}

					//MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, StringConstants.getString(StringEnumerates.Actualizacao_executada), StringConstants.getString(StringEnumerates.Mensagem));
					//msg.show(this);
					System.out.println(StringConstants.getString(StringEnumerates.Actualizacao_executada));
					session.close();
					return false;           
				} catch (BasicException e) {
					//JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_DANGER, com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.Database_ScriptError)), e));
					System.out.println(StringConstants.getString(StringEnumerates.Database_ScriptError));
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
		return classname;
//	    String newclass = m_oldclasses.get(classname);
//	    return newclass == null 
//	            ? classname 
//	            : newclass;
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

