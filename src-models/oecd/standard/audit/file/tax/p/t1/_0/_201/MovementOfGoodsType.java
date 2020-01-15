/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movement Of Goods Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.MovementOfGoodsType#getNumberOfMovementLines <em>Number Of Movement Lines</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.MovementOfGoodsType#getTotalQuantityIssued <em>Total Quantity Issued</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.MovementOfGoodsType#getStockMovement <em>Stock Movement</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getMovementOfGoodsType()
 * @model extendedMetaData="name='MovementOfGoods_._type' kind='elementOnly'"
 * @generated
 */
public interface MovementOfGoodsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Movement Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Movement Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Movement Lines</em>' attribute.
	 * @see #setNumberOfMovementLines(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getMovementOfGoodsType_NumberOfMovementLines()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='NumberOfMovementLines' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfMovementLines();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.MovementOfGoodsType#getNumberOfMovementLines <em>Number Of Movement Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Movement Lines</em>' attribute.
	 * @see #getNumberOfMovementLines()
	 * @generated
	 */
	void setNumberOfMovementLines(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Total Quantity Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Quantity Issued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Quantity Issued</em>' attribute.
	 * @see #setTotalQuantityIssued(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getMovementOfGoodsType_TotalQuantityIssued()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdecimalType" required="true"
	 *        extendedMetaData="kind='element' name='TotalQuantityIssued' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTotalQuantityIssued();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.MovementOfGoodsType#getTotalQuantityIssued <em>Total Quantity Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Quantity Issued</em>' attribute.
	 * @see #getTotalQuantityIssued()
	 * @generated
	 */
	void setTotalQuantityIssued(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Stock Movement</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._201.StockMovementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Movement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Movement</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getMovementOfGoodsType_StockMovement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StockMovement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StockMovementType> getStockMovement();

} // MovementOfGoodsType
