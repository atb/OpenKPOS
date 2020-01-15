/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.security;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.PreparedSentence;
import com.openbravo.data.loader.SerializerReadString;
import com.openbravo.data.loader.Session;
import pt.ktc.openk.pos.data.loader.SerializerReadBoolean;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

public class Cipher2 {
	
    private Session session=null;
 	
	public Cipher2(Session s) {
		session=s;
	}

	// Aqui devemos invocar a funcao que nos devolve a versao
	// CREATE OR REPLACE FUNCTION cipher_get_version()  RETURNS varchar AS $$
	public String getVersion() {
		String version;
		
        String cmd=StringConstants.getString(StringEnumerates.SELECT_cipher_get_version__);

        PreparedSentence selectSentence=new PreparedSentence(session
                , cmd
                , null
                , SerializerReadString.INSTANCE);
                        
        try {
			version=(String)selectSentence.find();
		} catch (BasicException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			version=StringConstants.getString(StringEnumerates._question_mark);
		}
        
        return version;
	}
	
	public String sign(String src)  {
		String signature;
		
        String cmd=StringConstants.getString(StringEnumerates.SELECT_cipher_sign__)+ src +StringConstants.getString(StringEnumerates._apostrophe_closebracket);

        PreparedSentence selectSentence=new PreparedSentence(session
                , cmd
                , null
                , SerializerReadString.INSTANCE);
                        
        try {
			signature=(String)selectSentence.find();
		} catch (BasicException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			signature=StringConstants.getString(StringEnumerates._question_mark);
		}
        
        return signature;
	}
	
	/**
	 * Verifica se uma assinatura esta a assinar um texto usando para isso a chave publica
	 * 
	 * @author Alexandre Braganca
	 * @param signSrc a assinatura
	 * @param src o texto correspondente a assinatura
	 */
	public boolean verify(String signSrc, String src) {
		Boolean result=new Boolean(false);
		
        String cmd=StringConstants.getString(StringEnumerates.SELECT_cipher_verify__)+ signSrc +StringConstants.getString(StringEnumerates._apostrophe_comma_space_apostrophe) + src + StringConstants.getString(StringEnumerates._apostrophe_closebracket);

        PreparedSentence selectSentence=new PreparedSentence(session
                , cmd
                , null
                , SerializerReadBoolean.INSTANCE);
                        
        try {
			result=(Boolean)selectSentence.find();
		} catch (BasicException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return result.booleanValue();
	}
}
