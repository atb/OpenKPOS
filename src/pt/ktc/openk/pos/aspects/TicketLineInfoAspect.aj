/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Properties;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.DataWrite;
import com.openbravo.format.Formats;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.ticket.TaxInfo;
import com.openbravo.pos.ticket.TicketLineInfo;
 
public privileged aspect TicketLineInfoAspect {

    public String com.openbravo.pos.ticket.TicketLineInfo.printMultiplyAbs() {
        return Formats.DOUBLE.formatValue(Math.abs(multiply));
    }

    public String com.openbravo.pos.ticket.TicketLineInfo.printSubValueAbs() {
        return Formats.CURRENCY.formatValue(Math.abs(getSubValue()));
    }

    public String com.openbravo.pos.ticket.TicketLineInfo.printValueAbs() {
        return Formats.CURRENCY.formatValue(Math.abs(getValue()));
    }
    
    // Para ja isto esta desactivado: INICIO
    // Para que o IVA seja bem calculado e necessario que seja calculado em cada item vendido
    /*
    pointcut getValuePointcut(com.openbravo.pos.ticket.TicketLineInfo line) : target(line) && call(double com.openbravo.pos.ticket.TicketLineInfo.getValue()); 
    
    double around(com.openbravo.pos.ticket.TicketLineInfo line) : getValuePointcut(line) {
    	double preco=line.getPriceTax();
    	BigDecimal preco2=new BigDecimal(preco);
    	preco2=preco2.setScale(2, RoundingMode.HALF_UP);
    	preco=preco2.doubleValue();
    	double quantidade=line.getMultiply();
    	double total=preco*quantidade;
    	return total;
    }

    // ESTOU AQUI: Falta fazer o mesmo para o getTax()!!
    // Para que o IVA seja bem calculado e necessario que seja calculado em cada item vendido
    pointcut getTaxPointcut(com.openbravo.pos.ticket.TicketLineInfo line) : target(line) && call(double com.openbravo.pos.ticket.TicketLineInfo.getTax()); 

    double around(com.openbravo.pos.ticket.TicketLineInfo line) : getTaxPointcut(line) {
    	double taxa_iva=line.getTaxRate();
    	double preco=line.getPrice();
    	double iva=preco * (taxa_iva);
    	
    	BigDecimal iva2=new BigDecimal(iva);
    	iva2=iva2.setScale(2, RoundingMode.HALF_UP);
    	iva=iva2.doubleValue();
    	
    	double quantidade=line.getMultiply();
    	double total=iva*quantidade;
    	
    	return total;
    }
    */
    // Para ja isto esta desactivado: FIM
    
    
    
    /*
	pointcut getProductLabe(com.openbravo.pos.catalog.JCatalog catalog, com.openbravo.pos.ticket.ProductInfoExt product) : target(catalog) && args(product) && call(String com.openbravo.pos.catalog.JCatalog.getProductLabel(com.openbravo.pos.ticket.ProductInfoExt)); 

	String around(com.openbravo.pos.catalog.JCatalog catalog, com.openbravo.pos.ticket.ProductInfoExt product): getProductLabe(catalog, product)  {
		return catalog.getProductLabel2(product);
	}*/
    
    
    
    // '+' Adicionou-se esta linha
    // '-' Removeu-se esta linha
    // '±' Alterou-se esta linha
    // '=' Desde a ultima "ordem" nao sofreu nenhuma alteracao
    // Nota: apos uma impressao de ordem deve-se colocar todas as linhas a '='
    // e remover as linhas removidas
	private String com.openbravo.pos.ticket.TicketLineInfo.lineStatus;
	public String com.openbravo.pos.ticket.TicketLineInfo.getLineStatus() {
		return this.lineStatus;
	}
	public void com.openbravo.pos.ticket.TicketLineInfo.setLineStatus(String status) {
		this.lineStatus=status;
	}
	
	// (ATB) Campos adicionais para o desconto
    private double com.openbravo.pos.ticket.TicketLineInfo.basePrice;
	public double com.openbravo.pos.ticket.TicketLineInfo.getBasePrice() {
		return this.basePrice;
	}
	public void com.openbravo.pos.ticket.TicketLineInfo.setBasePrice(double price) {
		this.basePrice=price;
	}
	
    public String com.openbravo.pos.ticket.TicketLineInfo.printBasePriceTax() {
        double valor = this.getBasePrice() * (1.0 + getTaxRate());
        return Formats.CURRENCY.formatValue(valor);
    }
	
    private double com.openbravo.pos.ticket.TicketLineInfo.discount;
	public double com.openbravo.pos.ticket.TicketLineInfo.getDiscount() {
		return this.discount;
	}
	public void com.openbravo.pos.ticket.TicketLineInfo.setDiscount(double disc) {
		this.discount=disc;
	}

    public String com.openbravo.pos.ticket.TicketLineInfo.printDiscount() {
        return Formats.PERCENT.formatValue(this.getDiscount());
    }

	// void init(String productid, String attsetinstid, double dMultiply, double dPrice, TaxInfo tax, Properties attributes)
	private void com.openbravo.pos.ticket.TicketLineInfo.init2(String productid, String attsetinstid, double dMultiply, double dPrice, TaxInfo tax, Properties attributes, com.openbravo.pos.ticket.TicketLineInfo line2) {
		this.init(productid, attsetinstid, dMultiply, dPrice, tax, attributes);
		if (line2==null) {
			this.basePrice=dPrice;
			this.discount=0.0;
		}
		else {
			this.basePrice=line2.getBasePrice();
			this.discount=line2.getDiscount();
		}
			
	}
	 
    //private void init(String productid, String attsetinstid, double dMultiply, double dPrice, TaxInfo tax, Properties attributes) {
    pointcut callInit(com.openbravo.pos.ticket.TicketLineInfo line, String productid, String attsetinstid, double dMultiply, double dPrice, TaxInfo tax, Properties attributes) : target(line) && args(productid, attsetinstid, dMultiply, dPrice, tax, attributes) && call(void com.openbravo.pos.ticket.TicketLineInfo.init(String, String, double, double, TaxInfo, Properties)); 
	
    void around(com.openbravo.pos.ticket.TicketLineInfo line, String productid, String attsetinstid, double dMultiply, double dPrice, TaxInfo tax, Properties attributes): callInit(line, productid, attsetinstid, dMultiply, dPrice, tax, attributes)  {
    	line.init2(productid, attsetinstid, dMultiply, dPrice, tax, attributes, null);
	}
    
    // O constructor por copia e' um caso particular
    //public TicketLineInfo(TicketLineInfo line) {
    //    init(line.productid, line.attsetinstid, line.multiply, line.price, line.tax, (Properties) line.attributes.clone());
    //}
    pointcut constByCopy(com.openbravo.pos.ticket.TicketLineInfo line, com.openbravo.pos.ticket.TicketLineInfo line2) : target(line) && args(line2) && execution(com.openbravo.pos.ticket.TicketLineInfo.new(com.openbravo.pos.ticket.TicketLineInfo)); 
    
    // O seguinte advice nao esta 100%
    after(com.openbravo.pos.ticket.TicketLineInfo line, com.openbravo.pos.ticket.TicketLineInfo line2): constByCopy(line, line2)  {
    	//init2();
    	//proceed(line, line2);
        line.init2(line.productid, line.attsetinstid, line.multiply, line.price, line.tax, (Properties) line.attributes.clone(), line2);
    }

    // Para suportar os 2 campos dos discount
    //     public void readValues(DataRead dr) throws BasicException {
    pointcut readValues(com.openbravo.pos.ticket.TicketLineInfo line, DataRead dr) : target(line) && args(dr) && execution(void com.openbravo.pos.ticket.TicketLineInfo.readValues(DataRead) throws BasicException); 

    public void com.openbravo.pos.ticket.TicketLineInfo.readValues2(DataRead dr) throws BasicException {
        this.m_sTicket = dr.getString(1);
        this.m_iLine = dr.getInt(2).intValue();
        this.productid = dr.getString(3);
        this.attsetinstid = dr.getString(4);

        this.multiply = dr.getDouble(5);
        this.price = dr.getDouble(6);

        this.tax = new TaxInfo(dr.getString(7), dr.getString(8), dr.getString(9), dr.getString(10), dr.getString(11), dr.getDouble(12), dr.getBoolean(13), dr.getInt(14));
        this.attributes = new Properties();
        try {
            byte[] img = dr.getBytes(15);
            if (img != null) {
                this.attributes.loadFromXML(new ByteArrayInputStream(img));
            }
        } catch (IOException e) {
        }

        // Campos adicionais
        this.basePrice = dr.getDouble(16);
        this.discount = dr.getDouble(17);
        
    }
    
    void around(com.openbravo.pos.ticket.TicketLineInfo line, DataRead dr) throws BasicException: readValues(line, dr)   {
    	line.readValues2(dr);
    	//proceed(line, dr);
    }
    
    //     public void writeValues(DataWrite dp) throws BasicException {
    pointcut writeValues(com.openbravo.pos.ticket.TicketLineInfo line, DataWrite dp) : target(line) && args(dp) && execution(void com.openbravo.pos.ticket.TicketLineInfo.writeValues(DataWrite) throws BasicException); 

    public void com.openbravo.pos.ticket.TicketLineInfo.writeValues2(DataWrite dp) throws BasicException {
        dp.setString(1, this.m_sTicket);
        dp.setInt(2, new Integer(this.m_iLine));
        dp.setString(3, this.productid);
        dp.setString(4, this.attsetinstid);

        dp.setDouble(5, new Double(this.multiply));
        dp.setDouble(6, new Double(this.price));

        dp.setString(7, this.tax.getId());
        try {
            ByteArrayOutputStream o = new ByteArrayOutputStream();
            this.attributes.storeToXML(o, AppLocal.APP_NAME, StringConstants.getString(StringEnumerates.UTF_8));
            dp.setBytes(8, o.toByteArray());
        } catch (IOException e) {
            dp.setBytes(8, null);
        }

        // Para suportar os descontos 
        dp.setDouble(9, new Double(this.basePrice));
        dp.setDouble(10, new Double(this.discount));
    }

    void around(com.openbravo.pos.ticket.TicketLineInfo line, DataWrite dp) throws BasicException: writeValues(line, dp)   {
    	line.writeValues2(dp);
    	//proceed(line, dr);
    }


}


