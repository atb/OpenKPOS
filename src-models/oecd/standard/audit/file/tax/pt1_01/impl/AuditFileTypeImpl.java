/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01.impl;

import oecd.standard.audit.file.tax.pt1_01.AuditFileType;
import oecd.standard.audit.file.tax.pt1_01.GeneralLedgerEntriesType;
import oecd.standard.audit.file.tax.pt1_01.HeaderType;
import oecd.standard.audit.file.tax.pt1_01.MasterFilesType;
import oecd.standard.audit.file.tax.pt1_01.Pt1_01Package;
import oecd.standard.audit.file.tax.pt1_01.SourceDocumentsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit File Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.AuditFileTypeImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.AuditFileTypeImpl#getMasterFiles <em>Master Files</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.AuditFileTypeImpl#getGeneralLedgerEntries <em>General Ledger Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.AuditFileTypeImpl#getSourceDocuments <em>Source Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuditFileTypeImpl extends EObjectImpl implements AuditFileType {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected HeaderType header;

	/**
	 * The cached value of the '{@link #getMasterFiles() <em>Master Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterFiles()
	 * @generated
	 * @ordered
	 */
	protected MasterFilesType masterFiles;

	/**
	 * The cached value of the '{@link #getGeneralLedgerEntries() <em>General Ledger Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralLedgerEntries()
	 * @generated
	 * @ordered
	 */
	protected GeneralLedgerEntriesType generalLedgerEntries;

	/**
	 * The cached value of the '{@link #getSourceDocuments() <em>Source Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDocuments()
	 * @generated
	 * @ordered
	 */
	protected SourceDocumentsType sourceDocuments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditFileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pt1_01Package.Literals.AUDIT_FILE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeaderType newHeader, NotificationChain msgs) {
		HeaderType oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pt1_01Package.AUDIT_FILE_TYPE__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(HeaderType newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pt1_01Package.AUDIT_FILE_TYPE__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pt1_01Package.AUDIT_FILE_TYPE__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.AUDIT_FILE_TYPE__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterFilesType getMasterFiles() {
		return masterFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterFiles(MasterFilesType newMasterFiles, NotificationChain msgs) {
		MasterFilesType oldMasterFiles = masterFiles;
		masterFiles = newMasterFiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pt1_01Package.AUDIT_FILE_TYPE__MASTER_FILES, oldMasterFiles, newMasterFiles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterFiles(MasterFilesType newMasterFiles) {
		if (newMasterFiles != masterFiles) {
			NotificationChain msgs = null;
			if (masterFiles != null)
				msgs = ((InternalEObject)masterFiles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pt1_01Package.AUDIT_FILE_TYPE__MASTER_FILES, null, msgs);
			if (newMasterFiles != null)
				msgs = ((InternalEObject)newMasterFiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pt1_01Package.AUDIT_FILE_TYPE__MASTER_FILES, null, msgs);
			msgs = basicSetMasterFiles(newMasterFiles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.AUDIT_FILE_TYPE__MASTER_FILES, newMasterFiles, newMasterFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralLedgerEntriesType getGeneralLedgerEntries() {
		return generalLedgerEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralLedgerEntries(GeneralLedgerEntriesType newGeneralLedgerEntries, NotificationChain msgs) {
		GeneralLedgerEntriesType oldGeneralLedgerEntries = generalLedgerEntries;
		generalLedgerEntries = newGeneralLedgerEntries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pt1_01Package.AUDIT_FILE_TYPE__GENERAL_LEDGER_ENTRIES, oldGeneralLedgerEntries, newGeneralLedgerEntries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralLedgerEntries(GeneralLedgerEntriesType newGeneralLedgerEntries) {
		if (newGeneralLedgerEntries != generalLedgerEntries) {
			NotificationChain msgs = null;
			if (generalLedgerEntries != null)
				msgs = ((InternalEObject)generalLedgerEntries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pt1_01Package.AUDIT_FILE_TYPE__GENERAL_LEDGER_ENTRIES, null, msgs);
			if (newGeneralLedgerEntries != null)
				msgs = ((InternalEObject)newGeneralLedgerEntries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pt1_01Package.AUDIT_FILE_TYPE__GENERAL_LEDGER_ENTRIES, null, msgs);
			msgs = basicSetGeneralLedgerEntries(newGeneralLedgerEntries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.AUDIT_FILE_TYPE__GENERAL_LEDGER_ENTRIES, newGeneralLedgerEntries, newGeneralLedgerEntries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentsType getSourceDocuments() {
		return sourceDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceDocuments(SourceDocumentsType newSourceDocuments, NotificationChain msgs) {
		SourceDocumentsType oldSourceDocuments = sourceDocuments;
		sourceDocuments = newSourceDocuments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pt1_01Package.AUDIT_FILE_TYPE__SOURCE_DOCUMENTS, oldSourceDocuments, newSourceDocuments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDocuments(SourceDocumentsType newSourceDocuments) {
		if (newSourceDocuments != sourceDocuments) {
			NotificationChain msgs = null;
			if (sourceDocuments != null)
				msgs = ((InternalEObject)sourceDocuments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pt1_01Package.AUDIT_FILE_TYPE__SOURCE_DOCUMENTS, null, msgs);
			if (newSourceDocuments != null)
				msgs = ((InternalEObject)newSourceDocuments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pt1_01Package.AUDIT_FILE_TYPE__SOURCE_DOCUMENTS, null, msgs);
			msgs = basicSetSourceDocuments(newSourceDocuments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.AUDIT_FILE_TYPE__SOURCE_DOCUMENTS, newSourceDocuments, newSourceDocuments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pt1_01Package.AUDIT_FILE_TYPE__HEADER:
				return basicSetHeader(null, msgs);
			case Pt1_01Package.AUDIT_FILE_TYPE__MASTER_FILES:
				return basicSetMasterFiles(null, msgs);
			case Pt1_01Package.AUDIT_FILE_TYPE__GENERAL_LEDGER_ENTRIES:
				return basicSetGeneralLedgerEntries(null, msgs);
			case Pt1_01Package.AUDIT_FILE_TYPE__SOURCE_DOCUMENTS:
				return basicSetSourceDocuments(null, msgs);
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
			case Pt1_01Package.AUDIT_FILE_TYPE__HEADER:
				return getHeader();
			case Pt1_01Package.AUDIT_FILE_TYPE__MASTER_FILES:
				return getMasterFiles();
			case Pt1_01Package.AUDIT_FILE_TYPE__GENERAL_LEDGER_ENTRIES:
				return getGeneralLedgerEntries();
			case Pt1_01Package.AUDIT_FILE_TYPE__SOURCE_DOCUMENTS:
				return getSourceDocuments();
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
			case Pt1_01Package.AUDIT_FILE_TYPE__HEADER:
				setHeader((HeaderType)newValue);
				return;
			case Pt1_01Package.AUDIT_FILE_TYPE__MASTER_FILES:
				setMasterFiles((MasterFilesType)newValue);
				return;
			case Pt1_01Package.AUDIT_FILE_TYPE__GENERAL_LEDGER_ENTRIES:
				setGeneralLedgerEntries((GeneralLedgerEntriesType)newValue);
				return;
			case Pt1_01Package.AUDIT_FILE_TYPE__SOURCE_DOCUMENTS:
				setSourceDocuments((SourceDocumentsType)newValue);
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
			case Pt1_01Package.AUDIT_FILE_TYPE__HEADER:
				setHeader((HeaderType)null);
				return;
			case Pt1_01Package.AUDIT_FILE_TYPE__MASTER_FILES:
				setMasterFiles((MasterFilesType)null);
				return;
			case Pt1_01Package.AUDIT_FILE_TYPE__GENERAL_LEDGER_ENTRIES:
				setGeneralLedgerEntries((GeneralLedgerEntriesType)null);
				return;
			case Pt1_01Package.AUDIT_FILE_TYPE__SOURCE_DOCUMENTS:
				setSourceDocuments((SourceDocumentsType)null);
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
			case Pt1_01Package.AUDIT_FILE_TYPE__HEADER:
				return header != null;
			case Pt1_01Package.AUDIT_FILE_TYPE__MASTER_FILES:
				return masterFiles != null;
			case Pt1_01Package.AUDIT_FILE_TYPE__GENERAL_LEDGER_ENTRIES:
				return generalLedgerEntries != null;
			case Pt1_01Package.AUDIT_FILE_TYPE__SOURCE_DOCUMENTS:
				return sourceDocuments != null;
		}
		return super.eIsSet(featureID);
	}

} //AuditFileTypeImpl
