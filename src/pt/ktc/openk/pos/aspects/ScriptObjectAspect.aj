/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import javax.swing.JOptionPane;

import pt.ktc.openk.pos.company.CompanyGlobal;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.loader.PreparedSentence;
import com.openbravo.data.loader.SerializerReadString;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.printer.TicketPrinterException;
import com.openbravo.pos.sales.JPanelTicket;
import com.openbravo.pos.scripting.ScriptEngine;
import com.openbravo.pos.scripting.ScriptException;
import com.openbravo.pos.scripting.ScriptFactory;

public privileged aspect ScriptObjectAspect {
	
	// Para guardar o id do sharedticket actual
	private String com.openbravo.pos.sales.JPanelTicket.ScriptObject.m_sharedTicketID="";
	
	public String com.openbravo.pos.sales.JPanelTicket.ScriptObject.getSharedTicketID() {
		return m_sharedTicketID;
	}
	
	public void com.openbravo.pos.sales.JPanelTicket.ScriptObject.setSharedTicketID(String id) {
		m_sharedTicketID=id;
	}
	
	// teste
	public int com.openbravo.pos.sales.JPanelTicket.ScriptObject.m_teste;
	
	public int com.openbravo.pos.sales.JPanelTicket.ScriptObject.generatePreview(String sresourcename) {
		
		// podemos usar o CompanyGlobal para aceder ao object JRootApp e dai ao DataLogicSales!
		DataLogicSales ds=(DataLogicSales) CompanyGlobal.getCompanyGlobal().getJRootApp().getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSales));
				
		// Na versao final deve-se chamar o saveTicket (declarado no DataLogicSales Aspect)

		int oldTicketType=ticket.getTicketType();
		int oldTicketId=ticket.getTicketId();
		com.openbravo.pos.ticket.TicketInfo oldTicket=ticket;
		
		// Vamos verificar se existem linhas na venda, se nao existirem nao se pode gerar consulta de mesa
		if ((ticket.getLinesCount()!=0) && (ticket.getTotal()!=0))
		{
		
			// Vamos fazer uma copia do ticket para gerar o novo talao de consulta
			com.openbravo.pos.ticket.TicketInfo newTicket=ticket.copyTicket();
			newTicket.setTicketType(pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_PREVIEW);
			newTicket.setCustomer(ticket.getCustomer());
			newTicket.setPayments(ticket.getPayments());
			
			// E necessario mandar calcular os impostos!
			// reset the payment info
			newTicket.getTax();				// vai calcular o impostp
			
			// Vamos obter o ID deste sharedTicket
			// E necessario ir buscar o local...
			String place=(String)ticketext;								// Ex: Mesa 2
			
			String sharedTicketId=m_sharedTicketID;						// Apenas o numero da mesa?!
		
			try {
				pt.ktc.openk.pos.Global.saveTicket3(ds, newTicket, (String)ticketext, sharedTicketId);

				// vamos imprimir
				ticket=newTicket;
				printTicket(sresourcename);
				ticket=oldTicket;
			
				// Actualizar as referencias no ticket original....
				String ref=ticket.getReference();
				//if ((ref==null) || (ref.length()==0)) ref=Integer.toString(newTicket.getTicketId());
				//else ref=ref+StringConstants.getString(StringEnumerates._comma)+newTicket.getTicketId();
				// Aqui vamos alterar para que use no novo campo de documentNo em vez de apenas o numero sequencial do ticket
				if ((ref==null) || (ref.length()==0)) ref=newTicket.getDocumentNo();
				else ref=newTicket.getDocumentNo()+StringConstants.getString(StringEnumerates._comma)+ref;
			
				ticket.setReference(ref);
			} catch (BasicException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ticket=oldTicket;

			int numero=ticket.getTicketId();

			return numero;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Esta venda n‹o tem linhas, n‹o Ž possivel gerar consulta de mesa.");

			return 0;		// Isto quer dizer que nao foi gerado o preview
		}
	}
	
	
	public void privateGeneratePreview() {
		
	}
}
