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

import oecd.standard.audit.file.tax.p.t1._0._201.LineType3;
import oecd.standard.audit.file.tax.p.t1._0._201.TransactionType;
import oecd.standard.audit.file.tax.p.t1._0._201.TransactionTypeType;
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
 * An implementation of the model object '<em><b>Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.TransactionTypeImpl#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.TransactionTypeImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.TransactionTypeImpl#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.TransactionTypeImpl#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.TransactionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.TransactionTypeImpl#getDocArchivalNumber <em>Doc Archival Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.TransactionTypeImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.TransactionTypeImpl#getGLPostingDate <em>GL Posting Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.TransactionTypeImpl#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.TransactionTypeImpl#getSupplierID <em>Supplier ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.TransactionTypeImpl#getLine <em>Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionTypeImpl extends EObjectImpl implements TransactionType {
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
	 * The default value of the '{@link #getDocArchivalNumber() <em>Doc Archival Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocArchivalNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_ARCHIVAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocArchivalNumber() <em>Doc Archival Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocArchivalNumber()
	 * @generated
	 * @ordered
	 */
	protected String docArchivalNumber = DOC_ARCHIVAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionType() <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected static final TransactionTypeType TRANSACTION_TYPE_EDEFAULT = TransactionTypeType.N;

	/**
	 * The cached value of the '{@link #getTransactionType() <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected TransactionTypeType transactionType = TRANSACTION_TYPE_EDEFAULT;

	/**
	 * This is true if the Transaction Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transactionTypeESet;

	/**
	 * The default value of the '{@link #getGLPostingDate() <em>GL Posting Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGLPostingDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GL_POSTING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGLPostingDate() <em>GL Posting Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGLPostingDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gLPostingDate = GL_POSTING_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getSupplierID() <em>Supplier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierID()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierID() <em>Supplier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierID()
	 * @generated
	 * @ordered
	 */
	protected String supplierID = SUPPLIER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<LineType3> line;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _201Package.eINSTANCE.getTransactionType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.TRANSACTION_TYPE__TRANSACTION_ID, oldTransactionID, transactionID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.TRANSACTION_TYPE__PERIOD, oldPeriod, period));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.TRANSACTION_TYPE__TRANSACTION_DATE, oldTransactionDate, transactionDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.TRANSACTION_TYPE__SOURCE_ID, oldSourceID, sourceID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.TRANSACTION_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocArchivalNumber() {
		return docArchivalNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocArchivalNumber(String newDocArchivalNumber) {
		String oldDocArchivalNumber = docArchivalNumber;
		docArchivalNumber = newDocArchivalNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.TRANSACTION_TYPE__DOC_ARCHIVAL_NUMBER, oldDocArchivalNumber, docArchivalNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeType getTransactionType() {
		return transactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionType(TransactionTypeType newTransactionType) {
		TransactionTypeType oldTransactionType = transactionType;
		transactionType = newTransactionType == null ? TRANSACTION_TYPE_EDEFAULT : newTransactionType;
		boolean oldTransactionTypeESet = transactionTypeESet;
		transactionTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.TRANSACTION_TYPE__TRANSACTION_TYPE, oldTransactionType, transactionType, !oldTransactionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransactionType() {
		TransactionTypeType oldTransactionType = transactionType;
		boolean oldTransactionTypeESet = transactionTypeESet;
		transactionType = TRANSACTION_TYPE_EDEFAULT;
		transactionTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _201Package.TRANSACTION_TYPE__TRANSACTION_TYPE, oldTransactionType, TRANSACTION_TYPE_EDEFAULT, oldTransactionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransactionType() {
		return transactionTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGLPostingDate() {
		return gLPostingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGLPostingDate(XMLGregorianCalendar newGLPostingDate) {
		XMLGregorianCalendar oldGLPostingDate = gLPostingDate;
		gLPostingDate = newGLPostingDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.TRANSACTION_TYPE__GL_POSTING_DATE, oldGLPostingDate, gLPostingDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.TRANSACTION_TYPE__CUSTOMER_ID, oldCustomerID, customerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplierID() {
		return supplierID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplierID(String newSupplierID) {
		String oldSupplierID = supplierID;
		supplierID = newSupplierID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.TRANSACTION_TYPE__SUPPLIER_ID, oldSupplierID, supplierID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType3> getLine() {
		if (line == null) {
			line = new EObjectContainmentEList<LineType3>(LineType3.class, this, _201Package.TRANSACTION_TYPE__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _201Package.TRANSACTION_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
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
			case _201Package.TRANSACTION_TYPE__TRANSACTION_ID:
				return getTransactionID();
			case _201Package.TRANSACTION_TYPE__PERIOD:
				return getPeriod();
			case _201Package.TRANSACTION_TYPE__TRANSACTION_DATE:
				return getTransactionDate();
			case _201Package.TRANSACTION_TYPE__SOURCE_ID:
				return getSourceID();
			case _201Package.TRANSACTION_TYPE__DESCRIPTION:
				return getDescription();
			case _201Package.TRANSACTION_TYPE__DOC_ARCHIVAL_NUMBER:
				return getDocArchivalNumber();
			case _201Package.TRANSACTION_TYPE__TRANSACTION_TYPE:
				return getTransactionType();
			case _201Package.TRANSACTION_TYPE__GL_POSTING_DATE:
				return getGLPostingDate();
			case _201Package.TRANSACTION_TYPE__CUSTOMER_ID:
				return getCustomerID();
			case _201Package.TRANSACTION_TYPE__SUPPLIER_ID:
				return getSupplierID();
			case _201Package.TRANSACTION_TYPE__LINE:
				return getLine();
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
			case _201Package.TRANSACTION_TYPE__TRANSACTION_ID:
				setTransactionID((String)newValue);
				return;
			case _201Package.TRANSACTION_TYPE__PERIOD:
				setPeriod((BigInteger)newValue);
				return;
			case _201Package.TRANSACTION_TYPE__TRANSACTION_DATE:
				setTransactionDate((XMLGregorianCalendar)newValue);
				return;
			case _201Package.TRANSACTION_TYPE__SOURCE_ID:
				setSourceID((String)newValue);
				return;
			case _201Package.TRANSACTION_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _201Package.TRANSACTION_TYPE__DOC_ARCHIVAL_NUMBER:
				setDocArchivalNumber((String)newValue);
				return;
			case _201Package.TRANSACTION_TYPE__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)newValue);
				return;
			case _201Package.TRANSACTION_TYPE__GL_POSTING_DATE:
				setGLPostingDate((XMLGregorianCalendar)newValue);
				return;
			case _201Package.TRANSACTION_TYPE__CUSTOMER_ID:
				setCustomerID((String)newValue);
				return;
			case _201Package.TRANSACTION_TYPE__SUPPLIER_ID:
				setSupplierID((String)newValue);
				return;
			case _201Package.TRANSACTION_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType3>)newValue);
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
			case _201Package.TRANSACTION_TYPE__TRANSACTION_ID:
				setTransactionID(TRANSACTION_ID_EDEFAULT);
				return;
			case _201Package.TRANSACTION_TYPE__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case _201Package.TRANSACTION_TYPE__TRANSACTION_DATE:
				setTransactionDate(TRANSACTION_DATE_EDEFAULT);
				return;
			case _201Package.TRANSACTION_TYPE__SOURCE_ID:
				setSourceID(SOURCE_ID_EDEFAULT);
				return;
			case _201Package.TRANSACTION_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _201Package.TRANSACTION_TYPE__DOC_ARCHIVAL_NUMBER:
				setDocArchivalNumber(DOC_ARCHIVAL_NUMBER_EDEFAULT);
				return;
			case _201Package.TRANSACTION_TYPE__TRANSACTION_TYPE:
				unsetTransactionType();
				return;
			case _201Package.TRANSACTION_TYPE__GL_POSTING_DATE:
				setGLPostingDate(GL_POSTING_DATE_EDEFAULT);
				return;
			case _201Package.TRANSACTION_TYPE__CUSTOMER_ID:
				setCustomerID(CUSTOMER_ID_EDEFAULT);
				return;
			case _201Package.TRANSACTION_TYPE__SUPPLIER_ID:
				setSupplierID(SUPPLIER_ID_EDEFAULT);
				return;
			case _201Package.TRANSACTION_TYPE__LINE:
				getLine().clear();
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
			case _201Package.TRANSACTION_TYPE__TRANSACTION_ID:
				return TRANSACTION_ID_EDEFAULT == null ? transactionID != null : !TRANSACTION_ID_EDEFAULT.equals(transactionID);
			case _201Package.TRANSACTION_TYPE__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case _201Package.TRANSACTION_TYPE__TRANSACTION_DATE:
				return TRANSACTION_DATE_EDEFAULT == null ? transactionDate != null : !TRANSACTION_DATE_EDEFAULT.equals(transactionDate);
			case _201Package.TRANSACTION_TYPE__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? sourceID != null : !SOURCE_ID_EDEFAULT.equals(sourceID);
			case _201Package.TRANSACTION_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _201Package.TRANSACTION_TYPE__DOC_ARCHIVAL_NUMBER:
				return DOC_ARCHIVAL_NUMBER_EDEFAULT == null ? docArchivalNumber != null : !DOC_ARCHIVAL_NUMBER_EDEFAULT.equals(docArchivalNumber);
			case _201Package.TRANSACTION_TYPE__TRANSACTION_TYPE:
				return isSetTransactionType();
			case _201Package.TRANSACTION_TYPE__GL_POSTING_DATE:
				return GL_POSTING_DATE_EDEFAULT == null ? gLPostingDate != null : !GL_POSTING_DATE_EDEFAULT.equals(gLPostingDate);
			case _201Package.TRANSACTION_TYPE__CUSTOMER_ID:
				return CUSTOMER_ID_EDEFAULT == null ? customerID != null : !CUSTOMER_ID_EDEFAULT.equals(customerID);
			case _201Package.TRANSACTION_TYPE__SUPPLIER_ID:
				return SUPPLIER_ID_EDEFAULT == null ? supplierID != null : !SUPPLIER_ID_EDEFAULT.equals(supplierID);
			case _201Package.TRANSACTION_TYPE__LINE:
				return line != null && !line.isEmpty();
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
		result.append(" (transactionID: ");
		result.append(transactionID);
		result.append(", period: ");
		result.append(period);
		result.append(", transactionDate: ");
		result.append(transactionDate);
		result.append(", sourceID: ");
		result.append(sourceID);
		result.append(", description: ");
		result.append(description);
		result.append(", docArchivalNumber: ");
		result.append(docArchivalNumber);
		result.append(", transactionType: ");
		if (transactionTypeESet) result.append(transactionType); else result.append("<unset>");
		result.append(", gLPostingDate: ");
		result.append(gLPostingDate);
		result.append(", customerID: ");
		result.append(customerID);
		result.append(", supplierID: ");
		result.append(supplierID);
		result.append(')');
		return result.toString();
	}

} //TransactionTypeImpl
