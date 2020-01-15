/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *
 * */
package pt.ktc.openk.pos.sales;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JComponent;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.JMessageDialog;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.pos.customers.DataLogicCustomers;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.panels.JTicketsFinder;
import com.openbravo.pos.printer.DeviceTicket;
import com.openbravo.pos.printer.TicketParser;
import com.openbravo.pos.printer.TicketPrinterException;
import com.openbravo.pos.sales.JTicketsBag;
import com.openbravo.pos.scripting.ScriptEngine;
import com.openbravo.pos.scripting.ScriptException;
import com.openbravo.pos.scripting.ScriptFactory;
import com.openbravo.pos.ticket.FindTicketsInfo;
import com.openbravo.pos.ticket.TicketInfo;
import com.openbravo.pos.ticket.TicketLineInfo;

public class JTicketsBagTicket extends JTicketsBag {
    
    private DataLogicSystem m_dlSystem = null;
    protected DataLogicCustomers dlCustomers = null;

    private DeviceTicket m_TP;    
    private TicketParser m_TTP;    
    private TicketParser m_TTP2; 
    
    private TicketInfo m_ticket;
    private TicketInfo m_ticketCopy;
    
    private JTicketsBagTicketBag m_TicketsBagTicketBag;
    
    private JPanelTicketEdits m_panelticketedit;

    /** Creates new form JTicketsBagTicket */
    //public JTicketsBagTicket(AppView app, JPanelTicketReplaceSale panelticket) {
    public JTicketsBagTicket(AppView app, JPanelTicketEdits panelticket) {
        
        super(app, panelticket);
        m_panelticketedit = panelticket; 
        m_dlSystem = (DataLogicSystem) m_App.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSystem));
        dlCustomers = (DataLogicCustomers) m_App.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_customers_DataLogicCustomers));
        
        // Inicializo la impresora...
        m_TP = new DeviceTicket();
   
        // Inicializo el parser de documentos de ticket
        m_TTP = new TicketParser(m_TP, m_dlSystem); // para visualizar el ticket
        m_TTP2 = new TicketParser(m_App.getDeviceTicket(), m_dlSystem); // para imprimir el ticket
        
        initComponents();
        
        m_TicketsBagTicketBag = new JTicketsBagTicketBag(this);
        
        m_jTicketEditor.addEditorKeys(m_jKeys);
        
        // Este deviceticket solo tiene una impresora, la de pantalla
        m_jPanelTicket.add(m_TP.getDevicePrinter("1").getPrinterComponent(), BorderLayout.CENTER);
    }
    
    public void activate() {
        
        // precondicion es que no tenemos ticket activado ni ticket en el panel
        
        m_ticket = null;
        m_ticketCopy = null;
        
        printTicket();        
        
        m_jTicketEditor.reset();
        m_jTicketEditor.activate();
        
        m_panelticketedit.setActiveTicket(null, null);

        jrbSales.setSelected(true);
        
        //m_jReplace.setVisible(m_App.getAppUserView().getUser().hasPermission(StringConstants.getString(StringEnumerates.sales_EditTicket)));   // (ATB) Este identificador tem de ser alterado!
        //m_jEdit.setVisible(m_App.getAppUserView().getUser().hasPermission("sales.EditTicket"));        
        m_jPrint.setVisible(m_App.getAppUserView().getUser().hasPermission(StringConstants.getString(StringEnumerates.sales_PrintTicket)));
        m_jRefund.setVisible(m_App.getAppUserView().getUser().hasPermission("sales.RefundTicket"));
        
        // postcondicion es que tenemos ticket activado aqui y ticket en el panel
    }
    
    public boolean deactivate() {
        
        // precondicion es que tenemos ticket activado aqui y ticket en el panel        
        m_ticket = null;   
        m_ticketCopy = null;
        return true;       
        // postcondicion es que no tenemos ticket activado ni ticket en el panel
    }
    
    public void deleteTicket() {
        
        if (m_ticketCopy != null) {           
            // Para editar borramos el ticket anterior
            try {               
                m_dlSales.deleteTicket(m_ticketCopy, m_App.getInventoryLocation());
            } catch (BasicException eData) {
                MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, AppLocal.getIntString("message.nosaveticket"), eData);
                msg.show(this);                
            }            
        }
        
        m_ticket = null;
        m_ticketCopy = null;
        resetToTicket(); 
    }    
        
    public void canceleditionTicket() {
        
        m_ticketCopy = null;
        resetToTicket();
    }    
    
    private void resetToTicket() {       
        printTicket();
        m_jTicketEditor.reset();
        m_jTicketEditor.activate();
        m_panelticketedit.setActiveTicket(null, null); 
    }
    
    protected JComponent getBagComponent() {
        return m_TicketsBagTicketBag;
    }
    
    protected JComponent getNullComponent() {
        return this;
    }
      
    private void readTicket(int iTicketid, int iTickettype) {
        
        try {
            TicketInfo ticket = (iTicketid==-1) 
                ? m_dlSales.loadTicket(iTickettype,  m_jTicketEditor.getValueInteger())
                : m_dlSales.loadTicket(iTickettype, iTicketid) ;

            if (ticket == null) {
                MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_notexiststicket)));
                msg.show(this);
            } else {
                m_ticket = ticket;
                m_ticketCopy = null; // se asigna al pulsar el boton de editar o devolver
                printTicket();
            }
            
            // (ATB) Vamos activar ou desactivar as acoes possiveis conforme o tipo de documento
            if ((ticket.getTicketType()!=pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_INVOICE) &&
            		(ticket.getTicketType()!=pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_NORMAL))
            {
                m_jRefund.setEnabled(false);
            }
            else
            {
                m_jRefund.setEnabled(true);
            }
            
        } catch (BasicException e) {
            MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_cannotloadticket)), e);
            msg.show(this);
        }
        
        m_jTicketEditor.reset();
        m_jTicketEditor.activate();
    }
    
    private void printTicket() {
        
        // imprimo m_ticket
        
        m_jRefund.setEnabled(m_ticket != null && ((m_ticket.getTicketType() == TicketInfo.RECEIPT_NORMAL) || (m_ticket.getTicketType() == pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_INVOICE)));        
        m_jPrint.setEnabled(m_ticket != null);
        
        // Este deviceticket solo tiene una impresora, la de pantalla
        m_TP.getDevicePrinter(StringConstants.getString(StringEnumerates._1)).reset();
        
        if (m_ticket == null) {
            m_jTicketId.setText(null);            
        } else {
            m_jTicketId.setText(m_ticket.getName());
            
            try {
                ScriptEngine script = ScriptFactory.getScriptEngine(ScriptFactory.VELOCITY);
                script.put(StringConstants.getString(StringEnumerates.ticket), m_ticket);
                m_TTP.printTicket(script.eval(m_dlSystem.getResourceAsXML(StringConstants.getString(StringEnumerates.Printer_TicketPreview))).toString());
            } catch (ScriptException e) {
                MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_cannotprintticket)), e);
                msg.show(this);
            } catch (TicketPrinterException eTP) {
                MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_cannotprintticket)), eTP);
                msg.show(this);
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        m_jOptions = new javax.swing.JPanel();
        m_jButtons = new javax.swing.JPanel();
        m_jTicketId = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        //m_jEdit = new javax.swing.JButton();
        m_jRefund = new javax.swing.JButton();
        //m_jReplace = new javax.swing.JButton();
        m_jPrint = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        m_jPanelTicket = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        m_jKeys = new com.openbravo.editor.JEditorKeys();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        m_jTicketEditor = new com.openbravo.editor.JEditorIntegerPositive();
        jPanel1 = new javax.swing.JPanel();
        jrbSales = new javax.swing.JRadioButton();
        jrbRefunds = new javax.swing.JRadioButton();
        jrbInvoices = new javax.swing.JRadioButton();

        setLayout(new java.awt.BorderLayout());

        m_jOptions.setLayout(new java.awt.BorderLayout());

        m_jButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        m_jTicketId.setBackground(java.awt.Color.white);
        m_jTicketId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m_jTicketId.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor(StringConstants.getString(StringEnumerates.Button_darkShadow))), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));
        m_jTicketId.setOpaque(true);
        m_jTicketId.setPreferredSize(new java.awt.Dimension(160, 25));
        m_jTicketId.setRequestFocusEnabled(false);
        m_jButtons.add(m_jTicketId);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(StringConstants.getString(StringEnumerates._com_openbravo_images_search_png)))); // NOI18N
        jButton2.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_search))); // NOI18N
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setMargin(new java.awt.Insets(8, 14, 8, 14));
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        m_jButtons.add(jButton2);
        
//        m_jEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/edit.png"))); // NOI18N
//        m_jEdit.setText(AppLocal.getIntString("button.edit")); // NOI18N
//        m_jEdit.setFocusPainted(false);
//        m_jEdit.setFocusable(false);
//        m_jEdit.setMargin(new java.awt.Insets(8, 14, 8, 14));
//        m_jEdit.setRequestFocusEnabled(false);
//        m_jEdit.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                m_jEditActionPerformed(evt);
//            }
//        });
//        m_jButtons.add(m_jEdit);

        m_jRefund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/inbox.png"))); // NOI18N
        m_jRefund.setText(AppLocal.getIntString("button.refund")); // NOI18N
        m_jRefund.setFocusPainted(false);
        m_jRefund.setFocusable(false);
        m_jRefund.setMargin(new java.awt.Insets(8, 14, 8, 14));
        m_jRefund.setRequestFocusEnabled(false);
        m_jRefund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jRefundActionPerformed(evt);
            }
        });
        m_jButtons.add(m_jRefund);
        
//        m_jReplace.setIcon(new javax.swing.ImageIcon(getClass().getResource(StringConstants.getString(StringEnumerates._com_openbravo_images_edit_png)))); // NOI18N
//        m_jReplace.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.button_replace))); // NOI18N
//        m_jReplace.setFocusPainted(false);
//        m_jReplace.setFocusable(false);
//        m_jReplace.setMargin(new java.awt.Insets(8, 14, 8, 14));
//        m_jReplace.setRequestFocusEnabled(false);
//        m_jReplace.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                m_jReplaceActionPerformed(evt);
//            }
//        });
//        m_jButtons.add(m_jReplace);

        m_jPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource(StringConstants.getString(StringEnumerates._com_openbravo_images_yast_printer_png)))); // NOI18N
        m_jPrint.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.button_print))); // NOI18N
        m_jPrint.setFocusPainted(false);
        m_jPrint.setFocusable(false);
        m_jPrint.setMargin(new java.awt.Insets(8, 14, 8, 14));
        m_jPrint.setRequestFocusEnabled(false);
        m_jPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jPrintActionPerformed(evt);
            }
        });
        m_jButtons.add(m_jPrint);

        m_jOptions.add(m_jButtons, java.awt.BorderLayout.WEST);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        m_jOptions.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(m_jOptions, java.awt.BorderLayout.NORTH);

        m_jPanelTicket.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        m_jPanelTicket.setLayout(new java.awt.BorderLayout());
        add(m_jPanelTicket, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        m_jKeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jKeysActionPerformed(evt);
            }
        });
        jPanel4.add(m_jKeys);

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(StringConstants.getString(StringEnumerates._com_openbravo_images_button_ok_png)))); // NOI18N
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setMargin(new java.awt.Insets(8, 14, 8, 14));
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel5.add(jButton1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel5.add(m_jTicketEditor, gridBagConstraints);

        jPanel4.add(jPanel5);

        jPanel3.add(jPanel4, java.awt.BorderLayout.NORTH);

        buttonGroup1.add(jrbSales);
        //jrbSales.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_sales))); // NOI18N
        jrbSales.setText("FS"); // NOI18N
        jrbSales.setFocusPainted(false);
        jrbSales.setFocusable(false);
        jrbSales.setRequestFocusEnabled(false);
        jPanel1.add(jrbSales);

        buttonGroup1.add(jrbInvoices);
        //jrbSales.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_sales))); // NOI18N
        jrbInvoices.setText("FT"); // NOI18N
        jrbInvoices.setFocusPainted(false);
        jrbInvoices.setFocusable(false);
        jrbInvoices.setRequestFocusEnabled(false);
        jPanel1.add(jrbInvoices);

        // Nao se pode substituir uma devolucao 
        buttonGroup1.add(jrbRefunds);
        //jrbRefunds.setText(AppLocal.getIntString("label.refunds")); // NOI18N
        jrbRefunds.setText("NC");
        jrbRefunds.setFocusPainted(false);
        jrbRefunds.setFocusable(false);
        jrbRefunds.setRequestFocusEnabled(false);
        jPanel1.add(jrbRefunds);


        jPanel3.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

//    private void m_jReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jReplaceActionPerformed
//                 
//        m_ticketCopy = m_ticket;        
//        m_TicketsBagTicketBag.showEdit();
//        m_panelticketedit.showCatalog();
//        m_panelticketedit.setActiveTicket(m_ticket.copyTicket(), null);  
//        
//    }//GEN-LAST:event_m_jReplaceActionPerformed

//    private void m_jEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jEditActionPerformed
//        
//        m_ticketCopy = m_ticket;        
//        m_TicketsBagTicketBag.showEdit();
//        m_panelticketedit.showCatalog();
//        m_panelticketedit.setActiveTicket(m_ticket.copyTicket(), null);  
//        
//    }//GEN-LAST:event_m_jEditActionPerformed

    private void m_jPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jPrintActionPerformed
       
        if (m_ticket != null) {
            try {
                ScriptEngine script = ScriptFactory.getScriptEngine(ScriptFactory.VELOCITY);
                script.put(StringConstants.getString(StringEnumerates.ticket), m_ticket);
                m_TTP2.printTicket(script.eval(m_dlSystem.getResourceAsXML(StringConstants.getString(StringEnumerates.Printer_TicketPreview))).toString());
            } catch (ScriptException e) {
                JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_NOTICE, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_cannotprint)), e));
            } catch (TicketPrinterException e) {
                JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_NOTICE, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_cannotprint)), e));
            }
        }  
        
    }//GEN-LAST:event_m_jPrintActionPerformed

    private void m_jRefundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jRefundActionPerformed
        
        java.util.List aRefundLines = new ArrayList();
        
        for(int i = 0; i < m_ticket.getLinesCount(); i++) {
            TicketLineInfo newline = new TicketLineInfo(m_ticket.getLine(i));
            aRefundLines.add(newline);
        } 
        
        m_ticketCopy = null;
        m_TicketsBagTicketBag.showRefund();
        m_panelticketedit.showRefundLines(aRefundLines);
        
        TicketInfo refundticket = new TicketInfo();
        //refundticket.setReference(Integer.toString(m_ticket.getTicketId()));			// Colocar a referencia para a factura original - Aqui deve-se colocar a "serie" completa
        refundticket.setReference(m_ticket.getDocumentNo());				// Assim fica com a referencia completa para o documento original para o qual vamos fazer uma Nota de Credito
        refundticket.setTicketType(TicketInfo.RECEIPT_REFUND);
        refundticket.setCustomer(m_ticket.getCustomer());
        refundticket.setPayments(m_ticket.getPayments());
        refundticket.setOriginalReceiptValue(m_ticket.getTotal());
        m_panelticketedit.setActiveTicket(refundticket, null);	
        
    }//GEN-LAST:event_m_jRefundActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    	int ticketType=0;
    	
    	if (jrbSales.isSelected()) ticketType=0;
    	if (jrbRefunds.isSelected()) ticketType=1;
    	if (jrbInvoices.isSelected()) ticketType=4;
    	
        readTicket(-1, ticketType);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void m_jKeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jKeysActionPerformed

    	int ticketType=0;
    	
    	if (jrbSales.isSelected()) ticketType=0;
    	if (jrbRefunds.isSelected()) ticketType=1;
    	if (jrbInvoices.isSelected()) ticketType=4;
    	
        readTicket(-1, ticketType);
        
    }//GEN-LAST:event_m_jKeysActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pt.ktc.openk.pos.panels.JTicketsFinder finder = pt.ktc.openk.pos.panels.JTicketsFinder.getReceiptFinder(this, m_dlSales, dlCustomers);
        finder.setVisible(true);
        FindTicketsInfo selectedTicket = finder.getSelectedCustomer();
        if (selectedTicket == null) {
            m_jTicketEditor.reset();
            m_jTicketEditor.activate();
        } else {
            readTicket(selectedTicket.getTicketId(), selectedTicket.getTicketType());
        }
}//GEN-LAST:event_jButton2ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jrbRefunds;
    private javax.swing.JRadioButton jrbSales;
    private javax.swing.JRadioButton jrbInvoices;    
    private javax.swing.JPanel m_jButtons;
    private javax.swing.JButton m_jEdit;
    //private javax.swing.JButton m_jReplace;
    private com.openbravo.editor.JEditorKeys m_jKeys;
    private javax.swing.JPanel m_jOptions;
    private javax.swing.JPanel m_jPanelTicket;
    private javax.swing.JButton m_jPrint;
    private javax.swing.JButton m_jRefund;    
    private com.openbravo.editor.JEditorIntegerPositive m_jTicketEditor;
    private javax.swing.JLabel m_jTicketId;
    // End of variables declaration//GEN-END:variables
    
}
