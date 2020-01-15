/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customs Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.CustomsDetails#getCNCode <em>CN Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.CustomsDetails#getUNNumber <em>UN Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getCustomsDetails()
 * @model extendedMetaData="name='CustomsDetails' kind='elementOnly'"
 * @generated
 */
public interface CustomsDetails extends EObject {
	/**
	 * Returns the value of the '<em><b>CN Code</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CN Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CN Code</em>' attribute list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getCustomsDetails_CNCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTCNCode"
	 *        extendedMetaData="kind='element' name='CNCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getCNCode();

	/**
	 * Returns the value of the '<em><b>UN Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UN Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UN Number</em>' attribute list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getCustomsDetails_UNNumber()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTUNNumber"
	 *        extendedMetaData="kind='element' name='UNNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUNNumber();

} // CustomsDetails
