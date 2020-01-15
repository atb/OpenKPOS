/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import pt.ktc.openk.pos.company.CompanyGlobal;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.format.Formats;
import com.openbravo.pos.customers.CustomerInfoExt;
import com.openbravo.pos.ticket.TicketLineInfo;
import com.openbravo.pos.ticket.TicketTaxInfo;

public privileged aspect TicketInfo {

	// Vamos acrescentar uns campos ao TicketInfo para conter os dados da empresa para a qual foi instalado o software
	//private String com.openbravo.pos.ticket.TicketInfo.companyName="Empresa Lda";
	private String com.openbravo.pos.ticket.TicketInfo.companyName;
	public String com.openbravo.pos.ticket.TicketInfo.getCompanyName() {
		return this.companyName;
	}
	public void com.openbravo.pos.ticket.TicketInfo.setCompanyName(String name) {
		this.companyName=name;
	}
    public String com.openbravo.pos.ticket.TicketInfo.printCompanyName() {
        return this.companyName;
    }

	//private String com.openbravo.pos.ticket.TicketInfo.companyAddress="Rua da Empresa";
	private String com.openbravo.pos.ticket.TicketInfo.companyAddress;
	public String com.openbravo.pos.ticket.TicketInfo.getCompanyAddress() {
		return this.companyAddress;
	}
	public void com.openbravo.pos.ticket.TicketInfo.setCompanyAddress(String address) {
		this.companyAddress=address;
	}
    public String com.openbravo.pos.ticket.TicketInfo.printCompanyAddress() {
        return this.companyAddress;
    }

	//private String com.openbravo.pos.ticket.TicketInfo.companyTaxID="555666777";
	private String com.openbravo.pos.ticket.TicketInfo.companyTaxID;
	public String com.openbravo.pos.ticket.TicketInfo.getCompanyTaxID() {
		return this.companyTaxID;
	}
	public void com.openbravo.pos.ticket.TicketInfo.setCompanyTaxID(String taxID) {
		this.companyTaxID=taxID;
	}
    public String com.openbravo.pos.ticket.TicketInfo.printCompanyTaxID() {
        return this.companyTaxID;
    }

	//private String com.openbravo.pos.ticket.TicketInfo.companyPostal="5555-666";
	private String com.openbravo.pos.ticket.TicketInfo.companyPostal;
	public String com.openbravo.pos.ticket.TicketInfo.getCompanyPostal() {
		return this.companyPostal;
	}
	public void com.openbravo.pos.ticket.TicketInfo.setCompanyPostal(String postal) {
		this.companyPostal=postal;
	}
    public String com.openbravo.pos.ticket.TicketInfo.printCompanyPostal() {
        return this.companyPostal;
    }

	//private String com.openbravo.pos.ticket.TicketInfo.companyCity="Cidade";
    private String com.openbravo.pos.ticket.TicketInfo.companyCity;
	public String com.openbravo.pos.ticket.TicketInfo.getCompanyCity() {
		return this.companyCity;
	}
	public void com.openbravo.pos.ticket.TicketInfo.setCompanyCity(String city) {
		this.companyCity=city;
	}
    public String com.openbravo.pos.ticket.TicketInfo.printCompanyCity() {
        return this.companyCity;
    }

	//private String com.openbravo.pos.ticket.TicketInfo.companyDenomination="Colegio KTC";
    private String com.openbravo.pos.ticket.TicketInfo.companyDenomination;
	public String com.openbravo.pos.ticket.TicketInfo.getCompanyDenomination() {
		return this.companyDenomination;
	}
	public void com.openbravo.pos.ticket.TicketInfo.setCompanyDenomination(String denomination) {
		this.companyDenomination=denomination;
	}
    public String com.openbravo.pos.ticket.TicketInfo.printCompanyDenomination() {
        return this.companyDenomination;
    }
    
	//private String com.openbravo.pos.ticket.TicketInfo.companyDenomination="1";
    private String com.openbravo.pos.ticket.TicketInfo.companyInstallation;
	public String com.openbravo.pos.ticket.TicketInfo.getCompanyInstallation() {
		return this.companyInstallation;
	}
	public void com.openbravo.pos.ticket.TicketInfo.setCompanyInstallation(String installation) {
		this.companyInstallation=installation;
	}
    public String com.openbravo.pos.ticket.TicketInfo.printCompanyInstallation() {
        return this.companyInstallation;
    }
    
    // CAMPOS DA TABELA SIGNATURES
	// Vamos acrescentar um campo na classe TicketInfo para que seja possivel usar o STAMP da assinatura na impressao do recibo....
	// SIGNATURES.STAMP
	//private String com.openbravo.pos.ticket.TicketInfo.companyCity="Cidade";
    private String com.openbravo.pos.ticket.TicketInfo.signatureStamp;
	public String com.openbravo.pos.ticket.TicketInfo.getStamp() {
		return this.signatureStamp;
	}
	public void com.openbravo.pos.ticket.TicketInfo.setStamp(String stamp) {
		this.signatureStamp=stamp;
	}
    public String com.openbravo.pos.ticket.TicketInfo.printStamp() {
        return this.signatureStamp;
    }
    
    // SIGNATURES.INVOICENO
    // Vamos acrescentar um campo na classe TicketInfo para o InvoiceNo
	//private String com.openbravo.pos.ticket.TicketInfo.invoiceNo="REC 1/1";
	private String com.openbravo.pos.ticket.TicketInfo.documentNo;
	public String com.openbravo.pos.ticket.TicketInfo.getDocumentNo() {

		// Este metodo nunca pode alterar o campo, apenas serve para devolver se ja foi inicializado
		// ou gerar uma identificacao dinamicamente
		
		boolean gerar=false;
		
		// Condicao de inicial a referencia de forma a manter a compatibilidade do que esta para tras
		if (this.documentNo.isEmpty()) {
			gerar=true;  // ainda nao tem valor nenhum pelo que nao sabemos se e' antiga ou nova....
		}
		else {
			// se foi inicializada com algo que e' apenas um numero entao e' um documento antigo e vamos transformar num novo
			Integer numero=-1;
			
			try {
				numero=Integer.parseInt(documentNo);
			}
			catch (NumberFormatException ex) {
				// deu uma excecao pelo que ja deve estar no formato novo
				numero=-1;
			}
			
			if (numero!=-1) gerar=true;	// esta inicializado mas no formato antigo
		}

		if (gerar) {

			// Se foi lido da base de dados ele ja esta inicializado, caso contrario...
			// ...ainda nao inicializado... vamos inicializar
			
			// numero no formato antigo... vamos converter para o novo formato
			String docId="";
			switch (this.getTicketType()) {
			case pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_NORMAL:
				// docId="REC ";
				docId=StringConstants.getString(StringEnumerates.REC_);
				break;
			case pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_REFUND:
				// docId="DEV ";
				docId=StringConstants.getString(StringEnumerates.DEV_);
				break;
			case pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_PAYMENT:
				// docId="PAG ";
				docId=StringConstants.getString(StringEnumerates.PAG_);
				break;
		    // Para taloes de consulta de mesa (preview) 
			case pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_PREVIEW:
				// docId="CON ";
				docId=StringConstants.getString(StringEnumerates.CON_);
				break;
		    // Para faturas 
			case pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_INVOICE:
				// docId="FAT ";
				docId=StringConstants.getString(StringEnumerates.FAT_);
				break;
			}
			
			// vamos acrescentar a serie que vai ser o numero de instalacao....
			// docId=docId+CompanyGlobal.getCompanyGlobal().getInstallation()+"/"+Integer.valueOf(this.getTicketId()).toString();
			docId=docId+CompanyGlobal.getCompanyGlobal().getInstallation()+StringConstants.getString(StringEnumerates._slash)+Integer.valueOf(this.getTicketId()).toString();

			return docId;
			//this.documentNo=docId;
		}
		else {
			return this.documentNo;
		}
	}
	
	public void com.openbravo.pos.ticket.TicketInfo.setDocumentNo(String iNo) {
		this.documentNo=iNo;
		// Para obrigar a passar pela possivel conversao
		this.getDocumentNo();
	}
    public String com.openbravo.pos.ticket.TicketInfo.printDocumentNo() {
        return this.getDocumentNo();
    }
    
    // Vamos tentar redefinir o printId que e' usado nos templates de documentos. 
    // Se isso for possivel deixa de ser necessario alterar os templates!
	pointcut printId(com.openbravo.pos.ticket.TicketInfo ticket) : target(ticket) && execution(String com.openbravo.pos.ticket.TicketInfo.printId()); 
    
	String around (com.openbravo.pos.ticket.TicketInfo ticket): printId(ticket)  {
    	return ticket.printDocumentNo();
    }    
    
    // SIGNATURES.HASH
    // Vamos acrescentar um campo na classe TicketInfo para o Hash
	//private String com.openbravo.pos.ticket.TicketInfo.hash="0";
	private String com.openbravo.pos.ticket.TicketInfo.hash;
	public String com.openbravo.pos.ticket.TicketInfo.getHash() {
		return this.hash;
	}
	public void com.openbravo.pos.ticket.TicketInfo.setHash(String h) {
		this.hash=h;
	}
    public String com.openbravo.pos.ticket.TicketInfo.printHash() {
        return this.hash;
    }

    // SIGNATURES.INVOICEDATE
    // InvoiceDate
    private Date com.openbravo.pos.ticket.TicketInfo.invoiceDate;
	public Date com.openbravo.pos.ticket.TicketInfo.getInvoiceDate() {
		return this.invoiceDate;
	}
	public void com.openbravo.pos.ticket.TicketInfo.setInvoiceDate(Date p) {
		this.invoiceDate=p;
	}
    public String com.openbravo.pos.ticket.TicketInfo.printInvoiceDate() {
        return "";  // e necessario formatar a data
    }

    // SIGNATURES.SYSTEMENTRYDATE
    // SystemEntryDate
    private Date com.openbravo.pos.ticket.TicketInfo.systemEntryDate;
	public Date com.openbravo.pos.ticket.TicketInfo.getSystemEntryDate() {
		return this.systemEntryDate;
	}
	public void com.openbravo.pos.ticket.TicketInfo.setSystemEntryDate(Date p) {
		this.systemEntryDate=p;
	}
    public String com.openbravo.pos.ticket.TicketInfo.printSystemEntryDate() {
        return "";  // e necessario formatar a data
    }

    // SIGNATURES.GROSSTOTAL
    // GrossTotal
    private double com.openbravo.pos.ticket.TicketInfo.grossTotal;
	
    public double com.openbravo.pos.ticket.TicketInfo.getGrossTotal() {
		return this.grossTotal;
	}
	
	public void com.openbravo.pos.ticket.TicketInfo.setGrossTotal(double p) {
		this.grossTotal=p;
	}
	
    public String com.openbravo.pos.ticket.TicketInfo.printGrossTotal() {
        return "";  // e necessario formatar a data
    }

    // SIGNATURES.SOURCE
    // Source
    private String com.openbravo.pos.ticket.TicketInfo.source;
	public String com.openbravo.pos.ticket.TicketInfo.getSource() {
		return this.source;
	}
	public void com.openbravo.pos.ticket.TicketInfo.setSource(String p) {
		this.source=p;
	}
    public String com.openbravo.pos.ticket.TicketInfo.printSource() {
        return this.source;  
    }

    // SIGNATURES.SIGNATURE
    // Signature
    private String com.openbravo.pos.ticket.TicketInfo.signature;
	public String com.openbravo.pos.ticket.TicketInfo.getSignature() {
		return this.signature;
	}
	public void com.openbravo.pos.ticket.TicketInfo.setSignature(String p) {
		this.signature=p;
	}
    public String com.openbravo.pos.ticket.TicketInfo.printSignature() {
        return this.signature;  // e necessario formatar a data
    }    

    // SIGNATURES.KEYVERSION
    // KeyVersion
    private String com.openbravo.pos.ticket.TicketInfo.keyVersion;
	public String com.openbravo.pos.ticket.TicketInfo.getKeyVersion() {
		return this.keyVersion;
	}
	
	public void com.openbravo.pos.ticket.TicketInfo.setKeyVersion(String p) {
		this.keyVersion=p;
	}
	
    public String com.openbravo.pos.ticket.TicketInfo.printKeyVersion() {
        return this.keyVersion;  // e necessario formatar a data
    }       

    // SIGNATURES.REFERENCE
    // reference
    // Para que as devolucoes possam guardar a referencia da factura original
    //private String com.openbravo.pos.ticket.TicketInfo.reference="";
    private String com.openbravo.pos.ticket.TicketInfo.reference;
    public String com.openbravo.pos.ticket.TicketInfo.getReference() {
		return this.reference;
	}
	
	public void com.openbravo.pos.ticket.TicketInfo.setReference(String p) {
		this.reference=p;
	}
	
    public String com.openbravo.pos.ticket.TicketInfo.printReference() {
        return this.reference;  
    }   
    
    // SIGNATURES.CUSTOMERNAME
    private String com.openbravo.pos.ticket.TicketInfo.customerName;
    public String com.openbravo.pos.ticket.TicketInfo.getCustomerName() {
		return this.customerName;
	}
	
	public void com.openbravo.pos.ticket.TicketInfo.setCustomerName(String p) {
		this.customerName=p;
	}
	
    public String com.openbravo.pos.ticket.TicketInfo.printCustomerName() {
        return this.customerName;  
    }   
    
    // SIGNATURES.CUSTOMERTAXID
    private String com.openbravo.pos.ticket.TicketInfo.customerTaxID;
    public String com.openbravo.pos.ticket.TicketInfo.getCustomerTaxID() {
		return this.customerTaxID;
	}
	
	public void com.openbravo.pos.ticket.TicketInfo.setCustomerTaxID(String p) {
		this.customerTaxID=p;
	}
	
    public String com.openbravo.pos.ticket.TicketInfo.printCustomerTaxID() {
        return this.customerTaxID;  
    }   

    // SIGNATURES.CUSTOMERADDRESS
    private String com.openbravo.pos.ticket.TicketInfo.customerAddress;
    public String com.openbravo.pos.ticket.TicketInfo.getCustomerAddress() {
		return this.customerAddress;
	}
	
	public void com.openbravo.pos.ticket.TicketInfo.setCustomerAddress(String p) {
		this.customerAddress=p;
	}
	
    public String com.openbravo.pos.ticket.TicketInfo.printCustomerAddress() {
        return this.customerAddress;  
    }   
    
    // SIGNATURES.CUSTOMERPOSTAL
    private String com.openbravo.pos.ticket.TicketInfo.customerPostal;
    public String com.openbravo.pos.ticket.TicketInfo.getCustomerPostal() {
		return this.customerPostal;
	}
	
	public void com.openbravo.pos.ticket.TicketInfo.setCustomerPostal(String p) {
		this.customerPostal=p;
	}
	
    public String com.openbravo.pos.ticket.TicketInfo.printCustomerPostal() {
        return this.customerPostal;  
    }   

    // SIGNATURES.CUSTOMERCITY
    private String com.openbravo.pos.ticket.TicketInfo.customerCity;
    public String com.openbravo.pos.ticket.TicketInfo.getCustomerCity() {
		return this.customerCity;
	}
	
	public void com.openbravo.pos.ticket.TicketInfo.setCustomerCity(String p) {
		this.customerCity=p;
	}
	
    public String com.openbravo.pos.ticket.TicketInfo.printCustomerCity() {
        return this.customerCity;  
    }   

    // SIGNATURES.PLACE
    private String com.openbravo.pos.ticket.TicketInfo.place;
    public String com.openbravo.pos.ticket.TicketInfo.getPlace() {
		return this.place;
	}
	
	public void com.openbravo.pos.ticket.TicketInfo.setPlace(String p) {
		this.place=p;
	}
	
    public String com.openbravo.pos.ticket.TicketInfo.printPlace() {
        return this.place;  
    }   
    
    //-----------------------------------------------------------------------
    // Temporariamente guardar o total do recibo para validar as devolucoes
    private double com.openbravo.pos.ticket.TicketInfo.originalReceiptValue;
    public double com.openbravo.pos.ticket.TicketInfo.getOriginalReceiptValue() {
		return this.originalReceiptValue;
	}
	
	public void com.openbravo.pos.ticket.TicketInfo.setOriginalReceiptValue(double p) {
		this.originalReceiptValue=p;
	}
	

	// Garantir que quando se atribui um cliente ao ticket os campos de cliente de "signatures" sao actualizados!
	//     public void setCustomer(CustomerInfoExt value) {
	pointcut setCustomer(com.openbravo.pos.ticket.TicketInfo ticket, CustomerInfoExt value) : target(ticket) && args(value) && call(void com.openbravo.pos.ticket.TicketInfo.setCustomer(CustomerInfoExt)); 

	void around (com.openbravo.pos.ticket.TicketInfo ticket, CustomerInfoExt value): setCustomer(ticket, value)  {
		//System.out.println("around setCustomer");
		
		if (value!=null) {
			ticket.setCustomerName(value.getName());
			ticket.setCustomerTaxID(value.getTaxid());
			ticket.setCustomerAddress(value.getAddress());
			ticket.setCustomerPostal(value.getPostal());
			ticket.setCustomerCity(value.getCity());
		}
		
		proceed(ticket, value);
	}
    
    //-----------------------------------------------
	// Garantir a inicializacao dos dados da companhia em todos os tickets
	//pointcut newTicketInfo() : call(com.openbravo.pos.ticket.TicketInfo.new()); 
	pointcut newTicketInfo(com.openbravo.pos.ticket.TicketInfo newTicket) : this(newTicket) && initialization(com.openbravo.pos.ticket.TicketInfo.new()); 

	// com.openbravo.pos.ticket.TicketInfo around (): newTicketInfo()  {
	after(com.openbravo.pos.ticket.TicketInfo tinfo): newTicketInfo(tinfo)  {
		//com.openbravo.pos.ticket.TicketInfo tinfo=proceed();

		// Dados globais da empresa....
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
        tinfo.setCompanyAddress(cg.getAddress());
        tinfo.setCompanyCity(cg.getCity());
        tinfo.setCompanyName(cg.getName());
        tinfo.setCompanyPostal(cg.getPostal());
        tinfo.setCompanyTaxID(cg.getTaxID());
        tinfo.setCompanyDenomination(cg.getDenomination());
        tinfo.setCompanyInstallation(cg.getInstallation());
        
        // mais inicializacoes
        tinfo.setReference("");
        tinfo.setHash(StringConstants.getString(StringEnumerates._0));
        
        // Como inicializar os dados do cliente?
        tinfo.setCustomerName("");
        tinfo.setCustomerTaxID("");
        tinfo.setCustomerAddress("");
        tinfo.setCustomerPostal("");
        tinfo.setCustomerCity("");
        
        // A mesa do recibo
        tinfo.setPlace("");

        // inicializar lista de linhas removidas
        tinfo.m_remLines=new ArrayList<com.openbravo.pos.ticket.TicketLineInfo>();
        
        tinfo.ticketTaxesListInit();	// (ATB)(2012-12-10)
        
        // Foi criado um ticket novo. o Seu Invoice number deve ser inicializado
        tinfo.setDocumentNo("");

		//return tinfo;
	}
	
	// Para nao aparecerem valores negativos na impressao dos taloes (na devolucoes)
    public String com.openbravo.pos.ticket.TicketInfo.printSubTotalAbs() {
        return Formats.CURRENCY.formatValue(new Double(Math.abs(getSubTotal())));
    }

    public String com.openbravo.pos.ticket.TicketInfo.printTaxAbs() {
        return Formats.CURRENCY.formatValue(new Double(Math.abs(getTax())));
    }
    
    public String com.openbravo.pos.ticket.TicketInfo.printTotalAbs() {
        return Formats.CURRENCY.formatValue(new Double(Math.abs(getTotal())));
    }

    public String com.openbravo.pos.ticket.TicketInfo.printTotalPaidAbs() {
        return Formats.CURRENCY.formatValue(new Double(Math.abs(getTotalPaid())));
    }

    public String com.openbravo.pos.ticket.TicketInfo.printArticlesCountAbs() {
        return Formats.DOUBLE.formatValue(new Double(Math.abs(getArticlesCount())));
    }
    
    /*
     * Remover o status de todas as linhas para '=' 
     */
    public void com.openbravo.pos.ticket.TicketInfo.resetStatus() {
    	for (com.openbravo.pos.ticket.TicketLineInfo line: this.getLines()) {
    		line.setLineStatus(StringConstants.getString(StringEnumerates._equal));
    	}
    }
    
    /*
     * Novo atributo para conter as linhas removidas enquanto nao sao impressas as
     * ordens na cozinha
     */
    private List<com.openbravo.pos.ticket.TicketLineInfo> com.openbravo.pos.ticket.TicketInfo.m_remLines;
    
    public void com.openbravo.pos.ticket.TicketInfo.addRemovedLine(com.openbravo.pos.ticket.TicketLineInfo line) {
    	if (this.m_remLines==null) m_remLines=new ArrayList<com.openbravo.pos.ticket.TicketLineInfo>();
    	this.m_remLines.add(line);
    }
    
    public void com.openbravo.pos.ticket.TicketInfo.emptyRemovedLines() {
    	if (this.m_remLines==null) m_remLines=new ArrayList<com.openbravo.pos.ticket.TicketLineInfo>();
    	else this.m_remLines.clear();
    }
      
    public List<com.openbravo.pos.ticket.TicketLineInfo> com.openbravo.pos.ticket.TicketInfo.getRemovedLines() {
    	if (this.m_remLines==null) m_remLines=new ArrayList<com.openbravo.pos.ticket.TicketLineInfo>();
    	return this.m_remLines;
    }
    
    public void com.openbravo.pos.ticket.TicketInfo.setRemovedLines(List<com.openbravo.pos.ticket.TicketLineInfo> lines) {
    	m_remLines=lines;
    }    

    public static final int RECEIPT_NORMAL = 0;
    public static final int RECEIPT_REFUND = 1;
    public static final int RECEIPT_PAYMENT = 2;

    // Para taloes de consulta de mesa (preview) 
    public final static int RECEIPT_PREVIEW = 3; 

    // Para faturas 
    public final static int RECEIPT_INVOICE = 4; 
    
    // Para obter a identifcacao do tickt de acordo com as regras do SAFT
//	public String com.openbravo.pos.ticket.TicketInfo.getSAFTID() {
//		String id="";
//		
//		switch this.getInvoiceNo()
//		return this.source;
//	}
    

    public void com.openbravo.pos.ticket.TicketInfo.newId() {
    	m_sId = UUID.randomUUID().toString();
    }
    
    // Completar o copyTicket
	//pointcut copyTicket(com.openbravo.pos.ticket.TicketInfo ticket) : target(ticket) && call(com.openbravo.pos.ticket.TicketInfo com.openbravo.pos.ticket.TicketInfo.copyTicket()); 
    pointcut copyTicket(com.openbravo.pos.ticket.TicketInfo ticket) : target(ticket) && call(com.openbravo.pos.ticket.TicketInfo *.copyTicket()); 

    com.openbravo.pos.ticket.TicketInfo around(com.openbravo.pos.ticket.TicketInfo ticket): copyTicket(ticket)  {
		//System.out.println("Antes do copyTicket");
    	
    	com.openbravo.pos.ticket.TicketInfo newTicket=proceed(ticket);
    	
		//System.out.println("Depois do copyTicket");    	
		
		// copiar os campos em falta - Para ja so a referencia
    	newTicket.setReference(ticket.getReference());
    	newTicket.setCustomerName(ticket.getCustomerName());
    	newTicket.setCustomerTaxID(ticket.getCustomerTaxID());
    	newTicket.setCustomerAddress(ticket.getCustomerAddress());
    	newTicket.setCustomerPostal(ticket.getCustomerPostal());
    	newTicket.setCustomerCity(ticket.getCustomerCity());
    	
    	newTicket.setPlace(ticket.getPlace());

		return newTicket;
	}

    // Para suportar a serializacao dos campos acrescentados pelo aspecto
    //     public void writeExternal(ObjectOutput out) throws IOException {
    pointcut writeExternal(com.openbravo.pos.ticket.TicketInfo ticket, ObjectOutput out) : target(ticket) && args(out) && execution(void *.writeExternal(ObjectOutput)); 
    
    void around(com.openbravo.pos.ticket.TicketInfo ticket, ObjectOutput out) throws IOException: writeExternal(ticket, out)  {
		//System.out.println("Antes de writeExternal");
    	
    	proceed(ticket, out);
    	
    	out.writeObject(ticket.getReference());
        out.writeObject(ticket.getRemovedLines());
        out.writeObject(ticket.getCustomerName());
        out.writeObject(ticket.getCustomerTaxID());
        out.writeObject(ticket.getCustomerAddress());
        out.writeObject(ticket.getCustomerPostal());
        out.writeObject(ticket.getCustomerCity());
        
        out.writeObject(ticket.getPlace());        
    	
		//System.out.println("Depois de writeExternal");    	
		
	}

    //     public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    pointcut readExternal(com.openbravo.pos.ticket.TicketInfo ticket, ObjectInput in) : target(ticket) && args(in) && execution(void *.readExternal(ObjectInput));
    
    void around(com.openbravo.pos.ticket.TicketInfo ticket, ObjectInput in) throws IOException, ClassNotFoundException: readExternal(ticket, in)  {
		//System.out.println("Antes de readExternal");
    	
    	proceed(ticket, in);
    	
    	//out.writeObject(ticket.getReference());
    	ticket.setReference((String) in.readObject());
    	ticket.setRemovedLines((List<TicketLineInfo>) in.readObject());
        ticket.setCustomerName((String) in.readObject());
        ticket.setCustomerTaxID((String) in.readObject());
        ticket.setCustomerAddress((String) in.readObject());
        ticket.setCustomerPostal((String) in.readObject());
        ticket.setCustomerCity((String) in.readObject());
        
        ticket.setPlace((String) in.readObject());
        
        //m_aLines = (List<TicketLineInfo>) in.readObject();
    	
		//System.out.println("Depois de readExternal");    	
		
	}
    
    // Para ja isto esta desactivado: INICIO
    // Por causa do calculo adequado do IVA quando o preco dos produtos tem por base o PVP
    public TicketTaxInfo[] com.openbravo.pos.ticket.TicketInfo.getTaxLines2() {

        Map<String, TicketTaxInfo> m = new HashMap<String, TicketTaxInfo>();

        TicketLineInfo oLine;
        for (Iterator<TicketLineInfo> i = m_aLines.iterator(); i.hasNext();) {
            oLine = i.next();

            TicketTaxInfo t = m.get(oLine.getTaxInfo().getId());
            if (t == null) {
                t = new TicketTaxInfo(oLine.getTaxInfo());
                m.put(t.getTaxInfo().getId(), t);
            }
            //t.add(oLine.getSubValue());
            t.addPartial(oLine.getPrice()*oLine.getMultiply(),   // preco base que se multiplica pela quantidade
            		oLine.getTax());			// getTax e o IVA de cada unidade multiplicado pelo numero de unidades

        }

        // return dSuma;       
        Collection<TicketTaxInfo> avalues = m.values();
        return avalues.toArray(new TicketTaxInfo[avalues.size()]);
    }    
    
    /*
    pointcut getTaxLinesPointcut(com.openbravo.pos.ticket.TicketInfo ticket) : target(ticket) && execution(com.openbravo.pos.ticket.TicketTaxInfo[] com.openbravo.pos.ticket.TicketInfo.getTaxLines()); 
    
    com.openbravo.pos.ticket.TicketTaxInfo[] around(com.openbravo.pos.ticket.TicketInfo ticket) : getTaxLinesPointcut(ticket) {
    	return ticket.getTaxLines2();
    }  
    */
    // Para ja isto esta desactivado: FIM
    
    //-----------------------------------------------
    // Acrescentar metodos para ajudar na impressao do detalhe dos impostos nos tickets...
    private ArrayList<String> com.openbravo.pos.ticket.TicketInfo.ticketTaxesList;

    public void com.openbravo.pos.ticket.TicketInfo.ticketTaxesListInit() {
    	this.ticketTaxesList=null;
    }

    
    public int com.openbravo.pos.ticket.TicketInfo.ticketTaxesListEmpty() {
    	if (this.ticketTaxesList==null) this.ticketTaxesList=new ArrayList<String>();
    	return 0;
    }

    public String com.openbravo.pos.ticket.TicketInfo.ticketTaxesListAdd(String taxID) {
    	// String order="0";
    	String order=StringConstants.getString(StringEnumerates._0);
    	
    	int index=0;
    	if (this.ticketTaxesList==null) this.ticketTaxesList=new ArrayList<String>();
    	
    	// Se o taxID nao existe vamos adiciona-lo
    	if (!this.ticketTaxesList.contains(taxID)) {
    		// vamos acrescentar 'a lista...
    		this.ticketTaxesList.add(taxID);
    	}

    	// vamos retornar a ordem... sera com base no caractera 'a' e depois sucessivamente...
    	index=this.ticketTaxesList.indexOf(taxID);	
    	order=Integer.toString(index);
    	
    	return Character.toString((char)((int)'a'+index));
    }
}
