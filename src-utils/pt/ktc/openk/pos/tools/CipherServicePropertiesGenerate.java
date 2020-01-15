package pt.ktc.openk.pos.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import pt.ktc.openk.pos.tools.utils.security.OpenKEncrypter;

public class CipherServicePropertiesGenerate {
	
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
	
	public String generate(String versao) {
		
		try {
			
			//----------------------------------------------------------------
			// Carregar o ficheiro de propriedades normal da aplicacao
			// Vamos ler o que esta na raiz do projecto
            Properties config=new Properties();
            String path=getAppPath(this)+"src-utils/";
            System.out.println(path);
			// config.load(new FileInputStream("/workspaces/openk_pos_v1_1/openk_pos_v1_2_discount/properties_files/openk_pos.properties"));
			config.load(new FileInputStream(path+"openk_pos_"+versao+".properties"));
			

			String customer_taxid = config.getProperty("customer.taxid");
			System.out.println("Customer Taxid="+customer_taxid);

			String customer_name = config.getProperty("customer.name");
			System.out.println("Customer Name="+customer_name);
			
			// 		String nova_chave="A5GW8"+chave+"NFS48HE";
			String password="A5GW8"+customer_taxid+customer_name+"NFS48HE";
			System.out.println("Chave de cifragem baseada em=<"+customer_taxid+customer_name+">");

			//OpenKEncrypter enc=new OpenKEncrypter("83hdgsinfjr3");
			OpenKEncrypter enc=new OpenKEncrypter(password);

			
			// Vamos experimentar abrir o ficheiro de propriedades...
			Properties props_in = new Properties();
			Properties props_out = new Properties();
			Properties props_out2 = new Properties();
		
			//props_in.load(getClass().getResourceAsStream("openk_pos_services_in.properties"));
			//props_in.load(getClass().getResourceAsStream(path+"openk_pos_services_"+versao+"_in.properties"));
			props_in.load(new FileInputStream(path+"openk_pos_services_"+versao+"_in.properties"));
			
			String message = props_in.getProperty("1");
			System.out.println(message);
			
			// Vamos percorrer todas as propriedades...
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
			
			// Vamos gravar o ficheiro de output das propriedades...
			// NOTE-SE QUE EM TESTES DENTRO DO ECLIPSE VAI PARAR AO DIRETORIO 'bin' POIS E' LA QUE ESTA A CLASSE COMPILADA

			//URL url = getClass().getResource("constants_out.properties");
			//URL url = getClass().getResource("/pt/ktc/openk/pos/locales/constants_out.properties");
			// URL url=new URL("file:/workspaces/openk_pos_v1_1/openk_pos_v1_2_discount/properties_files/openk_pos_services.properties");
			//URL url=new URL(path+"openk_pos_services_"+versao+".properties");
			
			//System.out.println(url.toString());
			// FileOutputStream f=new FileOutputStream(new File(url.toURI()));
			FileOutputStream f=new FileOutputStream(new File(path+"openk_pos_services_"+versao+".properties"));
			props_out.store(f, null);
			
			f.close();
			
			// Agora vamos abrir o ficheiro de propriedades e testar a sua leitura
			//props_out2.load(getClass().getResourceAsStream("constants_out.properties"));
			//props_out2.load(getClass().getResourceAsStream("../../../../openk_pos_services.properties"));
			// A seguinte linha nao funciona: props_out2.load(getClass().getResourceAsStream("file:/workspaces/openk_pos_v1_1/openk_pos_v1_2_discount/locales/pt/ktc/openk/pos/locales/constants_out.properties"));
			// props_out2.load(new FileInputStream("/workspaces/openk_pos_v1_1/openk_pos_v1_2_discount/properties_files/openk_pos_services.properties"));
			props_out2.load(new FileInputStream(path+"openk_pos_services_"+versao+".properties"));
			
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
