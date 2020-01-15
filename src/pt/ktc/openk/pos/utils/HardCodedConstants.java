package pt.ktc.openk.pos.utils;

import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;

public class HardCodedConstants {

	// A tabela ASCII:
	// !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz÷{|}~ 
	// 33,
	public static final int pt_ktc_openk_pos_locales_constants=1;
	public static final int SHA1PRNG=2;
	public static final int UTF8=3;
	public static final int DESEDE=4;
	public static final int DESEDE_ECB_PKCS5Padding=5;
	public static final int openk_pos_services_properties=6;
	public static final int openk_aladin_pre=7;
	public static final int openk_aladin_pos=8;
	
	//String nova_chave="A5GW8"+chave+"NFS48HE";
	
	//private static char pt_ktc_openk_pos_locales_constants_string[] = {'p', 't', '.', 'k', 't', 'c', '.', 'o', 'p', 'e', 'n', 'k', '.', 'p', 'o', 's', '.', 'l', 'o', 'c', 'a', 'l', 'e', 's', '.', 'c', 'o', 'n', 's', 't', 'a', 'n', 't', 's' };
	//private static char pt_ktc_openk_pos_locales_constants_string[]   = {'o', 's', '-', 'j', 's', 'b', '-', 'n', 'o', 'd', 'm', 'j', '-', 'o', 'n', 'r', '-', 'k', 'n', 'b', '`', 'k', 'd', 'r', '-', 'b', 'n', 'm', 'r', 's', '`', 'm', 's', 'r' };
	private static int pt_ktc_openk_pos_locales_constants_string[]   = {'o', 's', '-', 'j', 's', 'b', '-', 'n', 'o', 'd', 'm', 'j', '-', 'o', 'n', 'r', '-', 'k', 'n', 'b', '`', 'k', 'd', 'r', '-', 'b', 'n', 'm', 'r', 's', '`', 'm', 's', 'r' };
	//private static int SHA1PRNG[] = { 'S', 'H', 'A', '1', 'P', 'R', 'N', 'G' };
	private static int SHA1PRNG_string[] = { 'R', 'G', '@', '0', 'O', 'Q', 'M', 'F' };
	//private static int UTF8_string[] = { 'U', 'T', 'F', '8' };
	private static int UTF8_string[] = { 'T', 'S', 'E', '7' };
	//private static int DESEDE_string[] = { 'D', 'E', 'S', 'E', 'D', 'E' };
	private static int DESEDE_string[] = { 'C', 'D', 'R', 'D', 'C', 'D' };
	//private static int DESEDE_ECB_PKCS5Padding_string[] = { 'D', 'E', 'S', 'E', 'D', 'E', '/', 'E', 'C', 'B', '/', 'P', 'K', 'C', 'S', '5', 'P', 'a', 'd', 'd', 'i', 'n', 'g' };
	private static int DESEDE_ECB_PKCS5Padding_string[] = { 'C', 'D', 'R', 'D', 'C', 'D', '.', 'D', 'B', 'A', '.', 'O', 'J', 'B', 'R', '4', 'O', '`', 'c', 'c', 'h', 'm', 'f' };
	//private static int openk_pos_services_properties_string[] = { 'o', 'p', 'e', 'n', 'k', '_', 'p', 'o', 's', '_', 's', 'e', 'r', 'v', 'i', 'c', 'e', 's', '.', 'p', 'r', 'o', 'p', 'e', 'r', 't', 'i', 'e', 's' };
	private static int openk_pos_services_properties_string[] = { 'n', 'o', 'd', 'm', 'j', '^', 'o', 'n', 'r', '^', 'r', 'd', 'q', 'u', 'h', 'b', 'd', 'r', '-', 'o', 'q', 'n', 'o', 'd', 'q', 's', 'h', 'd', 'r' };
	//private static int openk_aladin_pre_string[]={ 'A', '5', 'G', 'W', '8' };
	private static int openk_aladin_pre_string[]={ '@', '4', 'F', 'V', '7' };
	//private static int openk_aladin_pos_string[]={ 'N', 'F', 'S', '4', '8', 'H', 'E' };
	private static int openk_aladin_pos_string[]={ 'M', 'E', 'R', '3', '7', 'G', 'D' };
	
	public static String getHardCodedString(int id) {
		String result="";
		char data[];
		switch (id) {
		case pt_ktc_openk_pos_locales_constants:
			data=new char [pt_ktc_openk_pos_locales_constants_string.length];
			for (int i=0; i<pt_ktc_openk_pos_locales_constants_string.length; i++) {
				data[i]=(char)((int)(pt_ktc_openk_pos_locales_constants_string[i])+1);
			}
			return new String(data);
		case SHA1PRNG:
			data=new char [SHA1PRNG_string.length];
			for (int i=0; i<SHA1PRNG_string.length; i++) {
				data[i]=(char)((int)(SHA1PRNG_string[i])+1);
			}
			return new String(data);
		case UTF8:
			data=new char [UTF8_string.length];
			for (int i=0; i<UTF8_string.length; i++) {
				data[i]=(char)((int)(UTF8_string[i])+1);
			}
			return new String(data);
		case DESEDE:
			data=new char [DESEDE_string.length];
			for (int i=0; i<DESEDE_string.length; i++) {
				data[i]=(char)((int)(DESEDE_string[i])+1);
			}
			return new String(data);
		case DESEDE_ECB_PKCS5Padding:
			data=new char [DESEDE_ECB_PKCS5Padding_string.length];
			for (int i=0; i<DESEDE_ECB_PKCS5Padding_string.length; i++) {
				data[i]=(char)((int)(DESEDE_ECB_PKCS5Padding_string[i])+1);
			}
			return new String(data);
		case openk_pos_services_properties:
			data=new char [openk_pos_services_properties_string.length];
			for (int i=0; i<openk_pos_services_properties_string.length; i++) {
				data[i]=(char)((int)(openk_pos_services_properties_string[i])+1);
			}
			return new String(data);
		case openk_aladin_pre:
			data=new char [openk_aladin_pre_string.length];
			for (int i=0; i<openk_aladin_pre_string.length; i++) {
				data[i]=(char)((int)(openk_aladin_pre_string[i])+1);
			}
			return new String(data);
		case openk_aladin_pos:
			data=new char [openk_aladin_pos_string.length];
			for (int i=0; i<openk_aladin_pos_string.length; i++) {
				data[i]=(char)((int)(openk_aladin_pos_string[i])+1);
			}
			return new String(data);
		}

		return result;
	}
}
