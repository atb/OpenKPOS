package pt.ktc.openk.pos.aspects;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

public privileged aspect CustomerInfoAspect {

	// Vamos alterar o que faz o toString da classe CustomerInfo
//	   pointcut copyTicket(com.openbravo.pos.ticket.TicketInfo ticket) : target(ticket) && call(com.openbravo.pos.ticket.TicketInfo *.copyTicket()); 
//
//	    com.openbravo.pos.ticket.TicketInfo around(com.openbravo.pos.ticket.TicketInfo ticket): copyTicket(ticket)  {

	pointcut toString(com.openbravo.pos.customers.CustomerInfo custInfo) : within(com.openbravo.pos.customers.CustomerInfo) && target(custInfo) && call(String com.openbravo.pos.customers.CustomerInfo.getName()); 
	
	String around(com.openbravo.pos.customers.CustomerInfo custInfo): toString(custInfo)  {
		if (custInfo.getName()==null)
			return StringConstants.getString(StringEnumerates._sem_nome__)+custInfo.getTaxid().trim()+StringConstants.getString(StringEnumerates._right_parentheses);
			//return "<sem nome>("+custInfo.getTaxid().trim()+")";
		// return custInfo.getName().trim()+"("+custInfo.getTaxid().trim()+")";
		return custInfo.getName().trim()+StringConstants.getString(StringEnumerates._left_parentheses)+custInfo.getTaxid().trim()+StringConstants.getString(StringEnumerates._right_parentheses);
	}

}
