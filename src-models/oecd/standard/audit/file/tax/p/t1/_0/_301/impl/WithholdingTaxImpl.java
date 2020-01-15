/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301.impl;

import java.math.BigDecimal;

import oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTax;
import oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTaxTypeType;
import oecd.standard.audit.file.tax.p.t1._0._301._301Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Withholding Tax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.WithholdingTaxImpl#getWithholdingTaxType <em>Withholding Tax Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.WithholdingTaxImpl#getWithholdingTaxDescription <em>Withholding Tax Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.WithholdingTaxImpl#getWithholdingTaxAmount <em>Withholding Tax Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WithholdingTaxImpl extends EObjectImpl implements WithholdingTax {
	/**
	 * The default value of the '{@link #getWithholdingTaxType() <em>Withholding Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithholdingTaxType()
	 * @generated
	 * @ordered
	 */
	protected static final WithholdingTaxTypeType WITHHOLDING_TAX_TYPE_EDEFAULT = WithholdingTaxTypeType.IRS;

	/**
	 * The cached value of the '{@link #getWithholdingTaxType() <em>Withholding Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithholdingTaxType()
	 * @generated
	 * @ordered
	 */
	protected WithholdingTaxTypeType withholdingTaxType = WITHHOLDING_TAX_TYPE_EDEFAULT;

	/**
	 * This is true if the Withholding Tax Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean withholdingTaxTypeESet;

	/**
	 * The default value of the '{@link #getWithholdingTaxDescription() <em>Withholding Tax Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithholdingTaxDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String WITHHOLDING_TAX_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWithholdingTaxDescription() <em>Withholding Tax Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithholdingTaxDescription()
	 * @generated
	 * @ordered
	 */
	protected String withholdingTaxDescription = WITHHOLDING_TAX_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWithholdingTaxAmount() <em>Withholding Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithholdingTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal WITHHOLDING_TAX_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWithholdingTaxAmount() <em>Withholding Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithholdingTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal withholdingTaxAmount = WITHHOLDING_TAX_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WithholdingTaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _301Package.eINSTANCE.getWithholdingTax();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithholdingTaxTypeType getWithholdingTaxType() {
		return withholdingTaxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithholdingTaxType(WithholdingTaxTypeType newWithholdingTaxType) {
		WithholdingTaxTypeType oldWithholdingTaxType = withholdingTaxType;
		withholdingTaxType = newWithholdingTaxType == null ? WITHHOLDING_TAX_TYPE_EDEFAULT : newWithholdingTaxType;
		boolean oldWithholdingTaxTypeESet = withholdingTaxTypeESet;
		withholdingTaxTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_TYPE, oldWithholdingTaxType, withholdingTaxType, !oldWithholdingTaxTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWithholdingTaxType() {
		WithholdingTaxTypeType oldWithholdingTaxType = withholdingTaxType;
		boolean oldWithholdingTaxTypeESet = withholdingTaxTypeESet;
		withholdingTaxType = WITHHOLDING_TAX_TYPE_EDEFAULT;
		withholdingTaxTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_TYPE, oldWithholdingTaxType, WITHHOLDING_TAX_TYPE_EDEFAULT, oldWithholdingTaxTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWithholdingTaxType() {
		return withholdingTaxTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWithholdingTaxDescription() {
		return withholdingTaxDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithholdingTaxDescription(String newWithholdingTaxDescription) {
		String oldWithholdingTaxDescription = withholdingTaxDescription;
		withholdingTaxDescription = newWithholdingTaxDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_DESCRIPTION, oldWithholdingTaxDescription, withholdingTaxDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getWithholdingTaxAmount() {
		return withholdingTaxAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithholdingTaxAmount(BigDecimal newWithholdingTaxAmount) {
		BigDecimal oldWithholdingTaxAmount = withholdingTaxAmount;
		withholdingTaxAmount = newWithholdingTaxAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_AMOUNT, oldWithholdingTaxAmount, withholdingTaxAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_TYPE:
				return getWithholdingTaxType();
			case _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_DESCRIPTION:
				return getWithholdingTaxDescription();
			case _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_AMOUNT:
				return getWithholdingTaxAmount();
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
			case _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_TYPE:
				setWithholdingTaxType((WithholdingTaxTypeType)newValue);
				return;
			case _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_DESCRIPTION:
				setWithholdingTaxDescription((String)newValue);
				return;
			case _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_AMOUNT:
				setWithholdingTaxAmount((BigDecimal)newValue);
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
			case _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_TYPE:
				unsetWithholdingTaxType();
				return;
			case _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_DESCRIPTION:
				setWithholdingTaxDescription(WITHHOLDING_TAX_DESCRIPTION_EDEFAULT);
				return;
			case _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_AMOUNT:
				setWithholdingTaxAmount(WITHHOLDING_TAX_AMOUNT_EDEFAULT);
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
			case _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_TYPE:
				return isSetWithholdingTaxType();
			case _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_DESCRIPTION:
				return WITHHOLDING_TAX_DESCRIPTION_EDEFAULT == null ? withholdingTaxDescription != null : !WITHHOLDING_TAX_DESCRIPTION_EDEFAULT.equals(withholdingTaxDescription);
			case _301Package.WITHHOLDING_TAX__WITHHOLDING_TAX_AMOUNT:
				return WITHHOLDING_TAX_AMOUNT_EDEFAULT == null ? withholdingTaxAmount != null : !WITHHOLDING_TAX_AMOUNT_EDEFAULT.equals(withholdingTaxAmount);
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
		result.append(" (withholdingTaxType: ");
		if (withholdingTaxTypeESet) result.append(withholdingTaxType); else result.append("<unset>");
		result.append(", withholdingTaxDescription: ");
		result.append(withholdingTaxDescription);
		result.append(", withholdingTaxAmount: ");
		result.append(withholdingTaxAmount);
		result.append(')');
		return result.toString();
	}

} //WithholdingTaxImpl
