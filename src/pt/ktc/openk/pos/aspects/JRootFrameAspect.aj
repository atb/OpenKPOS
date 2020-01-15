/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import pt.ktc.openk.pos.company.Company;
import pt.ktc.openk.pos.company.CompanyGlobal;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.forms.JRootFrame;
import com.openbravo.pos.forms.JRootApp;

public privileged aspect JRootFrameAspect {
	
	pointcut createJRootApp(): within(JRootFrame) && call(JRootApp.new());

	// Para usarmos a nossa propria janela inicial
	JRootApp around(): createJRootApp() {
		pt.ktc.openk.pos.forms.JRootApp app=new pt.ktc.openk.pos.forms.JRootApp();
		
		//System.out.println("new JRootApp");
		
		return app;
	}
	
	pointcut loadResource(java.lang.Class claz, String res_name) : within(com.openbravo.pos.forms.JRootApp) && target(claz) && args(res_name) && call(* *.getResource(String));

	java.net.URL around (java.lang.Class claz, String res_name): loadResource(claz, res_name)  {
		if (StringConstants.getString(StringEnumerates._com_openbravo_images_logo_png).equals(res_name))
		{
			java.net.URL url=claz.getResource(StringConstants.getString(StringEnumerates._pt_ktc_openk_pos_images_openkpos_logo_png));
			return url;
		}
		return proceed(claz, res_name);
	}
	
	pointcut getResourceAsStream(java.lang.Class claz, String res_name) : within(com.openbravo.pos.forms.JRootFrame) && target(claz) && args(res_name) && call(* *.getResourceAsStream(String));

	java.io.InputStream around (java.lang.Class claz, String res_name): getResourceAsStream(claz, res_name)  {
		if (StringConstants.getString(StringEnumerates._com_openbravo_images_favicon_png).equals(res_name))
		{
			//java.io.InputStream input=claz.getResourceAsStream("/pt/ktc/openk/pos/images/openk_favicon.png");
			java.io.InputStream input=claz.getResourceAsStream(StringConstants.getString(StringEnumerates._pt_ktc_openk_pos_images_openk_favicon_large_png));
			return input;
		}
		return proceed(claz, res_name);
	}

	
	pointcut setText(javax.swing.JLabel label, String text) : within(com.openbravo.pos.forms.JRootApp) && target(label) && args(text) && call(* *.setText(String));
	
	void around (javax.swing.JLabel label, String text): setText(label, text)  {
		if (text.regionMatches(0, StringConstants.getString(StringEnumerates._html__center_Openbravo_POS_is), 0, 30))
		{
		    label.setText(StringConstants.getString(StringEnumerates.aviso_entrada_1)+
		    		StringConstants.getString(StringEnumerates.aviso_entrada_2)+
		    		StringConstants.getString(StringEnumerates.aviso_entrada_3)+
		    		StringConstants.getString(StringEnumerates.aviso_entrada_4)+
		    		StringConstants.getString(StringEnumerates.aviso_entrada_5)+
		    		StringConstants.getString(StringEnumerates.aviso_entrada_6)+
		    		StringConstants.getString(StringEnumerates.aviso_entrada_7)+
		    		StringConstants.getString(StringEnumerates.aviso_entrada_8)+
		    		StringConstants.getString(StringEnumerates.aviso_entrada_9)+
		    		StringConstants.getString(StringEnumerates.aviso_entrada_10)+
		    		StringConstants.getString(StringEnumerates.aviso_entrada_11)+
		    		StringConstants.getString(StringEnumerates.aviso_entrada_12)+
		    		StringConstants.getString(StringEnumerates.aviso_entrada_13)+
		    		StringConstants.getString(StringEnumerates.aviso_entrada_14)+
		    		StringConstants.getString(StringEnumerates.aviso_entrada_15));
		    return;
			
		}
//		if (text.regionMatches(0, "<html>", 0, 6)) {
//		    label.setText("<html>OpenK POS v1.0<br>" +
//		            "www.ktc.pt/~openk / tel: 256184931");
//		    return;
//		}
		proceed(label, text);
	}
	
	pointcut setTitle(com.openbravo.pos.forms.JRootFrame frame) : within(com.openbravo.pos.forms.JRootFrame) && target(frame) && call(* *.setTitle(String));
	
	void around (com.openbravo.pos.forms.JRootFrame frame): setTitle(frame)  {
		//frame.setTitle("OpenK POS 1.0");
		frame.setTitle(pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_NAME+StringConstants.getString(StringEnumerates._minus_)+pt.ktc.openk.pos.aspects.AppLocal.OPENKPOS_APP_CODE_VERSION);
	}
	
	// O seguinte pointcut e advice sao desnecessarios agora
//         m_dlSystem = (DataLogicSystem) getBean("com.openbravo.pos.forms.DataLogicSystem");	
	pointcut getBean(com.openbravo.pos.forms.JRootApp app, String bean) : within(com.openbravo.pos.forms.JRootApp) && target(app) && args(bean) && call(* *.getBean(String));
	
	Object around (com.openbravo.pos.forms.JRootApp app, String bean): getBean(app, bean)  {
		if (bean.equals(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSystem)))
		{
			//System.out.println("pt.ktc.openk.pos.forms.DataLogicSystem");
			
			pt.ktc.openk.pos.forms.DataLogicSystem dls=(pt.ktc.openk.pos.forms.DataLogicSystem)app.getBean(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_forms_DataLogicSystem));

			return dls;
		}
		return proceed(app, bean);
	}
	
}
