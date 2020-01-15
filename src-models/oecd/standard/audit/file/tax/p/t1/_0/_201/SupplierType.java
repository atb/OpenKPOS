/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getSupplierID <em>Supplier ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getSupplierTaxID <em>Supplier Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getContact <em>Contact</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getBillingAddress <em>Billing Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getShipFromAddress <em>Ship From Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getFax <em>Fax</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getEmail <em>Email</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getWebsite <em>Website</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getSelfBillingIndicator <em>Self Billing Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSupplierType()
 * @model extendedMetaData="name='Supplier_._type' kind='elementOnly'"
 * @generated
 */
public interface SupplierType extends EObject {
	/**
	 * Returns the value of the '<em><b>Supplier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier ID</em>' attribute.
	 * @see #setSupplierID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSupplierType_SupplierID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='SupplierID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSupplierID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getSupplierID <em>Supplier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier ID</em>' attribute.
	 * @see #getSupplierID()
	 * @generated
	 */
	void setSupplierID(String value);

	/**
	 * Returns the value of the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account ID</em>' attribute.
	 * @see #setAccountID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSupplierType_AccountID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.AccountIDType" required="true"
	 *        extendedMetaData="kind='element' name='AccountID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getAccountID <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account ID</em>' attribute.
	 * @see #getAccountID()
	 * @generated
	 */
	void setAccountID(String value);

	/**
	 * Returns the value of the '<em><b>Supplier Tax ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Tax ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Tax ID</em>' attribute.
	 * @see #setSupplierTaxID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSupplierType_SupplierTaxID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax20Car" required="true"
	 *        extendedMetaData="kind='element' name='SupplierTaxID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSupplierTaxID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getSupplierTaxID <em>Supplier Tax ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Tax ID</em>' attribute.
	 * @see #getSupplierTaxID()
	 * @generated
	 */
	void setSupplierTaxID(String value);

	/**
	 * Returns the value of the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Name</em>' attribute.
	 * @see #setCompanyName(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSupplierType_CompanyName()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax100Car" required="true"
	 *        extendedMetaData="kind='element' name='CompanyName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCompanyName();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getCompanyName <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Name</em>' attribute.
	 * @see #getCompanyName()
	 * @generated
	 */
	void setCompanyName(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' attribute.
	 * @see #setContact(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSupplierType_Contact()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax50Car"
	 *        extendedMetaData="kind='element' name='Contact' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContact();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getContact <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' attribute.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(String value);

	/**
	 * Returns the value of the '<em><b>Billing Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Address</em>' containment reference.
	 * @see #setBillingAddress(SupplierAddressStructure)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSupplierType_BillingAddress()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BillingAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplierAddressStructure getBillingAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getBillingAddress <em>Billing Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Address</em>' containment reference.
	 * @see #getBillingAddress()
	 * @generated
	 */
	void setBillingAddress(SupplierAddressStructure value);

	/**
	 * Returns the value of the '<em><b>Ship From Address</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierAddressStructure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship From Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship From Address</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSupplierType_ShipFromAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ShipFromAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupplierAddressStructure> getShipFromAddress();

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone</em>' attribute.
	 * @see #setTelephone(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSupplierType_Telephone()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax20Car"
	 *        extendedMetaData="kind='element' name='Telephone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getTelephone <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone</em>' attribute.
	 * @see #getTelephone()
	 * @generated
	 */
	void setTelephone(String value);

	/**
	 * Returns the value of the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fax</em>' attribute.
	 * @see #setFax(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSupplierType_Fax()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax20Car"
	 *        extendedMetaData="kind='element' name='Fax' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFax();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getFax <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fax</em>' attribute.
	 * @see #getFax()
	 * @generated
	 */
	void setFax(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSupplierType_Email()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax60Car"
	 *        extendedMetaData="kind='element' name='Email' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Website</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website</em>' attribute.
	 * @see #setWebsite(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSupplierType_Website()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax60Car"
	 *        extendedMetaData="kind='element' name='Website' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSupplierType_SelfBillingIndicator()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SelfBillingIndicatorType" required="true"
	 *        extendedMetaData="kind='element' name='SelfBillingIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSelfBillingIndicator();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.SupplierType#getSelfBillingIndicator <em>Self Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Billing Indicator</em>' attribute.
	 * @see #getSelfBillingIndicator()
	 * @generated
	 */
	void setSelfBillingIndicator(BigInteger value);

} // SupplierType
