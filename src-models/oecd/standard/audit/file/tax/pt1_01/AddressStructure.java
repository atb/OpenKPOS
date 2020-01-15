/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.AddressStructure#getBuildingNumber <em>Building Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.AddressStructure#getStreetName <em>Street Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.AddressStructure#getAddressDetail <em>Address Detail</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.AddressStructure#getCity <em>City</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.AddressStructure#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.AddressStructure#getRegion <em>Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.AddressStructure#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getAddressStructure()
 * @model extendedMetaData="name='AddressStructure' kind='elementOnly'"
 * @generated
 */
public interface AddressStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Building Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Number</em>' attribute.
	 * @see #setBuildingNumber(String)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getAddressStructure_BuildingNumber()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax10Car"
	 *        extendedMetaData="kind='element' name='BuildingNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBuildingNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.AddressStructure#getBuildingNumber <em>Building Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Number</em>' attribute.
	 * @see #getBuildingNumber()
	 * @generated
	 */
	void setBuildingNumber(String value);

	/**
	 * Returns the value of the '<em><b>Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Name</em>' attribute.
	 * @see #setStreetName(String)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getAddressStructure_StreetName()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax50Car"
	 *        extendedMetaData="kind='element' name='StreetName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStreetName();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.AddressStructure#getStreetName <em>Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Name</em>' attribute.
	 * @see #getStreetName()
	 * @generated
	 */
	void setStreetName(String value);

	/**
	 * Returns the value of the '<em><b>Address Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Detail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Detail</em>' attribute.
	 * @see #setAddressDetail(String)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getAddressStructure_AddressDetail()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax60Car" required="true"
	 *        extendedMetaData="kind='element' name='AddressDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddressDetail();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.AddressStructure#getAddressDetail <em>Address Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Detail</em>' attribute.
	 * @see #getAddressDetail()
	 * @generated
	 */
	void setAddressDetail(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getAddressStructure_City()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax50Car" required="true"
	 *        extendedMetaData="kind='element' name='City' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.AddressStructure#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getAddressStructure_PostalCode()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax20Car" required="true"
	 *        extendedMetaData="kind='element' name='PostalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.AddressStructure#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getAddressStructure_Region()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax50Car"
	 *        extendedMetaData="kind='element' name='Region' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.AddressStructure#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getAddressStructure_Country()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.CountryType" required="true"
	 *        extendedMetaData="kind='element' name='Country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.AddressStructure#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

} // AddressStructure
