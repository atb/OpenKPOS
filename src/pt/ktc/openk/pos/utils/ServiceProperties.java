package pt.ktc.openk.pos.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;

import pt.ktc.openk.pos.Global;

public class ServiceProperties {
	private static Properties m_properties=null;
    private static List<ResourceBundle> m_resources=null;
    private static OpenKCipher cipher=null;
    
  // Os identificadores das propriedades...
  public static final int customer_nif=1;
  public static final int customer_name=2;
  public static final int customer_address=3;
  public static final int customer_zip_code=4;
  public static final int customer_city=5;
  public static final int macaddres=6;
  public static final int date=7;
  public static final int receipt_mode=8;
  public static final int application_mode=9;
  
  public static final int db_name=10;
  public static final int db_user=11;
  public static final int db_password=12;
  public static final int db_URL=13;
  public static final int db_driverLib=14;
  public static final int db_driver=15;
  
  public static final int hsqldb_cryptkey=16;
  public static final int crypt_type=17;
  
  public static final int machine_uniqueinstance=18;
  public static final int machine_scale=19;
  public static final int machine_scanner=20;
  public static final int machine_ticketsbag=21;
  public static final int machine_screenmode=22;
  public static final int machine_hostname=23;
  public static final int machine_display=24;
  public static final int machine_printername=25;
  public static final int machine_printer=26;
  public static final int machine_printer_2=27;
  public static final int machine_printer_3=28;
  
  public static final int customer_denomination=29;
  public static final int customer_installation=30;
  
  public static synchronized String getAppPath(Object obj) {
	  String applicationDir = obj.getClass().getProtectionDomain().getCodeSource().getLocation().getPath(); 
	  
	  // Se a aplicacao for empacotada pelo one-jar o getPath() devolve o seguinte:
	  // file:/workspaces/openk_pos_v1_1/openk_pos_v1_2_discount/build/jar/openkpos2.jar!/main/openkpos.jar
//	  System.out.println("applicationDir1="+applicationDir);
//	  
//	  int index=applicationDir.indexOf(".jar");
//	  if (index!=-1) {
//		  // Tratar o caso particular do one-jar
//		  applicationDir=applicationDir.substring(0, index+4);
//	  }
//
//	  System.out.println("applicationDir2="+applicationDir);

	  if (applicationDir.endsWith(".exe"))
	  {
		  applicationDir = new File(applicationDir).getParent();
	  }
	  // (ATB)(2012-11-26) Aparentemente e' necessario isto...
	  if (applicationDir.endsWith(".jar"))
	  {
		  applicationDir = new File(applicationDir).getParent();
	  }
	  if (!applicationDir.endsWith("/")) {
		  applicationDir+="/";
	  }
//	  else
//	  {
//		  // Add the path to the class files  
//		  applicationDir += obj.getClass().getName().replace('.', '/');
//
//	      // Step one level up as we are only interested in the 
//	      // directory containing the class files
//	      applicationDir = new File(applicationDir).getParent();
//	  }
	  return applicationDir;
  }
  
  public static synchronized void init(Object obj, String customerTaxid, String customerName) {
	  
	  if (m_properties==null) {
		    m_properties=new Properties();
			try {
				//m_properties.load(new FileInputStream("/workspaces/openk_pos_v1_1/openk_pos_v1_2_discount/openk_pos.properties"));
				String path=getAppPath(obj);
				System.out.println("openk_pos_services: app path="+path);  // (ATB)(2013-04-12)
				
				// Agora podemos inicialiar os servicos com base no segundo parametro da aplicacao
				// Global.openk_pos_services_properties
				//m_properties.load(new FileInputStream(path+HardCodedConstants.getHardCodedString(HardCodedConstants.openk_pos_services_properties)));
				m_properties.load(new FileInputStream(path+Global.openk_pos_services_properties));

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				m_properties=null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				m_properties=null;
			}

		  if (cipher==null) cipher=new OpenKCipher(customerTaxid+customerName);
	  }
//	  if (m_resources==null) {
//		  m_resources=new LinkedList<ResourceBundle>();
//		  m_resources.add(ResourceBundle.getBundle(HardCodedConstants.getHardCodedString(HardCodedConstants.openk_pos_services_properties)));
//		  
//		  if (cipher==null) cipher=new OpenKCipher(customer_taxid+customer_name);
//	  }
  }
    
  public static synchronized String getString(int key) {
      if (cipher==null) return "** " + key + " **";
      
      String sKey=Integer.toString(key);
      
      if (sKey == null) {
          return null;
      } 
      
	  return cipher.decrypt(m_properties.getProperty(sKey));
//          for (ResourceBundle r : m_resources) {
//              try {
//                  return cipher.decrypt(r.getString(sKey));
//                  //return r.getString(sKey);
//              } catch (MissingResourceException e) {
//                  // Next
//              }
          
      // MissingResourceException in all ResourceBundle
      // return "** " + sKey + " **";
  }
}
