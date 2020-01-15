/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT;
import oecd.standard.audit.file.tax.p.t1._0._301.HeaderType;
import oecd.standard.audit.file.tax.p.t1._0._301.TaxAccountingBasisType;
import oecd.standard.audit.file.tax.p.t1._0._301._301Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getAuditFileVersion <em>Audit File Version</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getCompanyID <em>Company ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getTaxRegistrationNumber <em>Tax Registration Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getTaxAccountingBasis <em>Tax Accounting Basis</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getCompanyAddress <em>Company Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getFiscalYear <em>Fiscal Year</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getCurrencyCode <em>Currency Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getTaxEntity <em>Tax Entity</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getProductCompanyTaxID <em>Product Company Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getSoftwareCertificateNumber <em>Software Certificate Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getProductID <em>Product ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getHeaderComment <em>Header Comment</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl#getWebsite <em>Website</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderTypeImpl extends EObjectImpl implements HeaderType {
	/**
	 * The default value of the '{@link #getAuditFileVersion() <em>Audit File Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditFileVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String AUDIT_FILE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuditFileVersion() <em>Audit File Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditFileVersion()
	 * @generated
	 * @ordered
	 */
	protected String auditFileVersion = AUDIT_FILE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompanyID() <em>Company ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyID()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompanyID() <em>Company ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyID()
	 * @generated
	 * @ordered
	 */
	protected String companyID = COMPANY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxRegistrationNumber() <em>Tax Registration Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxRegistrationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TAX_REGISTRATION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxRegistrationNumber() <em>Tax Registration Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxRegistrationNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger taxRegistrationNumber = TAX_REGISTRATION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxAccountingBasis() <em>Tax Accounting Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAccountingBasis()
	 * @generated
	 * @ordered
	 */
	protected static final TaxAccountingBasisType TAX_ACCOUNTING_BASIS_EDEFAULT = TaxAccountingBasisType.C;

	/**
	 * The cached value of the '{@link #getTaxAccountingBasis() <em>Tax Accounting Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAccountingBasis()
	 * @generated
	 * @ordered
	 */
	protected TaxAccountingBasisType taxAccountingBasis = TAX_ACCOUNTING_BASIS_EDEFAULT;

	/**
	 * This is true if the Tax Accounting Basis attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean taxAccountingBasisESet;

	/**
	 * The default value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected String companyName = COMPANY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusinessName() <em>Business Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessName() <em>Business Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessName()
	 * @generated
	 * @ordered
	 */
	protected String businessName = BUSINESS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompanyAddress() <em>Company Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressStructurePT companyAddress;

	/**
	 * The default value of the '{@link #getFiscalYear() <em>Fiscal Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalYear()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FISCAL_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiscalYear() <em>Fiscal Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalYear()
	 * @generated
	 * @ordered
	 */
	protected BigInteger fiscalYear = FISCAL_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencyCode() <em>Currency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_CODE_EDEFAULT = "EUR";

	/**
	 * The cached value of the '{@link #getCurrencyCode() <em>Currency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected String currencyCode = CURRENCY_CODE_EDEFAULT;

	/**
	 * This is true if the Currency Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currencyCodeESet;

	/**
	 * The default value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateCreated = DATE_CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxEntity() <em>Tax Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxEntity() <em>Tax Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxEntity()
	 * @generated
	 * @ordered
	 */
	protected String taxEntity = TAX_ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductCompanyTaxID() <em>Product Company Tax ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCompanyTaxID()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_COMPANY_TAX_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductCompanyTaxID() <em>Product Company Tax ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCompanyTaxID()
	 * @generated
	 * @ordered
	 */
	protected String productCompanyTaxID = PRODUCT_COMPANY_TAX_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftwareCertificateNumber() <em>Software Certificate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareCertificateNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SOFTWARE_CERTIFICATE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareCertificateNumber() <em>Software Certificate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareCertificateNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger softwareCertificateNumber = SOFTWARE_CERTIFICATE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected String productID = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductVersion() <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductVersion() <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVersion()
	 * @generated
	 * @ordered
	 */
	protected String productVersion = PRODUCT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderComment() <em>Header Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderComment()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderComment() <em>Header Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderComment()
	 * @generated
	 * @ordered
	 */
	protected String headerComment = HEADER_COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected String telephone = TELEPHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected static final String FAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected String fax = FAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected String website = WEBSITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _301Package.eINSTANCE.getHeaderType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuditFileVersion() {
		return auditFileVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditFileVersion(String newAuditFileVersion) {
		String oldAuditFileVersion = auditFileVersion;
		auditFileVersion = newAuditFileVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__AUDIT_FILE_VERSION, oldAuditFileVersion, auditFileVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompanyID() {
		return companyID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyID(String newCompanyID) {
		String oldCompanyID = companyID;
		companyID = newCompanyID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__COMPANY_ID, oldCompanyID, companyID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTaxRegistrationNumber() {
		return taxRegistrationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxRegistrationNumber(BigInteger newTaxRegistrationNumber) {
		BigInteger oldTaxRegistrationNumber = taxRegistrationNumber;
		taxRegistrationNumber = newTaxRegistrationNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__TAX_REGISTRATION_NUMBER, oldTaxRegistrationNumber, taxRegistrationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxAccountingBasisType getTaxAccountingBasis() {
		return taxAccountingBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxAccountingBasis(TaxAccountingBasisType newTaxAccountingBasis) {
		TaxAccountingBasisType oldTaxAccountingBasis = taxAccountingBasis;
		taxAccountingBasis = newTaxAccountingBasis == null ? TAX_ACCOUNTING_BASIS_EDEFAULT : newTaxAccountingBasis;
		boolean oldTaxAccountingBasisESet = taxAccountingBasisESet;
		taxAccountingBasisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__TAX_ACCOUNTING_BASIS, oldTaxAccountingBasis, taxAccountingBasis, !oldTaxAccountingBasisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTaxAccountingBasis() {
		TaxAccountingBasisType oldTaxAccountingBasis = taxAccountingBasis;
		boolean oldTaxAccountingBasisESet = taxAccountingBasisESet;
		taxAccountingBasis = TAX_ACCOUNTING_BASIS_EDEFAULT;
		taxAccountingBasisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _301Package.HEADER_TYPE__TAX_ACCOUNTING_BASIS, oldTaxAccountingBasis, TAX_ACCOUNTING_BASIS_EDEFAULT, oldTaxAccountingBasisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTaxAccountingBasis() {
		return taxAccountingBasisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyName(String newCompanyName) {
		String oldCompanyName = companyName;
		companyName = newCompanyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__COMPANY_NAME, oldCompanyName, companyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessName() {
		return businessName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessName(String newBusinessName) {
		String oldBusinessName = businessName;
		businessName = newBusinessName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__BUSINESS_NAME, oldBusinessName, businessName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructurePT getCompanyAddress() {
		return companyAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompanyAddress(AddressStructurePT newCompanyAddress, NotificationChain msgs) {
		AddressStructurePT oldCompanyAddress = companyAddress;
		companyAddress = newCompanyAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__COMPANY_ADDRESS, oldCompanyAddress, newCompanyAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyAddress(AddressStructurePT newCompanyAddress) {
		if (newCompanyAddress != companyAddress) {
			NotificationChain msgs = null;
			if (companyAddress != null)
				msgs = ((InternalEObject)companyAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _301Package.HEADER_TYPE__COMPANY_ADDRESS, null, msgs);
			if (newCompanyAddress != null)
				msgs = ((InternalEObject)newCompanyAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _301Package.HEADER_TYPE__COMPANY_ADDRESS, null, msgs);
			msgs = basicSetCompanyAddress(newCompanyAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__COMPANY_ADDRESS, newCompanyAddress, newCompanyAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFiscalYear() {
		return fiscalYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiscalYear(BigInteger newFiscalYear) {
		BigInteger oldFiscalYear = fiscalYear;
		fiscalYear = newFiscalYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__FISCAL_YEAR, oldFiscalYear, fiscalYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(XMLGregorianCalendar newStartDate) {
		XMLGregorianCalendar oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(XMLGregorianCalendar newEndDate) {
		XMLGregorianCalendar oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyCode(String newCurrencyCode) {
		String oldCurrencyCode = currencyCode;
		currencyCode = newCurrencyCode;
		boolean oldCurrencyCodeESet = currencyCodeESet;
		currencyCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__CURRENCY_CODE, oldCurrencyCode, currencyCode, !oldCurrencyCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrencyCode() {
		String oldCurrencyCode = currencyCode;
		boolean oldCurrencyCodeESet = currencyCodeESet;
		currencyCode = CURRENCY_CODE_EDEFAULT;
		currencyCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _301Package.HEADER_TYPE__CURRENCY_CODE, oldCurrencyCode, CURRENCY_CODE_EDEFAULT, oldCurrencyCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrencyCode() {
		return currencyCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateCreated() {
		return dateCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCreated(XMLGregorianCalendar newDateCreated) {
		XMLGregorianCalendar oldDateCreated = dateCreated;
		dateCreated = newDateCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__DATE_CREATED, oldDateCreated, dateCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxEntity() {
		return taxEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxEntity(String newTaxEntity) {
		String oldTaxEntity = taxEntity;
		taxEntity = newTaxEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__TAX_ENTITY, oldTaxEntity, taxEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductCompanyTaxID() {
		return productCompanyTaxID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductCompanyTaxID(String newProductCompanyTaxID) {
		String oldProductCompanyTaxID = productCompanyTaxID;
		productCompanyTaxID = newProductCompanyTaxID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__PRODUCT_COMPANY_TAX_ID, oldProductCompanyTaxID, productCompanyTaxID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSoftwareCertificateNumber() {
		return softwareCertificateNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareCertificateNumber(BigInteger newSoftwareCertificateNumber) {
		BigInteger oldSoftwareCertificateNumber = softwareCertificateNumber;
		softwareCertificateNumber = newSoftwareCertificateNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__SOFTWARE_CERTIFICATE_NUMBER, oldSoftwareCertificateNumber, softwareCertificateNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductID() {
		return productID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductID(String newProductID) {
		String oldProductID = productID;
		productID = newProductID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__PRODUCT_ID, oldProductID, productID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductVersion() {
		return productVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductVersion(String newProductVersion) {
		String oldProductVersion = productVersion;
		productVersion = newProductVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__PRODUCT_VERSION, oldProductVersion, productVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeaderComment() {
		return headerComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderComment(String newHeaderComment) {
		String oldHeaderComment = headerComment;
		headerComment = newHeaderComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__HEADER_COMMENT, oldHeaderComment, headerComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephone(String newTelephone) {
		String oldTelephone = telephone;
		telephone = newTelephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__TELEPHONE, oldTelephone, telephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFax(String newFax) {
		String oldFax = fax;
		fax = newFax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__FAX, oldFax, fax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsite(String newWebsite) {
		String oldWebsite = website;
		website = newWebsite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.HEADER_TYPE__WEBSITE, oldWebsite, website));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _301Package.HEADER_TYPE__COMPANY_ADDRESS:
				return basicSetCompanyAddress(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _301Package.HEADER_TYPE__AUDIT_FILE_VERSION:
				return getAuditFileVersion();
			case _301Package.HEADER_TYPE__COMPANY_ID:
				return getCompanyID();
			case _301Package.HEADER_TYPE__TAX_REGISTRATION_NUMBER:
				return getTaxRegistrationNumber();
			case _301Package.HEADER_TYPE__TAX_ACCOUNTING_BASIS:
				return getTaxAccountingBasis();
			case _301Package.HEADER_TYPE__COMPANY_NAME:
				return getCompanyName();
			case _301Package.HEADER_TYPE__BUSINESS_NAME:
				return getBusinessName();
			case _301Package.HEADER_TYPE__COMPANY_ADDRESS:
				return getCompanyAddress();
			case _301Package.HEADER_TYPE__FISCAL_YEAR:
				return getFiscalYear();
			case _301Package.HEADER_TYPE__START_DATE:
				return getStartDate();
			case _301Package.HEADER_TYPE__END_DATE:
				return getEndDate();
			case _301Package.HEADER_TYPE__CURRENCY_CODE:
				return getCurrencyCode();
			case _301Package.HEADER_TYPE__DATE_CREATED:
				return getDateCreated();
			case _301Package.HEADER_TYPE__TAX_ENTITY:
				return getTaxEntity();
			case _301Package.HEADER_TYPE__PRODUCT_COMPANY_TAX_ID:
				return getProductCompanyTaxID();
			case _301Package.HEADER_TYPE__SOFTWARE_CERTIFICATE_NUMBER:
				return getSoftwareCertificateNumber();
			case _301Package.HEADER_TYPE__PRODUCT_ID:
				return getProductID();
			case _301Package.HEADER_TYPE__PRODUCT_VERSION:
				return getProductVersion();
			case _301Package.HEADER_TYPE__HEADER_COMMENT:
				return getHeaderComment();
			case _301Package.HEADER_TYPE__TELEPHONE:
				return getTelephone();
			case _301Package.HEADER_TYPE__FAX:
				return getFax();
			case _301Package.HEADER_TYPE__EMAIL:
				return getEmail();
			case _301Package.HEADER_TYPE__WEBSITE:
				return getWebsite();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _301Package.HEADER_TYPE__AUDIT_FILE_VERSION:
				setAuditFileVersion((String)newValue);
				return;
			case _301Package.HEADER_TYPE__COMPANY_ID:
				setCompanyID((String)newValue);
				return;
			case _301Package.HEADER_TYPE__TAX_REGISTRATION_NUMBER:
				setTaxRegistrationNumber((BigInteger)newValue);
				return;
			case _301Package.HEADER_TYPE__TAX_ACCOUNTING_BASIS:
				setTaxAccountingBasis((TaxAccountingBasisType)newValue);
				return;
			case _301Package.HEADER_TYPE__COMPANY_NAME:
				setCompanyName((String)newValue);
				return;
			case _301Package.HEADER_TYPE__BUSINESS_NAME:
				setBusinessName((String)newValue);
				return;
			case _301Package.HEADER_TYPE__COMPANY_ADDRESS:
				setCompanyAddress((AddressStructurePT)newValue);
				return;
			case _301Package.HEADER_TYPE__FISCAL_YEAR:
				setFiscalYear((BigInteger)newValue);
				return;
			case _301Package.HEADER_TYPE__START_DATE:
				setStartDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.HEADER_TYPE__END_DATE:
				setEndDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.HEADER_TYPE__CURRENCY_CODE:
				setCurrencyCode((String)newValue);
				return;
			case _301Package.HEADER_TYPE__DATE_CREATED:
				setDateCreated((XMLGregorianCalendar)newValue);
				return;
			case _301Package.HEADER_TYPE__TAX_ENTITY:
				setTaxEntity((String)newValue);
				return;
			case _301Package.HEADER_TYPE__PRODUCT_COMPANY_TAX_ID:
				setProductCompanyTaxID((String)newValue);
				return;
			case _301Package.HEADER_TYPE__SOFTWARE_CERTIFICATE_NUMBER:
				setSoftwareCertificateNumber((BigInteger)newValue);
				return;
			case _301Package.HEADER_TYPE__PRODUCT_ID:
				setProductID((String)newValue);
				return;
			case _301Package.HEADER_TYPE__PRODUCT_VERSION:
				setProductVersion((String)newValue);
				return;
			case _301Package.HEADER_TYPE__HEADER_COMMENT:
				setHeaderComment((String)newValue);
				return;
			case _301Package.HEADER_TYPE__TELEPHONE:
				setTelephone((String)newValue);
				return;
			case _301Package.HEADER_TYPE__FAX:
				setFax((String)newValue);
				return;
			case _301Package.HEADER_TYPE__EMAIL:
				setEmail((String)newValue);
				return;
			case _301Package.HEADER_TYPE__WEBSITE:
				setWebsite((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _301Package.HEADER_TYPE__AUDIT_FILE_VERSION:
				setAuditFileVersion(AUDIT_FILE_VERSION_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__COMPANY_ID:
				setCompanyID(COMPANY_ID_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__TAX_REGISTRATION_NUMBER:
				setTaxRegistrationNumber(TAX_REGISTRATION_NUMBER_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__TAX_ACCOUNTING_BASIS:
				unsetTaxAccountingBasis();
				return;
			case _301Package.HEADER_TYPE__COMPANY_NAME:
				setCompanyName(COMPANY_NAME_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__BUSINESS_NAME:
				setBusinessName(BUSINESS_NAME_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__COMPANY_ADDRESS:
				setCompanyAddress((AddressStructurePT)null);
				return;
			case _301Package.HEADER_TYPE__FISCAL_YEAR:
				setFiscalYear(FISCAL_YEAR_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__CURRENCY_CODE:
				unsetCurrencyCode();
				return;
			case _301Package.HEADER_TYPE__DATE_CREATED:
				setDateCreated(DATE_CREATED_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__TAX_ENTITY:
				setTaxEntity(TAX_ENTITY_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__PRODUCT_COMPANY_TAX_ID:
				setProductCompanyTaxID(PRODUCT_COMPANY_TAX_ID_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__SOFTWARE_CERTIFICATE_NUMBER:
				setSoftwareCertificateNumber(SOFTWARE_CERTIFICATE_NUMBER_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__PRODUCT_ID:
				setProductID(PRODUCT_ID_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__PRODUCT_VERSION:
				setProductVersion(PRODUCT_VERSION_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__HEADER_COMMENT:
				setHeaderComment(HEADER_COMMENT_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__TELEPHONE:
				setTelephone(TELEPHONE_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__FAX:
				setFax(FAX_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case _301Package.HEADER_TYPE__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _301Package.HEADER_TYPE__AUDIT_FILE_VERSION:
				return AUDIT_FILE_VERSION_EDEFAULT == null ? auditFileVersion != null : !AUDIT_FILE_VERSION_EDEFAULT.equals(auditFileVersion);
			case _301Package.HEADER_TYPE__COMPANY_ID:
				return COMPANY_ID_EDEFAULT == null ? companyID != null : !COMPANY_ID_EDEFAULT.equals(companyID);
			case _301Package.HEADER_TYPE__TAX_REGISTRATION_NUMBER:
				return TAX_REGISTRATION_NUMBER_EDEFAULT == null ? taxRegistrationNumber != null : !TAX_REGISTRATION_NUMBER_EDEFAULT.equals(taxRegistrationNumber);
			case _301Package.HEADER_TYPE__TAX_ACCOUNTING_BASIS:
				return isSetTaxAccountingBasis();
			case _301Package.HEADER_TYPE__COMPANY_NAME:
				return COMPANY_NAME_EDEFAULT == null ? companyName != null : !COMPANY_NAME_EDEFAULT.equals(companyName);
			case _301Package.HEADER_TYPE__BUSINESS_NAME:
				return BUSINESS_NAME_EDEFAULT == null ? businessName != null : !BUSINESS_NAME_EDEFAULT.equals(businessName);
			case _301Package.HEADER_TYPE__COMPANY_ADDRESS:
				return companyAddress != null;
			case _301Package.HEADER_TYPE__FISCAL_YEAR:
				return FISCAL_YEAR_EDEFAULT == null ? fiscalYear != null : !FISCAL_YEAR_EDEFAULT.equals(fiscalYear);
			case _301Package.HEADER_TYPE__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case _301Package.HEADER_TYPE__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case _301Package.HEADER_TYPE__CURRENCY_CODE:
				return isSetCurrencyCode();
			case _301Package.HEADER_TYPE__DATE_CREATED:
				return DATE_CREATED_EDEFAULT == null ? dateCreated != null : !DATE_CREATED_EDEFAULT.equals(dateCreated);
			case _301Package.HEADER_TYPE__TAX_ENTITY:
				return TAX_ENTITY_EDEFAULT == null ? taxEntity != null : !TAX_ENTITY_EDEFAULT.equals(taxEntity);
			case _301Package.HEADER_TYPE__PRODUCT_COMPANY_TAX_ID:
				return PRODUCT_COMPANY_TAX_ID_EDEFAULT == null ? productCompanyTaxID != null : !PRODUCT_COMPANY_TAX_ID_EDEFAULT.equals(productCompanyTaxID);
			case _301Package.HEADER_TYPE__SOFTWARE_CERTIFICATE_NUMBER:
				return SOFTWARE_CERTIFICATE_NUMBER_EDEFAULT == null ? softwareCertificateNumber != null : !SOFTWARE_CERTIFICATE_NUMBER_EDEFAULT.equals(softwareCertificateNumber);
			case _301Package.HEADER_TYPE__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productID != null : !PRODUCT_ID_EDEFAULT.equals(productID);
			case _301Package.HEADER_TYPE__PRODUCT_VERSION:
				return PRODUCT_VERSION_EDEFAULT == null ? productVersion != null : !PRODUCT_VERSION_EDEFAULT.equals(productVersion);
			case _301Package.HEADER_TYPE__HEADER_COMMENT:
				return HEADER_COMMENT_EDEFAULT == null ? headerComment != null : !HEADER_COMMENT_EDEFAULT.equals(headerComment);
			case _301Package.HEADER_TYPE__TELEPHONE:
				return TELEPHONE_EDEFAULT == null ? telephone != null : !TELEPHONE_EDEFAULT.equals(telephone);
			case _301Package.HEADER_TYPE__FAX:
				return FAX_EDEFAULT == null ? fax != null : !FAX_EDEFAULT.equals(fax);
			case _301Package.HEADER_TYPE__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case _301Package.HEADER_TYPE__WEBSITE:
				return WEBSITE_EDEFAULT == null ? website != null : !WEBSITE_EDEFAULT.equals(website);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (auditFileVersion: ");
		result.append(auditFileVersion);
		result.append(", companyID: ");
		result.append(companyID);
		result.append(", taxRegistrationNumber: ");
		result.append(taxRegistrationNumber);
		result.append(", taxAccountingBasis: ");
		if (taxAccountingBasisESet) result.append(taxAccountingBasis); else result.append("<unset>");
		result.append(", companyName: ");
		result.append(companyName);
		result.append(", businessName: ");
		result.append(businessName);
		result.append(", fiscalYear: ");
		result.append(fiscalYear);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", currencyCode: ");
		if (currencyCodeESet) result.append(currencyCode); else result.append("<unset>");
		result.append(", dateCreated: ");
		result.append(dateCreated);
		result.append(", taxEntity: ");
		result.append(taxEntity);
		result.append(", productCompanyTaxID: ");
		result.append(productCompanyTaxID);
		result.append(", softwareCertificateNumber: ");
		result.append(softwareCertificateNumber);
		result.append(", productID: ");
		result.append(productID);
		result.append(", productVersion: ");
		result.append(productVersion);
		result.append(", headerComment: ");
		result.append(headerComment);
		result.append(", telephone: ");
		result.append(telephone);
		result.append(", fax: ");
		result.append(fax);
		result.append(", email: ");
		result.append(email);
		result.append(", website: ");
		result.append(website);
		result.append(')');
		return result.toString();
	}

} //HeaderTypeImpl
