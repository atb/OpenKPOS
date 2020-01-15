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

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.JMessageDialog;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.loader.BatchSentence;
import com.openbravo.data.loader.BatchSentenceResource;
//import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppProperties;
import com.openbravo.pos.forms.AppViewConnection;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.forms.JRootApp;
import com.openbravo.pos.printer.DeviceTicket;
import com.openbravo.pos.printer.TicketParser;
import com.openbravo.pos.scale.DeviceScale;
import com.openbravo.pos.scanpal2.DeviceScannerFactory;

// priviledge permite aceder a membros privados das classes.
public privileged aspect AppLocal {
	
    public static String OPENKPOS_APP_NAME = "OpenK POS";
    public static String OPENKPOS_APP_ID = "openkpos";
    public static String OPENKPOS_APP_VERSION = "1.0";			// Esta e a versao da base de dados
    public static String OPENKPOS_APP_CODE_VERSION = "1.2.700";		// Esta e a versao do codigo
    	
	pointcut addBundleName(com.openbravo.beans.LocaleResources lr, String res_name) : within(com.openbravo.pos.forms.AppLocal) && target(lr) && args(res_name) && call(* *.addBundleName(String));

	void around (com.openbravo.beans.LocaleResources lr, String res_name): addBundleName(lr, res_name)  {
		if (StringConstants.getString(StringEnumerates.pos_messages).equals(res_name))
		{
			lr.addBundleName(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_locales_pos_messages_pt));
			return;
		}
		proceed(lr, res_name);
	}
	
}
