package pt.ktc.openk.pos.aspects;

import pt.ktc.openk.pos.utils.HardCodedConstants;

public aspect AladinAspect {
	
	// Este aspecto tem por objectivo dificultar a identificacao da chave de abertura do ficheiro openk_pos_services.properties
	// para isso ele insere paddings antes e depois da chave....
	
	pointcut newOpenKChiper(String chave) : within(pt.ktc.openk.pos.utils.ServiceProperties) && args(chave) && call(public pt.ktc.openk.pos.utils.OpenKCipher.new(String));

	// after (com.openbravo.pos.forms.AppConfig config): loadConfig(config)  {
	pt.ktc.openk.pos.utils.OpenKCipher around (String chave): newOpenKChiper(chave) {
		
		String nova_chave=HardCodedConstants.getHardCodedString(HardCodedConstants.openk_aladin_pre)+chave+HardCodedConstants.getHardCodedString(HardCodedConstants.openk_aladin_pos);
		
		return proceed(nova_chave);
	}

}
