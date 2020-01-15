/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import com.openbravo.format.Formats;

public privileged  aspect TicketTaxInfo {
	
	// Metodo para adicionar valor indicando o valor base e o imposto desse valor base!
    public void com.openbravo.pos.ticket.TicketTaxInfo.addPartial(double dValue, double dTax) {
        subtotal += dValue;
        taxtotal += dTax;
    }
    
	public String com.openbravo.pos.ticket.TicketTaxInfo.printSubTotalAbs() {
        return Formats.CURRENCY.formatValue(new Double(Math.abs(getSubTotal())));
    }
	
    public String com.openbravo.pos.ticket.TicketTaxInfo.printTaxAbs() {
        return Formats.CURRENCY.formatValue(new Double(Math.abs(getTax())));
    } 
}
