/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customs Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.CustomsInformation#getARCNo <em>ARC No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.CustomsInformation#getIECAmount <em>IEC Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getCustomsInformation()
 * @model extendedMetaData="name='CustomsInformation' kind='elementOnly'"
 * @generated
 */
public interface CustomsInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>ARC No</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ARC No</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ARC No</em>' attribute list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getCustomsInformation_ARCNo()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax21Car"
	 *        extendedMetaData="kind='element' name='ARCNo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getARCNo();

	/**
	 * Returns the value of the '<em><b>IEC Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IEC Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IEC Amount</em>' attribute.
	 * @see #setIECAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getCustomsInformation_IECAmount()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType"
	 *        extendedMetaData="kind='element' name='IECAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getIECAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.CustomsInformation#getIECAmount <em>IEC Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IEC Amount</em>' attribute.
	 * @see #getIECAmount()
	 * @generated
	 */
	void setIECAmount(BigDecimal value);

} // CustomsInformation
