/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import oecd.standard.audit.file.tax.p.t1._0._401.CreditLineType;
import oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType;
import oecd.standard.audit.file.tax.p.t1._0._401.LinesType;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lines Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LinesTypeImpl#getDebitLine <em>Debit Line</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LinesTypeImpl#getCreditLine <em>Credit Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinesTypeImpl extends EObjectImpl implements LinesType {
	/**
	 * The cached value of the '{@link #getDebitLine() <em>Debit Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitLine()
	 * @generated
	 * @ordered
	 */
	protected DebitLineType debitLine;

	/**
	 * The cached value of the '{@link #getCreditLine() <em>Credit Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditLine()
	 * @generated
	 * @ordered
	 */
	protected CreditLineType creditLine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getLinesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DebitLineType getDebitLine() {
		return debitLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDebitLine(DebitLineType newDebitLine, NotificationChain msgs) {
		DebitLineType oldDebitLine = debitLine;
		debitLine = newDebitLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.LINES_TYPE__DEBIT_LINE, oldDebitLine, newDebitLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebitLine(DebitLineType newDebitLine) {
		if (newDebitLine != debitLine) {
			NotificationChain msgs = null;
			if (debitLine != null)
				msgs = ((InternalEObject)debitLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.LINES_TYPE__DEBIT_LINE, null, msgs);
			if (newDebitLine != null)
				msgs = ((InternalEObject)newDebitLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.LINES_TYPE__DEBIT_LINE, null, msgs);
			msgs = basicSetDebitLine(newDebitLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINES_TYPE__DEBIT_LINE, newDebitLine, newDebitLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditLineType getCreditLine() {
		return creditLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreditLine(CreditLineType newCreditLine, NotificationChain msgs) {
		CreditLineType oldCreditLine = creditLine;
		creditLine = newCreditLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.LINES_TYPE__CREDIT_LINE, oldCreditLine, newCreditLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditLine(CreditLineType newCreditLine) {
		if (newCreditLine != creditLine) {
			NotificationChain msgs = null;
			if (creditLine != null)
				msgs = ((InternalEObject)creditLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.LINES_TYPE__CREDIT_LINE, null, msgs);
			if (newCreditLine != null)
				msgs = ((InternalEObject)newCreditLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.LINES_TYPE__CREDIT_LINE, null, msgs);
			msgs = basicSetCreditLine(newCreditLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINES_TYPE__CREDIT_LINE, newCreditLine, newCreditLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _401Package.LINES_TYPE__DEBIT_LINE:
				return basicSetDebitLine(null, msgs);
			case _401Package.LINES_TYPE__CREDIT_LINE:
				return basicSetCreditLine(null, msgs);
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
			case _401Package.LINES_TYPE__DEBIT_LINE:
				return getDebitLine();
			case _401Package.LINES_TYPE__CREDIT_LINE:
				return getCreditLine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _401Package.LINES_TYPE__DEBIT_LINE:
				setDebitLine((DebitLineType)newValue);
				return;
			case _401Package.LINES_TYPE__CREDIT_LINE:
				setCreditLine((CreditLineType)newValue);
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
			case _401Package.LINES_TYPE__DEBIT_LINE:
				setDebitLine((DebitLineType)null);
				return;
			case _401Package.LINES_TYPE__CREDIT_LINE:
				setCreditLine((CreditLineType)null);
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
			case _401Package.LINES_TYPE__DEBIT_LINE:
				return debitLine != null;
			case _401Package.LINES_TYPE__CREDIT_LINE:
				return creditLine != null;
		}
		return super.eIsSet(featureID);
	}

} //LinesTypeImpl
