package pt.ktc.openk.pos.panels;

import java.util.Date;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.SerializableRead;
import com.openbravo.format.Formats;

public class ProductsSalesInfo implements SerializableRead {
	    
	    private String reference;
	    private String name;
	    private double pvpunit;
	    private int units;
	    private double totalpvp;
	    
	    /** Creates new ProductsSalesInfo */
	    public ProductsSalesInfo() {
	        
	    }
	    
	    @Override
	    public void readValues(DataRead dr) throws BasicException {
	        
	        reference = dr.getString(1);
	        name = dr.getString(2);
	        pvpunit = dr.getDouble(3);
	        units = dr.getInt(4);
	        totalpvp = dr.getDouble(5);
	    }
	    	    
	    public String getReference(){
	        return this.reference;
	    }

	    public String getName(){
	        return this.name;
	    }
	    
	    public double getPVPUnit(){
	        return this.pvpunit;
	    }
	    
	    public int getUnits(){
	        return this.units;
	    }
	    
	    public double getTotalPVP(){
	        return this.totalpvp;
	    }
	    
	    //----------
	    public String printReference(){
	        return getReference();
	    }

	    public String printName(){
	        return getName();
	    }

	    public String printUnits() {
            return Formats.DOUBLE.formatValue(getUnits());
	    }

	    public String printPVPUnit() {
	        return Formats.CURRENCY.formatValue(getPVPUnit());
	    }
	    
	    public String printTotalPVP() {
	        return Formats.CURRENCY.formatValue(getTotalPVP());
	    }
	    
	}
