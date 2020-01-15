/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Totals Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.DocumentTotalsType#getTaxPayable <em>Tax Payable</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.DocumentTotalsType#getNetTotal <em>Net Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.DocumentTotalsType#getGrossTotal <em>Gross Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.DocumentTotalsType#getCurrency <em>Currency</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.DocumentTotalsType#getSettlement <em>Settlement</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getDocumentTotalsType()
 * @model extendedMetaData="name='DocumentTotals_._type' kind='elementOnly'"
 * @generated
 */
public interface DocumentTotalsType extends EObject {
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getDocumentTotalsType_TaxPayable()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='TaxPayable' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTaxPayable();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.DocumentTotalsType#getTaxPayable <em>Tax Payable</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getDocumentTotalsType_NetTotal()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='NetTotal' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getNetTotal();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.DocumentTotalsType#getNetTotal <em>Net Total</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getDocumentTotalsType_GrossTotal()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='GrossTotal' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getGrossTotal();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.DocumentTotalsType#getGrossTotal <em>Gross Total</em>}' attribute.
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
	 * @see #setCurrency(CurrencyType)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getDocumentTotalsType_Currency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Currency' namespace='##targetNamespace'"
	 * @generated
	 */
	CurrencyType getCurrency();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.DocumentTotalsType#getCurrency <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' containment reference.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(CurrencyType value);

	/**
	 * Returns the value of the '<em><b>Settlement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settlement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settlement</em>' containment reference.
	 * @see #setSettlement(SettlementType)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getDocumentTotalsType_Settlement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Settlement' namespace='##targetNamespace'"
	 * @generated
	 */
	SettlementType getSettlement();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.DocumentTotalsType#getSettlement <em>Settlement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settlement</em>' containment reference.
	 * @see #getSettlement()
	 * @generated
	 */
	void setSettlement(SettlementType value);

} // DocumentTotalsType
