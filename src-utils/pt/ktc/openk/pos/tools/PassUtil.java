/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 *
 *
 * */
package pt.ktc.openk.pos.tools;

import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import com.openbravo.pos.util.AltEncrypter;

public class PassUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length==0) {
			System.out.println("Deve invocar: PassUtil <user> <pass>");
		}
		else {
			if (args.length!=2) {
				System.out.println("Numero invalido de parametros");
			}
			else {
                // Instalar o BouncyCastle. Assim nao necessita de estar instalado no folder do java
                // NO entanto, como as assinaturas sao feitas pelo postgres e' necessario na mesma!
				BouncyCastleProvider provider = new BouncyCastleProvider();
				Security.addProvider(provider);

				//BC is the ID for the Bouncy Castle provider;
		        if (Security.getProvider("BC") == null){
		            System.out.println("Bouncy Castle provider is NOT available");
		        }
		        else{
		            System.out.println("Bouncy Castle provider is available");
		        }
				//---------------------------------------

				// No constructor deve ser sempre "cypherkey" + <nome do utilizador>
				AltEncrypter enc = new AltEncrypter("cypherkey" + args[0]);

				// Aqui deve-se passar a password
				String pass1=enc.encrypt(args[1]);

				// A password devolvida deve ser colocada na propriedade db.pass="crypt:"+<password cifrada>
				System.out.println("Utilizador="+args[0]);
				System.out.println("Password cifrada="+pass1);

				String pass2=enc.decrypt("???");
		     //String pass2=enc.decrypt("7BD69DBB4D7A42001172CEC06CDE0C9C");
				//String pass2=enc.decrypt("7BD69DBB4D7A420005703BF9F2C2B94B");
		        System.out.println("Original="+pass2);
			}
		}
	}
}
