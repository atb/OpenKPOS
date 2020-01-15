/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.forms;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.data.loader.Session;

public class DataLogicSystem extends com.openbravo.pos.forms.DataLogicSystem {
	
	 public void init(Session s) {
		 super.init(s);
		 m_sInitScript = StringConstants.getString(StringEnumerates._pt_ktc_openk_pos_scripts_) + s.DB.getName();
	 }
}
