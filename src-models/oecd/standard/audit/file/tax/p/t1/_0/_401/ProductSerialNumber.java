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
 * A representation of the model object '<em><b>Product Serial Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductSerialNumber#getSerialNumber <em>Serial Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getProductSerialNumber()
 * @model extendedMetaData="name='ProductSerialNumber' kind='elementOnly'"
 * @generated
 */
public interface ProductSerialNumber extends EObject {
	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getProductSerialNumber_SerialNumber()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax100Car" required="true"
	 *        extendedMetaData="kind='element' name='SerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSerialNumber();

} // ProductSerialNumber
