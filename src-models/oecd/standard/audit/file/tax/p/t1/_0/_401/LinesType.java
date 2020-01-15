/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lines Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LinesType#getDebitLine <em>Debit Line</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LinesType#getCreditLine <em>Credit Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLinesType()
 * @model extendedMetaData="name='Lines_._type' kind='elementOnly'"
 * @generated
 */
public interface LinesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Debit Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debit Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debit Line</em>' containment reference.
	 * @see #setDebitLine(DebitLineType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLinesType_DebitLine()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DebitLine' namespace='##targetNamespace'"
	 * @generated
	 */
	DebitLineType getDebitLine();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LinesType#getDebitLine <em>Debit Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit Line</em>' containment reference.
	 * @see #getDebitLine()
	 * @generated
	 */
	void setDebitLine(DebitLineType value);

	/**
	 * Returns the value of the '<em><b>Credit Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Line</em>' containment reference.
	 * @see #setCreditLine(CreditLineType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLinesType_CreditLine()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CreditLine' namespace='##targetNamespace'"
	 * @generated
	 */
	CreditLineType getCreditLine();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LinesType#getCreditLine <em>Credit Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Line</em>' containment reference.
	 * @see #getCreditLine()
	 * @generated
	 */
	void setCreditLine(CreditLineType value);

} // LinesType
