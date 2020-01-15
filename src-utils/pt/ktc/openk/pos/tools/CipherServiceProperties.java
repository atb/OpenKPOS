package pt.ktc.openk.pos.tools;

import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class CipherServiceProperties {

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
        
		CipherServicePropertiesGenerate gen=new CipherServicePropertiesGenerate();
		
		// Vamos usar um argumento para indicar os ficheiros a processar...
		if (args.length!=1) {
			System.out.println("CipherServiceProperties: e' necessario indicar o ficheiro a 'versao' a processar...");
		}
		else {
			gen.generate(args[0]);
		}
	}

}
