/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.tools;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class MACAddress {

	public static void main(String[] args){

		InetAddress ip;
		try {

			/**
			 *            
			NetworkInterface nface
           Enumeration ne = NetworkInterface.getNetworkInterfaces();
           while (ne.hasMoreElements()) {
               NetworkInterface netFace = (NetworkInterface)
ne.nextElement();
               log.debug("FOUND NetworkInterface:
${netFace.getDisplayName()}  ${netFace.getName()}")
               Enumeration ae = netFace.getInetAddresses();
               while (ae.hasMoreElements()) {
                   InetAddress address = (InetAddress) ae.nextElement();
                   log.debug("FOUND IP address:
${address.getHostAddress()}");
               }
           }
			 * 
			 */

			//NetworkInterface nface;
			Enumeration<NetworkInterface> ne = NetworkInterface.getNetworkInterfaces();
			while (ne.hasMoreElements()) {
				NetworkInterface network = ne.nextElement();
				
				if (network==null) System.out.println("null!!");

				//ip = InetAddress.getLocalHost();
				//System.out.println("Current IP address : " + ip.getHostAddress());

				//NetworkInterface network = NetworkInterface.getByInetAddress(ip);

				byte[] mac = network.getHardwareAddress();
				
				if (mac==null) { 
					// pode ser o loopback
					System.out.println("-->null");
				}
				else {
					System.out.print("-->");

					StringBuilder sb = new StringBuilder();
					for (int i = 0; i < mac.length; i++) {
						//sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
						sb.append(String.format("%02X", mac[i]));
					}
					System.out.println(sb.toString());					
				}
			}

		} catch (SocketException e) {

			e.printStackTrace();

		}
	}
}
