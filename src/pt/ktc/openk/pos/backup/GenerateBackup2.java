/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.backup;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;
import java.util.regex.Matcher;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import pt.ktc.openk.pos.aspects.JRootApp;
import pt.ktc.openk.pos.utils.ServiceProperties;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.JMessageDialog;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.loader.BatchSentence;
import com.openbravo.data.loader.BatchSentenceResource;
import com.openbravo.data.loader.DataParams;
import com.openbravo.data.loader.PreparedSentence;
import com.openbravo.data.loader.SentenceExec;
import com.openbravo.data.loader.SerializerWriteParams;
import com.openbravo.pos.customers.DataLogicCustomers;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppProperties;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.BeanFactory;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.util.AltEncrypter;
import com.openbravo.data.loader.Session;

public class GenerateBackup2 implements Runnable {

	private static Logger logger = Logger.getLogger(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_backup_GenerateBackup));
	
	private String mTarFile;
	private JTextArea jtxtOutput;
	private AppView m_oApp;
	private JLabel mProgress;
	
	// Contrutor para se usar quando a classe nao e' para ser executada por uma nova thread
	public GenerateBackup2() {
		mTarFile=null;
		jtxtOutput=null;
		m_oApp=null;
		mProgress=null;
	}	
	
	public GenerateBackup2(String tarFile, JTextArea output, AppView oApp, JLabel progress) {
		mTarFile=tarFile;
		jtxtOutput=output;
		m_oApp=oApp;
		mProgress=progress;
	}
	
	private void startAnimation() {
		URL imgUrl=this.getClass().getResource(StringConstants.getString(StringEnumerates._pt_ktc_openk_pos_images_work_in_progress_gif));
	    ImageIcon ii = new ImageIcon(imgUrl);
		mProgress.setIcon(ii);
		mProgress.setVisible(true);
	}

	private void stopAnimation() {
		URL imgUrl=this.getClass().getResource(StringConstants.getString(StringEnumerates._pt_ktc_openk_pos_images_work_in_progress_jpg));
	    ImageIcon ii = new ImageIcon(imgUrl);
		mProgress.setIcon(ii);
		mProgress.setVisible(true);
	}

	
	@Override
	public void run() {

		String dbName=m_oApp.getSession().DB.getName();
		
		//if (dbName.compareTo("PostgreSQL")==0) {
		if (dbName.compareTo(StringConstants.getString(StringEnumerates.PostgreSQL))==0) {
			execBackupPostgres();
		} else if (dbName.compareTo(StringConstants.getString(StringEnumerates.HSQLDB))==0) {
			execBackupHSQLDB();			
		} else {
			// Erro!!! So' suportamos estas duas bases de dados!!!!
        	//jtxtOutput.append("ERRO: A base de dados actual nao e suportada. Deve contactar a KTC.");
        	jtxtOutput.append(StringConstants.getString(StringEnumerates.ERRO__A_base_de_dados_actual_nao_e_suportada__Deve_contactar_a_KTC_));		
		}
	}
	
	public void execBackupPostgres() {
		// Gerar o ficheiro SAFT-PT

		startAnimation();
		
		DataLogicSystem dlSystem = (DataLogicSystem) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSystem));
		DataLogicSales m_dlSales = (DataLogicSales) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSales));
		DataLogicCustomers dlCustomers  = (DataLogicCustomers) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_customers_DataLogicCustomers));
		
		jtxtOutput.append(StringConstants.getString(StringEnumerates.A_gerar_copia_de_seguranca_para_o_ficheiro__)+mTarFile+StringConstants.getString(StringEnumerates._newline));

		String s="";
		try {
			
			s=dlSystem.findVersion();
			
        	jtxtOutput.append(StringConstants.getString(StringEnumerates.A_escrever_dados_para_o_ficheiro__n));
	        	
        	// Aqui e necessario executar o comando de dump....
    	    // run the Unix "ps -ef" command
            // using the Runtime exec method:
            //Process p = Runtime.getRuntime().exec("ps -ef");
        	
            //String sDBUser = m_oApp.getProperties().getProperty("db.user");
            String sDBUser = m_oApp.getProperties().getProperty(StringConstants.getString(StringEnumerates.db_user));
            //String sDBPassword = m_oApp.getProperties().getProperty("db.password");     
            String sDBPassword = m_oApp.getProperties().getProperty(StringConstants.getString(StringEnumerates.db_password));     
            
            // if (sDBUser != null && sDBPassword != null && sDBPassword.startsWith("crypt:")) {
            if (sDBUser != null && sDBPassword != null && sDBPassword.startsWith(StringConstants.getString(StringEnumerates.crypt_))) {            	
                // the password is encrypted
                // AltEncrypter cypher = new AltEncrypter("cypherkey" + sDBUser);
                AltEncrypter cypher = new AltEncrypter(StringConstants.getString(StringEnumerates.cypherkey) + sDBUser);
                
                sDBPassword = cypher.decrypt(sDBPassword.substring(6));
            }         	
        	
        	ArrayList<String> envp=new ArrayList<String>();
        	//envp.add(StringConstants.getString(StringEnumerates.PGPASSWORD_openk89765));
        	envp.add(StringConstants.getString(StringEnumerates.PGPASSWORD_)+sDBPassword);

        	Map<String,String> env=System.getenv();
        	for(Entry<String, String> prop: env.entrySet()) {
        		envp.add(prop.getKey()+"="+prop.getValue());
        	}
	        	
        	String[] envarray=envp.toArray(new String[1]);
        	//String[] envp=new String[]{ "PGPASSWORD=\"openk89765\"" };
	        	
        	// E' necessario ir buscar o nome da base de dados a configuracao
        	String dbname=m_oApp.getProperties().getProperty(StringConstants.getString(StringEnumerates.db_name));
        	// E' necessario saber o local aonde se encontram os utilitarios do postgres
        	String pg_bin_path=m_oApp.getProperties().getProperty(StringConstants.getString(StringEnumerates.pg_bin_path));
        	if ((pg_bin_path==null) || (pg_bin_path.isEmpty())) {
        		// assumir path default
        		pg_bin_path=StringConstants.getString(StringEnumerates._opt_PostgreSQL_9_0_bin_);
        	}
	        	
        	// pg_dump -h localhost -p 5432 -U postgres -w -b -Fc -o
        	String comando=pg_bin_path+StringConstants.getString(StringEnumerates.pg_dump__h_localhost__p_5432__U_)+sDBUser+StringConstants.getString(StringEnumerates.__w__b__Fc__o_)+dbname;
        	Process p = Runtime.getRuntime().exec(pg_bin_path+StringConstants.getString(StringEnumerates.pg_dump__h_localhost__p_5432__U_)+sDBUser+StringConstants.getString(StringEnumerates.__w__b__Fc__o_)+dbname, envarray);
        	//  > backup.compress
        	
            // $ export PGPASSWORD=Óopenk89765Ó
            // $ pg_dump museu_da_fogaca -b -F c -n backup -o -h localhost -p 5432 -U openk -w > backup.compress
            
        	BufferedInputStream stdInput = new BufferedInputStream(p.getInputStream());

            BufferedReader stdError = new BufferedReader(new 
                 InputStreamReader(p.getErrorStream()));
            
            // ficheiro onde se vai escrever
            
           	// Vai gerar ficheiro: <nome_da_bd>-<AAAAMMDD>T<hh><mm><ss>.tar.gz
            String folder=mTarFile;
            // if (!folder.endsWith("/")) folder+="/";
            if (!folder.endsWith(StringConstants.getString(StringEnumerates._slash))) folder+=StringConstants.getString(StringEnumerates._slash);
            
            // vamos construir o nome do ficheiro para concatenar com o folder...
			String dataLimite=ServiceProperties.getString(ServiceProperties.date);
			//SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
			SimpleDateFormat format = new SimpleDateFormat(StringConstants.getString(StringEnumerates.yyyyMMdd_T_HHmmss));
			
			String fileName=dbname+"-";

			String dateFileName=format.format(new Date());
			if (dateFileName==null) {
				// Se deu erro nao se pode validar por datas!!! Nunca devia acontecer pois foi uma data introduzida pela KTC
		       	//jtxtOutput.append("Erro na geracao do nome do ficheiro!");
		       	jtxtOutput.append(StringConstants.getString(StringEnumerates.Erro_na_geracao_do_nome_do_ficheiro_));
		       	
		       	return;
			}
			// fileName=folder+fileName+dateFileName+".tar";
			fileName=folder+fileName+dateFileName+StringConstants.getString(StringEnumerates._tar);
			
			//------------------------
            
            OutputStream stdOutput = new FileOutputStream(fileName);	            

            // read the output from the command
            //jtxtOutput.append("Here is the standard output of the command:\n");
            byte buffer[]=new byte[100];
            int len=0;
            while ((len = stdInput.read(buffer, 0, 100)) != -1) {
            	stdOutput.write(buffer, 0, len);
            //	jtxtOutput.append(s+"\n");
            }
	            
            // read any errors from the attempted command
            String str_erro="";
            while ((s = stdError.readLine()) != null) {
            	if (str_erro.isEmpty()) str_erro=StringConstants.getString(StringEnumerates.Problema_na_execucao_da_copia_de_seguranca__n);
            	str_erro+=s+StringConstants.getString(StringEnumerates._newline);
            	//jtxtOutput.append(s+"\n");
            }
	            
            if (!str_erro.isEmpty()) {
            	jtxtOutput.append(str_erro);
            } else {
	            
            	jtxtOutput.append(StringConstants.getString(StringEnumerates.Copia_de_seguranca)+mTarFile+StringConstants.getString(StringEnumerates._gerada_com_sucesso__n));
            }

			
		} catch (Exception e) {
			jtxtOutput.append(StringConstants.getString(StringEnumerates.ERRO_na_geracao_da_copia_de_seguranca__nDetalhe_do_erro_));
			jtxtOutput.append(e.getMessage());
			//e.printStackTrace();
		}
		
		stopAnimation();		
	}
	
	public void execBackupHSQLDB() {

		startAnimation();
		
		DataLogicSystem dlSystem = (DataLogicSystem) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSystem));
		DataLogicSales m_dlSales = (DataLogicSales) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSales));
		DataLogicCustomers dlCustomers  = (DataLogicCustomers) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_customers_DataLogicCustomers));
		
		jtxtOutput.append(StringConstants.getString(StringEnumerates.A_gerar_copia_de_seguranca_para_o_ficheiro__)+mTarFile+StringConstants.getString(StringEnumerates._newline));

		String s="";
		try {
			
			s=dlSystem.findVersion();
			
        	jtxtOutput.append(StringConstants.getString(StringEnumerates.A_escrever_dados_para_o_ficheiro__n));
        	
        	// No caso do HSQLDB e' necessario executar o seguinte comando:
        	// BACKUP DATABASE TO <directory name> BLOCKING
        	// Vai gerar ficheiro: <nome_da_bd>-<AAAAMMDD>T<hh><mm><ss>.tar.gz
     
            String str_erro="";
            String folder=mTarFile;
            if (!folder.endsWith("/")) folder+="/";
            String comando="BACKUP DATABASE TO '"+folder+"' BLOCKING";
        	try {
	            SentenceExec exec_backup = new PreparedSentence(m_oApp.getSession(), comando);
	            
	            exec_backup.exec();
	        	}
        	catch (BasicException e) {
        		str_erro=com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.Database_ScriptError))+" "+e.getMessage();
        	}
        	
            if (!str_erro.isEmpty()) {
            	jtxtOutput.append(str_erro);
            } else {
	            
            	jtxtOutput.append(StringConstants.getString(StringEnumerates.Copia_de_seguranca)+mTarFile+StringConstants.getString(StringEnumerates._gerada_com_sucesso__n));
            }
			
		} catch (Exception e) {
			jtxtOutput.append(StringConstants.getString(StringEnumerates.ERRO_na_geracao_da_copia_de_seguranca__nDetalhe_do_erro_));
			jtxtOutput.append(e.getMessage());
			//e.printStackTrace();
		}
		
		stopAnimation();		
	}
	
	// Para ser utilizada apenas pelo processo automatico de backup
	public String generateBackupNoUI(Map<String, BeanFactory> p_aBeanFactories, AppProperties p_props, Session p_session, String file) {
		
		String result=StringConstants.getString(StringEnumerates.Backup_OK);

		DataLogicSystem dlSystem=null;
		DataLogicSales m_dlSales=null;
		DataLogicCustomers dlCustomers=null;
		try {
			dlSystem = (DataLogicSystem) pt.ktc.openk.pos.forms.StartBackup.getBean(p_aBeanFactories, StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSystem));
			m_dlSales = (DataLogicSales) pt.ktc.openk.pos.forms.StartBackup.getBean(p_aBeanFactories, StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSales));
			dlCustomers  = (DataLogicCustomers) pt.ktc.openk.pos.forms.StartBackup.getBean(p_aBeanFactories, StringConstants.getString(StringEnumerates.com_openbravo_pos_customers_DataLogicCustomers));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			result=e1.getMessage();
			return result;
		}
		
		String s="";
		try {
			s=dlSystem.findVersion();
			
	        String sScriptName = StringConstants.getString(StringEnumerates._pt_ktc_openk_pos_scripts_PostgreSQL_execute_backup_sql);
	        
	        if (JRootApp.class.getResource(sScriptName) == null) {
	        	result=com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.Database_ScriptWarning));
	        }
	        else {

	        	try {
	        		BatchSentence bsentence = new pt.ktc.openk.pos.data.loader.BatchSentenceResource(p_session, sScriptName);
	        		bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_ID), Matcher.quoteReplacement(pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_ID));
	        		bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_NAME), Matcher.quoteReplacement(pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_NAME));
	        		bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_VERSION), Matcher.quoteReplacement(pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_VERSION));

	        		result="";
	        		java.util.List l = bsentence.list();
	        		if (l.size() > 0) {
	    				result+=com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.Database_ScriptWarning))+StringConstants.getString(StringEnumerates._newline);
	    				
	    				for (Object ob: l) {
		    				result+=ob.toString()+StringConstants.getString(StringEnumerates._newline);
	    				}
	    				
	    				return result;
	        		}
	        	} catch (BasicException e) {
    				result=com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.Database_ScriptError))+" "+e.getMessage();

    				return result;
	        	}
	        	
	        	// Aqui e necessario executar o comando de dump....
	    	    // run the Unix "ps -ef" command
	            // using the Runtime exec method:
	            //Process p = Runtime.getRuntime().exec("ps -ef");
	        	ArrayList<String> envp=new ArrayList<String>();
	        	envp.add(StringConstants.getString(StringEnumerates.PGPASSWORD_openk89765));

	        	Map<String,String> env=System.getenv();
	        	for(Entry<String, String> prop: env.entrySet()) {
	        		envp.add(prop.getKey()+"="+prop.getValue());
	        	}
	        	
	        	String[] envarray=envp.toArray(new String[1]);
	        	//String[] envp=new String[]{ "PGPASSWORD=\"openk89765\"" };
	        	
	        	// E' necessario ir buscar o nome da base de dados a configuracao
	        	String dbname=p_props.getProperty(StringConstants.getString(StringEnumerates.db_name));
	        	// E' necessario saber o local aonde se encontram os utilitarios do postgres
	        	String pg_bin_path=p_props.getProperty(StringConstants.getString(StringEnumerates.pg_bin_path));
	        	if ((pg_bin_path==null) || (pg_bin_path.isEmpty())) {
	        		// assumir path default
	        		pg_bin_path=StringConstants.getString(StringEnumerates._opt_PostgreSQL_9_0_bin_);
	        	}
	        	
	        	Process p = Runtime.getRuntime().exec(pg_bin_path+StringConstants.getString(StringEnumerates.pg_dump__h_localhost__p_5432__U_openk__w__b__Fc__n_backup__o_)+dbname, envarray);
	        	//  > backup.compress
	        	
	            // $ export PGPASSWORD=Óopenk89765Ó
	            // $ pg_dump museu_da_fogaca -b -F c -n backup -o -h localhost -p 5432 -U openk -w > backup.compress
	            
	        	BufferedInputStream stdInput = new BufferedInputStream(p.getInputStream());

	            BufferedReader stdError = new BufferedReader(new 
	                 InputStreamReader(p.getErrorStream()));
	            
	            // ficheiro onde se vai escrever
	            OutputStream stdOutput = new FileOutputStream(file);	            

	            // read the output from the command
	            //jtxtOutput.append("Here is the standard output of the command:\n");
	            byte buffer[]=new byte[100];
	            int len=0;
	            while ((len = stdInput.read(buffer, 0, 100)) != -1) {
	            	stdOutput.write(buffer, 0, len);
	            }
	            
	            // read any errors from the attempted command
	            String str_erro="";
	            while ((s = stdError.readLine()) != null) {
	            	if (str_erro.isEmpty()) str_erro=StringConstants.getString(StringEnumerates.Problema_na_execucao_da_copia_de_seguranca__n);
	            	str_erro+=s+StringConstants.getString(StringEnumerates._newline);
	            }
	            
	            if (!str_erro.isEmpty()) {
	            	result=str_erro;
	            } else {
	            	result=StringConstants.getString(StringEnumerates.Copia_de_seguranca)+file+StringConstants.getString(StringEnumerates._gerada_com_sucesso__n);
	            }
	        }
	        //-------------------
			
			
		} catch (Exception e) {
			result=StringConstants.getString(StringEnumerates.ERRO_na_geracao_da_copia_de_seguranca__nDetalhe_do_erro_);
			result+=e.getMessage();
		}
		
		return result;
	}

}

