/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import java.awt.Toolkit;
import java.util.Date;

import javax.swing.JOptionPane;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.loader.PreparedSentence;
import com.openbravo.data.loader.SerializerReadString;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.inventory.TaxCategoryInfo;
import com.openbravo.pos.payment.JPaymentSelect;
import com.openbravo.pos.sales.JPanelTicket.ScriptArg;
import com.openbravo.pos.sales.JPanelTicket.ScriptObject;
import com.openbravo.pos.sales.TaxesException;
import com.openbravo.pos.scale.ScaleException;
import com.openbravo.pos.ticket.TicketInfo;
import com.openbravo.pos.customers.CustomerInfoExt;
import com.openbravo.pos.ticket.ProductInfoExt;
import com.openbravo.pos.ticket.TicketLineInfo;

public privileged aspect JPanelTicket {

	   private boolean com.openbravo.pos.sales.JPanelTicket.closeTicket2(TicketInfo ticket, Object ticketext) {
	        
	        boolean resultok = false;
	        
	        if (m_App.getAppUserView().getUser().hasPermission(StringConstants.getString(StringEnumerates.sales_Total))) {  
	            
	            try {
	                // reset the payment info
	                taxeslogic.calculateTaxes(ticket);
	                if (ticket.getTotal()>=0.0){
	                    ticket.resetPayments(); //Only reset if is sale
	                }
	                
	                if (executeEvent(ticket, ticketext, StringConstants.getString(StringEnumerates.ticket_total)) == null) {
	                	
	                	//(ATB)(INICIO)
	                	// garantir que nao se devolve nunca um valor superior ao da factura original!!!
	                	// Apenas se faz esta validacao se for uma devolucao!
	                	boolean cont=true;
	                	
	                	if (ticket.getTicketType()==TicketInfo.RECEIPT_REFUND) {
	                	
		                	//double refundValue=ticket.getTotal();
		                	double refundValue;
							try {
								refundValue = dlSales.getRefundValue(ticket.getReference());
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								// (ATB) Este erro deve ser tratado de outra forma - o processo de devolucao deve ser abortado
								refundValue=0.0;
							}
		                	
		                	refundValue=Math.abs(refundValue);
		                	refundValue=refundValue+Math.abs(ticket.getTotal());
		                	
		                	if (refundValue>(ticket.getOriginalReceiptValue()+0.5)) {
		                		String[] cause=new String[3];
		                		//StringBuffer sb = new StringBuffer(); 
		                		
		                		cause[0]=StringConstants.getString(StringEnumerates.Nao_e_possivel_devolver_um_valor_superior_ao_valor_total_da_factura);
		                		cause[1]=StringConstants.getString(StringEnumerates.O_valor_total_da_factura_e_)+Double.valueOf(ticket.getOriginalReceiptValue()).toString();
		                		cause[2]=StringConstants.getString(StringEnumerates.O_total_das_devolucoes_e_)+Double.valueOf(refundValue).toString();
		                		//String s=sb.toString();
		                		MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_notpossibletorefund)), cause);
		                		msg.show(this);	  
		                	}
		                	else
		                	{
		                		// Estamos a fazer uma devolucao = NOTA DE CREDITO 
		                		
			                    // Muestro el total
			                    printTicket(StringConstants.getString(StringEnumerates.Printer_TicketTotal), ticket, ticketext);
			                    
			                    // Select the Payments information
			                    JPaymentSelect paymentdialog = paymentdialogrefund;

			                    paymentdialog.setPrintSelected(StringConstants.getString(StringEnumerates._true).equals(m_jbtnconfig.getProperty(StringConstants.getString(StringEnumerates.printselected), StringConstants.getString(StringEnumerates._true))));
		
			                    paymentdialog.setTransactionID(ticket.getTransactionID());
		
			                    if (paymentdialog.showDialog(ticket.getTotal(), ticket.getCustomer())) {
		
			                        // assign the payments selected and calculate taxes.         
			                        ticket.setPayments(paymentdialog.getSelectedPayments());
		
			                        // Asigno los valores definitivos del ticket...
			                        ticket.setUser(m_App.getAppUserView().getUser().getUserInfo()); // El usuario que lo cobra
			                        ticket.setActiveCash(m_App.getActiveCashIndex());
			                        ticket.setDate(new Date()); // Le pongo la fecha de cobro
		
			                        if (executeEvent(ticket, ticketext, StringConstants.getString(StringEnumerates.ticket_save)) == null) {
			                            // Save the receipt and assign a receipt number
			                            try {
			                            	ticket.setPlace((String)ticketext);
			                                dlSales.saveTicket(ticket, m_App.getInventoryLocation());    
			                                
				                            executeEvent(ticket, ticketext, StringConstants.getString(StringEnumerates.ticket_close), new ScriptArg(StringConstants.getString(StringEnumerates.print), paymentdialog.isPrintSelected()));
				                    		
				                            // Print receipt.
				                            printTicket(paymentdialog.isPrintSelected()
				                                    ? StringConstants.getString(StringEnumerates.Printer_Ticket)
				                                    : StringConstants.getString(StringEnumerates.Printer_Ticket2), ticket, ticketext);
				                            resultok = true;

			                            } catch (BasicException eData) {
			                                MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_nosaveticket)), eData);
			                                msg.show(this);
			                                resultok = false;
			                            }
		
			                        }
			                    }
			                }
	                	}
	                	else {
	                		
	                		// E' uma venda. Pode ser uma Fatura Simples ou uma Fatura
	                		
	                		// Muestro el total
		                    printTicket(StringConstants.getString(StringEnumerates.Printer_TicketTotal), ticket, ticketext);
		                    
		                    // Apenas um teste....
		                    pt.ktc.openk.pos.payment.JPaymentSelect paymentdialoginvoice = pt.ktc.openk.pos.payment.JPaymentSelectInvoice.getDialog(this);
		                    paymentdialoginvoice.init(m_App);
          
		                    if (paymentdialoginvoice.showDialog(ticket.getTotal(), ticket.getCustomer())) {
		                    	// Vamos ver qual o tipo de documento seleccionado...
		                    	int docType=paymentdialoginvoice.getSelectedDocumentType();
		                    	
		                    	// Vamos mudar o tipo de documento....
		                    	ticket.setTicketType(docType);
		                    	
		                        // assign the payments selected and calculate taxes.         
		                        ticket.setPayments(paymentdialoginvoice.getSelectedPayments());
	
		                        // Asigno los valores definitivos del ticket...
		                        ticket.setUser(m_App.getAppUserView().getUser().getUserInfo()); // El usuario que lo cobra
		                        ticket.setActiveCash(m_App.getActiveCashIndex());
		                        ticket.setDate(new Date()); // Le pongo la fecha de cobro
	
		                        if (executeEvent(ticket, ticketext, StringConstants.getString(StringEnumerates.ticket_save)) == null) {
		                            // Save the receipt and assign a receipt number
		                            try {
		                            	ticket.setPlace((String)ticketext);
		                                dlSales.saveTicket(ticket, m_App.getInventoryLocation());  
		                                
			                            executeEvent(ticket, ticketext, StringConstants.getString(StringEnumerates.ticket_close), new ScriptArg(StringConstants.getString(StringEnumerates.print), paymentdialoginvoice.isPrintSelected()));
			                        	
			                            // Print receipt.
			                            printTicket(paymentdialoginvoice.isPrintSelected()
			                                    ? StringConstants.getString(StringEnumerates.Printer_Ticket)
			                                    : StringConstants.getString(StringEnumerates.Printer_Ticket2), ticket, ticketext);
			                            resultok = true;
			                            
		                            } catch (BasicException eData) {
		                                MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_nosaveticket)), eData);
		                                msg.show(this);
		                                resultok = false;
		                            }
		                        }
		                    }
		                }
	                }
	            } catch (TaxesException e) {
	                MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_cannotcalculatetaxes)));
	                msg.show(this);
	                resultok = false;
	            }
	            
	            // reset the payment info
	            m_oTicket.resetTaxes();
	            m_oTicket.resetPayments();
	        }
	        
	        // cancelled the ticket.total script
	        // or canceled the payment dialog
	        // or canceled the ticket.close script
	        return resultok;        
	    }


	//-----------------------------------------------------------------
    // Para garantir que numa devolucao nao se devolve nunca um valor maior que o da factura original
	// incluindo todas as devolucoes ja feitas sobre a factura!
	pointcut closeTicketAdvice(com.openbravo.pos.sales.JPanelTicket jPanel, TicketInfo ticket, Object ticketext) : target(jPanel) && args(ticket, ticketext) && call(boolean com.openbravo.pos.sales.JPanelTicket.closeTicket(TicketInfo, Object)); 

	boolean around (com.openbravo.pos.sales.JPanelTicket jPanel, TicketInfo ticket, Object ticketext): closeTicketAdvice(jPanel, ticket, ticketext)  {

		//System.out.println("around closeTicket");
		//return proceed(jPanel, ticket, ticketext);
		return jPanel.closeTicket2(ticket, ticketext);
		
	}

	// Para se controlar o que se pode fazer nas "devolucoes"
	void com.openbravo.pos.sales.JPanelTicket.enableButtonCustomer(boolean v) {
		btnCustomer.setVisible(v);
	}
	
	pointcut setActiveTicket(com.openbravo.pos.sales.JPanelTicket jPanel, TicketInfo ticket, Object ticketext) : target(jPanel) && args(ticket, ticketext) && call(void com.openbravo.pos.sales.JPanelTicket.setActiveTicket(TicketInfo, Object)); 
	
	void around (com.openbravo.pos.sales.JPanelTicket jPanel, TicketInfo ticket, Object ticketext): setActiveTicket(jPanel, ticket, ticketext)  {

		//System.out.println("around setActiveTicket");
		
		if (ticket!=null) {
			if (ticket.getTicketType() == TicketInfo.RECEIPT_NORMAL) {
				jPanel.enableButtonCustomer(true);
			}
			else {
				jPanel.enableButtonCustomer(false);
			}
		}
		
		proceed(jPanel, ticket, ticketext);
	}
	
    public com.openbravo.pos.sales.JTicketsBag com.openbravo.pos.sales.JPanelTicket.getJTicketsBag2() {
    	return m_ticketsbag;
    }

	
	//     private Object evalScript(ScriptObject scr, String resource, ScriptArg... args) {
	pointcut evalScript(com.openbravo.pos.sales.JPanelTicket jPanel, ScriptObject scr, String resource, ScriptArg[] args) : target(jPanel) && args(scr, resource, args) && execution(Object com.openbravo.pos.sales.JPanelTicket.evalScript(ScriptObject, String, ScriptArg...)); 

	Object around (com.openbravo.pos.sales.JPanelTicket jPanel, ScriptObject scr, String resource, ScriptArg[] args): evalScript(jPanel, scr, resource, args)  {

		//System.out.println("around setActiveTicket");
		
		// Antes de invocar vamos actualizar o ID do sharedTicket actual
		com.openbravo.pos.sales.JTicketsBag bag=jPanel.getJTicketsBag2();
		
		scr.setSharedTicketID(bag.getCurrentSharedTicketID());
		
		return proceed(jPanel, scr, resource, args);
	}
	
	// Nao deve permitir o split se recibo ja tem consulta de mesa
    pointcut splitActionPerformed(com.openbravo.pos.sales.JPanelTicket panel) : target(panel) && call(void com.openbravo.pos.sales.JPanelTicket.btnSplitActionPerformed(java.awt.event.ActionEvent)); 

    void around(com.openbravo.pos.sales.JPanelTicket panel): splitActionPerformed(panel)  {
		// vamos buscar o ticket seleccionado...
    	String ticketId=panel.getJTicketsBag2().getCurrentSharedTicketID();
		
		// este metodo deveria devolver se e possivel remover ou nao o recibo 
		// Vamos fazer uma pesquisa ao SHAREDTICKETS
        String cmd=StringConstants.getString(StringEnumerates.SELECT_REFERENCE_FROM_SHAREDTICKETS_WHERE_ID____)+ ticketId+StringConstants.getString(StringEnumerates._apostrophe);
        String reference="";

        try {
	        PreparedSentence selectSentence=new PreparedSentence(pt.ktc.openk.pos.company.CompanyGlobal.getCompanyGlobal().getJRootApp().getSession()
	                , cmd
	                , null
	                , SerializerReadString.INSTANCE);

			reference=(String)selectSentence.find();
		} catch (BasicException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//System.out.println(reference);
		
		// (ATB)(2013-12-18) para testar se e possivel deixar fazer o split de recibos depois de emitido comsulta
		// de mesa
		reference=null;		// esta linha faz com que a "validacao" actual seja ultrapassada

		if (reference==null) {
			proceed(panel);
		}
		else {
    		JOptionPane.showMessageDialog(panel, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_mustsell)), AppLocal.getIntString(StringConstants.getString(StringEnumerates.title_editor)), JOptionPane.WARNING_MESSAGE);
		}
    }

	// Para controlar melhor o que se pode fazer com os produtos nas vendas!
    private void com.openbravo.pos.sales.JPanelTicket.stateTransition2(char cTrans) {

        if (cTrans == '\n') {
            // Codigo de barras introducido
            if (m_sBarcode.length() > 0) {            
                String sCode = m_sBarcode.toString();
                if (sCode.startsWith("c")) {
                    // barcode of a customers card
                    try {
                        CustomerInfoExt newcustomer = dlSales.findCustomerExt(sCode);
                        if (newcustomer == null) {
                            Toolkit.getDefaultToolkit().beep();                   
                            new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_nocustomer))).show(this);           
                        } else {
                            m_oTicket.setCustomer(newcustomer);
                            m_jTicketId.setText(m_oTicket.getName(m_oTicketExt));
                        }
                    } catch (BasicException e) {
                        Toolkit.getDefaultToolkit().beep();                   
                        new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_nocustomer)), e).show(this);           
                    }
                    stateToZero();
                } else if (sCode.length() == 13 && sCode.startsWith(StringConstants.getString(StringEnumerates._250))) {
                    // barcode of the other machine
                    ProductInfoExt oProduct = new ProductInfoExt(); // Es un ticket
                    oProduct.setReference(null); // para que no se grabe
                    oProduct.setCode(sCode);
                    oProduct.setName(StringConstants.getString(StringEnumerates.Ticket_) + sCode.substring(3, 7));
                    oProduct.setPriceSell(Double.parseDouble(sCode.substring(7, 12)) / 100);   
                    oProduct.setTaxCategoryID(((TaxCategoryInfo) taxcategoriesmodel.getSelectedItem()).getID());
                    // Se anade directamente una unidad con el precio y todo
                    addTicketLine(oProduct, 1.0, includeTaxes(oProduct.getTaxCategoryID(), oProduct.getPriceSell()));
                } else if (sCode.length() == 13 && sCode.startsWith(StringConstants.getString(StringEnumerates._210))) {
                    // barcode of a weigth product
                    incProductByCodePrice(sCode.substring(0, 7), Double.parseDouble(sCode.substring(7, 12)) / 100);
                } else {
                    incProductByCode(sCode);
                }
            } else {
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            // otro caracter
            // Esto es para el codigo de barras...
            m_sBarcode.append(cTrans);

            // Esto es para el los productos normales...
            if (cTrans == '\u007f') { 
                stateToZero();

            } else if ((cTrans == '0') 
                    && (m_iNumberStatus == NUMBER_INPUTZERO)) {
                m_jPrice.setText("0");            
            } else if ((cTrans == '1' || cTrans == '2' || cTrans == '3' || cTrans == '4' || cTrans == '5' || cTrans == '6' || cTrans == '7' || cTrans == '8' || cTrans == '9')
                    && (m_iNumberStatus == NUMBER_INPUTZERO)) { 
                // Un numero entero
                m_jPrice.setText(Character.toString(cTrans));
                m_iNumberStatus = NUMBER_INPUTINT;    
                m_iNumberStatusInput = NUMBERVALID;
            } else if ((cTrans == '0' || cTrans == '1' || cTrans == '2' || cTrans == '3' || cTrans == '4' || cTrans == '5' || cTrans == '6' || cTrans == '7' || cTrans == '8' || cTrans == '9')
                       && (m_iNumberStatus == NUMBER_INPUTINT)) { 
                // Un numero entero
                m_jPrice.setText(m_jPrice.getText() + cTrans);

            } else if (cTrans == '.' && m_iNumberStatus == NUMBER_INPUTZERO) {
                m_jPrice.setText("0.");
                m_iNumberStatus = NUMBER_INPUTZERODEC;            
            } else if (cTrans == '.' && m_iNumberStatus == NUMBER_INPUTINT) {
                m_jPrice.setText(m_jPrice.getText() + ".");
                m_iNumberStatus = NUMBER_INPUTDEC;

            } else if ((cTrans == '0')
                       && (m_iNumberStatus == NUMBER_INPUTZERODEC || m_iNumberStatus == NUMBER_INPUTDEC)) { 
                // Un numero decimal
                m_jPrice.setText(m_jPrice.getText() + cTrans);
            } else if ((cTrans == '1' || cTrans == '2' || cTrans == '3' || cTrans == '4' || cTrans == '5' || cTrans == '6' || cTrans == '7' || cTrans == '8' || cTrans == '9')
                       && (m_iNumberStatus == NUMBER_INPUTZERODEC || m_iNumberStatus == NUMBER_INPUTDEC)) { 
                // Un numero decimal
                m_jPrice.setText(m_jPrice.getText() + cTrans);
                m_iNumberStatus = NUMBER_INPUTDEC;
                m_iNumberStatusInput = NUMBERVALID;

            } else if (cTrans == '*' 
                    && (m_iNumberStatus == NUMBER_INPUTINT || m_iNumberStatus == NUMBER_INPUTDEC)) {
                m_jPor.setText("x");
                m_iNumberStatus = NUMBER_PORZERO;            
            } else if (cTrans == '*' 
                    && (m_iNumberStatus == NUMBER_INPUTZERO || m_iNumberStatus == NUMBER_INPUTZERODEC)) {
                m_jPrice.setText("0");
                m_jPor.setText("x");
                m_iNumberStatus = NUMBER_PORZERO;       

            } else if ((cTrans == '0') 
                    && (m_iNumberStatus == NUMBER_PORZERO)) {
                m_jPor.setText("x0");            
            } else if ((cTrans == '1' || cTrans == '2' || cTrans == '3' || cTrans == '4' || cTrans == '5' || cTrans == '6' || cTrans == '7' || cTrans == '8' || cTrans == '9')
                    && (m_iNumberStatus == NUMBER_PORZERO)) { 
                // Un numero entero
                m_jPor.setText("x" + Character.toString(cTrans));
                m_iNumberStatus = NUMBER_PORINT;            
                m_iNumberStatusPor = NUMBERVALID;
            } else if ((cTrans == '0' || cTrans == '1' || cTrans == '2' || cTrans == '3' || cTrans == '4' || cTrans == '5' || cTrans == '6' || cTrans == '7' || cTrans == '8' || cTrans == '9')
                       && (m_iNumberStatus == NUMBER_PORINT)) { 
                // Un numero entero
                m_jPor.setText(m_jPor.getText() + cTrans);

            } else if (cTrans == '.' && m_iNumberStatus == NUMBER_PORZERO) {
                m_jPor.setText("x0.");
                m_iNumberStatus = NUMBER_PORZERODEC;            
            } else if (cTrans == '.' && m_iNumberStatus == NUMBER_PORINT) {
                m_jPor.setText(m_jPor.getText() + ".");
                m_iNumberStatus = NUMBER_PORDEC;

            } else if ((cTrans == '0')
                       && (m_iNumberStatus == NUMBER_PORZERODEC || m_iNumberStatus == NUMBER_PORDEC)) { 
                // Un numero decimal
                m_jPor.setText(m_jPor.getText() + cTrans);
            } else if ((cTrans == '1' || cTrans == '2' || cTrans == '3' || cTrans == '4' || cTrans == '5' || cTrans == '6' || cTrans == '7' || cTrans == '8' || cTrans == '9')
                       && (m_iNumberStatus == NUMBER_PORZERODEC || m_iNumberStatus == NUMBER_PORDEC)) { 
                // Un numero decimal
                m_jPor.setText(m_jPor.getText() + cTrans);
                m_iNumberStatus = NUMBER_PORDEC;            
                m_iNumberStatusPor = NUMBERVALID;  
            
            } else if (cTrans == '\u00a7' 
                    && m_iNumberStatusInput == NUMBERVALID && m_iNumberStatusPor == NUMBERZERO) {
                // Scale button pressed and a number typed as a price
                if (m_App.getDeviceScale().existsScale() && m_App.getAppUserView().getUser().hasPermission(StringConstants.getString(StringEnumerates.sales_EditLines))) {
                    try {
                        Double value = m_App.getDeviceScale().readWeight();
                        if (value != null) {
                            ProductInfoExt product = getInputProduct();
                            addTicketLine(product, value.doubleValue(), product.getPriceSell());
                        }
                    } catch (ScaleException e) {
                        Toolkit.getDefaultToolkit().beep();
                        new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_noweight)), e).show(this);           
                        stateToZero(); 
                    }
                } else {
                    // No existe la balanza;
                    Toolkit.getDefaultToolkit().beep();
                }
            } else if (cTrans == '\u00a7' 
                    && m_iNumberStatusInput == NUMBERZERO && m_iNumberStatusPor == NUMBERZERO) {
                // Scale button pressed and no number typed.
                int i = m_ticketlines.getSelectedIndex();
                if (i < 0){
                    Toolkit.getDefaultToolkit().beep();
                } else if (m_App.getDeviceScale().existsScale()) {
                    try {
                        Double value = m_App.getDeviceScale().readWeight();
                        if (value != null) {
                            TicketLineInfo newline = new TicketLineInfo(m_oTicket.getLine(i));
                            newline.setMultiply(value.doubleValue());
                            newline.setPrice(Math.abs(newline.getPrice()));
                            paintTicketLine(i, newline);
                        }
                    } catch (ScaleException e) {
                        // Error de pesada.
                        Toolkit.getDefaultToolkit().beep();
                        new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_noweight)), e).show(this);           
                        stateToZero(); 
                    }
                } else {
                    // No existe la balanza;
                    Toolkit.getDefaultToolkit().beep();
                }      
                
            // Add one product more to the selected line
            } else if (cTrans == '+' 
                    && m_iNumberStatusInput == NUMBERZERO && m_iNumberStatusPor == NUMBERZERO) {
                int i = m_ticketlines.getSelectedIndex();
                if (i < 0){
                    Toolkit.getDefaultToolkit().beep();
                } else {
                    TicketLineInfo newline = new TicketLineInfo(m_oTicket.getLine(i));
                    //If it's a refund + button means one unit less
                    if (m_oTicket.getTicketType() == TicketInfo.RECEIPT_REFUND){
                        newline.setMultiply(newline.getMultiply() - 1.0);
                        paintTicketLine(i, newline);                   
                    }
                    else {
                        // add one unit to the selected line
                        newline.setMultiply(newline.getMultiply() + 1.0);
                        paintTicketLine(i, newline); 
                    }
                }

            // Delete one product of the selected line
            } else if (cTrans == '-' 
                    && m_iNumberStatusInput == NUMBERZERO && m_iNumberStatusPor == NUMBERZERO
                    && m_App.getAppUserView().getUser().hasPermission(StringConstants.getString(StringEnumerates.sales_EditLines))) {
                
                int i = m_ticketlines.getSelectedIndex();
                if (i < 0){
                    Toolkit.getDefaultToolkit().beep();
                } else {
                    TicketLineInfo newline = new TicketLineInfo(m_oTicket.getLine(i));
                    //If it's a refund - button means one unit more
                    if (m_oTicket.getTicketType() == TicketInfo.RECEIPT_REFUND){
                        newline.setMultiply(newline.getMultiply() + 1.0);
                        if (newline.getMultiply() >= 0) {
                            removeTicketLine(i);
                        } else {
                            paintTicketLine(i, newline);
                        }
                    } else {
                        // substract one unit to the selected line
                        newline.setMultiply(newline.getMultiply() - 1.0);
                        if (newline.getMultiply() <= 0.0) {                   
                            removeTicketLine(i); // elimino la linea
                        } else {
                            paintTicketLine(i, newline);                   
                        }
                    }
                }

            // Set n products to the selected line 
            } else if (cTrans == '+' 
                    && m_iNumberStatusInput == NUMBERZERO && m_iNumberStatusPor == NUMBERVALID) {
                int i = m_ticketlines.getSelectedIndex();
                if (i < 0){
                    Toolkit.getDefaultToolkit().beep();
                } else {
                    double dPor = getPorValue();
                    TicketLineInfo newline = new TicketLineInfo(m_oTicket.getLine(i)); 
                    if (m_oTicket.getTicketType() == TicketInfo.RECEIPT_REFUND) {
                        newline.setMultiply(-dPor);
                        newline.setPrice(Math.abs(newline.getPrice()));
                        paintTicketLine(i, newline);                
                    } else {
                        newline.setMultiply(dPor);
                        newline.setPrice(Math.abs(newline.getPrice()));
                        paintTicketLine(i, newline);
                    }
                }

            // Set n negative products to the selected line  // NAO DEVEMOS PERMITIR?
            } 
            /*
            else if (cTrans == '-' 
                    && m_iNumberStatusInput == NUMBERZERO && m_iNumberStatusPor == NUMBERVALID
                    && m_App.getAppUserView().getUser().hasPermission("sales.EditLines")) {
                
                int i = m_ticketlines.getSelectedIndex();
                if (i < 0){
                    Toolkit.getDefaultToolkit().beep();
                } else {
                    double dPor = getPorValue();
                    TicketLineInfo newline = new TicketLineInfo(m_oTicket.getLine(i));
                    if (m_oTicket.getTicketType() == TicketInfo.RECEIPT_NORMAL) {
                        newline.setMultiply(dPor);
                        newline.setPrice(-Math.abs(newline.getPrice()));
                        paintTicketLine(i, newline);
                    }           
                }

            // Anadimos 1 producto
            } */
            
            /* Nao se permite isso pois possibilita introduzir linhas sem produto e valores negativos!
             * else if (cTrans == '+' 
                    && m_iNumberStatusInput == NUMBERVALID && m_iNumberStatusPor == NUMBERZERO
                    && m_App.getAppUserView().getUser().hasPermission("sales.EditLines")) {
                ProductInfoExt product = getInputProduct();
                addTicketLine(product, 1.0, product.getPriceSell());
                
            // Anadimos 1 producto con precio negativo
            } else if (cTrans == '-' 
                    && m_iNumberStatusInput == NUMBERVALID && m_iNumberStatusPor == NUMBERZERO
                    && m_App.getAppUserView().getUser().hasPermission("sales.EditLines")) {
                ProductInfoExt product = getInputProduct();
                addTicketLine(product, 1.0, -product.getPriceSell());

            // Anadimos n productos
            } else if (cTrans == '+' 
                    && m_iNumberStatusInput == NUMBERVALID && m_iNumberStatusPor == NUMBERVALID
                    && m_App.getAppUserView().getUser().hasPermission("sales.EditLines")) {
                ProductInfoExt product = getInputProduct();
                addTicketLine(product, getPorValue(), product.getPriceSell());

            // Anadimos n productos con precio negativo ?
            } else if (cTrans == '-' 
                    && m_iNumberStatusInput == NUMBERVALID && m_iNumberStatusPor == NUMBERVALID
                    && m_App.getAppUserView().getUser().hasPermission("sales.EditLines")) {
                ProductInfoExt product = getInputProduct();
                addTicketLine(product, getPorValue(), -product.getPriceSell());

            // Totals() Igual;
            } */ else if (cTrans == ' ' || cTrans == '=') {
                if (m_oTicket.getLinesCount() > 0) {
                    
                    if (closeTicket2(m_oTicket, m_oTicketExt)) {			// AQUI FALTA UM ASPECTO!!!! Solucao: chamar directamente o metodo definido pelo aspecto
                        // Ends edition of current receipt
                        m_ticketsbag.deleteTicket();  
                    } else {
                        // repaint current ticket
                        refreshTicket();
                    }
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
    }
    
	pointcut stateTransitionAdvice(com.openbravo.pos.sales.JPanelTicket jPanel, char cTran) : target(jPanel) && args(cTran) && call(void com.openbravo.pos.sales.JPanelTicket.stateTransition(char)); 

	void around (com.openbravo.pos.sales.JPanelTicket jPanel, char cTran): stateTransitionAdvice(jPanel, cTran)  {

		jPanel.stateTransition2(cTran);
	}

	// Para substitui a janela de selecao de customer por outra que permite criar cliente com base no NIF para faturas simplifcadas
    //private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
	pointcut btnCustomerActionPerformed(com.openbravo.pos.sales.JPanelTicket panelTicket, java.awt.event.ActionEvent evt): target(panelTicket) && args(evt) && execution(void com.openbravo.pos.sales.JPanelTicket.btnCustomerActionPerformed(java.awt.event.ActionEvent)); 

	void around (com.openbravo.pos.sales.JPanelTicket panelTicket, java.awt.event.ActionEvent evt): btnCustomerActionPerformed(panelTicket, evt)  {

		panelTicket.btnCustomerActionPerformed2(evt);
		//proceed(panelTicket, evt);
	}
	
    private void com.openbravo.pos.sales.JPanelTicket.btnCustomerActionPerformed2(java.awt.event.ActionEvent evt) {

        pt.ktc.openk.pos.customers.JCustomerFinder finder = pt.ktc.openk.pos.customers.JCustomerFinder.getCustomerFinder(this, dlCustomers);
        finder.search(m_oTicket.getCustomer());
        finder.setVisible(true);
        
        try {
            m_oTicket.setCustomer(finder.getSelectedCustomer() == null
                    ? null
                    : dlSales.loadCustomerExt(finder.getSelectedCustomer().getId()));
        } catch (BasicException e) {
            MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.cannotfindcustomer"), e);
            msg.show(this);            
        }

        refreshTicket();
        
    }
}
