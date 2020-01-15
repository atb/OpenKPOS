/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.aspects;

import java.io.File;
import java.util.Locale;
import java.util.Properties;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;



public privileged aspect AppConfig {
	
//    private File getDefaultConfig() {
//        return new File(new File(System.getProperty("user.home")), AppLocal.APP_ID + ".properties");
//    }

    pointcut callGetDefaultConfig(com.openbravo.pos.forms.AppConfig appConf) : target(appConf) && call(* *.getDefaultConfig());

    File around(com.openbravo.pos.forms.AppConfig appConf) : callGetDefaultConfig(appConf) {
    	return new File(new File(System.getProperty(StringConstants.getString(StringEnumerates.user_home))), pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_ID + StringConstants.getString(StringEnumerates._properties));
	}

    pointcut callLoadDefault(com.openbravo.pos.forms.AppConfig appConf) : target(appConf) && call(* *.loadDefault());

    void around(com.openbravo.pos.forms.AppConfig appConf) : callLoadDefault(appConf) {
    	loadDefault(appConf);
	}

    private void loadDefault(com.openbravo.pos.forms.AppConfig appConf) {
        
        appConf.m_propsconfig = new Properties();
        
        String dirname = System.getProperty(StringConstants.getString(StringEnumerates.dirname_path));
        dirname = dirname == null ? StringConstants.getString(StringEnumerates._point_backslash) : dirname;
        
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.db_driverlib), new File(new File(dirname), StringConstants.getString(StringEnumerates.lib_derby_jar)).getAbsolutePath());
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.db_driver), StringConstants.getString(StringEnumerates.org_apache_derby_jdbc_EmbeddedDriver));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.db_URL), StringConstants.getString(StringEnumerates.jdbc_derby_) + new File(new File(System.getProperty(StringConstants.getString(StringEnumerates.user_home))), pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_ID + StringConstants.getString(StringEnumerates._database)).getAbsolutePath() + StringConstants.getString(StringEnumerates._create_true));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.db_user), "");
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.db_password), "");

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

        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_hostname), appConf.getLocalHostName());
        
        Locale l = Locale.getDefault();
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.user_language), l.getLanguage());
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.user_country), l.getCountry());
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.user_variant), l.getVariant());     
        
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.swing_defaultlaf), System.getProperty(StringConstants.getString(StringEnumerates.swing_defaultlaf), StringConstants.getString(StringEnumerates.javax_swing_plaf_metal_MetalLookAndFeel)));
        
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_printer), StringConstants.getString(StringEnumerates.screen));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_printer_2), StringConstants.getString(StringEnumerates.Not_defined));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_printer_3), StringConstants.getString(StringEnumerates.Not_defined));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_display), StringConstants.getString(StringEnumerates.screen));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_scale), StringConstants.getString(StringEnumerates.Not_defined));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_screenmode), StringConstants.getString(StringEnumerates.window)); // fullscreen / window
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_ticketsbag), StringConstants.getString(StringEnumerates.standard));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_scanner), StringConstants.getString(StringEnumerates.Not_defined));
        
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.payment_gateway), StringConstants.getString(StringEnumerates.external));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.payment_magcardreader), StringConstants.getString(StringEnumerates.Not_defined));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.payment_testmode), StringConstants.getString(StringEnumerates._false));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.payment_commerceid), "");
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.payment_commercepassword), StringConstants.getString(StringEnumerates.password));
        
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_printername), StringConstants.getString(StringEnumerates._Default_));

        // Receipt printer paper set to 72mmx200mm
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_receipt_x), StringConstants.getString(StringEnumerates._10));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_receipt_y), StringConstants.getString(StringEnumerates._287));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_receipt_width), StringConstants.getString(StringEnumerates._190));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_receipt_height), StringConstants.getString(StringEnumerates._546));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_receipt_mediasizename), StringConstants.getString(StringEnumerates.A4));

        // Normal printer paper for A4
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_standard_x), StringConstants.getString(StringEnumerates._72));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_standard_y), StringConstants.getString(StringEnumerates._72));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_standard_width), StringConstants.getString(StringEnumerates._451));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_standard_height), StringConstants.getString(StringEnumerates._698));
        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.paper_standard_mediasizename), StringConstants.getString(StringEnumerates.A4));

        appConf.m_propsconfig.setProperty(StringConstants.getString(StringEnumerates.machine_uniqueinstance), StringConstants.getString(StringEnumerates._false));
    }

}
