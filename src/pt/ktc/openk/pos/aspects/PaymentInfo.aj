/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import com.openbravo.format.Formats;

public privileged aspect PaymentInfo {

    public String com.openbravo.pos.payment.PaymentInfo.printTotalAbs() {
        return Formats.CURRENCY.formatValue(new Double(Math.abs(getTotal())));
    }
}
