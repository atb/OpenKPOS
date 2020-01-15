/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;

import oecd.standard.audit.file.tax.p.t1._0._401.MovementOfGoodsType;
import oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Movement Of Goods Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.MovementOfGoodsTypeImpl#getNumberOfMovementLines <em>Number Of Movement Lines</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.MovementOfGoodsTypeImpl#getTotalQuantityIssued <em>Total Quantity Issued</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.MovementOfGoodsTypeImpl#getStockMovement <em>Stock Movement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MovementOfGoodsTypeImpl extends EObjectImpl implements MovementOfGoodsType {
	/**
	 * The default value of the '{@link #getNumberOfMovementLines() <em>Number Of Movement Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfMovementLines()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_MOVEMENT_LINES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfMovementLines() <em>Number Of Movement Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfMovementLines()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberOfMovementLines = NUMBER_OF_MOVEMENT_LINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalQuantityIssued() <em>Total Quantity Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalQuantityIssued()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_QUANTITY_ISSUED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalQuantityIssued() <em>Total Quantity Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalQuantityIssued()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal totalQuantityIssued = TOTAL_QUANTITY_ISSUED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStockMovement() <em>Stock Movement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockMovement()
	 * @generated
	 * @ordered
	 */
	protected EList<StockMovementType> stockMovement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovementOfGoodsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getMovementOfGoodsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberOfMovementLines() {
		return numberOfMovementLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfMovementLines(BigInteger newNumberOfMovementLines) {
		BigInteger oldNumberOfMovementLines = numberOfMovementLines;
		numberOfMovementLines = newNumberOfMovementLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.MOVEMENT_OF_GOODS_TYPE__NUMBER_OF_MOVEMENT_LINES, oldNumberOfMovementLines, numberOfMovementLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTotalQuantityIssued() {
		return totalQuantityIssued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalQuantityIssued(BigDecimal newTotalQuantityIssued) {
		BigDecimal oldTotalQuantityIssued = totalQuantityIssued;
		totalQuantityIssued = newTotalQuantityIssued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.MOVEMENT_OF_GOODS_TYPE__TOTAL_QUANTITY_ISSUED, oldTotalQuantityIssued, totalQuantityIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StockMovementType> getStockMovement() {
		if (stockMovement == null) {
			stockMovement = new EObjectContainmentEList<StockMovementType>(StockMovementType.class, this, _401Package.MOVEMENT_OF_GOODS_TYPE__STOCK_MOVEMENT);
		}
		return stockMovement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _401Package.MOVEMENT_OF_GOODS_TYPE__STOCK_MOVEMENT:
				return ((InternalEList<?>)getStockMovement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _401Package.MOVEMENT_OF_GOODS_TYPE__NUMBER_OF_MOVEMENT_LINES:
				return getNumberOfMovementLines();
			case _401Package.MOVEMENT_OF_GOODS_TYPE__TOTAL_QUANTITY_ISSUED:
				return getTotalQuantityIssued();
			case _401Package.MOVEMENT_OF_GOODS_TYPE__STOCK_MOVEMENT:
				return getStockMovement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _401Package.MOVEMENT_OF_GOODS_TYPE__NUMBER_OF_MOVEMENT_LINES:
				setNumberOfMovementLines((BigInteger)newValue);
				return;
			case _401Package.MOVEMENT_OF_GOODS_TYPE__TOTAL_QUANTITY_ISSUED:
				setTotalQuantityIssued((BigDecimal)newValue);
				return;
			case _401Package.MOVEMENT_OF_GOODS_TYPE__STOCK_MOVEMENT:
				getStockMovement().clear();
				getStockMovement().addAll((Collection<? extends StockMovementType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _401Package.MOVEMENT_OF_GOODS_TYPE__NUMBER_OF_MOVEMENT_LINES:
				setNumberOfMovementLines(NUMBER_OF_MOVEMENT_LINES_EDEFAULT);
				return;
			case _401Package.MOVEMENT_OF_GOODS_TYPE__TOTAL_QUANTITY_ISSUED:
				setTotalQuantityIssued(TOTAL_QUANTITY_ISSUED_EDEFAULT);
				return;
			case _401Package.MOVEMENT_OF_GOODS_TYPE__STOCK_MOVEMENT:
				getStockMovement().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _401Package.MOVEMENT_OF_GOODS_TYPE__NUMBER_OF_MOVEMENT_LINES:
				return NUMBER_OF_MOVEMENT_LINES_EDEFAULT == null ? numberOfMovementLines != null : !NUMBER_OF_MOVEMENT_LINES_EDEFAULT.equals(numberOfMovementLines);
			case _401Package.MOVEMENT_OF_GOODS_TYPE__TOTAL_QUANTITY_ISSUED:
				return TOTAL_QUANTITY_ISSUED_EDEFAULT == null ? totalQuantityIssued != null : !TOTAL_QUANTITY_ISSUED_EDEFAULT.equals(totalQuantityIssued);
			case _401Package.MOVEMENT_OF_GOODS_TYPE__STOCK_MOVEMENT:
				return stockMovement != null && !stockMovement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numberOfMovementLines: ");
		result.append(numberOfMovementLines);
		result.append(", totalQuantityIssued: ");
		result.append(totalQuantityIssued);
		result.append(')');
		return result.toString();
	}

} //MovementOfGoodsTypeImpl
