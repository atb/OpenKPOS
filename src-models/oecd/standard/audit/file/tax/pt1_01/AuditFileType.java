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
 * A representation of the model object '<em><b>Audit File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.AuditFileType#getHeader <em>Header</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.AuditFileType#getMasterFiles <em>Master Files</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.AuditFileType#getGeneralLedgerEntries <em>General Ledger Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.AuditFileType#getSourceDocuments <em>Source Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getAuditFileType()
 * @model extendedMetaData="name='AuditFile_._type' kind='elementOnly'"
 * @generated
 */
public interface AuditFileType extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HeaderType)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getAuditFileType_Header()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderType getHeader();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.AuditFileType#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(HeaderType value);

	/**
	 * Returns the value of the '<em><b>Master Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Files</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Files</em>' containment reference.
	 * @see #setMasterFiles(MasterFilesType)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getAuditFileType_MasterFiles()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MasterFiles' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterFilesType getMasterFiles();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.AuditFileType#getMasterFiles <em>Master Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Files</em>' containment reference.
	 * @see #getMasterFiles()
	 * @generated
	 */
	void setMasterFiles(MasterFilesType value);

	/**
	 * Returns the value of the '<em><b>General Ledger Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Ledger Entries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Ledger Entries</em>' containment reference.
	 * @see #setGeneralLedgerEntries(GeneralLedgerEntriesType)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getAuditFileType_GeneralLedgerEntries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GeneralLedgerEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralLedgerEntriesType getGeneralLedgerEntries();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.AuditFileType#getGeneralLedgerEntries <em>General Ledger Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Ledger Entries</em>' containment reference.
	 * @see #getGeneralLedgerEntries()
	 * @generated
	 */
	void setGeneralLedgerEntries(GeneralLedgerEntriesType value);

	/**
	 * Returns the value of the '<em><b>Source Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Documents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Documents</em>' containment reference.
	 * @see #setSourceDocuments(SourceDocumentsType)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getAuditFileType_SourceDocuments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SourceDocuments' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceDocumentsType getSourceDocuments();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.AuditFileType#getSourceDocuments <em>Source Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Documents</em>' containment reference.
	 * @see #getSourceDocuments()
	 * @generated
	 */
	void setSourceDocuments(SourceDocumentsType value);

} // AuditFileType
