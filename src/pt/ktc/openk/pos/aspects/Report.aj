/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperPrint;
import java.util.Map;

import pt.ktc.openk.pos.company.CompanyGlobal;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;
import net.sf.jasperreports.engine.JRDataSource;
import com.openbravo.pos.reports.JPanelReport;

public privileged aspect Report {
	
	//                 reportparams.put("Empresa", "OLA");   	// ATB

	// Para acrescentar os dados da empresa antes de invocar o report
	
    pointcut callFillReport(JasperReport rep, Map map, JRDataSource ds) : within(JPanelReport) && args(rep, map, ds) && call(* *.fillReport(JasperReport, Map, JRDataSource));

    JasperPrint around(JasperReport rep, Map map, JRDataSource ds) : callFillReport(rep, map, ds) {
    	//System.out.println("report!!!!!");
    	CompanyGlobal company=CompanyGlobal.getCompanyGlobal();
    	map.put(StringConstants.getString(StringEnumerates.Empresa), company.getName());
    	map.put(StringConstants.getString(StringEnumerates.Endereco), company.getAddress());
    	map.put(StringConstants.getString(StringEnumerates.Postal), company.getPostal());
    	map.put(StringConstants.getString(StringEnumerates.Cidade), company.getCity());
    	map.put(StringConstants.getString(StringEnumerates.NIF), company.getTaxID());  
    	
    	// (ATB)(2013-01-25) Acrescentei informmacao adicional:
    	// # customer.denomination
    	map.put(StringConstants.getString(StringEnumerates.Denomination), company.getDenomination());  
    	// # customer.installation
    	map.put(StringConstants.getString(StringEnumerates.Installation), company.getInstallation()); 
    	
    	// Falta passar os dados que identificam a versao da aplicacao certificada...
    	// 	 pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_NAME+StringConstants.getString(StringEnumerates._v)+pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_CODE_VERSION+StringConstants.getString(StringEnumerates.___Software_Certificado_n_1345_DGCI___www_ktc_pt_openk___more));       
    	map.put(StringConstants.getString(StringEnumerates.ApplicationInfoString), pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_NAME
    					+StringConstants.getString(StringEnumerates._v)
    					+pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_CODE_VERSION
    					+StringConstants.getString(StringEnumerates.___Software_Certificado_n_1345_DGCI___www_ktc_pt_openk___more));       
    	
    	return proceed(rep, map, ds);
	}
}
