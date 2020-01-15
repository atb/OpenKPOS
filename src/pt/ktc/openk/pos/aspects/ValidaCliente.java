/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * */
package pt.ktc.openk.pos.aspects;

import javax.swing.JOptionPane;

import pt.ktc.openk.pos.company.CompanyGlobal;
import pt.ktc.openk.pos.utils.OpenKCipher;
import pt.ktc.openk.pos.utils.ServiceProperties;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

public class ValidaCliente implements Runnable {

	private com.openbravo.pos.forms.AppProperties m_AppProperties=null;
	
	public ValidaCliente(com.openbravo.pos.forms.AppProperties p) {
		m_AppProperties=p;
	}
	
	public void run() {
		boolean exit=false;
		boolean systemExit=false;
		char systemExitCode='a';
		String _prop_customer_taxid="";
		
		while (!exit) {
			try { 
				//Thread.sleep(400000);
				Thread.sleep(10000);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			
			// Vamos verificar os dados do cliente
			String clienteTaxid=ServiceProperties.getString(ServiceProperties.customer_nif);
			String clienteName=ServiceProperties.getString(ServiceProperties.customer_name);

			if ((clienteTaxid==null) || (clienteName==null)) {
				systemExit=true;
				systemExitCode='a';
			}

			if (!systemExit) {
				String prop_customer_taxid=m_AppProperties.getProperty(StringConstants.getString(StringEnumerates.customer_taxid));
				String prop_customer_name=m_AppProperties.getProperty(StringConstants.getString(StringEnumerates.customer_name));
				_prop_customer_taxid=prop_customer_taxid;
				
				if ((prop_customer_taxid==null) || (clienteTaxid.compareTo(prop_customer_taxid)!=0)) {
					systemExit=true;
					systemExitCode='b';
				}
				else {
					if ((prop_customer_name==null) || (clienteName.compareTo(prop_customer_name)!=0)) { 
						systemExit=true;
						systemExitCode='c';
					}
				}
			}
			
			if (!systemExit) {
				// Vamos verificar se os dados do ficheiro de licenca sao iguais aos que estao na base de dados
		        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		        String _taxId=cg.getTaxID();
				if ((_taxId==null) || (clienteTaxid.compareTo(_taxId)!=0)) {
					systemExit=true;
					systemExitCode='d';
				}
				else {
					String _name=cg.getName();
					if ((_name==null) || (clienteName.compareTo(_name)!=0)) {
						systemExit=true;
						systemExitCode='e';
					}
				}
			}

			// A seguinte validacao e desnecessaria pois o programa obriga a usar o que esta definido no ficheiro de servicos de forma cifrada
//			if (!systemExit) {
//				// Vamos verificar se os dados do ficheiro de licenca relativos ao modo de ticket da aplicacao sao iguais aos que estao configurados no ficheiro de propriedade
//				String prop_machine_ticketsbag=m_AppProperties.getProperty(StringConstants.getString(StringEnumerates.machine_ticketsbag));
//
//				String serv_machine_ticketsbag=ServiceProperties.getString(ServiceProperties.machine_ticketsbag);
//
//				CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
//				if (clienteTaxid.compareTo(cg.getTaxID())!=0) {
//					systemExit=true;
//					systemExitCode='d';
//				}
//				if (clienteName.compareTo(cg.getName())!=0) {
//					systemExit=true;
//					systemExitCode='e';
//				}
//			}
			
			if (systemExit) {
				String a=StringConstants.getString(StringEnumerates._93C2D415253E8961C545D5D8FDF0EE0068102100F6025010A607CDACB6F01A5792A12DD12CBA8E6E84C4D8678E79EEC3D6604BB002BE2714DD3A55E5D1FAF171BB62F7A191CE4B75B95BDCC59209B63B1FEF931860A1122E);
				String b=StringConstants.getString(StringEnumerates.cypherkeyopenk);
				OpenKCipher enc = new OpenKCipher(b); 
				String c=enc.decrypt(a);
				
				// A mensagem cifrada
				// 93C2D415253E8961C545D5D8FDF0EE0068102100F6025010A607CDACB6F01A5792A12DD12CBA8E6E84C4D8678E79EEC3D6604BB002BE2714DD3A55E5D1FAF171BB62F7A191CE4B75B95BDCC59209B63B1FEF931860A1122E
				// JOptionPane.showMessageDialog(null, c+" (C)"+systemExitCode+"<"+clienteTaxid+"><"+_prop_customer_taxid+">");
				JOptionPane.showMessageDialog(null, c+StringConstants.getString(StringEnumerates.__C_)+systemExitCode+StringConstants.getString(StringEnumerates._lesser_than)+clienteTaxid+StringConstants.getString(StringEnumerates._bigger_than_lesser_than)+_prop_customer_taxid+StringConstants.getString(StringEnumerates._bigger_than));

				System.exit(0);
			}
		}
	}
}
