package pt.ktc.openk.pos.panels;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import com.openbravo.format.Formats;

import pt.ktc.openk.pos.company.CompanyGlobal;

public class ProductSalesReportInfo {
	
    private Date date1;
    private Date date2;
	private List<ProductsSalesInfo> sales;
	  
	public ProductSalesReportInfo() {
		sales=new ArrayList<ProductsSalesInfo>();
		date1=new Date();
		date2=new Date();
	}
	
	public void setSales(List<ProductsSalesInfo> s) {
		sales=s;
	}
	
	public List<ProductsSalesInfo> getSales() {
		return sales;
	}
	
	public String getCompanyName() {
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getName();
	}
    public String printCompanyName() {
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getName();
    }

	public String getCompanyAddress() {
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getAddress();
	}
    public String printCompanyAddress() {
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getAddress();
    }

	public String getCompanyTaxID() {
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getTaxID();
	}
    public String printCompanyTaxID() {
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getTaxID();
    }

	public String getCompanyPostal() {
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getPostal();
	}
    public String printCompanyPostal() {
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getPostal();
    }

	public String getCompanyCity() {
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getCity();
	}
    public String printCompanyCity() {
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getCity();
    }

	public String getCompanyDenomination() {
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getDenomination();
	}
    public String printCompanyDenomination() {
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getDenomination();
    }
    
	public String getCompanyInstallation() {
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getInstallation();
	}
    public String printCompanyInstallation() {
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
		return cg.getInstallation();
    }

  
    public void setDate1(Date d1) {
    	date1=d1;
    }
    
    public Date getDate1() {
    	return date1;
    }
    
    public String printDate1() {
        return Formats.TIMESTAMP.formatValue(date1);
    }
    
    public void setDate2(Date d2) {
    	date2=d2;
    }
    
    public Date getDate2() {
    	return date2;
    }
 
    public String printDate2() {
        return Formats.TIMESTAMP.formatValue(date2);
    }

}
