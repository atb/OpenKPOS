/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *
 * */
package pt.ktc.openk.pos.saft;

import java.util.Date;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.SerializableRead;

public class Signature implements SerializableRead {
	
    public String getId() {
		return id;
	}

	public void setId(String m_Id) {
		this.id = m_Id;
	}

	public int getTicketType() {
		return ticketType;
	}

	public void setTicketType(int m_TicketType) {
		this.ticketType = m_TicketType;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int m_TicketId) {
		this.ticketId = m_TicketId;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date m_InvoiceDate) {
		this.invoiceDate = m_InvoiceDate;
	}

	public Date getSystemEntryDate() {
		return systemEntryDate;
	}

	public void setSystemEntryDate(Date m_SystemEntryDate) {
		this.systemEntryDate = m_SystemEntryDate;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String m_InvoiceNo) {
		this.invoiceNo = m_InvoiceNo;
	}

	public double getGrossTotal() {
		return grossTotal;
	}

	public void setGrossTotal(double m_GrossTotal) {
		this.grossTotal = m_GrossTotal;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String m_Hash) {
		this.hash = m_Hash;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String m_Source) {
		this.source = m_Source;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String m_Signature) {
		this.signature = m_Signature;
	}

	public String getKeyVersion() {
		return keyVersion;
	}

	public void setkeyVersion(String m_KeyVersion) {
		this.keyVersion = m_KeyVersion;
	}

	public String getStamp() {
		return stamp;
	}

	public void setStamp(String m_Stamp) {
		this.stamp = m_Stamp;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String m_Reference) {
		this.reference = m_Reference;
	}

	private String id;
    private int ticketType;
    private int ticketId;
    private Date invoiceDate;
    private Date systemEntryDate;
    private String invoiceNo;
    private double grossTotal;
    private String hash;
    private String source;
    private String signature;
    private String keyVersion;
    private String stamp;
    private String reference;
	private String customerName;
	private String customerTaxID;
	private String customerAddress;
	private String CustomerPostal;
	private String CustomerCity;
	private String place;
	

	@Override
	public void readValues(DataRead dr) throws BasicException {
        id = dr.getString(1);
        ticketType = dr.getInt(2).intValue();
        ticketId= dr.getInt(3).intValue();
        invoiceDate = dr.getTimestamp(4);
        systemEntryDate=dr.getTimestamp(5);
        invoiceNo = dr.getString(6);
        grossTotal=dr.getDouble(7).doubleValue();
        hash = dr.getString(8);
        source = dr.getString(9);
        signature = dr.getString(10);
        keyVersion = dr.getString(11);
        stamp = dr.getString(12);
        reference = dr.getString(13);
    	customerName = dr.getString(14);
    	customerTaxID = dr.getString(15);
    	customerAddress = dr.getString(16);
    	CustomerPostal = dr.getString(17);
    	CustomerCity = dr.getString(18);
    	place = dr.getString(19);    	
   }

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerTaxID(String customerTaxID) {
		this.customerTaxID = customerTaxID;
	}

	public String getCustomerTaxID() {
		return customerTaxID;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerPostal(String customerPostal) {
		CustomerPostal = customerPostal;
	}

	public String getCustomerPostal() {
		return CustomerPostal;
	}

	public void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}

	public String getCustomerCity() {
		return CustomerCity;
	}

	public void setPlace(String _place) {
		place = _place;
	}

	public String getPlace() {
		return place;
	}
}
