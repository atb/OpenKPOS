/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import oecd.standard.audit.file.tax.p.t1._0._401.CustomsDetails;
import oecd.standard.audit.file.tax.p.t1._0._401.ProductType;
import oecd.standard.audit.file.tax.p.t1._0._401.ProductTypeType;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.ProductTypeImpl#getProductType <em>Product Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.ProductTypeImpl#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.ProductTypeImpl#getProductGroup <em>Product Group</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.ProductTypeImpl#getProductDescription <em>Product Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.ProductTypeImpl#getProductNumberCode <em>Product Number Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.ProductTypeImpl#getCustomsDetails <em>Customs Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductTypeImpl extends EObjectImpl implements ProductType {
	/**
	 * The default value of the '{@link #getProductType() <em>Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductType()
	 * @generated
	 * @ordered
	 */
	protected static final ProductTypeType PRODUCT_TYPE_EDEFAULT = ProductTypeType.P;

	/**
	 * The cached value of the '{@link #getProductType() <em>Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductType()
	 * @generated
	 * @ordered
	 */
	protected ProductTypeType productType = PRODUCT_TYPE_EDEFAULT;

	/**
	 * This is true if the Product Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean productTypeESet;

	/**
	 * The default value of the '{@link #getProductCode() <em>Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCode()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductCode() <em>Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCode()
	 * @generated
	 * @ordered
	 */
	protected String productCode = PRODUCT_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductGroup() <em>Product Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductGroup() <em>Product Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductGroup()
	 * @generated
	 * @ordered
	 */
	protected String productGroup = PRODUCT_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductDescription() <em>Product Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductDescription() <em>Product Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDescription()
	 * @generated
	 * @ordered
	 */
	protected String productDescription = PRODUCT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductNumberCode() <em>Product Number Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductNumberCode()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NUMBER_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductNumberCode() <em>Product Number Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductNumberCode()
	 * @generated
	 * @ordered
	 */
	protected String productNumberCode = PRODUCT_NUMBER_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomsDetails() <em>Customs Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomsDetails()
	 * @generated
	 * @ordered
	 */
	protected CustomsDetails customsDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getProductType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductTypeType getProductType() {
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductType(ProductTypeType newProductType) {
		ProductTypeType oldProductType = productType;
		productType = newProductType == null ? PRODUCT_TYPE_EDEFAULT : newProductType;
		boolean oldProductTypeESet = productTypeESet;
		productTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.PRODUCT_TYPE__PRODUCT_TYPE, oldProductType, productType, !oldProductTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProductType() {
		ProductTypeType oldProductType = productType;
		boolean oldProductTypeESet = productTypeESet;
		productType = PRODUCT_TYPE_EDEFAULT;
		productTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _401Package.PRODUCT_TYPE__PRODUCT_TYPE, oldProductType, PRODUCT_TYPE_EDEFAULT, oldProductTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProductType() {
		return productTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductCode(String newProductCode) {
		String oldProductCode = productCode;
		productCode = newProductCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.PRODUCT_TYPE__PRODUCT_CODE, oldProductCode, productCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductGroup() {
		return productGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductGroup(String newProductGroup) {
		String oldProductGroup = productGroup;
		productGroup = newProductGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.PRODUCT_TYPE__PRODUCT_GROUP, oldProductGroup, productGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductDescription(String newProductDescription) {
		String oldProductDescription = productDescription;
		productDescription = newProductDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.PRODUCT_TYPE__PRODUCT_DESCRIPTION, oldProductDescription, productDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductNumberCode() {
		return productNumberCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductNumberCode(String newProductNumberCode) {
		String oldProductNumberCode = productNumberCode;
		productNumberCode = newProductNumberCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.PRODUCT_TYPE__PRODUCT_NUMBER_CODE, oldProductNumberCode, productNumberCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomsDetails getCustomsDetails() {
		return customsDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomsDetails(CustomsDetails newCustomsDetails, NotificationChain msgs) {
		CustomsDetails oldCustomsDetails = customsDetails;
		customsDetails = newCustomsDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.PRODUCT_TYPE__CUSTOMS_DETAILS, oldCustomsDetails, newCustomsDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomsDetails(CustomsDetails newCustomsDetails) {
		if (newCustomsDetails != customsDetails) {
			NotificationChain msgs = null;
			if (customsDetails != null)
				msgs = ((InternalEObject)customsDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.PRODUCT_TYPE__CUSTOMS_DETAILS, null, msgs);
			if (newCustomsDetails != null)
				msgs = ((InternalEObject)newCustomsDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.PRODUCT_TYPE__CUSTOMS_DETAILS, null, msgs);
			msgs = basicSetCustomsDetails(newCustomsDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.PRODUCT_TYPE__CUSTOMS_DETAILS, newCustomsDetails, newCustomsDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _401Package.PRODUCT_TYPE__CUSTOMS_DETAILS:
				return basicSetCustomsDetails(null, msgs);
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
			case _401Package.PRODUCT_TYPE__PRODUCT_TYPE:
				return getProductType();
			case _401Package.PRODUCT_TYPE__PRODUCT_CODE:
				return getProductCode();
			case _401Package.PRODUCT_TYPE__PRODUCT_GROUP:
				return getProductGroup();
			case _401Package.PRODUCT_TYPE__PRODUCT_DESCRIPTION:
				return getProductDescription();
			case _401Package.PRODUCT_TYPE__PRODUCT_NUMBER_CODE:
				return getProductNumberCode();
			case _401Package.PRODUCT_TYPE__CUSTOMS_DETAILS:
				return getCustomsDetails();
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
			case _401Package.PRODUCT_TYPE__PRODUCT_TYPE:
				setProductType((ProductTypeType)newValue);
				return;
			case _401Package.PRODUCT_TYPE__PRODUCT_CODE:
				setProductCode((String)newValue);
				return;
			case _401Package.PRODUCT_TYPE__PRODUCT_GROUP:
				setProductGroup((String)newValue);
				return;
			case _401Package.PRODUCT_TYPE__PRODUCT_DESCRIPTION:
				setProductDescription((String)newValue);
				return;
			case _401Package.PRODUCT_TYPE__PRODUCT_NUMBER_CODE:
				setProductNumberCode((String)newValue);
				return;
			case _401Package.PRODUCT_TYPE__CUSTOMS_DETAILS:
				setCustomsDetails((CustomsDetails)newValue);
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
			case _401Package.PRODUCT_TYPE__PRODUCT_TYPE:
				unsetProductType();
				return;
			case _401Package.PRODUCT_TYPE__PRODUCT_CODE:
				setProductCode(PRODUCT_CODE_EDEFAULT);
				return;
			case _401Package.PRODUCT_TYPE__PRODUCT_GROUP:
				setProductGroup(PRODUCT_GROUP_EDEFAULT);
				return;
			case _401Package.PRODUCT_TYPE__PRODUCT_DESCRIPTION:
				setProductDescription(PRODUCT_DESCRIPTION_EDEFAULT);
				return;
			case _401Package.PRODUCT_TYPE__PRODUCT_NUMBER_CODE:
				setProductNumberCode(PRODUCT_NUMBER_CODE_EDEFAULT);
				return;
			case _401Package.PRODUCT_TYPE__CUSTOMS_DETAILS:
				setCustomsDetails((CustomsDetails)null);
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
			case _401Package.PRODUCT_TYPE__PRODUCT_TYPE:
				return isSetProductType();
			case _401Package.PRODUCT_TYPE__PRODUCT_CODE:
				return PRODUCT_CODE_EDEFAULT == null ? productCode != null : !PRODUCT_CODE_EDEFAULT.equals(productCode);
			case _401Package.PRODUCT_TYPE__PRODUCT_GROUP:
				return PRODUCT_GROUP_EDEFAULT == null ? productGroup != null : !PRODUCT_GROUP_EDEFAULT.equals(productGroup);
			case _401Package.PRODUCT_TYPE__PRODUCT_DESCRIPTION:
				return PRODUCT_DESCRIPTION_EDEFAULT == null ? productDescription != null : !PRODUCT_DESCRIPTION_EDEFAULT.equals(productDescription);
			case _401Package.PRODUCT_TYPE__PRODUCT_NUMBER_CODE:
				return PRODUCT_NUMBER_CODE_EDEFAULT == null ? productNumberCode != null : !PRODUCT_NUMBER_CODE_EDEFAULT.equals(productNumberCode);
			case _401Package.PRODUCT_TYPE__CUSTOMS_DETAILS:
				return customsDetails != null;
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
		result.append(" (productType: ");
		if (productTypeESet) result.append(productType); else result.append("<unset>");
		result.append(", productCode: ");
		result.append(productCode);
		result.append(", productGroup: ");
		result.append(productGroup);
		result.append(", productDescription: ");
		result.append(productDescription);
		result.append(", productNumberCode: ");
		result.append(productNumberCode);
		result.append(')');
		return result.toString();
	}

} //ProductTypeImpl
