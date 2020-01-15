/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipping Point Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.ShippingPointStructure#getDeliveryID <em>Delivery ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.ShippingPointStructure#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.ShippingPointStructure#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getShippingPointStructure()
 * @model extendedMetaData="name='ShippingPointStructure' kind='elementOnly'"
 * @generated
 */
public interface ShippingPointStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Delivery ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery ID</em>' attribute.
	 * @see #setDeliveryID(String)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getShippingPointStructure_DeliveryID()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax30Car"
	 *        extendedMetaData="kind='element' name='DeliveryID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeliveryID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.ShippingPointStructure#getDeliveryID <em>Delivery ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery ID</em>' attribute.
	 * @see #getDeliveryID()
	 * @generated
	 */
	void setDeliveryID(String value);

	/**
	 * Returns the value of the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Date</em>' attribute.
	 * @see #setDeliveryDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getShippingPointStructure_DeliveryDate()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFdateType"
	 *        extendedMetaData="kind='element' name='DeliveryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDeliveryDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.ShippingPointStructure#getDeliveryDate <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Date</em>' attribute.
	 * @see #getDeliveryDate()
	 * @generated
	 */
	void setDeliveryDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressStructure)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getShippingPointStructure_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Address' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructure getAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.ShippingPointStructure#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressStructure value);

} // ShippingPointStructure
