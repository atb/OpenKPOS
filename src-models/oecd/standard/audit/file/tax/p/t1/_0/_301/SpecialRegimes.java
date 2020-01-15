/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Regimes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes#getSelfBillingIndicator <em>Self Billing Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes#getCashVATSchemeIndicator <em>Cash VAT Scheme Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes#getThirdPartiesBillingIndicator <em>Third Parties Billing Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getSpecialRegimes()
 * @model extendedMetaData="name='SpecialRegimes' kind='elementOnly'"
 * @generated
 */
public interface SpecialRegimes extends EObject {
	/**
	 * Returns the value of the '<em><b>Self Billing Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Billing Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Billing Indicator</em>' attribute.
	 * @see #setSelfBillingIndicator(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getSpecialRegimes_SelfBillingIndicator()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.SelfBillingIndicatorType" required="true"
	 *        extendedMetaData="kind='element' name='SelfBillingIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSelfBillingIndicator();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes#getSelfBillingIndicator <em>Self Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Billing Indicator</em>' attribute.
	 * @see #getSelfBillingIndicator()
	 * @generated
	 */
	void setSelfBillingIndicator(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cash VAT Scheme Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cash VAT Scheme Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cash VAT Scheme Indicator</em>' attribute.
	 * @see #setCashVATSchemeIndicator(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getSpecialRegimes_CashVATSchemeIndicator()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.CashVATSchemeIndicatorType" required="true"
	 *        extendedMetaData="kind='element' name='CashVATSchemeIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCashVATSchemeIndicator();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes#getCashVATSchemeIndicator <em>Cash VAT Scheme Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cash VAT Scheme Indicator</em>' attribute.
	 * @see #getCashVATSchemeIndicator()
	 * @generated
	 */
	void setCashVATSchemeIndicator(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Third Parties Billing Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Third Parties Billing Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third Parties Billing Indicator</em>' attribute.
	 * @see #setThirdPartiesBillingIndicator(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getSpecialRegimes_ThirdPartiesBillingIndicator()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.ThirdPartiesBillingIndicatorType" required="true"
	 *        extendedMetaData="kind='element' name='ThirdPartiesBillingIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getThirdPartiesBillingIndicator();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes#getThirdPartiesBillingIndicator <em>Third Parties Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third Parties Billing Indicator</em>' attribute.
	 * @see #getThirdPartiesBillingIndicator()
	 * @generated
	 */
	void setThirdPartiesBillingIndicator(BigInteger value);

} // SpecialRegimes
