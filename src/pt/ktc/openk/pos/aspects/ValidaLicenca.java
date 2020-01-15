/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * */
package pt.ktc.openk.pos.aspects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import pt.ktc.openk.pos.utils.OpenKCipher;
import pt.ktc.openk.pos.utils.ServiceProperties;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;
import pt.ktc.openk.pos.utils.ValidateMACAddress;

public class ValidaLicenca implements Runnable {

	public ValidaLicenca() {
		// ServiceProperties
		// Esta classe e' estatica e e' iniciada logo no arranque da aplicacao!!
	}
	
	public void run() {
		boolean exit=false;
		
		while (!exit) {
			try { 
				//Thread.sleep(300000);
				Thread.sleep(10000);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			
			// Vamos verificar o MACADDRESS
			String macAddress=ServiceProperties.getString(ServiceProperties.macaddres);
			if ((macAddress!=null) && (!macAddress.isEmpty())) {
				// E' para validar o macaddress

				boolean res=ValidateMACAddress.isValid(macAddress);
				
				if (!res) {
					String a=StringConstants.getString(StringEnumerates._93C2D415253E8961C545D5D8FDF0EE0068102100F6025010A607CDACB6F01A5792A12DD12CBA8E6E84C4D8678E79EEC3D6604BB002BE2714DD3A55E5D1FAF171BB62F7A191CE4B75B95BDCC59209B63B1FEF931860A1122E);
					String b=StringConstants.getString(StringEnumerates.cypherkeyopenk);
					OpenKCipher enc = new OpenKCipher(b); 
					String c=enc.decrypt(a);
					
					// A mensagem cifrada
					// 93C2D415253E8961C545D5D8FDF0EE0068102100F6025010A607CDACB6F01A5792A12DD12CBA8E6E84C4D8678E79EEC3D6604BB002BE2714DD3A55E5D1FAF171BB62F7A191CE4B75B95BDCC59209B63B1FEF931860A1122E
					// JOptionPane.showMessageDialog(null, c+" (A)");
					JOptionPane.showMessageDialog(null, c+StringConstants.getString(StringEnumerates.__A_));

					System.exit(0);
					//throw new RuntimeException();
				}
			}
			
			// Vamos verificar se e para validar por data limite
			String dataLimite=ServiceProperties.getString(ServiceProperties.date);
			SimpleDateFormat format = new SimpleDateFormat(StringConstants.getString(StringEnumerates.simple_date_yyyy_MM_dd_HH_mm_ss));
			Date deadline=null;
			try {
				deadline=format.parse(dataLimite);
			} catch (ParseException e) {
				// Se deu erro nao se pode validar por datas!!! Nunca devia acontecer pois foi uma data introduzida pela KTC
			}
			
			if (deadline!=null) {
				Date actual=new Date();
				if (deadline.compareTo(actual)<=0) {
					String a=StringConstants.getString(StringEnumerates._93C2D415253E8961C545D5D8FDF0EE0068102100F6025010A607CDACB6F01A5792A12DD12CBA8E6E84C4D8678E79EEC3D6604BB002BE2714DD3A55E5D1FAF171BB62F7A191CE4B75B95BDCC59209B63B1FEF931860A1122E);
					String b=StringConstants.getString(StringEnumerates.cypherkeyopenk);
					OpenKCipher enc = new OpenKCipher(b); 
					String c=enc.decrypt(a);
					
					// A mensagem cifrada
					// 93C2D415253E8961C545D5D8FDF0EE0068102100F6025010A607CDACB6F01A5792A12DD12CBA8E6E84C4D8678E79EEC3D6604BB002BE2714DD3A55E5D1FAF171BB62F7A191CE4B75B95BDCC59209B63B1FEF931860A1122E
					JOptionPane.showMessageDialog(null, c+StringConstants.getString(StringEnumerates.__B_));

					System.exit(0);
					//throw new RuntimeException();
				}
			}
		}
	}
}
