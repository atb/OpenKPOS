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

import oecd.standard.audit.file.tax.pt1_01.Pt1_01Factory;
import oecd.standard.audit.file.tax.pt1_01.util.Pt1_01ResourceFactoryImpl;
import oecd.standard.audit.file.tax.pt1_01.util.Pt1_01ResourceImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;

import pt.ktc.openk.pos.company.Company;
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

public class GenerateSAFT implements Runnable {
	
	private static Logger logger = Logger.getLogger(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_saft_GenerateSAFT));
	
	private Date mDate1;
	private Date mDate2;
	private String mXmlFile;
	private JTextArea jtxtOutput;
	private AppView m_oApp;
	private JLabel mProgress;
	
	public GenerateSAFT(Date d1, Date d2, String xmlFile, JTextArea output, AppView oApp, JLabel progress) {
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

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		// Gerar o ficheiro SAFT-PT

		startAnimation();
		
		DataLogicSystem dlSystem = (DataLogicSystem) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSystem));
		DataLogicSales m_dlSales = (DataLogicSales) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSales));
		DataLogicCustomers dlCustomers  = (DataLogicCustomers) m_oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_customers_DataLogicCustomers));
		
		jtxtOutput.append(StringConstants.getString(StringEnumerates.A_exportar_dados_para_ficheiro_SAF_T__PT___)+mXmlFile+StringConstants.getString(StringEnumerates._newline));

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
			
			//----------------------
			//System.out.println("A aceder aos dados da empresa...");
			Company company=m_dlSales.loadCompany();
			//System.out.println("Nome da empresa:"+company.getName());
			//System.out.println("Endereco da empresa:"+company.getAddress());
			//System.out.println("NIF da empresa:"+company.getTaxID());
			logger.info(StringConstants.getString(StringEnumerates.A_aceder_aos_dados_da_empresa___));
			logger.info(StringConstants.getString(StringEnumerates.Nome_da_empresa_)+company.getName());
			logger.info(StringConstants.getString(StringEnumerates.Endereco_da_empresa_)+company.getAddress());
			logger.info(StringConstants.getString(StringEnumerates.NIF_da_empresa_)+company.getTaxID());
			//----------------------
			
			// o Header
			oecd.standard.audit.file.tax.pt1_01.HeaderType ht=Pt1_01Factory.eINSTANCE.createHeaderType();
			//ht.setCompanyName("KTC");
			ht.setCompanyName(company.getName());
			ht.setAuditFileVersion(StringConstants.getString(StringEnumerates._1_01_01));
			//ht.setCompanyID("507287584");					// A empresa a qual os dados se referem. O registo comercial da empresa ou o seu NIF
			if (company.getBusinessRegistration().compareTo("")!=0) ht.setCompanyID(company.getBusinessRegistration());
				else ht.setCompanyID(company.getTaxID());
			ht.setBusinessName(company.getName());				// Designacao comercial (FACULTATIVO)
			//ht.setTaxRegistrationNumber(new BigInteger("507287584"));
			ht.setTaxRegistrationNumber(new BigInteger(company.getTaxID()));
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
			ht.setSoftwareCertificateNumber(StringConstants.getString(StringEnumerates._1345));			// Numero do certificado de software, 0 se nao for aplicavel

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

			ht.setFiscalYear(new BigInteger(Integer.valueOf(year).toString()));
			ht.setStartDate(DatatypeFactory.newInstance().newXMLGregorianCalendarDate(d1_year, d1_month, d1_day, 0));
			ht.setEndDate(DatatypeFactory.newInstance().newXMLGregorianCalendarDate(d2_year, d2_month, d2_day, 0));

			ht.setTaxAccountingBasis(oecd.standard.audit.file.tax.pt1_01.TaxAccountingBasisType.F);

			oecd.standard.audit.file.tax.pt1_01.AddressStructurePT ad=Pt1_01Factory.eINSTANCE.createAddressStructurePT();
			//ad.setCity("Santa Maria da feira");
			ad.setCity(company.getCity());
			//ad.setRegion("Aveiro");
			ad.setRegion(company.getRegion());
			//EDataType es=EcorePackage.eINSTANCE.getEString();
			ad.setCountry(StringConstants.getString(StringEnumerates.PT));
			//ad.setPostalCode("4520-706");
			ad.setPostalCode(company.getPostal());
			//ad.setAddressDetail("Rua EN 327, 1315");
			ad.setAddressDetail(company.getAddress());
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
				if ((custExt.getFirstname()!=null) && (custExt.getLastname()!=null)) 
					cs.setContact(custExt.getFirstname()+ " "+custExt.getLastname());
				cs.setCustomerID(this.trimGUID(custExt.getId()));      // O customerID so pode ter 30 caracteres. Faz-se o trim de 36 do guid para 30...
				cs.setCustomerTaxID(cust.getTaxid());
				cs.setEmail(custExt.getEmail());
				cs.setFax(custExt.getFax());
				cs.setTelephone(custExt.getPhone());
				//cs.setWebsite("");
				cs.setSelfBillingIndicator(new BigInteger(StringConstants.getString(StringEnumerates._0)));

				add = Pt1_01Factory.eINSTANCE.createAddressStructure();
				add.setAddressDetail(custExt.getAddress());					// Obrigatorio
				//add.setBuildingNumber(" ");
				add.setCity(custExt.getCity());								// Obrigatorio
				if (custExt.getCountry()!=null) {							// Obrigatorio
					if (custExt.getCountry().compareToIgnoreCase(StringConstants.getString(StringEnumerates.Portugal))==0)
						add.setCountry(StringConstants.getString(StringEnumerates.PT));
					else
						add.setCountry(StringConstants.getString(StringEnumerates.Desconhecido));
				}
				else {
					add.setCountry(StringConstants.getString(StringEnumerates.PT));
				}

				add.setPostalCode(custExt.getPostal());						// Obrigatorio
				add.setRegion(custExt.getRegion());
				add.setStreetName(custExt.getAddress());
				cs.setBillingAddress(add);

				add = Pt1_01Factory.eINSTANCE.createAddressStructure();
				add.setAddressDetail(custExt.getAddress());
				//add.setBuildingNumber(" ");							// minimo 1 caractere
				add.setCity(custExt.getCity());
				if (custExt.getCountry()!=null) {
					if (custExt.getCountry().compareToIgnoreCase(StringConstants.getString(StringEnumerates.Portugal))==0)
						add.setCountry(StringConstants.getString(StringEnumerates.PT));
					else
						add.setCountry(StringConstants.getString(StringEnumerates.Desconhecido));
				}
				else {
					add.setCountry(StringConstants.getString(StringEnumerates.PT));
				}
					
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
				if ((ti.getTicketType()==TicketInfo.RECEIPT_NORMAL) || (ti.getTicketType()==TicketInfo.RECEIPT_REFUND)) {

					oecd.standard.audit.file.tax.pt1_01.InvoiceType invoice=Pt1_01Factory.eINSTANCE.createInvoiceType();
					
					invoice.setInvoiceNo(ti.getDocumentNo());
					invoice.setInvoiceStatus(oecd.standard.audit.file.tax.pt1_01.InvoiceStatusType.N);		// Documento "Normal"
					
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
						invoice.setInvoiceType(oecd.standard.audit.file.tax.pt1_01.InvoiceTypeType.VD);
						break;
					case TicketInfo.RECEIPT_REFUND:
						// TD = talao de devolucao ->> DEVE PASSAR A NOTA DE CREDITO 'NC'
						invoice.setInvoiceType(oecd.standard.audit.file.tax.pt1_01.InvoiceTypeType.TD);
						break;
					case TicketInfo.RECEIPT_PAYMENT:
						// Isto sera uma Nota de Credito? NC --> NAO DEVE SER CONSIDERADA!!!
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
					
					// vamos especificar qual o perido do recibo....
					Integer periodo=new Integer(c.get(GregorianCalendar.MONTH)+1);
					invoice.setPeriod(new BigInteger(periodo.toString()));

					// vamos processar as linhas da factura
					for (TicketLineInfo tci:ti.getLines())
					{
						oecd.standard.audit.file.tax.pt1_01.LineType line=Pt1_01Factory.eINSTANCE.createLineType();
						
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
							oecd.standard.audit.file.tax.pt1_01.CreditNoteType cn=Pt1_01Factory.eINSTANCE.createCreditNoteType();
							
							cn.setReason(StringConstants.getString(StringEnumerates.Devolucao));
							cn.setReference(StringConstants.getString(StringEnumerates.REC_1_)+ti.getReference());			// aqui deve-se colocar a referencia a factura original. Ex: "FACT 1/3"
						
							oecd.standard.audit.file.tax.pt1_01.ReferencesType ref=Pt1_01Factory.eINSTANCE.createReferencesType();
							ref.setCreditNote(cn);
							line.setReferences(ref);
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
					oecd.standard.audit.file.tax.pt1_01.DocumentTotalsType dt=Pt1_01Factory.eINSTANCE.createDocumentTotalsType();
					//----------------

//					dt.setGrossTotal(totalGrossCredit.subtract(totalGrossDebit));
//					dt.setNetTotal(totalNetCredit.subtract(totalNetDebit));
//					dt.setTaxPayable(totalVATCredit.subtract(totalVATDebit));
					// (ATB)(2011-09-27) Os totais estao em variaveis conforme o tipo de documento
					switch (ti.getTicketType()) {
					case TicketInfo.RECEIPT_NORMAL:
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
			Resource resource2 = new Pt1_01ResourceImpl(URI.createURI(StringConstants.getString(StringEnumerates.file___)+mXmlFile));
			
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
	
