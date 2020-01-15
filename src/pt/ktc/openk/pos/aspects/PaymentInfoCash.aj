/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import com.openbravo.format.Formats;

public privileged aspect PaymentInfoCash {

    public String com.openbravo.pos.payment.PaymentInfoCash.printPaidAbs() {
        return Formats.CURRENCY.formatValue(new Double(Math.abs(m_dPaid)));
    }   
    public String com.openbravo.pos.payment.PaymentInfoCash.printChangeAbs() {
        return Formats.CURRENCY.formatValue(new Double(Math.abs(m_dPaid - m_dTotal)));
    } 
}
