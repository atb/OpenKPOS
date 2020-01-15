package pt.ktc.openk.pos.aspects;

import java.io.File;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import pt.ktc.openk.pos.utils.ServiceProperties;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.data.loader.LocalRes;
import com.openbravo.format.Formats;

// Este aspecto tem como objectivo centralizar as necessidades especificas do arranque da apicacao
// Em particular as relacionadas com a licenca do servico
public aspect StartAspect {
	
	private final static Logger LOGGER = Logger.getLogger(StartAspect.class.getName());

	pointcut loadConfig(com.openbravo.pos.forms.AppConfig config) : within(pt.ktc.openk.pos.forms.StartOpenKPOS) && target(config) && call(* *.load());

	after (com.openbravo.pos.forms.AppConfig config): loadConfig(config)  {

		// Inciar pela leitura e activacao dos dadoa da licenca!!!
		
        // (ATB)(2012-11-20) Vamos testar a leitura do ficheiro de propriedades da licenca
        String taxid=config.getProperty(StringConstants.getString(StringEnumerates.customer_taxid));
        String customer_name=config.getProperty(StringConstants.getString(StringEnumerates.customer_name));
        ServiceProperties.init(config, taxid, customer_name);
        
        // (ATB) Teste!!!!
        //System.out.println("DEBUG : <"+taxid+customer_name+">");
        //System.out.println(StartAspect.class.getName());
        // LOGGER.log(Level.INFO, "Taxid+customer_name= <"+taxid+customer_name+">");
        LOGGER.log(Level.INFO, StringConstants.getString(StringEnumerates.Taxid_customer_name___)+taxid+customer_name+StringConstants.getString(StringEnumerates._bigger_than));
        //System.out.println("DEBUG : <"+taxid+customer_name+">");
        // (ATB)
        

		// Alguns dos dados seguintes devemos ir buscar ao ficheiro de licenca
		
        // O driver tem de ser o do postgresql
        // A base de dados tambem e' fixa
        // String db_name=config.getProperty(StringConstants.getString(StringEnumerates.db_name));
		String db_name=ServiceProperties.getString(ServiceProperties.db_name);
		config.setProperty(StringConstants.getString(StringEnumerates.db_name), ServiceProperties.getString(ServiceProperties.db_name));

		String db_user=ServiceProperties.getString(ServiceProperties.db_user);
		config.setProperty(StringConstants.getString(StringEnumerates.db_user), ServiceProperties.getString(ServiceProperties.db_user));

		String db_password=ServiceProperties.getString(ServiceProperties.db_password);
		config.setProperty(StringConstants.getString(StringEnumerates.db_password), ServiceProperties.getString(ServiceProperties.db_password));

        // config.setProperty(StringConstants.getString(StringEnumerates.db_URL), StringConstants.getString(StringEnumerates.jdbc_postgresql___localhost_5432_)+db_name);
		String db_URL=ServiceProperties.getString(ServiceProperties.db_URL);
		config.setProperty(StringConstants.getString(StringEnumerates.db_URL), ServiceProperties.getString(ServiceProperties.db_URL));
        String dirname = System.getProperty(StringConstants.getString(StringEnumerates.dirname_path));
        dirname = dirname == null ? "./" : dirname;
        //config.setProperty(StringConstants.getString(StringEnumerates.db_driverlib), new File(new File(dirname), StringConstants.getString(StringEnumerates.postgresql_jdbc3_8_2_jar)).getAbsolutePath());
        String db_driverlib=new File(new File(dirname), ServiceProperties.getString(ServiceProperties.db_driverLib)).getAbsolutePath();
        config.setProperty(StringConstants.getString(StringEnumerates.db_driverlib), new File(new File(dirname), ServiceProperties.getString(ServiceProperties.db_driverLib)).getAbsolutePath());
        //config.setProperty(StringConstants.getString(StringEnumerates.db_driver), StringConstants.getString(StringEnumerates.org_postgresql_Driver));
        String db_driver=ServiceProperties.getString(ServiceProperties.db_driver);
        config.setProperty(StringConstants.getString(StringEnumerates.db_driver), ServiceProperties.getString(ServiceProperties.db_driver));
        
        // As seguintes configuracoes tem prioridade se vindas do ficheiro de configuracao dos servicos
        config.setProperty(StringConstants.getString(StringEnumerates.machine_uniqueinstance), ServiceProperties.getString(ServiceProperties.machine_uniqueinstance));
        config.setProperty(StringConstants.getString(StringEnumerates.machine_scale), ServiceProperties.getString(ServiceProperties.machine_scale));
        config.setProperty(StringConstants.getString(StringEnumerates.machine_scanner), ServiceProperties.getString(ServiceProperties.machine_scanner));
        config.setProperty(StringConstants.getString(StringEnumerates.machine_ticketsbag), ServiceProperties.getString(ServiceProperties.machine_ticketsbag));
        String machine_ticketsbag=ServiceProperties.getString(ServiceProperties.machine_ticketsbag);
        config.setProperty(StringConstants.getString(StringEnumerates.machine_screenmode), ServiceProperties.getString(ServiceProperties.machine_screenmode));
        config.setProperty(StringConstants.getString(StringEnumerates.machine_hostname), ServiceProperties.getString(ServiceProperties.machine_hostname));
        config.setProperty(StringConstants.getString(StringEnumerates.machine_display), ServiceProperties.getString(ServiceProperties.machine_display));
        config.setProperty(StringConstants.getString(StringEnumerates.machine_printername), ServiceProperties.getString(ServiceProperties.machine_printername));
        config.setProperty(StringConstants.getString(StringEnumerates.machine_printer), ServiceProperties.getString(ServiceProperties.machine_printer));
        //LOGGER.log(Level.INFO, "Machine.printer= <"+config.getProperty(StringConstants.getString(StringEnumerates.machine_printer))+">");        
        LOGGER.log(Level.INFO, StringConstants.getString(StringEnumerates.Machine_printer___)+config.getProperty(StringConstants.getString(StringEnumerates.machine_printer))+StringConstants.getString(StringEnumerates._bigger_than));        
        config.setProperty(StringConstants.getString(StringEnumerates.machine_printer_2), ServiceProperties.getString(ServiceProperties.machine_printer_2));
        config.setProperty(StringConstants.getString(StringEnumerates.machine_printer_3), ServiceProperties.getString(ServiceProperties.machine_printer_3));
        config.setProperty(StringConstants.getString(StringEnumerates.db_name), ServiceProperties.getString(ServiceProperties.db_name));

        // Se quisermos uma configuracao hardcoded 
        // AppConfigK config = new AppConfigK();
        
        // set Locale.
        String slang = config.getProperty(StringConstants.getString(StringEnumerates.user_language));
        String scountry = config.getProperty(StringConstants.getString(StringEnumerates.user_country));
        String svariant = config.getProperty(StringConstants.getString(StringEnumerates.user_variant));
        if (slang != null && !slang.equals("") && scountry != null && svariant != null) {                                        
            Locale.setDefault(new Locale(slang, scountry, svariant));
        }
        
        // Set the format patterns
        Formats.setIntegerPattern(config.getProperty(StringConstants.getString(StringEnumerates.format_integer)));
        Formats.setDoublePattern(config.getProperty(StringConstants.getString(StringEnumerates.format_double)));
        Formats.setCurrencyPattern(config.getProperty(StringConstants.getString(StringEnumerates.format_currency)));
        Formats.setPercentPattern(config.getProperty(StringConstants.getString(StringEnumerates.format_percent)));
        Formats.setDatePattern(config.getProperty(StringConstants.getString(StringEnumerates.format_date)));
        Formats.setTimePattern(config.getProperty(StringConstants.getString(StringEnumerates.format_time)));
        Formats.setDateTimePattern(config.getProperty(StringConstants.getString(StringEnumerates.format_datetime)));               

	}

}
