/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.company;

import java.awt.Component;
import java.util.UUID;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.user.DirtyManager;
import com.openbravo.data.user.EditorRecord;
import com.openbravo.format.Formats;
import com.openbravo.pos.forms.AppLocal;

public class CompanyView extends javax.swing.JPanel implements EditorRecord {

    private String m_sID;
    
    /* nome, morada, nif, registo comercial */
    /* name, address, taxID, postal, city, region, country, businessRegistration*/
    /** Creates new form LocationsEditor */
    public CompanyView(DirtyManager dirty) {
        initComponents();
        
        m_jName.getDocument().addDocumentListener(dirty);
        m_jAddress.getDocument().addDocumentListener(dirty);
        m_jTaxID.getDocument().addDocumentListener(dirty);
        m_jPostal.getDocument().addDocumentListener(dirty);
        m_jCity.getDocument().addDocumentListener(dirty);
        m_jRegion.getDocument().addDocumentListener(dirty);
        m_jCountry.getDocument().addDocumentListener(dirty);
        m_jBusinessReg.getDocument().addDocumentListener(dirty);
        
        writeValueEOF();    
    }
    
	@Override
	public Object createValue() throws BasicException {
        Object[] location = new Object[9];
        location[0] = m_sID;
        location[1] = m_jName.getText();
        location[2] = m_jAddress.getText();
        location[3] = m_jTaxID.getText();
        location[4] = m_jPostal.getText();
        location[5] = m_jCity.getText();
        location[6] = m_jRegion.getText();
        location[7] = m_jCountry.getText();
        location[8] = m_jBusinessReg.getText();
        
        return location;
	}

	@Override
	public void writeValueEOF() {
        m_sID = null;
        m_jName.setText(null);
        m_jAddress.setText(null);
        m_jTaxID.setText(null);
        m_jPostal.setText(null);
        m_jCity.setText(null);
        m_jRegion.setText(null);
        m_jCountry.setText(null);
        m_jBusinessReg.setText(null);        

        m_jName.setEnabled(false);
        m_jAddress.setEnabled(false);
        m_jTaxID.setEnabled(false);
        m_jPostal.setEnabled(false);
        m_jCity.setEnabled(false);
        m_jRegion.setEnabled(false);
        m_jCountry.setEnabled(false);
        m_jBusinessReg.setEnabled(false);        
	}

	@Override
	public void writeValueInsert() {
        m_sID = UUID.randomUUID().toString(); 
        m_jName.setText(null);
        m_jAddress.setText(null);
        m_jTaxID.setText(null);
        m_jPostal.setText(null);
        m_jCity.setText(null);
        m_jRegion.setText(null);
        m_jCountry.setText(null);
        m_jBusinessReg.setText(null);        
        

        m_jName.setEnabled(true);
        m_jAddress.setEnabled(true);
        m_jTaxID.setEnabled(true);
        m_jPostal.setEnabled(true);
        m_jCity.setEnabled(true);
        m_jRegion.setEnabled(true);
        m_jCountry.setEnabled(true);
        m_jBusinessReg.setEnabled(true);        
	}

	@Override
	public void writeValueEdit(Object value) {
        
        Object[] location = (Object[]) value;
        m_sID = Formats.STRING.formatValue(location[0]);
        m_jName.setText(Formats.STRING.formatValue(location[1]));
        m_jAddress.setText(Formats.STRING.formatValue(location[2]));
        m_jTaxID.setText(Formats.STRING.formatValue(location[3]));
        m_jPostal.setText(Formats.STRING.formatValue(location[4]));
        m_jCity.setText(Formats.STRING.formatValue(location[5]));
        m_jRegion.setText(Formats.STRING.formatValue(location[6]));
        m_jCountry.setText(Formats.STRING.formatValue(location[7]));
        m_jBusinessReg.setText(Formats.STRING.formatValue(location[8]));
 
        m_jName.setEnabled(true);
        m_jAddress.setEnabled(true);
        m_jTaxID.setEnabled(true);
        m_jPostal.setEnabled(true);
        m_jCity.setEnabled(true);
        m_jRegion.setEnabled(true);
        m_jCountry.setEnabled(true);
        m_jBusinessReg.setEnabled(true);        
	}

	@Override
	public void writeValueDelete(Object value) {
        
        Object[] location = (Object[]) value;
        m_sID = Formats.STRING.formatValue(location[0]);
        m_jName.setText(Formats.STRING.formatValue(location[1]));
        m_jAddress.setText(Formats.STRING.formatValue(location[2]));
        m_jTaxID.setText(Formats.STRING.formatValue(location[3]));
        m_jPostal.setText(Formats.STRING.formatValue(location[4]));
        m_jCity.setText(Formats.STRING.formatValue(location[5]));
        m_jRegion.setText(Formats.STRING.formatValue(location[6]));
        m_jCountry.setText(Formats.STRING.formatValue(location[7]));
        m_jBusinessReg.setText(Formats.STRING.formatValue(location[8]));
        
        m_jName.setEnabled(false);
        m_jAddress.setEnabled(false);
        m_jTaxID.setEnabled(false);
        m_jPostal.setEnabled(false);
        m_jCity.setEnabled(false);
        m_jRegion.setEnabled(false);
        m_jCountry.setEnabled(false);
        m_jBusinessReg.setEnabled(false);        
	}

	@Override
	public void refresh() {
	}

	@Override
	public Component getComponent() {
        return this;
	}
	
    private void initComponents() {
    	jLabelWarnning1 = new javax.swing.JLabel();
    	jLabelWarnning2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        m_jName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        m_jAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        m_jTaxID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        m_jPostal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        m_jCity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        m_jRegion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        m_jCountry = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        m_jBusinessReg = new javax.swing.JTextField();

        setLayout(null);

        //-----------
        jLabelWarnning1.setText(StringConstants.getString(StringEnumerates.Nota__Apenas_deve_definir_1_registo_de_empresa_));
        add(jLabelWarnning1);
        jLabelWarnning1.setBounds(20, 20, 400, 15);

        jLabelWarnning2.setText(StringConstants.getString(StringEnumerates.Se_existirem_mais__apenas_o_ultimo_e_considerado_));
        add(jLabelWarnning2);
        jLabelWarnning2.setBounds(20, 40, 400, 15);

        //-------
        jLabel2.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_locationname)));
        add(jLabel2);
        jLabel2.setBounds(20, 70, 120, 15);

        add(m_jName);
        m_jName.setBounds(140, 70, 260, 19);

        //--------
        jLabel3.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.label_locationaddress)));
        add(jLabel3);
        jLabel3.setBounds(20, 100, 120, 15);

        add(m_jAddress);
        m_jAddress.setBounds(140, 100, 260, 19);

        //--------
        jLabel4.setText(StringConstants.getString(StringEnumerates.NIF));
        add(jLabel4);
        jLabel4.setBounds(20, 130, 120, 15);

        add(m_jTaxID);
        m_jTaxID.setBounds(140, 130, 260, 19);

        //--------
        jLabel5.setText(StringConstants.getString(StringEnumerates.Codigo_Postal));
        add(jLabel5);
        jLabel5.setBounds(20, 160, 120, 15);

        add(m_jPostal);
        m_jPostal.setBounds(140, 160, 260, 19);

        //--------
        jLabel6.setText(StringConstants.getString(StringEnumerates.Cidade));
        add(jLabel6);
        jLabel6.setBounds(20, 190, 120, 15);

        add(m_jCity);
        m_jCity.setBounds(140, 190, 260, 19);

        //--------
        jLabel7.setText(StringConstants.getString(StringEnumerates.Distrito));
        add(jLabel7);
        jLabel7.setBounds(20, 220, 120, 15);

        add(m_jRegion);
        m_jRegion.setBounds(140, 220, 260, 19);

        //--------
        jLabel8.setText(StringConstants.getString(StringEnumerates.Pais));
        add(jLabel8);
        jLabel8.setBounds(20, 250, 120, 15);

        add(m_jCountry);
        m_jCountry.setBounds(140, 250, 260, 19);

        //--------
        jLabel9.setText(StringConstants.getString(StringEnumerates.Registo_Comercial));
        add(jLabel9);
        jLabel9.setBounds(20, 280, 120, 15);

        add(m_jBusinessReg);
        m_jBusinessReg.setBounds(140, 280, 260, 19);
    }
    
    // Variables declaration
    private javax.swing.JLabel jLabelWarnning1;
    private javax.swing.JLabel jLabelWarnning2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField m_jAddress;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField m_jName;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField m_jTaxID;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField m_jPostal;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField m_jCity;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField m_jRegion;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField m_jCountry;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField m_jBusinessReg;
    // End of variables declaration

}
