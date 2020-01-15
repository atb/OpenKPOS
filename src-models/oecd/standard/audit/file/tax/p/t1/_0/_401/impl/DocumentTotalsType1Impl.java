/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import java.math.BigDecimal;

import oecd.standard.audit.file.tax.p.t1._0._401.Currency;
import oecd.standard.audit.file.tax.p.t1._0._401.DocumentTotalsType1;
import oecd.standard.audit.file.tax.p.t1._0._401.SettlementType;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Totals Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.DocumentTotalsType1Impl#getTaxPayable <em>Tax Payable</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.DocumentTotalsType1Impl#getNetTotal <em>Net Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.DocumentTotalsType1Impl#getGrossTotal <em>Gross Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.DocumentTotalsType1Impl#getSettlement <em>Settlement</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.DocumentTotalsType1Impl#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentTotalsType1Impl extends EObjectImpl implements DocumentTotalsType1 {
	/**
	 * The default value of the '{@link #getTaxPayable() <em>Tax Payable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPayable()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TAX_PAYABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxPayable() <em>Tax Payable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPayable()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal taxPayable = TAX_PAYABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetTotal() <em>Net Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal NET_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetTotal() <em>Net Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetTotal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal netTotal = NET_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrossTotal() <em>Gross Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal GROSS_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrossTotal() <em>Gross Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossTotal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal grossTotal = GROSS_TOTAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSettlement() <em>Settlement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlement()
	 * @generated
	 * @ordered
	 */
	protected SettlementType settlement;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected Currency currency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentTotalsType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getDocumentTotalsType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTaxPayable() {
		return taxPayable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxPayable(BigDecimal newTaxPayable) {
		BigDecimal oldTaxPayable = taxPayable;
		taxPayable = newTaxPayable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.DOCUMENT_TOTALS_TYPE1__TAX_PAYABLE, oldTaxPayable, taxPayable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getNetTotal() {
		return netTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetTotal(BigDecimal newNetTotal) {
		BigDecimal oldNetTotal = netTotal;
		netTotal = newNetTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.DOCUMENT_TOTALS_TYPE1__NET_TOTAL, oldNetTotal, netTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getGrossTotal() {
		return grossTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrossTotal(BigDecimal newGrossTotal) {
		BigDecimal oldGrossTotal = grossTotal;
		grossTotal = newGrossTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.DOCUMENT_TOTALS_TYPE1__GROSS_TOTAL, oldGrossTotal, grossTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettlementType getSettlement() {
		return settlement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettlement(SettlementType newSettlement, NotificationChain msgs) {
		SettlementType oldSettlement = settlement;
		settlement = newSettlement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.DOCUMENT_TOTALS_TYPE1__SETTLEMENT, oldSettlement, newSettlement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettlement(SettlementType newSettlement) {
		if (newSettlement != settlement) {
			NotificationChain msgs = null;
			if (settlement != null)
				msgs = ((InternalEObject)settlement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.DOCUMENT_TOTALS_TYPE1__SETTLEMENT, null, msgs);
			if (newSettlement != null)
				msgs = ((InternalEObject)newSettlement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.DOCUMENT_TOTALS_TYPE1__SETTLEMENT, null, msgs);
			msgs = basicSetSettlement(newSettlement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.DOCUMENT_TOTALS_TYPE1__SETTLEMENT, newSettlement, newSettlement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrency(Currency newCurrency, NotificationChain msgs) {
		Currency oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.DOCUMENT_TOTALS_TYPE1__CURRENCY, oldCurrency, newCurrency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(Currency newCurrency) {
		if (newCurrency != currency) {
			NotificationChain msgs = null;
			if (currency != null)
				msgs = ((InternalEObject)currency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.DOCUMENT_TOTALS_TYPE1__CURRENCY, null, msgs);
			if (newCurrency != null)
				msgs = ((InternalEObject)newCurrency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.DOCUMENT_TOTALS_TYPE1__CURRENCY, null, msgs);
			msgs = basicSetCurrency(newCurrency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.DOCUMENT_TOTALS_TYPE1__CURRENCY, newCurrency, newCurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _401Package.DOCUMENT_TOTALS_TYPE1__SETTLEMENT:
				return basicSetSettlement(null, msgs);
			case _401Package.DOCUMENT_TOTALS_TYPE1__CURRENCY:
				return basicSetCurrency(null, msgs);
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
			case _401Package.DOCUMENT_TOTALS_TYPE1__TAX_PAYABLE:
				return getTaxPayable();
			case _401Package.DOCUMENT_TOTALS_TYPE1__NET_TOTAL:
				return getNetTotal();
			case _401Package.DOCUMENT_TOTALS_TYPE1__GROSS_TOTAL:
				return getGrossTotal();
			case _401Package.DOCUMENT_TOTALS_TYPE1__SETTLEMENT:
				return getSettlement();
			case _401Package.DOCUMENT_TOTALS_TYPE1__CURRENCY:
				return getCurrency();
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
			case _401Package.DOCUMENT_TOTALS_TYPE1__TAX_PAYABLE:
				setTaxPayable((BigDecimal)newValue);
				return;
			case _401Package.DOCUMENT_TOTALS_TYPE1__NET_TOTAL:
				setNetTotal((BigDecimal)newValue);
				return;
			case _401Package.DOCUMENT_TOTALS_TYPE1__GROSS_TOTAL:
				setGrossTotal((BigDecimal)newValue);
				return;
			case _401Package.DOCUMENT_TOTALS_TYPE1__SETTLEMENT:
				setSettlement((SettlementType)newValue);
				return;
			case _401Package.DOCUMENT_TOTALS_TYPE1__CURRENCY:
				setCurrency((Currency)newValue);
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
			case _401Package.DOCUMENT_TOTALS_TYPE1__TAX_PAYABLE:
				setTaxPayable(TAX_PAYABLE_EDEFAULT);
				return;
			case _401Package.DOCUMENT_TOTALS_TYPE1__NET_TOTAL:
				setNetTotal(NET_TOTAL_EDEFAULT);
				return;
			case _401Package.DOCUMENT_TOTALS_TYPE1__GROSS_TOTAL:
				setGrossTotal(GROSS_TOTAL_EDEFAULT);
				return;
			case _401Package.DOCUMENT_TOTALS_TYPE1__SETTLEMENT:
				setSettlement((SettlementType)null);
				return;
			case _401Package.DOCUMENT_TOTALS_TYPE1__CURRENCY:
				setCurrency((Currency)null);
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
			case _401Package.DOCUMENT_TOTALS_TYPE1__TAX_PAYABLE:
				return TAX_PAYABLE_EDEFAULT == null ? taxPayable != null : !TAX_PAYABLE_EDEFAULT.equals(taxPayable);
			case _401Package.DOCUMENT_TOTALS_TYPE1__NET_TOTAL:
				return NET_TOTAL_EDEFAULT == null ? netTotal != null : !NET_TOTAL_EDEFAULT.equals(netTotal);
			case _401Package.DOCUMENT_TOTALS_TYPE1__GROSS_TOTAL:
				return GROSS_TOTAL_EDEFAULT == null ? grossTotal != null : !GROSS_TOTAL_EDEFAULT.equals(grossTotal);
			case _401Package.DOCUMENT_TOTALS_TYPE1__SETTLEMENT:
				return settlement != null;
			case _401Package.DOCUMENT_TOTALS_TYPE1__CURRENCY:
				return currency != null;
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
		result.append(" (taxPayable: ");
		result.append(taxPayable);
		result.append(", netTotal: ");
		result.append(netTotal);
		result.append(", grossTotal: ");
		result.append(grossTotal);
		result.append(')');
		return result.toString();
	}

} //DocumentTotalsType1Impl
