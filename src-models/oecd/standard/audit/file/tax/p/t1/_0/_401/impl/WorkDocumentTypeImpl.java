/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import java.math.BigInteger;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType;
import oecd.standard.audit.file.tax.p.t1._0._401.DocumentTotalsType;
import oecd.standard.audit.file.tax.p.t1._0._401.LineType2;
import oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType;
import oecd.standard.audit.file.tax.p.t1._0._401.WorkTypeType;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

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
 * An implementation of the model object '<em><b>Work Document Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getDocumentNumber <em>Document Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getATCUD <em>ATCUD</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getDocumentStatus <em>Document Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getHash <em>Hash</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getHashControl <em>Hash Control</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getWorkDate <em>Work Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getWorkType <em>Work Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getEACCode <em>EAC Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.WorkDocumentTypeImpl#getDocumentTotals <em>Document Totals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkDocumentTypeImpl extends EObjectImpl implements WorkDocumentType {
	/**
	 * The default value of the '{@link #getDocumentNumber() <em>Document Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentNumber() <em>Document Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentNumber()
	 * @generated
	 * @ordered
	 */
	protected String documentNumber = DOCUMENT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getATCUD() <em>ATCUD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATCUD()
	 * @generated
	 * @ordered
	 */
	protected static final String ATCUD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getATCUD() <em>ATCUD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATCUD()
	 * @generated
	 * @ordered
	 */
	protected String aTCUD = ATCUD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentStatus() <em>Document Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentStatus()
	 * @generated
	 * @ordered
	 */
	protected DocumentStatusType documentStatus;

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
	 * The default value of the '{@link #getWorkDate() <em>Work Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar WORK_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkDate() <em>Work Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar workDate = WORK_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkType() <em>Work Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkType()
	 * @generated
	 * @ordered
	 */
	protected static final WorkTypeType WORK_TYPE_EDEFAULT = WorkTypeType.CM;

	/**
	 * The cached value of the '{@link #getWorkType() <em>Work Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkType()
	 * @generated
	 * @ordered
	 */
	protected WorkTypeType workType = WORK_TYPE_EDEFAULT;

	/**
	 * This is true if the Work Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workTypeESet;

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
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<LineType2> line;

	/**
	 * The cached value of the '{@link #getDocumentTotals() <em>Document Totals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentTotals()
	 * @generated
	 * @ordered
	 */
	protected DocumentTotalsType documentTotals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkDocumentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getWorkDocumentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentNumber() {
		return documentNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentNumber(String newDocumentNumber) {
		String oldDocumentNumber = documentNumber;
		documentNumber = newDocumentNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_NUMBER, oldDocumentNumber, documentNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getATCUD() {
		return aTCUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATCUD(String newATCUD) {
		String oldATCUD = aTCUD;
		aTCUD = newATCUD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__ATCUD, oldATCUD, aTCUD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStatusType getDocumentStatus() {
		return documentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentStatus(DocumentStatusType newDocumentStatus, NotificationChain msgs) {
		DocumentStatusType oldDocumentStatus = documentStatus;
		documentStatus = newDocumentStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_STATUS, oldDocumentStatus, newDocumentStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentStatus(DocumentStatusType newDocumentStatus) {
		if (newDocumentStatus != documentStatus) {
			NotificationChain msgs = null;
			if (documentStatus != null)
				msgs = ((InternalEObject)documentStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_STATUS, null, msgs);
			if (newDocumentStatus != null)
				msgs = ((InternalEObject)newDocumentStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_STATUS, null, msgs);
			msgs = basicSetDocumentStatus(newDocumentStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_STATUS, newDocumentStatus, newDocumentStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__HASH, oldHash, hash));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__HASH_CONTROL, oldHashControl, hashControl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getWorkDate() {
		return workDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkDate(XMLGregorianCalendar newWorkDate) {
		XMLGregorianCalendar oldWorkDate = workDate;
		workDate = newWorkDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__WORK_DATE, oldWorkDate, workDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTypeType getWorkType() {
		return workType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkType(WorkTypeType newWorkType) {
		WorkTypeType oldWorkType = workType;
		workType = newWorkType == null ? WORK_TYPE_EDEFAULT : newWorkType;
		boolean oldWorkTypeESet = workTypeESet;
		workTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__WORK_TYPE, oldWorkType, workType, !oldWorkTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkType() {
		WorkTypeType oldWorkType = workType;
		boolean oldWorkTypeESet = workTypeESet;
		workType = WORK_TYPE_EDEFAULT;
		workTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _401Package.WORK_DOCUMENT_TYPE__WORK_TYPE, oldWorkType, WORK_TYPE_EDEFAULT, oldWorkTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkType() {
		return workTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__SOURCE_ID, oldSourceID, sourceID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__EAC_CODE, oldEACCode, eACCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__SYSTEM_ENTRY_DATE, oldSystemEntryDate, systemEntryDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__TRANSACTION_ID, oldTransactionID, transactionID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__CUSTOMER_ID, oldCustomerID, customerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType2> getLine() {
		if (line == null) {
			line = new EObjectContainmentEList<LineType2>(LineType2.class, this, _401Package.WORK_DOCUMENT_TYPE__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentTotalsType getDocumentTotals() {
		return documentTotals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentTotals(DocumentTotalsType newDocumentTotals, NotificationChain msgs) {
		DocumentTotalsType oldDocumentTotals = documentTotals;
		documentTotals = newDocumentTotals;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_TOTALS, oldDocumentTotals, newDocumentTotals);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentTotals(DocumentTotalsType newDocumentTotals) {
		if (newDocumentTotals != documentTotals) {
			NotificationChain msgs = null;
			if (documentTotals != null)
				msgs = ((InternalEObject)documentTotals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_TOTALS, null, msgs);
			if (newDocumentTotals != null)
				msgs = ((InternalEObject)newDocumentTotals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_TOTALS, null, msgs);
			msgs = basicSetDocumentTotals(newDocumentTotals, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_TOTALS, newDocumentTotals, newDocumentTotals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_STATUS:
				return basicSetDocumentStatus(null, msgs);
			case _401Package.WORK_DOCUMENT_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_TOTALS:
				return basicSetDocumentTotals(null, msgs);
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
			case _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_NUMBER:
				return getDocumentNumber();
			case _401Package.WORK_DOCUMENT_TYPE__ATCUD:
				return getATCUD();
			case _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_STATUS:
				return getDocumentStatus();
			case _401Package.WORK_DOCUMENT_TYPE__HASH:
				return getHash();
			case _401Package.WORK_DOCUMENT_TYPE__HASH_CONTROL:
				return getHashControl();
			case _401Package.WORK_DOCUMENT_TYPE__PERIOD:
				return getPeriod();
			case _401Package.WORK_DOCUMENT_TYPE__WORK_DATE:
				return getWorkDate();
			case _401Package.WORK_DOCUMENT_TYPE__WORK_TYPE:
				return getWorkType();
			case _401Package.WORK_DOCUMENT_TYPE__SOURCE_ID:
				return getSourceID();
			case _401Package.WORK_DOCUMENT_TYPE__EAC_CODE:
				return getEACCode();
			case _401Package.WORK_DOCUMENT_TYPE__SYSTEM_ENTRY_DATE:
				return getSystemEntryDate();
			case _401Package.WORK_DOCUMENT_TYPE__TRANSACTION_ID:
				return getTransactionID();
			case _401Package.WORK_DOCUMENT_TYPE__CUSTOMER_ID:
				return getCustomerID();
			case _401Package.WORK_DOCUMENT_TYPE__LINE:
				return getLine();
			case _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_TOTALS:
				return getDocumentTotals();
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
			case _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_NUMBER:
				setDocumentNumber((String)newValue);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__ATCUD:
				setATCUD((String)newValue);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_STATUS:
				setDocumentStatus((DocumentStatusType)newValue);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__HASH:
				setHash((String)newValue);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__HASH_CONTROL:
				setHashControl((String)newValue);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__PERIOD:
				setPeriod((BigInteger)newValue);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__WORK_DATE:
				setWorkDate((XMLGregorianCalendar)newValue);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__WORK_TYPE:
				setWorkType((WorkTypeType)newValue);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__SOURCE_ID:
				setSourceID((String)newValue);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__EAC_CODE:
				setEACCode((String)newValue);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__SYSTEM_ENTRY_DATE:
				setSystemEntryDate((XMLGregorianCalendar)newValue);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__TRANSACTION_ID:
				setTransactionID((String)newValue);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__CUSTOMER_ID:
				setCustomerID((String)newValue);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType2>)newValue);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_TOTALS:
				setDocumentTotals((DocumentTotalsType)newValue);
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
			case _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_NUMBER:
				setDocumentNumber(DOCUMENT_NUMBER_EDEFAULT);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__ATCUD:
				setATCUD(ATCUD_EDEFAULT);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_STATUS:
				setDocumentStatus((DocumentStatusType)null);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__HASH:
				setHash(HASH_EDEFAULT);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__HASH_CONTROL:
				setHashControl(HASH_CONTROL_EDEFAULT);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__WORK_DATE:
				setWorkDate(WORK_DATE_EDEFAULT);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__WORK_TYPE:
				unsetWorkType();
				return;
			case _401Package.WORK_DOCUMENT_TYPE__SOURCE_ID:
				setSourceID(SOURCE_ID_EDEFAULT);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__EAC_CODE:
				setEACCode(EAC_CODE_EDEFAULT);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__SYSTEM_ENTRY_DATE:
				setSystemEntryDate(SYSTEM_ENTRY_DATE_EDEFAULT);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__TRANSACTION_ID:
				setTransactionID(TRANSACTION_ID_EDEFAULT);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__CUSTOMER_ID:
				setCustomerID(CUSTOMER_ID_EDEFAULT);
				return;
			case _401Package.WORK_DOCUMENT_TYPE__LINE:
				getLine().clear();
				return;
			case _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_TOTALS:
				setDocumentTotals((DocumentTotalsType)null);
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
			case _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_NUMBER:
				return DOCUMENT_NUMBER_EDEFAULT == null ? documentNumber != null : !DOCUMENT_NUMBER_EDEFAULT.equals(documentNumber);
			case _401Package.WORK_DOCUMENT_TYPE__ATCUD:
				return ATCUD_EDEFAULT == null ? aTCUD != null : !ATCUD_EDEFAULT.equals(aTCUD);
			case _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_STATUS:
				return documentStatus != null;
			case _401Package.WORK_DOCUMENT_TYPE__HASH:
				return HASH_EDEFAULT == null ? hash != null : !HASH_EDEFAULT.equals(hash);
			case _401Package.WORK_DOCUMENT_TYPE__HASH_CONTROL:
				return HASH_CONTROL_EDEFAULT == null ? hashControl != null : !HASH_CONTROL_EDEFAULT.equals(hashControl);
			case _401Package.WORK_DOCUMENT_TYPE__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case _401Package.WORK_DOCUMENT_TYPE__WORK_DATE:
				return WORK_DATE_EDEFAULT == null ? workDate != null : !WORK_DATE_EDEFAULT.equals(workDate);
			case _401Package.WORK_DOCUMENT_TYPE__WORK_TYPE:
				return isSetWorkType();
			case _401Package.WORK_DOCUMENT_TYPE__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? sourceID != null : !SOURCE_ID_EDEFAULT.equals(sourceID);
			case _401Package.WORK_DOCUMENT_TYPE__EAC_CODE:
				return EAC_CODE_EDEFAULT == null ? eACCode != null : !EAC_CODE_EDEFAULT.equals(eACCode);
			case _401Package.WORK_DOCUMENT_TYPE__SYSTEM_ENTRY_DATE:
				return SYSTEM_ENTRY_DATE_EDEFAULT == null ? systemEntryDate != null : !SYSTEM_ENTRY_DATE_EDEFAULT.equals(systemEntryDate);
			case _401Package.WORK_DOCUMENT_TYPE__TRANSACTION_ID:
				return TRANSACTION_ID_EDEFAULT == null ? transactionID != null : !TRANSACTION_ID_EDEFAULT.equals(transactionID);
			case _401Package.WORK_DOCUMENT_TYPE__CUSTOMER_ID:
				return CUSTOMER_ID_EDEFAULT == null ? customerID != null : !CUSTOMER_ID_EDEFAULT.equals(customerID);
			case _401Package.WORK_DOCUMENT_TYPE__LINE:
				return line != null && !line.isEmpty();
			case _401Package.WORK_DOCUMENT_TYPE__DOCUMENT_TOTALS:
				return documentTotals != null;
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
		result.append(" (documentNumber: ");
		result.append(documentNumber);
		result.append(", aTCUD: ");
		result.append(aTCUD);
		result.append(", hash: ");
		result.append(hash);
		result.append(", hashControl: ");
		result.append(hashControl);
		result.append(", period: ");
		result.append(period);
		result.append(", workDate: ");
		result.append(workDate);
		result.append(", workType: ");
		if (workTypeESet) result.append(workType); else result.append("<unset>");
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
		result.append(')');
		return result.toString();
	}

} //WorkDocumentTypeImpl
