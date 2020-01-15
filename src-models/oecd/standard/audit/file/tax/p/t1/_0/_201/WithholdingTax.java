/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Withholding Tax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTax#getWithholdingTaxType <em>Withholding Tax Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTax#getWithholdingTaxDescription <em>Withholding Tax Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTax#getWithholdingTaxAmount <em>Withholding Tax Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getWithholdingTax()
 * @model extendedMetaData="name='WithholdingTax' kind='elementOnly'"
 * @generated
 */
public interface WithholdingTax extends EObject {
	/**
	 * Returns the value of the '<em><b>Withholding Tax Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTaxTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restrição: IRS para Imposto Sobre o Rendimento das Pessoas Singulares, IRC para Imposto Sobre o Rendimento das Pessoas colectivas, IS para Imposto de selo 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Withholding Tax Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTaxTypeType
	 * @see #isSetWithholdingTaxType()
	 * @see #unsetWithholdingTaxType()
	 * @see #setWithholdingTaxType(WithholdingTaxTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getWithholdingTax_WithholdingTaxType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='WithholdingTaxType' namespace='##targetNamespace'"
	 * @generated
	 */
	WithholdingTaxTypeType getWithholdingTaxType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTax#getWithholdingTaxType <em>Withholding Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Withholding Tax Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTaxTypeType
	 * @see #isSetWithholdingTaxType()
	 * @see #unsetWithholdingTaxType()
	 * @see #getWithholdingTaxType()
	 * @generated
	 */
	void setWithholdingTaxType(WithholdingTaxTypeType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTax#getWithholdingTaxType <em>Withholding Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWithholdingTaxType()
	 * @see #getWithholdingTaxType()
	 * @see #setWithholdingTaxType(WithholdingTaxTypeType)
	 * @generated
	 */
	void unsetWithholdingTaxType();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTax#getWithholdingTaxType <em>Withholding Tax Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Withholding Tax Type</em>' attribute is set.
	 * @see #unsetWithholdingTaxType()
	 * @see #getWithholdingTaxType()
	 * @see #setWithholdingTaxType(WithholdingTaxTypeType)
	 * @generated
	 */
	boolean isSetWithholdingTaxType();

	/**
	 * Returns the value of the '<em><b>Withholding Tax Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Withholding Tax Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Withholding Tax Description</em>' attribute.
	 * @see #setWithholdingTaxDescription(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getWithholdingTax_WithholdingTaxDescription()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax60Car"
	 *        extendedMetaData="kind='element' name='WithholdingTaxDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWithholdingTaxDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTax#getWithholdingTaxDescription <em>Withholding Tax Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Withholding Tax Description</em>' attribute.
	 * @see #getWithholdingTaxDescription()
	 * @generated
	 */
	void setWithholdingTaxDescription(String value);

	/**
	 * Returns the value of the '<em><b>Withholding Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Withholding Tax Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Withholding Tax Amount</em>' attribute.
	 * @see #setWithholdingTaxAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getWithholdingTax_WithholdingTaxAmount()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='WithholdingTaxAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getWithholdingTaxAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTax#getWithholdingTaxAmount <em>Withholding Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Withholding Tax Amount</em>' attribute.
	 * @see #getWithholdingTaxAmount()
	 * @generated
	 */
	void setWithholdingTaxAmount(BigDecimal value);

} // WithholdingTax
