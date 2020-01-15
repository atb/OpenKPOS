/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2.impl;

import oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package;
import oecd.standard.audit.file.tax.pt1_01_2.SalesInvoicesType;
import oecd.standard.audit.file.tax.pt1_01_2.SourceDocumentsType;

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
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SourceDocumentsTypeImpl#getSalesInvoices <em>Sales Invoices</em>}</li>
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
		return Pt1_01_2Package.Literals.SOURCE_DOCUMENTS_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES, oldSalesInvoices, newSalesInvoices);
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
				msgs = ((InternalEObject)salesInvoices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pt1_01_2Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES, null, msgs);
			if (newSalesInvoices != null)
				msgs = ((InternalEObject)newSalesInvoices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pt1_01_2Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES, null, msgs);
			msgs = basicSetSalesInvoices(newSalesInvoices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES, newSalesInvoices, newSalesInvoices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pt1_01_2Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES:
				return basicSetSalesInvoices(null, msgs);
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
			case Pt1_01_2Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES:
				return getSalesInvoices();
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
			case Pt1_01_2Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES:
				setSalesInvoices((SalesInvoicesType)newValue);
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
			case Pt1_01_2Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES:
				setSalesInvoices((SalesInvoicesType)null);
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
			case Pt1_01_2Package.SOURCE_DOCUMENTS_TYPE__SALES_INVOICES:
				return salesInvoices != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceDocumentsTypeImpl
