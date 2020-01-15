/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.utils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class ValidateMACAddress {
	
	public static boolean isValid(String input){
		
		boolean encontrou=false;
		// Isto so funciona com a rede ligada. Para ja vou desactivar
		//boolean encontrou=true;

		InetAddress ip;
		try {

			//NetworkInterface nface;
			Enumeration<NetworkInterface> ne = NetworkInterface.getNetworkInterfaces();
			while (ne.hasMoreElements()) {
				NetworkInterface network = ne.nextElement();
				
				if (network!=null) {
					byte[] mac = network.getHardwareAddress();
					if (mac!=null) { 
						StringBuilder sb = new StringBuilder();
						for (int i = 0; i < mac.length; i++) {
							sb.append(String.format("%02X", mac[i]));
						}
						if (input.contentEquals(sb)) encontrou=true;
					}
				}
			}

		} catch (SocketException e) {
			e.printStackTrace();
		}
		
		return encontrou;
	}

}
