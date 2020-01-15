/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.tools.utils.security;


import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;

/**
 * @author Nuno Antunes
 *
 */
public class ExemploSAFT {

	/*
	 * Os valores usados neste exemplo s�o retirados do ficheiro SAFT dispon�vel no site 
	 * da DGCI junto com o validador. Para testar o validador com as suas chaves deve
	 * alterar o ficheiro SAFT e colocar nos campos hash os novos valores gerados
	 * por este exemplo. De seguida pode usar o validador com a sua chave p�blica.
	 * NOTA: A chave p�blica a usar no validador � a que est� em formato PEM.  
	 */
	
	public static void main(String[] args) {

		CertificationManager cm = CertificationManager.getInstance();

		try {
			cm.readFromFilePrivateKey("cert/exemplo/DER/exemplo-private-key-pkcs8.der");
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
		}
		
		try {
			cm.readFromFilePublicKey("cert/exemplo/DER/exemplo-public-key.der");
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
		}

		System.out.println("Hash das facturas");
		
		String[] facturas = { 
		"2008-03-10;2008-03-10T15:58:00;FT 1/1;28.07;",
		"2008-09-16;2008-09-16T15:58:00;FT 1/2;235.15;",
		"2008-09-16;2008-09-16T15:58:00;FT 1/3;679.61;",
		"2008-09-17;2008-09-17T15:58:00;FT 1/4;1200.00;",
		"2008-09-29;2008-09-29T15:58:00;FT 1/5;198.02;",
		"2008-10-21;2008-10-21T15:32:00;FT 1/6;3600.00;"
		};
		
		String[] hashFacturas = new String[facturas.length];
		try {

			for (int i=0; i<facturas.length; i++) {
				
				String msg;
				if (i==0)
					msg = facturas[i];
				else
					msg = facturas[i] + hashFacturas[i-1];
				
				hashFacturas[i] = cm.getHashBase64(msg);
				System.out.println(hashFacturas[i]);
			}
			
		} catch (InvalidHashException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		}

		System.out.println("Hash das notas de cr�dito");

		String[] notasCredito = {
		"2008-09-16;2008-09-16T15:58:00;NC 1/1;235.15;",
		"2008-09-16;2008-09-16T15:58:00;NC 1/2;2261.34;",
		"2008-09-16;2008-09-16T15:58:00;NC 1/3;47.03;",
		"2008-09-16;2008-09-16T15:58:00;NC 1/4;70.55;",
		};

		String[] hashNotasCredito = new String[notasCredito.length];
		try {

			for (int i=0; i<notasCredito.length; i++) {

				String msg;
				if (i==0)
					msg = notasCredito[i];
				else
					msg = notasCredito[i] + hashNotasCredito[i-1];

				hashNotasCredito[i] = cm.getHashBase64(msg);
				System.out.println(hashNotasCredito[i]);
			}
			
		} catch (InvalidHashException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		}


		
	}
	
}
