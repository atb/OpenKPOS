/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.forms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Logger;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.pos.forms.AppConfig;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppProperties;

public class AppConfigK implements AppProperties {

    private static Logger logger = Logger.getLogger(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_forms_AppConfigK));
    
    private Properties m_propsconfig;
    //private File configfile;
      
    public AppConfigK() {
    	loadDefault();
        logger.info(StringConstants.getString(StringEnumerates.Reading_DEFAULT_configuration_file__));
    }
        
    public String getProperty(String sKey) {
        return m_propsconfig.getProperty(sKey);
    }
    
    public String getHost() {
        return getProperty(StringConstants.getString(StringEnumerates.machine_hostname));
    } 
        
    public void setProperty(String sKey, String sValue) {
        if (sValue == null) {
            m_propsconfig.remove(sKey);
        } else {
            m_propsconfig.setProperty(sKey, sValue);
        }
    }
    
    private String getLocalHostName() {
        try {
            return java.net.InetAddress.getLocalHost().getHostName();
        } catch (java.net.UnknownHostException eUH) {
            return StringConstants.getString(StringEnumerates.localhost);
        }
    }
   
    public boolean delete() {
        loadDefault();
        //return configfile.delete();
        return true;
    }
    
    public void load() {

        loadDefault();
    
    }
    
    public void save() throws IOException {

    	// nothing to do
    }
    
    private void loadDefault() {
        
        m_propsconfig = new Properties();
        
        String dirname = System.getProperty(StringConstants.getString(StringEnumerates.dirname_path));
        dirname = dirname == null ? StringConstants.getString(StringEnumerates._point_backslash) : dirname;
        
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.db_driverlib), new File(new File(dirname), StringConstants.getString(StringEnumerates.postgresql_jdbc3_8_2_jar)).getAbsolutePath());
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.db_driver), StringConstants.getString(StringEnumerates.org_postgresql_Driver));
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.db_URL), StringConstants.getString(StringEnumerates.jdbc_postgresql___localhost_5432_financas_teste));
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.db_user), StringConstants.getString(StringEnumerates.openk));
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.db_password), StringConstants.getString(StringEnumerates.crypt_6262C92C25FD00C6));


//        m_propsconfig.setProperty("db.driverlib", new File(new File(dirname), "lib/hsqldb.jar").getAbsolutePath());
//        m_propsconfig.setProperty("db.driver", "org.hsqldb.jdbcDriver");
//        m_propsconfig.setProperty("db.URL", "jdbc:hsqldb:file:" + new File(new File(System.getProperty("user.home")), AppLocal.APP_ID + "-db").getAbsolutePath() + ";shutdown=true");
//        m_propsconfig.setProperty("db.user", "sa");
//        m_propsconfig.setProperty("db.password", "");
        
//        m_propsconfig.setProperty("db.driver", "com.mysql.jdbc.Driver");
//        m_propsconfig.setProperty("db.URL", "jdbc:mysql://localhost:3306/database");
//        m_propsconfig.setProperty("db.user", "user");         
//        m_propsconfig.setProperty("db.password", "password");
        
//        m_propsconfig.setProperty("db.driver", "org.postgresql.Driver");
//        m_propsconfig.setProperty("db.URL", "jdbc:postgresql://localhost:5432/database");
//        m_propsconfig.setProperty("db.user", "user");         
//        m_propsconfig.setProperty("db.password", "password");        

        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_hostname), getLocalHostName());	// ok
        
//        Locale l = Locale.getDefault();
//        m_propsconfig.setProperty("user.language", l.getLanguage());
//        m_propsconfig.setProperty("user.country", l.getCountry());
//        m_propsconfig.setProperty("user.variant", l.getVariant());     

      m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.user_language), StringConstants.getString(StringEnumerates.pt));		// ok
      m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.user_country), StringConstants.getString(StringEnumerates.PT));		// ok
      m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.user_variant), "");     	// ok
        
        
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.swing_defaultlaf), System.getProperty(StringConstants.getString(StringEnumerates.swing_defaultlaf), StringConstants.getString(StringEnumerates.javax_swing_plaf_metal_MetalLookAndFeel)));	// ok
        
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_printer), StringConstants.getString(StringEnumerates.screen));					// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_printer_2), StringConstants.getString(StringEnumerates.Not_defined));			// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_printer_3), StringConstants.getString(StringEnumerates.Not_defined));			// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_display), StringConstants.getString(StringEnumerates.screen));					// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_scale), StringConstants.getString(StringEnumerates.screen));					// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_screenmode), StringConstants.getString(StringEnumerates.window)); 				// "fullscreen" / "window" - ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_ticketsbag), StringConstants.getString(StringEnumerates.standard));			// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_scanner), StringConstants.getString(StringEnumerates.Not_defined));			// ok
        
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.payment_gateway), StringConstants.getString(StringEnumerates.external));					// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.payment_magcardreader), StringConstants.getString(StringEnumerates.Not_defined));			// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.payment_testmode), StringConstants.getString(StringEnumerates._false));						// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.payment_commerceid), "");						// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.payment_commercepassword), "");					// ok
        
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_printername), StringConstants.getString(StringEnumerates._Default_));			// ok

        // Receipt printer paper set to 72mmx200mm
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_receipt_x), StringConstants.getString(StringEnumerates._10));						// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_receipt_y), StringConstants.getString(StringEnumerates._287));					// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_receipt_width), StringConstants.getString(StringEnumerates._190));				// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_receipt_height), StringConstants.getString(StringEnumerates._546));				// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_receipt_mediasizename), StringConstants.getString(StringEnumerates.A4));			// ok

        // Normal printer paper for A4
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_standard_x), StringConstants.getString(StringEnumerates._72));					// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_standard_y), StringConstants.getString(StringEnumerates._72));					// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_standard_width), StringConstants.getString(StringEnumerates._451));				// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_standard_height), StringConstants.getString(StringEnumerates._698));				// ok
        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_standard_mediasizename), StringConstants.getString(StringEnumerates.A4));		// ok

        m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_uniqueinstance), StringConstants.getString(StringEnumerates._false));			// ok	
    }

	@Override
	public File getConfigFile() {
		// TODO Auto-generated method stub
		return null;
	}

}
