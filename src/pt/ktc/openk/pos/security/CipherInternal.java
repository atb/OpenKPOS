package pt.ktc.openk.pos.security;

import java.io.IOException;
// import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
// import java.security.NoSuchAlgorithmException;
// import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
// import java.security.SignatureException;
// import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.ResultSetMetaData;
// import java.sql.Statement;
// import java.util.ArrayList;

import pt.ktc.openk.pos.security.Base64;

//import org.apache.commons.codec.binary.Base64;

public class CipherInternal {

	private static String version = "1.0";

	private static byte[] bytesChavePrivadaMem;
	private static byte[] bytesChavePublicaMem;
	private static java.security.spec.PKCS8EncodedKeySpec chavePrivadaMem;
	private static java.security.spec.X509EncodedKeySpec chavePublicaMem;
	private static KeyFactory kf;
	private static PrivateKey privateKey;
	private static PublicKey publicKey;
	private static KeyPair keyPair;
	private static Signature signature;
	private static String publicStringKey;
	private static boolean init = false;
	private static boolean initError = false;
	private static String errorStr = "";
	Base64 base64;

	public CipherInternal() {
	}

	private static void doInit(String privKey, String pubKey) {
		try {
			initError = false;

			bytesChavePrivadaMem = Base64.decode(privKey.getBytes());

			bytesChavePublicaMem = Base64.decode(pubKey.getBytes());

			chavePrivadaMem = new PKCS8EncodedKeySpec(bytesChavePrivadaMem);

			chavePublicaMem = new X509EncodedKeySpec(bytesChavePublicaMem);

			kf = KeyFactory.getInstance("RSA", "BC");

			privateKey = kf.generatePrivate(chavePrivadaMem);
			publicKey = kf.generatePublic(chavePublicaMem);

			keyPair = new KeyPair(publicKey, privateKey);

			signature = Signature.getInstance("SHA1withRSA", "BC");
		} catch (Exception ex) {
			errorStr = ex.getMessage();
			initError = true;
		}

	}

	public static String sign(String privKey, String pubKey, String src) {
		try {
			doInit(privKey, pubKey);

			if (initError) {
				return errorStr;
			}

			signature.initSign(keyPair.getPrivate());

			byte[] message = src.getBytes();

			signature.update(message);

			byte[] sigBytes = signature.sign();

			// return new String(base64.encode(sigBytes));
			return new String(Base64.encodeBytes(sigBytes));
		} catch (Exception ex) {
			errorStr = ex.getMessage();
			initError = true;
		}
		return errorStr;
	}

	public static boolean verify(String privKey, String pubKey, String signSrc, String src) {
		try {
			doInit(privKey, pubKey);
			
			if (initError)
				return false;
			else {
	
				// byte[] sigBytes=Base64.decodeBase64(signSrc.getBytes());
				byte[] sigBytes = new byte[0];
				try {
					sigBytes = Base64.decode(signSrc.getBytes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				signature.initVerify(keyPair.getPublic());
	
				byte[] message = src.getBytes();
	
				signature.update(message);
	
				if (signature.verify(sigBytes)) {
					return true;
				} else {
					return false;
				}
			}
		}
		catch (Exception ex) {
			errorStr = ex.getMessage();
			return false;
		}
	}
}
