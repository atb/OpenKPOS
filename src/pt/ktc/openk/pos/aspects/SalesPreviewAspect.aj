/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import javax.swing.JOptionPane;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.loader.PreparedSentence;
import com.openbravo.data.loader.SerializerReadString;
import com.openbravo.pos.forms.AppLocal;

/*
 * Aspecto para garantir o "normal" funcionamento das consultas de venda.
 * Por exemplo, apos a emissao de uma consulta de venda nao se pode apagar o 
 * ticket, e' necessario terminar a venda com a emissao do talao de venda.
 * */
public privileged aspect SalesPreviewAspect {
	
	public boolean com.openbravo.pos.sales.shared.JTicketsBagShared.noPreviewTicket() {
		
		// vamos buscar o ticket seleccionado...
		String ticketId=m_sCurrentTicket;
		
		// este metodo deveria devolver se e possivel remover ou nao o recibo 
		// Vamos fazer uma pesquisa ao SHAREDTICKETS
        String cmd=StringConstants.getString(StringEnumerates.SELECT_REFERENCE_FROM_SHAREDTICKETS_WHERE_ID____)+ ticketId+StringConstants.getString(StringEnumerates._apostrophe);
        String reference="";

        try {
	        PreparedSentence selectSentence=new PreparedSentence(pt.ktc.openk.pos.company.CompanyGlobal.getCompanyGlobal().getJRootApp().getSession()
	                , cmd
	                , null
	                , SerializerReadString.INSTANCE);

			reference=(String)selectSentence.find();
		} catch (BasicException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//System.out.println(reference);

		if (reference==null) return true;
		else return false;
	}

	
	public boolean com.openbravo.pos.sales.restaurant.JTicketsBagRestaurant.noPreviewTicket() {
		
		// vamos buscar o ticket seleccionado...
		String ticketId=m_restaurant.getActiveTicketId();
		
		// este metodo deveria devolver se e possivel remover ou nao o recibo 
		// Vamos fazer uma pesquisa ao SHAREDTICKETS
        String cmd=StringConstants.getString(StringEnumerates.SELECT_REFERENCE_FROM_SHAREDTICKETS_WHERE_ID____)+ ticketId+StringConstants.getString(StringEnumerates._apostrophe);
        String reference="";

        try {
	        PreparedSentence selectSentence=new PreparedSentence(pt.ktc.openk.pos.company.CompanyGlobal.getCompanyGlobal().getJRootApp().getSession()
	                , cmd
	                , null
	                , SerializerReadString.INSTANCE);

			reference=(String)selectSentence.find();
		} catch (BasicException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//System.out.println(reference);

		if (reference==null) return true;
		else return false;
	}

	// BAG RESTAURANT
    pointcut delActionPerformed(com.openbravo.pos.sales.restaurant.JTicketsBagRestaurant ticketBag) : target(ticketBag) && call(void com.openbravo.pos.sales.restaurant.JTicketsBagRestaurant.m_jDelTicketActionPerformed(java.awt.event.ActionEvent)); 

    void around(com.openbravo.pos.sales.restaurant.JTicketsBagRestaurant ticketBag): delActionPerformed(ticketBag)  {

    	// deve-se chamar o metodo anterior ...
    	boolean res=ticketBag.noPreviewTicket();

    	if (!res)
    		JOptionPane.showMessageDialog(ticketBag, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_mustsell)), AppLocal.getIntString(StringConstants.getString(StringEnumerates.title_editor)), JOptionPane.WARNING_MESSAGE);
    	else proceed(ticketBag);
    }
    
    // jButton2ActionPerformed
    pointcut moveActionPerformed(com.openbravo.pos.sales.restaurant.JTicketsBagRestaurant ticketBag) : target(ticketBag) && call(void com.openbravo.pos.sales.restaurant.JTicketsBagRestaurant.jButton2ActionPerformed(java.awt.event.ActionEvent)); 

    void around(com.openbravo.pos.sales.restaurant.JTicketsBagRestaurant ticketBag): moveActionPerformed(ticketBag)  {

    	// deve-se chamar o metodo anterior ...
    	boolean res=ticketBag.noPreviewTicket();

    	if (!res)
    		JOptionPane.showMessageDialog(ticketBag, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_mustsell)), AppLocal.getIntString(StringConstants.getString(StringEnumerates.title_editor)), JOptionPane.WARNING_MESSAGE);
    	else proceed(ticketBag);
    }

    // BAG SHARED
    pointcut delActionPerformedShared(com.openbravo.pos.sales.shared.JTicketsBagShared ticketBag) : target(ticketBag) && call(void com.openbravo.pos.sales.shared.JTicketsBagShared.m_jDelTicketActionPerformed(java.awt.event.ActionEvent)); 

    void around(com.openbravo.pos.sales.shared.JTicketsBagShared ticketBag): delActionPerformedShared(ticketBag)  {

    	// deve-se chamar o metodo anterior ...
    	boolean res=ticketBag.noPreviewTicket();

    	if (!res)
    		JOptionPane.showMessageDialog(ticketBag, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_mustsell)), AppLocal.getIntString(StringConstants.getString(StringEnumerates.title_editor)), JOptionPane.WARNING_MESSAGE);
    	else proceed(ticketBag);
    }
 
}
