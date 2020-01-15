/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */

package pt.ktc.openk.pos.forms;

import java.io.File;
import java.security.Security;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.LookAndFeel;
import javax.swing.UIManager;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.api.SubstanceSkin;

import pt.ktc.openk.pos.Global;
import pt.ktc.openk.pos.utils.HardCodedConstants;
import pt.ktc.openk.pos.utils.ServiceProperties;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.format.Formats;
import com.openbravo.pos.forms.AppConfig;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.JRootFrame;
import com.openbravo.pos.forms.JRootKiosk;
import com.openbravo.pos.instance.InstanceQuery;

/**
*
* @author  Alexandre Braganca
*/
public class StartOpenKPOS {
	
    private static Logger logger = Logger.getLogger(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_forms_StartOpenKPOS));
    
    /** Creates a new instance of StartPOS */
    public StartOpenKPOS() {
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
    
    public static void main (final String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                if (!registerApp()) {
                    System.exit(1);
                }
                
                // Instalar o BouncyCastle. Assim nao necessita de estar instalado no folder do java
                // NO entanto, como as assinaturas sao feitas pelo postgres e' necessario na mesma!
				BouncyCastleProvider provider = new BouncyCastleProvider();
				Security.addProvider(provider);
				
				//BC is the ID for the Bouncy Castle provider;
		        if (Security.getProvider("BC") == null){
		            System.out.println("Bouncy Castle provider is NOT available");
		        }
		        else{
		            System.out.println("Bouncy Castle provider is available");
		        }
				//---------------------------------------
				
                	  //AppConfig config = new AppConfig(args);
                String home=System.getProperty(StringConstants.getString(StringEnumerates.user_home));
                String appFile=StringConstants.getString(StringEnumerates.openk_pos_properties);

                // Vamos iniciar os valores por omissao
            	Global.openk_pos_properties=StringConstants.getString(StringEnumerates.openk_pos_properties);
            	Global.openk_pos_services_properties=HardCodedConstants.getHardCodedString(HardCodedConstants.openk_pos_services_properties);
                
                // (ATB)(Vamos usar configuracoes hardcoded)
                AppConfig config=null;
                if (args.length==0)
                {
                	config = new AppConfig(new String[]{home+StringConstants.getString(StringEnumerates._slash)+appFile});
                }
                else
                {
                	config = new AppConfig(args);
                	
                	if (args.length>=1) {
                		Global.openk_pos_properties=args[0];
                	}
                 	if (args.length>=2) {
                		Global.openk_pos_services_properties=args[1];
                	}
                	
                }
                config.load();
                
//                // O driver tem de ser o do postgresql
//                // A base de dados tambem e' fixa
//                String db_name=config.getProperty(StringConstants.getString(StringEnumerates.db_name));
//                config.setProperty(StringConstants.getString(StringEnumerates.db_URL), StringConstants.getString(StringEnumerates.jdbc_postgresql___localhost_5432_)+db_name);
//                String dirname = System.getProperty(StringConstants.getString(StringEnumerates.dirname_path));
//                dirname = dirname == null ? "./" : dirname;
//                config.setProperty(StringConstants.getString(StringEnumerates.db_driverlib), new File(new File(dirname), StringConstants.getString(StringEnumerates.postgresql_jdbc3_8_2_jar)).getAbsolutePath());
//                config.setProperty(StringConstants.getString(StringEnumerates.db_driver), StringConstants.getString(StringEnumerates.org_postgresql_Driver));
//
//                // Se quisermos uma configuracao hardcoded 
//                // AppConfigK config = new AppConfigK();
//                
//                // set Locale.
//                String slang = config.getProperty(StringConstants.getString(StringEnumerates.user_language));
//                String scountry = config.getProperty(StringConstants.getString(StringEnumerates.user_country));
//                String svariant = config.getProperty(StringConstants.getString(StringEnumerates.user_variant));
//                if (slang != null && !slang.equals("") && scountry != null && svariant != null) {                                        
//                    Locale.setDefault(new Locale(slang, scountry, svariant));
//                }
//                
//                // Set the format patterns
//                Formats.setIntegerPattern(config.getProperty(StringConstants.getString(StringEnumerates.format_integer)));
//                Formats.setDoublePattern(config.getProperty(StringConstants.getString(StringEnumerates.format_double)));
//                Formats.setCurrencyPattern(config.getProperty(StringConstants.getString(StringEnumerates.format_currency)));
//                Formats.setPercentPattern(config.getProperty(StringConstants.getString(StringEnumerates.format_percent)));
//                Formats.setDatePattern(config.getProperty(StringConstants.getString(StringEnumerates.format_date)));
//                Formats.setTimePattern(config.getProperty(StringConstants.getString(StringEnumerates.format_time)));
//                Formats.setDateTimePattern(config.getProperty(StringConstants.getString(StringEnumerates.format_datetime)));               
                
                // Set the look and feel.
                try {             
                    
                    Object laf = Class.forName(config.getProperty(StringConstants.getString(StringEnumerates.swing_defaultlaf))).newInstance();
                    
                    if (laf instanceof LookAndFeel){
                        UIManager.setLookAndFeel((LookAndFeel) laf);
                    } else if (laf instanceof SubstanceSkin) {                      
                        SubstanceLookAndFeel.setSkin((SubstanceSkin) laf);                   
                    }
                } catch (Exception e) {
                    logger.log(Level.WARNING, StringConstants.getString(StringEnumerates.Cannot_set_look_and_feel), e);
                }
                
                //String screenmode = config.getProperty("machine.screenmode");
                String screenmode = config.getProperty(StringConstants.getString(StringEnumerates.machine_screenmode));
                if (StringConstants.getString(StringEnumerates.fullscreen).equals(screenmode)) {
                    JRootKiosk rootkiosk = new JRootKiosk();
                    rootkiosk.initFrame(config);
                } else {
                    JRootFrame rootframe = new JRootFrame(); 
                    rootframe.initFrame(config);
                }
            }
        });    
    }    


}
