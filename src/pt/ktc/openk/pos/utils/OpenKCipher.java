package pt.ktc.openk.pos.utils;

import java.io.UnsupportedEncodingException;
import java.security.*;

import javax.crypto.*;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import com.openbravo.pos.util.StringUtils;

public class OpenKCipher {

private javax.crypto.Cipher cipherDecrypt;
private javax.crypto.Cipher cipherEncrypt;

/** Creates a new instance of Encrypter */
public OpenKCipher(String passPhrase) {
 	
	//BC is the ID for the Bouncy Castle provider;
    if (Security.getProvider("BC") == null){
        // Instalar o BouncyCastle. Assim nao necessita de estar instalado no folder do java
        // NO entanto, como as assinaturas sao feitas pelo postgres e' necessario na mesma!
    	BouncyCastleProvider provider = new BouncyCastleProvider();
    	Security.addProvider(provider);
    }
	//---------------------------------------
  
  try {
      //SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
	  SecureRandom sr = SecureRandom.getInstance(HardCodedConstants.getHardCodedString(HardCodedConstants.SHA1PRNG));
      //sr.setSeed(passPhrase.getBytes("UTF8"));
	  sr.setSeed(passPhrase.getBytes(HardCodedConstants.getHardCodedString(HardCodedConstants.UTF8)));
      //KeyGenerator kGen = KeyGenerator.getInstance("DESEDE");
	  KeyGenerator kGen = KeyGenerator.getInstance(HardCodedConstants.getHardCodedString(HardCodedConstants.DESEDE));
      kGen.init(168, sr);
      Key key = kGen.generateKey();

      //cipherEncrypt = javax.crypto.Cipher.getInstance("DESEDE/ECB/PKCS5Padding");
      cipherEncrypt = javax.crypto.Cipher.getInstance(HardCodedConstants.getHardCodedString(HardCodedConstants.DESEDE_ECB_PKCS5Padding), "BC");
      cipherEncrypt.init(javax.crypto.Cipher.ENCRYPT_MODE, key);
      
      //cipherDecrypt = javax.crypto.Cipher.getInstance("DESEDE/ECB/PKCS5Padding");
      cipherDecrypt = javax.crypto.Cipher.getInstance(HardCodedConstants.getHardCodedString(HardCodedConstants.DESEDE_ECB_PKCS5Padding), "BC");
      cipherDecrypt.init(javax.crypto.Cipher.DECRYPT_MODE, key);
  } catch (UnsupportedEncodingException e) {
		e.printStackTrace();
  } catch (NoSuchPaddingException e) {
		e.printStackTrace();
  } catch (NoSuchAlgorithmException e) {
		e.printStackTrace();
  } catch (InvalidKeyException e) {
		e.printStackTrace();
  } catch (NoSuchProviderException e) {
		e.printStackTrace();
  }
}

public String encrypt(String str) {
  try {
      //return StringUtils.byte2hex(cipherEncrypt.doFinal(str.getBytes("UTF8")));
	  return StringUtils.byte2hex(cipherEncrypt.doFinal(str.getBytes(HardCodedConstants.getHardCodedString(HardCodedConstants.UTF8))));
  } catch (UnsupportedEncodingException e) {
		e.printStackTrace();
  } catch (BadPaddingException e) {
		e.printStackTrace();
  } catch (IllegalBlockSizeException e) {
		e.printStackTrace();
  }
  return null;
}

public String decrypt(String str) {
  try {
      //return new String(cipherDecrypt.doFinal(StringUtils.hex2byte(str)), "UTF8");
	  return new String(cipherDecrypt.doFinal(StringUtils.hex2byte(str)), HardCodedConstants.getHardCodedString(HardCodedConstants.UTF8));
  } catch (UnsupportedEncodingException e) {
		e.printStackTrace();
  } catch (BadPaddingException e) {
		e.printStackTrace();
  } catch (IllegalBlockSizeException e) {
		e.printStackTrace();
  }
  return null;
}    
}
