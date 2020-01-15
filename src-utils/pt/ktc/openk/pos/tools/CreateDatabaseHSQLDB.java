package pt.ktc.openk.pos.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.Security;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.LookAndFeel;
import javax.swing.UIManager;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.api.SubstanceSkin;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.format.Formats;
import com.openbravo.pos.forms.AppConfig;
import com.openbravo.pos.instance.InstanceQuery;

public class CreateDatabaseHSQLDB {
	
    private static Logger logger = Logger.getLogger(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_forms_UpdateDatabase));
    
    /** Creates a new instance of StartPOS */
    public CreateDatabaseHSQLDB() {
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
    
	  public static String getAppPath(Object obj) {
		  String applicationDir = obj.getClass().getProtectionDomain().getCodeSource().getLocation().getPath(); 
		  
		  if (applicationDir.endsWith(".exe"))
		  {
			  applicationDir = new File(applicationDir).getParent();
		  }
		  // (ATB)(2012-11-26) Aparentemente e' necessario isto...
		  if (applicationDir.endsWith(".jar"))
		  {
			  applicationDir = new File(applicationDir).getParent();
		  }
		  if (applicationDir.endsWith("/bin/"))
		  {
			  applicationDir = new File(applicationDir).getParent();
		  }
		  if (!applicationDir.endsWith("/")) {
			  applicationDir+="/";
		  }
		  return applicationDir;
	  }
	  
    
    public static void main (final String args[]) {
    	
		// Vamos usar um argumento para indicar os ficheiros a processar...
		if (args.length!=1) {
			System.out.println("CreateDatabaseHSQLDB: e' necessario indicar a 'versao' a processar...");
		}
		else {    	
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

	                // Abrir o ficheiro de propriedades
	                Properties config=null;
	                String path=getAppPath(this)+"src-utils/";
	                System.out.println(path);
	                String args2[]=new String[]{path+"openk_pos_"+args[0]+"_admin.properties"};
	                InputStream in;
					try {
						in = new FileInputStream(args2[0]);
		                config = new Properties();
		                config.load(in);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
	                    System.exit(1);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
	                    System.exit(1);
					}
	                
	                // O driver tem de ser o do postgresql
	                // A base de dados tambem e' fixa
	                //(ATB)(2012-12-12) A configuracao a usar e' exactamente a que estiver no ficheiro de propriedades....
	                String db_name=config.getProperty(StringConstants.getString(StringEnumerates.db_name));
	                config.setProperty(StringConstants.getString(StringEnumerates.db_URL), "jdbc:hsqldb:file:"+db_name+";crypt_lobs=true;crypt_key=537c3950a35a7b733a22f48f01a0e79a;crypt_type=blowfish");
	                String dirname = System.getProperty(StringConstants.getString(StringEnumerates.dirname_path));
	                dirname = dirname == null ? StringConstants.getString(StringEnumerates._point_backslash) : dirname;
	                config.setProperty(StringConstants.getString(StringEnumerates.db_driverlib), new File(new File(dirname), "hsqldb.jar").getAbsolutePath());
	                config.setProperty(StringConstants.getString(StringEnumerates.db_driver), "org.hsqldb.jdbc.JDBCDriver");
	
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
	                
	                // Aqui devemos pedir a confirmacao que se deseja executar a criacao da base de dados
	                JRootAppCreateDatabase2 m_rootapp = new JRootAppCreateDatabase2();
	                    
	                m_rootapp.initApp(config, args[0]);
	                
	                // No final saimos
	                System.exit(0);
	            }
	        });    
		}
	}    
}