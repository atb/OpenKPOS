/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.tools;

import java.security.Security;
import java.util.Properties;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class CipherConstantProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
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
        
		CipherConstantPropertiesGenerate gen=new CipherConstantPropertiesGenerate();
		
		gen.generate();
		
	}

}
