/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *
 * */
package pt.ktc.openk.pos.saft;

import javax.swing.*;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.pt1_01.Pt1_01Factory;
import oecd.standard.audit.file.tax.pt1_01.util.Pt1_01ResourceFactoryImpl;
import oecd.standard.audit.file.tax.pt1_01.util.Pt1_01ResourceImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLInfoImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import pt.ktc.openk.pos.utils.DirectoryEvent;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;
import pt.ktc.openk.pos.validade.ValidateXML;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.openbravo.basic.BasicException;
import com.openbravo.beans.JCalendarDialog;

import com.openbravo.pos.customers.CustomerInfo;
import com.openbravo.pos.customers.CustomerInfoExt;
import com.openbravo.pos.customers.DataLogicCustomers;
import com.openbravo.pos.forms.*;
import com.openbravo.pos.ticket.FindTicketsInfo;
import com.openbravo.pos.ticket.ProductFilter;
import com.openbravo.pos.ticket.ProductInfoExt;
import com.openbravo.pos.ticket.TaxInfo;
import com.openbravo.pos.ticket.TicketInfo;
import com.openbravo.pos.ticket.TicketLineInfo;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.gui.JMessageDialog;
import com.openbravo.data.loader.SentenceList;
import com.openbravo.data.loader.StaticSentence;
import com.openbravo.format.Formats;


public class JPanelSaft extends JPanel implements JPanelView {
	
	private static Logger logger = Logger.getLogger(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_saft_JPanelSaft));

	private AppView m_oApp;

	/** Creates new form JPanelConfiguration */
	public JPanelSaft(AppView oApp) {
		this(oApp.getProperties());
		m_oApp=oApp;
	}

	public JPanelSaft(AppProperties props) {

		//config = new AppConfig(props.getConfigFile());

		myInitComponents();
	}

	public JComponent getComponent() {
		return this;
	}

	public String getTitle() {
		return AppLocal.getIntString(StringConstants.getString(StringEnumerates.Menu_SAFT_PT));
	} 

	public void activate() throws BasicException {
		//loadProperties();        
	}

	public boolean deactivate() {

		return true;
	}      

	private void myInitComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		m_jSAFTOptions = new javax.swing.JPanel();

		m_jSAFTOptions.setLayout(new javax.swing.BoxLayout(m_jSAFTOptions, javax.swing.BoxLayout.Y_AXIS));
		jScrollPane1.setViewportView(m_jSAFTOptions);

		//---------------
		javax.swing.JPanel jPanel1 = new javax.swing.JPanel();

		//jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(AppLocal.getIntString("Label.Database"))); // NOI18N

		jlblDataInicio=new JLabel();
		jlblDataInicio.setText(StringConstants.getString(StringEnumerates.Data_Inicio_));

		jtxtDataInicio = new javax.swing.JTextField();  

		jlblDataFim=new JLabel();
		jlblDataFim.setText(StringConstants.getString(StringEnumerates.Data_Fim_));

		jtxtDataFim = new javax.swing.JTextField();

		bStartDate = new javax.swing.JButton();
		//bStartDate.setText("Executar");
		bStartDate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtnStartDate(evt);
			}
		}); 
		bStartDate.setToolTipText(StringConstants.getString(StringEnumerates.Selecione_uma_data));
		bStartDate.setIcon(new javax.swing.ImageIcon(getClass().getResource(StringConstants.getString(StringEnumerates._com_openbravo_images_date_png)))); // NOI18N

		bEndDate = new javax.swing.JButton();
		//bEndDate.setText("Executar");
		bEndDate.setToolTipText(StringConstants.getString(StringEnumerates.Selecione_uma_data));
		bEndDate.setIcon(new javax.swing.ImageIcon(getClass().getResource(StringConstants.getString(StringEnumerates._com_openbravo_images_date_png)))); // NOI18N
		bEndDate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtnEndDate(evt);
			}
		});

		bGenerate = new javax.swing.JButton();
		bGenerate.setText(StringConstants.getString(StringEnumerates.Gerar_Ficheiro_SAFT_PT));
		bGenerate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtnGenerate(evt);
			}
		});  
		
		jtxtSAFTFile = new javax.swing.JTextField();
		bSelFile = new javax.swing.JButton();
		bSelFile.setText(StringConstants.getString(StringEnumerates.Seleccionar_ficheiro_a_gerar));
		bSelFile.addActionListener(new DirectoryEvent(jtxtSAFTFile));
		
		bLoadFile = new javax.swing.JButton();
		bLoadFile.setText(StringConstants.getString(StringEnumerates.Consultar_Ficheiro_SAFT_PT));
		bLoadFile.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtnLoadFile(evt);
			}
		});  
		
		// Label para ter a animacao de progresso...
		jlblProgress=new javax.swing.JLabel();
		
		// Para o output do processo
		jtxtOutput = new javax.swing.JTextArea();
		jtxtOutput.setEditable(false);
		
		// Scroll para o output
		jScrollPaneFile = new JScrollPane(jtxtOutput);
		//--------------------

		javax.swing.JPanel jPanel2 = new javax.swing.JPanel();

		jPanel2.add(jlblDataInicio);
		jPanel2.add(jtxtDataInicio);
		jPanel2.add(jlblDataFim);
		jPanel2.add(jtxtDataFim);
		jPanel2.add(bStartDate);
		jPanel2.add(bEndDate);

		GroupLayout layout2 = new GroupLayout(jPanel2);

		jPanel2.setLayout(layout2);

		// Disposicao horizontal
		GroupLayout.SequentialGroup hGroup = layout2.createSequentialGroup();
		//hGroup.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
		// Coluna 1
		hGroup.addContainerGap();
		// Coluna 2
		hGroup.addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jlblDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jlblDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
		);
		// Coluna 3
		hGroup.addGap(5);
		// Coluna 4
		//hGroup.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
		hGroup.addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jtxtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jtxtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE));
		// Coluna 5
		//hGroup.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
		hGroup.addGap(5);
		// Coluna 6
		hGroup.addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(bStartDate)
				.addComponent(bEndDate));
		layout2.setHorizontalGroup(hGroup);
		//----------------

		// Disposicao vertical
		GroupLayout.SequentialGroup vGroup = layout2.createSequentialGroup();
		// Linha 1
		vGroup.addContainerGap();
		// Linha 2
		vGroup.addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jlblDataInicio)
				.addComponent(jtxtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(bStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE));
		// Linha 3
		vGroup.addGap(5);
		// Linha 4
		vGroup.addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jlblDataFim)
				.addComponent(jtxtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(bEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE));
		// Linha 5
		layout2.setVerticalGroup(vGroup);
		//----------------

		javax.swing.JPanel jPanel3 = new javax.swing.JPanel();

		jPanel3.add(bGenerate);
		jPanel3.add(jtxtSAFTFile);
		jPanel3.add(bSelFile);
		jPanel3.add(bLoadFile);
		jPanel3.add(jlblProgress);
		
		URL imgUrl=this.getClass().getResource(StringConstants.getString(StringEnumerates._pt_ktc_openk_pos_images_work_in_progress_jpg));
		//imgUrl=this.getClass().getResource("/pt/ktc/openk/images/refund.png");
	    ImageIcon ii = new ImageIcon(imgUrl);
		jlblProgress.setIcon(ii);
		jlblProgress.setVisible(true);

		GroupLayout layout3 = new GroupLayout(jPanel3);

		jPanel3.setLayout(layout3);

		// Disposicao horizontal
		hGroup = layout3.createSequentialGroup();
		// Coluna 1
		hGroup.addContainerGap();
		// Coluna 2
		hGroup.addGroup(layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(bSelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(bGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE));
		// Coluna 3
		hGroup.addGap(5);
		// Coluna 4
		hGroup.addGroup(layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jtxtSAFTFile, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(bLoadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE));
		// Coluna 5
		hGroup.addGap(5);
		// Coluna 6
		hGroup.addGroup(layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jlblProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE));	
		layout3.setHorizontalGroup(hGroup);
		//----------------

		// Disposicao vertical
		vGroup = layout3.createSequentialGroup();
		// Linha 1
		vGroup.addContainerGap();
		// Linha 2
		vGroup.addGroup(layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(bSelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jtxtSAFTFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jlblProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE));
		// Linha 3
		vGroup.addGap(5);
		// Linha 4
		vGroup.addGroup(layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(bGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(bLoadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE));
		layout3.setVerticalGroup(vGroup);
		//----------------
		
		// Um painel para o output
		javax.swing.JPanel jPanel4 = new javax.swing.JPanel();

		//jPanel3.add(jtxtOutput);
		jPanel4.add(jScrollPaneFile);

		GroupLayout layout4 = new GroupLayout(jPanel4);

		jPanel4.setLayout(layout4);

		// Disposicao horizontal
		hGroup = layout4.createSequentialGroup();
		// Coluna 1
		hGroup.addContainerGap();
		// Coluna 2
		hGroup.addGroup(layout4.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPaneFile, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE));
		layout4.setHorizontalGroup(hGroup);
		//----------------

		// Disposicao vertical
		vGroup = layout4.createSequentialGroup();
		// Linha 1
		vGroup.addContainerGap();
		// Linha 2
		vGroup.addGroup(layout4.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPaneFile, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE));
		layout4.setVerticalGroup(vGroup);
		//----------------
		
		//--------------------------

		m_jSAFTOptions.add(jPanel1);
		//jPanel1.setLayout(new BorderLayout());
		jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
		//jPanel1.add(jPanel2, BorderLayout.WEST);
		//jPanel1.add(bGenerate, BorderLayout.WEST);
		jPanel2.setAlignmentX(LEFT_ALIGNMENT);
		jPanel1.add(jPanel2);
		jPanel3.setAlignmentX(LEFT_ALIGNMENT);
		jPanel1.add(jPanel3);
		jPanel4.setAlignmentX(LEFT_ALIGNMENT);
		jPanel1.add(jPanel4);
		
		//bGenerate.setAlignmentX(LEFT_ALIGNMENT);
		//jPanel1.add(bGenerate);

		// Para o scroll
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
						)
						.addContainerGap()
				)
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addContainerGap()
				)
		);
	}

	private void jbtnStartDate(java.awt.event.ActionEvent evt) {

		Date date;
		try {
			date = (Date) Formats.TIMESTAMP.parseValue(jtxtDataInicio.getText());
		} catch (BasicException e) {
			date = null;
		}        
		date = JCalendarDialog.showCalendarTimeHours(this, date);
		if (date != null) {
			jtxtDataInicio.setText(Formats.TIMESTAMP.formatValue(date));
		}             

	}

	private void jbtnEndDate(java.awt.event.ActionEvent evt) {

		Date date;
		try {
			date = (Date) Formats.TIMESTAMP.parseValue(jtxtDataFim.getText());
		} catch (BasicException e) {
			date = null;
		}        
		date = JCalendarDialog.showCalendarTimeHours(this, date);
		if (date != null) {
			jtxtDataFim.setText(Formats.TIMESTAMP.formatValue(date));
		}             

	}

	private String trimGUID(String s) {
		String s2;

		s2=s.substring(0,8)+s.substring(9, 13)+s.substring(14, 18)+s.substring(19, 23)+s.substring(24, 34);

		return s2;
	}

	// Nova Versao do SAFT PT
	private void generateSaftPt_1_01_01(Date d1, Date d2, String xmlFile) {
		// Gerar o ficheiro SAFT-PT

		DataLogicSystem dlSystem = (DataLogicSystem) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSystem));
		DataLogicSales m_dlSales = (DataLogicSales) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSales));
		DataLogicCustomers dlCustomers  = (DataLogicCustomers) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_customers_DataLogicCustomers));
		
		jtxtOutput.append(StringConstants.getString(StringEnumerates.A_exportar_dados_para_ficheiro_SAF_T_PT__)+xmlFile+StringConstants.getString(StringEnumerates._newline));

		String s="";
		try {
			s=dlSystem.findVersion();

			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(StringConstants.getString(StringEnumerates.saft), new Pt1_01ResourceFactoryImpl());

			// Criar em memoria o modelo do SAFT
			// Primeiro o documentRoot
			oecd.standard.audit.file.tax.pt1_01.DocumentRoot root= Pt1_01Factory.eINSTANCE.createDocumentRoot();

			// o AuditFile
			oecd.standard.audit.file.tax.pt1_01.AuditFileType aft = Pt1_01Factory.eINSTANCE.createAuditFileType();

			jtxtOutput.append(StringConstants.getString(StringEnumerates.___a_exportar_dados_gerais__Header____));
			
			// o Header
			oecd.standard.audit.file.tax.pt1_01.HeaderType ht=Pt1_01Factory.eINSTANCE.createHeaderType();
			ht.setCompanyName(StringConstants.getString(StringEnumerates.KTC));
			ht.setAuditFileVersion(StringConstants.getString(StringEnumerates._1_01_01));
			ht.setCompanyID(StringConstants.getString(StringEnumerates._507287584));					// A empresa a qual os dados se referem. O registo comercial da empresa ou o seu NIF
			ht.setBusinessName(StringConstants.getString(StringEnumerates.KTC_Formacao));				// Designacao comercial (FACULTATIVO)
			ht.setTaxRegistrationNumber(new BigInteger(StringConstants.getString(StringEnumerates._507287584)));
			ht.setTaxEntity(StringConstants.getString(StringEnumerates.Global));
			ht.setCurrencyCode(StringConstants.getString(StringEnumerates.EUR));
			ht.setDateCreated(DatatypeFactory.newInstance().newXMLGregorianCalendarDate(2010, 11, 10, 0));
			ht.setProductID(StringConstants.getString(StringEnumerates.OpenK_POS_KTC));
			ht.setProductVersion(StringConstants.getString(StringEnumerates.v1_0));
			ht.setProductCompanyTaxID(StringConstants.getString(StringEnumerates._507287584));			// A empresa que produz o software
			ht.setSoftwareCertificateNumber(StringConstants.getString(StringEnumerates._1234));			// Numero do certificado de software, 0 se nao for aplicavel

			// O ano fiscal tem de se ir buscar as datas do relatorio:
			GregorianCalendar cal_d1=new GregorianCalendar();
			cal_d1.setTime(d1);
			XMLGregorianCalendar xgcal_d1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal_d1);
			int d1_year=xgcal_d1.getYear();	 
			int d1_month=xgcal_d1.getMonth();   // 1 - 12
			int d1_day=xgcal_d1.getDay();	     // 1 - 31

			GregorianCalendar cal_d2=new GregorianCalendar();
			cal_d2.setTime(d2);
			XMLGregorianCalendar xgcal_d2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal_d2);
			int d2_year=xgcal_d2.getYear();	 
			int d2_month=xgcal_d2.getMonth();   // 1 - 12
			int d2_day=xgcal_d2.getDay();	     // 1 - 31

			// O ano e' sempre o ano da primeira data:
			int year=d1_year;
			if (d2_year!=d1_year) {
				d2_year=d1_year;
				d2_month=12;
				d2_day=31;
			}

			ht.setFiscalYear(new BigInteger(Integer.valueOf(year).toString()));
			ht.setStartDate(DatatypeFactory.newInstance().newXMLGregorianCalendarDate(d1_year, d1_month, d1_day, 0));
			ht.setEndDate(DatatypeFactory.newInstance().newXMLGregorianCalendarDate(d2_year, d2_month, d2_day, 0));

			ht.setTaxAccountingBasis(oecd.standard.audit.file.tax.pt1_01.TaxAccountingBasisType.F);

			oecd.standard.audit.file.tax.pt1_01.AddressStructurePT ad=Pt1_01Factory.eINSTANCE.createAddressStructurePT();
			ad.setCity(StringConstants.getString(StringEnumerates.Santa_Maria_da_feira));
			ad.setRegion(StringConstants.getString(StringEnumerates.Aveiro));
			//EDataType es=EcorePackage.eINSTANCE.getEString();
			ad.setCountry(StringConstants.getString(StringEnumerates.PT));
			ad.setPostalCode(StringConstants.getString(StringEnumerates._4520_706));
			ad.setAddressDetail(StringConstants.getString(StringEnumerates.Rua_EN_327__1315));
			ht.setCompanyAddress(ad);

			// acrescentar o header ao auditFile
			aft.setHeader(ht);

			// (atb) o SourceDocuments ...
			oecd.standard.audit.file.tax.pt1_01.SourceDocumentsType sd=Pt1_01Factory.eINSTANCE.createSourceDocumentsType();

			aft.setSourceDocuments(sd);

			// acrescentar o masterFiles
			oecd.standard.audit.file.tax.pt1_01.MasterFilesType mf = Pt1_01Factory.eINSTANCE.createMasterFilesType();

			// salesinvoices
			oecd.standard.audit.file.tax.pt1_01.SalesInvoicesType si=Pt1_01Factory.eINSTANCE.createSalesInvoicesType();
			//(???????)sd.getSalesInvoices().add(si);

			// aparentemente e' obigatorio nesta versao ter um generalledger
			//		oecd.standard.audit.file.tax.pt1_01.GeneralLedgerType gl = Pt1_01Factory.eINSTANCE.createGeneralLedgerType();
			//		
			//		gl.setAccountDescription("descricao");
			//		gl.setAccountID("1110001");
			//		gl.setOpeningCreditBalance(new BigDecimal(0.0));
			//		gl.setOpeningDebitBalance(new BigDecimal(0.0));
			//		
			//		// acrescentar o generalledger ao masterFile
			//		mf.getGeneralLedger().add(gl);
		
			jtxtOutput.append(StringConstants.getString(StringEnumerates.ok__n));
			jtxtOutput.append(StringConstants.getString(StringEnumerates.___a_exportar_dados_de_clientes__Customers____));

			// Vamos agora acrescentar os clientes da base de dados
			SentenceList list=dlCustomers.getCustomerList();

			// Vamos introduzir o cliente "generico"
			oecd.standard.audit.file.tax.pt1_01.CustomerType cs = Pt1_01Factory.eINSTANCE.createCustomerType();

			cs.setCompanyName(StringConstants.getString(StringEnumerates.Consumidor_final));
			cs.setAccountID(StringConstants.getString(StringEnumerates.Desconhecido));
			cs.setContact(StringConstants.getString(StringEnumerates.Cliente_Generico));
			cs.setCustomerID(StringConstants.getString(StringEnumerates._0));
			cs.setCustomerTaxID(StringConstants.getString(StringEnumerates._999999990));
			//cs.setEmail("");
			//cs.setFax("");
			//cs.setTelephone("");
			//cs.setWebsite("");
			cs.setSelfBillingIndicator(new BigInteger(StringConstants.getString(StringEnumerates._0)));

			oecd.standard.audit.file.tax.pt1_01.AddressStructure add = Pt1_01Factory.eINSTANCE.createAddressStructure();
			add.setAddressDetail(StringConstants.getString(StringEnumerates.Desconhecido));
			//add.setBuildingNumber(" ");    // Minimo 1 caracter
			add.setCity(StringConstants.getString(StringEnumerates.Desconhecido));
			add.setCountry(StringConstants.getString(StringEnumerates.Desconhecido));
			add.setPostalCode(StringConstants.getString(StringEnumerates.Desconhecido));
			//add.setRegion("");
			//add.setStreetName("");
			cs.setBillingAddress(add);

			add = Pt1_01Factory.eINSTANCE.createAddressStructure();
			add.setAddressDetail(StringConstants.getString(StringEnumerates.Desconhecido));
			//add.setBuildingNumber(" ");
			add.setCity(StringConstants.getString(StringEnumerates.Desconhecido));
			add.setCountry(StringConstants.getString(StringEnumerates.Desconhecido));
			add.setPostalCode(StringConstants.getString(StringEnumerates.Desconhecido));
			//add.setRegion("");
			//add.setStreetName("");
			cs.setShipToAddress(add);

			// acrescentar o cliente ao masterFile
			mf.getCustomer().add(cs);	

			for(Object f: list.list().toArray()) {
				CustomerInfo cust=(CustomerInfo) f;

				//System.out.println(cust.getName());

				CustomerInfoExt custExt=m_dlSales.loadCustomerExt(cust.getId());

				//System.out.println(custExt.getTaxid());

				// Exemplo de insercao de um cliente
				cs = Pt1_01Factory.eINSTANCE.createCustomerType();

				cs.setAccountID(StringConstants.getString(StringEnumerates.Desconhecido));				// Nao se sabe qual a conta corrente na contabilidade
				cs.setCompanyName(cust.getName());
				cs.setContact(custExt.getFirstname()+ StringConstants.getString(StringEnumerates._space)+custExt.getLastname());
				cs.setCustomerID(this.trimGUID(custExt.getId()));      // O customerID so pode ter 30 caracteres. Faz-se o trim de 36 do guid para 30...
				cs.setCustomerTaxID(cust.getTaxid());
				cs.setEmail(custExt.getEmail());
				cs.setFax(custExt.getFax());
				cs.setTelephone(custExt.getPhone());
				//cs.setWebsite("");
				cs.setSelfBillingIndicator(new BigInteger(StringConstants.getString(StringEnumerates._0)));

				add = Pt1_01Factory.eINSTANCE.createAddressStructure();
				add.setAddressDetail(custExt.getAddress());
				//add.setBuildingNumber(" ");
				add.setCity(custExt.getCity());
				if (custExt.getCountry().compareToIgnoreCase(StringConstants.getString(StringEnumerates.Portugal))==0)
					add.setCountry(StringConstants.getString(StringEnumerates.PT));
				else
					add.setCountry(StringConstants.getString(StringEnumerates.Desconhecido));
				add.setPostalCode(custExt.getPostal());
				add.setRegion(custExt.getRegion());
				add.setStreetName(custExt.getAddress());
				cs.setBillingAddress(add);

				add = Pt1_01Factory.eINSTANCE.createAddressStructure();
				add.setAddressDetail(custExt.getAddress());
				//add.setBuildingNumber(" ");							// minimo 1 caractere
				add.setCity(custExt.getCity());
				if (custExt.getCountry().compareToIgnoreCase(StringConstants.getString(StringEnumerates.Portugal))==0)
					add.setCountry(StringConstants.getString(StringEnumerates.PT));
				else
					add.setCountry(StringConstants.getString(StringEnumerates.Desconhecido));
				add.setPostalCode(custExt.getPostal());
				add.setRegion(custExt.getRegion());
				add.setStreetName(custExt.getAddress());
				cs.setShipToAddress(add);
				//--------------------------------

				// acrescentar o cliente ao masterFile
				mf.getCustomer().add(cs);
			}

			// Existe tambem uma tabela de fornecedores ?!!!!
			
			jtxtOutput.append(StringConstants.getString(StringEnumerates.ok__n));
			jtxtOutput.append(StringConstants.getString(StringEnumerates.___a_exportar_tabela_de_impostos__Taxes____));

			// Vamos acrescentar as tax tables...
			oecd.standard.audit.file.tax.pt1_01.TaxTableType taxTable=Pt1_01Factory.eINSTANCE.createTaxTableType();
			mf.getTaxTable().add(taxTable);

			SentenceList lTaxes=m_dlSales.getTaxList();
			for(Object f: lTaxes.list().toArray()) {
				TaxInfo tax=(TaxInfo) f;

				oecd.standard.audit.file.tax.pt1_01.TaxTableEntryType tax_saft=Pt1_01Factory.eINSTANCE.createTaxTableEntryType();

				//TaxCodeDetailsType taxDetails_saft=Pt0_01Factory.eINSTANCE.createTaxCodeDetailsType();

				tax_saft.setDescription(tax.getName());
				//taxDetails_saft.setDescription(tax.getName());

				// A taxa no Openbravo esta entre 0 e 1. Para o saf-t deve ser multiplicada por 100.
				double taxa2=tax.getRate()*100;
				tax_saft.setTaxPercentage(BigDecimal.valueOf(taxa2));

				tax_saft.setTaxType(oecd.standard.audit.file.tax.pt1_01.TaxTypeType.IVA);		// Isto nao devia estar hardcoded
				tax_saft.setTaxCountryRegion(StringConstants.getString(StringEnumerates.PT));												// Isto nao devia estar hardcoded

				double taxa=tax.getRate();

				if (taxa==0)
				{
					// Isento
					tax_saft.setTaxCode(StringConstants.getString(StringEnumerates.ISE));
				}
				else
					if ((taxa>0) && (taxa<0.12))
					{
						// reduzida
						tax_saft.setTaxCode(StringConstants.getString(StringEnumerates.RED));
					}
					else
						if ((taxa>=0.12) && (taxa<0.17))
						{
							// intermedia
							tax_saft.setTaxCode(StringConstants.getString(StringEnumerates.INT));
						}
						else
						{
							// normal
							tax_saft.setTaxCode(StringConstants.getString(StringEnumerates.NOR));
						}

				//tax_saft.getTaxCodeDetails().add(taxDetails_saft);
				taxTable.getTaxTableEntry().add(tax_saft);
			}

			jtxtOutput.append(StringConstants.getString(StringEnumerates.ok__n));
			jtxtOutput.append(StringConstants.getString(StringEnumerates.___a_exportar_produtos__Products____));

			// Vamos acrescentar os produtos

			SentenceList lProducts=m_dlSales.getProductList();
			for(Object f: lProducts.list().toArray()) {
				ProductInfoExt prod=(ProductInfoExt) f;	

				oecd.standard.audit.file.tax.pt1_01.ProductType pType=Pt1_01Factory.eINSTANCE.createProductType();

				pType.setProductCode(this.trimGUID(prod.getID()));
				pType.setProductDescription(prod.getName());
				pType.setProductGroup(prod.getCategoryID());
				pType.setProductNumberCode(prod.getCode());
				pType.setProductType(oecd.standard.audit.file.tax.pt1_01.ProductTypeType.P);

				mf.getProduct().add(pType);
			}
			//---------
			
			jtxtOutput.append(StringConstants.getString(StringEnumerates.ok__n));
			jtxtOutput.append(StringConstants.getString(StringEnumerates.___a_exportar_documentos_comerciais__Invoices____));

			// vamos acrescentar as facturas
			//SentenceList lTickets=m_dlSales.getTicketsList();
			SentenceList lTickets=m_dlSales.getTicketsListByDate(d1, d2);

			int invoiceNumber=0;
			BigDecimal totalDebit=new BigDecimal(0.0);
			BigDecimal totalCredit=new BigDecimal(0.0);

			for(Object f: lTickets.list().toArray()) {
				FindTicketsInfo ticket=(FindTicketsInfo) f;

				BigDecimal totalNetDebit=new BigDecimal(0.0);
				BigDecimal totalNetCredit=new BigDecimal(0.0);
				BigDecimal totalGrossDebit=new BigDecimal(0.0);
				BigDecimal totalGrossCredit=new BigDecimal(0.0);
				BigDecimal totalVATDebit=new BigDecimal(0.0);
				BigDecimal totalVATCredit=new BigDecimal(0.0);

				TicketInfo ti=m_dlSales.loadTicket(ticket.getTicketType(), ticket.getTicketId());

				// Nao vamos processar tickets do tipo pagamento de divida de clientes...
				if (ti.getTicketType()!=TicketInfo.RECEIPT_PAYMENT) {

					oecd.standard.audit.file.tax.pt1_01.InvoiceType invoice=Pt1_01Factory.eINSTANCE.createInvoiceType();
					
					invoice.setInvoiceNo(ti.getDocumentNo());
					invoice.setInvoiceStatus(oecd.standard.audit.file.tax.pt1_01.InvoiceStatusType.N);		// Documento "Normal"
					
					// O que deve ser exportado e' a assinatura do documento actual e nao o campo "hash", que e' do documento precedente!!
					if (ti.getSignature().length()==0)
						invoice.setHash(StringConstants.getString(StringEnumerates._0));
					else
						invoice.setHash(ti.getSignature());
					
					// Vamos verificar se a assinatura esta correcta:
					// (ATB)(2012-12-07) Desactivado para nao ficar muito visivel no codigo a forma como e feira a cifra
					// Cipher2 cifra=new Cipher2(m_oApp.getSession());
					// if (cifra.verify(ti.getSignature(), ti.getSource())==false) {
					//	logger.info(StringConstants.getString(StringEnumerates.Verificacao_de_assinatura_com_chave_publica_falhou___));
					// }

					// Tipos de Documentos que podemos ter no Openbravo POS:
					//    	public static final int RECEIPT_NORMAL = 0;
					//		public static final int RECEIPT_REFUND = 1;
					//		public static final int RECEIPT_PAYMENT = 2;
					switch (ti.getTicketType()) {
					case TicketInfo.RECEIPT_NORMAL:
						// VD = venda a dinheiro e factura/recibo
						invoice.setInvoiceType(oecd.standard.audit.file.tax.pt1_01.InvoiceTypeType.VD);
						break;
					case TicketInfo.RECEIPT_REFUND:
						// TD = talao de devolucao
						invoice.setInvoiceType(oecd.standard.audit.file.tax.pt1_01.InvoiceTypeType.TD);
						break;
					case TicketInfo.RECEIPT_PAYMENT:
						// Isto sera uma Nota de Credito? NC
						invoice.setInvoiceType(oecd.standard.audit.file.tax.pt1_01.InvoiceTypeType.NC);

						//	ATENCAO: PELOS VISTOS NO OPENBRAVO POS ESTES DOCS NAO TEM LINHAS!!!

						break;
					}

					invoice.setSelfBillingIndicator(new BigInteger(StringConstants.getString(StringEnumerates._0)));

					//invoice.setSystemEntryDate(...)
					//--- ESTOU AQUI!!

					//XMLGregorianCalendar data=DatatypeFactory.newInstance().newXMLGregorianCalendarDate(1900+ti.getDate().getYear(), ti.getDate().getMonth(), ti.getDate().getDay(), DatatypeConstants.FIELD_UNDEFINED);

					
					GregorianCalendar c = new GregorianCalendar();
					c.setTime(ti.getDate());
					XMLGregorianCalendar data = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(c.get(GregorianCalendar.YEAR), c.get(GregorianCalendar.MONTH)+1, c.get(GregorianCalendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);

					XMLGregorianCalendar dataTempo=DatatypeFactory.newInstance().newXMLGregorianCalendarDate(c.get(GregorianCalendar.YEAR), c.get(GregorianCalendar.MONTH)+1, c.get(GregorianCalendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
					dataTempo.setHour(c.get(GregorianCalendar.HOUR_OF_DAY));
					dataTempo.setMinute(c.get(GregorianCalendar.MINUTE));
					dataTempo.setSecond(c.get(GregorianCalendar.SECOND));					
					
					//java.text.SimpleDateFormat fd1=new SimpleDateFormat("yyyy-MM-dd");
					//java.text.SimpleDateFormat fd2=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
					//String temp=fd2.format(ti.getDate());

					invoice.setInvoiceDate(data);
					// Nota IMPORTANTE:
					// Na maior parte destas facturas nao existe registo de cliente, mas o SAFT-PT obriga.
					// Aqui devemos exportar um cliente generico e fazer referencia a esse cliente na exportacao das facturas
					String cId=ti.getCustomerId();
					if (cId==null) {
						invoice.setCustomerID(StringConstants.getString(StringEnumerates._0));
					}
					else
					{
						invoice.setCustomerID(this.trimGUID(ti.getCustomerId()));
					}
					//invoice.setInvoiceType("Factura");
					invoice.setSystemEntryDate(dataTempo);
					//invoice.setSystemEntryDate(data);

					// vamos processar as linhas da factura
					for (TicketLineInfo tci:ti.getLines())
					{
						oecd.standard.audit.file.tax.pt1_01.LineType line=Pt1_01Factory.eINSTANCE.createLineType();
						
						DecimalFormatSymbols dc=new DecimalFormatSymbols();
						dc.setDecimalSeparator('.');
						java.text.DecimalFormat fd=new DecimalFormat(StringConstants.getString(StringEnumerates._0_00__0_00), dc);					
						
						// As linhas no OB comecam em 0. E' necessrio adicionar mais 1.
						String sQuantity=fd.format(Math.abs(tci.getMultiply()));

						line.setLineNumber(new BigInteger(Long.toString(tci.getTicketLine()+1)));
						line.setProductCode(this.trimGUID(tci.getProductID()));
						line.setProductDescription(tci.getProductName());

						// O Opembravo coloca a negativo as quantidades que sao devolucoes. Aqui, como o
						// tipo de documento ja indica que e' uma devolucao a quantidade e' 
						// colocada em valor absoluto
						line.setQuantity(new BigDecimal(sQuantity));

						String sPrice=fd.format(Math.abs(tci.getPrice()));
						line.setUnitPrice(new BigDecimal(sPrice));						// este e' o preco base por unidade (sem iva e com todos os descontos!)
						line.setTaxPointDate(data);										// cada linha de factura pode ter uma data de entrega diferente -> data de iva diferente!?
						line.setDescription(tci.getProductName());

						line.setUnitOfMeasure(StringConstants.getString(StringEnumerates.Unidades));					// podia ser Kg, etc.


						if (tci.getMultiply()<0)
						{
							// e uma "devolucao" - este e o valor da linha de venda sem IVA

							// teste
							double valorNet=Math.abs(tci.getSubValue());
							double valorGross=Math.abs(tci.getValue());

							String sValorNet=fd.format(valorNet);
							BigDecimal bdValorNet=new BigDecimal(sValorNet);

							String sValorGross=fd.format(valorGross);
							BigDecimal bdValorGross=new BigDecimal(sValorGross);

							line.setDebitAmount(bdValorNet); 		// Se e' credito nao se coloca debito e vice-versa
							//line.setCreditAmount(new BigDecimal(0.0));

							totalDebit=totalDebit.add(bdValorNet);

							// valor liquido a debito
							totalNetDebit=totalNetDebit.add(bdValorNet);
							// valor bruto a debito
							totalGrossDebit=totalGrossDebit.add(bdValorGross);
							// total do iva a debito

							String sTax=fd.format(tci.getTax());
							BigDecimal bdTax=new BigDecimal(sTax);
							totalVATDebit=totalVATDebit.add(bdTax);
						}
						else
						{
							// e uma "venda"

							// Teste
							double valorNet=tci.getSubValue();			// Este e' o valor sem IVA
							double valorGross=tci.getValue();

							String sValorNet=fd.format(valorNet);
							BigDecimal bdValorNet=new BigDecimal(sValorNet);

							String sValorGross=fd.format(valorGross);
							BigDecimal bdValorGross=new BigDecimal(sValorGross);

							line.setCreditAmount(bdValorNet);
							// line.setDebitAmount(new BigDecimal(0.0));

							totalCredit=totalCredit.add(bdValorNet);

							// valor liquido a credito
							totalNetCredit=totalNetCredit.add(bdValorNet);
							// valor bruto a credito
							totalGrossCredit=totalGrossCredit.add(bdValorGross);
							// total do iva a credito
							String sTax=fd.format(tci.getTax());
							BigDecimal bdTax=new BigDecimal(sTax);

							totalVATCredit=totalVATCredit.add(bdTax);
						}

						// tratar a taxa de iva relativa a esta linha
						oecd.standard.audit.file.tax.pt1_01.TaxType taxLine=Pt1_01Factory.eINSTANCE.createTaxType();

						double taxa=tci.getTaxRate();

						if (taxa==0)
						{
							// Isento
							taxLine.setTaxCode(StringConstants.getString(StringEnumerates.ISE));
						}
						else
							if ((taxa>0) && (taxa<0.12))
							{
								// reduzida
								taxLine.setTaxCode(StringConstants.getString(StringEnumerates.RED));
							}
							else
								if ((taxa>=0.12) && (taxa<0.17))
								{
									// intermedia
									taxLine.setTaxCode(StringConstants.getString(StringEnumerates.INT));
								}
								else
								{
									// normal
									taxLine.setTaxCode(StringConstants.getString(StringEnumerates.NOR));
								}
						taxLine.setTaxType(oecd.standard.audit.file.tax.pt1_01.TaxTypeType.IVA);
						
						double taxa2=tci.getTaxRate()*100;
						taxLine.setTaxPercentage(BigDecimal.valueOf(taxa2));
						taxLine.setTaxCountryRegion(StringConstants.getString(StringEnumerates.PT));

						line.setTax(taxLine);

						line.setTaxExemptionReason(StringConstants.getString(StringEnumerates.Art_9_do_CIVA));	// Isto nao devia ser obrigatorio!!!

						//line.getTax().add(taxLine);

						// Vamos colocar o desconto comercial
						line.setSettlementAmount(new BigDecimal(0));

						// adicionar a linha 'a factura
						invoice.getLine().add(line);
					}

					// Acrescentar a estrutura com os totais do documento
					oecd.standard.audit.file.tax.pt1_01.DocumentTotalsType dt=Pt1_01Factory.eINSTANCE.createDocumentTotalsType();
					//----------------

					dt.setGrossTotal(totalGrossCredit.subtract(totalGrossDebit));
					dt.setNetTotal(totalNetCredit.subtract(totalNetDebit));
					dt.setTaxPayable(totalVATCredit.subtract(totalVATDebit));

					invoice.setDocumentTotals(dt);

					++invoiceNumber;

					// acrescentar a lista de documentos
					si.getInvoice().add(invoice);
				}

			}

			// soma de todos os credit amount....
			si.setTotalCredit(totalCredit);		// Estes totais sao sem imposto e deduzido de descontos
			si.setTotalDebit(totalDebit);		// Estes totais sao sem imposto e deduzido de descontos
			si.setNumberOfEntries(new BigInteger(Integer.toString(invoiceNumber)));	

			sd.setSalesInvoices(si);
			aft.setSourceDocuments(sd);
			
			jtxtOutput.append(StringConstants.getString(StringEnumerates.ok__n));
			jtxtOutput.append(StringConstants.getString(StringEnumerates.Ficheiro_SAF_T__PT__exportado_com_sucesso_));

			// acrescentar o masterFiles ao auditFile
			aft.setMasterFiles(mf);
			//------------------------------------------------------
			//------------

			// acrescentar o auditFile ao documentRoot
			root.setAuditFile(aft);

			// Gravar num XML compativel com o XSD do SAFT
			//Resource resource2 = new XMLResourceImpl(URI.createURI("file://media/data/develop/workspaces/openbravo/pos/devel/saftmodel/model/exemplo.saft"));
			//Resource resource2 = new Pt1_01ResourceImpl(URI.createURI("file://workspaces/openbravo/pos/devel/saftmodel2/model/exemplo.saft.xml"));
			Resource resource2 = new Pt1_01ResourceImpl(URI.createURI(StringConstants.getString(StringEnumerates.file___)+xmlFile));
			
			resource2.getContents().add(root);

			// Se nao se fizer as seguintes duas linhas nao e' usada a metadata que guarda a correspondencia entre o XSD e o ecore!!!
			Map options = new HashMap();
			options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			options.put(XMLResource.OPTION_ENCODING, StringConstants.getString(StringEnumerates.Windows_1252));
			resource2.save(options);

			// Vamos tentar validar o XML gerado....
			ValidateXML val=new ValidateXML();

			logger.info(StringConstants.getString(StringEnumerates.Validar_exemplo_saft_));
			val.validate(StringConstants.getString(StringEnumerates._workspaces_openbravo_pos_devel_saftmodel2_model_exemplo_saft_xml),
					StringConstants.getString(StringEnumerates._workspaces_openbravo_pos_devel_saftmodel2_model_SAFTPT_1_01_xsd));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void jbtnLoadFile(java.awt.event.ActionEvent evt) {
		boolean sair=false;
		String xmlfile="";
		{
			// Validar o ficheiro de geracao
			xmlfile=this.jtxtSAFTFile.getText();
			if ((xmlfile==null) || (xmlfile.isEmpty())) {
				jtxtOutput.append(StringConstants.getString(StringEnumerates.Deve_ser_introduzido_o_nome_do_ficheiro_a_gerar__n));
				sair=true;
			}
		}

		if (!sair) {
			try {  
                Reader reader = new FileReader(xmlfile);  
                jtxtOutput.read(reader, null); // It seemed so simple,  
                                                   // but ...  
            } catch (Exception e) {  
                //System.out.println("Error: " + e);  
            	logger.log(Level.WARNING, StringConstants.getString(StringEnumerates.Error__)+e);
            }  
		}
	}

	private void jbtnGenerate(java.awt.event.ActionEvent evt) {
		// Gerar o ficheiro SAFT-PT
		boolean sair=false;
		
		// E' necessario ir buscar as datas....
		Date date1;
		Date date2;
		try {
			date1 = (Date) Formats.TIMESTAMP.parseValue(jtxtDataInicio.getText());
			date2 = (Date) Formats.TIMESTAMP.parseValue(jtxtDataFim.getText());
		} catch (BasicException e) {
			date1 = null;
			date2 = null;
		}
		
		//-----------------------------------------------
		// Codigo das validacoes:
		jtxtOutput.setText("");
		if ((date1==null) || (date2==null)) {
			jtxtOutput.append(StringConstants.getString(StringEnumerates.Deve_introduzir_valor_para_as_duas_datas_que_definem_o_intervalo__n));
			sair=true;
		}
		else {
			if (date1.compareTo(date2)>=0) {
				jtxtOutput.append(StringConstants.getString(StringEnumerates.A_primeira_data_deve_ser_anterior_a_segunda_data__n));
				sair=true;
			}
			else {
				// as datas devem ser do mesmo ano!
				GregorianCalendar c1=new GregorianCalendar();
				c1.setTime(date1);
				GregorianCalendar c2=new GregorianCalendar();
				c2.setTime(date2);
				if (c1.get(Calendar.YEAR)!=c2.get(Calendar.YEAR)) {
					jtxtOutput.append(StringConstants.getString(StringEnumerates.As_duas_datas_devem_pertencer_ao_mesmo_ano__n));
					sair=true;
				}
			}
		}
		String xmlfile="";
		{
			// Validar o ficheiro de geracao
			xmlfile=this.jtxtSAFTFile.getText();
			if ((xmlfile==null) || (xmlfile.isEmpty())) {
				jtxtOutput.append(StringConstants.getString(StringEnumerates.Deve_ser_introduzido_o_nome_do_ficheiro_a_gerar__n));
				sair=true;
			}
		}
		//-----------------------------------------------

		if (!sair) {
			// Vamos chamar o metodo que gera com a nova versão do saftpt
			
			// Vamos usar uma thread...
			GenerateSAFT5 gSAFT=new GenerateSAFT5(date1, date2, xmlfile, jtxtOutput, m_oApp, jlblProgress);
			
			Thread tSaft=new Thread(gSAFT);
			
			tSaft.start();
			
			
			// generateSaftPt_1_01_01(date1, date2, xmlfile);
		}

		//	DataLogicSystem dlSystem = (DataLogicSystem) m_oApp.getBean("com.openbravo.pos.forms.DataLogicSystem");
		//	DataLogicSales m_dlSales = (DataLogicSales) m_oApp.getBean("com.openbravo.pos.forms.DataLogicSales");
		//    DataLogicCustomers dlCustomers  = (DataLogicCustomers) m_oApp.getBean("com.openbravo.pos.customers.DataLogicCustomers");
		//
		//	String s="";
		//	try {
		//		s=dlSystem.findVersion();
		//		
		////		// Exemplo de como aceder ao metamodelo
		////		// Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		////		
		////		ResourceSet resourceSet = new ResourceSetImpl();
		////		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		////			    //"ecore", new  XMLResourceFactoryImpl());
		////				"ecore", new  XMIResourceFactoryImpl());
		////
		////		// Exemplo de utilizacao de MetaData
		////		//		final ExtendedMetaData extendedMetaData =
		////		//			new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		////		//		resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		////
		////		//URI fileURI = URI.createURI(".../ExtendedPO2.ecore");
		////		URI fileURI = org.eclipse.emf.common.util.URI.createURI("file://media/data/develop/workspaces/openbravo/pos/devel/saftmodel/model/saft.ecore", true);
		////		Resource resource = resourceSet.getResource(fileURI, true);
		////		EPackage saftPackage = (EPackage)resource.getContents().get(0);
		////
		////		System.out.println(saftPackage.getName());		
		//		
		//		// Vamos iniciar a criacao do ficheiro SAFT pelo cabecalho
		//		// Exemplo de como aceder ao modelo
		//		// vamos criar um novo modelo
		//		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("saft", new XMLResourceFactoryImpl());
		//		//new LibraryResourceFactoryImpl()
		//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("saft", new Pt0_01ResourceFactoryImpl());
		//		
		//		// Criar em memoria o modelo do SAFT
		//		// Primeiro o documentRoot
		//		DocumentRoot root= Pt0_01Factory.eINSTANCE.createDocumentRoot();
		//		
		//		// o AuditFile
		//		AuditFileType aft = Pt0_01Factory.eINSTANCE.createAuditFileType();
		//		
		//		// o Header
		//		HeaderType ht=Pt0_01Factory.eINSTANCE.createHeaderType();
		//		ht.setCompanyName("KTC");
		//		ht.setAuditFileVersion("1.0");
		//		ht.setCompanyID("registo comercial");
		//		ht.setTaxRegistrationNumber("507287584");
		//		ht.setFiscalYear("2009");
		//		ht.setTaxAccountingBasis("Facturacao");
		//		ht.setStartDate(DatatypeFactory.newInstance().newXMLGregorianCalendarDate(2010, 10, 10, 0));
		//		ht.setEndDate(DatatypeFactory.newInstance().newXMLGregorianCalendarDate(2010, 11, 10, 0));
		//		ht.setCurrencyCode("EUR");
		//		ht.setDateCreated(DatatypeFactory.newInstance().newXMLGregorianCalendarDate(2010, 11, 10, 0));
		//		ht.setProductID("OpenK");
		//		ht.setProductVersion("v1.0");
		//		
		//		AddressStructure ad=Pt0_01Factory.eINSTANCE.createAddressStructure();
		//		ad.setCity("Santa Maria da feira");
		//		ad.setCountry("Portugal");
		//		ad.setPostalCode("4520-706");
		//		ad.setAddressDetail("Rua EN 327, 1315");
		//		ht.setCompanyAddress(ad);
		//
		//		// acrescentar o header ao auditFile
		//		aft.setHeader(ht);
		//		
		//		// (atb) o SourceDocuments ...
		//		SourceDocumentsType sd=Pt0_01Factory.eINSTANCE.createSourceDocumentsType();
		//		
		//		aft.setSourceDocuments(sd);
		//		
		//		// salesinvoices
		//		SalesInvoicesType si=Pt0_01Factory.eINSTANCE.createSalesInvoicesType();
		//		sd.getSalesInvoices().add(si);
		//
		//		// acrescentar o masterFiles
		//		MasterFilesType mf = Pt0_01Factory.eINSTANCE.createMasterFilesType();
		//		
		//		// aparentemente e' obigatorio nesta versao ter um generalledger
		//		GeneralLedgerType gl = Pt0_01Factory.eINSTANCE.createGeneralLedgerType();
		//		
		//		gl.setAccountDescription("descricao");
		//		gl.setAccountID("1110001");
		//		gl.setOpeningCreditBalance(new BigDecimal(0.0));
		//		gl.setOpeningDebitBalance(new BigDecimal(0.0));
		//		
		//		// acrescentar o generalledger ao masterFile
		//		mf.getGeneralLedger().add(gl);
		//
		//		// Vamos agora acrescentar os clientes da base de dados
		//		SentenceList list=dlCustomers.getCustomerList();
		//		
		//		// Vamos introduzir o cliente "generico"
		//		CustomerType cs = Pt0_01Factory.eINSTANCE.createCustomerType();
		//		
		//		cs.setCompanyName("Cliente Generico");
		//		cs.setContact("Cliente Generico");
		//		cs.setCustomerID("0");
		//		cs.setCustomerTaxID("0");
		//		cs.setEmail("");
		//		cs.setFax("");
		//		cs.setTelephone("");
		//		cs.setWebsite("");
		//		
		//		AddressStructure add = Pt0_01Factory.eINSTANCE.createAddressStructure();
		//		add.setAddressDetail("");
		//		add.setBuildingNumber("");
		//		add.setCity("");
		//		add.setCountry("");
		//		add.setPostalCode("");
		//		add.setRegion("");
		//		add.setStreetName("");
		//		cs.setBillingAddress(add);
		//		
		//		add = Pt0_01Factory.eINSTANCE.createAddressStructure();
		//		add.setAddressDetail("");
		//		add.setBuildingNumber("");
		//		add.setCity("");
		//		add.setCountry("");
		//		add.setPostalCode("");
		//		add.setRegion("");
		//		add.setStreetName("");
		//		cs.setShipToAddress(add);
		//
		//		// acrescentar o cliente ao masterFile
		//		mf.getCustomer().add(cs);	
		//		
		//		for(Object f: list.list().toArray()) {
		//			CustomerInfo cust=(CustomerInfo) f;
		//			
		//			//System.out.println(cust.getName());
		//			
		//			CustomerInfoExt custExt=m_dlSales.loadCustomerExt(cust.getId());
		//			
		//			//System.out.println(custExt.getTaxid());
		//			
		//			// Exemplo de insercao de um cliente
		//			cs = Pt0_01Factory.eINSTANCE.createCustomerType();
		//			
		//			cs.setCompanyName(cust.getName());
		//			cs.setContact(custExt.getFirstname()+ " "+custExt.getLastname());
		//			cs.setCustomerID(custExt.getId());
		//			cs.setCustomerTaxID(cust.getTaxid());
		//			cs.setEmail(custExt.getEmail());
		//			cs.setFax(custExt.getFax());
		//			cs.setTelephone(custExt.getPhone());
		//			cs.setWebsite("");
		//			
		//			add = Pt0_01Factory.eINSTANCE.createAddressStructure();
		//			add.setAddressDetail(custExt.getAddress());
		//			add.setBuildingNumber("");
		//			add.setCity(custExt.getCity());
		//			add.setCountry(custExt.getCountry());
		//			add.setPostalCode(custExt.getPostal());
		//			add.setRegion(custExt.getRegion());
		//			add.setStreetName(custExt.getAddress());
		//			cs.setBillingAddress(add);
		//			
		//			add = Pt0_01Factory.eINSTANCE.createAddressStructure();
		//			add.setAddressDetail(custExt.getAddress());
		//			add.setBuildingNumber("");
		//			add.setCity(custExt.getCity());
		//			add.setCountry(custExt.getCountry());
		//			add.setPostalCode(custExt.getPostal());
		//			add.setRegion(custExt.getRegion());
		//			add.setStreetName(custExt.getAddress());
		//			cs.setShipToAddress(add);
		//
		//			// acrescentar o cliente ao masterFile
		//			mf.getCustomer().add(cs);
		//		}
		//		
		//		// Vamos acrescentar as tax tables...
		//		TaxTableType taxTable=Pt0_01Factory.eINSTANCE.createTaxTableType();
		//		mf.getTaxTable().add(taxTable);
		//		
		//		SentenceList lTaxes=m_dlSales.getTaxList();
		//		for(Object f: lTaxes.list().toArray()) {
		//			TaxInfo tax=(TaxInfo) f;
		//			
		//			TaxTypeType tax_saft=Pt0_01Factory.eINSTANCE.createTaxTypeType();
		//			
		//			TaxCodeDetailsType taxDetails_saft=Pt0_01Factory.eINSTANCE.createTaxCodeDetailsType();
		//			
		//			tax_saft.setDescription(tax.getName());
		//			taxDetails_saft.setDescription(tax.getName());
		//			taxDetails_saft.setTaxPercentage(BigDecimal.valueOf(tax.getRate()));
		//			
		//			double taxa=tax.getRate();
		//			
		//			if (taxa==0)
		//			{
		//				// Isento
		//				taxDetails_saft.setTaxCode("Ise");
		//			}
		//			else
		//			if ((taxa>0) && (taxa<12))
		//			{
		//				// reduzida
		//				taxDetails_saft.setTaxCode("Red");
		//			}
		//			else
		//			if ((taxa>=12) && (taxa<17))
		//			{
		//				// intermedia
		//				taxDetails_saft.setTaxCode("Int");
		//			}
		//			else
		//			{
		//				// normal
		//				taxDetails_saft.setTaxCode("Nor");
		//			}
		//			
		//			tax_saft.getTaxCodeDetails().add(taxDetails_saft);
		//			
		//			taxTable.getTaxType().add(tax_saft);
		//		}
		//		
		//		// Vamos acrescentar os produtos
		//		//--- ESTOU AQUI!!
		//
		//		
		//		SentenceList lProducts=m_dlSales.getProductList();
		//		for(Object f: lProducts.list().toArray()) {
		//			ProductInfoExt prod=(ProductInfoExt) f;	
		//		
		//			ProductType pType=Pt0_01Factory.eINSTANCE.createProductType();
		//		
		//			pType.setProductCode(prod.getCode());
		//			pType.setProductDescription(prod.getName());
		//			pType.setProductGroup(prod.getCategoryID());
		//			pType.setProductNumberCode(prod.getCode());
		//			pType.setProductType("S");
		//			
		//			mf.getProduct().add(pType);
		//		}
		//		//---------
		//			
		//		// vamos acrescentar as facturas
		//		SentenceList lTickets=m_dlSales.getTicketsList();
		//		
		//		int invoiceNumber=0;
		//		BigDecimal totalDebit=new BigDecimal(0.0);
		//		BigDecimal totalCredit=new BigDecimal(0.0);
		//		
		//		for(Object f: lTickets.list().toArray()) {
		//			FindTicketsInfo ticket=(FindTicketsInfo) f;
		//			
		//			BigDecimal totalNetDebit=new BigDecimal(0.0);
		//			BigDecimal totalNetCredit=new BigDecimal(0.0);
		//			BigDecimal totalGrossDebit=new BigDecimal(0.0);
		//			BigDecimal totalGrossCredit=new BigDecimal(0.0);
		//			BigDecimal totalVATDebit=new BigDecimal(0.0);
		//			BigDecimal totalVATCredit=new BigDecimal(0.0);
		//			
		//			InvoiceType invoice=Pt0_01Factory.eINSTANCE.createInvoiceType();
		//			
		//			invoice.setInvoiceNo(Integer.toString(ticket.getTicketId()));
		//			
		//			TicketInfo ti=m_dlSales.loadTicket(ticket.getTicketType(), ticket.getTicketId());
		//					
		//			XMLGregorianCalendar data=DatatypeFactory.newInstance().newXMLGregorianCalendarDate(1900+ti.getDate().getYear(), ti.getDate().getMonth(), ti.getDate().getDay(), DatatypeConstants.FIELD_UNDEFINED);
		//			XMLGregorianCalendar dataTempo=DatatypeFactory.newInstance().newXMLGregorianCalendarDate(1900+ti.getDate().getYear(), ti.getDate().getMonth(), ti.getDate().getDay(), DatatypeConstants.FIELD_UNDEFINED);
		//			dataTempo.setHour(1);
		//			dataTempo.setMinute(0);
		//			dataTempo.setSecond(0);
		//			
		//			invoice.setInvoiceDate(data);
		//			// Nota IMPORTANTE:
		//			// Na maior parte destas facturas nao existe registo de cliente, mas o SAFT-PT obriga.
		//			// Aqui devemos exportar um cliente generico e fazer referencia a esse cliente na exportacao das facturas
		//			String cId=ti.getCustomerId();
		//			if (cId==null) {
		//				invoice.setCustomerID("0");
		//			}
		//			else
		//			{
		//				invoice.setCustomerID(ti.getCustomerId());
		//			}
		//			invoice.setInvoiceType("Factura");
		//			invoice.setSystemEntryDate(dataTempo);
		//			
		//			// vamos processar as linhas da factura
		//			for (TicketLineInfo tci:ti.getLines())
		//			{
		//				LineType line=Pt0_01Factory.eINSTANCE.createLineType();
		//				
		//				line.setLineNumber(new BigInteger(Long.toString(tci.getTicketLine())));
		//				line.setProductCode(tci.getProductID());
		//				line.setProductDescription(tci.getProductName());
		//				line.setQuantity(Double.toString(tci.getMultiply()));
		//				line.setUnitPrice(new BigDecimal(tci.getPrice()));				// este e' o preco base por unidade (sem iva e com todos os descontos!)
		//				line.setTaxPointDate(data);										// cada linha de factura pode ter uma data de entrega diferente -> data de iva diferente!?
		//				line.setDescription(tci.getProductName());
		//				if (tci.getMultiply()<0)
		//				{
		//					// e uma "devolucao" - este e o valor da linha de venda sem IVA
		//					line.setDebitAmount(new BigDecimal(tci.getSubValue()));
		//					line.setCreditAmount(new BigDecimal(0.0));
		//					
		//					totalDebit.add(new BigDecimal(tci.getSubValue()));
		//					
		//					// valor liquido a debito
		//					totalNetDebit.add(new BigDecimal(tci.getSubValue()));
		//					// valor bruto a debito
		//					totalGrossDebit.add(new BigDecimal(tci.getValue()));
		//					// total do iva a debito
		//					totalVATDebit.add(new BigDecimal(tci.getTax()));
		//				}
		//				else
		//				{
		//					// e uma "venda"
		//					line.setCreditAmount(new BigDecimal(tci.getSubValue()));
		//					line.setDebitAmount(new BigDecimal(0.0));
		//					
		//					totalCredit.add(new BigDecimal(tci.getSubValue()));
		//					
		//					// valor liquido a credito
		//					totalNetCredit.add(new BigDecimal(tci.getSubValue()));
		//					// valor bruto a credito
		//					totalGrossCredit.add(new BigDecimal(tci.getValue()));
		//					// total do iva a credito
		//					totalVATCredit.add(new BigDecimal(tci.getTax()));
		//				}
		//				
		//				// tratar a taxa de iva relativa a esta linha
		//				TaxType taxLine=Pt0_01Factory.eINSTANCE.createTaxType();
		//				
		//				double taxa=tci.getTaxRate();
		//				
		//				if (taxa==0)
		//				{
		//					// Isento
		//					taxLine.setTaxCode("Ise");
		//				}
		//				else
		//				if ((taxa>0) && (taxa<12))
		//				{
		//					// reduzida
		//					taxLine.setTaxCode("Red");
		//				}
		//				else
		//				if ((taxa>=12) && (taxa<17))
		//				{
		//					// intermedia
		//					taxLine.setTaxCode("Int");
		//				}
		//				else
		//				{
		//					// normal
		//					taxLine.setTaxCode("Nor");
		//				}
		//				taxLine.setTaxType(tci.getProductTaxCategoryID());
		//				taxLine.setTaxPercentage(BigDecimal.valueOf(tci.getTaxRate()));
		//				
		//				line.getTax().add(taxLine);
		//				
		//				// Vamos colocar o desconto comercial
		//				line.setSettlementAmount(new BigDecimal(0));
		//				
		//				// adicionar a linha 'a factura
		//				invoice.getLine().add(line);
		//			}
		//
		//			// Acrescentar a estrutura com os totais do documento
		//			DocumentTotalsType dt=Pt0_01Factory.eINSTANCE.createDocumentTotalsType();
		//			
		//			dt.setGrossTotal(totalGrossCredit.subtract(totalGrossDebit));
		//			dt.setNetTotal(totalNetCredit.subtract(totalNetDebit));
		//			dt.setTaxPayable(totalVATCredit.subtract(totalVATDebit));
		//	
		//			invoice.setDocumentTotals(dt);
		//			
		//			++invoiceNumber;
		//			
		//			// acrescentar a lista de documentos
		//			si.getInvoice().add(invoice);
		//		}
		//		
		//		// soma de todos os credit amount....
		//		si.setTotalCredit(totalCredit);
		//		si.setTotalDebit(totalDebit);
		//		si.setNumberOfEntries(new BigInteger(Integer.toString(invoiceNumber)));		
		//		
		//		// acrescentar o masterFiles ao auditFile
		//		aft.setMasterFiles(mf);
		//		
		//		// acrescentar o auditFile ao documentRoot
		//		root.setAuditFile(aft);
		//		
		//		// Gravar num XML compativel com o XSD do SAFT
		//		//Resource resource2 = new XMLResourceImpl(URI.createURI("file://media/data/develop/workspaces/openbravo/pos/devel/saftmodel/model/exemplo.saft"));
		//		Resource resource2 = new Pt0_01ResourceImpl(URI.createURI("file://workspaces/openbravo/pos/devel/saftmodel/model/exemplo.saft"));
		//		resource2.getContents().add(root);
		//		
		//		// Se nao se fizer as seguintes duas linhas nao e' usada a metadata que guarda a correspondencia entre o XSD e o ecore!!!
		//		Map options = new HashMap();
		//		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		//		//options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		//		resource2.save(options);
		//		
		//		// Map options = getSAFTOptions();
		//		//resource2.save(options);
		//		//resource2.save(null);
		//		//-----------------------------------------------------
		//		
		//		//---------------------------------------------------
		//		// Para obrigar a usar os mappings do xsd2ecore?...
		//		//XMLResource.XMLMap xmlMap = new XMLMapImpl();
		//		//Map options = new HashMap();
		//		//options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		//		//resource2.save(options);
		//		
		//		// Vamos tentar validar o XML gerado....
		//		ValidateXML val=new ValidateXML();
		////		System.out.println("Validar NewFile2.xml:");
		////		val.validate("/media/data/develop/workspaces/openbravo/pos/devel/saftmodel/model/NewFile2.xml",
		////				"/media/data/develop/workspaces/openbravo/pos/devel/saftmodel/model/saf-t-pt.xsd");
		//		System.out.println("Validar exemplo.saft:");
		//		val.validate("/workspaces/openbravo/pos/devel/saftmodel/model/exemplo.saft",
		//		"/workspaces/openbravo/pos/devel/saftmodel/model/saf-t-pt.xsd");
		//		
		//	} catch (Exception e) {
		//		// TODO Auto-generated catch block
		//		e.printStackTrace();
		//	}
		//	
		//	System.out.println(s);
	}

	//	Simon Spacey wrote:
	//
	//	    I'm using EMF for the 1st time and have a problem relating to the use of capitalized attribute names in XML docs that I'm loading. 
	//
	//
	//	Hi Simon,
	//
	//
	//	EMF does some remapping to turn XML element and attribute names into conventional Ecore attribute and reference names (i.e. conventional Java field names). It annotates the model with the original XML names (and a bunch of other information from the schema that can't be represented in Ecore) via the ExtendedMetaData interface. Resources must use this information to save and load conformant instance documents.
	//
	//	Look in the util package of the generated model code and you'll find a resource factory implementation, LibraryResourceFactoryImpl. This factory returns instances of XMLResource with a few non-default options set. Most importantly, it enables the use of ExtendedMetaData.
	//
	//	When you're running the editor under Eclipse, the platform will process the model plug-in's manifest file, plugin.xml, which contains the following:
	//
	//	<extension point="org.eclipse.emf.ecore.extension_parser">
	//	 <parser type="library"
	//	   class="org.eclipse.example.library.util.LibraryResourceFactoryImpl"/>
	//	</extension>
	//
	//
	//	As you might guess, this registers the custom resource factory to provide resources to be used for filenames with a ".library" extension.
	//
	//	Here's the registration from the tutorial.
	//
	//
	//	      // Register the default resource factory -- only needed for stand-alone!
	//	      resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	//	        Resource.Factory.Registry.DEFAULT_EXTENSION,
	//	        new XMIResourceFactoryImpl());
	//
	//
	//	Try replacing that line with this:
	//
	//
	//	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	//	  "library",
	//	  new LibraryResourceFactoryImpl());
	//
	//
	//	That should fix your problem by making the same kind of registration as in the manifest file.
	//
	//	(There's a small difference: the manifest-based registration is done in the global resource factory registry, while this registration is in the registry local to the resource set. So, it only affects resource creation done through that resource set. Global registrations are done through Resource.Factory.Registry.INSTANCE.)
	//
	//	Cheers,
	//	Dave

	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JPanel m_jSAFTOptions;

	private javax.swing.JLabel jlblDataInicio;
	private javax.swing.JTextField jtxtDataInicio;
	private javax.swing.JLabel jlblDataFim;
	private javax.swing.JTextField jtxtDataFim;
	private javax.swing.JButton bStartDate;
	private javax.swing.JButton bEndDate;
	private javax.swing.JButton bGenerate;
	private javax.swing.JButton bSelFile;
	private javax.swing.JButton bLoadFile;	
	private javax.swing.JTextField jtxtSAFTFile;
	private javax.swing.JScrollPane jScrollPaneFile; 
	private javax.swing.JTextArea jtxtOutput;
	private javax.swing.JLabel jlblProgress;
	
	// Para um icone animado:   
	// add the image label
    // ImageIcon ii = new ImageIcon(this.getClass().getResource("src/pr/ktc/openk/images/work_in_progress.gif"));
	// imageLabel.setIcon(ii);
	//
}

