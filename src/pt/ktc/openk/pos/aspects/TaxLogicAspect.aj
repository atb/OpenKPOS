/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import com.openbravo.pos.sales.TaxesException;
import com.openbravo.pos.sales.TaxesLogicElement;
import com.openbravo.pos.ticket.TicketLineInfo;
import com.openbravo.pos.ticket.TicketTaxInfo;

public privileged aspect TaxLogicAspect {

	// Para que o imposto possa ser calculado para cada item e nao sobre o total
	// Desta forma evita-se a consequencia dos arredondamentos no caso de IVAs que sao calculados com bas em PVP (para "tras") 
    public List<TicketTaxInfo> com.openbravo.pos.sales.TaxesLogic.calculateTaxes2(TicketLineInfo line) throws TaxesException {
        
        TaxesLogicElement taxesapplied = getTaxesApplied(line.getTaxInfo());
        return calculateLineTaxes2(line.getSubValue(), line, taxesapplied);
    }
    
    private List<TicketTaxInfo> com.openbravo.pos.sales.TaxesLogic.calculateLineTaxes2(double base, TicketLineInfo line, TaxesLogicElement taxesapplied) {
 
        List<TicketTaxInfo> linetaxes = new ArrayList<TicketTaxInfo>();
        
        if (taxesapplied.getSons().isEmpty()) {     	// O caso que vai acontecer quase sempre      
            TicketTaxInfo tickettax = new TicketTaxInfo(taxesapplied.getTax());
            
            //tickettax.add(base);
            tickettax.addPartial(line.getPrice()*line.getMultiply(),   // preco base que se multiplica pela quantidade
            		line.getTax());			// getTax e o IVA de cada unidade multiplicado pelo numero de unidades
          
            linetaxes.add(tickettax);
        } else {
            double acum = base;
            
            for (TaxesLogicElement te : taxesapplied.getSons()) {
                
                List<TicketTaxInfo> sublinetaxes = calculateLineTaxes2(
                        te.getTax().isCascade() ? acum : base, 
                        line,
                        te);
                linetaxes.addAll(sublinetaxes);
                acum += sumTaxes(sublinetaxes);
            }
        }
        
        return linetaxes;       
    }
    
    
    // Para ja isto esta desactivado
    /*
    //    public List<TicketTaxInfo> calculateTaxes(TicketLineInfo line) throws TaxesException {
    pointcut calculateTaxesPointcut(com.openbravo.pos.sales.TaxesLogic tLogic, TicketLineInfo line) : target(tLogic) && args(line) && call(List<TicketTaxInfo> com.openbravo.pos.sales.TaxesLogic.calculateTaxes(TicketLineInfo)); 
    
    List<TicketTaxInfo> around(com.openbravo.pos.sales.TaxesLogic tLogic, TicketLineInfo line) throws TaxesException : calculateTaxesPointcut(tLogic, line) {
    	
    	return tLogic.calculateTaxes2(line);
    } 
    */  
	
}
