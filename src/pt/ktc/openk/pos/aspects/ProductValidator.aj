/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import com.openbravo.format.DoubleUtils;

public privileged aspect ProductValidator {

	// Garantir que nao e possivel colocar valores menores ou iguais a zero para o valor dos produtos
	/* primeira tentativa:
	pointcut setPriceSell(com.openbravo.pos.inventory.ProductsEditor pe, Object value) : target(pe) && args(value) && call(void com.openbravo.pos.inventory.ProductsEditor.setPriceSell(Object)); 
	
	void around (com.openbravo.pos.inventory.ProductsEditor pe, Object value): setPriceSell(pe, value)  {
		System.out.println("around setPriceSell");

        if (!pe.priceselllock) {

			//Number valor=value;
			if (value!=null) {
				double v=DoubleUtils.fixDecimals((Number) value);
				
				if (v<=0) {
					// colocar o valor anterior...
					value=pe.pricesell;
				}
			}
			
			proceed(pe, value);
        }
		//return pt.ktc.openk.sales.JProductLineEdit.showMessage(parent, app, oLine);
		
	}
	 */
	
}
