/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import javax.swing.JOptionPane;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.pos.forms.AppLocal;

public privileged aspect JTicketsBagSharedAspect {

	public String com.openbravo.pos.sales.shared.JTicketsBagShared.getCurrentSharedTicketID() {
		// Falta completar
		return m_sCurrentTicket;
	}
	
    pointcut deleteSharedTicket(String id) : withincode(void com.openbravo.pos.sales.shared.JTicketsBagShared.setActiveTicket(String)) && args(id) && call(void com.openbravo.pos.sales.DataLogicReceipts.deleteSharedTicket(String)); 

    void around(String id): deleteSharedTicket(id)  {
    	// Neste caso particular deve-se desactivar o apagar do sharedticket que se esta a abrir
    	//proceed(id);
    }
    
    
    public void com.openbravo.pos.sales.shared.JTicketsBagShared.updateCurrentTicket() {
        // update current ticket, if exists,
        if (m_sCurrentTicket != null) {
            try {
                dlReceipts.updateSharedTicket(m_sCurrentTicket, m_panelticket.getActiveTicket());
            } catch (BasicException e) {
                new MessageInf(e).show(this);
            }  
        }    
    }

    public void com.openbravo.pos.sales.shared.JTicketsBagShared.insertCurrentTicket() {
        // update current ticket, if exists,
        if (m_sCurrentTicket != null) {
            try {
                dlReceipts.insertSharedTicket(m_sCurrentTicket, m_panelticket.getActiveTicket());
            } catch (BasicException e) {
                new MessageInf(e).show(this);
            }  
        }    
    }

    public void com.openbravo.pos.sales.shared.JTicketsBagShared.deleteCurrentTicket() {
        // delete current ticket, if exists,
        if (m_sCurrentTicket != null) {
            try {
                dlReceipts.deleteSharedTicket(m_sCurrentTicket);
                //(ATB, 2013-03-07)
                m_sCurrentTicket=null;
            } catch (BasicException e) {
                new MessageInf(e).show(this);
            }  
        }    
    }

    pointcut saveCurrentTicket(com.openbravo.pos.sales.shared.JTicketsBagShared bag) : target(bag) && call(void com.openbravo.pos.sales.shared.JTicketsBagShared.saveCurrentTicket()); 

    void around(com.openbravo.pos.sales.shared.JTicketsBagShared bag): saveCurrentTicket(bag)  {
    	// deve-se invocar o update
    	bag.updateCurrentTicket();
    }
    
    //newTicket
    pointcut newTicket(com.openbravo.pos.sales.shared.JTicketsBagShared bag) : target(bag) && execution(void com.openbravo.pos.sales.shared.JTicketsBagShared.newTicket()); 

    after(com.openbravo.pos.sales.shared.JTicketsBagShared bag): newTicket(bag)  {
    	// deve-se invocar o update
    	//bag.updateCurrentTicket();
        // save current ticket, if exists,
    	bag.insertCurrentTicket();
    }

    //newTicket
    pointcut deleteTicket(com.openbravo.pos.sales.shared.JTicketsBagShared bag) : target(bag) && execution(void com.openbravo.pos.sales.shared.JTicketsBagShared.deleteTicket()); 

    //after(com.openbravo.pos.sales.shared.JTicketsBagShared bag): deleteTicket(bag)  {
    before(com.openbravo.pos.sales.shared.JTicketsBagShared bag): deleteTicket(bag)  {
    	// deve-se invocar o update
    	//bag.updateCurrentTicket();
        // save current ticket, if exists,
    	
    	bag.deleteCurrentTicket();
    	
    }
	
}
