/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import pt.ktc.openk.pos.security.Cipher2;
import pt.ktc.openk.pos.utils.HardCodedConstants;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataParams;
import com.openbravo.data.loader.PreparedSentence;
import com.openbravo.data.loader.SentenceExec;
import com.openbravo.data.loader.SerializerReadString;
import com.openbravo.data.loader.SerializerWriteBuilder;
import com.openbravo.data.loader.SerializerWriteParams;
import com.openbravo.data.loader.Transaction;
import com.openbravo.format.Formats;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.inventory.MovementReason;
import com.openbravo.pos.payment.PaymentInfo;
import com.openbravo.pos.ticket.TicketInfo;
import com.openbravo.pos.ticket.TicketLineInfo;
import com.openbravo.pos.ticket.TicketTaxInfo;

public class Global {
	
	// Vamos colocar aqui o nome do ficheiro de propriedades e o nome do ficheiro de servicos
	public static String openk_pos_properties="";
	public static String openk_pos_services_properties="";

    /*
     * Este metodo ja suporta os recibos do tipo consulta
     */
    @SuppressWarnings("rawtypes")
	public static void saveTicket3(final com.openbravo.pos.forms.DataLogicSales this2, final com.openbravo.pos.ticket.TicketInfo ticket, final String location, final String sharedTicketId) throws BasicException {

        Transaction t = new Transaction(this2.getSession()) {
            public Object transact() throws BasicException {

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

//                // Set Receipt Id
//                if (ticket.getTicketId() == 0) {
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
//                        case pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_PREVIEW:   // aparentemente so funciona assim
//                        	ticket.setTicketId(this2.getNextTicketPreviewIndex().intValue()); 
//                        	break;
////                        case TicketInfo.RECEIPT_PREVIEW: 
////                            ticket.setTicketId(this2.getNextTicketPreviewIndex().intValue());                        	
//                        default:
//                            throw new BasicException();
//                    }
//                }

                // new receipt
                new PreparedSentence(this2.getSession()
                	, StringConstants.getString(StringEnumerates.INSERT_INTO_RECEIPTS__ID__MONEY__DATENEW__ATTRIBUTES__VALUES_____________)	
                    // , "INSERT INTO RECEIPTS (ID, MONEY, DATENEW, ATTRIBUTES) VALUES (?, ?, ?, ?)"
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
                    // , "INSERT INTO TICKETS (ID, TICKETTYPE, TICKETID, PERSON, CUSTOMER) VALUES (?, ?, ?, ?, ?)"
                    , SerializerWriteParams.INSTANCE
                    ).exec(new DataParams() { public void writeValues() throws BasicException {
                        setString(1, ticket.getId());
                        setInt(2, ticket.getTicketType());
                        setInt(3, ticket.getTicketId());
                        setString(4, ticket.getUser().getId());
                        setString(5, ticket.getCustomerId());
                    }});

                SentenceExec ticketlineinsert = new PreparedSentence(this2.getSession()
                	, StringConstants.getString(StringEnumerates.INSERT_INTO_TICKETLINES__TICKET__LINE__PRODUCT__ATTRIBUTESETINSTANCE_ID__UNITS__PRICE__TAXID__ATTRIBUTES__BASEPRICE__DISCOUNT__VALUES)
                    //, "INSERT INTO TICKETLINES (TICKET, LINE, PRODUCT, ATTRIBUTESETINSTANCE_ID, UNITS, PRICE, TAXID, ATTRIBUTES, BASEPRICE, DISCOUNT) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
                    , SerializerWriteBuilder.INSTANCE);

                for (TicketLineInfo l : ticket.getLines()) {
                    ticketlineinsert.exec(l);
                    if (ticket.getTicketType()!=pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_PREVIEW) {
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
                }

                if (ticket.getTicketType()!=pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_PREVIEW) {
	                SentenceExec paymentinsert = new PreparedSentence(this2.getSession()
	                	, StringConstants.getString(StringEnumerates.INSERT_INTO_PAYMENTS__ID__RECEIPT__PAYMENT__TOTAL__TRANSID__RETURNMSG__VALUES)
	                    //, "INSERT INTO PAYMENTS (ID, RECEIPT, PAYMENT, TOTAL, TRANSID, RETURNMSG) VALUES (?, ?, ?, ?, ?, ?)"
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
                }
                
                SentenceExec taxlinesinsert = new PreparedSentence(this2.getSession()
                		, StringConstants.getString(StringEnumerates.INSERT_INTO_TAXLINES__ID__RECEIPT__TAXID__BASE__AMOUNT___VALUES)
                        //, "INSERT INTO TAXLINES (ID, RECEIPT, TAXID, BASE, AMOUNT)  VALUES (?, ?, ?, ?, ?)"
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
                //String cmd="SELECT SIGNATURE FROM SIGNATURES WHERE TICKETTYPE = "+ ticket.getTicketType()+ " AND TICKETID < "+ ticket.getTicketId() + " ORDER BY TICKETID DESC LIMIT 1 ";

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
                        //, "INSERT INTO SIGNATURES (ID,	TICKETTYPE, TICKETID, INVOICEDATE, SYSTEMENTRYDATE, INVOICENO, GROSSTOTAL, HASH, SOURCE, SIGNATURE, KEYVERSION, STAMP, REFERENCE, CUSTOMERNAME, CUSTOMERTAXID, CUSTOMERADDRESS, CUSTOMERPOSTAL, CUSTOMERCITY)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
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
                        }});
                
                // Se for um talao de consulta temos que registar a sua referencia no sharedtickets
                if (ticket.getTicketType()==pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_PREVIEW) {
                	// Primeiro vamos buscar a referencia que possa ja ter...
                	
                	cmd=StringConstants.getString(StringEnumerates.SELECT_REFERENCE_FROM_SHAREDTICKETS_WHERE_ID___)+ sharedTicketId+ StringConstants.getString(StringEnumerates._apostrophe);
                	//cmd="SELECT REFERENCE FROM SHAREDTICKETS WHERE ID = '"+ sharedTicketId+ "'";
                    selectSentence=new PreparedSentence(this2.getSession()
                            , cmd
                            , null
                            , SerializerReadString.INSTANCE);
                                    
                    String reference=(String)selectSentence.find();
                    
                    // Agora vamos actualizar com nova referencia
                    if (reference==null) {
                    	reference=Integer.toString(ticket.getTicketId());
                    }
                    else {
                    	reference=reference+","+ticket.getTicketId();
                    }
                    
                    final String ref2=reference;
  
                    SentenceExec sharedticketsupdate = new PreparedSentence(this2.getSession()
                    		, StringConstants.getString(StringEnumerates.UPDATE_SHAREDTICKETS_SET_REFERENCE___WHERE_ID__)
                            // , "UPDATE SHAREDTICKETS SET REFERENCE=? WHERE ID=?"
                            , SerializerWriteParams.INSTANCE);
                    
                    sharedticketsupdate.exec(new DataParams() { public void writeValues() throws BasicException {
                            	setString(1, ref2);
                            	setString(2, sharedTicketId);
                            }});
                }
 
                return null;
            }
        };
        t.execute();
    }

}
