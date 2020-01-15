/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.data.loader;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.Datas;
import com.openbravo.data.loader.SerializerRead;

public class SerializerReadBoolean implements SerializerRead {

	public static final SerializerReadBoolean INSTANCE = new SerializerReadBoolean();

	/** Creates a new instance of SerializerRead... */
	private SerializerReadBoolean() {
	}

	public Object readValues(DataRead dr) throws BasicException {
		return Datas.BOOLEAN.getValue(dr, 1);
	}
}