/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.tools.utils.security;


import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import pt.ktc.openk.pos.tools.utils.security.Base64;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

/**
 * @author Nuno Antunes
 *
 */
public class CertificationManager {

	private static CertificationManager instance;
	private static final int EXPECTED_HASH_LENGTH = 172;
	
	private PrivateKey privateKey;
	private PublicKey publicKey;
	private Signature signature; 
	
	private boolean autoVerifyHash;
    
	private CertificationManager() {
		
		privateKey = null;
		publicKey = null;
		autoVerifyHash = false;
		
		try {
			signature = Signature.getInstance(StringConstants.getString(StringEnumerates.SHA1withRSA));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
	}

	public static CertificationManager getInstance() {
		
		if (instance == null) {
			instance = new CertificationManager();
		}
		return instance;
		
	}

	public void setAutoVerifyHash(boolean verify) {
		
		autoVerifyHash = verify;
		
	}
	
	public String getHashBase64(String source)
	throws InvalidHashException, InvalidKeyException {
		
		String hashBase64 = Base64.encodeBytes(getHashBinary(source));
		if (autoVerifyHash) {
			if ((!verifyHashBase64(source, hashBase64)) || (hashBase64.length() != EXPECTED_HASH_LENGTH)) 
				throw new InvalidHashException();
		}

		return hashBase64; 
		
	}
	
	public byte[] getHashBinary(String source) 
	throws InvalidHashException, InvalidKeyException {

		byte[] hash;

		try {
			signature.initSign(privateKey);
			signature.update(source.getBytes());			
			hash = signature.sign();
			if (autoVerifyHash) { 
				if (!verifyHashBinary(source, hash)) 
					throw new InvalidHashException();
				
			}
		} catch (SignatureException e) {
			throw new InvalidHashException(StringConstants.getString(StringEnumerates.Signature_exception___should_not_happen));
		}
		
		return hash;
		
	}
	
	public boolean verifyHashBase64(String source, String hashBase64)
	throws InvalidKeyException {
		
		try {
			return (verifyHashBinary(source, Base64.decode(hashBase64)) && (hashBase64.length() == EXPECTED_HASH_LENGTH));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public boolean verifyHashBinary(String source, byte[] hash)
	throws InvalidKeyException {

		try {
			signature.initVerify(publicKey);
			signature.update(source.getBytes());
			return signature.verify(hash);
		} catch (SignatureException e) {
			e.printStackTrace();
		}
				
		return false;
		
	}
	
	public void setPrivateKey(byte[] key) 
	throws InvalidKeySpecException {

		PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(key);

		try {
			KeyFactory kf = KeyFactory.getInstance(StringConstants.getString(StringEnumerates.RSA));
		    privateKey = kf.generatePrivate(spec);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}			
			
	}

	public void setPublicKey(byte[] key) 
	throws InvalidKeySpecException {
		
	    X509EncodedKeySpec spec = new X509EncodedKeySpec(key);
	    
		try {
			KeyFactory kf = KeyFactory.getInstance(StringConstants.getString(StringEnumerates.RSA));
			publicKey = kf.generatePublic(spec);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void readFromFilePrivateKey(String filename) 
	throws IOException, InvalidKeySpecException {
		
	    File f = new File(filename);
	    FileInputStream fis;
	    fis = new FileInputStream(f);
	    DataInputStream dis = new DataInputStream(fis);
	    byte[] keyBytes = new byte[(int)f.length()];	    
	    dis.readFully(keyBytes);
	    dis.close();
	    setPrivateKey(keyBytes);			
	    
	}

	public void readFromFilePublicKey(String filename) 
	throws IOException, InvalidKeySpecException {
		
	    File f = new File(filename);
	    FileInputStream fis;
		fis = new FileInputStream(filename);
		DataInputStream dis = new DataInputStream(fis);
		byte[] keyBytes = new byte[(int)f.length()];
		dis.readFully(keyBytes);
		dis.close();
		setPublicKey(keyBytes);
		
	}
	
}
