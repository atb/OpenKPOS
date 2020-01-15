/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201.impl;

import oecd.standard.audit.file.tax.p.t1._0._201.MovementOfGoodsType;
import oecd.standard.audit.file.tax.p.t1._0._201.SalesInvoicesType;
import oecd.standard.audit.file.tax.p.t1._0._201.SourceDocumentsType;
import oecd.standard.audit.file.tax.p.t1._0._201.WorkingDocumentsType;
import oecd.standard.audit.file.tax.p.t1._0._201._201Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Documents Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.SourceDocumentsTypeImpl#getSalesInvoices <em>Sales Invoices</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.SourceDocumentsTypeImpl#getMovementOfGoods <em>Movement Of Goods</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.SourceDocumentsTypeImpl#getWorkingDocuments <em>Working Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceDocumentsTypeImpl extends EObjectImpl implements SourceDocumentsType {
	/**
	 * The cached value of the '{@link #getSalesInvoices() <em>Sales Invoices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesInvoices()
	 * @generated
	 * @ordered
	 */
	protected SalesInvoicesType salesInvoices;

	/**
	 * The cached value of the '{@link #getMovementOfGoods() <em>Movement Of Goods</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementOfGoods()
	 * @generated
	 * @ordered
	 */
	protected MovementOfGoodsType movementOfGoods;

	/**
	 * The cached value of the '{@link #getWorkingDocuments() <em>Working Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDocuments()
	 * @generated
	 * @ordered
	 */
	protected WorkingDocumentsType workingDocuments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceDocumentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _201Package.eINSTANCE.getSourceDocumentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesInvoicesType getSalesInvoices() {
		return salesInvoices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSalesInvoices(SalesInvoicesType newSalesInvoices, NotificationChain msgs) {
		SalesInvoicesType oldSalesInvoices = salesInvoices;
		salesInvoices = newSalesInvoices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _201Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES, oldSalesInvoices, newSalesInvoices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalesInvoices(SalesInvoicesType newSalesInvoices) {
		if (newSalesInvoices != salesInvoices) {
			NotificationChain msgs = null;
			if (salesInvoices != null)
				msgs = ((InternalEObject)salesInvoices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _201Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES, null, msgs);
			if (newSalesInvoices != null)
				msgs = ((InternalEObject)newSalesInvoices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _201Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES, null, msgs);
			msgs = basicSetSalesInvoices(newSalesInvoices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES, newSalesInvoices, newSalesInvoices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementOfGoodsType getMovementOfGoods() {
		return movementOfGoods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMovementOfGoods(MovementOfGoodsType newMovementOfGoods, NotificationChain msgs) {
		MovementOfGoodsType oldMovementOfGoods = movementOfGoods;
		movementOfGoods = newMovementOfGoods;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _201Package.SOURCE_DOCUMENTS_TYPE__MOVEMENT_OF_GOODS, oldMovementOfGoods, newMovementOfGoods);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementOfGoods(MovementOfGoodsType newMovementOfGoods) {
		if (newMovementOfGoods != movementOfGoods) {
			NotificationChain msgs = null;
			if (movementOfGoods != null)
				msgs = ((InternalEObject)movementOfGoods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _201Package.SOURCE_DOCUMENTS_TYPE__MOVEMENT_OF_GOODS, null, msgs);
			if (newMovementOfGoods != null)
				msgs = ((InternalEObject)newMovementOfGoods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _201Package.SOURCE_DOCUMENTS_TYPE__MOVEMENT_OF_GOODS, null, msgs);
			msgs = basicSetMovementOfGoods(newMovementOfGoods, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.SOURCE_DOCUMENTS_TYPE__MOVEMENT_OF_GOODS, newMovementOfGoods, newMovementOfGoods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkingDocumentsType getWorkingDocuments() {
		return workingDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkingDocuments(WorkingDocumentsType newWorkingDocuments, NotificationChain msgs) {
		WorkingDocumentsType oldWorkingDocuments = workingDocuments;
		workingDocuments = newWorkingDocuments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _201Package.SOURCE_DOCUMENTS_TYPE__WORKING_DOCUMENTS, oldWorkingDocuments, newWorkingDocuments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkingDocuments(WorkingDocumentsType newWorkingDocuments) {
		if (newWorkingDocuments != workingDocuments) {
			NotificationChain msgs = null;
			if (workingDocuments != null)
				msgs = ((InternalEObject)workingDocuments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _201Package.SOURCE_DOCUMENTS_TYPE__WORKING_DOCUMENTS, null, msgs);
			if (newWorkingDocuments != null)
				msgs = ((InternalEObject)newWorkingDocuments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _201Package.SOURCE_DOCUMENTS_TYPE__WORKING_DOCUMENTS, null, msgs);
			msgs = basicSetWorkingDocuments(newWorkingDocuments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.SOURCE_DOCUMENTS_TYPE__WORKING_DOCUMENTS, newWorkingDocuments, newWorkingDocuments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _201Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES:
				return basicSetSalesInvoices(null, msgs);
			case _201Package.SOURCE_DOCUMENTS_TYPE__MOVEMENT_OF_GOODS:
				return basicSetMovementOfGoods(null, msgs);
			case _201Package.SOURCE_DOCUMENTS_TYPE__WORKING_DOCUMENTS:
				return basicSetWorkingDocuments(null, msgs);
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
			case _201Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES:
				return getSalesInvoices();
			case _201Package.SOURCE_DOCUMENTS_TYPE__MOVEMENT_OF_GOODS:
				return getMovementOfGoods();
			case _201Package.SOURCE_DOCUMENTS_TYPE__WORKING_DOCUMENTS:
				return getWorkingDocuments();
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
			case _201Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES:
				setSalesInvoices((SalesInvoicesType)newValue);
				return;
			case _201Package.SOURCE_DOCUMENTS_TYPE__MOVEMENT_OF_GOODS:
				setMovementOfGoods((MovementOfGoodsType)newValue);
				return;
			case _201Package.SOURCE_DOCUMENTS_TYPE__WORKING_DOCUMENTS:
				setWorkingDocuments((WorkingDocumentsType)newValue);
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
			case _201Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES:
				setSalesInvoices((SalesInvoicesType)null);
				return;
			case _201Package.SOURCE_DOCUMENTS_TYPE__MOVEMENT_OF_GOODS:
				setMovementOfGoods((MovementOfGoodsType)null);
				return;
			case _201Package.SOURCE_DOCUMENTS_TYPE__WORKING_DOCUMENTS:
				setWorkingDocuments((WorkingDocumentsType)null);
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
			case _201Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES:
				return salesInvoices != null;
			case _201Package.SOURCE_DOCUMENTS_TYPE__MOVEMENT_OF_GOODS:
				return movementOfGoods != null;
			case _201Package.SOURCE_DOCUMENTS_TYPE__WORKING_DOCUMENTS:
				return workingDocuments != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceDocumentsTypeImpl
