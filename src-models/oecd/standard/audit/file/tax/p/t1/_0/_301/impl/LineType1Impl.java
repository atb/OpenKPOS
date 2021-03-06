/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;

import oecd.standard.audit.file.tax.p.t1._0._301.LineType1;
import oecd.standard.audit.file.tax.p.t1._0._301.PaymentTax;
import oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentIDType;
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
 * An implementation of the model object '<em><b>Line Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType1Impl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType1Impl#getSourceDocumentID <em>Source Document ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType1Impl#getSettlementAmount <em>Settlement Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType1Impl#getDebitAmount <em>Debit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType1Impl#getCreditAmount <em>Credit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType1Impl#getTax <em>Tax</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType1Impl#getTaxExemptionReason <em>Tax Exemption Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineType1Impl extends EObjectImpl implements LineType1 {
	/**
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LINE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lineNumber = LINE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceDocumentID() <em>Source Document ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDocumentID()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceDocumentIDType> sourceDocumentID;

	/**
	 * The default value of the '{@link #getSettlementAmount() <em>Settlement Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SETTLEMENT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSettlementAmount() <em>Settlement Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal settlementAmount = SETTLEMENT_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDebitAmount() <em>Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DEBIT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebitAmount() <em>Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal debitAmount = DEBIT_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreditAmount() <em>Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CREDIT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreditAmount() <em>Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal creditAmount = CREDIT_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTax() <em>Tax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax()
	 * @generated
	 * @ordered
	 */
	protected PaymentTax tax;

	/**
	 * The default value of the '{@link #getTaxExemptionReason() <em>Tax Exemption Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxExemptionReason()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_EXEMPTION_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxExemptionReason() <em>Tax Exemption Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxExemptionReason()
	 * @generated
	 * @ordered
	 */
	protected String taxExemptionReason = TAX_EXEMPTION_REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _301Package.eINSTANCE.getLineType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLineNumber() {
		return lineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineNumber(BigInteger newLineNumber) {
		BigInteger oldLineNumber = lineNumber;
		lineNumber = newLineNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.LINE_TYPE1__LINE_NUMBER, oldLineNumber, lineNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceDocumentIDType> getSourceDocumentID() {
		if (sourceDocumentID == null) {
			sourceDocumentID = new EObjectContainmentEList<SourceDocumentIDType>(SourceDocumentIDType.class, this, _301Package.LINE_TYPE1__SOURCE_DOCUMENT_ID);
		}
		return sourceDocumentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSettlementAmount() {
		return settlementAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettlementAmount(BigDecimal newSettlementAmount) {
		BigDecimal oldSettlementAmount = settlementAmount;
		settlementAmount = newSettlementAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.LINE_TYPE1__SETTLEMENT_AMOUNT, oldSettlementAmount, settlementAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDebitAmount() {
		return debitAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebitAmount(BigDecimal newDebitAmount) {
		BigDecimal oldDebitAmount = debitAmount;
		debitAmount = newDebitAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.LINE_TYPE1__DEBIT_AMOUNT, oldDebitAmount, debitAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCreditAmount() {
		return creditAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditAmount(BigDecimal newCreditAmount) {
		BigDecimal oldCreditAmount = creditAmount;
		creditAmount = newCreditAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.LINE_TYPE1__CREDIT_AMOUNT, oldCreditAmount, creditAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentTax getTax() {
		return tax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTax(PaymentTax newTax, NotificationChain msgs) {
		PaymentTax oldTax = tax;
		tax = newTax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _301Package.LINE_TYPE1__TAX, oldTax, newTax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTax(PaymentTax newTax) {
		if (newTax != tax) {
			NotificationChain msgs = null;
			if (tax != null)
				msgs = ((InternalEObject)tax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _301Package.LINE_TYPE1__TAX, null, msgs);
			if (newTax != null)
				msgs = ((InternalEObject)newTax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _301Package.LINE_TYPE1__TAX, null, msgs);
			msgs = basicSetTax(newTax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.LINE_TYPE1__TAX, newTax, newTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxExemptionReason() {
		return taxExemptionReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxExemptionReason(String newTaxExemptionReason) {
		String oldTaxExemptionReason = taxExemptionReason;
		taxExemptionReason = newTaxExemptionReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.LINE_TYPE1__TAX_EXEMPTION_REASON, oldTaxExemptionReason, taxExemptionReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _301Package.LINE_TYPE1__SOURCE_DOCUMENT_ID:
				return ((InternalEList<?>)getSourceDocumentID()).basicRemove(otherEnd, msgs);
			case _301Package.LINE_TYPE1__TAX:
				return basicSetTax(null, msgs);
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
			case _301Package.LINE_TYPE1__LINE_NUMBER:
				return getLineNumber();
			case _301Package.LINE_TYPE1__SOURCE_DOCUMENT_ID:
				return getSourceDocumentID();
			case _301Package.LINE_TYPE1__SETTLEMENT_AMOUNT:
				return getSettlementAmount();
			case _301Package.LINE_TYPE1__DEBIT_AMOUNT:
				return getDebitAmount();
			case _301Package.LINE_TYPE1__CREDIT_AMOUNT:
				return getCreditAmount();
			case _301Package.LINE_TYPE1__TAX:
				return getTax();
			case _301Package.LINE_TYPE1__TAX_EXEMPTION_REASON:
				return getTaxExemptionReason();
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
			case _301Package.LINE_TYPE1__LINE_NUMBER:
				setLineNumber((BigInteger)newValue);
				return;
			case _301Package.LINE_TYPE1__SOURCE_DOCUMENT_ID:
				getSourceDocumentID().clear();
				getSourceDocumentID().addAll((Collection<? extends SourceDocumentIDType>)newValue);
				return;
			case _301Package.LINE_TYPE1__SETTLEMENT_AMOUNT:
				setSettlementAmount((BigDecimal)newValue);
				return;
			case _301Package.LINE_TYPE1__DEBIT_AMOUNT:
				setDebitAmount((BigDecimal)newValue);
				return;
			case _301Package.LINE_TYPE1__CREDIT_AMOUNT:
				setCreditAmount((BigDecimal)newValue);
				return;
			case _301Package.LINE_TYPE1__TAX:
				setTax((PaymentTax)newValue);
				return;
			case _301Package.LINE_TYPE1__TAX_EXEMPTION_REASON:
				setTaxExemptionReason((String)newValue);
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
			case _301Package.LINE_TYPE1__LINE_NUMBER:
				setLineNumber(LINE_NUMBER_EDEFAULT);
				return;
			case _301Package.LINE_TYPE1__SOURCE_DOCUMENT_ID:
				getSourceDocumentID().clear();
				return;
			case _301Package.LINE_TYPE1__SETTLEMENT_AMOUNT:
				setSettlementAmount(SETTLEMENT_AMOUNT_EDEFAULT);
				return;
			case _301Package.LINE_TYPE1__DEBIT_AMOUNT:
				setDebitAmount(DEBIT_AMOUNT_EDEFAULT);
				return;
			case _301Package.LINE_TYPE1__CREDIT_AMOUNT:
				setCreditAmount(CREDIT_AMOUNT_EDEFAULT);
				return;
			case _301Package.LINE_TYPE1__TAX:
				setTax((PaymentTax)null);
				return;
			case _301Package.LINE_TYPE1__TAX_EXEMPTION_REASON:
				setTaxExemptionReason(TAX_EXEMPTION_REASON_EDEFAULT);
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
			case _301Package.LINE_TYPE1__LINE_NUMBER:
				return LINE_NUMBER_EDEFAULT == null ? lineNumber != null : !LINE_NUMBER_EDEFAULT.equals(lineNumber);
			case _301Package.LINE_TYPE1__SOURCE_DOCUMENT_ID:
				return sourceDocumentID != null && !sourceDocumentID.isEmpty();
			case _301Package.LINE_TYPE1__SETTLEMENT_AMOUNT:
				return SETTLEMENT_AMOUNT_EDEFAULT == null ? settlementAmount != null : !SETTLEMENT_AMOUNT_EDEFAULT.equals(settlementAmount);
			case _301Package.LINE_TYPE1__DEBIT_AMOUNT:
				return DEBIT_AMOUNT_EDEFAULT == null ? debitAmount != null : !DEBIT_AMOUNT_EDEFAULT.equals(debitAmount);
			case _301Package.LINE_TYPE1__CREDIT_AMOUNT:
				return CREDIT_AMOUNT_EDEFAULT == null ? creditAmount != null : !CREDIT_AMOUNT_EDEFAULT.equals(creditAmount);
			case _301Package.LINE_TYPE1__TAX:
				return tax != null;
			case _301Package.LINE_TYPE1__TAX_EXEMPTION_REASON:
				return TAX_EXEMPTION_REASON_EDEFAULT == null ? taxExemptionReason != null : !TAX_EXEMPTION_REASON_EDEFAULT.equals(taxExemptionReason);
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
		result.append(" (lineNumber: ");
		result.append(lineNumber);
		result.append(", settlementAmount: ");
		result.append(settlementAmount);
		result.append(", debitAmount: ");
		result.append(debitAmount);
		result.append(", creditAmount: ");
		result.append(creditAmount);
		result.append(", taxExemptionReason: ");
		result.append(taxExemptionReason);
		result.append(')');
		return result.toString();
	}

} //LineType1Impl
