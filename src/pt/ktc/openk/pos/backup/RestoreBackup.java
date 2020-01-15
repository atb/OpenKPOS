/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
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
import com.openbravo.data.loader.BatchSentence;
import com.openbravo.pos.customers.DataLogicCustomers;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.forms.DataLogicSystem;

public class RestoreBackup  implements Runnable {

	private static Logger logger = Logger.getLogger(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_backup_RestoreBackup));
	
	private String mTarFile;
	private JTextArea jtxtOutput;
	private AppView m_oApp;
	private JLabel mProgress;
	
	public RestoreBackup(String tarFile, JTextArea output, AppView oApp, JLabel progress) {
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
		// Restaurar um backup

		startAnimation();
		
		DataLogicSystem dlSystem = (DataLogicSystem) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSystem));
		DataLogicSales m_dlSales = (DataLogicSales) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSales));
		DataLogicCustomers dlCustomers  = (DataLogicCustomers) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_customers_DataLogicCustomers));
		
		jtxtOutput.append(StringConstants.getString(StringEnumerates.A_restaurar_a_copia_de_seguranca_contida_no_ficheiro__)+mTarFile+StringConstants.getString(StringEnumerates._newline));

		String s="";
		try {
			s=dlSystem.findVersion();
			
			jtxtOutput.append(StringConstants.getString(StringEnumerates.A_preparar_a_base_de_dados_para_o_restauro__n));
			
	        String sScriptName = StringConstants.getString(StringEnumerates._pt_ktc_openk_pos_scripts_PostgreSQL_prepare_restore_sql);
	        
	        if (JRootApp.class.getResource(sScriptName) == null) {
				jtxtOutput.append(com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.Database_ScriptWarning)));

				//JMessageDialog.showMessage(null, new MessageInf(MessageInf.SGN_WARNING, com.openbravo.pos.forms.AppLocal.getIntString("Database.ScriptWarning")));
	            //app.session.close();
	            //return false;
	        }
	        else {
	        	
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
	        	
	        	jtxtOutput.append(StringConstants.getString(StringEnumerates.A_carregar_os_dados_do_ficheiro__n));
	        	
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
	        	String dbname=m_oApp.getProperties().getProperty(StringConstants.getString(StringEnumerates.db_name));
	        	
	        	// E' necessario saber o local aonde se encontram os utilitarios do postgres
	        	String pg_bin_path=m_oApp.getProperties().getProperty(StringConstants.getString(StringEnumerates.pg_bin_path));
	        	if ((pg_bin_path==null) || (pg_bin_path.isEmpty())) {
	        		// assumir path default
	        		pg_bin_path=StringConstants.getString(StringEnumerates._opt_PostgreSQL_9_0_bin_);
	        	}

	        	String cmd_restore=pg_bin_path+StringConstants.getString(StringEnumerates.pg_restore__h_localhost__p_5432__U_openk__w__d_)+dbname+StringConstants.getString(StringEnumerates.__F_c__n_backup_)+mTarFile;
	        	Process p = Runtime.getRuntime().exec(pg_bin_path+StringConstants.getString(StringEnumerates.pg_restore__h_localhost__p_5432__U_openk__w__d_)+dbname+StringConstants.getString(StringEnumerates.__F_c__n_backup_)+mTarFile, envarray);
	        	//  > backup.compress
	        	
	            //BufferedReader stdInput = new BufferedReader(new 
	            //     InputStreamReader(p.getInputStream()));

	            BufferedReader stdError = new BufferedReader(new 
		                 InputStreamReader(p.getErrorStream()));
	            
	            // ficheiro onde se vai escrever
	            //BufferedWriter stdOutput = new BufferedWriter(new FileWriter(mTarFile));	            

	            // read the output from the command
	            //jtxtOutput.append("Here is the standard output of the command:\n");
	            //while ((s = stdInput.readLine()) != null) {
	            	// stdOutput.write(s);
	              // jtxtOutput.append(s+"\n");
	            //}
	            
	            // read any errors from the attempted command
	            String str_erro="";
	            while ((s = stdError.readLine()) != null) {
	            	if (str_erro.isEmpty()) str_erro=StringConstants.getString(StringEnumerates.Problema_na_execucao_do_restauro_da_copia_de_seguranca__n);
	            	str_erro+=s+StringConstants.getString(StringEnumerates._newline);
	            	//jtxtOutput.append(s+"\n");
	            }
	            
	            if (!str_erro.isEmpty()) {
	            	jtxtOutput.append(str_erro);
	            }
	            else {

			        sScriptName = StringConstants.getString(StringEnumerates._pt_ktc_openk_pos_scripts_PostgreSQL_execute_restore_sql);
			        
			        if (JRootApp.class.getResource(sScriptName) == null) {
						jtxtOutput.append(com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.Database_ScriptWarning)));
	
						//JMessageDialog.showMessage(null, new MessageInf(MessageInf.SGN_WARNING, com.openbravo.pos.forms.AppLocal.getIntString("Database.ScriptWarning")));
			            //app.session.close();
			            //return false;
			        }
			        else {	            
		            
			        	jtxtOutput.append(StringConstants.getString(StringEnumerates.A_repor_os_dados_do_ficheiro_na_base_de_dados__n));
		
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
		
			        		}
			        	} catch (BasicException e) {
		    				jtxtOutput.append(com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.Database_ScriptError))+" "+e.getMessage());
		    				
		    				stopAnimation();
		    				return;
		
			        	}
			        	
			        	jtxtOutput.append(StringConstants.getString(StringEnumerates.Dados_carregados_na_base_de_dados__n));
			        	
			            
			            jtxtOutput.append(StringConstants.getString(StringEnumerates.Copia_de_seguranca_)+mTarFile+StringConstants.getString(StringEnumerates._foi_reposta_com_sucesso__n));
			            jtxtOutput.append(StringConstants.getString(StringEnumerates.DEVE_SAIR_DA_APLICACAO_E_VOLTAR_A_ENTRAR_PARA_AS_ALTERACOES_FAZEREM_EFEITO__n));
	
			        }
	            }
	        }
	        //-------------------
			
			
		} catch (Exception e) {
			jtxtOutput.append(StringConstants.getString(StringEnumerates.ERRO_na_reposicao_da_copia_de_seguranca__nDetalhe_do_erro_));
			jtxtOutput.append(e.getMessage());
			//e.printStackTrace();
		}
		
		stopAnimation();		
	}

}