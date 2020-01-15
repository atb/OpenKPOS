/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.company;

import java.util.Date;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.SerializableRead;
import com.openbravo.format.Formats;

public class Company implements SerializableRead {

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTaxID() {
		return taxID;
	}
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getBusinessRegistration() {
		return businessRegistration;
	}
	public void setBusinessRegistration(String businessRegistration) {
		this.businessRegistration = businessRegistration;
	}
	private String id;
    private String name;
    private String address;
    private String taxID;
    private String postal;
    private String city;
    private String region;
    private String country;
    private String businessRegistration;
    
	@Override
	public void readValues(DataRead dr) throws BasicException {
        id = dr.getString(1);
        name = dr.getString(2);
        address = dr.getString(3);
        taxID = dr.getString(4);
        postal = dr.getString(5);
        city = dr.getString(6);
        region =dr.getString(7);
        country = dr.getString(8);
        businessRegistration = dr.getString(9);
	}
}
