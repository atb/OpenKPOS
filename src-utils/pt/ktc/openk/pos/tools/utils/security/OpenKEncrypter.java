/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * Baseado em:  
 * */
//Openbravo POS is a point of sales application designed for touch screens.
//Copyright (C) 2007-2009 Openbravo, S.L.
//http://www.openbravo.com/product/pos
//
//This file is part of Openbravo POS.
//
//Openbravo POS is free software: you can redistribute it and/or modify
//it under the terms of the GNU General Public License as published by
//the Free Software Foundation, either version 3 of the License, or
//(at your option) any later version.
//
//Openbravo POS is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.
//
//You should have received a copy of the GNU General Public License
//along with Openbravo POS.  If not, see <http://www.gnu.org/licenses/>.

package pt.ktc.openk.pos.tools.utils.security;

import java.io.UnsupportedEncodingException;
import java.security.*;

import javax.crypto.*;

import pt.ktc.openk.pos.tools.StringUtils;

public class OpenKEncrypter {

private javax.crypto.Cipher cipherDecrypt;
private javax.crypto.Cipher cipherEncrypt;

/** Creates a new instance of Encrypter */
public OpenKEncrypter(String passPhrase) {
  
  try {
      SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
      sr.setSeed(passPhrase.getBytes("UTF8"));
      KeyGenerator kGen = KeyGenerator.getInstance("DESEDE");
      kGen.init(168, sr);
      Key key = kGen.generateKey();

      cipherEncrypt = javax.crypto.Cipher.getInstance("DESEDE/ECB/PKCS5Padding", "BC");
      cipherEncrypt.init(javax.crypto.Cipher.ENCRYPT_MODE, key);
      
      cipherDecrypt = javax.crypto.Cipher.getInstance("DESEDE/ECB/PKCS5Padding", "BC");
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
      return StringUtils.byte2hex(cipherEncrypt.doFinal(str.getBytes("UTF8")));
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
      return new String(cipherDecrypt.doFinal(StringUtils.hex2byte(str)), "UTF8");
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
