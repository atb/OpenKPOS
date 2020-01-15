/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201.impl;

import java.math.BigDecimal;

import oecd.standard.audit.file.tax.p.t1._0._201.MovementTax;
import oecd.standard.audit.file.tax.p.t1._0._201.SAFTPTMovementTaxType;
import oecd.standard.audit.file.tax.p.t1._0._201._201Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Movement Tax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.MovementTaxImpl#getTaxType <em>Tax Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.MovementTaxImpl#getTaxCountryRegion <em>Tax Country Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.MovementTaxImpl#getTaxCode <em>Tax Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.MovementTaxImpl#getTaxPercentage <em>Tax Percentage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MovementTaxImpl extends EObjectImpl implements MovementTax {
	/**
	 * The default value of the '{@link #getTaxType() <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxType()
	 * @generated
	 * @ordered
	 */
	protected static final SAFTPTMovementTaxType TAX_TYPE_EDEFAULT = SAFTPTMovementTaxType.IVA;

	/**
	 * The cached value of the '{@link #getTaxType() <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxType()
	 * @generated
	 * @ordered
	 */
	protected SAFTPTMovementTaxType taxType = TAX_TYPE_EDEFAULT;

	/**
	 * This is true if the Tax Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean taxTypeESet;

	/**
	 * The default value of the '{@link #getTaxCountryRegion() <em>Tax Country Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCountryRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_COUNTRY_REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxCountryRegion() <em>Tax Country Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCountryRegion()
	 * @generated
	 * @ordered
	 */
	protected String taxCountryRegion = TAX_COUNTRY_REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxCode() <em>Tax Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCode()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxCode() <em>Tax Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCode()
	 * @generated
	 * @ordered
	 */
	protected String taxCode = TAX_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxPercentage() <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TAX_PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxPercentage() <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPercentage()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal taxPercentage = TAX_PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovementTaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _201Package.eINSTANCE.getMovementTax();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAFTPTMovementTaxType getTaxType() {
		return taxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxType(SAFTPTMovementTaxType newTaxType) {
		SAFTPTMovementTaxType oldTaxType = taxType;
		taxType = newTaxType == null ? TAX_TYPE_EDEFAULT : newTaxType;
		boolean oldTaxTypeESet = taxTypeESet;
		taxTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.MOVEMENT_TAX__TAX_TYPE, oldTaxType, taxType, !oldTaxTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTaxType() {
		SAFTPTMovementTaxType oldTaxType = taxType;
		boolean oldTaxTypeESet = taxTypeESet;
		taxType = TAX_TYPE_EDEFAULT;
		taxTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _201Package.MOVEMENT_TAX__TAX_TYPE, oldTaxType, TAX_TYPE_EDEFAULT, oldTaxTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTaxType() {
		return taxTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxCountryRegion() {
		return taxCountryRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxCountryRegion(String newTaxCountryRegion) {
		String oldTaxCountryRegion = taxCountryRegion;
		taxCountryRegion = newTaxCountryRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.MOVEMENT_TAX__TAX_COUNTRY_REGION, oldTaxCountryRegion, taxCountryRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxCode() {
		return taxCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxCode(String newTaxCode) {
		String oldTaxCode = taxCode;
		taxCode = newTaxCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.MOVEMENT_TAX__TAX_CODE, oldTaxCode, taxCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTaxPercentage() {
		return taxPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxPercentage(BigDecimal newTaxPercentage) {
		BigDecimal oldTaxPercentage = taxPercentage;
		taxPercentage = newTaxPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.MOVEMENT_TAX__TAX_PERCENTAGE, oldTaxPercentage, taxPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _201Package.MOVEMENT_TAX__TAX_TYPE:
				return getTaxType();
			case _201Package.MOVEMENT_TAX__TAX_COUNTRY_REGION:
				return getTaxCountryRegion();
			case _201Package.MOVEMENT_TAX__TAX_CODE:
				return getTaxCode();
			case _201Package.MOVEMENT_TAX__TAX_PERCENTAGE:
				return getTaxPercentage();
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
			case _201Package.MOVEMENT_TAX__TAX_TYPE:
				setTaxType((SAFTPTMovementTaxType)newValue);
				return;
			case _201Package.MOVEMENT_TAX__TAX_COUNTRY_REGION:
				setTaxCountryRegion((String)newValue);
				return;
			case _201Package.MOVEMENT_TAX__TAX_CODE:
				setTaxCode((String)newValue);
				return;
			case _201Package.MOVEMENT_TAX__TAX_PERCENTAGE:
				setTaxPercentage((BigDecimal)newValue);
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
			case _201Package.MOVEMENT_TAX__TAX_TYPE:
				unsetTaxType();
				return;
			case _201Package.MOVEMENT_TAX__TAX_COUNTRY_REGION:
				setTaxCountryRegion(TAX_COUNTRY_REGION_EDEFAULT);
				return;
			case _201Package.MOVEMENT_TAX__TAX_CODE:
				setTaxCode(TAX_CODE_EDEFAULT);
				return;
			case _201Package.MOVEMENT_TAX__TAX_PERCENTAGE:
				setTaxPercentage(TAX_PERCENTAGE_EDEFAULT);
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
			case _201Package.MOVEMENT_TAX__TAX_TYPE:
				return isSetTaxType();
			case _201Package.MOVEMENT_TAX__TAX_COUNTRY_REGION:
				return TAX_COUNTRY_REGION_EDEFAULT == null ? taxCountryRegion != null : !TAX_COUNTRY_REGION_EDEFAULT.equals(taxCountryRegion);
			case _201Package.MOVEMENT_TAX__TAX_CODE:
				return TAX_CODE_EDEFAULT == null ? taxCode != null : !TAX_CODE_EDEFAULT.equals(taxCode);
			case _201Package.MOVEMENT_TAX__TAX_PERCENTAGE:
				return TAX_PERCENTAGE_EDEFAULT == null ? taxPercentage != null : !TAX_PERCENTAGE_EDEFAULT.equals(taxPercentage);
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
		result.append(" (taxType: ");
		if (taxTypeESet) result.append(taxType); else result.append("<unset>");
		result.append(", taxCountryRegion: ");
		result.append(taxCountryRegion);
		result.append(", taxCode: ");
		result.append(taxCode);
		result.append(", taxPercentage: ");
		result.append(taxPercentage);
		result.append(')');
		return result.toString();
	}

} //MovementTaxImpl
