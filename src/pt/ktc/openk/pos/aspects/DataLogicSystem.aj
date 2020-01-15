/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.aspects;

import com.openbravo.basic.BasicException;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppProperties;

public privileged aspect DataLogicSystem {
	
	//     public final String findVersion() throws BasicException {
    pointcut findVersion(com.openbravo.pos.forms.DataLogicSystem dls) : target(dls) && call(* *.findVersion());

    String around(com.openbravo.pos.forms.DataLogicSystem dls) throws BasicException : findVersion(dls) {
        return (String) dls.m_version.find(pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_ID);
 	}
}
