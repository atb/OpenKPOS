/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._401.TaxTableEntryType;
import oecd.standard.audit.file.tax.p.t1._0._401.TaxTypeType;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax Table Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.TaxTableEntryTypeImpl#getTaxType <em>Tax Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.TaxTableEntryTypeImpl#getTaxCountryRegion <em>Tax Country Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.TaxTableEntryTypeImpl#getTaxCode <em>Tax Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.TaxTableEntryTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.TaxTableEntryTypeImpl#getTaxExpirationDate <em>Tax Expiration Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.TaxTableEntryTypeImpl#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.TaxTableEntryTypeImpl#getTaxAmount <em>Tax Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaxTableEntryTypeImpl extends EObjectImpl implements TaxTableEntryType {
	/**
	 * The default value of the '{@link #getTaxType() <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxType()
	 * @generated
	 * @ordered
	 */
	protected static final TaxTypeType TAX_TYPE_EDEFAULT = TaxTypeType.IVA;

	/**
	 * The cached value of the '{@link #getTaxType() <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxType()
	 * @generated
	 * @ordered
	 */
	protected TaxTypeType taxType = TAX_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getTaxExpirationDate() <em>Tax Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TAX_EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxExpirationDate() <em>Tax Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar taxExpirationDate = TAX_EXPIRATION_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getTaxAmount() <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TAX_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxAmount() <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal taxAmount = TAX_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaxTableEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getTaxTableEntryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxTypeType getTaxType() {
		return taxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxType(TaxTypeType newTaxType) {
		TaxTypeType oldTaxType = taxType;
		taxType = newTaxType == null ? TAX_TYPE_EDEFAULT : newTaxType;
		boolean oldTaxTypeESet = taxTypeESet;
		taxTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.TAX_TABLE_ENTRY_TYPE__TAX_TYPE, oldTaxType, taxType, !oldTaxTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTaxType() {
		TaxTypeType oldTaxType = taxType;
		boolean oldTaxTypeESet = taxTypeESet;
		taxType = TAX_TYPE_EDEFAULT;
		taxTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _401Package.TAX_TABLE_ENTRY_TYPE__TAX_TYPE, oldTaxType, TAX_TYPE_EDEFAULT, oldTaxTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.TAX_TABLE_ENTRY_TYPE__TAX_COUNTRY_REGION, oldTaxCountryRegion, taxCountryRegion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.TAX_TABLE_ENTRY_TYPE__TAX_CODE, oldTaxCode, taxCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.TAX_TABLE_ENTRY_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTaxExpirationDate() {
		return taxExpirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxExpirationDate(XMLGregorianCalendar newTaxExpirationDate) {
		XMLGregorianCalendar oldTaxExpirationDate = taxExpirationDate;
		taxExpirationDate = newTaxExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.TAX_TABLE_ENTRY_TYPE__TAX_EXPIRATION_DATE, oldTaxExpirationDate, taxExpirationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.TAX_TABLE_ENTRY_TYPE__TAX_PERCENTAGE, oldTaxPercentage, taxPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxAmount(BigDecimal newTaxAmount) {
		BigDecimal oldTaxAmount = taxAmount;
		taxAmount = newTaxAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.TAX_TABLE_ENTRY_TYPE__TAX_AMOUNT, oldTaxAmount, taxAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_TYPE:
				return getTaxType();
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_COUNTRY_REGION:
				return getTaxCountryRegion();
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_CODE:
				return getTaxCode();
			case _401Package.TAX_TABLE_ENTRY_TYPE__DESCRIPTION:
				return getDescription();
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_EXPIRATION_DATE:
				return getTaxExpirationDate();
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_PERCENTAGE:
				return getTaxPercentage();
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_AMOUNT:
				return getTaxAmount();
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
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_TYPE:
				setTaxType((TaxTypeType)newValue);
				return;
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_COUNTRY_REGION:
				setTaxCountryRegion((String)newValue);
				return;
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_CODE:
				setTaxCode((String)newValue);
				return;
			case _401Package.TAX_TABLE_ENTRY_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_EXPIRATION_DATE:
				setTaxExpirationDate((XMLGregorianCalendar)newValue);
				return;
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_PERCENTAGE:
				setTaxPercentage((BigDecimal)newValue);
				return;
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_AMOUNT:
				setTaxAmount((BigDecimal)newValue);
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
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_TYPE:
				unsetTaxType();
				return;
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_COUNTRY_REGION:
				setTaxCountryRegion(TAX_COUNTRY_REGION_EDEFAULT);
				return;
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_CODE:
				setTaxCode(TAX_CODE_EDEFAULT);
				return;
			case _401Package.TAX_TABLE_ENTRY_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_EXPIRATION_DATE:
				setTaxExpirationDate(TAX_EXPIRATION_DATE_EDEFAULT);
				return;
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_PERCENTAGE:
				setTaxPercentage(TAX_PERCENTAGE_EDEFAULT);
				return;
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_AMOUNT:
				setTaxAmount(TAX_AMOUNT_EDEFAULT);
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
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_TYPE:
				return isSetTaxType();
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_COUNTRY_REGION:
				return TAX_COUNTRY_REGION_EDEFAULT == null ? taxCountryRegion != null : !TAX_COUNTRY_REGION_EDEFAULT.equals(taxCountryRegion);
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_CODE:
				return TAX_CODE_EDEFAULT == null ? taxCode != null : !TAX_CODE_EDEFAULT.equals(taxCode);
			case _401Package.TAX_TABLE_ENTRY_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_EXPIRATION_DATE:
				return TAX_EXPIRATION_DATE_EDEFAULT == null ? taxExpirationDate != null : !TAX_EXPIRATION_DATE_EDEFAULT.equals(taxExpirationDate);
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_PERCENTAGE:
				return TAX_PERCENTAGE_EDEFAULT == null ? taxPercentage != null : !TAX_PERCENTAGE_EDEFAULT.equals(taxPercentage);
			case _401Package.TAX_TABLE_ENTRY_TYPE__TAX_AMOUNT:
				return TAX_AMOUNT_EDEFAULT == null ? taxAmount != null : !TAX_AMOUNT_EDEFAULT.equals(taxAmount);
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
		result.append(", description: ");
		result.append(description);
		result.append(", taxExpirationDate: ");
		result.append(taxExpirationDate);
		result.append(", taxPercentage: ");
		result.append(taxPercentage);
		result.append(", taxAmount: ");
		result.append(taxAmount);
		result.append(')');
		return result.toString();
	}

} //TaxTableEntryTypeImpl
