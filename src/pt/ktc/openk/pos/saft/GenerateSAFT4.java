/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *
 * */
package pt.ktc.openk.pos.saft;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._301._301Factory;
import oecd.standard.audit.file.tax.p.t1._0._301.util._301ResourceFactoryImpl;
import oecd.standard.audit.file.tax.p.t1._0._301.util._301ResourceImpl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;

import pt.ktc.openk.pos.company.Company;
import pt.ktc.openk.pos.company.CompanyGlobal;
import pt.ktc.openk.pos.customers.CountryHelper;
import pt.ktc.openk.pos.ticket.FindTicketsInfo2;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;
import pt.ktc.openk.pos.validade.ValidateXML;

import org.eclipse.emf.common.util.URI;

import com.openbravo.data.loader.SentenceList;
import com.openbravo.pos.customers.CustomerInfo;
import com.openbravo.pos.customers.CustomerInfoExt;
import com.openbravo.pos.customers.DataLogicCustomers;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.ticket.FindTicketsInfo;
import com.openbravo.pos.ticket.ProductInfoExt;
import com.openbravo.pos.ticket.TaxInfo;
import com.openbravo.pos.ticket.TicketInfo;
import com.openbravo.pos.ticket.TicketLineInfo;

public class GenerateSAFT4 implements Runnable {
	
	private static Logger logger = Logger.getLogger(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_saft_GenerateSAFT));
	
	private Date mDate1;
	private Date mDate2;
	private String mXmlFile;
	private JTextArea jtxtOutput;
	private AppView m_oApp;
	private JLabel mProgress;
	
	public GenerateSAFT4(Date d1, Date d2, String xmlFile, JTextArea output, AppView oApp, JLabel progress) {
		mDate1=d1;
		mDate2=d2;
		mXmlFile=xmlFile;
		jtxtOutput=output;
		m_oApp=oApp;
		mProgress=progress;
	}
	
	private void startAnimation() {
		URL imgUrl=this.getClass().getResource(StringConstants.getString(StringEnumerates._pt_ktc_openk_pos_images_work_in_progress_gif));
	    ImageIcon ii = new ImageIcon(imgUrl);
		mProgress.setIcon(ii);
		mProgress.setVisible(true);
	}

	private void stopAnimation() {
		URL imgUrl=this.getClass().getResource(StringConstants.getString(StringEnumerates._pt_ktc_openk_pos_images_work_in_progress_jpg));
	    ImageIcon ii = new ImageIcon(imgUrl);
		mProgress.setIcon(ii);
		mProgress.setVisible(true);
	}

	private String trimGUID(String s) {
		String s2;

		// Apenas deve fazer o TRIM se o codigo original for superior a 30
		if (s.length()>30)
			s2=s.substring(0,8)+s.substring(9, 13)+s.substring(14, 18)+s.substring(19, 23)+s.substring(24, 34);
		else 
			s2=s;

		return s2;
	}
	
	// Este metodo devolve uma referencia que nao pode ter mais de 30 caracteres
	private String trimReference(String s) {
		String s2;
		int index=-1;

		// Apenas deve fazer o TRIM se o codigo original for superior a 30
		if (s.length()>30) {
			// neste caso existem varios documentos relacionados separados por virgulas. 
			// devemos devolver uma string composta pelos caracteres ate a primeira virgula encontrada
			index=s.indexOf(',');
			if ((index==-1) || (index>30)) {
				s2=s.substring(0,30);
			}
			else
			{
				s2=s.substring(0,index);
			}
		}
		else 
			s2=s;

		return s2;
	}

	@Override
	public void run() {
		
		// Gerar o ficheiro SAFT-PT

		startAnimation();
		
		DataLogicSystem dlSystem = (DataLogicSystem) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSystem));
		DataLogicSales m_dlSales = (DataLogicSales) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSales));
		DataLogicCustomers dlCustomers  = (DataLogicCustomers) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_customers_DataLogicCustomers));
		
		jtxtOutput.append(StringConstants.getString(StringEnumerates.A_exportar_dados_para_ficheiro_SAF_T__PT___)+mXmlFile+StringConstants.getString(StringEnumerates._newline));
		
		String s="";
		try {
			s=dlSystem.findVersion();

			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(StringConstants.getString(StringEnumerates.saft), new _301ResourceFactoryImpl());

			// Criar em memoria o modelo do SAFT
			// Primeiro o documentRoot
			oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot root= _301Factory.eINSTANCE.createDocumentRoot();

			// o AuditFile
			oecd.standard.audit.file.tax.p.t1._0._301.AuditFileType aft = _301Factory.eINSTANCE.createAuditFileType();

			//----------------------
			//System.out.println("A aceder aos dados da empresa...");
			Company company=m_dlSales.loadCompany();        // JA NAO SE DEVE USAR ISTO!!! OS DADOS DA EMPRESA SÌO O QUE ESTAO EM CompanyGlobal
			//System.out.println("Nome da empresa:"+company.getName());
			//System.out.println("Endereco da empresa:"+company.getAddress());
			//System.out.println("NIF da empresa:"+company.getTaxID());
	        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
			logger.info(StringConstants.getString(StringEnumerates.A_aceder_aos_dados_da_empresa___));
			logger.info(StringConstants.getString(StringEnumerates.Nome_da_empresa_)+cg.getName());
			logger.info(StringConstants.getString(StringEnumerates.Endereco_da_empresa_)+cg.getAddress());
			logger.info(StringConstants.getString(StringEnumerates.NIF_da_empresa_)+cg.getTaxID());
			//----------------------
			
			// o Header
			oecd.standard.audit.file.tax.p.t1._0._301.HeaderType ht=_301Factory.eINSTANCE.createHeaderType();
			//ht.setCompanyName("KTC");
			ht.setCompanyName(cg.getName());
			//ht.setAuditFileVersion(StringConstants.getString(StringEnumerates._1_01_01));   // NECESSARIO ALTERAR
			ht.setAuditFileVersion("1.03_01");   // NECESSARIO ALTERAR
			
			//ht.setCompanyID("507287584");					// A empresa a qual os dados se referem. O registo comercial da empresa ou o seu NIF
			if (cg.getBusinessRegistration().compareTo("")!=0) ht.setCompanyID(cg.getBusinessRegistration());
				else ht.setCompanyID(cg.getTaxID());
			ht.setBusinessName(cg.getName());				// Designacao comercial (FACULTATIVO)
			//ht.setTaxRegistrationNumber(new BigInteger("507287584"));
			ht.setTaxRegistrationNumber(new BigInteger(cg.getTaxID()));
			ht.setTaxEntity(StringConstants.getString(StringEnumerates.Global));
			ht.setCurrencyCode(StringConstants.getString(StringEnumerates.EUR));
			
			// Data da criacao do ficheiro saft
			// Ir buscar a data actual
			GregorianCalendar cal_dactual=new GregorianCalendar();
			//ht.setDateCreated(DatatypeFactory.newInstance().newXMLGregorianCalendarDate(2010, 11, 10, 0));
			XMLGregorianCalendar data_actual=DatatypeFactory.newInstance().newXMLGregorianCalendarDate(cal_dactual.get(GregorianCalendar.YEAR), cal_dactual.get(GregorianCalendar.MONTH)+1, cal_dactual.get(GregorianCalendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
			// neste caso nao e necessaria a hora
			//data_actual.setHour(cal_dactual.get(GregorianCalendar.HOUR_OF_DAY));
			//data_actual.setMinute(cal_dactual.get(GregorianCalendar.MINUTE));
			//data_actual.setSecond(cal_dactual.get(GregorianCalendar.SECOND));					
			ht.setDateCreated(data_actual);
			
			ht.setProductID(StringConstants.getString(StringEnumerates.Openbravo_POS_KTC));
			ht.setProductVersion(StringConstants.getString(StringEnumerates._2_3_KTC_OpenK_POS_v1_0));
			ht.setProductCompanyTaxID(StringConstants.getString(StringEnumerates._507287584));			// A empresa que produz o software
			ht.setSoftwareCertificateNumber(new BigInteger(StringConstants.getString(StringEnumerates._1345)));			// Numero do certificado de software, 0 se nao for aplicavel

			// O ano fiscal tem de se ir buscar as datas do relatorio:
			GregorianCalendar cal_d1=new GregorianCalendar();
			cal_d1.setTime(mDate1);
			XMLGregorianCalendar xgcal_d1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal_d1);
			int d1_year=xgcal_d1.getYear();	 
			int d1_month=xgcal_d1.getMonth();   // 1 - 12
			int d1_day=xgcal_d1.getDay();	     // 1 - 31

			GregorianCalendar cal_d2=new GregorianCalendar();
			cal_d2.setTime(mDate2);
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
			
			jtxtOutput.append("A incluir documentos com data maior ou igual a "+Integer.toString(d1_year)+
					"-"+Integer.toString(d1_month)+"-"+Integer.toString(d1_day)+" e menor ou igual a "+
					Integer.toString(d2_year)+
					"-"+Integer.toString(d2_month)+"-"+Integer.toString(d2_day)+"\n");
			
			jtxtOutput.append(StringConstants.getString(StringEnumerates.___a_exportar_dados_gerais__Header____));
			
			ht.setFiscalYear(new BigInteger(Integer.valueOf(year).toString()));
			ht.setStartDate(DatatypeFactory.newInstance().newXMLGregorianCalendarDate(d1_year, d1_month, d1_day, 0));
			ht.setEndDate(DatatypeFactory.newInstance().newXMLGregorianCalendarDate(d2_year, d2_month, d2_day, 0));

			ht.setTaxAccountingBasis(oecd.standard.audit.file.tax.p.t1._0._301.TaxAccountingBasisType.F);

			oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT ad=_301Factory.eINSTANCE.createAddressStructurePT();
			//ad.setCity("Santa Maria da feira");
			ad.setCity(cg.getCity());
			//ad.setRegion("Aveiro");
			ad.setRegion(cg.getRegion());
			//EDataType es=EcorePackage.eINSTANCE.getEString();
			ad.setCountry(StringConstants.getString(StringEnumerates.PT));
			//ad.setPostalCode("4520-706");
			ad.setPostalCode(cg.getPostal());
			//ad.setAddressDetail("Rua EN 327, 1315");
			ad.setAddressDetail(cg.getAddress());
			ht.setCompanyAddress(ad);

			// acrescentar o header ao auditFile
			aft.setHeader(ht);

			// (atb) o SourceDocuments ...
			oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentsType sd=_301Factory.eINSTANCE.createSourceDocumentsType();

			aft.setSourceDocuments(sd);

			// acrescentar o masterFiles
			oecd.standard.audit.file.tax.p.t1._0._301.MasterFilesType mf = _301Factory.eINSTANCE.createMasterFilesType();

			// salesinvoices
			oecd.standard.audit.file.tax.p.t1._0._301.SalesInvoicesType si=_301Factory.eINSTANCE.createSalesInvoicesType();
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
			//SentenceList list=dlCustomers.getCustomerList();
			SentenceList list=dlCustomers.getCustomerListAll();    // Todos os clientes, mesmo os desactivos!

			// Vamos introduzir o cliente "generico"
			oecd.standard.audit.file.tax.p.t1._0._301.CustomerType cs = _301Factory.eINSTANCE.createCustomerType();

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

			oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure add = _301Factory.eINSTANCE.createAddressStructure();
			add.setAddressDetail(StringConstants.getString(StringEnumerates.Desconhecido));
			//add.setBuildingNumber(" ");    // Minimo 1 caracter
			add.setCity(StringConstants.getString(StringEnumerates.Desconhecido));
			add.setCountry(StringConstants.getString(StringEnumerates.Desconhecido));
			add.setPostalCode(StringConstants.getString(StringEnumerates.Desconhecido));
			//add.setRegion("");
			//add.setStreetName("");
			cs.setBillingAddress(add);

			/* A morada de expedicao nao e obrigatoria */
			/*
			add = _201Factory.eINSTANCE.createAddressStructure();
			add.setAddressDetail(StringConstants.getString(StringEnumerates.Desconhecido));
			//add.setBuildingNumber(" ");
			add.setCity(StringConstants.getString(StringEnumerates.Desconhecido));
			add.setCountry(StringConstants.getString(StringEnumerates.Desconhecido));
			add.setPostalCode(StringConstants.getString(StringEnumerates.Desconhecido));
			//add.setRegion("");
			//add.setStreetName("");
			cs.setShipToAddress(add);
			*/
			
			// acrescentar o cliente ao masterFile
			mf.getCustomer().add(cs);	

			for(Object f: list.list().toArray()) {
				CustomerInfo cust=(CustomerInfo) f;

				//System.out.println(cust.getName());

				CustomerInfoExt custExt=m_dlSales.loadCustomerExt(cust.getId());

				//System.out.println(custExt.getTaxid());

				// Exemplo de insercao de um cliente
				cs = _301Factory.eINSTANCE.createCustomerType();

				cs.setAccountID(StringConstants.getString(StringEnumerates.Desconhecido));				// Nao se sabe qual a conta corrente na contabilidade
				
				// (ATB)(2013-05-22) O CompanyName nao pode ser vazio
				if ((cust.getName()==null) || (cust.getName().isEmpty())) {
					cs.setCompanyName(StringConstants.getString(StringEnumerates.Desconhecido));
				}
				else {
					cs.setCompanyName(cust.getName());   // Obrigatorio
				}
				
				if ((custExt.getFirstname()!=null) && (custExt.getLastname()!=null)) 
					cs.setContact(custExt.getFirstname()+ " "+custExt.getLastname());
				cs.setCustomerID(this.trimGUID(custExt.getId()));      // O customerID so pode ter 30 caracteres. Faz-se o trim de 36 do guid para 30...
				// (ATB)(2013-01-09) No caso do NIF estar vazio coloco o "9999999990"
				if ((cust.getTaxid()==null) || (cust.getTaxid().isEmpty())) {
					cs.setCustomerTaxID(StringConstants.getString(StringEnumerates._999999990));
				}
				else {
					cs.setCustomerTaxID(cust.getTaxid());
				}
				cs.setEmail(custExt.getEmail());
				cs.setFax(custExt.getFax());
				cs.setTelephone(custExt.getPhone());
				//cs.setWebsite("");
				cs.setSelfBillingIndicator(new BigInteger(StringConstants.getString(StringEnumerates._0)));

				add = _301Factory.eINSTANCE.createAddressStructure();
				
				// (ATB)(2013-01-09) Verificar sempre se e vazio
				if ((custExt.getAddress()==null) || (custExt.getAddress().isEmpty())) {
					add.setAddressDetail(StringConstants.getString(StringEnumerates.Desconhecido));
				}
				else {
					add.setAddressDetail(custExt.getAddress());					// Obrigatorio
				}
				//add.setBuildingNumber(" ");
				if ((custExt.getCity()==null) || (custExt.getCity().isEmpty())) {
					add.setCity(StringConstants.getString(StringEnumerates.Desconhecido));
				}
				else {
					add.setCity(custExt.getCity());								// Obrigatorio
				}
				
				if (custExt.getCountry()!=null) {							// Obrigatorio
					if (custExt.getCountry().isEmpty()) {
						//add.setCountry(StringConstants.getString(StringEnumerates.Desconhecido));
						// se nao existem dados assumimos que e portugal
						add.setCountry(StringConstants.getString(StringEnumerates.PT));
					}
					else
					{	
						// Nao e vazio, vamos ver se esta como antes da lista de codigos de paises
						if (custExt.getCountry().compareToIgnoreCase(StringConstants.getString(StringEnumerates.Portugal))==0)
							add.setCountry(StringConstants.getString(StringEnumerates.PT));
						else {
							// verificamos se e um codigo de pais correcto
							if (CountryHelper.checkCountryCode(custExt.getCountry()))
								add.setCountry(custExt.getCountry());			
							else {
								// caso o que exista nao se perceba entao assumimos que e portugal
								add.setCountry(StringConstants.getString(StringEnumerates.PT));
							}
						}
					}
				}
				else {
					add.setCountry(StringConstants.getString(StringEnumerates.PT));
				}

				if ((custExt.getPostal()==null) || (custExt.getPostal().isEmpty())) {
					add.setPostalCode(StringConstants.getString(StringEnumerates.Desconhecido));
				}
				else {
					add.setPostalCode(custExt.getPostal());						// Obrigatorio
				}
				
				if ((custExt.getAddress()==null) || (custExt.getAddress().isEmpty())) {
					add.setStreetName(StringConstants.getString(StringEnumerates.Desconhecido));
				}
				else {
					add.setStreetName(custExt.getAddress());
				}
				
				//add.setRegion(custExt.getRegion());
				
				if ((custExt.getRegion()==null) || (custExt.getRegion().isEmpty())) {
					add.setRegion(StringConstants.getString(StringEnumerates.Desconhecido));
				}
				else
				{
					add.setRegion(custExt.getRegion());	
				}				
				
				//add.setStreetName(custExt.getAddress());
				cs.setBillingAddress(add);

				/* A morada de expedicao nao e obrigatoria na ficha de cliente */
				/*
				add = _201Factory.eINSTANCE.createAddressStructure();
				
				if ((custExt.getAddress()==null) || (custExt.getAddress().isEmpty())) {
					add.setAddressDetail(StringConstants.getString(StringEnumerates.Desconhecido));					
				}
				else {
					add.setAddressDetail(custExt.getAddress());
				}
				
				//add.setBuildingNumber(" ");							// minimo 1 caractere
				if ((custExt.getCity()==null) || (custExt.getCity().isEmpty())) {
					add.setCity(StringConstants.getString(StringEnumerates.Desconhecido));
				}
				else
				{
					add.setCity(custExt.getCity());
				}
				
				if (custExt.getCountry()!=null) {
					if (custExt.getCountry().compareToIgnoreCase(StringConstants.getString(StringEnumerates.Portugal))==0)
						add.setCountry(StringConstants.getString(StringEnumerates.PT));
					else
						add.setCountry(StringConstants.getString(StringEnumerates.Desconhecido));
				}
				else {
					add.setCountry(StringConstants.getString(StringEnumerates.PT));
				}
				
				if ((custExt.getPostal()==null) || (custExt.getPostal().isEmpty())) {
					add.setPostalCode(StringConstants.getString(StringEnumerates.Desconhecido));
				}
				else {
					add.setPostalCode(custExt.getPostal());
				}
				
				if ((custExt.getRegion()==null) || (custExt.getRegion().isEmpty())) {
					add.setRegion(StringConstants.getString(StringEnumerates.Desconhecido));
				}
				else
				{
					add.setRegion(custExt.getRegion());	
				}
				
				if ((custExt.getAddress()==null) || (custExt.getAddress().isEmpty())) {
					add.setStreetName(StringConstants.getString(StringEnumerates.Desconhecido));
				}
				else {
					add.setStreetName(custExt.getAddress());
				}

				cs.setShipToAddress(add);
				*/
				//--------------------------------

				// acrescentar o cliente ao masterFile
				mf.getCustomer().add(cs);
			}

			// Existe tambem uma tabela de fornecedores ?!!!!
			
			jtxtOutput.append(StringConstants.getString(StringEnumerates.ok__n));
			jtxtOutput.append(StringConstants.getString(StringEnumerates.___a_exportar_tabela_de_impostos__Taxes____));

			// Vamos acrescentar as tax tables...
			oecd.standard.audit.file.tax.p.t1._0._301.TaxTableType taxTable=_301Factory.eINSTANCE.createTaxTableType();
			/* mf.getTaxTable().add(taxTable); */
			mf.setTaxTable(taxTable);
			
			SentenceList lTaxes=m_dlSales.getTaxList();
			for(Object f: lTaxes.list().toArray()) {
				TaxInfo tax=(TaxInfo) f;

				oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType tax_saft=_301Factory.eINSTANCE.createTaxTableEntryType();

				//TaxCodeDetailsType taxDetails_saft=Pt0_01Factory.eINSTANCE.createTaxCodeDetailsType();

				tax_saft.setDescription(tax.getName());
				//taxDetails_saft.setDescription(tax.getName());

				// A taxa no Openbravo esta entre 0 e 1. Para o saf-t deve ser multiplicada por 100.
				double taxa2=tax.getRate()*100;
				tax_saft.setTaxPercentage(BigDecimal.valueOf(taxa2));

				tax_saft.setTaxType(oecd.standard.audit.file.tax.p.t1._0._301.TaxTypeType.IVA);		// Isto nao devia estar hardcoded
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

				oecd.standard.audit.file.tax.p.t1._0._301.ProductType pType=_301Factory.eINSTANCE.createProductType();

				pType.setProductCode(this.trimGUID(prod.getID()));
				
				// (ATB)(2013-05-22) O ProductDescription nao pode ser vazio
				if ((prod.getName()==null) || (prod.getName().isEmpty())) {
					pType.setProductDescription(StringConstants.getString(StringEnumerates.Desconhecido));
				}
				else {
					pType.setProductDescription(prod.getName());   // Obrigatorio
				}
				
				pType.setProductGroup(prod.getCategoryID());
				// pType.setProductNumberCode(prod.getCode());   // Vamos usar a referencia em vez do codigo de barras
				pType.setProductNumberCode(prod.getReference());   // Vamos usar a referencia em vez do codigo de barras
				pType.setProductType(oecd.standard.audit.file.tax.p.t1._0._301.ProductTypeType.P);

				mf.getProduct().add(pType);
			}
			//---------
			
			jtxtOutput.append(StringConstants.getString(StringEnumerates.ok__n));
			jtxtOutput.append(StringConstants.getString(StringEnumerates.___a_exportar_documentos_comerciais__Invoices____));

			// vamos acrescentar as facturas
			//SentenceList lTickets=m_dlSales.getTicketsList();
			SentenceList lTickets=m_dlSales.getTicketsListByDate(mDate1, mDate2);

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
				// Apenas vamos processar recibos do tipo Venda e Devolucao. As consultas de mesa nao sao exportadas
				if ((ti.getTicketType()==TicketInfo.RECEIPT_NORMAL) || (ti.getTicketType()==TicketInfo.RECEIPT_REFUND) || (ti.getTicketType()==pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_INVOICE)) {

					oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType invoice=_301Factory.eINSTANCE.createInvoiceType();

					invoice.setInvoiceNo(ti.getDocumentNo());
					
					GregorianCalendar c = new GregorianCalendar();
					c.setTime(ti.getDate());
					XMLGregorianCalendar data = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(c.get(GregorianCalendar.YEAR), c.get(GregorianCalendar.MONTH)+1, c.get(GregorianCalendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);

					XMLGregorianCalendar dataTempo=DatatypeFactory.newInstance().newXMLGregorianCalendarDate(c.get(GregorianCalendar.YEAR), c.get(GregorianCalendar.MONTH)+1, c.get(GregorianCalendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
					dataTempo.setHour(c.get(GregorianCalendar.HOUR_OF_DAY));
					dataTempo.setMinute(c.get(GregorianCalendar.MINUTE));
					dataTempo.setSecond(c.get(GregorianCalendar.SECOND));					
					
					// Criar estrutura para estado do documento
					oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType3 docStatus=_301Factory.eINSTANCE.createDocumentStatusType3();
					
					docStatus.setInvoiceStatus(oecd.standard.audit.file.tax.p.t1._0._301.InvoiceStatusType.N);		// Documento "Normal"
					docStatus.setInvoiceStatusDate(dataTempo);
					// Codigo do utilizador responsavel pela alteracao - so pode ter 30 caracteres
					docStatus.setSourceID(this.trimGUID(ti.getUser().getId()));
					// Origem do documento. Para ja todos os documentos tem origem na aplicacao. Para o futuro deve ter pelo menos a opcao de recupercao manual!!! Ver legislacao!!!
					docStatus.setSourceBilling(oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling.P);
					// -------
					invoice.setDocumentStatus(docStatus);
					
					// O que deve ser exportado e' a assinatura do documento actual e nao o campo "hash", que e' do documento precedente!!
					if (ti.getSignature().length()==0)
						invoice.setHash(StringConstants.getString(StringEnumerates._0));
					else
						invoice.setHash(ti.getSignature());
					
					// vamos colocar o hashcontrol, um numero sequencial que indica a versao da chave privada
					invoice.setHashControl(StringConstants.getString(StringEnumerates._1));
					
					// Vamos verificar se a assinatura esta correcta:
					// (ATB)(2012-12-07) Deactivado para nao ficar muito visivel no codigo a forma de cifrar!
					// Cipher2 cifra=new Cipher2(m_oApp.getSession());
					// if (cifra.verify(ti.getSignature(), ti.getSource())==false) {
					// 	logger.info(StringConstants.getString(StringEnumerates.Verificacao_de_assinatura_com_chave_publica_falhou___));
					// }
					
					// Tipos de Documentos que podemos ter no Openbravo POS:
					//    	public static final int RECEIPT_NORMAL = 0;
					//		public static final int RECEIPT_REFUND = 1;
					//		public static final int RECEIPT_PAYMENT = 2;
					switch (ti.getTicketType()) {
					case TicketInfo.RECEIPT_NORMAL:
						// VD = venda a dinheiro e factura/recibo ->> DEVE PASSAR A FATURA SIMPLIFICADA 'FS' -> PERGUNTAR AS FINANCAS UMA VEZ QUE NO SAFT-PT NAO SE REFERE ISSO!!!!
						invoice.setInvoiceType(oecd.standard.audit.file.tax.p.t1._0._301.InvoiceTypeType.FS);
						break;
					case pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_INVOICE:
						// Novo documento do tipo Fatura 
						invoice.setInvoiceType(oecd.standard.audit.file.tax.p.t1._0._301.InvoiceTypeType.FT);
						break;
					case TicketInfo.RECEIPT_REFUND:
						// TD = talao de devolucao ->> DEVE PASSAR A NOTA DE CREDITO 'NC'
						invoice.setInvoiceType(oecd.standard.audit.file.tax.p.t1._0._301.InvoiceTypeType.NC);
						break;
					case TicketInfo.RECEIPT_PAYMENT:
						// Isto sera uma Nota de Credito? NC --> NAO DEVE SER CONSIDERADA!!!
						invoice.setInvoiceType(oecd.standard.audit.file.tax.p.t1._0._301.InvoiceTypeType.NC);

						//	ATENCAO: PELOS VISTOS NO OPENBRAVO POS ESTES DOCS NAO TEM LINHAS!!!

						break;
					}

					// invoice.setSelfBillingIndicator(new BigInteger(StringConstants.getString(StringEnumerates._0)));
					
					// Na nova versao existe uma estrutura para SpecialRegimes
					oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes specialRegime=_301Factory.eINSTANCE.createSpecialRegimes();
					// "0" nao e autofaturacao
					specialRegime.setSelfBillingIndicator(new BigInteger(StringConstants.getString(StringEnumerates._0)));
					// "0" nao adereu a regime de iva em caixa
					specialRegime.setCashVATSchemeIndicator(new BigInteger(StringConstants.getString(StringEnumerates._0)));
					// "0" nao e fatura emitida em nome ou por caonta de terceiros
					specialRegime.setThirdPartiesBillingIndicator(new BigInteger(StringConstants.getString(StringEnumerates._0)));
					
					invoice.setSpecialRegimes(specialRegime);
					
					// Codigo do utilizador responsavel pela geracao do documento - so pode ter 30 caracteres
					invoice.setSourceID(this.trimGUID(ti.getUser().getId()));

					//invoice.setSystemEntryDate(...)

					//XMLGregorianCalendar data=DatatypeFactory.newInstance().newXMLGregorianCalendarDate(1900+ti.getDate().getYear(), ti.getDate().getMonth(), ti.getDate().getDay(), DatatypeConstants.FIELD_UNDEFINED);
					
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
					
					// vamos especificar qual o perido do recibo....
					Integer periodo=new Integer(c.get(GregorianCalendar.MONTH)+1);
					invoice.setPeriod(new BigInteger(periodo.toString()));

					// vamos processar as linhas da factura
					for (TicketLineInfo tci:ti.getLines())
					{
						oecd.standard.audit.file.tax.p.t1._0._301.LineType2 line=_301Factory.eINSTANCE.createLineType2();
						
						DecimalFormatSymbols dc=new DecimalFormatSymbols();
						dc.setDecimalSeparator('.');
						// (ATB)(2012-01-30)java.text.DecimalFormat fd=new DecimalFormat("0.00;-0.00", dc);	
						java.text.DecimalFormat fd=new DecimalFormat(StringConstants.getString(StringEnumerates._0_00000__0_00000), dc);							
						
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

							String sTax=fd.format(Math.abs(tci.getTax()));
							BigDecimal bdTax=new BigDecimal(sTax);
							totalVATDebit=totalVATDebit.add(bdTax);
							
							// (ATB)(2011-09-27) No caso de devolucoes e' necessario dizer em cada linha a razao e referir a factura original
							//oecd.standard.audit.file.tax.p.t1._0._201.CreditNoteType cn=_201Factory.eINSTANCE.createCreditNoteType();
							
							oecd.standard.audit.file.tax.p.t1._0._301.References newRef=_301Factory.eINSTANCE.createReferences();
							
							newRef.setReason(StringConstants.getString(StringEnumerates.Devolucao));
							//cn.setReference(StringConstants.getString(StringEnumerates.REC_1_)+ti.getReference());			// aqui deve-se colocar a referencia a factura original. Ex: "FACT 1/3"
							//newRef.setReference(ti.getReference());		// Assumimos que a referencia ja vem devidamente formatada tal como e' esperado pelo SAFT
							newRef.setReference(this.trimReference(ti.getReference())); // corrige a instrucao anterior para que a referencia nao ultrapasse os 30 caracteres.
							
//							oecd.standard.audit.file.tax.p.t1._0._201.ReferencesType ref=_201Factory.eINSTANCE.createReferencesType();
//							ref.setCreditNote(cn);
							
							line.getReferences().add(newRef);
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
							
							String reference=ti.getReference();
							if ((reference!=null) && (!reference.isEmpty())) {
								// Neste caso deve-se colocar as referencias a consultas de mesa que lhe deram origem se 
								// for esse o caso
								oecd.standard.audit.file.tax.p.t1._0._301.OrderReferences newRef=_301Factory.eINSTANCE.createOrderReferences();
								
								//newRef.setOriginatingON(ti.getReference());		// Assumimos que a referencia ja vem devidamente formatada tal como e' esperado pelo SAFT
								newRef.setOriginatingON(this.trimReference(ti.getReference())); // corrige a instrucao anterior para que a referencia nao ultrapasse os 30 caracteres.

								// Devia-se colocar a data do documento de origem
								// newRef.setOrderDate(...)
								
								line.getOrderReferences().add(newRef);
							}
						}

						// tratar a taxa de iva relativa a esta linha
						oecd.standard.audit.file.tax.p.t1._0._301.Tax taxLine=_301Factory.eINSTANCE.createTax();

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
						taxLine.setTaxType(oecd.standard.audit.file.tax.p.t1._0._301.TaxTypeType.IVA);
						
						double taxa2=tci.getTaxRate()*100;
						taxLine.setTaxPercentage(BigDecimal.valueOf(taxa2));
						taxLine.setTaxCountryRegion(StringConstants.getString(StringEnumerates.PT));

						line.setTax(taxLine);

						// (ATB)(2011-09-27) A razao da isencao esta na descricao do imposto...
						//line.setTaxExemptionReason("Art 9 do CIVA");	// Isto nao devia ser obrigatorio!!!
						// A razao da isencao e' apenas obrigatorio para taxas de IVA de 0%
						if (taxa==0) {
							line.setTaxExemptionReason(tci.getTaxInfo().getName());	
						}

						//line.getTax().add(taxLine);

						// Vamos colocar o desconto comercial
						line.setSettlementAmount(new BigDecimal(0));

						// adicionar a linha 'a factura
						invoice.getLine().add(line);
					}

					// Acrescentar a estrutura com os totais do documento
					oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3 dt=_301Factory.eINSTANCE.createDocumentTotalsType3();
					//----------------

//					dt.setGrossTotal(totalGrossCredit.subtract(totalGrossDebit));
//					dt.setNetTotal(totalNetCredit.subtract(totalNetDebit));
//					dt.setTaxPayable(totalVATCredit.subtract(totalVATDebit));
					// (ATB)(2011-09-27) Os totais estao em variaveis conforme o tipo de documento
					switch (ti.getTicketType()) {
					case TicketInfo.RECEIPT_NORMAL:
					case pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_INVOICE:
						// VD = venda a dinheiro e factura/recibo
						dt.setGrossTotal(totalGrossCredit);
						dt.setNetTotal(totalNetCredit);
						dt.setTaxPayable(totalVATCredit);
						break;
					case TicketInfo.RECEIPT_REFUND:
						// TD = talao de devolucao
						dt.setGrossTotal(totalGrossDebit);
						dt.setNetTotal(totalNetDebit);
						dt.setTaxPayable(totalVATDebit);
						break;
					case TicketInfo.RECEIPT_PAYMENT:
						// Isto sera uma Nota de Credito? NC
						// ESTE AINDA NAO E TRATADO!
						break;
					}

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
	
			jtxtOutput.append(StringConstants.getString(StringEnumerates.ok__n));
			jtxtOutput.append("   - Total de creditos (sem imposto)="+totalCredit+"\n");
			jtxtOutput.append("   - Total de debitos (sem imposto)="+totalDebit+"\n");
			jtxtOutput.append("   - Total de documentos="+new BigInteger(Integer.toString(invoiceNumber))+"\n");
			
			
			jtxtOutput.append(" - a exportar consultas de mesa (WorkingDocuments)...");
			
			// Falta exportar as consultas de mesa
			// Nas consultas de mesa o campo references referencia outras consultas de mesa anteriores.
			// Para se saber a que faturas a consulta de mesa deu origem e' necessario fazer uma pesquisa
			// a FS ou FT que tenham em references o numero desta consulta de mesa!!!
			
			// salesinvoices
			oecd.standard.audit.file.tax.p.t1._0._301.WorkingDocumentsType wd=_301Factory.eINSTANCE.createWorkingDocumentsType();

			invoiceNumber=0;
			totalDebit=new BigDecimal(0.0);
			totalCredit=new BigDecimal(0.0);

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
				// Apenas vamos processar recibos do tipo Venda e Devolucao. As consultas de mesa nao sao exportadas
				if (ti.getTicketType()==pt.ktc.openk.pos.aspects.TicketInfo.RECEIPT_PREVIEW) {

					// Vamos "processar" a consulta de mesa
					
					oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType workingDoc=_301Factory.eINSTANCE.createWorkDocumentType();

					workingDoc.setDocumentNumber(ti.getDocumentNo());
					
					GregorianCalendar c = new GregorianCalendar();
					c.setTime(ti.getDate());
					XMLGregorianCalendar data = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(c.get(GregorianCalendar.YEAR), c.get(GregorianCalendar.MONTH)+1, c.get(GregorianCalendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);

					XMLGregorianCalendar dataTempo=DatatypeFactory.newInstance().newXMLGregorianCalendarDate(c.get(GregorianCalendar.YEAR), c.get(GregorianCalendar.MONTH)+1, c.get(GregorianCalendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
					dataTempo.setHour(c.get(GregorianCalendar.HOUR_OF_DAY));
					dataTempo.setMinute(c.get(GregorianCalendar.MINUTE));
					dataTempo.setSecond(c.get(GregorianCalendar.SECOND));					

					// Criar estrutura para estado do documento
					oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType docStatus=_301Factory.eINSTANCE.createDocumentStatusType();
					
					// Vamos ver se esta consulta de mesa tem alguma FS ou FT relacionada...
					SentenceList lRelatedInvoices=m_dlSales.getPreviewRelatedInvoice(ti.getDocumentNo());

					if ((lRelatedInvoices==null) || (lRelatedInvoices.list().isEmpty())) {
						// Nao existem faturas relacionadas
						docStatus.setWorkStatus(oecd.standard.audit.file.tax.p.t1._0._301.WorkStatusType.N);		// Documento "Normal"

//						jtxtOutput.append("\n"+ti.getDocumentNo()+" -> X");
					}
					else {
						// Existem faturas relacionadas
						docStatus.setWorkStatus(oecd.standard.audit.file.tax.p.t1._0._301.WorkStatusType.F);		// Documento "Faturado"

						// Normalmente so pode/deve existir uma fatura relacionada
						// vamos buscar essa fatura, nesta altura apenas para testar 
						for(Object f2: lRelatedInvoices.list().toArray()) {
							FindTicketsInfo2 relatedTicket=(FindTicketsInfo2) f2;
						
//							jtxtOutput.append("\n"+ti.getDocumentNo()+" -> "+relatedTicket.getInvoiceNo());
						}					

					}
					
					// As alternativas sao: A-Documento Anulado
					//                      F-Documento Faturado
					// Possivelmente isto indica que Normal e' quando ainda nao foi anulado nem faturado
					// VER PORQUE RAZAO EXISTEM CONSULTAS DE MESA QUE NAO DERAM ORIGEM A VENDAS!!
					// Para ja pode-se indicar que as consultas de mesas que nao deram origem a vendas estao no estado
					// anulado? O melhor e' colocar N-Normal
					// O melhor e' acrescentar um metodo que nos permita obter o documento seguinte ao actual
					// Se o documento actual for uma consulta de mesa o seguinte ou e' outra consulta de mesa ou uma FS ou uma FT
					// Se o documento actual for uma FS ou uma FT o documento seguinte pode ser uma NC
					
					
					docStatus.setWorkStatusDate(dataTempo);
					// Codigo do utilizador responsavel pela alteracao
					docStatus.setSourceID(this.trimGUID(ti.getUser().getId()));
					// Origem do documento. Para ja todos os documentos tem origem na aplicacao. Para o futuro deve ter pelo menos a opcao de recupercao manual!!! Ver legislacao!!!
					docStatus.setSourceBilling(oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling.P);
					// -------
					workingDoc.setDocumentStatus(docStatus);
					
					workingDoc.setWorkType(oecd.standard.audit.file.tax.p.t1._0._301.WorkTypeType.DC);
					workingDoc.setSourceID(this.trimGUID(ti.getUser().getId()));
					workingDoc.setSystemEntryDate(dataTempo);
					workingDoc.setWorkDate(data);

					String cId=ti.getCustomerId();
					if (cId==null) {
						workingDoc.setCustomerID(StringConstants.getString(StringEnumerates._0));
					}
					else
					{
						workingDoc.setCustomerID(this.trimGUID(ti.getCustomerId()));
					}

					// O que deve ser exportado e' a assinatura do documento actual e nao o campo "hash", que e' do documento precedente!!
					if (ti.getSignature().length()==0)
						workingDoc.setHash(StringConstants.getString(StringEnumerates._0));
					else
						workingDoc.setHash(ti.getSignature());
					
					// vamos colocar o hashcontrol, um numero sequencial que indica a versao da chave privada
					workingDoc.setHashControl(StringConstants.getString(StringEnumerates._1));
					
					// (ATB) (ESTOU AQUI) (2013-10-07)
					// vamos processar as linhas da consulta de mesa
					for (TicketLineInfo tci:ti.getLines())
					{
						oecd.standard.audit.file.tax.p.t1._0._301.LineType3 line=_301Factory.eINSTANCE.createLineType3();
						
						DecimalFormatSymbols dc=new DecimalFormatSymbols();
						dc.setDecimalSeparator('.');
						
						// (ATB)(2012-01-30)java.text.DecimalFormat fd=new DecimalFormat("0.00;-0.00", dc);	
						java.text.DecimalFormat fd=new DecimalFormat(StringConstants.getString(StringEnumerates._0_00000__0_00000), dc);							
						
						// As linhas no OB comecam em 0. E' necessrio adicionar mais 1.
						String sQuantity=fd.format(Math.abs(tci.getMultiply()));

						line.setLineNumber(new BigInteger(Long.toString(tci.getTicketLine()+1)));
						line.setProductCode(this.trimGUID(tci.getProductID()));
						line.setProductDescription(tci.getProductName());

						// O Openbravo coloca a negativo as quantidades que sao devolucoes. Aqui, como o
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

							String sTax=fd.format(Math.abs(tci.getTax()));
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


						// Se houver documentos precedentes e' necessario colocar essa informacao
						String reference=ti.getReference();
						if ((reference!=null) && (!reference.isEmpty())) {
							oecd.standard.audit.file.tax.p.t1._0._301.OrderReferences newRef=_301Factory.eINSTANCE.createOrderReferences();
							
							//cn.setReference(StringConstants.getString(StringEnumerates.REC_1_)+ti.getReference());			// aqui deve-se colocar a referencia a factura original. Ex: "FACT 1/3"
							//newRef.setOriginatingON(reference);		// Assumimos que a referencia ja vem devidamente formatada tal como e' esperado pelo SAFT
							newRef.setOriginatingON(this.trimReference(reference)); // corrige a instrucao anterior para que a referencia nao ultrapasse os 30 caracteres.
							// FALTA IR BUSCAR A DATA DO DOCUMENTO RELACIONADO!
							
							line.getOrderReferences().add(newRef);
						}
						
						
						// tratar a taxa de iva relativa a esta linha
						oecd.standard.audit.file.tax.p.t1._0._301.Tax taxLine=_301Factory.eINSTANCE.createTax();

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
						taxLine.setTaxType(oecd.standard.audit.file.tax.p.t1._0._301.TaxTypeType.IVA);
						
						double taxa2=tci.getTaxRate()*100;
						taxLine.setTaxPercentage(BigDecimal.valueOf(taxa2));
						taxLine.setTaxCountryRegion(StringConstants.getString(StringEnumerates.PT));

						line.setTax(taxLine);

						// (ATB)(2011-09-27) A razao da isencao esta na descricao do imposto...
						//line.setTaxExemptionReason("Art 9 do CIVA");	// Isto nao devia ser obrigatorio!!!
						// A razao da isencao e' apenas obrigatorio para taxas de IVA de 0%
						if (taxa==0) {
							line.setTaxExemptionReason(tci.getTaxInfo().getName());	
						}

						//line.getTax().add(taxLine);

						// Vamos colocar o desconto comercial
						line.setSettlementAmount(new BigDecimal(0));

						// adicionar a linha 'a factura
						workingDoc.getLine().add(line);
					}

					// Acrescentar a estrutura com os totais do documento
					oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType dt=_301Factory.eINSTANCE.createDocumentTotalsType();
					//----------------

					// Actualizar os totais desta consulta de mesa
					dt.setGrossTotal(totalGrossCredit);
					dt.setNetTotal(totalNetCredit);
					dt.setTaxPayable(totalVATCredit);

					workingDoc.setDocumentTotals(dt);

					++invoiceNumber;

					// acrescentar a lista de documentos
					wd.getWorkDocument().add(workingDoc);
				}
				
			}
			
			// soma de todos os credit amount....
			wd.setTotalCredit(totalCredit);		// Estes totais sao sem imposto e deduzido de descontos
			wd.setTotalDebit(totalDebit);		// Estes totais sao sem imposto e deduzido de descontos
			wd.setNumberOfEntries(new BigInteger(Integer.toString(invoiceNumber)));	
			
			sd.setWorkingDocuments(wd);
			
			//---------------------------------------------------------
			
			// aft.setSourceDocuments(sd);
			
			jtxtOutput.append(StringConstants.getString(StringEnumerates.ok__n));
			
			jtxtOutput.append("   - Total de creditos (sem imposto)="+totalCredit+"\n");
			jtxtOutput.append("   - Total de debitos (sem imposto)="+totalDebit+"\n");
			jtxtOutput.append("   - Total de documentos="+new BigInteger(Integer.toString(invoiceNumber))+"\n");
			
			
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
			Resource resource2 = new _301ResourceImpl(URI.createURI(StringConstants.getString(StringEnumerates.file___)+mXmlFile));
			
			resource2.getContents().add(root);

			// Se nao se fizer as seguintes duas linhas nao e' usada a metadata que guarda a correspondencia entre o XSD e o ecore!!!
			Map options = new HashMap();
			options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			options.put(XMLResource.OPTION_ENCODING, StringConstants.getString(StringEnumerates.Windows_1252));
			resource2.save(options);

			// Vamos tentar validar o XML gerado....
			// ValidateXML val=new ValidateXML();

			// System.out.println("A validar o ficheiro gerado...");
			// val.validate(mXmlFile, "/workspaces/openbravo/pos/devel/saftmodel2/model/SAFTPT_1_01.xsd");

		} catch (Exception e) {
			jtxtOutput.append(StringConstants.getString(StringEnumerates.ERRO_na_exportacao_dos_dados__nDetalhe_do_erro_));
			jtxtOutput.append(e.getMessage());
			//e.printStackTrace();
		}
		
		stopAnimation();
		
	}

}
	
