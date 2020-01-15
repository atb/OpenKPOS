/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import java.math.BigDecimal;

import java.util.Collection;

import oecd.standard.audit.file.tax.p.t1._0._401.CustomsInformation;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customs Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.CustomsInformationImpl#getARCNo <em>ARC No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.CustomsInformationImpl#getIECAmount <em>IEC Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomsInformationImpl extends EObjectImpl implements CustomsInformation {
	/**
	 * The cached value of the '{@link #getARCNo() <em>ARC No</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARCNo()
	 * @generated
	 * @ordered
	 */
	protected EList<String> aRCNo;

	/**
	 * The default value of the '{@link #getIECAmount() <em>IEC Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIECAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal IEC_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIECAmount() <em>IEC Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIECAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal iECAmount = IEC_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomsInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getCustomsInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getARCNo() {
		if (aRCNo == null) {
			aRCNo = new EDataTypeEList<String>(String.class, this, _401Package.CUSTOMS_INFORMATION__ARC_NO);
		}
		return aRCNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getIECAmount() {
		return iECAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIECAmount(BigDecimal newIECAmount) {
		BigDecimal oldIECAmount = iECAmount;
		iECAmount = newIECAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.CUSTOMS_INFORMATION__IEC_AMOUNT, oldIECAmount, iECAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _401Package.CUSTOMS_INFORMATION__ARC_NO:
				return getARCNo();
			case _401Package.CUSTOMS_INFORMATION__IEC_AMOUNT:
				return getIECAmount();
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
			case _401Package.CUSTOMS_INFORMATION__ARC_NO:
				getARCNo().clear();
				getARCNo().addAll((Collection<? extends String>)newValue);
				return;
			case _401Package.CUSTOMS_INFORMATION__IEC_AMOUNT:
				setIECAmount((BigDecimal)newValue);
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
			case _401Package.CUSTOMS_INFORMATION__ARC_NO:
				getARCNo().clear();
				return;
			case _401Package.CUSTOMS_INFORMATION__IEC_AMOUNT:
				setIECAmount(IEC_AMOUNT_EDEFAULT);
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
			case _401Package.CUSTOMS_INFORMATION__ARC_NO:
				return aRCNo != null && !aRCNo.isEmpty();
			case _401Package.CUSTOMS_INFORMATION__IEC_AMOUNT:
				return IEC_AMOUNT_EDEFAULT == null ? iECAmount != null : !IEC_AMOUNT_EDEFAULT.equals(iECAmount);
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
		result.append(" (aRCNo: ");
		result.append(aRCNo);
		result.append(", iECAmount: ");
		result.append(iECAmount);
		result.append(')');
		return result.toString();
	}

} //CustomsInformationImpl
