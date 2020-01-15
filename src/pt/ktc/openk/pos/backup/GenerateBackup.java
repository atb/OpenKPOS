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
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.JMessageDialog;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.loader.BatchSentence;
import com.openbravo.data.loader.BatchSentenceResource;
import com.openbravo.pos.customers.DataLogicCustomers;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppProperties;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.BeanFactory;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.data.loader.Session;

public class GenerateBackup implements Runnable {

	private static Logger logger = Logger.getLogger(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_backup_GenerateBackup));
	
	private String mTarFile;
	private JTextArea jtxtOutput;
	private AppView m_oApp;
	private JLabel mProgress;
	
	// Contrutor para se usar quando a classe nao e' para ser executada por uma nova thread
	public GenerateBackup() {
		mTarFile=null;
		jtxtOutput=null;
		m_oApp=null;
		mProgress=null;
	}	
	
	public GenerateBackup(String tarFile, JTextArea output, AppView oApp, JLabel progress) {
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
		// Gerar o ficheiro SAFT-PT

		startAnimation();
		
		DataLogicSystem dlSystem = (DataLogicSystem) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSystem));
		DataLogicSales m_dlSales = (DataLogicSales) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSales));
		DataLogicCustomers dlCustomers  = (DataLogicCustomers) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_customers_DataLogicCustomers));
		
		jtxtOutput.append(StringConstants.getString(StringEnumerates.A_gerar_copia_de_seguranca_para_o_ficheiro__)+mTarFile+StringConstants.getString(StringEnumerates._newline));

		String s="";
		try {
			s=dlSystem.findVersion();
			
			jtxtOutput.append(StringConstants.getString(StringEnumerates.A_ler_os_dados_da_base_de_dados__n));
			
	        String sScriptName = StringConstants.getString(StringEnumerates._pt_ktc_openk_pos_scripts_PostgreSQL_execute_backup_sql);
	        
	        if (JRootApp.class.getResource(sScriptName) == null) {
				jtxtOutput.append(com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.Database_ScriptWarning)));

				//JMessageDialog.showMessage(null, new MessageInf(MessageInf.SGN_WARNING, com.openbravo.pos.forms.AppLocal.getIntString("Database.ScriptWarning")));
	            //app.session.close();
	            //return false;
	        }
	        else {

	        	jtxtOutput.append(StringConstants.getString(StringEnumerates.A_gerar_dados_para_copia_de_seguranca__n));

	        	try {
	        		BatchSentence bsentence = new pt.ktc.openk.pos.data.loader.BatchSentenceResource(m_oApp.getSession(), sScriptName);
	        		bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_ID), Matcher.quoteReplacement(pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_ID));
	        		bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_NAME), Matcher.quoteReplacement(pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_NAME));
	        		bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_VERSION), Matcher.quoteReplacement(pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_VERSION));

	        		java.util.List l = bsentence.list();
	        		if (l.size() > 0) {
	    				jtxtOutput.append(com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.Database_ScriptWarning))+StringConstants.getString(StringEnumerates._newline));
	    				
	    				for (Object ob: l) {
		    				jtxtOutput.append(ob.toString()+StringConstants.getString(StringEnumerates._newline));
	    				}
	    				
	    				stopAnimation();
	    				return;

	        			//JMessageDialog.showMessage(null, new MessageInf(MessageInf.SGN_WARNING, com.openbravo.pos.forms.AppLocal.getIntString("Database.ScriptWarning"), l.toArray(new Throwable[l.size()])));
	        		}
	        	} catch (BasicException e) {
    				jtxtOutput.append(com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.Database_ScriptError))+" "+e.getMessage());

	        		//JMessageDialog.showMessage(null, new MessageInf(MessageInf.SGN_DANGER, com.openbravo.pos.forms.AppLocal.getIntString("Database.ScriptError"), e));
	        		//app.session.close();
	        		//return false;
    				stopAnimation();	
    				return;
	        	}
	        	
	        	jtxtOutput.append(StringConstants.getString(StringEnumerates.A_escrever_dados_para_o_ficheiro__n));
	        	
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
	        	String dbname=m_oApp.getProperties().getProperty(StringConstants.getString(StringEnumerates.db_name));
	        	// E' necessario saber o local aonde se encontram os utilitarios do postgres
	        	String pg_bin_path=m_oApp.getProperties().getProperty(StringConstants.getString(StringEnumerates.pg_bin_path));
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
	            OutputStream stdOutput = new FileOutputStream(mTarFile);	            

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

	        }
	        //-------------------
			
			
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
	
	// Para ser utilizada apenas pelo processo automatico de backup - PARA A VERSAO COM SUPORTE POSTGRES E HSQLDB!
	public String generateBackupNoUI2(Map<String, BeanFactory> p_aBeanFactories, AppProperties p_props, Session p_session, String file) {
		
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
			
	        	
	        	// Aqui e necessario executar o comando de dump....
	    	    // run the Unix "ps -ef" command
	            // using the Runtime exec method:
	            //Process p = Runtime.getRuntime().exec("ps -ef");
	        	ArrayList<String> envp=new ArrayList<String>();
	        	envp.add(StringConstants.getString(StringEnumerates.PGPASSWORD_postgres67543));

	        	Map<String,String> env=System.getenv();
	        	for(Entry<String, String> prop: env.entrySet()) {
	        		envp.add(prop.getKey()+"="+prop.getValue());
	        	}
	        	
	        	String[] envarray=envp.toArray(new String[1]);
	        	
	        	// E' necessario ir buscar o nome da base de dados a configuracao
	        	String dbname=p_props.getProperty(StringConstants.getString(StringEnumerates.db_name));
	        	// E' necessario saber o local aonde se encontram os utilitarios do postgres
	        	String pg_bin_path=p_props.getProperty(StringConstants.getString(StringEnumerates.pg_bin_path));
	        	if ((pg_bin_path==null) || (pg_bin_path.isEmpty())) {
	        		// assumir path default
	        		pg_bin_path=StringConstants.getString(StringEnumerates._opt_PostgreSQL_9_0_bin_);
	        	}
	        	
	        	// pg_dump -h localhost -p 5432 -U postgres -w -b -Fc -o 
	        	Process p = Runtime.getRuntime().exec(pg_bin_path+StringConstants.getString(StringEnumerates.pg_dump__h_localhost__p_5432__U_postgres__w__b__Fc__o_)+dbname, envarray);
	        	//  > backup.compress
	        	
	            // $ export PGPASSWORD=Ópostgres67543Ó
	            // $ pg_dump -b -Fc  -o -h localhost -p 5432 -U postgres -w nome_da_bd > backup.compress
	            
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
			
			
		} catch (Exception e) {
			result=StringConstants.getString(StringEnumerates.ERRO_na_geracao_da_copia_de_seguranca__nDetalhe_do_erro_);
			result+=e.getMessage();
		}
		
		return result;
	}


}
