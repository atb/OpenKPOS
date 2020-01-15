/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import java.util.ArrayList;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.pos.ticket.TicketInfo;
import com.openbravo.pos.ticket.TicketLineInfo;

public privileged aspect JTicketsBagTicket {
	
	//pointcut getResourceAsXML(com.openbravo.pos.forms.DataLogicSystem tg, String res_name) : within(com.openbravo.pos.sales.JTicketsBagTicket) && target(tg) && args(res_name) && call(* *.getResourceAsXML(String));
	pointcut getResourceAsXML(String res_name) : (within(com.openbravo.pos.sales.JTicketsBagTicket) || within(pt.ktc.openk.pos.sales.JTicketsBagTicket)) && args(res_name) && call(* *.getResourceAsXML(String));

	String around (String res_name): getResourceAsXML(res_name)  {
		if (StringConstants.getString(StringEnumerates.Printer_TicketPreview).equals(res_name))
		{
			res_name=StringConstants.getString(StringEnumerates.Printer_TicketCopy);
		}
		return proceed(res_name);
	}
	
    // Para garantir a referencia na devolucao
    // private void m_jRefundActionPerformed(java.awt.event.ActionEvent evt)
	pointcut refundAction(com.openbravo.pos.sales.JTicketsBagTicket jBag) : target(jBag) && call(void com.openbravo.pos.sales.JTicketsBagTicket.m_jRefundActionPerformed(java.awt.event.ActionEvent)); 
    
	void around (com.openbravo.pos.sales.JTicketsBagTicket jBag): refundAction(jBag)  {
        java.util.List aRefundLines = new ArrayList();
        
        for(int i = 0; i < jBag.m_ticket.getLinesCount(); i++) {
            TicketLineInfo newline = new TicketLineInfo(jBag.m_ticket.getLine(i));
            aRefundLines.add(newline);
        } 
        
        jBag.m_ticketCopy = null;
        jBag.m_TicketsBagTicketBag.showRefund();
        jBag.m_panelticketedit.showRefundLines(aRefundLines);
        
        TicketInfo refundticket = new TicketInfo();
        //refundticket.setReference(Integer.toString(jBag.m_ticket.getTicketId()));			// Colocar a referencia para a factura original - Aqui deve-se colocar a "serie" completa
        refundticket.setReference(jBag.m_ticket.getDocumentNo());			// Colocar a referencia para a factura original 
        refundticket.setTicketType(TicketInfo.RECEIPT_REFUND);
        refundticket.setCustomer(jBag.m_ticket.getCustomer());
        refundticket.setPayments(jBag.m_ticket.getPayments());
        refundticket.setOriginalReceiptValue(jBag.m_ticket.getTotal());
        jBag.m_panelticketedit.setActiveTicket(refundticket, null);		
	}
	
	public String com.openbravo.pos.sales.JTicketsBagTicket.getCurrentSharedTicketID() {
		// Falta completar
		return null;
	}

	public String pt.ktc.openk.pos.sales.JTicketsBagTicket.getCurrentSharedTicketID() {
		// Falta completar
		return null;
	}
}
