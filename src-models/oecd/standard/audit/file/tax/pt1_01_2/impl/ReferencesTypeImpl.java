/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2.impl;

import oecd.standard.audit.file.tax.pt1_01_2.CreditNoteType;
import oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package;
import oecd.standard.audit.file.tax.pt1_01_2.ReferencesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>References Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.ReferencesTypeImpl#getCreditNote <em>Credit Note</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencesTypeImpl extends EObjectImpl implements ReferencesType {
	/**
	 * The cached value of the '{@link #getCreditNote() <em>Credit Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditNote()
	 * @generated
	 * @ordered
	 */
	protected CreditNoteType creditNote;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pt1_01_2Package.Literals.REFERENCES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditNoteType getCreditNote() {
		return creditNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreditNote(CreditNoteType newCreditNote, NotificationChain msgs) {
		CreditNoteType oldCreditNote = creditNote;
		creditNote = newCreditNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.REFERENCES_TYPE__CREDIT_NOTE, oldCreditNote, newCreditNote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditNote(CreditNoteType newCreditNote) {
		if (newCreditNote != creditNote) {
			NotificationChain msgs = null;
			if (creditNote != null)
				msgs = ((InternalEObject)creditNote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pt1_01_2Package.REFERENCES_TYPE__CREDIT_NOTE, null, msgs);
			if (newCreditNote != null)
				msgs = ((InternalEObject)newCreditNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pt1_01_2Package.REFERENCES_TYPE__CREDIT_NOTE, null, msgs);
			msgs = basicSetCreditNote(newCreditNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.REFERENCES_TYPE__CREDIT_NOTE, newCreditNote, newCreditNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pt1_01_2Package.REFERENCES_TYPE__CREDIT_NOTE:
				return basicSetCreditNote(null, msgs);
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
			case Pt1_01_2Package.REFERENCES_TYPE__CREDIT_NOTE:
				return getCreditNote();
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
			case Pt1_01_2Package.REFERENCES_TYPE__CREDIT_NOTE:
				setCreditNote((CreditNoteType)newValue);
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
			case Pt1_01_2Package.REFERENCES_TYPE__CREDIT_NOTE:
				setCreditNote((CreditNoteType)null);
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
			case Pt1_01_2Package.REFERENCES_TYPE__CREDIT_NOTE:
				return creditNote != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferencesTypeImpl
