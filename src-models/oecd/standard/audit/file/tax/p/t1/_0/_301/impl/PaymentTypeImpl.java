/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301.impl;

import java.math.BigInteger;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1;
import oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType2;
import oecd.standard.audit.file.tax.p.t1._0._301.LineType1;
import oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod;
import oecd.standard.audit.file.tax.p.t1._0._301.PaymentType;
import oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTPaymentType;
import oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTax;
import oecd.standard.audit.file.tax.p.t1._0._301._301Package;

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
 * An implementation of the model object '<em><b>Payment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getPaymentRefNo <em>Payment Ref No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getPaymentType <em>Payment Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getSystemID <em>System ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getDocumentStatus <em>Document Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getDocumentTotals <em>Document Totals</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl#getWithholdingTax <em>Withholding Tax</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentTypeImpl extends EObjectImpl implements PaymentType {
	/**
	 * The default value of the '{@link #getPaymentRefNo() <em>Payment Ref No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentRefNo()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_REF_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentRefNo() <em>Payment Ref No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentRefNo()
	 * @generated
	 * @ordered
	 */
	protected String paymentRefNo = PAYMENT_REF_NO_EDEFAULT;

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
	 * The default value of the '{@link #getTransactionDate() <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TRANSACTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionDate() <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar transactionDate = TRANSACTION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentType() <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentType()
	 * @generated
	 * @ordered
	 */
	protected static final SAFTPTPaymentType PAYMENT_TYPE_EDEFAULT = SAFTPTPaymentType.RC;

	/**
	 * The cached value of the '{@link #getPaymentType() <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentType()
	 * @generated
	 * @ordered
	 */
	protected SAFTPTPaymentType paymentType = PAYMENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Payment Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean paymentTypeESet;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemID() <em>System ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemID()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemID() <em>System ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemID()
	 * @generated
	 * @ordered
	 */
	protected String systemID = SYSTEM_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentStatus() <em>Document Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentStatus()
	 * @generated
	 * @ordered
	 */
	protected DocumentStatusType1 documentStatus;

	/**
	 * The cached value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<PaymentMethod> paymentMethod;

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
	protected PaymentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _301Package.eINSTANCE.getPaymentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaymentRefNo() {
		return paymentRefNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentRefNo(String newPaymentRefNo) {
		String oldPaymentRefNo = paymentRefNo;
		paymentRefNo = newPaymentRefNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.PAYMENT_TYPE__PAYMENT_REF_NO, oldPaymentRefNo, paymentRefNo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.PAYMENT_TYPE__PERIOD, oldPeriod, period));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.PAYMENT_TYPE__TRANSACTION_ID, oldTransactionID, transactionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTransactionDate() {
		return transactionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionDate(XMLGregorianCalendar newTransactionDate) {
		XMLGregorianCalendar oldTransactionDate = transactionDate;
		transactionDate = newTransactionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.PAYMENT_TYPE__TRANSACTION_DATE, oldTransactionDate, transactionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAFTPTPaymentType getPaymentType() {
		return paymentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentType(SAFTPTPaymentType newPaymentType) {
		SAFTPTPaymentType oldPaymentType = paymentType;
		paymentType = newPaymentType == null ? PAYMENT_TYPE_EDEFAULT : newPaymentType;
		boolean oldPaymentTypeESet = paymentTypeESet;
		paymentTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.PAYMENT_TYPE__PAYMENT_TYPE, oldPaymentType, paymentType, !oldPaymentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPaymentType() {
		SAFTPTPaymentType oldPaymentType = paymentType;
		boolean oldPaymentTypeESet = paymentTypeESet;
		paymentType = PAYMENT_TYPE_EDEFAULT;
		paymentTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _301Package.PAYMENT_TYPE__PAYMENT_TYPE, oldPaymentType, PAYMENT_TYPE_EDEFAULT, oldPaymentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPaymentType() {
		return paymentTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.PAYMENT_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemID() {
		return systemID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemID(String newSystemID) {
		String oldSystemID = systemID;
		systemID = newSystemID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.PAYMENT_TYPE__SYSTEM_ID, oldSystemID, systemID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStatusType1 getDocumentStatus() {
		return documentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentStatus(DocumentStatusType1 newDocumentStatus, NotificationChain msgs) {
		DocumentStatusType1 oldDocumentStatus = documentStatus;
		documentStatus = newDocumentStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _301Package.PAYMENT_TYPE__DOCUMENT_STATUS, oldDocumentStatus, newDocumentStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentStatus(DocumentStatusType1 newDocumentStatus) {
		if (newDocumentStatus != documentStatus) {
			NotificationChain msgs = null;
			if (documentStatus != null)
				msgs = ((InternalEObject)documentStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _301Package.PAYMENT_TYPE__DOCUMENT_STATUS, null, msgs);
			if (newDocumentStatus != null)
				msgs = ((InternalEObject)newDocumentStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _301Package.PAYMENT_TYPE__DOCUMENT_STATUS, null, msgs);
			msgs = basicSetDocumentStatus(newDocumentStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.PAYMENT_TYPE__DOCUMENT_STATUS, newDocumentStatus, newDocumentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PaymentMethod> getPaymentMethod() {
		if (paymentMethod == null) {
			paymentMethod = new EObjectContainmentEList<PaymentMethod>(PaymentMethod.class, this, _301Package.PAYMENT_TYPE__PAYMENT_METHOD);
		}
		return paymentMethod;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.PAYMENT_TYPE__SOURCE_ID, oldSourceID, sourceID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.PAYMENT_TYPE__SYSTEM_ENTRY_DATE, oldSystemEntryDate, systemEntryDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.PAYMENT_TYPE__CUSTOMER_ID, oldCustomerID, customerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType1> getLine() {
		if (line == null) {
			line = new EObjectContainmentEList<LineType1>(LineType1.class, this, _301Package.PAYMENT_TYPE__LINE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _301Package.PAYMENT_TYPE__DOCUMENT_TOTALS, oldDocumentTotals, newDocumentTotals);
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
				msgs = ((InternalEObject)documentTotals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _301Package.PAYMENT_TYPE__DOCUMENT_TOTALS, null, msgs);
			if (newDocumentTotals != null)
				msgs = ((InternalEObject)newDocumentTotals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _301Package.PAYMENT_TYPE__DOCUMENT_TOTALS, null, msgs);
			msgs = basicSetDocumentTotals(newDocumentTotals, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.PAYMENT_TYPE__DOCUMENT_TOTALS, newDocumentTotals, newDocumentTotals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WithholdingTax> getWithholdingTax() {
		if (withholdingTax == null) {
			withholdingTax = new EObjectContainmentEList<WithholdingTax>(WithholdingTax.class, this, _301Package.PAYMENT_TYPE__WITHHOLDING_TAX);
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
			case _301Package.PAYMENT_TYPE__DOCUMENT_STATUS:
				return basicSetDocumentStatus(null, msgs);
			case _301Package.PAYMENT_TYPE__PAYMENT_METHOD:
				return ((InternalEList<?>)getPaymentMethod()).basicRemove(otherEnd, msgs);
			case _301Package.PAYMENT_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case _301Package.PAYMENT_TYPE__DOCUMENT_TOTALS:
				return basicSetDocumentTotals(null, msgs);
			case _301Package.PAYMENT_TYPE__WITHHOLDING_TAX:
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
			case _301Package.PAYMENT_TYPE__PAYMENT_REF_NO:
				return getPaymentRefNo();
			case _301Package.PAYMENT_TYPE__PERIOD:
				return getPeriod();
			case _301Package.PAYMENT_TYPE__TRANSACTION_ID:
				return getTransactionID();
			case _301Package.PAYMENT_TYPE__TRANSACTION_DATE:
				return getTransactionDate();
			case _301Package.PAYMENT_TYPE__PAYMENT_TYPE:
				return getPaymentType();
			case _301Package.PAYMENT_TYPE__DESCRIPTION:
				return getDescription();
			case _301Package.PAYMENT_TYPE__SYSTEM_ID:
				return getSystemID();
			case _301Package.PAYMENT_TYPE__DOCUMENT_STATUS:
				return getDocumentStatus();
			case _301Package.PAYMENT_TYPE__PAYMENT_METHOD:
				return getPaymentMethod();
			case _301Package.PAYMENT_TYPE__SOURCE_ID:
				return getSourceID();
			case _301Package.PAYMENT_TYPE__SYSTEM_ENTRY_DATE:
				return getSystemEntryDate();
			case _301Package.PAYMENT_TYPE__CUSTOMER_ID:
				return getCustomerID();
			case _301Package.PAYMENT_TYPE__LINE:
				return getLine();
			case _301Package.PAYMENT_TYPE__DOCUMENT_TOTALS:
				return getDocumentTotals();
			case _301Package.PAYMENT_TYPE__WITHHOLDING_TAX:
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
			case _301Package.PAYMENT_TYPE__PAYMENT_REF_NO:
				setPaymentRefNo((String)newValue);
				return;
			case _301Package.PAYMENT_TYPE__PERIOD:
				setPeriod((BigInteger)newValue);
				return;
			case _301Package.PAYMENT_TYPE__TRANSACTION_ID:
				setTransactionID((String)newValue);
				return;
			case _301Package.PAYMENT_TYPE__TRANSACTION_DATE:
				setTransactionDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.PAYMENT_TYPE__PAYMENT_TYPE:
				setPaymentType((SAFTPTPaymentType)newValue);
				return;
			case _301Package.PAYMENT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _301Package.PAYMENT_TYPE__SYSTEM_ID:
				setSystemID((String)newValue);
				return;
			case _301Package.PAYMENT_TYPE__DOCUMENT_STATUS:
				setDocumentStatus((DocumentStatusType1)newValue);
				return;
			case _301Package.PAYMENT_TYPE__PAYMENT_METHOD:
				getPaymentMethod().clear();
				getPaymentMethod().addAll((Collection<? extends PaymentMethod>)newValue);
				return;
			case _301Package.PAYMENT_TYPE__SOURCE_ID:
				setSourceID((String)newValue);
				return;
			case _301Package.PAYMENT_TYPE__SYSTEM_ENTRY_DATE:
				setSystemEntryDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.PAYMENT_TYPE__CUSTOMER_ID:
				setCustomerID((String)newValue);
				return;
			case _301Package.PAYMENT_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType1>)newValue);
				return;
			case _301Package.PAYMENT_TYPE__DOCUMENT_TOTALS:
				setDocumentTotals((DocumentTotalsType2)newValue);
				return;
			case _301Package.PAYMENT_TYPE__WITHHOLDING_TAX:
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
			case _301Package.PAYMENT_TYPE__PAYMENT_REF_NO:
				setPaymentRefNo(PAYMENT_REF_NO_EDEFAULT);
				return;
			case _301Package.PAYMENT_TYPE__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case _301Package.PAYMENT_TYPE__TRANSACTION_ID:
				setTransactionID(TRANSACTION_ID_EDEFAULT);
				return;
			case _301Package.PAYMENT_TYPE__TRANSACTION_DATE:
				setTransactionDate(TRANSACTION_DATE_EDEFAULT);
				return;
			case _301Package.PAYMENT_TYPE__PAYMENT_TYPE:
				unsetPaymentType();
				return;
			case _301Package.PAYMENT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _301Package.PAYMENT_TYPE__SYSTEM_ID:
				setSystemID(SYSTEM_ID_EDEFAULT);
				return;
			case _301Package.PAYMENT_TYPE__DOCUMENT_STATUS:
				setDocumentStatus((DocumentStatusType1)null);
				return;
			case _301Package.PAYMENT_TYPE__PAYMENT_METHOD:
				getPaymentMethod().clear();
				return;
			case _301Package.PAYMENT_TYPE__SOURCE_ID:
				setSourceID(SOURCE_ID_EDEFAULT);
				return;
			case _301Package.PAYMENT_TYPE__SYSTEM_ENTRY_DATE:
				setSystemEntryDate(SYSTEM_ENTRY_DATE_EDEFAULT);
				return;
			case _301Package.PAYMENT_TYPE__CUSTOMER_ID:
				setCustomerID(CUSTOMER_ID_EDEFAULT);
				return;
			case _301Package.PAYMENT_TYPE__LINE:
				getLine().clear();
				return;
			case _301Package.PAYMENT_TYPE__DOCUMENT_TOTALS:
				setDocumentTotals((DocumentTotalsType2)null);
				return;
			case _301Package.PAYMENT_TYPE__WITHHOLDING_TAX:
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
			case _301Package.PAYMENT_TYPE__PAYMENT_REF_NO:
				return PAYMENT_REF_NO_EDEFAULT == null ? paymentRefNo != null : !PAYMENT_REF_NO_EDEFAULT.equals(paymentRefNo);
			case _301Package.PAYMENT_TYPE__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case _301Package.PAYMENT_TYPE__TRANSACTION_ID:
				return TRANSACTION_ID_EDEFAULT == null ? transactionID != null : !TRANSACTION_ID_EDEFAULT.equals(transactionID);
			case _301Package.PAYMENT_TYPE__TRANSACTION_DATE:
				return TRANSACTION_DATE_EDEFAULT == null ? transactionDate != null : !TRANSACTION_DATE_EDEFAULT.equals(transactionDate);
			case _301Package.PAYMENT_TYPE__PAYMENT_TYPE:
				return isSetPaymentType();
			case _301Package.PAYMENT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _301Package.PAYMENT_TYPE__SYSTEM_ID:
				return SYSTEM_ID_EDEFAULT == null ? systemID != null : !SYSTEM_ID_EDEFAULT.equals(systemID);
			case _301Package.PAYMENT_TYPE__DOCUMENT_STATUS:
				return documentStatus != null;
			case _301Package.PAYMENT_TYPE__PAYMENT_METHOD:
				return paymentMethod != null && !paymentMethod.isEmpty();
			case _301Package.PAYMENT_TYPE__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? sourceID != null : !SOURCE_ID_EDEFAULT.equals(sourceID);
			case _301Package.PAYMENT_TYPE__SYSTEM_ENTRY_DATE:
				return SYSTEM_ENTRY_DATE_EDEFAULT == null ? systemEntryDate != null : !SYSTEM_ENTRY_DATE_EDEFAULT.equals(systemEntryDate);
			case _301Package.PAYMENT_TYPE__CUSTOMER_ID:
				return CUSTOMER_ID_EDEFAULT == null ? customerID != null : !CUSTOMER_ID_EDEFAULT.equals(customerID);
			case _301Package.PAYMENT_TYPE__LINE:
				return line != null && !line.isEmpty();
			case _301Package.PAYMENT_TYPE__DOCUMENT_TOTALS:
				return documentTotals != null;
			case _301Package.PAYMENT_TYPE__WITHHOLDING_TAX:
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
		result.append(" (paymentRefNo: ");
		result.append(paymentRefNo);
		result.append(", period: ");
		result.append(period);
		result.append(", transactionID: ");
		result.append(transactionID);
		result.append(", transactionDate: ");
		result.append(transactionDate);
		result.append(", paymentType: ");
		if (paymentTypeESet) result.append(paymentType); else result.append("<unset>");
		result.append(", description: ");
		result.append(description);
		result.append(", systemID: ");
		result.append(systemID);
		result.append(", sourceID: ");
		result.append(sourceID);
		result.append(", systemEntryDate: ");
		result.append(systemEntryDate);
		result.append(", customerID: ");
		result.append(customerID);
		result.append(')');
		return result.toString();
	}

} //PaymentTypeImpl
