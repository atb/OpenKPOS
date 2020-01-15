package pt.ktc.openk.pos.aspects;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.pos.customers.JCustomerFinder;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.ticket.TicketInfo;

public privileged aspect SimpleReceiptAspect {

	// Para substitui a janela de selecao de customer por outra que permite criar cliente com base no NIF para faturas simplifcadas
    // private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
	pointcut btnCustomerActionPerformed(com.openbravo.pos.sales.SimpleReceipt simpleReceipt, java.awt.event.ActionEvent evt): target(simpleReceipt) && args(evt) && call(void com.openbravo.pos.sales.SimpleReceipt.btnCustomerActionPerformed(java.awt.event.ActionEvent)); 

	void around (com.openbravo.pos.sales.SimpleReceipt simpleReceipt, java.awt.event.ActionEvent evt): btnCustomerActionPerformed(simpleReceipt, evt)  {

		simpleReceipt.btnCustomerActionPerformed2(evt);
	}

    private void com.openbravo.pos.sales.SimpleReceipt.btnCustomerActionPerformed2(java.awt.event.ActionEvent evt) {
        
        pt.ktc.openk.pos.customers.JCustomerFinder finder = pt.ktc.openk.pos.customers.JCustomerFinder.getCustomerFinder(this, dlCustomers);
        finder.search(ticket.getCustomer());
        finder.setVisible(true);
        
        try {
            ticket.setCustomer(finder.getSelectedCustomer() == null
                    ? null
                    : dlSales.loadCustomerExt(finder.getSelectedCustomer().getId()));
        } catch (BasicException e) {
            MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.cannotfindcustomer"), e);
            msg.show(this);            
        }


        // The ticket name
        String sTemp=ticket.getName(ticketext);
        if (sTemp.length()>10) { sTemp=sTemp.substring(0,10)+"..."; }
        m_jTicketId.setText(sTemp);        // Esta linha da origem ao alargamento da janela base quando se selecciona um cliente!
        
        refreshTicketTaxes();     
        
        // refresh the receipt....
        setTicket(ticket, ticketext);
        
    }//GEN-LAST:event_btnCustomerActionPerformed
    
	pointcut setText(javax.swing.JLabel label, String text): withincode(void com.openbravo.pos.sales.SimpleReceipt.setTicket(TicketInfo, Object)) && target(label) && args(text) && call(void javax.swing.JLabel.setText(String)); 

	void around (javax.swing.JLabel label, String text): setText(label, text)  {
		// Serve este advice para evitar textos no label demasiado extensos, pois estao a alterar o layout!!!???
		
        String sTemp=text;
        if (sTemp.length()>10) { sTemp=sTemp.substring(0,10)+"..."; }
        label.setText(sTemp);        // Esta linha da origem ao alargamento da janela base quando se selecciona um cliente!
	}


}
