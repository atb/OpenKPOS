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
 * A representation of the model object '<em><b>Source Documents Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.SourceDocumentsType#getSalesInvoices <em>Sales Invoices</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getSourceDocumentsType()
 * @model extendedMetaData="name='SourceDocuments_._type' kind='elementOnly'"
 * @generated
 */
public interface SourceDocumentsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sales Invoices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Invoices</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Invoices</em>' containment reference.
	 * @see #setSalesInvoices(SalesInvoicesType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getSourceDocumentsType_SalesInvoices()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SalesInvoices' namespace='##targetNamespace'"
	 * @generated
	 */
	SalesInvoicesType getSalesInvoices();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.SourceDocumentsType#getSalesInvoices <em>Sales Invoices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Invoices</em>' containment reference.
	 * @see #getSalesInvoices()
	 * @generated
	 */
	void setSalesInvoices(SalesInvoicesType value);

} // SourceDocumentsType
