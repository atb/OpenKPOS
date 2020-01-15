/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.utils;

import com.openbravo.pos.util.AltEncrypter;

/*
 * O objectivo desta classe e' testar a possibilidade de termos um ficheiro cifrado com dados
 * que devem ser mantidos em segredo pela aplicacao. Ex:
 *  - chaves publicas e privadas para assinar documentos
 *  - tipo de validacao da instalacao: sem validacao; valida macaddress; com ou sem data limite
 *  - macaddres do computador
 *  - dados do cliente:
 *       - nome, nif, morada
 *       
 *  Para cifrar este ficheiro deve-se usar uma chave privada que apenas a KTC conhece.
 *  O programa recolhe os dados no computador destino e envia o ficheiro para a KTC.
 *  O ficheiro e' cifrado na KTC e enviado para o computador do cliente.
 *  O computador no cliente tem de ter a chave publica correspondente.
 *  
 *         
 *         
 *         
 *         
 * Como instalar o BouncyCastle no arranque da aplicacao 
private BouncyCastleProvider installBouncyCastle() {
  BouncyCastleProvider provider = new BouncyCastleProvider();
  Security.addProvider(provider);
  return provider;
}

 */
public class TestChiperValidateInstance {

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
				// No constructor deve ser sempre "cypherkey" + <nome do utilizador>
				AltEncrypter enc = new AltEncrypter("cypherkey" + args[0]); 

				// Aqui deve-se passar a password
				String pass1=enc.encrypt(args[1]);

				// A password devolvida deve ser colocada na propriedade db.pass="crypt:"+<password cifrada>
				System.out.println("Utilizador="+args[0]);
				System.out.println("Password cifrada="+pass1); 
				
				String pass2=enc.decrypt("93C2D415253E8961C545D5D8FDF0EE0068102100F6025010A607CDACB6F01A5792A12DD12CBA8E6E84C4D8678E79EEC3D6604BB002BE2714DD3A55E5D1FAF171BB62F7A191CE4B75B95BDCC59209B63B1FEF931860A1122E");
		        //String pass2=enc.decrypt("7BD69DBB4D7A42001172CEC06CDE0C9C");
				//String pass2=enc.decrypt("7BD69DBB4D7A420005703BF9F2C2B94B");
		        System.out.println("Original="+pass2);
			}
		}
		
	}

}
