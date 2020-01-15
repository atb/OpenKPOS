/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import java.awt.ComponentOrientation;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import pt.ktc.openk.pos.company.Company;
import pt.ktc.openk.pos.company.CompanyGlobal;
import pt.ktc.openk.pos.utils.OpenKCipher;
import pt.ktc.openk.pos.utils.ServiceProperties;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.JMessageDialog;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.loader.BatchSentence;
import com.openbravo.data.loader.BatchSentenceResource;
import com.openbravo.data.loader.Session;
import com.openbravo.pos.forms.AppProperties;
import com.openbravo.pos.forms.AppViewConnection;
import com.openbravo.pos.printer.DeviceTicket;
import com.openbravo.pos.printer.TicketParser;
import com.openbravo.pos.scale.DeviceScale;
import com.openbravo.pos.scanpal2.DeviceScannerFactory;

public privileged aspect JRootApp {
	
    private javax.swing.JLabel servicedby;  // (ATB)
 	
    pointcut callInitApp(com.openbravo.pos.forms.JRootApp app, AppProperties props) : target(app) && args(props) && call(* *.initApp(AppProperties));

    boolean around(com.openbravo.pos.forms.JRootApp app, AppProperties props) : callInitApp(app, props) {
		return initApp(app, props);
	}

    public boolean initApp(com.openbravo.pos.forms.JRootApp app, AppProperties props) {
    	
    	//System.out.println("initApp do aspect!");
        
        app.m_props = props;
        //setPreferredSize(new java.awt.Dimension(800, 600));

        // support for different component orientation languages.
        app.applyComponentOrientation(ComponentOrientation.getOrientation(Locale.getDefault()));
        
        // Database start
        try {
            app.session = AppViewConnection.createSession(app.m_props);
        } catch (BasicException e) {
            JMessageDialog.showMessage(app, new MessageInf(MessageInf.SGN_DANGER, e.getMessage(), e));
            return false;
        }

        //app.m_dlSystem = (DataLogicSystem) app.getBean("com.openbravo.pos.forms.DataLogicSystem");
        app.m_dlSystem = (com.openbravo.pos.forms.DataLogicSystem) app.getBean(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_forms_DataLogicSystem));
        
        // Create or upgrade the database if database version is not the expected
        String sDBVersion = app.readDataBaseVersion();        
        //if (true) {
        if (!AppLocal.OPENKPOS_APP_VERSION.equals(sDBVersion)) {
    		JMessageDialog.showMessage(app, new MessageInf(MessageInf.SGN_DANGER, sDBVersion == null
    	              ? StringConstants.getString(StringEnumerates.A_base_de_dados_nao_existe_) // Create script does not exists. Database not supported
    	              : StringConstants.getString(StringEnumerates.A_versao_da_base_de_dados_nao_esta_correcta))); // Upgrade script does not exist.
        	
        	//JMessageDialog.showMessage(app, new MessageInf(MessageInf.SGN_DANGER, com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.A_base_de_dados_nao_e_compativel_com_a_versao_da_aplicacao___)), null));
        	app.session.close();
        	System.exit(-1);
        	return false;
        }
        
        // (ATB)(2012-04-11) Aqui deveriamos testar a password do Administrador e actualizar para a nova!
        // A nova password (a ser utilizada por quem da assistencia tecnica) e: 'openk2343'
        // (ATB)(2012-11-21) Vou desactivar os upgrades de base de dados. Devem ser feitos pelos novos "tools"
        //-------------------
        
        // Cargamos las propiedades de base de datos
        app.m_propsdb = app.m_dlSystem.getResourceAsProperties(app.m_props.getHost() + StringConstants.getString(StringEnumerates._backslash_properties));
        
        // creamos la caja activa si esta no existe      
        try {
            String sActiveCashIndex = app.m_propsdb.getProperty(StringConstants.getString(StringEnumerates.activecash));
            Object[] valcash = sActiveCashIndex == null
                    ? null
                    : app.m_dlSystem.findActiveCash(sActiveCashIndex);
            if (valcash == null || !app.m_props.getHost().equals(valcash[0])) {
                // no la encuentro o no es de mi host por tanto creo una...
                app.setActiveCash(UUID.randomUUID().toString(), app.m_dlSystem.getSequenceCash(app.m_props.getHost()) + 1, new Date(), null);

                // creamos la caja activa      
                app.m_dlSystem.execInsertCash(
                        new Object[] {app.getActiveCashIndex(), app.m_props.getHost(), app.getActiveCashSequence(), app.getActiveCashDateStart(), app.getActiveCashDateEnd()});                  
            } else {
                app.setActiveCash(sActiveCashIndex, (Integer) valcash[1], (Date) valcash[2], (Date) valcash[3]);
            }
        } catch (BasicException e) {
            // Casco. Sin caja no hay pos
            MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_cannotclosecash)), e);
            msg.show(app);
            app.session.close();
            return false;
        }  
        
        // Leo la localizacion de la caja (Almacen).
        app.m_sInventoryLocation = app.m_propsdb.getProperty(StringConstants.getString(StringEnumerates.location));
        if (app.m_sInventoryLocation == null) {
            app.m_sInventoryLocation = StringConstants.getString(StringEnumerates._0);
            app.m_propsdb.setProperty(StringConstants.getString(StringEnumerates.location), app.m_sInventoryLocation);
            app.m_dlSystem.setResourceAsProperties(app.m_props.getHost() + StringConstants.getString(StringEnumerates._backslash_properties), app.m_propsdb);
        }
        
        // Inicializo la impresora...
        app.m_TP = new DeviceTicket(app, app.m_props);
        
        // Inicializamos 
        app.m_TTP = new TicketParser(app.getDeviceTicket(), app.m_dlSystem);
        app.printerStart();
        
        // Inicializamos la bascula
        app.m_Scale = new DeviceScale(app, app.m_props);
        
        // Inicializamos la scanpal
        app.m_Scanner = DeviceScannerFactory.createInstance(app.m_props);
            
        // Leemos los recursos basicos
        BufferedImage imgicon = app.m_dlSystem.getResourceAsImage(StringConstants.getString(StringEnumerates.Window_Logo));
        app.m_jLblTitle.setIcon(imgicon == null ? null : new ImageIcon(imgicon));
        app.m_jLblTitle.setText(app.m_dlSystem.getResourceAsText(StringConstants.getString(StringEnumerates.Window_Title)));  
        
        // (ATB) (INICIO) Teste para colocar um logotipo no topo esquerdo do ecra
        servicedby = new javax.swing.JLabel();
        servicedby.setIcon(new javax.swing.ImageIcon(getClass().getResource(StringConstants.getString(StringEnumerates._pt_ktc_openk_pos_images_originalwork_png)))); // NOI18N
        servicedby.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
        app.m_jPanelTitle.add(servicedby, java.awt.BorderLayout.LINE_START);
        
        // (ATB) (FIM)
        
        String sWareHouse;
        try {
            sWareHouse = app.m_dlSystem.findLocationName(app.m_sInventoryLocation);
        } catch (BasicException e) {
            sWareHouse = null; // no he encontrado el almacen principal
        }        
        
        // Show Hostname, Warehouse and URL in taskbar
        String url;
        try {
            url = app.session.getURL();
        } catch (SQLException e) {
            url = "";
        }        
        // (ATB )app.m_jHost.setText("<html>" + app.m_props.getHost() + " - " + sWareHouse + "<br>" + url);
        // Nao vamos colocar o url da base de dados por questoes de seguranca!!!
	    app.m_jHost.setText(StringConstants.getString(StringEnumerates._html_Posto_) + app.m_props.getHost() + StringConstants.getString(StringEnumerates.___Armazem_) + sWareHouse + StringConstants.getString(StringEnumerates._br_)+pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_NAME+StringConstants.getString(StringEnumerates._v)+pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_CODE_VERSION+StringConstants.getString(StringEnumerates.___Software_Certificado_n_1345_DGCI___www_ktc_pt_openk___more));       
        
        //---------------------------------------
        // (ATB) Ir buscar os dados da empresa
        com.openbravo.pos.forms.DataLogicSales dlSales = (com.openbravo.pos.forms.DataLogicSales) app.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSales));
        
        CompanyGlobal cg=CompanyGlobal.getCompanyGlobal();
        Company cp;
		try {
			cp = dlSales.loadCompany();

			// (ATB)(2012-12-10) Devemos usar os dados que estao no ficheiro de servicos e nao os dados que estao na base de dados!!!!
//			  public static final int customer_nif=1;
//			  public static final int customer_name=2;
//			  public static final int customer_address=3;
//			  public static final int customer_zip_code=4;
//			  public static final int customer_city=5;
			cg.setTaxID(ServiceProperties.getString(ServiceProperties.customer_nif));
	        cg.setName(ServiceProperties.getString(ServiceProperties.customer_name));
			cg.setAddress(ServiceProperties.getString(ServiceProperties.customer_address));
	        cg.setBusinessRegistration(ServiceProperties.getString(ServiceProperties.customer_nif));
	        cg.setCity(ServiceProperties.getString(ServiceProperties.customer_city));
	        cg.setCountry(cp.getCountry());
	        cg.setId(cp.getId());
	        cg.setPostal(ServiceProperties.getString(ServiceProperties.customer_zip_code));
	        cg.setDenomination(ServiceProperties.getString(ServiceProperties.customer_denomination));
	        cg.setInstallation(ServiceProperties.getString(ServiceProperties.customer_installation));
	        
//			cg.setAddress(cp.getAddress());
//	        cg.setBusinessRegistration(cp.getBusinessRegistration());
//	        cg.setCity(cp.getCity());
//	        cg.setCountry(cp.getCountry());
//	        cg.setId(cp.getId());
//	        cg.setName(cp.getName());
//	        cg.setPostal(cp.getPostal());
//	        cg.setRegion(cp.getRegion());
//	        cg.setTaxID(cp.getTaxID());
	        
			// para aceder globalmente a aplicacao
			cg.setJRootApp(app);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			String a=StringConstants.getString(StringEnumerates._93C2D415253E8961C545D5D8FDF0EE0068102100F6025010A607CDACB6F01A5792A12DD12CBA8E6E84C4D8678E79EEC3D6604BB002BE2714DD3A55E5D1FAF171BB62F7A191CE4B75B95BDCC59209B63B1FEF931860A1122E);
			String b=StringConstants.getString(StringEnumerates.cypherkeyopenk);
			OpenKCipher enc = new OpenKCipher(b); 
			String c=enc.decrypt(a);
			
			// A mensagem cifrada
			// 93C2D415253E8961C545D5D8FDF0EE0068102100F6025010A607CDACB6F01A5792A12DD12CBA8E6E84C4D8678E79EEC3D6604BB002BE2714DD3A55E5D1FAF171BB62F7A191CE4B75B95BDCC59209B63B1FEF931860A1122E
			//JOptionPane.showMessageDialog(null, c+" (X)");
			JOptionPane.showMessageDialog(null, c+StringConstants.getString(StringEnumerates.__X_));

			System.exit(0);
		}
        //---------------------------------------
		
		// Alterar o titulo da aplicacao para incluir o nome da empresa certificada
        app.m_jLblTitle.setText(StringConstants.getString(StringEnumerates.Instalacao_do_OpenK_POS_certificada_pela_KTC_a_)+ cg.getName()); 
        
        app.showLogin();

        return true;
    }
    
}
