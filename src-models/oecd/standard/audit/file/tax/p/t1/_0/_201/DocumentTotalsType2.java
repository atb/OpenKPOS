/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Totals Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentTotalsType2#getTaxPayable <em>Tax Payable</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentTotalsType2#getNetTotal <em>Net Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentTotalsType2#getGrossTotal <em>Gross Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentTotalsType2#getCurrency <em>Currency</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentTotalsType2#getSettlement <em>Settlement</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentTotalsType2#getPayment <em>Payment</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentTotalsType2()
 * @model extendedMetaData="name='DocumentTotals_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface DocumentTotalsType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Tax Payable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Payable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Payable</em>' attribute.
	 * @see #setTaxPayable(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentTotalsType2_TaxPayable()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='TaxPayable' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTaxPayable();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentTotalsType2#getTaxPayable <em>Tax Payable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Payable</em>' attribute.
	 * @see #getTaxPayable()
	 * @generated
	 */
	void setTaxPayable(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Net Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Total</em>' attribute.
	 * @see #setNetTotal(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentTotalsType2_NetTotal()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='NetTotal' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getNetTotal();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentTotalsType2#getNetTotal <em>Net Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Total</em>' attribute.
	 * @see #getNetTotal()
	 * @generated
	 */
	void setNetTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Gross Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gross Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gross Total</em>' attribute.
	 * @see #setGrossTotal(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentTotalsType2_GrossTotal()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='GrossTotal' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getGrossTotal();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentTotalsType2#getGrossTotal <em>Gross Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross Total</em>' attribute.
	 * @see #getGrossTotal()
	 * @generated
	 */
	void setGrossTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' containment reference.
	 * @see #setCurrency(Currency)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentTotalsType2_Currency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Currency' namespace='##targetNamespace'"
	 * @generated
	 */
	Currency getCurrency();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentTotalsType2#getCurrency <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' containment reference.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Currency value);

	/**
	 * Returns the value of the '<em><b>Settlement</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._201.Settlement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settlement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settlement</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentTotalsType2_Settlement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Settlement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Settlement> getSettlement();

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._201.Payment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentTotalsType2_Payment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Payment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Payment> getPayment();

} // DocumentTotalsType2
