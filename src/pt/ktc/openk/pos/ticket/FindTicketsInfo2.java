package pt.ktc.openk.pos.ticket;

import com.openbravo.data.loader.DataRead;
import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.SerializableRead;
import com.openbravo.format.Formats;
import java.util.Date;

public class FindTicketsInfo2 implements SerializableRead {

	private int tickettype;	
	private int ticketid;
	private Date invoicedate;
	private Date systementrydate;
	private String invoiceNo;
	private double total;
	private String reference;

	public FindTicketsInfo2() {
	}

	@Override
	public void readValues(DataRead dr) throws BasicException {
		
		// TICKETTYPE, TICKETID, INVOICEDATE, SYSTEMENTRYDATE, INVOICENO, GROSSTOTAL, REFERENCE
		tickettype = dr.getInt(1);
		ticketid = dr.getInt(2);
		invoicedate = dr.getTimestamp(3);
		systementrydate = dr.getTimestamp(4);
		invoiceNo = dr.getString(5);
		total = (dr.getObject(6) == null) ? 0.0 : dr.getDouble(6).doubleValue();
		reference = dr.getString(7);
	}

	@Override
	public String toString() {

		String sReference = (reference == null) ? "" : reference;

		String sHtml = "<tr><td width=\"30\">" + "[" + tickettype + " - "+ ticketid + "]" + "</td>"
				+ "<td width=\"100\">" + Formats.TIMESTAMP.formatValue(invoicedate)
				+ " - " + Formats.TIMESTAMP.formatValue(systementrydate)
				+ "</td>" + "<td align=\"center\" width=\"100\">" + sReference
				+ "</td>" + "<td align=\"right\" width=\"100\">"
				+ Formats.CURRENCY.formatValue(total) + "</td>"
				+ "<td width=\"100\">" + Formats.STRING.formatValue(invoiceNo)
				+ "</td></tr>";

		return sHtml;
	}

	public int getTicketId() {
		return this.ticketid;
	}

	public int getTicketType() {
		return this.tickettype;
	}
	
	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	
	public String getReference() {
		return this.reference;
	}
}