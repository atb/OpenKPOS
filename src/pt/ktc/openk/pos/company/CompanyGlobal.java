/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.company;

public class CompanyGlobal {
	
	private CompanyGlobal() {
		
	}
	
	private static CompanyGlobal instance=null;
	
	public static CompanyGlobal getCompanyGlobal() {
		if (instance==null) instance=new CompanyGlobal();
		return instance;
	}
	
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
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String _denomination) {
		this.denomination = _denomination;
	}
	public String getInstallation() {
		return installation;
	}
	public void setInstallation(String _installation) {
		this.installation = _installation;
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
    private String denomination;
    private String installation;
    
    // Para ter o acesso a aplicacao global
    private com.openbravo.pos.forms.JRootApp m_App;
    
    public void setJRootApp(com.openbravo.pos.forms.JRootApp app) {
    	m_App=app;
    }
    
    public com.openbravo.pos.forms.JRootApp getJRootApp() {
    	return m_App;
    }
}
