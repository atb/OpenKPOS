/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.aspects;

import com.openbravo.pos.forms.AppProperties;

public aspect ValidaInstalacaoAspect {
	
	static ValidaInstalacao validador=null;
	static ValidaLicenca validadorLicenca=null;
	static ValidaCliente validadorCliente=null;

	//pointcut callJRootFrameInitFrame(): call(public void com.openbravo.pos.forms.JRootKiosk.initFrame(AppProperties)) || call(public void com.openbravo.pos.forms.JRootFrame.initFrame(AppProperties));
	pointcut callJRootFrameInitFrame(AppProperties props): (call(public void com.openbravo.pos.forms.JRootKiosk.initFrame(AppProperties)) || call(public void com.openbravo.pos.forms.JRootFrame.initFrame(AppProperties))) && args(props);

	after(AppProperties props): callJRootFrameInitFrame(props) {
//		if (validador==null) {
//			validador=new ValidaInstalacao();
//			
//			Thread t=new Thread(validador);
//			t.start();
//		}
		if (validadorLicenca==null) {
			validadorLicenca=new ValidaLicenca();
			
			Thread t=new Thread(validadorLicenca);
			t.start();
		}
		if (validadorCliente==null) {
			validadorCliente=new ValidaCliente(props);
			
			Thread t=new Thread(validadorCliente);
			t.start();
		}

		
	}

}
