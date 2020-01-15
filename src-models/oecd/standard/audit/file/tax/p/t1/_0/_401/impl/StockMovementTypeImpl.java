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

import oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType1;
import oecd.standard.audit.file.tax.p.t1._0._401.DocumentTotalsType2;
import oecd.standard.audit.file.tax.p.t1._0._401.LineType1;
import oecd.standard.audit.file.tax.p.t1._0._401.MovementTypeType;
import oecd.standard.audit.file.tax.p.t1._0._401.ShippingPointStructure;
import oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType;
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
 * An implementation of the model object '<em><b>Stock Movement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getDocumentNumber <em>Document Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getATCUD <em>ATCUD</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getDocumentStatus <em>Document Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getHash <em>Hash</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getHashControl <em>Hash Control</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getMovementDate <em>Movement Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getMovementType <em>Movement Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getSupplierID <em>Supplier ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getEACCode <em>EAC Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getMovementComments <em>Movement Comments</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getShipFrom <em>Ship From</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getMovementEndTime <em>Movement End Time</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getMovementStartTime <em>Movement Start Time</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getATDocCodeID <em>AT Doc Code ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.StockMovementTypeImpl#getDocumentTotals <em>Document Totals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StockMovementTypeImpl extends EObjectImpl implements StockMovementType {
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
	protected DocumentStatusType1 documentStatus;

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
	 * The default value of the '{@link #getMovementDate() <em>Movement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MOVEMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMovementDate() <em>Movement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar movementDate = MOVEMENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMovementType() <em>Movement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementType()
	 * @generated
	 * @ordered
	 */
	protected static final MovementTypeType MOVEMENT_TYPE_EDEFAULT = MovementTypeType.GR;

	/**
	 * The cached value of the '{@link #getMovementType() <em>Movement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementType()
	 * @generated
	 * @ordered
	 */
	protected MovementTypeType movementType = MOVEMENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Movement Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean movementTypeESet;

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
	 * The default value of the '{@link #getMovementComments() <em>Movement Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementComments()
	 * @generated
	 * @ordered
	 */
	protected static final String MOVEMENT_COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMovementComments() <em>Movement Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementComments()
	 * @generated
	 * @ordered
	 */
	protected String movementComments = MOVEMENT_COMMENTS_EDEFAULT;

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
	 * The default value of the '{@link #getATDocCodeID() <em>AT Doc Code ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATDocCodeID()
	 * @generated
	 * @ordered
	 */
	protected static final String AT_DOC_CODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getATDocCodeID() <em>AT Doc Code ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATDocCodeID()
	 * @generated
	 * @ordered
	 */
	protected String aTDocCodeID = AT_DOC_CODE_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockMovementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getStockMovementType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_NUMBER, oldDocumentNumber, documentNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__ATCUD, oldATCUD, aTCUD));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_STATUS, oldDocumentStatus, newDocumentStatus);
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
				msgs = ((InternalEObject)documentStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_STATUS, null, msgs);
			if (newDocumentStatus != null)
				msgs = ((InternalEObject)newDocumentStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_STATUS, null, msgs);
			msgs = basicSetDocumentStatus(newDocumentStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_STATUS, newDocumentStatus, newDocumentStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__HASH, oldHash, hash));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__HASH_CONTROL, oldHashControl, hashControl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getMovementDate() {
		return movementDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementDate(XMLGregorianCalendar newMovementDate) {
		XMLGregorianCalendar oldMovementDate = movementDate;
		movementDate = newMovementDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_DATE, oldMovementDate, movementDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementTypeType getMovementType() {
		return movementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementType(MovementTypeType newMovementType) {
		MovementTypeType oldMovementType = movementType;
		movementType = newMovementType == null ? MOVEMENT_TYPE_EDEFAULT : newMovementType;
		boolean oldMovementTypeESet = movementTypeESet;
		movementTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_TYPE, oldMovementType, movementType, !oldMovementTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMovementType() {
		MovementTypeType oldMovementType = movementType;
		boolean oldMovementTypeESet = movementTypeESet;
		movementType = MOVEMENT_TYPE_EDEFAULT;
		movementTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_TYPE, oldMovementType, MOVEMENT_TYPE_EDEFAULT, oldMovementTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMovementType() {
		return movementTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__SYSTEM_ENTRY_DATE, oldSystemEntryDate, systemEntryDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__TRANSACTION_ID, oldTransactionID, transactionID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__CUSTOMER_ID, oldCustomerID, customerID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__SUPPLIER_ID, oldSupplierID, supplierID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__SOURCE_ID, oldSourceID, sourceID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__EAC_CODE, oldEACCode, eACCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMovementComments() {
		return movementComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementComments(String newMovementComments) {
		String oldMovementComments = movementComments;
		movementComments = newMovementComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_COMMENTS, oldMovementComments, movementComments));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__SHIP_TO, oldShipTo, newShipTo);
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
				msgs = ((InternalEObject)shipTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.STOCK_MOVEMENT_TYPE__SHIP_TO, null, msgs);
			if (newShipTo != null)
				msgs = ((InternalEObject)newShipTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.STOCK_MOVEMENT_TYPE__SHIP_TO, null, msgs);
			msgs = basicSetShipTo(newShipTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__SHIP_TO, newShipTo, newShipTo));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__SHIP_FROM, oldShipFrom, newShipFrom);
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
				msgs = ((InternalEObject)shipFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.STOCK_MOVEMENT_TYPE__SHIP_FROM, null, msgs);
			if (newShipFrom != null)
				msgs = ((InternalEObject)newShipFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.STOCK_MOVEMENT_TYPE__SHIP_FROM, null, msgs);
			msgs = basicSetShipFrom(newShipFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__SHIP_FROM, newShipFrom, newShipFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_END_TIME, oldMovementEndTime, movementEndTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_START_TIME, oldMovementStartTime, movementStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getATDocCodeID() {
		return aTDocCodeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATDocCodeID(String newATDocCodeID) {
		String oldATDocCodeID = aTDocCodeID;
		aTDocCodeID = newATDocCodeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__AT_DOC_CODE_ID, oldATDocCodeID, aTDocCodeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType1> getLine() {
		if (line == null) {
			line = new EObjectContainmentEList<LineType1>(LineType1.class, this, _401Package.STOCK_MOVEMENT_TYPE__LINE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_TOTALS, oldDocumentTotals, newDocumentTotals);
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
				msgs = ((InternalEObject)documentTotals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_TOTALS, null, msgs);
			if (newDocumentTotals != null)
				msgs = ((InternalEObject)newDocumentTotals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_TOTALS, null, msgs);
			msgs = basicSetDocumentTotals(newDocumentTotals, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_TOTALS, newDocumentTotals, newDocumentTotals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_STATUS:
				return basicSetDocumentStatus(null, msgs);
			case _401Package.STOCK_MOVEMENT_TYPE__SHIP_TO:
				return basicSetShipTo(null, msgs);
			case _401Package.STOCK_MOVEMENT_TYPE__SHIP_FROM:
				return basicSetShipFrom(null, msgs);
			case _401Package.STOCK_MOVEMENT_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_TOTALS:
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
			case _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_NUMBER:
				return getDocumentNumber();
			case _401Package.STOCK_MOVEMENT_TYPE__ATCUD:
				return getATCUD();
			case _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_STATUS:
				return getDocumentStatus();
			case _401Package.STOCK_MOVEMENT_TYPE__HASH:
				return getHash();
			case _401Package.STOCK_MOVEMENT_TYPE__HASH_CONTROL:
				return getHashControl();
			case _401Package.STOCK_MOVEMENT_TYPE__PERIOD:
				return getPeriod();
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_DATE:
				return getMovementDate();
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_TYPE:
				return getMovementType();
			case _401Package.STOCK_MOVEMENT_TYPE__SYSTEM_ENTRY_DATE:
				return getSystemEntryDate();
			case _401Package.STOCK_MOVEMENT_TYPE__TRANSACTION_ID:
				return getTransactionID();
			case _401Package.STOCK_MOVEMENT_TYPE__CUSTOMER_ID:
				return getCustomerID();
			case _401Package.STOCK_MOVEMENT_TYPE__SUPPLIER_ID:
				return getSupplierID();
			case _401Package.STOCK_MOVEMENT_TYPE__SOURCE_ID:
				return getSourceID();
			case _401Package.STOCK_MOVEMENT_TYPE__EAC_CODE:
				return getEACCode();
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_COMMENTS:
				return getMovementComments();
			case _401Package.STOCK_MOVEMENT_TYPE__SHIP_TO:
				return getShipTo();
			case _401Package.STOCK_MOVEMENT_TYPE__SHIP_FROM:
				return getShipFrom();
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_END_TIME:
				return getMovementEndTime();
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_START_TIME:
				return getMovementStartTime();
			case _401Package.STOCK_MOVEMENT_TYPE__AT_DOC_CODE_ID:
				return getATDocCodeID();
			case _401Package.STOCK_MOVEMENT_TYPE__LINE:
				return getLine();
			case _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_TOTALS:
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
			case _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_NUMBER:
				setDocumentNumber((String)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__ATCUD:
				setATCUD((String)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_STATUS:
				setDocumentStatus((DocumentStatusType1)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__HASH:
				setHash((String)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__HASH_CONTROL:
				setHashControl((String)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__PERIOD:
				setPeriod((BigInteger)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_DATE:
				setMovementDate((XMLGregorianCalendar)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_TYPE:
				setMovementType((MovementTypeType)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__SYSTEM_ENTRY_DATE:
				setSystemEntryDate((XMLGregorianCalendar)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__TRANSACTION_ID:
				setTransactionID((String)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__CUSTOMER_ID:
				setCustomerID((String)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__SUPPLIER_ID:
				setSupplierID((String)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__SOURCE_ID:
				setSourceID((String)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__EAC_CODE:
				setEACCode((String)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_COMMENTS:
				setMovementComments((String)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__SHIP_TO:
				setShipTo((ShippingPointStructure)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__SHIP_FROM:
				setShipFrom((ShippingPointStructure)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_END_TIME:
				setMovementEndTime((XMLGregorianCalendar)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_START_TIME:
				setMovementStartTime((XMLGregorianCalendar)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__AT_DOC_CODE_ID:
				setATDocCodeID((String)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType1>)newValue);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_TOTALS:
				setDocumentTotals((DocumentTotalsType2)newValue);
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
			case _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_NUMBER:
				setDocumentNumber(DOCUMENT_NUMBER_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__ATCUD:
				setATCUD(ATCUD_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_STATUS:
				setDocumentStatus((DocumentStatusType1)null);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__HASH:
				setHash(HASH_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__HASH_CONTROL:
				setHashControl(HASH_CONTROL_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_DATE:
				setMovementDate(MOVEMENT_DATE_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_TYPE:
				unsetMovementType();
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__SYSTEM_ENTRY_DATE:
				setSystemEntryDate(SYSTEM_ENTRY_DATE_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__TRANSACTION_ID:
				setTransactionID(TRANSACTION_ID_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__CUSTOMER_ID:
				setCustomerID(CUSTOMER_ID_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__SUPPLIER_ID:
				setSupplierID(SUPPLIER_ID_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__SOURCE_ID:
				setSourceID(SOURCE_ID_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__EAC_CODE:
				setEACCode(EAC_CODE_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_COMMENTS:
				setMovementComments(MOVEMENT_COMMENTS_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__SHIP_TO:
				setShipTo((ShippingPointStructure)null);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__SHIP_FROM:
				setShipFrom((ShippingPointStructure)null);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_END_TIME:
				setMovementEndTime(MOVEMENT_END_TIME_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_START_TIME:
				setMovementStartTime(MOVEMENT_START_TIME_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__AT_DOC_CODE_ID:
				setATDocCodeID(AT_DOC_CODE_ID_EDEFAULT);
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__LINE:
				getLine().clear();
				return;
			case _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_TOTALS:
				setDocumentTotals((DocumentTotalsType2)null);
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
			case _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_NUMBER:
				return DOCUMENT_NUMBER_EDEFAULT == null ? documentNumber != null : !DOCUMENT_NUMBER_EDEFAULT.equals(documentNumber);
			case _401Package.STOCK_MOVEMENT_TYPE__ATCUD:
				return ATCUD_EDEFAULT == null ? aTCUD != null : !ATCUD_EDEFAULT.equals(aTCUD);
			case _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_STATUS:
				return documentStatus != null;
			case _401Package.STOCK_MOVEMENT_TYPE__HASH:
				return HASH_EDEFAULT == null ? hash != null : !HASH_EDEFAULT.equals(hash);
			case _401Package.STOCK_MOVEMENT_TYPE__HASH_CONTROL:
				return HASH_CONTROL_EDEFAULT == null ? hashControl != null : !HASH_CONTROL_EDEFAULT.equals(hashControl);
			case _401Package.STOCK_MOVEMENT_TYPE__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_DATE:
				return MOVEMENT_DATE_EDEFAULT == null ? movementDate != null : !MOVEMENT_DATE_EDEFAULT.equals(movementDate);
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_TYPE:
				return isSetMovementType();
			case _401Package.STOCK_MOVEMENT_TYPE__SYSTEM_ENTRY_DATE:
				return SYSTEM_ENTRY_DATE_EDEFAULT == null ? systemEntryDate != null : !SYSTEM_ENTRY_DATE_EDEFAULT.equals(systemEntryDate);
			case _401Package.STOCK_MOVEMENT_TYPE__TRANSACTION_ID:
				return TRANSACTION_ID_EDEFAULT == null ? transactionID != null : !TRANSACTION_ID_EDEFAULT.equals(transactionID);
			case _401Package.STOCK_MOVEMENT_TYPE__CUSTOMER_ID:
				return CUSTOMER_ID_EDEFAULT == null ? customerID != null : !CUSTOMER_ID_EDEFAULT.equals(customerID);
			case _401Package.STOCK_MOVEMENT_TYPE__SUPPLIER_ID:
				return SUPPLIER_ID_EDEFAULT == null ? supplierID != null : !SUPPLIER_ID_EDEFAULT.equals(supplierID);
			case _401Package.STOCK_MOVEMENT_TYPE__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? sourceID != null : !SOURCE_ID_EDEFAULT.equals(sourceID);
			case _401Package.STOCK_MOVEMENT_TYPE__EAC_CODE:
				return EAC_CODE_EDEFAULT == null ? eACCode != null : !EAC_CODE_EDEFAULT.equals(eACCode);
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_COMMENTS:
				return MOVEMENT_COMMENTS_EDEFAULT == null ? movementComments != null : !MOVEMENT_COMMENTS_EDEFAULT.equals(movementComments);
			case _401Package.STOCK_MOVEMENT_TYPE__SHIP_TO:
				return shipTo != null;
			case _401Package.STOCK_MOVEMENT_TYPE__SHIP_FROM:
				return shipFrom != null;
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_END_TIME:
				return MOVEMENT_END_TIME_EDEFAULT == null ? movementEndTime != null : !MOVEMENT_END_TIME_EDEFAULT.equals(movementEndTime);
			case _401Package.STOCK_MOVEMENT_TYPE__MOVEMENT_START_TIME:
				return MOVEMENT_START_TIME_EDEFAULT == null ? movementStartTime != null : !MOVEMENT_START_TIME_EDEFAULT.equals(movementStartTime);
			case _401Package.STOCK_MOVEMENT_TYPE__AT_DOC_CODE_ID:
				return AT_DOC_CODE_ID_EDEFAULT == null ? aTDocCodeID != null : !AT_DOC_CODE_ID_EDEFAULT.equals(aTDocCodeID);
			case _401Package.STOCK_MOVEMENT_TYPE__LINE:
				return line != null && !line.isEmpty();
			case _401Package.STOCK_MOVEMENT_TYPE__DOCUMENT_TOTALS:
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
		result.append(", movementDate: ");
		result.append(movementDate);
		result.append(", movementType: ");
		if (movementTypeESet) result.append(movementType); else result.append("<unset>");
		result.append(", systemEntryDate: ");
		result.append(systemEntryDate);
		result.append(", transactionID: ");
		result.append(transactionID);
		result.append(", customerID: ");
		result.append(customerID);
		result.append(", supplierID: ");
		result.append(supplierID);
		result.append(", sourceID: ");
		result.append(sourceID);
		result.append(", eACCode: ");
		result.append(eACCode);
		result.append(", movementComments: ");
		result.append(movementComments);
		result.append(", movementEndTime: ");
		result.append(movementEndTime);
		result.append(", movementStartTime: ");
		result.append(movementStartTime);
		result.append(", aTDocCodeID: ");
		result.append(aTDocCodeID);
		result.append(')');
		return result.toString();
	}

} //StockMovementTypeImpl
