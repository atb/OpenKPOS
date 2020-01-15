/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTableType#getTaxTableEntry <em>Tax Table Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getTaxTableType()
 * @model extendedMetaData="name='TaxTable_._type' kind='elementOnly'"
 * @generated
 */
public interface TaxTableType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tax Table Entry</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Table Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Table Entry</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getTaxTableType_TaxTableEntry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TaxTableEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TaxTableEntryType> getTaxTableEntry();

} // TaxTableType
