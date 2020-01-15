/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.JournalType#getJournalID <em>Journal ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.JournalType#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.JournalType#getTransaction <em>Transaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getJournalType()
 * @model extendedMetaData="name='Journal_._type' kind='elementOnly'"
 * @generated
 */
public interface JournalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Journal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Journal ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journal ID</em>' attribute.
	 * @see #setJournalID(String)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getJournalType_JournalID()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='JournalID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJournalID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.JournalType#getJournalID <em>Journal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal ID</em>' attribute.
	 * @see #getJournalID()
	 * @generated
	 */
	void setJournalID(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getJournalType_Description()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax60Car" required="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.JournalType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.pt1_01.TransactionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getJournalType_Transaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Transaction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransactionType> getTransaction();

} // JournalType
