/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;


public privileged aspect JTicketsBagRestaurantMapAspect {
	
	/*
	 *     public void deleteTicket() {
        
        if (m_PlaceCurrent != null) {
            
            String id = m_PlaceCurrent.getId();
            try {
                dlReceipts.deleteSharedTicket(id);
            } catch (BasicException e) {
                new MessageInf(e).show(this);
            }       
            
            m_PlaceCurrent.setPeople(false);
            
            m_PlaceCurrent = null;
        }        
        
        printState();     
        m_panelticket.setActiveTicket(null, null); 
    }

	 */
	
	public com.openbravo.pos.ticket.TicketInfo com.openbravo.pos.sales.restaurant.JTicketsBagRestaurantMap.getActiveTicket() {
        if (m_PlaceCurrent != null) {
        	return getTicketInfo(m_PlaceCurrent);
        	//String id = m_PlaceCurrent.getId();
        }
        else return null;
	}

	public String com.openbravo.pos.sales.restaurant.JTicketsBagRestaurantMap.getActiveTicketId() {
        if (m_PlaceCurrent != null) {
        	return m_PlaceCurrent.getId();
        }
        else return null;
	}
	
	public String com.openbravo.pos.sales.restaurant.JTicketsBagRestaurantMap.getCurrentSharedTicketID() {
        if (m_PlaceCurrent != null) {
        	return m_PlaceCurrent.getId();
        }
        else return null;
	}


}
