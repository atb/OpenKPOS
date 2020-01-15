/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * Baseado em:   
 * */
//    Openbravo POS is a point of sales application designed for touch screens.
//    Copyright (C) 2007-2009 Openbravo, S.L.
//    http://www.openbravo.com/product/pos
//
//    This file is part of Openbravo POS.
//
//    Openbravo POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    Openbravo POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with Openbravo POS.  If not, see <http://www.gnu.org/licenses/>.

package pt.ktc.openk.sales;

import java.awt.Component;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Window;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.format.Formats;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.ticket.TicketLineInfo;

public class JProductLineEdit extends javax.swing.JDialog {
	   
    private TicketLineInfo returnLine;
    private TicketLineInfo m_oLine;
    private boolean m_bunitsok;
    private boolean m_bpriceok;
    private boolean m_bondiscountevent;    
            
    /** Creates new form JProductLineEdit */
    private JProductLineEdit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }
    /** Creates new form JProductLineEdit */
    private JProductLineEdit(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
    }
    
    private TicketLineInfo init(AppView app, TicketLineInfo oLine) throws BasicException {
        // Inicializo los componentes
        initComponents();

        if (oLine.getTaxInfo() == null) {
            throw new BasicException(AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_cannotcalculatetaxes)));
        }

        m_oLine = new TicketLineInfo(oLine);
        m_bunitsok = true;
        m_bpriceok = true;
        m_bondiscountevent =false;

        m_jName.setEnabled(m_oLine.getProductID() == null && app.getAppUserView().getUser().hasPermission(StringConstants.getString(StringEnumerates.com_openbravo_pos_sales_JPanelTicketEdits)));
        m_jPrice.setEnabled(app.getAppUserView().getUser().hasPermission(StringConstants.getString(StringEnumerates.com_openbravo_pos_sales_JPanelTicketEdits)));
        m_jPriceTax.setEnabled(app.getAppUserView().getUser().hasPermission(StringConstants.getString(StringEnumerates.com_openbravo_pos_sales_JPanelTicketEdits)));
        
        m_jName.setText(m_oLine.getProperty(StringConstants.getString(StringEnumerates.product_name)));
        m_jUnits.setDoubleValue(oLine.getMultiply());
        m_jPrice.setDoubleValue(oLine.getPrice()); 
        m_jPriceTax.setDoubleValue(oLine.getPriceTax());
        m_jTaxrate.setText(oLine.getTaxInfo().getName());
        
        // (ATB) The initial values of the new fields
        m_jBasePrice.setText(Formats.CURRENCY.formatValue(oLine.getBasePrice())); 
        m_jDiscount.setDoubleValue(new Double(oLine.getDiscount()));
        m_jDiscount.addEditorKeys(m_jKeys);
        m_jDiscount.addPropertyChangeListener(StringConstants.getString(StringEnumerates.Edition), new RecalculateDiscount());        
        //-----------------------------------
        m_jName.addPropertyChangeListener(StringConstants.getString(StringEnumerates.Edition), new RecalculateName());
        m_jUnits.addPropertyChangeListener(StringConstants.getString(StringEnumerates.Edition), new RecalculateUnits());
        m_jPrice.addPropertyChangeListener(StringConstants.getString(StringEnumerates.Edition), new RecalculatePrice());
        m_jPriceTax.addPropertyChangeListener(StringConstants.getString(StringEnumerates.Edition), new RecalculatePriceTax());

        m_jName.addEditorKeys(m_jKeys);
        m_jUnits.addEditorKeys(m_jKeys);
        m_jPrice.addEditorKeys(m_jKeys);
        m_jPriceTax.addEditorKeys(m_jKeys);
        
        if (m_jName.isEnabled()) {
            m_jName.activate();
        } else {
            m_jUnits.activate();
        }
        
        printTotals();

        getRootPane().setDefaultButton(m_jButtonOK);   
        returnLine = null;
        setVisible(true);
      
        return returnLine;
    }
    
    private void printTotals() {
        
        if (m_bunitsok && m_bpriceok) {
            m_jSubtotal.setText(m_oLine.printSubValue());
            m_jTotal.setText(m_oLine.printValue());
            m_jButtonOK.setEnabled(true);
            // (ATB)
            if (!m_bondiscountevent) m_jDiscount.setDoubleValue(new Double(m_oLine.getDiscount()));
       } else {
            m_jSubtotal.setText(null);
            m_jTotal.setText(null);
            m_jButtonOK.setEnabled(false);
            // (ATB)
            if (!m_bondiscountevent) m_jDiscount.setDoubleValue(new Double(0.0));            
       }
    }
    
    private class RecalculateUnits implements PropertyChangeListener {
        public void propertyChange(PropertyChangeEvent evt) {
            Double value = m_jUnits.getDoubleValue();
           // (ATB) if (value == null || value == 0.0) {
            // Nao se pode deixar introduzir quantidades negativas
            if (value == null || value <= 0.0) {
                m_bunitsok = false;
            } else {
                m_oLine.setMultiply(value);
                m_bunitsok = true;                
            }

            printTotals();
        }
    }
 
    // (ATB)
    private class RecalculateDiscount implements PropertyChangeListener {
        public void propertyChange(PropertyChangeEvent evt) {

        	m_bondiscountevent=true;
            Double value = m_jDiscount.getDoubleValue();
            // (ATB) if (value == null || value == 0.0) {
            // Os descontos nunca podem ser maiores que 1 mas podem ser negativos se houver aumento!!!!
            //if (value == null || value < 0.0 || value >=1.0) {
            if (value == null || value >=1.0) {
                m_bpriceok = false;
            } else {
            	double bPrice=m_oLine.getBasePrice();
            	double d=0.0;
            	if (value>=0)
            		d=bPrice-(bPrice*value);
            	else
            		d=-1*((bPrice*value)-bPrice);
            	
            	m_oLine.setDiscount(value);
                m_oLine.setPrice(d);
                m_jPrice.setDoubleValue(m_oLine.getPrice());
                m_jPriceTax.setDoubleValue(m_oLine.getPriceTax());
                m_bpriceok = true;                
            }

            printTotals();
            m_bondiscountevent=false;
        }
    }    

    
    private class RecalculatePrice implements PropertyChangeListener {
        public void propertyChange(PropertyChangeEvent evt) {

            Double value = m_jPrice.getDoubleValue();
            // (ATB) if (value == null || value == 0.0) {
            // Valores nao podem ser inferiores ou iguais a zero
            if (value == null || value <= 0.0) {
                m_bpriceok = false;
            } else {
            	
            	// Aqui deve-se calcular o desconto...
            	// baseado no preco original e no novo preco
            	double tBasePrice=m_oLine.getBasePrice();
            	double tDiscount=0.0;
            	if (value>tBasePrice)
            		tDiscount=(-1)*((value-tBasePrice)/tBasePrice);
            	else
            		tDiscount=(value/tBasePrice);
            	m_oLine.setDiscount(tDiscount);
            	//-------------------------------------
            	
                m_oLine.setPrice(value);
                m_jPriceTax.setDoubleValue(m_oLine.getPriceTax());
                m_bpriceok = true;
            }

            printTotals();
        }
    }    
    
    private class RecalculatePriceTax implements PropertyChangeListener {
        public void propertyChange(PropertyChangeEvent evt) {

            Double value = m_jPriceTax.getDoubleValue();
            // (ATB) if (value == null || value == 0.0) {
            // Valores nao podem ser inferiores ou iguais a zero
            if (value == null || value <= 0.0) {
                // m_jPriceTax.setValue(m_oLine.getPriceTax());
                m_bpriceok = false;
            } else {
                m_oLine.setPriceTax(value);
                m_jPrice.setDoubleValue(m_oLine.getPrice());
                m_bpriceok = true;
            }

            printTotals();
        }
    }   
    
    private class RecalculateName implements PropertyChangeListener {
        public void propertyChange(PropertyChangeEvent evt) {
            m_oLine.setProperty(StringConstants.getString(StringEnumerates.product_name), m_jName.getText());
        }
    }   
    
    private static Window getWindow(Component parent) {
        if (parent == null) {
            return new JFrame();
        } else if (parent instanceof Frame || parent instanceof Dialog) {
            return (Window)parent;
        } else {
            return getWindow(parent.getParent());
        }
    }       
    
    public static TicketLineInfo showMessage(Component parent, AppView app, TicketLineInfo oLine) throws BasicException {
         
        Window window = getWindow(parent);
        
        JProductLineEdit myMsg;
        if (window instanceof Frame) { 
            myMsg = new JProductLineEdit((Frame) window, true);
        } else {
            myMsg = new JProductLineEdit((Dialog) window, true);
        }
        return myMsg.init(app, oLine);
    }        

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        m_jName = new com.openbravo.editor.JEditorString();
        m_jUnits = new com.openbravo.editor.JEditorDouble();
        m_jPrice = new com.openbravo.editor.JEditorCurrency();
        m_jPriceTax = new com.openbravo.editor.JEditorCurrency();
        m_jTaxrate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        m_jTotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        m_jSubtotal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        m_jButtonOK = new javax.swing.JButton();
        m_jButtonCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        m_jKeys = new com.openbravo.editor.JEditorKeys();

        // (ATB) To support discounts
        jLabelOriginalPrice = new javax.swing.JLabel();
        jLabelDiscount = new javax.swing.JLabel();
        m_jBasePrice = new javax.swing.JLabel();
        m_jDiscount=new pt.ktc.openk.pos.editor.JEditorPercentage();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_editline))); // NOI18N

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(null);

        // O nome do produto e' a primeira linha a aparecer
        // Primeira linha a etiqueta do nome
        jLabel4.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_item))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 20, 120, 15);
        jPanel2.add(m_jName);
        m_jName.setBounds(130, 20, 300, 25);
        
        // Segunda linha: Original Price
        jLabelOriginalPrice.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_originalprice))); // NOI18N
        jPanel2.add(jLabelOriginalPrice);
        jLabelOriginalPrice.setBounds(10, 50, 120, 15);
        m_jBasePrice.setBackground(javax.swing.UIManager.getDefaults().getColor(StringConstants.getString(StringEnumerates.TextField_disabledBackground)));
        m_jBasePrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        m_jBasePrice.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor(StringConstants.getString(StringEnumerates.Button_darkShadow))), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));
        m_jBasePrice.setOpaque(true);
        m_jBasePrice.setPreferredSize(new java.awt.Dimension(150, 25));
        m_jBasePrice.setRequestFocusEnabled(false);
        jPanel2.add(m_jBasePrice);
        m_jBasePrice.setBounds(130, 50, 240, 25);

        // Terceira linha: Discount
        jLabelDiscount.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_discount))); // NOI18N
        jPanel2.add(jLabelDiscount);
        jLabelDiscount.setBounds(10, 80, 120, 15);
        jPanel2.add(m_jDiscount);
        m_jDiscount.setBounds(130, 80, 270, 25);
  
        // Quarta linha o preco unitario sem IVA
        jLabel1.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_price))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 110, 120, 15);
        jPanel2.add(m_jPrice);
        m_jPrice.setBounds(130, 110, 270, 25);

        // Quinta linha o preco unitario com IVA
        jLabel3.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_pricetax))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 140, 120, 15);
        jPanel2.add(m_jPriceTax);
        m_jPriceTax.setBounds(130, 140, 270, 25);

        // Sexta linha: as unidades
        jLabel2.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_units))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 170, 120, 15);
        jPanel2.add(m_jUnits);
        m_jUnits.setBounds(130, 170, 270, 25);

        // Setima linha: impostos
        jLabel5.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_tax))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 200, 120, 15);

        m_jTaxrate.setBackground(javax.swing.UIManager.getDefaults().getColor(StringConstants.getString(StringEnumerates.TextField_disabledBackground)));
        m_jTaxrate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        m_jTaxrate.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor(StringConstants.getString(StringEnumerates.Button_darkShadow))), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));
        m_jTaxrate.setOpaque(true);
        m_jTaxrate.setPreferredSize(new java.awt.Dimension(150, 25));
        m_jTaxrate.setRequestFocusEnabled(false);
        jPanel2.add(m_jTaxrate);
        m_jTaxrate.setBounds(130, 200, 240, 25);

        // Oitava linha: sub-total
        jLabel7.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_subtotalcash))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 230, 120, 15);

        m_jSubtotal.setBackground(javax.swing.UIManager.getDefaults().getColor(StringConstants.getString(StringEnumerates.TextField_disabledBackground)));
        m_jSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        m_jSubtotal.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor(StringConstants.getString(StringEnumerates.Button_darkShadow))), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));
        m_jSubtotal.setOpaque(true);
        m_jSubtotal.setPreferredSize(new java.awt.Dimension(150, 25));
        m_jSubtotal.setRequestFocusEnabled(false);
        jPanel2.add(m_jSubtotal);
        m_jSubtotal.setBounds(130, 230, 240, 25);

        // Nona linha: Total 
        jLabel6.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_totalcash))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 260, 120, 15);

        m_jTotal.setBackground(javax.swing.UIManager.getDefaults().getColor(StringConstants.getString(StringEnumerates.TextField_disabledBackground)));
        m_jTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        m_jTotal.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor(StringConstants.getString(StringEnumerates.Button_darkShadow))), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));
        m_jTotal.setOpaque(true);
        m_jTotal.setPreferredSize(new java.awt.Dimension(150, 25));
        m_jTotal.setRequestFocusEnabled(false);
        jPanel2.add(m_jTotal);
        m_jTotal.setBounds(130, 260, 240, 25);


        jPanel5.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        m_jButtonOK.setIcon(new javax.swing.ImageIcon(getClass().getResource(StringConstants.getString(StringEnumerates._com_openbravo_images_button_ok_png)))); // NOI18N
        m_jButtonOK.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.Button_OK))); // NOI18N
        m_jButtonOK.setFocusPainted(false);
        m_jButtonOK.setFocusable(false);
        m_jButtonOK.setMargin(new java.awt.Insets(8, 16, 8, 16));
        m_jButtonOK.setRequestFocusEnabled(false);
        m_jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jButtonOKActionPerformed(evt);
            }
        });
        jPanel1.add(m_jButtonOK);

        m_jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource(StringConstants.getString(StringEnumerates._com_openbravo_images_button_cancel_png)))); // NOI18N
        m_jButtonCancel.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.Button_Cancel))); // NOI18N
        m_jButtonCancel.setFocusPainted(false);
        m_jButtonCancel.setFocusable(false);
        m_jButtonCancel.setMargin(new java.awt.Insets(8, 16, 8, 16));
        m_jButtonCancel.setRequestFocusEnabled(false);
        m_jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(m_jButtonCancel);

        jPanel5.add(jPanel1, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));
        jPanel4.add(m_jKeys);

        jPanel3.add(jPanel4, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel3, java.awt.BorderLayout.EAST);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        //setBounds((screenSize.width-580)/2, (screenSize.height-362)/2, 580, 362);
        setBounds((screenSize.width-610)/2, (screenSize.height-392)/2, 610, 392);
    }// </editor-fold>//GEN-END:initComponents

    private void m_jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jButtonCancelActionPerformed

        dispose();

    }//GEN-LAST:event_m_jButtonCancelActionPerformed

    private void m_jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jButtonOKActionPerformed

        returnLine = m_oLine;
        
        dispose();

    }//GEN-LAST:event_m_jButtonOKActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton m_jButtonCancel;
    private javax.swing.JButton m_jButtonOK;
    private com.openbravo.editor.JEditorKeys m_jKeys;
    private com.openbravo.editor.JEditorString m_jName;
    private com.openbravo.editor.JEditorCurrency m_jPrice;
    private com.openbravo.editor.JEditorCurrency m_jPriceTax;
    private javax.swing.JLabel m_jSubtotal;
    private javax.swing.JLabel m_jTaxrate;
    private javax.swing.JLabel m_jTotal;
    private com.openbravo.editor.JEditorDouble m_jUnits;
    // End of variables declaration//GEN-END:variables
    
    // (ATB)
    private javax.swing.JLabel jLabelOriginalPrice;
    private javax.swing.JLabel jLabelDiscount;
    private javax.swing.JLabel m_jBasePrice;
    private pt.ktc.openk.pos.editor.JEditorPercentage m_jDiscount;

}
