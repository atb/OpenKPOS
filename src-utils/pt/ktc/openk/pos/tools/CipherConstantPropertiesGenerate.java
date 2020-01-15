/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Properties;

import pt.ktc.openk.pos.tools.utils.security.OpenKEncrypter;

public class CipherConstantPropertiesGenerate {

	  public static String getAppPath(Object obj) {
		  String applicationDir = obj.getClass().getProtectionDomain().getCodeSource().getLocation().getPath(); 
		  
		  // Se a aplicacao for empacotada pelo one-jar o getPath() devolve o seguinte:
		  // file:/workspaces/openk_pos_v1_1/openk_pos_v1_2_discount/build/jar/openkpos2.jar!/main/openkpos.jar
//		  System.out.println("applicationDir1="+applicationDir);
//		  
//		  int index=applicationDir.indexOf(".jar");
//		  if (index!=-1) {
//			  // Tratar o caso particular do one-jar
//			  applicationDir=applicationDir.substring(0, index+4);
//		  }
	//
//		  System.out.println("applicationDir2="+applicationDir);

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
//		  else
//		  {
//			  // Add the path to the class files  
//			  applicationDir += obj.getClass().getName().replace('.', '/');
	//
//		      // Step one level up as we are only interested in the 
//		      // directory containing the class files
//		      applicationDir = new File(applicationDir).getParent();
//		  }
		  return applicationDir;
	  }
	
	public String generate() {
		
		try {

			OpenKEncrypter enc=new OpenKEncrypter("83hdgsinfjr3");
//			Cipher c=new Cipher();
//			
//			javax.crypto.Cipher cipherEncrypt = javax.crypto.Cipher.getInstance("DESEDE/ECB/PKCS5Padding");
//	        cipherEncrypt.init(javax.crypto.Cipher.ENCRYPT_MODE, c.getPrivateKey());
//	        
//	        javax.crypto.Cipher cipherDecrypt = javax.crypto.Cipher.getInstance("DESEDE/ECB/PKCS5Padding");
//	        cipherDecrypt.init(javax.crypto.Cipher.DECRYPT_MODE, c.getPrivateKey());

			
			// Vamos experimentar abrir o ficheiro de propriedades...
			Properties props_in = new Properties();
			Properties props_out = new Properties();
			Properties props_out2 = new Properties();
		
            String path=getAppPath(this);
            System.out.println(path);
			props_in.load(new FileInputStream(path+"src-utils/constants_in.properties"));
			
			//props_out.load(getClass().getResourceAsStream("constants_out.properties"));
			
		
			String message = props_in.getProperty("1");
			System.out.println(message);
			
			// Vamos percorrer todas as propriedades...
			//Set<Entry<Object, Object>> set=props_in.entrySet();
			
			int n=0;
			for (Object elem: props_in.keySet()) {
				String chave=(String)elem;
				String valor=(String)props_in.getProperty(chave);

				String enc_value=enc.encrypt(valor);

				props_out.setProperty(chave, enc_value);	

				n=n+1;
				//System.out.print(chave);
				System.out.print(".");
			}
			System.out.println("Numero de entradas processadas="+n);
			
//			while (set.iterator().hasNext()) {
//				Entry<Object, Object> entry=set.iterator().next();
//				
//				String chave=(String)entry.getKey();
//				String valor=(String)entry.getValue();
//				
//				String enc_value=enc.encrypt(valor);
//
//				props_out.setProperty(chave, enc_value);	
//
//				System.out.print(chave);
//				System.out.print(".");
//			}
			
//			String res1=enc.encrypt("Ola, isto e' um teste");
//			props_out.setProperty("teste", res1);			
//
//			String res2=enc.encrypt("Ola, isto e' um teste muito muito grande que Ž necess‡rio cifrar de forma a que fique em segredo");
//			props_out.setProperty("teste2", res2);			
//
//			// Vamos gravar o ficheiro de output das propriedades...
//			// NOTE-SE QUE EM TESTES DENTRO DO ECLIPSE VAI PARAR AO DIRETORIO 'bin' POIS E' LA QUE ESTA A CLASSE COMPILADA
//

			//URL url = getClass().getResource("constants_out.properties");
			//URL url = getClass().getResource("/pt/ktc/openk/pos/locales/constants_out.properties");
			URL url=new URL("file:/workspaces/openk_pos_v1_1/openk_pos_v1_2_discount/locales/pt/ktc/openk/pos/locales/constants.properties");
			
			System.out.println(url.toString());
			//FileOutputStream f=new FileOutputStream(new File(url.toURI()));
			FileOutputStream f=new FileOutputStream(path+"locales/pt/ktc/openk/pos/locales/constants.properties");

			System.out.println(path);

			props_out.store(f, null);
			
			f.close();
			
			// Agora vamos abrir o ficheiro de propriedades e testar a sua leitura
			//props_out2.load(getClass().getResourceAsStream("constants_out.properties"));
			props_out2.load(getClass().getResourceAsStream("/pt/ktc/openk/pos/locales/constants.properties"));

//			props_out2.load(new FileInputStream(path+"openk_pos_services_"+versao+".properties"));
			// A sefuinte linha nao funciona: props_out2.load(getClass().getResourceAsStream("file:/workspaces/openk_pos_v1_1/openk_pos_v1_2_discount/locales/pt/ktc/openk/pos/locales/constants_out.properties"));

//			Set<Entry<Object, Object>> set2=props_out2.entrySet();
//			
//			while (set2.iterator().hasNext()) {
//				Entry<Object, Object> entry=set2.iterator().next();
//				
//				String chave=(String)entry.getKey();
//				String enc_value=(String)entry.getValue();
//				
//				String value=enc.decrypt(enc_value);
//				
//				System.out.println(chave+"="+value);
//			}

			int n2=0;
			for (Object elem: props_out2.keySet()) {
				String chave=(String)elem;
				String enc_valor=(String)props_out2.getProperty(chave);

				String value=enc.decrypt(enc_valor);

				n2=n2+1;
				System.out.println(chave+"="+value);
			}
			System.out.println("Numero de entradas processadas="+n);
			System.out.println("Numero de propriedades lidas="+n2);
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return "";
	}
}
