/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.data.loader;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.SerializableRead;
import com.openbravo.data.loader.Datas;
import com.openbravo.data.loader.SerializerRead;


public class SerializerReadSignature implements SerializerRead {

	public static final SerializerReadSignature INSTANCE = new SerializerReadSignature();

	/** Creates a new instance of SerializerRead... */
	private SerializerReadSignature() {
	}

	public Object readValues(DataRead dr) throws BasicException {
		return Datas.STRING.getValue(dr, 1);
	}
}
