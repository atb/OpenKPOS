/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.aspects;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.UUID;

import pt.ktc.openk.pos.company.Company;
import pt.ktc.openk.pos.company.CompanyGlobal;
import pt.ktc.openk.pos.panels.ProductsSalesInfo;
import pt.ktc.openk.pos.saft.Signature;
//import pt.ktc.openk.pos.security.Cipher;
import pt.ktc.openk.pos.security.Cipher2;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataParams;
import com.openbravo.data.loader.Datas;
import com.openbravo.data.loader.PreparedSentence;
import com.openbravo.data.loader.QBFBuilder;
import com.openbravo.data.loader.SentenceExec;
import com.openbravo.data.loader.SentenceList;
import com.openbravo.data.loader.SerializerReadClass;
import com.openbravo.data.loader.SerializerReadString;
import com.openbravo.data.loader.SerializerWriteBasic;
import com.openbravo.data.loader.SerializerWriteBuilder;
import com.openbravo.data.loader.SerializerWriteParams;
import com.openbravo.data.loader.SerializerWriteString;
import com.openbravo.data.loader.Session;
import com.openbravo.data.loader.StaticSentence;
import com.openbravo.data.loader.TableDefinition;
import com.openbravo.data.loader.Transaction;
import com.openbravo.format.Formats;
import com.openbravo.pos.inventory.MovementReason;
import com.openbravo.pos.payment.PaymentInfo;
import com.openbravo.pos.payment.PaymentInfoTicket;
import com.openbravo.pos.ticket.FindTicketsInfo;
import com.openbravo.pos.ticket.TicketInfo;
import com.openbravo.pos.ticket.TicketLineInfo;
import com.openbravo.pos.ticket.TicketTaxInfo;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.data.loader.SerializerReadDouble;
import pt.ktc.openk.pos.ticket.FindTicketsInfo2;


public privileged aspect DataLogicSales {
	

	
	//------------------------------------------------------------------
	
	public Session com.openbravo.pos.forms.DataLogicSales.getSession() {
		return s;
	}

	 
    public Company com.openbravo.pos.forms.DataLogicSales.loadCompany() throws BasicException {
        return (Company) new PreparedSentence(s
                , StringConstants.getString(StringEnumerates.SELECT_ID__NAME__ADDRESS__TAXID__POSTAL__CITY__REGION__COUNTRY__BUSINESSREG_FROM_COMPANY_LIMIT_1)
                , null
                , new SerializerReadClass(Company.class)).find();
    }

    // Para suportar os descontos
    @SuppressWarnings("unchecked")
	public final TicketInfo loadTicket2(com.openbravo.pos.forms.DataLogicSales dls, final int tickettype, final int ticketid) throws BasicException {
    	
        TicketInfo ticket = (TicketInfo) new PreparedSentence(dls.getSession()
                , StringConstants.getString(StringEnumerates.SELECT_T_ID__T_TICKETTYPE__T_TICKETID__R_DATENEW__R_MONEY___etc)
                , SerializerWriteParams.INSTANCE
                , new SerializerReadClass(TicketInfo.class))
                .find(new DataParams() { public void writeValues() throws BasicException {
                    setInt(1, tickettype);
                    setInt(2, ticketid);
                }});
        if (ticket != null) {

            String customerid = ticket.getCustomerId();
            ticket.setCustomer(customerid == null
                    ? null
                    : dls.loadCustomerExt(customerid));

            // Acrescentar suporte para o desconto
            ticket.setLines(new PreparedSentence(dls.getSession()
                , StringConstants.getString(StringEnumerates.SELECT_L_TICKET__L_LINE__L_PRODUCT__L_ATTRIBUTESETINSTANCE_ID___etc) +
                  StringConstants.getString(StringEnumerates._FROM_TICKETLINES_L__TAXES_T_WHERE___more)
                , SerializerWriteString.INSTANCE
                , new SerializerReadClass(TicketLineInfo.class)).list(ticket.getId()));
            
            ticket.setPayments(new PreparedSentence(dls.getSession()
                , StringConstants.getString(StringEnumerates.SELECT_PAYMENT__TOTAL__TRANSID_FROM_PAYMENTS_WHERE_RECEIPT____)
                , SerializerWriteString.INSTANCE
                , new SerializerReadClass(PaymentInfoTicket.class)).list(ticket.getId()));
        }
        return ticket;
    }


    // Garantir a leitura do campo STAMP na leitura de um tickek
    //     public final TicketInfo loadTicket(final int tickettype, final int ticketid) throws BasicException {
	pointcut loadTicket(com.openbravo.pos.forms.DataLogicSales dls, int tt, int ti) : target(dls) && args(tt, ti) && call(TicketInfo com.openbravo.pos.forms.DataLogicSales.loadTicket(int, int)); 

	TicketInfo around (com.openbravo.pos.forms.DataLogicSales dls, int tt, int ti) throws BasicException: loadTicket(dls, tt, ti)  {
		
		// Vamos chamar a versao original...
		//TicketInfo tinfo=proceed(dls, tt, ti);
		TicketInfo tinfo=loadTicket2(dls, tt, ti);
		
		// ... e agora vamos carregar o Stamp...
		if (tinfo!=null) {
//            String cmd="SELECT STAMP FROM SIGNATURES WHERE TICKETTYPE = "+ tt + " AND TICKETID = "+ ti ;
//
//            PreparedSentence selectSentence=new PreparedSentence(dls.getSession()
//                    , cmd
//                    , null
//                    , SerializerReadString.INSTANCE);
//                            
//            String stamp=(String)selectSentence.find();
//			
//            if (stamp==null) {
//            	//throw new BasicException();
//            	// Nao encontramos STAMP, se calhar foi porque este ainda nao existia!!!
//            }
//            else
//            {
//            	tinfo.setStamp(stamp);
//            }

			String cmd=StringConstants.getString(StringEnumerates.SELECT_ID__TICKETTYPE__TICKETID__INVOICEDATE__SYSTEMENTRYDATE__INVOICENO__GROSSTOTAL___etc)+ tt + StringConstants.getString(StringEnumerates._AND_TICKETID_EQUALS)+ ti ;
			
			            PreparedSentence selectSentence=new PreparedSentence(dls.getSession()
			                    , cmd
			                    , null
			                    , new SerializerReadClass(Signature.class));
			                            
			            Signature sig=(Signature)selectSentence.find();
						
			            if (sig==null) {
			            	//throw new BasicException();
			            	// Nao encontramos STAMP, se calhar foi porque este ainda nao existia!!!
			            }
			            else
			            {
			            	tinfo.setStamp(sig.getStamp());
			            	tinfo.setDocumentNo(sig.getInvoiceNo());		// Apenas se deve usar este metodo aqui e no construtor
			            	tinfo.setHash(sig.getHash());
			            	tinfo.setInvoiceDate(sig.getInvoiceDate());
			            	tinfo.setSystemEntryDate(sig.getSystemEntryDate());
			            	tinfo.setGrossTotal(sig.getGrossTotal());
			            	tinfo.setSource(sig.getSource());
			            	tinfo.setSignature(sig.getSignature());
			            	tinfo.setKeyVersion(sig.getKeyVersion());
			            	tinfo.setReference(sig.getReference());
			            	tinfo.setCustomerName(sig.getCustomerName());
			            	tinfo.setCustomerTaxID(sig.getCustomerTaxID());
			            	tinfo.setCustomerAddress(sig.getCustomerAddress());
			            	tinfo.setCustomerPostal(sig.getCustomerPostal());
			            	tinfo.setCustomerCity(sig.getCustomerCity());
			            	tinfo.setPlace(sig.getPlace());
			            }
			            
			          // Vamos acrescentar os dados da empresa:
//			            Company company=dls.loadCompany();
//			            if (company==null) {
//			            	//throw new BasicException();
//			            	// Nao encontramos STAMP, se calhar foi porque este ainda nao existia!!!
//			            }
//			            else
//			            {
//			            	tinfo.setCompanyName(company.getName());
//			            	tinfo.setCompanyAddress(company.getAddress());
//			            	tinfo.setCompanyTaxID(company.getTaxID());
//			            	tinfo.setCompanyPostal(company.getPostal());
//			            	tinfo.setCompanyCity(company.getCity());
//			            }
			            // Os dados da empresa agora vem do ficheiro de licenca de servicos!!!
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

	
    // Garantir uma nova versao da gravacao do ticket
    
	pointcut saveTicket(com.openbravo.pos.forms.DataLogicSales dls, TicketInfo ti, String loc) : target(dls) && args(ti, loc) && call(void com.openbravo.pos.forms.DataLogicSales.saveTicket(TicketInfo, String)); 
	
	void around (com.openbravo.pos.forms.DataLogicSales dls, TicketInfo ti, String loc) throws BasicException: saveTicket(dls, ti, loc)  {
		//System.out.println("around saveTicket");
		//proceed(ti, loc);
		saveTicket2(dls, ti, loc);
	}
	
    @SuppressWarnings("rawtypes")
	public final void saveTicket2(final com.openbravo.pos.forms.DataLogicSales this2, final TicketInfo ticket, final String location) throws BasicException {

        Transaction t = new Transaction(this2.getSession()) {
            public Object transact() throws BasicException {
            	
            	int originalTicketId=ticket.getTicketId();
       
            	try { 
            		
                if (ticket.getTicketId() == 0) {
    
	                // Vamos 'calcular' o novo id do documento atraves da tabela DOCS_IDS
	                // select last_ticketid from docs_ids where tickettype=0 for update
	                String cmd_docs_ids=StringConstants.getString(StringEnumerates.SELECT_LAST_TICKETID_FROM_DOCS_IDS_WHERE_TICKETTYPE_)+ticket.getTicketType()+StringConstants.getString(StringEnumerates._FOR_UPDATE);
	                
	                PreparedSentence selectSentenceDocsIds=new PreparedSentence(this2.getSession()
	                        , cmd_docs_ids
	                        , null
	                        , SerializerReadString.INSTANCE);
	                                
	                String last_doc_id=(String)selectSentenceDocsIds.find();
	                
	                if (last_doc_id==null) {
	                	throw new BasicException();
	                	//last_doc_id="";
	                }
	                int newDocumentNumber=Integer.parseInt(last_doc_id)+1;
	                //----------------------------------------------------------------
            	
	                // Set Receipt Id
	                ticket.setTicketId(newDocumentNumber);
	                
	                // Vamos actualizar a tabela DOCS_IDS   
	                SentenceExec docs_ids_update = new PreparedSentence(this2.getSession()
	                		, StringConstants.getString(StringEnumerates.UPDATE_DOCS_IDS_SET_LAST_TICKETID___WHERE_TICKETTYPE__)
	                        , SerializerWriteParams.INSTANCE);
	                
	                docs_ids_update.exec(new DataParams() { public void writeValues() throws BasicException {
	                        	setInt(1, ticket.getTicketId()); 
	                        	setInt(2, ticket.getTicketType());
	                        }});                
	                
//                    switch (ticket.getTicketType()) {
//                        case TicketInfo.RECEIPT_NORMAL:
//                            ticket.setTicketId(this2.getNextTicketIndex().intValue());
//                            break;
//                        case TicketInfo.RECEIPT_REFUND:
//                            ticket.setTicketId(this2.getNextTicketRefundIndex().intValue());
//                            break;
//                        case TicketInfo.RECEIPT_PAYMENT:
//                            ticket.setTicketId(this2.getNextTicketPaymentIndex().intValue());
//                            break;
//                        default:
//                            throw new BasicException();
//                    }
                }
                

                 // new receipt
                new PreparedSentence(this2.getSession()
                	, StringConstants.getString(StringEnumerates.INSERT_INTO_RECEIPTS__ID__MONEY__DATENEW__ATTRIBUTES__VALUES_____________)
                    , SerializerWriteParams.INSTANCE	
                    ).exec(new DataParams() { public void writeValues() throws BasicException {
                        setString(1, ticket.getId());
                        setString(2, ticket.getActiveCash());
                        setTimestamp(3, ticket.getDate());
                        try {
                            ByteArrayOutputStream o = new ByteArrayOutputStream();
                            ticket.getProperties().storeToXML(o, AppLocal.APP_NAME, StringConstants.getString(StringEnumerates.UTF_8));
                            setBytes(4, o.toByteArray());
                        } catch (IOException e) {
                            setBytes(4, null);
                        }
                    }});

                // new ticket
                new PreparedSentence(this2.getSession()
                	, StringConstants.getString(StringEnumerates.INSERT_INTO_TICKETS__ID__TICKETTYPE__TICKETID__PERSON__CUSTOMER__VALUES________________)
                    , SerializerWriteParams.INSTANCE
                    ).exec(new DataParams() { public void writeValues() throws BasicException {
                        setString(1, ticket.getId());
                        setInt(2, ticket.getTicketType());
                        setInt(3, ticket.getTicketId());
                        setString(4, ticket.getUser().getId());
                        setString(5, ticket.getCustomerId());
                    }});

                // Proxima instrucao alterada para suportar descontos
                SentenceExec ticketlineinsert = new PreparedSentence(this2.getSession()
                	, StringConstants.getString(StringEnumerates.INSERT_INTO_TICKETLINES__TICKET__LINE__PRODUCT__ATTRIBUTESETINSTANCE_ID__UNITS__PRICE__TAXID__ATTRIBUTES__BASEPRICE__DISCOUNT__VALUES)
                    , SerializerWriteBuilder.INSTANCE);

                for (TicketLineInfo l : ticket.getLines()) {
                    ticketlineinsert.exec(l);
                    if (l.getProductID() != null)  {
                        // update the stock
                        this2.getStockDiaryInsert().exec(new Object[] {
                            UUID.randomUUID().toString(),
                            ticket.getDate(),
                            l.getMultiply() < 0.0
                                ? MovementReason.IN_REFUND.getKey()
                                : MovementReason.OUT_SALE.getKey(),
                            location,
                            l.getProductID(),
                            l.getProductAttSetInstId(),
                            new Double(-l.getMultiply()),
                            new Double(l.getPrice())
                        });
                    }
                }

                SentenceExec paymentinsert = new PreparedSentence(this2.getSession()
                	, StringConstants.getString(StringEnumerates.INSERT_INTO_PAYMENTS__ID__RECEIPT__PAYMENT__TOTAL__TRANSID__RETURNMSG__VALUES)
                    , SerializerWriteParams.INSTANCE);
                for (final PaymentInfo p : ticket.getPayments()) {
                    paymentinsert.exec(new DataParams() { public void writeValues() throws BasicException {
                        setString(1, UUID.randomUUID().toString());
                        setString(2, ticket.getId());
                        setString(3, p.getName());
                        setDouble(4, p.getTotal());
                        setString(5, ticket.getTransactionID());
                        setBytes(6, (byte[]) Formats.BYTEA.parseValue(ticket.getReturnMessage()));
                    }});

                    if (StringConstants.getString(StringEnumerates.debt).equals(p.getName()) || StringConstants.getString(StringEnumerates.debtpaid).equals(p.getName())) {

                        // udate customer fields...
                        ticket.getCustomer().updateCurDebt(p.getTotal(), ticket.getDate());

                        // save customer fields...
                        this2.getDebtUpdate().exec(new DataParams() { public void writeValues() throws BasicException {
                            setDouble(1, ticket.getCustomer().getCurdebt());
                            setTimestamp(2, ticket.getCustomer().getCurdate());
                            setString(3, ticket.getCustomer().getId());
                        }});
                    }
                }

                SentenceExec taxlinesinsert = new PreparedSentence(this2.getSession()
                		, StringConstants.getString(StringEnumerates.INSERT_INTO_TAXLINES__ID__RECEIPT__TAXID__BASE__AMOUNT___VALUES)
                        , SerializerWriteParams.INSTANCE);
                if (ticket.getTaxes() != null) {
                    for (final TicketTaxInfo tickettax: ticket.getTaxes()) {
                        taxlinesinsert.exec(new DataParams() { public void writeValues() throws BasicException {
                            setString(1, UUID.randomUUID().toString());
                            setString(2, ticket.getId());
                            setString(3, tickettax.getTaxInfo().getId());
                            setDouble(4, tickettax.getSubTotal());
                            setDouble(5, tickettax.getTax());
                        }});
                    }
                }
                
                // Vamos testar um insert na tabela "signatures"
                
                // E' necessario ir buscar a assinatura do registo anterior nessa serie...
                
                // Determinar o 'numero' do documento:
                // Vamos desactivar este codigo e invocar o metodo que "calcula" o DocumentNo no TicketInfo
//                String DocNo="";
//                int ticketType=ticket.getTicketType();
//                if (ticketType==pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_NORMAL) {
//                	DocNo=StringConstants.getString(StringEnumerates.REC_1_);				// RECibo
//                }
//                else if (ticketType==pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_REFUND) {
//                	DocNo=StringConstants.getString(StringEnumerates.DEV_1_);				// DEVolucao
//                }
//                else if (ticketType==pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_PAYMENT) {
//                	DocNo=StringConstants.getString(StringEnumerates.PAG_1_);				// PAGamento
//                }
//                else if (ticketType==pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_INVOICE) { 
//                	DocNo=StringConstants.getString(StringEnumerates.FAT_1_);				// Fatura
//                }
//                else {
//                	throw new BasicException();
//                }
//                final String DocNof=DocNo+ticket.getTicketId();
                final String DocNof=ticket.getDocumentNo();			// Este e' o codigo alternativo ao comentario anterior
               	ticket.setDocumentNo(DocNof);						// Este e' o codigo alternativo ao comentario anterior	
                
                //------------------------------------
                // Como aceder 'a assinatura do documento anterior?
                String cmd=StringConstants.getString(StringEnumerates.SELECT_SIGNATURE_FROM_SIGNATURES_WHERE_TICKETTYPE)+ ticket.getTicketType()+ StringConstants.getString(StringEnumerates._AND_TICKETID__)+ ticket.getTicketId() + StringConstants.getString(StringEnumerates._ORDER_BY_TICKETID_DESC_LIMIT_1);

                PreparedSentence selectSentence=new PreparedSentence(this2.getSession()
                        , cmd
                        , null
                        , SerializerReadString.INSTANCE);
                                
                String anterior=(String)selectSentence.find();
                
                if (anterior==null) anterior="";
                
                /* (String) new PreparedSentence(this2.getSession()
                        , c
                        , SerializerWriteString.INSTANCE
                        , new CustomerExtRead()).find(card);                
                */
                //------------------------------------
                
				
				Date d1=ticket.getDate();
				
				java.text.SimpleDateFormat fd1=new SimpleDateFormat(StringConstants.getString(StringEnumerates.yyyy_MM_dd));
				java.text.SimpleDateFormat fd2=new SimpleDateFormat(StringConstants.getString(StringEnumerates.yyyy_MM_dd_T_HH_mm_ss));
				DecimalFormatSymbols dc=new DecimalFormatSymbols();
				dc.setDecimalSeparator('.');
				java.text.DecimalFormat fd=new DecimalFormat(StringConstants.getString(StringEnumerates._0_00__0_00), dc);
				
				// (ATB)(2011-09-27) No caso das devolocoes o valor total e' negativo, no entanto....
				// ... a legislacao nao permite imprimir documentos com valor negativo...
				// ... dai termos de usar o valor absoluto.
				double total=Math.abs(ticket.getTotal());
				
				String temp=fd1.format(d1)+StringConstants.getString(StringEnumerates._semicolon)+fd2.format(d1)+StringConstants.getString(StringEnumerates._semicolon)+DocNof+StringConstants.getString(StringEnumerates._semicolon)+fd.format(total)+StringConstants.getString(StringEnumerates._semicolon)+anterior;

                // Vamos testar uma assinatura hard-coded...
                // 2010-05-18;2010-05-18T11:22:19;FAC 001/14;3.12;
                String assinaturaString="";
                String versao="";
                try {
//					//Cipher c=new Cipher();
//                	Cipher2 c=new Cipher2(this2.getSession());
//					
//					assinaturaString=c.sign(temp);
//					
//					versao=c.getVersion();
//
//					// Vamos simular a verificacao da assinatura....
////					if (c.verify(assinaturaString, temp)) {
////						System.out.println("Igual");
////					}
////					else {
////						System.out.println("Diferente");
////					}

                	// Vamos fazer a cifra sem usar o pljava!!!!
                	pt.ktc.openk.pos.security.CipherInternal c=new pt.ktc.openk.pos.security.CipherInternal();
                	String private_key=StringConstants.getString(StringEnumerates.CHAVE_PRIVADA_1)+
                							StringConstants.getString(StringEnumerates.CHAVE_PRIVADA_2)+
                							StringConstants.getString(StringEnumerates.CHAVE_PRIVADA_3)+
                							StringConstants.getString(StringEnumerates.CHAVE_PRIVADA_4)+
                							StringConstants.getString(StringEnumerates.CHAVE_PRIVADA_5)+
                							StringConstants.getString(StringEnumerates.CHAVE_PRIVADA_6)+
                							StringConstants.getString(StringEnumerates.CHAVE_PRIVADA_7)+
                							StringConstants.getString(StringEnumerates.CHAVE_PRIVADA_8)+
                							StringConstants.getString(StringEnumerates.CHAVE_PRIVADA_9)+
                							StringConstants.getString(StringEnumerates.CHAVE_PRIVADA_10)+
                							StringConstants.getString(StringEnumerates.CHAVE_PRIVADA_11)+
                							StringConstants.getString(StringEnumerates.CHAVE_PRIVADA_12)+
                							StringConstants.getString(StringEnumerates.CHAVE_PRIVADA_13);
                	String public_key=StringConstants.getString(StringEnumerates.CHAVE_PUBLICA_1)+
											StringConstants.getString(StringEnumerates.CHAVE_PUBLICA_2)+
											StringConstants.getString(StringEnumerates.CHAVE_PUBLICA_3)+
											StringConstants.getString(StringEnumerates.CHAVE_PUBLICA_4);
                	
                	assinaturaString=pt.ktc.openk.pos.security.CipherInternal.sign(private_key, public_key, temp);
                	
//                	if (pt.ktc.openk.pos.pljava.Cipher.verify(private_key, public_key, assinaturaString, temp)) {
//                		System.out.println("Igual");
//					}
//					else {
//						System.out.println("Diferente");
//					}
                	
				} catch (Exception e) {
					e.printStackTrace();
					throw new BasicException(); 
				} 

				
				final String assinaturaFinal=assinaturaString;
				final String sourceFinal=temp;
				final String assinaturaAnterior=anterior;
				final String versaoFinal=versao;
				final String stampFinal=assinaturaString.substring(0, 1)+assinaturaString.substring(10, 11)+assinaturaString.substring(20, 21)+assinaturaString.substring(30,31);
                
				// Vamos actualizar o Stamp no ticket
				ticket.setStamp(stampFinal);
				
                SentenceExec signaturesinsert = new PreparedSentence(this2.getSession()
                		, StringConstants.getString(StringEnumerates.INSERT_INTO_SIGNATURES__ID__TICKETTYPE__TICKETID__INVOICEDATE__SYSTEMENTRYDATE__INVOICENO___)
                        , SerializerWriteParams.INSTANCE);
                
                signaturesinsert.exec(new DataParams() { public void writeValues() throws BasicException {
                        	setString(1, ticket.getId());
                        	setInt(2, ticket.getTicketType()); 
                        	setInt(3, ticket.getTicketId());
                        	setTimestamp(4, ticket.getDate());
                        	setTimestamp(5, ticket.getDate());
                        	setString(6, DocNof);
                        	setDouble(7, ticket.getTotal());
                        	setString(8, assinaturaAnterior);
                        	setString(9, sourceFinal);
                        	setString(10, assinaturaFinal);
                        	setString(11, versaoFinal);
                        	setString(12, stampFinal);
                        	setString(13, ticket.getReference());
                        	setString(14, ticket.getCustomerName());
                        	setString(15, ticket.getCustomerTaxID());
                        	setString(16, ticket.getCustomerAddress());
                        	setString(17, ticket.getCustomerPostal());
                        	setString(18, ticket.getCustomerCity());
                        	setString(19, ticket.getPlace());     
                        	//setString(20, ticket.getPlace()); 		// forcar o erro!!
                        }});
                
            	}
            	catch (BasicException e) {
            		ticket.setTicketId(originalTicketId);
            		
            		throw e;
            	}
 
                return null;
            }
        };
        t.execute();
    }
    
    
    // Para suportar os taloes de consulta
    public final Integer com.openbravo.pos.forms.DataLogicSales.getNextTicketPreviewIndex() throws BasicException {
        return (Integer) s.DB.getSequenceSentence(s, StringConstants.getString(StringEnumerates.TICKETSNUM_PREVIEW)).find();
    }
 
    /*
     * Este metodo ja suporta os recibos do tipo consulta
     */
    @SuppressWarnings("rawtypes")
	public static final void saveTicket3(final com.openbravo.pos.forms.DataLogicSales this2, final com.openbravo.pos.ticket.TicketInfo ticket, final String location) throws BasicException {

        Transaction t = new Transaction(this2.getSession()) {
            public Object transact() throws BasicException {
            	
                // Set Receipt Id
                if (ticket.getTicketId() == 0) {
                    switch (ticket.getTicketType()) {
                        case TicketInfo.RECEIPT_NORMAL:
                            ticket.setTicketId(this2.getNextTicketIndex().intValue());
                            break;
                        case TicketInfo.RECEIPT_REFUND:
                            ticket.setTicketId(this2.getNextTicketRefundIndex().intValue());
                            break;
                        case TicketInfo.RECEIPT_PAYMENT:
                            ticket.setTicketId(this2.getNextTicketPaymentIndex().intValue());
                            break;
                        case pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_PREVIEW:   // aparentemente so funciona assim
                        	ticket.setTicketId(this2.getNextTicketPreviewIndex().intValue()); 
                        	break;
//                        case TicketInfo.RECEIPT_PREVIEW: 
//                            ticket.setTicketId(this2.getNextTicketPreviewIndex().intValue());                        	
                        default:
                            throw new BasicException();
                    }
                }

                // new receipt
                new PreparedSentence(this2.getSession()
                	, StringConstants.getString(StringEnumerates.INSERT_INTO_RECEIPTS__ID__MONEY__DATENEW__ATTRIBUTES__VALUES_____________)
                    , SerializerWriteParams.INSTANCE	
                    ).exec(new DataParams() { public void writeValues() throws BasicException {
                        setString(1, ticket.getId());
                        setString(2, ticket.getActiveCash());
                        setTimestamp(3, ticket.getDate());
                        try {
                            ByteArrayOutputStream o = new ByteArrayOutputStream();
                            //ticket.getProperties().storeToXML(o, AppLocal.APP_NAME, "UTF-8");
                            ticket.getProperties().storeToXML(o, AppLocal.APP_NAME, StringConstants.getString(StringEnumerates.UTF_8));
                            setBytes(4, o.toByteArray());
                        } catch (IOException e) {
                            setBytes(4, null);
                        }
                    }});

                // new ticket
                new PreparedSentence(this2.getSession()
                	, StringConstants.getString(StringEnumerates.INSERT_INTO_TICKETS__ID__TICKETTYPE__TICKETID__PERSON__CUSTOMER__VALUES________________)
                    , SerializerWriteParams.INSTANCE
                    ).exec(new DataParams() { public void writeValues() throws BasicException {
                        setString(1, ticket.getId());
                        setInt(2, ticket.getTicketType());
                        setInt(3, ticket.getTicketId());
                        setString(4, ticket.getUser().getId());
                        setString(5, ticket.getCustomerId());
                    }});

                SentenceExec ticketlineinsert = new PreparedSentence(this2.getSession()
                	, StringConstants.getString(StringEnumerates.INSERT_INTO_TICKETLINES__TICKET__LINE__PRODUCT__ATTRIBUTESETINSTANCE_ID__UNITS__PRICE__TAXID__ATTRIBUTES__VALUES___etc)
                    , SerializerWriteBuilder.INSTANCE);

                for (TicketLineInfo l : ticket.getLines()) {
                    ticketlineinsert.exec(l);
                    if (l.getProductID() != null)  {
                        // update the stock
                    	this2.getStockDiaryInsert().exec(new Object[] {
                            UUID.randomUUID().toString(),
                            ticket.getDate(),
                            l.getMultiply() < 0.0
                                ? MovementReason.IN_REFUND.getKey()
                                : MovementReason.OUT_SALE.getKey(),
                            location,
                            l.getProductID(),
                            l.getProductAttSetInstId(),
                            new Double(-l.getMultiply()),
                            new Double(l.getPrice())
                        });
                    }
                }

                SentenceExec paymentinsert = new PreparedSentence(this2.getSession()
                	, StringConstants.getString(StringEnumerates.INSERT_INTO_PAYMENTS__ID__RECEIPT__PAYMENT__TOTAL__TRANSID__RETURNMSG__VALUES)
                    , SerializerWriteParams.INSTANCE);
                for (final PaymentInfo p : ticket.getPayments()) {
                    paymentinsert.exec(new DataParams() { public void writeValues() throws BasicException {
                        setString(1, UUID.randomUUID().toString());
                        setString(2, ticket.getId());
                        setString(3, p.getName());
                        setDouble(4, p.getTotal());
                        setString(5, ticket.getTransactionID());
                        setBytes(6, (byte[]) Formats.BYTEA.parseValue(ticket.getReturnMessage()));
                    }});

                    if (StringConstants.getString(StringEnumerates.debt).equals(p.getName()) || StringConstants.getString(StringEnumerates.debtpaid).equals(p.getName())) {

                        // udate customer fields...
                        ticket.getCustomer().updateCurDebt(p.getTotal(), ticket.getDate());

                        // save customer fields...
                        this2.getDebtUpdate().exec(new DataParams() { public void writeValues() throws BasicException {
                            setDouble(1, ticket.getCustomer().getCurdebt());
                            setTimestamp(2, ticket.getCustomer().getCurdate());
                            setString(3, ticket.getCustomer().getId());
                        }});
                    }
                }

                SentenceExec taxlinesinsert = new PreparedSentence(this2.getSession()
                		, StringConstants.getString(StringEnumerates.INSERT_INTO_TAXLINES__ID__RECEIPT__TAXID__BASE__AMOUNT___VALUES)
                        , SerializerWriteParams.INSTANCE);
                if (ticket.getTaxes() != null) {
                    for (final TicketTaxInfo tickettax: ticket.getTaxes()) {
                        taxlinesinsert.exec(new DataParams() { public void writeValues() throws BasicException {
                            setString(1, UUID.randomUUID().toString());
                            setString(2, ticket.getId());
                            setString(3, tickettax.getTaxInfo().getId());
                            setDouble(4, tickettax.getSubTotal());
                            setDouble(5, tickettax.getTax());
                        }});
                    }
                }
                
                // Vamos testar um insert na tabela "signatures"
                
                // E' necessario ir buscar a assinatura do registo anterior nessa serie...
                
                // Determinar o 'numero' do documento:
                String DocNo="";
                switch (ticket.getTicketType()) {
                	case TicketInfo.RECEIPT_NORMAL:
                		DocNo=StringConstants.getString(StringEnumerates.REC_1_);				// RECibo
                		break;
                	case TicketInfo.RECEIPT_REFUND:
                		DocNo=StringConstants.getString(StringEnumerates.DEV_1_);				// DEVolucao
                		break;
                	case TicketInfo.RECEIPT_PAYMENT:
                		DocNo=StringConstants.getString(StringEnumerates.PAG_1_);				// PAGamento
                		break;
                    case pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_PREVIEW:   // aparentemente so funciona assim
                		DocNo=StringConstants.getString(StringEnumerates.CON_1_);				// CONsulta de mesa = Preview
                		break;                		
                	default:
                		throw new BasicException();
                }
                final String DocNof=DocNo+ticket.getTicketId();
                
                
                //------------------------------------
                // Como aceder 'a assinatura do documento anterior?
                String cmd=StringConstants.getString(StringEnumerates.SELECT_SIGNATURE_FROM_SIGNATURES_WHERE_TICKETTYPE)+ ticket.getTicketType()+ StringConstants.getString(StringEnumerates._AND_TICKETID__)+ ticket.getTicketId() + StringConstants.getString(StringEnumerates._ORDER_BY_TICKETID_DESC_LIMIT_1);

                PreparedSentence selectSentence=new PreparedSentence(this2.getSession()
                        , cmd
                        , null
                        , SerializerReadString.INSTANCE);
                                
                String anterior=(String)selectSentence.find();
                
                if (anterior==null) anterior="";
                
                /* (String) new PreparedSentence(this2.getSession()
                        , c
                        , SerializerWriteString.INSTANCE
                        , new CustomerExtRead()).find(card);                
                */
                //------------------------------------
                
				
				Date d1=ticket.getDate();
				
				java.text.SimpleDateFormat fd1=new SimpleDateFormat(StringConstants.getString(StringEnumerates.yyyy_MM_dd));
				java.text.SimpleDateFormat fd2=new SimpleDateFormat(StringConstants.getString(StringEnumerates.yyyy_MM_dd_T_HH_mm_ss));
				DecimalFormatSymbols dc=new DecimalFormatSymbols();
				dc.setDecimalSeparator('.');
				java.text.DecimalFormat fd=new DecimalFormat(StringConstants.getString(StringEnumerates._0_00__0_00), dc);
				
				// (ATB)(2011-09-27) No caso das devolocoes o valor total e' negativo, no entanto....
				// ... a legislacao nao permite imprimir documentos com valor negativo...
				// ... dai termos de usar o valor absoluto.
				double total=Math.abs(ticket.getTotal());
				
				String temp=fd1.format(d1)+StringConstants.getString(StringEnumerates._semicolon)+fd2.format(d1)+StringConstants.getString(StringEnumerates._semicolon)+DocNof+StringConstants.getString(StringEnumerates._semicolon)+fd.format(total)+StringConstants.getString(StringEnumerates._semicolon)+anterior;

                // Vamos testar uma assinatura hard-coded...
                // 2010-05-18;2010-05-18T11:22:19;FAC 001/14;3.12;
                String assinaturaString="";
                String versao="";
                try {
					//Cipher c=new Cipher();
                	Cipher2 c=new Cipher2(this2.getSession());
					
					assinaturaString=c.sign(temp);
					
					versao=c.getVersion();

					// Vamos simular a verificacao da assinatura....
//					if (c.verify(assinaturaString, temp)) {
//						System.out.println("Igual");
//					}
//					else {
//						System.out.println("Diferente");
//					}
						
					
				} catch (Exception e) {
					e.printStackTrace();
					throw new BasicException(); 
				} 

				
				final String assinaturaFinal=assinaturaString;
				final String sourceFinal=temp;
				final String assinaturaAnterior=anterior;
				final String versaoFinal=versao;
				final String stampFinal=assinaturaString.substring(0, 1)+assinaturaString.substring(10, 11)+assinaturaString.substring(20, 21)+assinaturaString.substring(30,31);
                
				// Vamos actualizar o Stamp no ticket
				ticket.setStamp(stampFinal);
				
                SentenceExec signaturesinsert = new PreparedSentence(this2.getSession()
                		, StringConstants.getString(StringEnumerates.INSERT_INTO_SIGNATURES__ID__TICKETTYPE__TICKETID__INVOICEDATE__SYSTEMENTRYDATE__INVOICENO___)
                        , SerializerWriteParams.INSTANCE);
                
                signaturesinsert.exec(new DataParams() { public void writeValues() throws BasicException {
                        	setString(1, ticket.getId());
                        	setInt(2, ticket.getTicketType()); 
                        	setInt(3, ticket.getTicketId());
                        	setTimestamp(4, ticket.getDate());
                        	setTimestamp(5, ticket.getDate());
                        	setString(6, DocNof);
                        	setDouble(7, ticket.getTotal());
                        	setString(8, assinaturaAnterior);
                        	setString(9, sourceFinal);
                        	setString(10, assinaturaFinal);
                        	setString(11, versaoFinal);
                        	setString(12, stampFinal);
                        	setString(13, ticket.getReference());
                        	setString(14, ticket.getCustomerName());
                        	setString(15, ticket.getCustomerTaxID());
                        	setString(16, ticket.getCustomerAddress());
                        	setString(17, ticket.getCustomerPostal());
                        	setString(18, ticket.getCustomerCity());
                        }});
 
                return null;
            }
        };
        t.execute();
    }

    // Vamos acrescentar um novo metodo ao DataLogicSales
    public SentenceList com.openbravo.pos.forms.DataLogicSales.getTicketsListByDate(Date d1, Date d2) {
    	
    	String strD1;
    	String strD2;
 
		java.text.SimpleDateFormat fd=new SimpleDateFormat(StringConstants.getString(StringEnumerates.yyyy_MM_dd));
		strD1=fd.format(d1);
		strD2=fd.format(d2);
		
		String dbName=CompanyGlobal.getCompanyGlobal().getJRootApp().getSession().DB.getName();

		// Vamos gerar a string de query ja com as datas
		String qry="";
    	//if (dbName.compareTo("PostgreSQL")==0) {
    	if (dbName.compareTo(StringConstants.getString(StringEnumerates.PostgreSQL))==0) {
			qry=StringConstants.getString(StringEnumerates.SELECT_T_TICKETID__T_TICKETTYPE__R_DATENEW__P_NAME___more)+
	    		StringConstants.getString(StringEnumerates._FROM_RECEIPTS_R_JOIN_TICKETS_T_ON_R_ID___T_ID___mores) +
	    		StringConstants.getString(StringEnumerates._WHERE___QBF_FILTER__AND_DATE_TRUNC___more)+strD1+StringConstants.getString(StringEnumerates.____yyyy_mm_dd___AND_DATE_TRUNC__day___more)+strD2+StringConstants.getString(StringEnumerates.____yyyy_mm_dd___GROUP_BY_T_ID___more);
    	}
    	else {
	    	// (ATB)(2012-12-06) O HSQLDB nao suporta a funcao DATE_TRUNC. A funcao TRUNC faza mesma coisa!
    		// Vamos assumir que todas as outras bases de dados funcionam como o HSQLDB
    		qry=StringConstants.getString(StringEnumerates.SELECT_T_TICKETID__T_TICKETTYPE__R_DATENEW__P_NAME___more)+
			StringConstants.getString(StringEnumerates._FROM_RECEIPTS_R_JOIN_TICKETS_T_ON_R_ID___T_ID___mores) +
			StringConstants.getString(StringEnumerates._WHERE___QBF_FILTER__AND_TRUNC_R_DATENEW___DD____TO_DATE__)+strD1+StringConstants.getString(StringEnumerates.____YYYY_MM_DD___AND_TRUNC_R_DATENEW___DD____TO_DATE__)+strD2+StringConstants.getString(StringEnumerates.____YYYY_MM_DD___GROUP_BY_T_ID__T_TICKETID__T_TICKETTYPE__R_DATENEW__P_NAME__C_NAME_ORDER_BY_T_TICKETTYPE__R_DATENEW_ASC);
    	}

//    	public final static int _WHERE___QBF_FILTER__AND_TRUNC_R_DATENEW___DD____TO_DATE__=11600;
//    	public final static int ____yyyy_mm_dd___AND_TRUNC_R_DATENEW___DD____TO_DATE__=11601;
//    	public final static int ____YYYY_MM_DD___GROUP_BY_T_ID__T_TICKETID__T_TICKETTYPE__R_DATENEW__P_NAME__C_NAME_ORDER_BY_T_TICKETTYPE__R_DATENEW_ASC=11602;

    	
    	return new StaticSentence(s
            , new QBFBuilder(qry, new String[] {StringConstants.getString(StringEnumerates.T_TICKETID), StringConstants.getString(StringEnumerates.T_TICKETTYPE), StringConstants.getString(StringEnumerates.PM_TOTAL), StringConstants.getString(StringEnumerates.R_DATENEW), StringConstants.getString(StringEnumerates.R_DATENEW), StringConstants.getString(StringEnumerates.P_NAME), StringConstants.getString(StringEnumerates.C_NAME)})
            , new SerializerWriteBasic(new Datas[] {Datas.OBJECT, Datas.INT, Datas.OBJECT, Datas.INT, Datas.OBJECT, Datas.DOUBLE, Datas.OBJECT, Datas.TIMESTAMP, Datas.OBJECT, Datas.TIMESTAMP, Datas.OBJECT, Datas.STRING, Datas.OBJECT, Datas.STRING})
            , new SerializerReadClass(FindTicketsInfo.class));
    }   
   
    // Vamos acrescentar um novo metodo ao DataLogicSales
    public SentenceList com.openbravo.pos.forms.DataLogicSales.getProductsSalesByDate(Date d1, Date d2) {
    	
    	String strD1;
    	String strD2;
 
		java.text.SimpleDateFormat fd=new SimpleDateFormat(StringConstants.getString(StringEnumerates.simple_date_yyyy_MM_dd_HH_mm_ss));
		strD1=fd.format(d1);
		strD2=fd.format(d2);
		
		String dbName=CompanyGlobal.getCompanyGlobal().getJRootApp().getSession().DB.getName();
 
		// Vamos gerar a string de query ja com as datas
		String qry="";
    	//if (dbName.compareTo("PostgreSQL")==0) {
        if (dbName.compareTo(StringConstants.getString(StringEnumerates.PostgreSQL))==0) {
//    		qry="SELECT PRODUCTS.REFERENCE, PRODUCTS.NAME, (PRODUCTS.PRICESELL*(1+TAXES.RATE)) AS PVPUNIT, SUM(TICKETLINES.UNITS) AS UNITS, "+
//    		     "SUM(TICKETLINES.UNITS * (TICKETLINES.PRICE*(1+TAXES.RATE))) AS TOTALPVP "+
//    		     "FROM RECEIPTS, TICKETS, TAXES, TICKETLINES LEFT OUTER JOIN PRODUCTS ON TICKETLINES.PRODUCT = PRODUCTS.ID "+
//    		     "WHERE RECEIPTS.ID = TICKETS.ID AND TICKETS.ID = TICKETLINES.TICKET "+
//    		     " AND TICKETLINES.TAXID=TAXES.ID AND TICKETS.TICKETTYPE<>3 "+
//    		     " GROUP BY PRODUCTS.REFERENCE, PRODUCTS.NAME, PRODUCTS.PRICESELL, TAXES.RATE ORDER BY PRODUCTS.NAME";
    	
    		qry=StringConstants.getString(StringEnumerates.SELECT_PRODUCTS_REFERENCE__PRODUCTS_NAME___PRODUCTS___)+
    			StringConstants.getString(StringEnumerates.SUM_TICKETLINES_UNITS____TICKETLINES_PRICE__1____)+
    			StringConstants.getString(StringEnumerates.FROM_RECEIPTS__TICKETS__TAXES__TICKETLINES_LEFT_OUTER_JOIN___)+
    			StringConstants.getString(StringEnumerates.WHERE_RECEIPTS_ID___TICKETS_ID_AND_TICKETS___)+
    			StringConstants.getString(StringEnumerates._AND_TICKETLINES_TAXID_TAXES_ID_AND___)+
    			StringConstants.getString(StringEnumerates._AND_RECEIPTS_DATENEW__TO_DATE__)+strD1+
    			StringConstants.getString(StringEnumerates.____YYYY_MM_DD_HH24_MI_SS___AND_RECEIPTS_DATENEW__TO_DATE__)+strD2+
    			StringConstants.getString(StringEnumerates.____YYYY_MM_DD_HH24_MI_SS__)+
    			StringConstants.getString(StringEnumerates._GROUP_BY_PRODUCTS_REFERENCE__PRODUCTS_NAME___);

        
        }
    	else {
	    	// (ATB)(2012-12-06) O HSQLDB nao suporta a funcao DATE_TRUNC. A funcao TRUNC faza mesma coisa!
    		// Vamos assumir que todas as outras bases de dados funcionam como o HSQLDB
//    		qry="SELECT PRODUCTS.REFERENCE, PRODUCTS.NAME, (PRODUCTS.PRICESELL*(1+TAXES.RATE)) AS PVPUNIT, SUM(TICKETLINES.UNITS) AS UNITS, "+
//		     "SUM(TICKETLINES.UNITS * (TICKETLINES.PRICE*(1+TAXES.RATE))) AS TOTALPVP "+
//		     "FROM RECEIPTS, TICKETS, TAXES, TICKETLINES LEFT OUTER JOIN PRODUCTS ON TICKETLINES.PRODUCT = PRODUCTS.ID "+
//		     "WHERE RECEIPTS.ID = TICKETS.ID AND TICKETS.ID = TICKETLINES.TICKET "+
//		     " AND TICKETLINES.TAXID=TAXES.ID AND TICKETS.TICKETTYPE<>3 "+
//		     " GROUP BY PRODUCTS.REFERENCE, PRODUCTS.NAME, PRODUCTS.PRICESELL, TAXES.RATE ORDER BY PRODUCTS.NAME";
    		
    		qry=StringConstants.getString(StringEnumerates.SELECT_PRODUCTS_REFERENCE__PRODUCTS_NAME___PRODUCTS___)+
			StringConstants.getString(StringEnumerates.SUM_TICKETLINES_UNITS____TICKETLINES_PRICE__1____)+
			StringConstants.getString(StringEnumerates.FROM_RECEIPTS__TICKETS__TAXES__TICKETLINES_LEFT_OUTER_JOIN___)+
			StringConstants.getString(StringEnumerates.WHERE_RECEIPTS_ID___TICKETS_ID_AND_TICKETS___)+
			StringConstants.getString(StringEnumerates._AND_TICKETLINES_TAXID_TAXES_ID_AND___)+
			StringConstants.getString(StringEnumerates._AND_RECEIPTS_DATENEW__TO_DATE__)+strD1+
			StringConstants.getString(StringEnumerates.____YYYY_MM_DD_HH24_MI_SS___AND_RECEIPTS_DATENEW__TO_DATE__)+strD2+
			StringConstants.getString(StringEnumerates.____YYYY_MM_DD_HH24_MI_SS__)+
			StringConstants.getString(StringEnumerates._GROUP_BY_PRODUCTS_REFERENCE__PRODUCTS_NAME___);
    	}

    	return new StaticSentence(s
            //, new QBFBuilder(qry, new String[] {"REFERENCE", "NAME", "PVPUNIT", "UNITS", "TOTALPVP"})
    		, new QBFBuilder(qry, new String[] {StringConstants.getString(StringEnumerates.REFERENCE), StringConstants.getString(StringEnumerates.NAME), StringConstants.getString(StringEnumerates.PVPUNIT), StringConstants.getString(StringEnumerates.UNITS), StringConstants.getString(StringEnumerates.TOTALPVP)})	
            , new SerializerWriteBasic(new Datas[] {Datas.STRING, Datas.STRING, Datas.DOUBLE, Datas.INT, Datas.DOUBLE})
            , new SerializerReadClass(ProductsSalesInfo.class));
    }     
    
    public TableDefinition com.openbravo.pos.forms.DataLogicSales.getTableCompany() {

        return new TableDefinition(s,
        		StringConstants.getString(StringEnumerates.COMPANY)
            , new String[] {StringConstants.getString(StringEnumerates.ID), StringConstants.getString(StringEnumerates.NAME), StringConstants.getString(StringEnumerates.ADDRESS), StringConstants.getString(StringEnumerates.TAXID), StringConstants.getString(StringEnumerates.POSTAL), StringConstants.getString(StringEnumerates.CITY), StringConstants.getString(StringEnumerates.REGION), StringConstants.getString(StringEnumerates.COUNTRY), StringConstants.getString(StringEnumerates.BUSINESSREG) }
            , new String[] {StringConstants.getString(StringEnumerates.ID), AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_locationname)), AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_locationaddress)), StringConstants.getString(StringEnumerates.NIF), StringConstants.getString(StringEnumerates.Codigo_Postal), StringConstants.getString(StringEnumerates.Cidade), StringConstants.getString(StringEnumerates.Regiao), StringConstants.getString(StringEnumerates.Pais), StringConstants.getString(StringEnumerates.Registo_Comercial) }
            , new Datas[] {Datas.STRING, Datas.STRING, Datas.STRING, Datas.STRING, Datas.STRING, Datas.STRING, Datas.STRING, Datas.STRING, Datas.STRING }
            , new Formats[] {Formats.STRING, Formats.STRING, Formats.STRING, Formats.STRING, Formats.STRING, Formats.STRING, Formats.STRING, Formats.STRING, Formats.STRING }
            , new int[] {0}
        );
    }
    
    public double com.openbravo.pos.forms.DataLogicSales.getRefundValue(String ticketId) throws BasicException {
//        return (double) new PreparedSentence(s
//                , "SELECT SUM(grosstotal) FROM SIGNATURES WHERE SIGNATURES.REFERENCE='"+ticketId+"'",
//                , null
//                , new SerializerReadClass(Company.class)).find();
    
	    String cmd=StringConstants.getString(StringEnumerates.SELECT_SUM_grosstotal__FROM_SIGNATURES_WHERE_SIGNATURES_REFERENCE__)
	    						+ticketId
	    						+StringConstants.getString(StringEnumerates.__AND_SIGNATURES_TICKETTYPE_)+Integer.toString(TicketInfo.RECEIPT_REFUND);
	
	    PreparedSentence selectSentence=new PreparedSentence(s
	            , cmd
	            , null
	            , SerializerReadDouble.INSTANCE);
	                    
	    Double valor=(Double)selectSentence.find();
	    
	    if (valor==null)
	    	return 0.0;
	    else
	    	return valor.doubleValue();
    }

    // Vamos acrescentar um novo metodo ao DataLogicSales
    // Dado a identificacao de um documento do tipo Preview (Consulta de Mesa) vai retornar
    // - se existir - informacao sobre a fatura ou fatura simplificada relacionada 
    public SentenceList com.openbravo.pos.forms.DataLogicSales.getPreviewRelatedInvoice(String documentNo) {
    			
		String dbName=CompanyGlobal.getCompanyGlobal().getJRootApp().getSession().DB.getName();

		// Vamos gerar a string de query ja com as datas
		String qry="";
    	//if (dbName.compareTo("PostgreSQL")==0) {
    	if (dbName.compareTo(StringConstants.getString(StringEnumerates.PostgreSQL))==0) {
			qry="SELECT TICKETTYPE, TICKETID, INVOICEDATE, SYSTEMENTRYDATE, INVOICENO, GROSSTOTAL, REFERENCE FROM SIGNATURES "+
			    "WHERE REFERENCE='"+documentNo+"'"; 
		}
    	else {
	    	// (ATB)(2012-12-06) HSQLDB 
			qry="SELECT TICKETTYPE, TICKETID, INVOICEDATE, SYSTEMENTRYDATE, INVOICENO, GROSSTOTAL, REFERENCE FROM SIGNATURES "+
		    "WHERE REFERENCE='"+documentNo+"'"; 
    	}
    	
    	return new StaticSentence(s
            , new QBFBuilder(qry, new String[] {StringConstants.getString(StringEnumerates.T_TICKETID), StringConstants.getString(StringEnumerates.T_TICKETTYPE), StringConstants.getString(StringEnumerates.PM_TOTAL), StringConstants.getString(StringEnumerates.R_DATENEW), StringConstants.getString(StringEnumerates.R_DATENEW), StringConstants.getString(StringEnumerates.P_NAME), StringConstants.getString(StringEnumerates.C_NAME)})
            , new SerializerWriteBasic(new Datas[] {Datas.OBJECT, Datas.INT, Datas.OBJECT, Datas.INT, Datas.OBJECT, Datas.DOUBLE, Datas.OBJECT, Datas.TIMESTAMP, Datas.OBJECT, Datas.TIMESTAMP, Datas.OBJECT, Datas.STRING, Datas.OBJECT, Datas.STRING})
            , new SerializerReadClass(FindTicketsInfo2.class));
    }   

	
}
