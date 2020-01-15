/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * Classe para fazer a gestao das constantes da aplicacao que vao ser
 * cifradas
 * 
 * */
package pt.ktc.openk.pos.utils;

import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class StringConstants {
    private static List<ResourceBundle> m_resources=null;
  
    private static OpenKCipher cipher=null;
  /** Creates a new instance of LocaleResources */
    /*
  public StringConstants() {
      m_resources = new LinkedList<ResourceBundle>();
        }
  */
    
  private static synchronized void init() {
	  if (m_resources==null) {
		  m_resources=new LinkedList<ResourceBundle>();
		  //m_resources.add(ResourceBundle.getBundle("pt.ktc.openk.pos.locales.constants"));
		  m_resources.add(ResourceBundle.getBundle(HardCodedConstants.getHardCodedString(HardCodedConstants.pt_ktc_openk_pos_locales_constants)));
		  
		  //char yPassword1.c >>> 3;
		  String s=Password1.getChar(32342)+Password2.getChar(346)+Password2.getChar(-1234)+Password3.getChar(12)+
		  			Password4.getChar(98564)+Password5.getChar(4)+Password6.getChar(356)+
		  			Password7.getChar(523)+Password7.getChar(-56300)+Password8.getChar(18)+Password9.getChar(111)+Password9.getChar(-3245)+
		  			Password10.getChar(67897)+Password11.getChar(124)+Password12.getChar(1)+Password12.getChar(-673);
		  
		  //if (cipher==null) cipher=new OpenKCipher("83hdgsinfjr3");
		  if (cipher==null) cipher=new OpenKCipher(s);
	  }
  }
    
  public static synchronized String getString(int key) {
      init();
      
      String sKey=Integer.toString(key);
      
      if (sKey == null) {
          return null;
      } else  {            
          for (ResourceBundle r : m_resources) {
              try {
                  return cipher.decrypt(r.getString(sKey));
                  //return r.getString(sKey);
              } catch (MissingResourceException e) {
                  // Next
              }
          }
          
          // MissingResourceException in all ResourceBundle
          return "** " + sKey + " **";
      }
  }

}
