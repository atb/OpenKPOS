/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.aspects;

import pt.ktc.openk.pos.company.Company;
import pt.ktc.openk.pos.company.CompanyGlobal;

import com.openbravo.basic.BasicException;
import com.openbravo.pos.ticket.TicketInfo;

public privileged aspect DataLogicReceipts {

	pointcut getSharedTicket(com.openbravo.pos.sales.DataLogicReceipts dlr, String id) : target(dlr) && args(id) && call(TicketInfo getSharedTicket(String)); 

	TicketInfo around (com.openbravo.pos.sales.DataLogicReceipts dlr, String id) : getSharedTicket(dlr, id)  {
		
		TicketInfo tinfo=proceed(dlr, id);

		if (tinfo!=null) {
			// Dados globais da empresa....
	        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
	        tinfo.setCompanyAddress(cg.getAddress());
	        tinfo.setCompanyCity(cg.getCity());
	        tinfo.setCompanyName(cg.getName());
	        tinfo.setCompanyPostal(cg.getPostal());
	        tinfo.setCompanyTaxID(cg.getTaxID());
		}
		
		return tinfo;

	}
}
