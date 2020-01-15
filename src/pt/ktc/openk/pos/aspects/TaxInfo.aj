/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import com.openbravo.format.Formats;

public privileged aspect TaxInfo {
	
    public String com.openbravo.pos.ticket.TaxInfo.printTaxCode() {
    	//return this.id;			// ex:"001"
        return Formats.INT.formatValue(new Integer(this.id));
    }
    
    public String com.openbravo.pos.ticket.TaxInfo.printTaxRate() {
        return Formats.PERCENT.formatValue(getRate());
    }

}
