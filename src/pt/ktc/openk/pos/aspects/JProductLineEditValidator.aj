/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import java.awt.Component;

import com.openbravo.basic.BasicException;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.sales.JProductLineEdit;
import com.openbravo.pos.ticket.TicketInfo;
import com.openbravo.pos.ticket.TicketLineInfo;


/* Esta classe serve para validar a introducao de dados na edicao de linhas de venda 
 * Nao devem ser permitidas quantidades menores ou iguais a zer;
 * Nao devem ser permitidos valores de venda menores ou iguais a zero 
 * */
public privileged aspect JProductLineEditValidator {

	// Garantir que se usa a classe correcta de edicao de linhas de venda para garantir as validacoes da
	// certificacao de software
	pointcut productLineEditShowMessage(Component parent, AppView app, TicketLineInfo oLine) : within(com.openbravo.pos.sales.JPanelTicket) && args(parent, app, oLine) && call(TicketLineInfo com.openbravo.pos.sales.JProductLineEdit.showMessage(Component, AppView, TicketLineInfo)); 
	
	TicketLineInfo around (Component parent, AppView app, TicketLineInfo oLine) throws BasicException: productLineEditShowMessage(parent, app, oLine)  {
		//System.out.println("around productLineEditShowMessage");
		//proceed(ti, loc);
		
		return pt.ktc.openk.sales.JProductLineEdit.showMessage(parent, app, oLine);
	}

}
