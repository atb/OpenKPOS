/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.tools;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.Security;
import java.sql.SQLException;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.api.SubstanceSkin;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.JMessageDialog;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.loader.BatchSentence;
import com.openbravo.data.loader.BatchSentenceResource;
import com.openbravo.data.loader.Session;
import com.openbravo.format.Formats;
import com.openbravo.pos.config.JFrmConfig;
import com.openbravo.pos.forms.AppConfig;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppProperties;
import com.openbravo.pos.forms.AppViewConnection;
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
public class UpdateDatabase {
	
    private static Logger logger = Logger.getLogger(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_forms_UpdateDatabase));
    
    /** Creates a new instance of StartPOS */
    public UpdateDatabase() {
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
                String db_name=config.getProperty(StringConstants.getString(StringEnumerates.db_name));
                config.setProperty(StringConstants.getString(StringEnumerates.db_URL), StringConstants.getString(StringEnumerates.jdbc_postgresql___localhost_5432_)+db_name);
                String dirname = System.getProperty(StringConstants.getString(StringEnumerates.dirname_path));
                dirname = dirname == null ? StringConstants.getString(StringEnumerates._point_backslash) : dirname;
                config.setProperty(StringConstants.getString(StringEnumerates.db_driverlib), new File(new File(dirname), StringConstants.getString(StringEnumerates.postgresql_jdbc3_8_2_jar)).getAbsolutePath());
                config.setProperty(StringConstants.getString(StringEnumerates.db_driver), StringConstants.getString(StringEnumerates.org_postgresql_Driver));

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
                
                // Aqui devemos pedir a confirmacao que se deseja executar a actualizacao da base de dados
                JRootAppUpdateDatabase m_rootapp = new JRootAppUpdateDatabase();
                    
                m_rootapp.initApp(config);
                
                // No final saimos
                System.exit(0);
            }
        });    
    }    
}

