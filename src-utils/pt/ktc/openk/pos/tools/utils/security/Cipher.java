/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 *
 *
 * */
package pt.ktc.openk.pos.tools.utils.security;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import pt.ktc.openk.pos.tools.utils.security.Base64;

//import org.apache.commons.codec.binary.Base64;

public class Cipher {

	private final String version="1.0";

	private byte[] bytesChavePrivadaMem;
	private byte[] bytesChavePublicaMem;
    private java.security.spec.PKCS8EncodedKeySpec chavePrivadaMem;
	private java.security.spec.X509EncodedKeySpec chavePublicaMem;
	private KeyFactory kf;
	private PrivateKey privateKey;
	private PublicKey publicKey;
	private KeyPair keyPair;
    private Signature signature;
    Base64 base64;

    // Um construtor que aceita passar por parametro as chaves
	public Cipher(String priKey, String pubKey) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException {
		//bytesChavePrivadaMem=Base64.decodeBase64(s1.getBytes());
		try {
			bytesChavePrivadaMem=Base64.decode(priKey.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	//bytesChavePublicaMem=Base64.decodeBase64(s2.getBytes());
		try {
			bytesChavePublicaMem=Base64.decode(pubKey.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        chavePrivadaMem=new PKCS8EncodedKeySpec(bytesChavePrivadaMem);

    	chavePublicaMem=new X509EncodedKeySpec(bytesChavePublicaMem);

    	kf=KeyFactory.getInstance("RSA", "BC");

    	privateKey=kf.generatePrivate(chavePrivadaMem);
    	publicKey=kf.generatePublic(chavePublicaMem);

    	keyPair=new KeyPair(publicKey, privateKey);

        signature = Signature.getInstance("SHA1withRSA", "BC");
	}


	public Cipher() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException {

		String s1="";

		//bytesChavePrivadaMem=Base64.decodeBase64(s1.getBytes());
		try {
			bytesChavePrivadaMem=Base64.decode(s1.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String s2="";

    	//bytesChavePublicaMem=Base64.decodeBase64(s2.getBytes());
		try {
			bytesChavePublicaMem=Base64.decode(s2.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        chavePrivadaMem=new PKCS8EncodedKeySpec(bytesChavePrivadaMem);

    	chavePublicaMem=new X509EncodedKeySpec(bytesChavePublicaMem);

    	kf=KeyFactory.getInstance("RSA", "BC");

    	privateKey=kf.generatePrivate(chavePrivadaMem);
    	publicKey=kf.generatePublic(chavePublicaMem);

    	keyPair=new KeyPair(publicKey, privateKey);

        signature = Signature.getInstance("SHA1withRSA", "BC");

        //base64 = new Base64();
	}

	public KeyPair getKeyPair() {
		return keyPair;
	}

	public PrivateKey getPrivateKey() {
		return privateKey;
	}


	public String getVersion() {
		return version;
	}

	public String sign(String src) throws InvalidKeyException, SignatureException {
        signature.initSign(keyPair.getPrivate());

        byte[] message=src.getBytes();

        signature.update(message);

        byte[] sigBytes = signature.sign();

        //return new String(base64.encode(sigBytes));
        return new String(Base64.encodeBytes(sigBytes));
	}


	public boolean verify(String signSrc, String src) throws InvalidKeyException, SignatureException {

	    //byte[] sigBytes=Base64.decodeBase64(signSrc.getBytes());
		byte[] sigBytes=new byte[0];
		try {
			sigBytes = Base64.decode(signSrc.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    signature.initVerify(keyPair.getPublic());

        byte[] message=src.getBytes();

        signature.update(message);

        if (signature.verify(sigBytes))
        {
        	return true;
        }
        else
        {
        	return false;
        }
	}

}
