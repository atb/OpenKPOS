/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import javax.swing.JOptionPane;

import com.openbravo.pos.util.AltEncrypter;

import pt.ktc.openk.pos.utils.OpenKCipher;
import pt.ktc.openk.pos.utils.ServiceProperties;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;
import pt.ktc.openk.pos.utils.ValidateMACAddress;

public class ValidaInstalacao implements Runnable {
	public void run() {
		boolean exit=false;
		
		while (!exit) {
			try { 
				Thread.sleep(10000);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			
			// O Mac address e' sempre colocado (para ja) na classe DataLogicCustomer
			StringBuilder sb = new StringBuilder();
			sb.append(DataLogicCustomers.id_posto_1.charAt(5));
			sb.append(DataLogicCustomers.id_posto_1.charAt(11));
			sb.append(DataLogicCustomers.id_posto_2.charAt(3));
			sb.append(DataLogicCustomers.id_posto_2.charAt(15));
			sb.append(DataLogicCustomers.id_posto_3.charAt(13));
			sb.append(DataLogicCustomers.id_posto_3.charAt(2));
			sb.append(DataLogicCustomers.id_posto_4.charAt(10));
			sb.append(DataLogicCustomers.id_posto_4.charAt(5));
			sb.append(DataLogicCustomers.id_posto_5.charAt(14));
			sb.append(DataLogicCustomers.id_posto_5.charAt(0));
			sb.append(DataLogicCustomers.id_posto_6.charAt(6));
			sb.append(DataLogicCustomers.id_posto_6.charAt(4));
			
			if (ServiceProperties.getString(ServiceProperties.macaddres).isEmpty()==false) 
			{
				// O Mac address agora esta colocada no ficheiro openk_pos_services.properties
				sb.replace(0, 12, ServiceProperties.getString(ServiceProperties.macaddres));			
				
				boolean res=ValidateMACAddress.isValid(sb.toString());
				
				if (!res) {
					String a=StringConstants.getString(StringEnumerates._93C2D415253E8961C545D5D8FDF0EE0068102100F6025010A607CDACB6F01A5792A12DD12CBA8E6E84C4D8678E79EEC3D6604BB002BE2714DD3A55E5D1FAF171BB62F7A191CE4B75B95BDCC59209B63B1FEF931860A1122E);
					String b=StringConstants.getString(StringEnumerates.cypherkeyopenk);
					OpenKCipher  enc = new OpenKCipher(b); 
					String c=enc.decrypt(a);
					
					// A mensagem cifrada
					// 93C2D415253E8961C545D5D8FDF0EE0068102100F6025010A607CDACB6F01A5792A12DD12CBA8E6E84C4D8678E79EEC3D6604BB002BE2714DD3A55E5D1FAF171BB62F7A191CE4B75B95BDCC59209B63B1FEF931860A1122E
					JOptionPane.showMessageDialog(null, c);
	
					System.exit(0);
					//throw new RuntimeException();
				}
			}
		}
	}
}
