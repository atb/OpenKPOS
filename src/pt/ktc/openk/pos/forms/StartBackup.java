/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.forms;


import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.api.SubstanceSkin;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.JMessageDialog;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.loader.BatchSentence;
import com.openbravo.data.loader.BatchSentenceResource;
import com.openbravo.data.loader.Session;
import com.openbravo.format.Formats;
import com.openbravo.pos.config.JFrmConfig;
import com.openbravo.pos.forms.AppConfig;
import pt.ktc.openk.pos.aspects.AppLocal;
import pt.ktc.openk.pos.backup.GenerateBackup;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.pos.forms.AppProperties;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.AppViewConnection;
import com.openbravo.pos.forms.BeanFactory;
import com.openbravo.pos.forms.BeanFactoryDataSingle;
import com.openbravo.pos.forms.BeanFactoryApp;
import com.openbravo.pos.forms.BeanFactoryException;
import com.openbravo.pos.forms.BeanFactoryObj;
import com.openbravo.pos.forms.BeanFactoryScript;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.forms.JRootApp;
import com.openbravo.pos.forms.JRootFrame;
import com.openbravo.pos.forms.JRootKiosk;
import com.openbravo.pos.instance.InstanceManager;
import com.openbravo.pos.instance.InstanceQuery;
import com.openbravo.pos.printer.DeviceTicket;
import com.openbravo.pos.printer.TicketParser;
import com.openbravo.pos.scale.DeviceScale;
import com.openbravo.pos.scanpal2.DeviceScannerFactory;

/**
*
* @author  Alexandre Braganca
*/
public class StartBackup {
	
    private static Logger logger = Logger.getLogger(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_forms_StartBackup));
    
    /** Creates a new instance of StartPOS */
    public StartBackup() {
    }
    
    public static boolean registerApp() {
                       
        // vemos si existe alguna instancia        
        InstanceQuery i = null;
        try {
            i = new InstanceQuery();
            i.getAppMessage().restoreWindow();
            return false;
        } catch (Exception e) {
            return true;
        }  
    }
    
    private static HashMap<String, String> m_oldclasses; // This is for backwards compatibility purposes

    static {        
    	m_aBeanFactories = new HashMap<String, BeanFactory>();
      initOldClasses();
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
    
    private static Map<String, BeanFactory> m_aBeanFactories;

    public static Object getBean(Map<String, BeanFactory> p_aBeanFactories, String beanfactory) throws Exception {
    	  
    	  // For backwards compatibility
    	  beanfactory = mapNewClass(beanfactory);
    	  
    	  BeanFactory bf = p_aBeanFactories.get(beanfactory);
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
    	            	  // NAO suportamos neste caso
    	            	  throw new BeanFactoryException(StringConstants.getString(StringEnumerates.Old_Beans_NAO_suportados_));
    	                  //Constructor constMyView = bfclass.getConstructor(new Class[] {AppView.class});
    	                  //Object bean = constMyView.newInstance(new Object[] {this});
    	                  //bf = new BeanFactoryObj(bean);
    	              }

    	          } catch (Exception e) {
    	              // ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    	              throw new BeanFactoryException(e);
    	          }
    	      }
    	      
    	      // cache the factory
    	      p_aBeanFactories.put(beanfactory, bf); 
    	      
    	      if (bf instanceof BeanFactoryDataSingle) {
    	    	  ((BeanFactoryDataSingle) bf).init(session);
    	      }
    	      else {
        	      // Initialize if it is a BeanFactoryApp
        	      if (bf instanceof BeanFactoryApp) {
        	    	  throw new Exception(StringConstants.getString(StringEnumerates.Objectos_BeanFactoryApp_NAO_suportados_));
        	          //((BeanFactoryApp) bf).init(session);
        	      }
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
    
    private static AppProperties m_props;
    private static Session session;     
    private static com.openbravo.pos.forms.DataLogicSystem m_dlSystem;
    private static Properties m_propsdb = null;

	public static String initApp(AppProperties props) {

		m_props = props;
		// setPreferredSize(new java.awt.Dimension(800, 600));

		// support for different component orientation languages.
		// applyComponentOrientation(ComponentOrientation.getOrientation(Locale.getDefault()));

		// Database start
		try {
			session = AppViewConnection.createSession(m_props);
		} catch (BasicException e) {
			// JMessageDialog.showMessage(this, new
			// MessageInf(MessageInf.SGN_DANGER, e.getMessage(), e));
			// System.out.println(e.getMessage());
			return e.getMessage();
		}

		// m_dlSystem = (com.openbravo.pos.forms.DataLogicSystem)
		// getBean("com.openbravo.pos.forms.DataLogicSystem");
		try {
			m_dlSystem = (com.openbravo.pos.forms.DataLogicSystem) getBean(m_aBeanFactories, StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_forms_DataLogicSystem));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			return e1.getMessage();
		}

		// Create or upgrade the database if database version is not the
		// expected
		String sDBVersion = readDataBaseVersion();
		if (!AppLocal.OPENKPOS_APP_VERSION.equals(sDBVersion)) {

			// JMessageDialog.showMessage(this, new
			// MessageInf(MessageInf.SGN_DANGER, sDBVersion == null
			// ? "A base de dados nao existe!" // Create script does not exists.
			// Database not supported
			// : "A versao da base de dados nao esta correcta")); // Upgrade
			// script does not exist.

			session.close();
			return StringConstants.getString(StringEnumerates.A_versao_da_base_de_dados_nao_esta_correcta);
		}

		// Cargamos las propiedades de base de datos
		m_propsdb = m_dlSystem.getResourceAsProperties(m_props.getHost()
				+ StringConstants.getString(StringEnumerates._backslash_properties));

		// MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE,
		// "Actualizacao executada", "Mensagem");
		// msg.show(this);
		session.close();
		return ""; // ok
	}

    	private static String readDataBaseVersion() {
    	  try {
    	      return m_dlSystem.findVersion();
    	  } catch (BasicException ed) {
    	      return null;
    	  }
    	}
    
    
    public static void main (final String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        	
            public void run() {
                
// Neste caso a podemos executar com a aplicacao a correr            	
//                if (!registerApp()) {
//                    System.exit(1);
//                }
                
                //AppConfig config = new AppConfig(args);
                String home=System.getProperty(StringConstants.getString(StringEnumerates.user_home));
                String appFile=StringConstants.getString(StringEnumerates.openk_pos_properties);
                
                // (ATB)(Vamos usar configuracoes hardcoded)
                AppConfig config=null;
                if (args.length==0)
                {
                	config = new AppConfig(new String[]{home+StringConstants.getString(StringEnumerates._slash)+appFile});
                }
                else
                {
                	config = new AppConfig(args);
                }
                config.load();
                
                // O driver tem de ser o do postgresql
                // A base de dados tambem e' fixa
                //---------------
                // O que vem a seguir deve ser obtido do ficheiro de configuracao ?!?!
                String db_name=config.getProperty(StringConstants.getString(StringEnumerates.db_name));
                config.setProperty(StringConstants.getString(StringEnumerates.db_URL), StringConstants.getString(StringEnumerates.jdbc_postgresql___localhost_5432_)+db_name);
                String dirname = System.getProperty(StringConstants.getString(StringEnumerates.dirname_path));
                dirname = dirname == null ? StringConstants.getString(StringEnumerates._point_backslash) : dirname;
                config.setProperty(StringConstants.getString(StringEnumerates.db_driverlib), new File(new File(dirname), StringConstants.getString(StringEnumerates.postgresql_jdbc3_8_2_jar)).getAbsolutePath());
                config.setProperty(StringConstants.getString(StringEnumerates.db_driver), StringConstants.getString(StringEnumerates.org_postgresql_Driver));
                //----------

                // Se quisermos uma configuracao hardcoded 
                // AppConfigK config = new AppConfigK();
                
                // set Locale.
                String slang = config.getProperty(StringConstants.getString(StringEnumerates.user_language));
                String scountry = config.getProperty(StringConstants.getString(StringEnumerates.user_country));
                String svariant = config.getProperty(StringConstants.getString(StringEnumerates.user_variant));
                if (slang != null && !slang.equals("") && scountry != null && svariant != null) {                                        
                    Locale.setDefault(new Locale(slang, scountry, svariant));
                }
                
                // Set the format patterns
                Formats.setIntegerPattern(config.getProperty(StringConstants.getString(StringEnumerates.format_integer)));
                Formats.setDoublePattern(config.getProperty(StringConstants.getString(StringEnumerates.format_double)));
                Formats.setCurrencyPattern(config.getProperty(StringConstants.getString(StringEnumerates.format_currency)));
                Formats.setPercentPattern(config.getProperty(StringConstants.getString(StringEnumerates.format_percent)));
                Formats.setDatePattern(config.getProperty(StringConstants.getString(StringEnumerates.format_date)));
                Formats.setTimePattern(config.getProperty(StringConstants.getString(StringEnumerates.format_time)));
                Formats.setDateTimePattern(config.getProperty(StringConstants.getString(StringEnumerates.format_datetime)));               
                
//                // Set the look and feel.
//                try {             
//                    
//                    Object laf = Class.forName(config.getProperty("swing.defaultlaf")).newInstance();
//                    
//                    if (laf instanceof LookAndFeel){
//                        UIManager.setLookAndFeel((LookAndFeel) laf);
//                    } else if (laf instanceof SubstanceSkin) {                      
//                        SubstanceLookAndFeel.setSkin((SubstanceSkin) laf);                   
//                    }
//                } catch (Exception e) {
//                    logger.log(Level.WARNING, "Cannot set look and feel", e);
//                }
//                
//                // Aqui devemos pedir a confirmacao que se deseja executar a actualizacao da base de dados
//                JRootAppUpdateDatabase m_rootapp = new JRootAppUpdateDatabase();
                   
                // A data actual
                Calendar rightNow = Calendar.getInstance();
                SimpleDateFormat df=new SimpleDateFormat(StringConstants.getString(StringEnumerates.yyyy_MM_dd_HH_mm_ss));
                df.setCalendar(rightNow);
                
                String file0=df.format(new Date());
                	//Integer.toString(rightNow.get(Calendar.YEAR));
                
                String initialize=initApp(config);
                if (!initialize.isEmpty()) {
                	System.out.println(file0+StringConstants.getString(StringEnumerates._colon)+initialize);
                	System.exit(-1);
                }
                
                // Vamos chamar o backup....
                GenerateBackup backup=new GenerateBackup();
                
                
                String fileName=file0+StringConstants.getString(StringEnumerates._backup);
                
	        	String backup_path=config.getProperty(StringConstants.getString(StringEnumerates.backup_path));
	        	if ((backup_path==null) || (backup_path.isEmpty())) {
	        		// Erro!
                	System.out.println(file0+StringConstants.getString(StringEnumerates._colon)+StringConstants.getString(StringEnumerates.Local_para_guardar_backups_nao_configurado_));
	        		System.exit(-1);
	        	}
	        	else {
	                // Executar o backup
	                // System.out.println(fileName);
	                // String resultado=backup.generateBackupNoUI(m_aBeanFactories, config, session, backup_path+fileName);
	        		// A seguinte versao vai fazer o backup de toda a base de dados
	        		String resultado=backup.generateBackupNoUI2(m_aBeanFactories, config, session, backup_path+fileName);
	                
	                System.out.println(file0+StringConstants.getString(StringEnumerates._colon)+resultado);	        		
	        	}
                
                // No final saimos
                System.exit(0);
            }
        });    
    }    
}


