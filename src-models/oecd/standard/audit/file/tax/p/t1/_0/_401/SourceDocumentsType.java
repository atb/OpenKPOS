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
 * A representation of the model object '<em><b>Source Documents Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.SourceDocumentsType#getSalesInvoices <em>Sales Invoices</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.SourceDocumentsType#getMovementOfGoods <em>Movement Of Goods</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.SourceDocumentsType#getWorkingDocuments <em>Working Documents</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.SourceDocumentsType#getPayments <em>Payments</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getSourceDocumentsType()
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getSourceDocumentsType_SalesInvoices()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SalesInvoices' namespace='##targetNamespace'"
	 * @generated
	 */
	SalesInvoicesType getSalesInvoices();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.SourceDocumentsType#getSalesInvoices <em>Sales Invoices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Invoices</em>' containment reference.
	 * @see #getSalesInvoices()
	 * @generated
	 */
	void setSalesInvoices(SalesInvoicesType value);

	/**
	 * Returns the value of the '<em><b>Movement Of Goods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement Of Goods</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Of Goods</em>' containment reference.
	 * @see #setMovementOfGoods(MovementOfGoodsType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getSourceDocumentsType_MovementOfGoods()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MovementOfGoods' namespace='##targetNamespace'"
	 * @generated
	 */
	MovementOfGoodsType getMovementOfGoods();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.SourceDocumentsType#getMovementOfGoods <em>Movement Of Goods</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Of Goods</em>' containment reference.
	 * @see #getMovementOfGoods()
	 * @generated
	 */
	void setMovementOfGoods(MovementOfGoodsType value);

	/**
	 * Returns the value of the '<em><b>Working Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Working Documents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Documents</em>' containment reference.
	 * @see #setWorkingDocuments(WorkingDocumentsType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getSourceDocumentsType_WorkingDocuments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WorkingDocuments' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkingDocumentsType getWorkingDocuments();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.SourceDocumentsType#getWorkingDocuments <em>Working Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Documents</em>' containment reference.
	 * @see #getWorkingDocuments()
	 * @generated
	 */
	void setWorkingDocuments(WorkingDocumentsType value);

	/**
	 * Returns the value of the '<em><b>Payments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payments</em>' containment reference.
	 * @see #setPayments(PaymentsType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getSourceDocumentsType_Payments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Payments' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentsType getPayments();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.SourceDocumentsType#getPayments <em>Payments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payments</em>' containment reference.
	 * @see #getPayments()
	 * @generated
	 */
	void setPayments(PaymentsType value);

} // SourceDocumentsType
