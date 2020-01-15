/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>References Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.ReferencesType#getCreditNote <em>Credit Note</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getReferencesType()
 * @model extendedMetaData="name='References_._type' kind='elementOnly'"
 * @generated
 */
public interface ReferencesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Credit Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Note</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Note</em>' containment reference.
	 * @see #setCreditNote(CreditNoteType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getReferencesType_CreditNote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CreditNote' namespace='##targetNamespace'"
	 * @generated
	 */
	CreditNoteType getCreditNote();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.ReferencesType#getCreditNote <em>Credit Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Note</em>' containment reference.
	 * @see #getCreditNote()
	 * @generated
	 */
	void setCreditNote(CreditNoteType value);

} // ReferencesType
