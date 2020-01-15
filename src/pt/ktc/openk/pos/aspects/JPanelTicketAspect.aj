/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.data.gui.MessageInf;
import com.openbravo.pos.forms.AppProperties;
import com.openbravo.pos.sales.JPanelTicket.ScriptArg;
import com.openbravo.pos.sales.restaurant.JTicketsBagRestaurantMap;

public privileged aspect JPanelTicketAspect {
	
	
    public void com.openbravo.pos.sales.JPanelTicket.evalScriptAndRefresh2(String resource, ScriptArg... args) {
        if (resource == null) {
            MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_cannotexecute)));
            msg.show(this);            
        } else {
            ScriptObject scr = new ScriptObject(m_oTicket, m_oTicketExt);
            scr.setSelectedIndex(m_ticketlines.getSelectedIndex());
            Object ret=evalScript(scr, resource, args);
            refreshTicket();
            setSelectedIndex(scr.getSelectedIndex());

            if (String.class.isInstance(ret)) {
            	// O resultado foi uma string
            	String resultado=(String)ret;
            	if (resultado.compareTo(StringConstants.getString(StringEnumerates.sair))==0) {
            		if (JTicketsBagRestaurantMap.class.isInstance(m_ticketsbag)) {
            			// Estamos no modo "restaurant"
            			JTicketsBagRestaurantMap viewMap=(JTicketsBagRestaurantMap)m_ticketsbag;
            			//viewMap.viewTables();
            			viewMap.newTicket();
            		}
            	}
            }
        }
    } 
	
	//     public void evalScriptAndRefresh(String resource, ScriptArg... args) {

    pointcut callEvalScriptAndRefresh(com.openbravo.pos.sales.JPanelTicket panelTicket, String resource, ScriptArg... args) : 
    	target(panelTicket) && args(resource, args) && call(void com.openbravo.pos.sales.JPanelTicket.evalScriptAndRefresh(String, ScriptArg... ));

    void around(com.openbravo.pos.sales.JPanelTicket panelTicket, String resource, ScriptArg[] arguments) : callEvalScriptAndRefresh(panelTicket, resource, arguments) {
		panelTicket.evalScriptAndRefresh2(resource, arguments);
    	//proceed(panelTicket, resource, arguments);
	}


}
