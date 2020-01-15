/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * Based on:  
 * */
//Openbravo POS is a point of sales application designed for touch screens.
//Copyright (C) 2007-2009 Openbravo, S.L.
//http://www.openbravo.com/product/pos
//
//This file is part of Openbravo POS.
//
//Openbravo POS is free software: you can redistribute it and/or modify
//it under the terms of the GNU General Public License as published by
//the Free Software Foundation, either version 3 of the License, or
//(at your option) any later version.
//
//Openbravo POS is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.
//
//You should have received a copy of the GNU General Public License
//along with Openbravo POS.  If not, see <http://www.gnu.org/licenses/>.

package pt.ktc.openk.pos.customers;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.ComboBoxValModel;
import com.openbravo.data.loader.SentenceList;
import com.openbravo.data.user.DirtyManager;
import com.openbravo.data.user.EditorRecord;
import com.openbravo.format.DoubleUtils;
import com.openbravo.format.Formats;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.util.StringUtils;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

public class CustomersView extends javax.swing.JPanel implements EditorRecord {

private Object m_oId;

private SentenceList m_sentcat;
private ComboBoxValModel m_CategoryModel;

private ComboBoxValModel m_CountryModel; 	// ATB - por causa da tabela de paises

private DirtyManager m_Dirty;

// (ATB) (New fields)
private String m_TaxId; 
private boolean m_TaxIdLock=false;
private boolean m_NameLock=false;
private String m_Name;
private boolean m_AddressLock=false;
private String m_Address;
private String m_PostalCode;
private boolean m_PostalCodeLock=false;
private String m_City;
private boolean m_CityLock=false;
// (ATB)
  
/** Creates new form CustomersView */
public CustomersView(AppView app, DirtyManager dirty) {
  
  DataLogicSales dlSales = (DataLogicSales) app.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSales));
  
  initComponents();
  
  m_sentcat = dlSales.getTaxCustCategoriesList();
  m_CategoryModel = new ComboBoxValModel();
  
  m_CountryModel = new ComboBoxValModel();
  
  m_Dirty = dirty;
  m_jTaxID.getDocument().addDocumentListener(dirty);
  m_jTaxID.getDocument().addDocumentListener(new TaxIDManager());  // (ATB)
  m_jSearchkey.getDocument().addDocumentListener(dirty);
  m_jName.getDocument().addDocumentListener(dirty);
  m_jName.getDocument().addDocumentListener(new NameManager());  // (ATB)  
  m_jCategory.addActionListener(dirty);
  m_jCountry.addActionListener(dirty);
  m_jNotes.getDocument().addDocumentListener(dirty);
  txtMaxdebt.getDocument().addDocumentListener(dirty);
  m_jVisible.addActionListener(dirty);
  
  txtFirstName.getDocument().addDocumentListener(dirty);
  txtLastName.getDocument().addDocumentListener(dirty);
  txtEmail.getDocument().addDocumentListener(dirty);
  txtPhone.getDocument().addDocumentListener(dirty);
  txtPhone2.getDocument().addDocumentListener(dirty);
  txtFax.getDocument().addDocumentListener(dirty);
  
  txtAddress.getDocument().addDocumentListener(dirty);
  txtAddress.getDocument().addDocumentListener(new AddressManager());  // (ATB)  
  txtAddress2.getDocument().addDocumentListener(dirty);
  txtPostal.getDocument().addDocumentListener(dirty);
  txtPostal.getDocument().addDocumentListener(new PostalCodeManager());  // (ATB)
  txtCity.getDocument().addDocumentListener(dirty);
  txtCity.getDocument().addDocumentListener(new CityManager());  // (ATB)
  txtRegion.getDocument().addDocumentListener(dirty);
  //txtCountry.getDocument().addDocumentListener(dirty);
  
  writeValueEOF(); 
}

public void activate() throws BasicException {
  
  List a = m_sentcat.list();
  a.add(0, null); // The null item
  m_CategoryModel = new ComboBoxValModel(a);
  m_jCategory.setModel(m_CategoryModel);    
  
  // para a combobox de paises
  // List a = m_sentcat.list();
  // a.add(0, null); // The null item
  List b= CountryHelper.getCountryList();
  m_CountryModel = new ComboBoxValModel(b);
  m_jCountry.setModel(m_CountryModel);    
}

public void refresh() {
}

public String getTaxIDText() {
	if (m_jTaxID!=null) return m_jTaxID.getText();
	else return null;
}

public void setTaxIDFromTaxIDText() {
	if (m_jTaxID!=null) m_TaxId=m_jTaxID.getText();

}

public void writeValueEOF() {
  m_oId = null;
  m_jTaxID.setText(null);
  m_jSearchkey.setText(null);
  m_jName.setText(null);
  m_CategoryModel.setSelectedKey(null);
  m_CountryModel.setSelectedKey(null);  
  m_jNotes.setText(null);
  txtMaxdebt.setText(null);
  txtCurdebt.setText(null);
  txtCurdate.setText(null);
  m_jVisible.setSelected(false);
  jcard.setText(null);
  
  txtFirstName.setText(null);
  txtLastName.setText(null);
  txtEmail.setText(null);
  txtPhone.setText(null);
  txtPhone2.setText(null);
  txtFax.setText(null);
 
  txtAddress.setText(null);
  txtAddress2.setText(null);
  txtPostal.setText(null);
  txtCity.setText(null);
  txtRegion.setText(null);
  //txtCountry.setText(null);
  
  m_jTaxID.setEnabled(false);
  m_jSearchkey.setEnabled(false);
  m_jName.setEnabled(false);
  m_jCategory.setEnabled(false);
  m_jCountry.setEnabled(false);
  m_jNotes.setEnabled(false);
  txtMaxdebt.setEnabled(false);
  txtCurdebt.setEnabled(false);
  txtCurdate.setEnabled(false);
  m_jVisible.setEnabled(false);
  jcard.setEnabled(false);
  
  txtFirstName.setEnabled(false);
  txtLastName.setEnabled(false);
  txtEmail.setEnabled(false);
  txtPhone.setEnabled(false);
  txtPhone2.setEnabled(false);
  txtFax.setEnabled(false);
 
  txtAddress.setEnabled(false);
  txtAddress2.setEnabled(false);
  txtPostal.setEnabled(false);
  txtCity.setEnabled(false);
  txtRegion.setEnabled(false);
  //txtCountry.setEnabled(false);
  
  jButton2.setEnabled(false);
  jButton3.setEnabled(false);
} 

/* Este metodo e invocado sempre que se inicia a criacao de um novo registo. Devemos inicializar com 
 * valores por omissao os campos que devem ter sempre valores */
public void writeValueInsert() {
	
  // (ATB) - Mudar para modo read/write
  setReadWrite();	
	
  m_oId = null;
  // (ATB) m_jTaxID.setText(null);
  //m_jTaxID.setText(StringConstants.getString(StringEnumerates.Inserir_NIF));
  //m_jTaxID.setText("999999990");
  m_jTaxID.setText(StringConstants.getString(StringEnumerates._999999990));
  
  m_jSearchkey.setText(null);
  // (ATB) m_jName.setText(null);
  //m_jName.setText(StringConstants.getString(StringEnumerates.Inserir_nome_da_empresa));
  m_jName.setText(null);
  m_CategoryModel.setSelectedKey(null);
  m_CountryModel.setSelectedKey(null);  
  m_jNotes.setText(null);
  txtMaxdebt.setText(null);
  txtCurdebt.setText(null);
  txtCurdate.setText(null);        
  m_jVisible.setSelected(true);
  jcard.setText(null);
  
  txtFirstName.setText(null);
  txtLastName.setText(null);
  txtEmail.setText(null);
  txtPhone.setText(null);
  txtPhone2.setText(null);
  txtFax.setText(null);
 
  //(ATB) txtAddress.setText(null);
  //txtAddress.setText(StringConstants.getString(StringEnumerates.Inserir_morada));
  txtAddress.setText(null);
  txtAddress2.setText(null);
  //(ATB) txtPostal.setText(null);
  //txtPostal.setText(StringConstants.getString(StringEnumerates.Inserir_Cod_Postal));
  txtPostal.setText(null);
  //(ATB) txtCity.setText(null);
  // txtCity.setText(StringConstants.getString(StringEnumerates.Inserir_Cidade));
  txtCity.setText(null);
  txtRegion.setText(null);
  // txtCountry.setText(StringConstants.getString(StringEnumerates.Portugal));
  //txtCountry.setText(null);
  
  m_jTaxID.setEnabled(true);
  m_jSearchkey.setEnabled(true);
  m_jName.setEnabled(true);
  m_jCategory.setEnabled(true);
  m_jCountry.setEnabled(true);
  m_jNotes.setEnabled(true);
  txtMaxdebt.setEnabled(true);
  txtCurdebt.setEnabled(true);
  txtCurdate.setEnabled(true);
  m_jVisible.setEnabled(true);
  jcard.setEnabled(true);
         
  txtFirstName.setEnabled(true);
  txtLastName.setEnabled(true);
  txtEmail.setEnabled(true);
  txtPhone.setEnabled(true);
  txtPhone2.setEnabled(true);
  txtFax.setEnabled(true);
 
  txtAddress.setEnabled(true);
  txtAddress2.setEnabled(true);
  txtPostal.setEnabled(true);
  txtCity.setEnabled(true);
  txtRegion.setEnabled(true);
  //txtCountry.setEnabled(true);
  
  jButton2.setEnabled(true);
  jButton3.setEnabled(true);
}

public void writeValueDelete(Object value) {
  Object[] customer = (Object[]) value;
  m_oId = customer[0];
  m_jTaxID.setText((String) customer[1]);
  m_jSearchkey.setText((String) customer[2]);
  m_jName.setText((String) customer[3]);
  m_jNotes.setText((String) customer[4]);
  m_jVisible.setSelected(((Boolean) customer[5]).booleanValue());
  jcard.setText((String) customer[6]);
  txtMaxdebt.setText(Formats.CURRENCY.formatValue(customer[7]));
  txtCurdate.setText(Formats.DATE.formatValue(customer[8]));        
  txtCurdebt.setText(Formats.CURRENCY.formatValue(customer[9]));    
  
  txtFirstName.setText(Formats.STRING.formatValue(customer[10]));
  txtLastName.setText(Formats.STRING.formatValue(customer[11]));
  txtEmail.setText(Formats.STRING.formatValue(customer[12]));
  txtPhone.setText(Formats.STRING.formatValue(customer[13]));
  txtPhone2.setText(Formats.STRING.formatValue(customer[14]));
  txtFax.setText(Formats.STRING.formatValue(customer[15]));
 
  txtAddress.setText(Formats.STRING.formatValue(customer[16]));
  txtAddress2.setText(Formats.STRING.formatValue(customer[17]));
  txtPostal.setText(Formats.STRING.formatValue(customer[18]));
  txtCity.setText(Formats.STRING.formatValue(customer[19]));
  txtRegion.setText(Formats.STRING.formatValue(customer[20]));
  //txtCountry.setText(Formats.STRING.formatValue(customer[21]));      
  
  m_CategoryModel.setSelectedKey(customer[22]);
  //ATB: aqui devemos ter o codigo do pais ou o pais?
  if (CountryHelper.checkCountryCode((String)customer[21]))
	  m_CountryModel.setSelectedKey(customer[21]);			
  else
	  m_CountryModel.setSelectedKey("PT");
  
  m_jTaxID.setEnabled(false);
  m_jSearchkey.setEnabled(false);
  m_jName.setEnabled(false);
  m_jNotes.setEnabled(false);
  txtMaxdebt.setEnabled(false);
  txtCurdebt.setEnabled(false);
  txtCurdate.setEnabled(false);
  m_jVisible.setEnabled(false);
  jcard.setEnabled(false);       
  
  txtFirstName.setEnabled(false);
  txtLastName.setEnabled(false);
  txtEmail.setEnabled(false);
  txtPhone.setEnabled(false);
  txtPhone2.setEnabled(false);
  txtFax.setEnabled(false);
 
  txtAddress.setEnabled(false);
  txtAddress2.setEnabled(false);
  txtPostal.setEnabled(false);
  txtCity.setEnabled(false);
  txtRegion.setEnabled(false);
  //txtCountry.setEnabled(false);
  
  m_jCategory.setEnabled(false);
  m_jCountry.setEnabled(false);
  
  jButton2.setEnabled(false);
  jButton3.setEnabled(false);
}

public void writeValueEdit(Object value) {
  Object[] customer = (Object[]) value;
  m_oId = customer[0];
  m_jTaxID.setText((String) customer[1]);
  m_jSearchkey.setText((String) customer[2]);
  m_jName.setText((String) customer[3]);
  m_jNotes.setText((String) customer[4]);
  m_jVisible.setSelected(((Boolean) customer[5]).booleanValue());
  jcard.setText((String) customer[6]);
  txtMaxdebt.setText(Formats.CURRENCY.formatValue(customer[7]));
  txtCurdate.setText(Formats.DATE.formatValue(customer[8]));        
  txtCurdebt.setText(Formats.CURRENCY.formatValue(customer[9]));    
  
  txtFirstName.setText(Formats.STRING.formatValue(customer[10]));
  txtLastName.setText(Formats.STRING.formatValue(customer[11]));
  txtEmail.setText(Formats.STRING.formatValue(customer[12]));
  txtPhone.setText(Formats.STRING.formatValue(customer[13]));
  txtPhone2.setText(Formats.STRING.formatValue(customer[14]));
  txtFax.setText(Formats.STRING.formatValue(customer[15]));
 
  txtAddress.setText(Formats.STRING.formatValue(customer[16]));
  txtAddress2.setText(Formats.STRING.formatValue(customer[17]));
  txtPostal.setText(Formats.STRING.formatValue(customer[18]));
  txtCity.setText(Formats.STRING.formatValue(customer[19]));
  txtRegion.setText(Formats.STRING.formatValue(customer[20]));
  //txtCountry.setText(Formats.STRING.formatValue(customer[21]));   
  
  m_CategoryModel.setSelectedKey(customer[22]);
  //m_CountryModel.setSelectedKey(customer[21]);			// ATB: aqui devemos ter o codigo do pais ou o pais?
  //ATB: aqui devemos ter o codigo do pais ou o pais?
  if (CountryHelper.checkCountryCode((String)customer[21]))
	  m_CountryModel.setSelectedKey(customer[21]);			
  else
	  m_CountryModel.setSelectedKey("PT");
  
  m_jTaxID.setEnabled(true);
  m_jSearchkey.setEnabled(true);
  m_jName.setEnabled(true);
  m_jNotes.setEnabled(true);
  txtMaxdebt.setEnabled(true);
  txtCurdebt.setEnabled(true);
  txtCurdate.setEnabled(true);
  m_jVisible.setEnabled(true);
  jcard.setEnabled(true);
         
  txtFirstName.setEnabled(true);
  txtLastName.setEnabled(true);
  txtEmail.setEnabled(true);
  txtPhone.setEnabled(true);
  txtPhone2.setEnabled(true);
  txtFax.setEnabled(true);
 
  txtAddress.setEnabled(true);
  txtAddress2.setEnabled(true);
  txtPostal.setEnabled(true);
  txtCity.setEnabled(true);
  txtRegion.setEnabled(true);
  //txtCountry.setEnabled(true);
  
  m_jCategory.setEnabled(true);
  m_jCountry.setEnabled(true);
  
  jButton2.setEnabled(true);
  jButton3.setEnabled(true);
}

public Object createValue() throws BasicException {
  Object[] customer = new Object[23];
  customer[0] = m_oId == null ? UUID.randomUUID().toString() : m_oId;
  // (ATB) customer[1] = m_jTaxID.getText();
  customer[1] = m_TaxId;				// (ATB)
  customer[2] = m_jSearchkey.getText();
  // (ATB) customer[3] = m_jName.getText();
  customer[3] = m_Name;					// (ATB)
  customer[4] = m_jNotes.getText();
  customer[5] = Boolean.valueOf(m_jVisible.isSelected());
  customer[6] = Formats.STRING.parseValue(jcard.getText()); // Format to manage NULL values
  customer[7] = Formats.CURRENCY.parseValue(txtMaxdebt.getText(), new Double(0.0));
  customer[8] = Formats.TIMESTAMP.parseValue(txtCurdate.getText()); // not saved
  customer[9] = Formats.CURRENCY.parseValue(txtCurdebt.getText()); // not saved
  
  customer[10] = Formats.STRING.parseValue(txtFirstName.getText());
  customer[11] = Formats.STRING.parseValue(txtLastName.getText());
  customer[12] = Formats.STRING.parseValue(txtEmail.getText());
  customer[13] = Formats.STRING.parseValue(txtPhone.getText());
  customer[14] = Formats.STRING.parseValue(txtPhone2.getText());
  customer[15] = Formats.STRING.parseValue(txtFax.getText());
 
  // (ATB) customer[16] = Formats.STRING.parseValue(txtAddress.getText());
  customer[16] = m_Address;					// (ATB)
  customer[17] = Formats.STRING.parseValue(txtAddress2.getText());
  // (ATB) customer[18] = Formats.STRING.parseValue(txtPostal.getText());
  customer[18] = m_PostalCode; 				// (ATB)
  // (ATB) customer[19] = Formats.STRING.parseValue(txtCity.getText());
  customer[19] = m_City;					// (ATB)
  customer[20] = Formats.STRING.parseValue(txtRegion.getText());
  //customer[21] = Formats.STRING.parseValue(txtCountry.getText()); 
  
  customer[22] = m_CategoryModel.getSelectedKey();
  customer[21] = m_CountryModel.getSelectedKey();			// ATB: codigo do pais!!!
    
  return customer;
}   

public Component getComponent() {
  return this;
}    
/** This method is called from within the constructor to
* initialize the form.
* WARNING: Do NOT modify this code. The content of this method is
* always regenerated by the Form Editor.
*/
// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
private void initComponents() {

  jLabel7 = new javax.swing.JLabel();
  m_jTaxID = new javax.swing.JTextField();
  jLabel8 = new javax.swing.JLabel();
  m_jSearchkey = new javax.swing.JTextField();
  jLabel3 = new javax.swing.JLabel();
  m_jName = new javax.swing.JTextField();
  jLabel4 = new javax.swing.JLabel();
  m_jVisible = new javax.swing.JCheckBox();
  jLabel5 = new javax.swing.JLabel();
  jcard = new javax.swing.JTextField();
  jLabel9 = new javax.swing.JLabel();
  m_jCategory = new javax.swing.JComboBox();
  m_jCountry = new javax.swing.JComboBox();
  jButton2 = new javax.swing.JButton();
  jButton3 = new javax.swing.JButton();
  jLabel1 = new javax.swing.JLabel();
  txtMaxdebt = new javax.swing.JTextField();
  jTabbedPane1 = new javax.swing.JTabbedPane();
  jPanel1 = new javax.swing.JPanel();
  jLabel14 = new javax.swing.JLabel();
  txtFax = new javax.swing.JTextField();
  jLabel15 = new javax.swing.JLabel();
  txtLastName = new javax.swing.JTextField();
  jLabel16 = new javax.swing.JLabel();
  txtEmail = new javax.swing.JTextField();
  jLabel17 = new javax.swing.JLabel();
  txtPhone = new javax.swing.JTextField();
  jLabel18 = new javax.swing.JLabel();
  txtPhone2 = new javax.swing.JTextField();
  jLabel19 = new javax.swing.JLabel();
  txtFirstName = new javax.swing.JTextField();
  jPanel2 = new javax.swing.JPanel();
  jLabel13 = new javax.swing.JLabel();
  txtAddress = new javax.swing.JTextField();
  jLabel20 = new javax.swing.JLabel();
  //txtCountry = new javax.swing.JTextField();
  jLabel21 = new javax.swing.JLabel();
  txtAddress2 = new javax.swing.JTextField();
  jLabel22 = new javax.swing.JLabel();
  txtPostal = new javax.swing.JTextField();
  jLabel23 = new javax.swing.JLabel();
  txtCity = new javax.swing.JTextField();
  jLabel24 = new javax.swing.JLabel();
  txtRegion = new javax.swing.JTextField();
  jPanel3 = new javax.swing.JPanel();
  jScrollPane1 = new javax.swing.JScrollPane();
  m_jNotes = new javax.swing.JTextArea();
  jLabel2 = new javax.swing.JLabel();
  txtCurdebt = new javax.swing.JTextField();
  jLabel6 = new javax.swing.JLabel();
  txtCurdate = new javax.swing.JTextField();

  //jLabel7.setText("<html><i>"+AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_taxid))+"</i></html>"); // NOI18N
  jLabel7.setText(StringConstants.getString(StringEnumerates._html__i_)+AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_taxid))+StringConstants.getString(StringEnumerates.__i___html_)); // NOI18N
  
  jLabel8.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_searchkey))); // NOI18N

  //jLabel3.setText("<html><i>"+AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_name))+"</i></html>"); // NOI18N
  jLabel3.setText(StringConstants.getString(StringEnumerates._html__i_)+AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_name))+StringConstants.getString(StringEnumerates.__i___html_)); // NOI18N

  jLabel4.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_visible))); // NOI18N

  jLabel5.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_card))); // NOI18N

  jcard.setEditable(false);

  jLabel9.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_custtaxcategory))); // NOI18N

  jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(StringConstants.getString(StringEnumerates._com_openbravo_images_color_line16_png)))); // NOI18N
  jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton2ActionPerformed(evt);
      }
  });

  jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(StringConstants.getString(StringEnumerates._com_openbravo_images_fileclose_png)))); // NOI18N
  jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton3ActionPerformed(evt);
      }
  });

  jLabel1.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_maxdebt))); // NOI18N

  txtMaxdebt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

  jLabel14.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_fax))); // NOI18N

  jLabel15.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_lastname))); // NOI18N

  jLabel16.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_email))); // NOI18N

  jLabel17.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_phone))); // NOI18N

  jLabel18.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_phone2))); // NOI18N

  jLabel19.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_firstname))); // NOI18N

  javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
  jPanel1.setLayout(jPanel1Layout);
  jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addContainerGap(249, Short.MAX_VALUE))
  );
  jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel19)
              .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel15)
              .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel16)
              .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel17)
              .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel18)
              .addComponent(txtPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel14)
              .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
  );

  // (ATB)(Este painel vai passad a ser o segundo) jTabbedPane1.addTab(AppLocal.getIntString("label.contact"), jPanel1); // NOI18N

  //jLabel13.setText("<html><i>"+AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_address))+"</i></html>"); // NOI18N
  jLabel13.setText(StringConstants.getString(StringEnumerates._html__i_)+AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_address))+StringConstants.getString(StringEnumerates.__i___html_)); // NOI18N

  jLabel20.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_country))); // NOI18N

  jLabel21.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_address2))); // NOI18N

  //jLabel22.setText("<html><i>"+AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_postal))+"</i></html>"); // NOI18N
  jLabel22.setText(StringConstants.getString(StringEnumerates._html__i_)+AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_postal))+StringConstants.getString(StringEnumerates.__i___html_)); // NOI18N

  //jLabel23.setText("<html><i>"+AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_city))+"</i></html>"); // NOI18N
  jLabel23.setText(StringConstants.getString(StringEnumerates._html__i_)+AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_city))+StringConstants.getString(StringEnumerates.__i___html_)); // NOI18N

  jLabel24.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_region))); // NOI18N

  javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
  jPanel2.setLayout(jPanel2Layout);
  jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(m_jCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
//              .addGroup(jPanel2Layout.createSequentialGroup()
//                  .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
//                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                  .addComponent(m_jCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addContainerGap(249, Short.MAX_VALUE))
  );
  jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel13)
              .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel21)
              .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel22)
              .addComponent(txtPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel23)
              .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel24)
              .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel20)
              .addComponent(m_jCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
//          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)              
//          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//              .addComponent(jLabel20)
//              .addComponent(m_jCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))              
          .addGap(267, 267, 267))
  );

  jTabbedPane1.addTab(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_location)), jPanel2); // NOI18N
  jTabbedPane1.addTab(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_contact)), jPanel1); // (ATB)(Este painel vai passar a ser o segundo) 

  jScrollPane1.setViewportView(m_jNotes);

  javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
  jPanel3.setLayout(jPanel3Layout);
  jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
          .addContainerGap()
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
          .addContainerGap())
  );
  jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
          .addContainerGap()
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
          .addContainerGap())
  );

  jTabbedPane1.addTab(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_notes)), jPanel3); // NOI18N

  jLabel2.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_curdebt))); // NOI18N

  txtCurdebt.setEditable(false);
  txtCurdebt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

  jLabel6.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_curdate))); // NOI18N

  txtCurdate.setEditable(false);
  txtCurdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
  this.setLayout(layout);
  layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addGroup(layout.createSequentialGroup()
                      .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addComponent(m_jTaxID, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(layout.createSequentialGroup()
                      .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addComponent(m_jSearchkey, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(layout.createSequentialGroup()
                      .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addComponent(m_jName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(layout.createSequentialGroup()
                      .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(m_jVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(246, 246, 246))
                  .addGroup(layout.createSequentialGroup()
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addGroup(layout.createSequentialGroup()
                              .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jcard, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                          .addGroup(layout.createSequentialGroup()
                              .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(12, 12, 12)
                              .addComponent(m_jCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addComponent(jButton2)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addComponent(jButton3)))
              .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtMaxdebt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtCurdebt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtCurdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addContainerGap())
  );
  layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel7)
              .addComponent(m_jTaxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel8)
              .addComponent(m_jSearchkey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel3)
              .addComponent(m_jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(jLabel5)
                      .addComponent(jcard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(jLabel9)
                      .addComponent(m_jCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addComponent(jButton2)
              .addComponent(jButton3))
          .addGap(6, 6, 6)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel4)
              .addComponent(m_jVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel1)
              .addComponent(txtMaxdebt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2)
              .addComponent(txtCurdebt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel6)
              .addComponent(txtCurdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGap(18, 18, 18)
          //.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap())
  );
}// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  if (JOptionPane.showConfirmDialog(this, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_cardnew)), AppLocal.getIntString(StringConstants.getString(StringEnumerates.title_editor)), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {            
      jcard.setText(StringConstants.getString(StringEnumerates._c) + StringUtils.getCardNumber());
      m_Dirty.setDirty(true);
  }
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  if (JOptionPane.showConfirmDialog(this, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_cardremove)), AppLocal.getIntString(StringConstants.getString(StringEnumerates.title_editor)), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
      jcard.setText(null);
      m_Dirty.setDirty(true);
  }
}//GEN-LAST:event_jButton3ActionPerformed


// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JButton jButton2;
private javax.swing.JButton jButton3;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel13;
private javax.swing.JLabel jLabel14;
private javax.swing.JLabel jLabel15;
private javax.swing.JLabel jLabel16;
private javax.swing.JLabel jLabel17;
private javax.swing.JLabel jLabel18;
private javax.swing.JLabel jLabel19;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel20;
private javax.swing.JLabel jLabel21;
private javax.swing.JLabel jLabel22;
private javax.swing.JLabel jLabel23;
private javax.swing.JLabel jLabel24;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JLabel jLabel7;
private javax.swing.JLabel jLabel8;
private javax.swing.JLabel jLabel9;
private javax.swing.JPanel jPanel1;
private javax.swing.JPanel jPanel2;
private javax.swing.JPanel jPanel3;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTabbedPane jTabbedPane1;
private javax.swing.JTextField jcard;
private javax.swing.JComboBox m_jCategory;
private javax.swing.JTextField m_jName;
private javax.swing.JTextArea m_jNotes;
private javax.swing.JTextField m_jSearchkey;
private javax.swing.JTextField m_jTaxID;
private javax.swing.JCheckBox m_jVisible;
private javax.swing.JTextField txtAddress;
private javax.swing.JTextField txtAddress2;
private javax.swing.JTextField txtCity;
//private javax.swing.JTextField txtCountry;
private javax.swing.JComboBox m_jCountry;			// Novo, para suportar a selecao do pais, para efeitos de NIF e SAFT!
private javax.swing.JTextField txtCurdate;
private javax.swing.JTextField txtCurdebt;
private javax.swing.JTextField txtEmail;
private javax.swing.JTextField txtFax;
private javax.swing.JTextField txtFirstName;
private javax.swing.JTextField txtLastName;
private javax.swing.JTextField txtMaxdebt;
private javax.swing.JTextField txtPhone;
private javax.swing.JTextField txtPhone2;
private javax.swing.JTextField txtPostal;
private javax.swing.JTextField txtRegion;
// End of variables declaration//GEN-END:variables

// (ATB)(INICIO)

// (ATB) Colocar os campos "chave" do Customer em ReadOnly
public void setReadOnly() {
	  m_jTaxID.setEditable(false);
}

//(ATB) Colocar os campos "chave" do Customer em ReadWrite
public void setReadWrite() {
	m_jTaxID.setEditable(true);
}

private class TaxIDManager implements DocumentListener, ActionListener {
	private void verify() {
		if (m_jTaxID.isEditable()==false) {
			m_TaxId=m_jTaxID.getText();
			return;
		}
		
		if (!m_TaxIdLock) {
			m_TaxIdLock=true;
			

			String s=m_jTaxID.getText();

			boolean val=s.matches(StringConstants.getString(StringEnumerates.___p_Digit___));
			
			if (s.length()!=9) val=false;
			
			if (!val) {
				m_jTaxID.setBackground(Color.RED);
			}
			else {
				if (s.compareTo("")==0) {
					m_jTaxID.setBackground(Color.RED);
				}
				else {
					m_jTaxID.setBackground(Color.WHITE);
					m_TaxId=s;
				}
			}
			m_TaxIdLock=false;
		}
	}
    public void changedUpdate(DocumentEvent e) {
    	verify();
    }
    
    /* foram inseridos dados no "documento/controlo" */
    public void insertUpdate(DocumentEvent e) {
    	verify();
    }
    
    /* foram removidos dados no "documento/controlo" */
    public void removeUpdate(DocumentEvent e) {
    	verify();
    }         
    public void actionPerformed(ActionEvent e) {
    	verify();
    }
}

private class NameManager implements DocumentListener, ActionListener {
	private void verify() {
		if (!m_NameLock) {
			m_NameLock=true;
			
			String s=m_jName.getText();

			// (ATB)(2012-03-05) Validar a entrada de dados
			//boolean val=s.matches("[.&&[^\\p{Punct}]]+");
			//boolean val=s.matches("[\\p{Alpha}\\p{Digit}\\p{Space}\\u002e]+");
			boolean val=s.matches(StringConstants.getString(StringEnumerates._____p_InBasicLatin___p_InLatin_1Supplement___p_Digit___p_Space________p_Punct______u002e___));
			
			if (!val) {
				m_jName.setBackground(Color.RED);
			}
			else {
// (ATB)(2013-01-10) Vamos permitir que fique em branco				
//				if (s.compareTo("")==0) {
//					m_jName.setBackground(Color.RED);
//				}
//				else {
					m_jName.setBackground(Color.WHITE);
					m_Name=s;
//				}
			}
			m_NameLock=false;
		}
	}
    public void changedUpdate(DocumentEvent e) {
    	//m_TaxId="0";
    	verify();
    }
    
    /* foram inseridos dados no "documento/controlo" */
    public void insertUpdate(DocumentEvent e) {
    	//m_TaxId="1";
    	verify();
    }
    
    /* foram removidos dados no "documento/controlo" */
    public void removeUpdate(DocumentEvent e) {
    	//m_TaxId="2";
    	verify();
    }         
    public void actionPerformed(ActionEvent e) {
    	//m_TaxId="3";
    	verify();
    }
}

private class AddressManager implements DocumentListener, ActionListener {
	private void verify() {
		if (!m_AddressLock) {
			m_AddressLock=true;
			
			String s=txtAddress.getText();
			
			boolean val=s.matches(StringConstants.getString(StringEnumerates._____p_InBasicLatin___p_InLatin_1Supplement___p_Digit___p_Space________p_Punct______u002e___));
			
			if (!val) {
				txtAddress.setBackground(Color.RED);
			}
			else {
				// (ATB)(2013-01-10) Vamos permitir que fique em branco				
//				if (s.compareTo("")==0) {
//					txtAddress.setBackground(Color.RED);
//				}
//				else {
					txtAddress.setBackground(Color.WHITE);
					m_Address=s;
//				}
			}
			m_AddressLock=false;
		}
	}
    public void changedUpdate(DocumentEvent e) {
    	verify();
    }
    
    /* foram inseridos dados no "documento/controlo" */
    public void insertUpdate(DocumentEvent e) {
    	verify();
    }
    
    /* foram removidos dados no "documento/controlo" */
    public void removeUpdate(DocumentEvent e) {
    	verify();
    }         
    public void actionPerformed(ActionEvent e) {
    	verify();
    }
}

private class PostalCodeManager implements DocumentListener, ActionListener {
	private void verify() {
		if (!m_PostalCodeLock) {
			m_PostalCodeLock=true;
			
			String s=txtPostal.getText();

			//boolean val=s.matches("[\\p{InBasicLatin}\\p{InLatin-1Supplement}\\p{Digit}\\p{Space}\\u002e\\u002d]+");
			boolean val=s.matches(StringConstants.getString(StringEnumerates._____p_InBasicLatin___p_InLatin_1Supplement___p_Digit___p_Space________p_Punct______u002e__u002d___));
			
			if (!val) {
				txtPostal.setBackground(Color.RED);
			}
			else {
				// (ATB)(2013-01-10) Vamos permitir que fique em branco
//				if (s.compareTo("")==0) {
//					txtPostal.setBackground(Color.RED);
//				}
//				else {
					txtPostal.setBackground(Color.WHITE);
					m_PostalCode=s;
//				}
			}
			m_PostalCodeLock=false;
		}
	}
    public void changedUpdate(DocumentEvent e) {
    	verify();
    }
    
    /* foram inseridos dados no "documento/controlo" */
    public void insertUpdate(DocumentEvent e) {
    	verify();
    }
    
    /* foram removidos dados no "documento/controlo" */
    public void removeUpdate(DocumentEvent e) {
    	verify();
    }         
    public void actionPerformed(ActionEvent e) {
    	verify();
    }
}

private class CityManager implements DocumentListener, ActionListener {
	private void verify() {
		if (!m_CityLock) {
			m_CityLock=true;
			
			String s=txtCity.getText();
			
//			boolean val=s.matches("[\\p{InBasicLatin}\\p{InLatin-1Supplement}\\p{Digit}\\p{Space}\\u002e]+");
			boolean val=s.matches(StringConstants.getString(StringEnumerates._____p_InBasicLatin___p_InLatin_1Supplement___p_Digit___p_Space________p_Punct______u002e___));
						
			if (!val) {
				txtCity.setBackground(Color.RED);
			}
			else {
				// (ATB)(2013-01-10) Vamos permitir que fique em branco
//				if (s.compareTo("")==0) {
//					txtCity.setBackground(Color.RED);
//				}
//				else {
					txtCity.setBackground(Color.WHITE);
					m_City=s;
//				}
			}
			m_CityLock=false;
		}
	}
    public void changedUpdate(DocumentEvent e) {
    	verify();
    }
    
    /* foram inseridos dados no "documento/controlo" */
    public void insertUpdate(DocumentEvent e) {
    	verify();
    }
    
    /* foram removidos dados no "documento/controlo" */
    public void removeUpdate(DocumentEvent e) {
    	verify();
    }         
    public void actionPerformed(ActionEvent e) {
    	verify();
    }
}


// (ATB) (FIM)
}

