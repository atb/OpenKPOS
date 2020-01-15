/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import java.util.ArrayList;
import java.util.List;

import pt.ktc.openk.pos.company.CompanyGlobal;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.Datas;
import com.openbravo.data.loader.SerializerReadBasic;
import com.openbravo.data.loader.SerializerReadClass;
import com.openbravo.data.loader.SerializerWriteString;
import com.openbravo.data.loader.StaticSentence;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.panels.PaymentsModel;
import com.openbravo.pos.panels.PaymentsModel.SalesLine;

public privileged aspect PaymentsModelAspect {
	
	// Nao podemos permitir que as consultas de mesa entrem nos pagamentos!
    public static PaymentsModel com.openbravo.pos.panels.PaymentsModel.loadInstance2(AppView app) throws BasicException {
        
        PaymentsModel p = new PaymentsModel();
        
        // Propiedades globales
        p.m_sHost = app.getProperties().getHost();
        p.m_iSeq = app.getActiveCashSequence();
        p.m_dDateStart = app.getActiveCashDateStart();
        p.m_dDateEnd = null;
                
        // Pagos
        Object[] valtickets = (Object []) new StaticSentence(app.getSession()
            , StringConstants.getString(StringEnumerates.SELECT_COUNT_____SUM_PAYMENTS_TOTAL__) +
              StringConstants.getString(StringEnumerates._FROM_PAYMENTS__RECEIPTS) +
              StringConstants.getString(StringEnumerates._WHERE_PAYMENTS_RECEIPT___RECEIPTS_ID_AND_RECEIPTS_MONEY____)
            , SerializerWriteString.INSTANCE
            , new SerializerReadBasic(new Datas[] {Datas.INT, Datas.DOUBLE}))
            .find(app.getActiveCashIndex());
            
        if (valtickets == null) {
            p.m_iPayments = new Integer(0);
            p.m_dPaymentsTotal = new Double(0.0);
        } else {
            p.m_iPayments = (Integer) valtickets[0];
            p.m_dPaymentsTotal = (Double) valtickets[1];
        }  
        
        List l = new StaticSentence(app.getSession()            
            , StringConstants.getString(StringEnumerates.SELECT_PAYMENTS_PAYMENT__SUM_PAYMENTS_TOTAL__) +
              StringConstants.getString(StringEnumerates._FROM_PAYMENTS__RECEIPTS_) +
              StringConstants.getString(StringEnumerates._WHERE_PAYMENTS_RECEIPT___RECEIPTS_ID_AND_RECEIPTS_MONEY_____) +
              StringConstants.getString(StringEnumerates._GROUP_BY_PAYMENTS_PAYMENT)
            , SerializerWriteString.INSTANCE
            , new SerializerReadClass(PaymentsModel.PaymentsLine.class)) //new SerializerReadBasic(new Datas[] {Datas.STRING, Datas.DOUBLE}))
            .list(app.getActiveCashIndex()); 
        
        if (l == null) {
            p.m_lpayments = new ArrayList();
        } else {
            p.m_lpayments = l;
        }        
        
         // Sales
        Object[] recsales = (Object []) new StaticSentence(app.getSession(),
//            "SELECT COUNT(DISTINCT RECEIPTS.ID), SUM(TICKETLINES.UNITS * TICKETLINES.PRICE) " +
//            "FROM RECEIPTS, TICKETLINES WHERE RECEIPTS.ID = TICKETLINES.TICKET AND RECEIPTS.MONEY = ?",
        		StringConstants.getString(StringEnumerates.SELECT_COUNT_DISTINCT_RECEIPTS_ID___SUM_TICKETLINES_UNITS___more) +
        		StringConstants.getString(StringEnumerates._FROM_RECEIPTS__TICKETLINES__TICKETS_WHERE_RECEIPTS_ID___more),
            SerializerWriteString.INSTANCE,
            new SerializerReadBasic(new Datas[] {Datas.INT, Datas.DOUBLE}))
            .find(app.getActiveCashIndex());
        if (recsales == null) {
            p.m_iSales = null;
            p.m_dSalesBase = null;
        } else {
            p.m_iSales = (Integer) recsales[0];
            p.m_dSalesBase = (Double) recsales[1];
        }             
        
        // Taxes
        Object[] rectaxes = (Object []) new StaticSentence(app.getSession(),
        		StringConstants.getString(StringEnumerates.SELECT_SUM_TAXLINES_AMOUNT__) +
        		StringConstants.getString(StringEnumerates._FROM_RECEIPTS__TAXLINES__TICKETS_WHERE_RECEIPTS_ID___TAXLINES_RECEIPT___more)
            , SerializerWriteString.INSTANCE
            , new SerializerReadBasic(new Datas[] {Datas.DOUBLE}))
            .find(app.getActiveCashIndex());            
        if (rectaxes == null) {
            p.m_dSalesTaxes = null;
        } else {
            p.m_dSalesTaxes = (Double) rectaxes[0];
        } 
                
        List<SalesLine> asales = new StaticSentence(app.getSession(),
        		  StringConstants.getString(StringEnumerates.SELECT_TAXCATEGORIES_NAME__SUM_TAXLINES_AMOUNT__) +
        		  StringConstants.getString(StringEnumerates._FROM_RECEIPTS__TAXLINES__TAXES__TAXCATEGORIES__TICKETS_WHERE_RECEIPTS_ID___more) +
        		  StringConstants.getString(StringEnumerates._AND_RECEIPTS_MONEY____) +
        		  StringConstants.getString(StringEnumerates._GROUP_BY_TAXCATEGORIES_NAME)
                , SerializerWriteString.INSTANCE
                , new SerializerReadClass(PaymentsModel.SalesLine.class))
                .list(app.getActiveCashIndex());
        if (asales == null) {
            p.m_lsales = new ArrayList<SalesLine>();
        } else {
            p.m_lsales = asales;
        }
         
        return p;
    }

    //    public List<TicketTaxInfo> calculateTaxes(TicketLineInfo line) throws TaxesException {
    pointcut loadInstancePointcut(AppView app) : args(app) && call(PaymentsModel com.openbravo.pos.panels.PaymentsModel.loadInstance(AppView)); 
    
    PaymentsModel around(AppView app) throws BasicException : loadInstancePointcut(app) {
    	
    	return PaymentsModel.loadInstance2(app);
    } 
    
    // Permitir que os dados da empresa licenciada do OpenK aparecam nos fechos de caixa
	// Vamos acrescentar uns campos ao TicketInfo para conter os dados da empresa para a qual foi instalado o software
	public String com.openbravo.pos.panels.PaymentsModel.getCompanyName() {
		CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getName();
	}
    public String com.openbravo.pos.panels.PaymentsModel.printCompanyName() {
		CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getName();
    }

	//private String com.openbravo.pos.ticket.TicketInfo.companyAddress="Rua da Empresa";
	public String com.openbravo.pos.panels.PaymentsModel.getCompanyAddress() {
		CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getAddress();
	}
    public String com.openbravo.pos.panels.PaymentsModel.printCompanyAddress() {
		CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getAddress();
    }

	//private String com.openbravo.pos.ticket.TicketInfo.companyTaxID="555666777";
	public String com.openbravo.pos.panels.PaymentsModel.getCompanyTaxID() {
		CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getTaxID();
	}
    public String com.openbravo.pos.panels.PaymentsModel.printCompanyTaxID() {
		CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getTaxID();
    }

	//private String com.openbravo.pos.ticket.TicketInfo.companyPostal="5555-666";
	public String com.openbravo.pos.panels.PaymentsModel.getCompanyPostal() {
		CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getPostal();
	}
    public String com.openbravo.pos.panels.PaymentsModel.printCompanyPostal() {
		CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getPostal();
    }

	//private String com.openbravo.pos.ticket.TicketInfo.companyCity="Cidade";
 	public String com.openbravo.pos.panels.PaymentsModel.getCompanyCity() {
		CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getCity();
	}
    public String com.openbravo.pos.panels.PaymentsModel.printCompanyCity() {
		CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getCity();
    }
    
	//private String com.openbravo.pos.ticket.TicketInfo.companyDenomination="Colegio KTC";
	public String com.openbravo.pos.panels.PaymentsModel.getCompanyDenomination() {
		CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getDenomination();
	}

	public String com.openbravo.pos.panels.PaymentsModel.printCompanyDenomination() {
		CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getDenomination();
    }
    
	//private String com.openbravo.pos.ticket.TicketInfo.companyDenomination="1";
	public String com.openbravo.pos.panels.PaymentsModel.getCompanyInstallation() {
		CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getInstallation();
	}

	public String com.openbravo.pos.panels.PaymentsModel.printCompanyInstallation() {
		CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getInstallation();
    }

}
