/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201.impl;

import java.math.BigInteger;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType2;
import oecd.standard.audit.file.tax.p.t1._0._201.DocumentTotalsType2;
import oecd.standard.audit.file.tax.p.t1._0._201.InvoiceType;
import oecd.standard.audit.file.tax.p.t1._0._201.InvoiceTypeType;
import oecd.standard.audit.file.tax.p.t1._0._201.LineType1;
import oecd.standard.audit.file.tax.p.t1._0._201.ShippingPointStructure;
import oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTax;
import oecd.standard.audit.file.tax.p.t1._0._201._201Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getInvoiceNo <em>Invoice No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getDocumentStatus <em>Document Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getHash <em>Hash</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getHashControl <em>Hash Control</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getInvoiceType <em>Invoice Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getSelfBillingIndicator <em>Self Billing Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getEACCode <em>EAC Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getShipFrom <em>Ship From</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getMovementEndTime <em>Movement End Time</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getMovementStartTime <em>Movement Start Time</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getDocumentTotals <em>Document Totals</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.InvoiceTypeImpl#getWithholdingTax <em>Withholding Tax</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvoiceTypeImpl extends EObjectImpl implements InvoiceType {
	/**
	 * The default value of the '{@link #getInvoiceNo() <em>Invoice No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceNo()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceNo() <em>Invoice No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceNo()
	 * @generated
	 * @ordered
	 */
	protected String invoiceNo = INVOICE_NO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentStatus() <em>Document Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentStatus()
	 * @generated
	 * @ordered
	 */
	protected DocumentStatusType2 documentStatus;

	/**
	 * The default value of the '{@link #getHash() <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected static final String HASH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHash() <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected String hash = HASH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHashControl() <em>Hash Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashControl()
	 * @generated
	 * @ordered
	 */
	protected static final String HASH_CONTROL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHashControl() <em>Hash Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashControl()
	 * @generated
	 * @ordered
	 */
	protected String hashControl = HASH_CONTROL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected BigInteger period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvoiceDate() <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar INVOICE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceDate() <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar invoiceDate = INVOICE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvoiceType() <em>Invoice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceType()
	 * @generated
	 * @ordered
	 */
	protected static final InvoiceTypeType INVOICE_TYPE_EDEFAULT = InvoiceTypeType.FT;

	/**
	 * The cached value of the '{@link #getInvoiceType() <em>Invoice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceType()
	 * @generated
	 * @ordered
	 */
	protected InvoiceTypeType invoiceType = INVOICE_TYPE_EDEFAULT;

	/**
	 * This is true if the Invoice Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean invoiceTypeESet;

	/**
	 * The default value of the '{@link #getSelfBillingIndicator() <em>Self Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfBillingIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SELF_BILLING_INDICATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelfBillingIndicator() <em>Self Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfBillingIndicator()
	 * @generated
	 * @ordered
	 */
	protected BigInteger selfBillingIndicator = SELF_BILLING_INDICATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceID() <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceID() <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceID()
	 * @generated
	 * @ordered
	 */
	protected String sourceID = SOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEACCode() <em>EAC Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEACCode()
	 * @generated
	 * @ordered
	 */
	protected static final String EAC_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEACCode() <em>EAC Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEACCode()
	 * @generated
	 * @ordered
	 */
	protected String eACCode = EAC_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemEntryDate() <em>System Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemEntryDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar SYSTEM_ENTRY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemEntryDate() <em>System Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemEntryDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar systemEntryDate = SYSTEM_ENTRY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionID() <em>Transaction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionID()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionID() <em>Transaction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionID()
	 * @generated
	 * @ordered
	 */
	protected String transactionID = TRANSACTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerID() <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerID()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerID() <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerID()
	 * @generated
	 * @ordered
	 */
	protected String customerID = CUSTOMER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShipTo() <em>Ship To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipTo()
	 * @generated
	 * @ordered
	 */
	protected ShippingPointStructure shipTo;

	/**
	 * The cached value of the '{@link #getShipFrom() <em>Ship From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipFrom()
	 * @generated
	 * @ordered
	 */
	protected ShippingPointStructure shipFrom;

	/**
	 * The default value of the '{@link #getMovementEndTime() <em>Movement End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MOVEMENT_END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMovementEndTime() <em>Movement End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementEndTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar movementEndTime = MOVEMENT_END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMovementStartTime() <em>Movement Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MOVEMENT_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMovementStartTime() <em>Movement Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementStartTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar movementStartTime = MOVEMENT_START_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<LineType1> line;

	/**
	 * The cached value of the '{@link #getDocumentTotals() <em>Document Totals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentTotals()
	 * @generated
	 * @ordered
	 */
	protected DocumentTotalsType2 documentTotals;

	/**
	 * The cached value of the '{@link #getWithholdingTax() <em>Withholding Tax</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithholdingTax()
	 * @generated
	 * @ordered
	 */
	protected EList<WithholdingTax> withholdingTax;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _201Package.eINSTANCE.getInvoiceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvoiceNo() {
		return invoiceNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceNo(String newInvoiceNo) {
		String oldInvoiceNo = invoiceNo;
		invoiceNo = newInvoiceNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__INVOICE_NO, oldInvoiceNo, invoiceNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStatusType2 getDocumentStatus() {
		return documentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentStatus(DocumentStatusType2 newDocumentStatus, NotificationChain msgs) {
		DocumentStatusType2 oldDocumentStatus = documentStatus;
		documentStatus = newDocumentStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__DOCUMENT_STATUS, oldDocumentStatus, newDocumentStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentStatus(DocumentStatusType2 newDocumentStatus) {
		if (newDocumentStatus != documentStatus) {
			NotificationChain msgs = null;
			if (documentStatus != null)
				msgs = ((InternalEObject)documentStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _201Package.INVOICE_TYPE__DOCUMENT_STATUS, null, msgs);
			if (newDocumentStatus != null)
				msgs = ((InternalEObject)newDocumentStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _201Package.INVOICE_TYPE__DOCUMENT_STATUS, null, msgs);
			msgs = basicSetDocumentStatus(newDocumentStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__DOCUMENT_STATUS, newDocumentStatus, newDocumentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(String newHash) {
		String oldHash = hash;
		hash = newHash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__HASH, oldHash, hash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHashControl() {
		return hashControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashControl(String newHashControl) {
		String oldHashControl = hashControl;
		hashControl = newHashControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__HASH_CONTROL, oldHashControl, hashControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(BigInteger newPeriod) {
		BigInteger oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceDate(XMLGregorianCalendar newInvoiceDate) {
		XMLGregorianCalendar oldInvoiceDate = invoiceDate;
		invoiceDate = newInvoiceDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__INVOICE_DATE, oldInvoiceDate, invoiceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceTypeType getInvoiceType() {
		return invoiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceType(InvoiceTypeType newInvoiceType) {
		InvoiceTypeType oldInvoiceType = invoiceType;
		invoiceType = newInvoiceType == null ? INVOICE_TYPE_EDEFAULT : newInvoiceType;
		boolean oldInvoiceTypeESet = invoiceTypeESet;
		invoiceTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__INVOICE_TYPE, oldInvoiceType, invoiceType, !oldInvoiceTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInvoiceType() {
		InvoiceTypeType oldInvoiceType = invoiceType;
		boolean oldInvoiceTypeESet = invoiceTypeESet;
		invoiceType = INVOICE_TYPE_EDEFAULT;
		invoiceTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _201Package.INVOICE_TYPE__INVOICE_TYPE, oldInvoiceType, INVOICE_TYPE_EDEFAULT, oldInvoiceTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInvoiceType() {
		return invoiceTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSelfBillingIndicator() {
		return selfBillingIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfBillingIndicator(BigInteger newSelfBillingIndicator) {
		BigInteger oldSelfBillingIndicator = selfBillingIndicator;
		selfBillingIndicator = newSelfBillingIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__SELF_BILLING_INDICATOR, oldSelfBillingIndicator, selfBillingIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceID() {
		return sourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceID(String newSourceID) {
		String oldSourceID = sourceID;
		sourceID = newSourceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__SOURCE_ID, oldSourceID, sourceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEACCode() {
		return eACCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEACCode(String newEACCode) {
		String oldEACCode = eACCode;
		eACCode = newEACCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__EAC_CODE, oldEACCode, eACCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getSystemEntryDate() {
		return systemEntryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemEntryDate(XMLGregorianCalendar newSystemEntryDate) {
		XMLGregorianCalendar oldSystemEntryDate = systemEntryDate;
		systemEntryDate = newSystemEntryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__SYSTEM_ENTRY_DATE, oldSystemEntryDate, systemEntryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransactionID() {
		return transactionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionID(String newTransactionID) {
		String oldTransactionID = transactionID;
		transactionID = newTransactionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__TRANSACTION_ID, oldTransactionID, transactionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerID(String newCustomerID) {
		String oldCustomerID = customerID;
		customerID = newCustomerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__CUSTOMER_ID, oldCustomerID, customerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShippingPointStructure getShipTo() {
		return shipTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipTo(ShippingPointStructure newShipTo, NotificationChain msgs) {
		ShippingPointStructure oldShipTo = shipTo;
		shipTo = newShipTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__SHIP_TO, oldShipTo, newShipTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipTo(ShippingPointStructure newShipTo) {
		if (newShipTo != shipTo) {
			NotificationChain msgs = null;
			if (shipTo != null)
				msgs = ((InternalEObject)shipTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _201Package.INVOICE_TYPE__SHIP_TO, null, msgs);
			if (newShipTo != null)
				msgs = ((InternalEObject)newShipTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _201Package.INVOICE_TYPE__SHIP_TO, null, msgs);
			msgs = basicSetShipTo(newShipTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__SHIP_TO, newShipTo, newShipTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShippingPointStructure getShipFrom() {
		return shipFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipFrom(ShippingPointStructure newShipFrom, NotificationChain msgs) {
		ShippingPointStructure oldShipFrom = shipFrom;
		shipFrom = newShipFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__SHIP_FROM, oldShipFrom, newShipFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipFrom(ShippingPointStructure newShipFrom) {
		if (newShipFrom != shipFrom) {
			NotificationChain msgs = null;
			if (shipFrom != null)
				msgs = ((InternalEObject)shipFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _201Package.INVOICE_TYPE__SHIP_FROM, null, msgs);
			if (newShipFrom != null)
				msgs = ((InternalEObject)newShipFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _201Package.INVOICE_TYPE__SHIP_FROM, null, msgs);
			msgs = basicSetShipFrom(newShipFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__SHIP_FROM, newShipFrom, newShipFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getMovementEndTime() {
		return movementEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementEndTime(XMLGregorianCalendar newMovementEndTime) {
		XMLGregorianCalendar oldMovementEndTime = movementEndTime;
		movementEndTime = newMovementEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__MOVEMENT_END_TIME, oldMovementEndTime, movementEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getMovementStartTime() {
		return movementStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementStartTime(XMLGregorianCalendar newMovementStartTime) {
		XMLGregorianCalendar oldMovementStartTime = movementStartTime;
		movementStartTime = newMovementStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__MOVEMENT_START_TIME, oldMovementStartTime, movementStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType1> getLine() {
		if (line == null) {
			line = new EObjectContainmentEList<LineType1>(LineType1.class, this, _201Package.INVOICE_TYPE__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentTotalsType2 getDocumentTotals() {
		return documentTotals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentTotals(DocumentTotalsType2 newDocumentTotals, NotificationChain msgs) {
		DocumentTotalsType2 oldDocumentTotals = documentTotals;
		documentTotals = newDocumentTotals;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__DOCUMENT_TOTALS, oldDocumentTotals, newDocumentTotals);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentTotals(DocumentTotalsType2 newDocumentTotals) {
		if (newDocumentTotals != documentTotals) {
			NotificationChain msgs = null;
			if (documentTotals != null)
				msgs = ((InternalEObject)documentTotals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _201Package.INVOICE_TYPE__DOCUMENT_TOTALS, null, msgs);
			if (newDocumentTotals != null)
				msgs = ((InternalEObject)newDocumentTotals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _201Package.INVOICE_TYPE__DOCUMENT_TOTALS, null, msgs);
			msgs = basicSetDocumentTotals(newDocumentTotals, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.INVOICE_TYPE__DOCUMENT_TOTALS, newDocumentTotals, newDocumentTotals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WithholdingTax> getWithholdingTax() {
		if (withholdingTax == null) {
			withholdingTax = new EObjectContainmentEList<WithholdingTax>(WithholdingTax.class, this, _201Package.INVOICE_TYPE__WITHHOLDING_TAX);
		}
		return withholdingTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _201Package.INVOICE_TYPE__DOCUMENT_STATUS:
				return basicSetDocumentStatus(null, msgs);
			case _201Package.INVOICE_TYPE__SHIP_TO:
				return basicSetShipTo(null, msgs);
			case _201Package.INVOICE_TYPE__SHIP_FROM:
				return basicSetShipFrom(null, msgs);
			case _201Package.INVOICE_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case _201Package.INVOICE_TYPE__DOCUMENT_TOTALS:
				return basicSetDocumentTotals(null, msgs);
			case _201Package.INVOICE_TYPE__WITHHOLDING_TAX:
				return ((InternalEList<?>)getWithholdingTax()).basicRemove(otherEnd, msgs);
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
			case _201Package.INVOICE_TYPE__INVOICE_NO:
				return getInvoiceNo();
			case _201Package.INVOICE_TYPE__DOCUMENT_STATUS:
				return getDocumentStatus();
			case _201Package.INVOICE_TYPE__HASH:
				return getHash();
			case _201Package.INVOICE_TYPE__HASH_CONTROL:
				return getHashControl();
			case _201Package.INVOICE_TYPE__PERIOD:
				return getPeriod();
			case _201Package.INVOICE_TYPE__INVOICE_DATE:
				return getInvoiceDate();
			case _201Package.INVOICE_TYPE__INVOICE_TYPE:
				return getInvoiceType();
			case _201Package.INVOICE_TYPE__SELF_BILLING_INDICATOR:
				return getSelfBillingIndicator();
			case _201Package.INVOICE_TYPE__SOURCE_ID:
				return getSourceID();
			case _201Package.INVOICE_TYPE__EAC_CODE:
				return getEACCode();
			case _201Package.INVOICE_TYPE__SYSTEM_ENTRY_DATE:
				return getSystemEntryDate();
			case _201Package.INVOICE_TYPE__TRANSACTION_ID:
				return getTransactionID();
			case _201Package.INVOICE_TYPE__CUSTOMER_ID:
				return getCustomerID();
			case _201Package.INVOICE_TYPE__SHIP_TO:
				return getShipTo();
			case _201Package.INVOICE_TYPE__SHIP_FROM:
				return getShipFrom();
			case _201Package.INVOICE_TYPE__MOVEMENT_END_TIME:
				return getMovementEndTime();
			case _201Package.INVOICE_TYPE__MOVEMENT_START_TIME:
				return getMovementStartTime();
			case _201Package.INVOICE_TYPE__LINE:
				return getLine();
			case _201Package.INVOICE_TYPE__DOCUMENT_TOTALS:
				return getDocumentTotals();
			case _201Package.INVOICE_TYPE__WITHHOLDING_TAX:
				return getWithholdingTax();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _201Package.INVOICE_TYPE__INVOICE_NO:
				setInvoiceNo((String)newValue);
				return;
			case _201Package.INVOICE_TYPE__DOCUMENT_STATUS:
				setDocumentStatus((DocumentStatusType2)newValue);
				return;
			case _201Package.INVOICE_TYPE__HASH:
				setHash((String)newValue);
				return;
			case _201Package.INVOICE_TYPE__HASH_CONTROL:
				setHashControl((String)newValue);
				return;
			case _201Package.INVOICE_TYPE__PERIOD:
				setPeriod((BigInteger)newValue);
				return;
			case _201Package.INVOICE_TYPE__INVOICE_DATE:
				setInvoiceDate((XMLGregorianCalendar)newValue);
				return;
			case _201Package.INVOICE_TYPE__INVOICE_TYPE:
				setInvoiceType((InvoiceTypeType)newValue);
				return;
			case _201Package.INVOICE_TYPE__SELF_BILLING_INDICATOR:
				setSelfBillingIndicator((BigInteger)newValue);
				return;
			case _201Package.INVOICE_TYPE__SOURCE_ID:
				setSourceID((String)newValue);
				return;
			case _201Package.INVOICE_TYPE__EAC_CODE:
				setEACCode((String)newValue);
				return;
			case _201Package.INVOICE_TYPE__SYSTEM_ENTRY_DATE:
				setSystemEntryDate((XMLGregorianCalendar)newValue);
				return;
			case _201Package.INVOICE_TYPE__TRANSACTION_ID:
				setTransactionID((String)newValue);
				return;
			case _201Package.INVOICE_TYPE__CUSTOMER_ID:
				setCustomerID((String)newValue);
				return;
			case _201Package.INVOICE_TYPE__SHIP_TO:
				setShipTo((ShippingPointStructure)newValue);
				return;
			case _201Package.INVOICE_TYPE__SHIP_FROM:
				setShipFrom((ShippingPointStructure)newValue);
				return;
			case _201Package.INVOICE_TYPE__MOVEMENT_END_TIME:
				setMovementEndTime((XMLGregorianCalendar)newValue);
				return;
			case _201Package.INVOICE_TYPE__MOVEMENT_START_TIME:
				setMovementStartTime((XMLGregorianCalendar)newValue);
				return;
			case _201Package.INVOICE_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType1>)newValue);
				return;
			case _201Package.INVOICE_TYPE__DOCUMENT_TOTALS:
				setDocumentTotals((DocumentTotalsType2)newValue);
				return;
			case _201Package.INVOICE_TYPE__WITHHOLDING_TAX:
				getWithholdingTax().clear();
				getWithholdingTax().addAll((Collection<? extends WithholdingTax>)newValue);
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
			case _201Package.INVOICE_TYPE__INVOICE_NO:
				setInvoiceNo(INVOICE_NO_EDEFAULT);
				return;
			case _201Package.INVOICE_TYPE__DOCUMENT_STATUS:
				setDocumentStatus((DocumentStatusType2)null);
				return;
			case _201Package.INVOICE_TYPE__HASH:
				setHash(HASH_EDEFAULT);
				return;
			case _201Package.INVOICE_TYPE__HASH_CONTROL:
				setHashControl(HASH_CONTROL_EDEFAULT);
				return;
			case _201Package.INVOICE_TYPE__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case _201Package.INVOICE_TYPE__INVOICE_DATE:
				setInvoiceDate(INVOICE_DATE_EDEFAULT);
				return;
			case _201Package.INVOICE_TYPE__INVOICE_TYPE:
				unsetInvoiceType();
				return;
			case _201Package.INVOICE_TYPE__SELF_BILLING_INDICATOR:
				setSelfBillingIndicator(SELF_BILLING_INDICATOR_EDEFAULT);
				return;
			case _201Package.INVOICE_TYPE__SOURCE_ID:
				setSourceID(SOURCE_ID_EDEFAULT);
				return;
			case _201Package.INVOICE_TYPE__EAC_CODE:
				setEACCode(EAC_CODE_EDEFAULT);
				return;
			case _201Package.INVOICE_TYPE__SYSTEM_ENTRY_DATE:
				setSystemEntryDate(SYSTEM_ENTRY_DATE_EDEFAULT);
				return;
			case _201Package.INVOICE_TYPE__TRANSACTION_ID:
				setTransactionID(TRANSACTION_ID_EDEFAULT);
				return;
			case _201Package.INVOICE_TYPE__CUSTOMER_ID:
				setCustomerID(CUSTOMER_ID_EDEFAULT);
				return;
			case _201Package.INVOICE_TYPE__SHIP_TO:
				setShipTo((ShippingPointStructure)null);
				return;
			case _201Package.INVOICE_TYPE__SHIP_FROM:
				setShipFrom((ShippingPointStructure)null);
				return;
			case _201Package.INVOICE_TYPE__MOVEMENT_END_TIME:
				setMovementEndTime(MOVEMENT_END_TIME_EDEFAULT);
				return;
			case _201Package.INVOICE_TYPE__MOVEMENT_START_TIME:
				setMovementStartTime(MOVEMENT_START_TIME_EDEFAULT);
				return;
			case _201Package.INVOICE_TYPE__LINE:
				getLine().clear();
				return;
			case _201Package.INVOICE_TYPE__DOCUMENT_TOTALS:
				setDocumentTotals((DocumentTotalsType2)null);
				return;
			case _201Package.INVOICE_TYPE__WITHHOLDING_TAX:
				getWithholdingTax().clear();
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
			case _201Package.INVOICE_TYPE__INVOICE_NO:
				return INVOICE_NO_EDEFAULT == null ? invoiceNo != null : !INVOICE_NO_EDEFAULT.equals(invoiceNo);
			case _201Package.INVOICE_TYPE__DOCUMENT_STATUS:
				return documentStatus != null;
			case _201Package.INVOICE_TYPE__HASH:
				return HASH_EDEFAULT == null ? hash != null : !HASH_EDEFAULT.equals(hash);
			case _201Package.INVOICE_TYPE__HASH_CONTROL:
				return HASH_CONTROL_EDEFAULT == null ? hashControl != null : !HASH_CONTROL_EDEFAULT.equals(hashControl);
			case _201Package.INVOICE_TYPE__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case _201Package.INVOICE_TYPE__INVOICE_DATE:
				return INVOICE_DATE_EDEFAULT == null ? invoiceDate != null : !INVOICE_DATE_EDEFAULT.equals(invoiceDate);
			case _201Package.INVOICE_TYPE__INVOICE_TYPE:
				return isSetInvoiceType();
			case _201Package.INVOICE_TYPE__SELF_BILLING_INDICATOR:
				return SELF_BILLING_INDICATOR_EDEFAULT == null ? selfBillingIndicator != null : !SELF_BILLING_INDICATOR_EDEFAULT.equals(selfBillingIndicator);
			case _201Package.INVOICE_TYPE__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? sourceID != null : !SOURCE_ID_EDEFAULT.equals(sourceID);
			case _201Package.INVOICE_TYPE__EAC_CODE:
				return EAC_CODE_EDEFAULT == null ? eACCode != null : !EAC_CODE_EDEFAULT.equals(eACCode);
			case _201Package.INVOICE_TYPE__SYSTEM_ENTRY_DATE:
				return SYSTEM_ENTRY_DATE_EDEFAULT == null ? systemEntryDate != null : !SYSTEM_ENTRY_DATE_EDEFAULT.equals(systemEntryDate);
			case _201Package.INVOICE_TYPE__TRANSACTION_ID:
				return TRANSACTION_ID_EDEFAULT == null ? transactionID != null : !TRANSACTION_ID_EDEFAULT.equals(transactionID);
			case _201Package.INVOICE_TYPE__CUSTOMER_ID:
				return CUSTOMER_ID_EDEFAULT == null ? customerID != null : !CUSTOMER_ID_EDEFAULT.equals(customerID);
			case _201Package.INVOICE_TYPE__SHIP_TO:
				return shipTo != null;
			case _201Package.INVOICE_TYPE__SHIP_FROM:
				return shipFrom != null;
			case _201Package.INVOICE_TYPE__MOVEMENT_END_TIME:
				return MOVEMENT_END_TIME_EDEFAULT == null ? movementEndTime != null : !MOVEMENT_END_TIME_EDEFAULT.equals(movementEndTime);
			case _201Package.INVOICE_TYPE__MOVEMENT_START_TIME:
				return MOVEMENT_START_TIME_EDEFAULT == null ? movementStartTime != null : !MOVEMENT_START_TIME_EDEFAULT.equals(movementStartTime);
			case _201Package.INVOICE_TYPE__LINE:
				return line != null && !line.isEmpty();
			case _201Package.INVOICE_TYPE__DOCUMENT_TOTALS:
				return documentTotals != null;
			case _201Package.INVOICE_TYPE__WITHHOLDING_TAX:
				return withholdingTax != null && !withholdingTax.isEmpty();
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
		result.append(" (invoiceNo: ");
		result.append(invoiceNo);
		result.append(", hash: ");
		result.append(hash);
		result.append(", hashControl: ");
		result.append(hashControl);
		result.append(", period: ");
		result.append(period);
		result.append(", invoiceDate: ");
		result.append(invoiceDate);
		result.append(", invoiceType: ");
		if (invoiceTypeESet) result.append(invoiceType); else result.append("<unset>");
		result.append(", selfBillingIndicator: ");
		result.append(selfBillingIndicator);
		result.append(", sourceID: ");
		result.append(sourceID);
		result.append(", eACCode: ");
		result.append(eACCode);
		result.append(", systemEntryDate: ");
		result.append(systemEntryDate);
		result.append(", transactionID: ");
		result.append(transactionID);
		result.append(", customerID: ");
		result.append(customerID);
		result.append(", movementEndTime: ");
		result.append(movementEndTime);
		result.append(", movementStartTime: ");
		result.append(movementStartTime);
		result.append(')');
		return result.toString();
	}

} //InvoiceTypeImpl
