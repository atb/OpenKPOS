/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.tools;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import javax.swing.*;

import pt.ktc.openk.pos.aspects.AppLocal;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.pos.forms.AppProperties;
import com.openbravo.pos.forms.AppUser;
import com.openbravo.pos.forms.AppUserView;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.AppViewConnection;
import com.openbravo.pos.forms.BeanFactory;
import com.openbravo.pos.forms.BeanFactoryApp;
import com.openbravo.pos.forms.BeanFactoryException;
import com.openbravo.pos.forms.BeanFactoryObj;
import com.openbravo.pos.forms.BeanFactoryScript;
import com.openbravo.pos.forms.JPrincipalApp;
import com.openbravo.pos.printer.*;

import com.openbravo.beans.*;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.gui.JMessageDialog;
import com.openbravo.data.loader.BatchSentence;
import com.openbravo.data.loader.BatchSentenceResource;
import com.openbravo.data.loader.Session;
import com.openbravo.pos.scale.DeviceScale;
import com.openbravo.pos.scanpal2.DeviceScanner;
import com.openbravo.pos.scanpal2.DeviceScannerFactory;
import java.sql.SQLException;
import java.util.Locale;
import java.util.regex.Matcher;


public class JRootAppUpdateDatabase extends JPanel implements AppView {

private AppProperties m_props;
private Session session;     
private com.openbravo.pos.forms.DataLogicSystem m_dlSystem;

private Properties m_propsdb = null;
private String m_sActiveCashIndex;
private int m_iActiveCashSequence;
private Date m_dActiveCashDateStart;
private Date m_dActiveCashDateEnd;

private String m_sInventoryLocation;

private StringBuffer inputtext;

private DeviceScale m_Scale;
private DeviceScanner m_Scanner;
private DeviceTicket m_TP;   
private TicketParser m_TTP;

private Map<String, BeanFactory> m_aBeanFactories;

private JPrincipalApp m_principalapp = null;

private static HashMap<String, String> m_oldclasses; // This is for backwards compatibility purposes

static {        
  initOldClasses();
}

/** Creates new form JRootApp */
public JRootAppUpdateDatabase() {    

  m_aBeanFactories = new HashMap<String, BeanFactory>();
  
  // Inicializo los componentes visuales
  //initComponents ();            
  //jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(35, 35));   
}

public boolean initApp(AppProperties props) {
  
  m_props = props;
  //setPreferredSize(new java.awt.Dimension(800, 600));

  // support for different component orientation languages.
  applyComponentOrientation(ComponentOrientation.getOrientation(Locale.getDefault()));
  
  // Database start
  try {
      session = AppViewConnection.createSession(m_props);
  } catch (BasicException e) {
      JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_DANGER, e.getMessage(), e));
      return false;
  }

  //m_dlSystem = (com.openbravo.pos.forms.DataLogicSystem) getBean("com.openbravo.pos.forms.DataLogicSystem"); 
  m_dlSystem = (com.openbravo.pos.forms.DataLogicSystem) getBean(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_forms_DataLogicSystem));
  
  // Create or upgrade the database if database version is not the expected
  String sDBVersion = readDataBaseVersion();        
  if (!AppLocal.OPENKPOS_APP_VERSION.equals(sDBVersion)) {

	  JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_DANGER, sDBVersion == null
              ? StringConstants.getString(StringEnumerates.A_base_de_dados_nao_existe_) // Create script does not exists. Database not supported
              : StringConstants.getString(StringEnumerates.A_versao_da_base_de_dados_nao_esta_correcta))); // Upgrade script does not exist.

	  session.close();
          return false;
  }
  
  // Cargamos las propiedades de base de datos
  m_propsdb = m_dlSystem.getResourceAsProperties(m_props.getHost() + StringConstants.getString(StringEnumerates._properties));
  
  // Aqui vamos executar a actualizacao:
  String sScript = m_dlSystem.getInitScript() + StringConstants.getString(StringEnumerates._update_sql);
  
  try {
      BatchSentence bsentence = new BatchSentenceResource(session, sScript);
      bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_ID), Matcher.quoteReplacement(AppLocal.OPENKPOS_APP_ID));
      bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_NAME), Matcher.quoteReplacement(AppLocal.OPENKPOS_APP_NAME));
      bsentence.putParameter(StringConstants.getString(StringEnumerates.APP_VERSION), Matcher.quoteReplacement(AppLocal.OPENKPOS_APP_VERSION));

      java.util.List l = bsentence.list();
      if (l.size() > 0) {
          JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_WARNING, com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.Database_ScriptWarning)), l.toArray(new Throwable[l.size()])));
      }
 } catch (BasicException e) {
      JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_DANGER, com.openbravo.pos.forms.AppLocal.getIntString(StringConstants.getString(StringEnumerates.Database_ScriptError)), e));
      session.close();
      return false;
  }     
  
  MessageInf msg = new MessageInf(MessageInf.SGN_NOTICE, StringConstants.getString(StringEnumerates.Actualizacao_executada), StringConstants.getString(StringEnumerates.Mensagem));
  msg.show(this);
  session.close();
  return false;
}

private String readDataBaseVersion() {
  try {
      return m_dlSystem.findVersion();
  } catch (BasicException ed) {
      return null;
  }
}

public Object getBean(String beanfactory) throws BeanFactoryException {
  
  // For backwards compatibility
  beanfactory = mapNewClass(beanfactory);
  
  
  BeanFactory bf = m_aBeanFactories.get(beanfactory);
  if (bf == null) {   
      
      // testing sripts
      if (beanfactory.startsWith(StringConstants.getString(StringEnumerates._slash))) {
          bf = new BeanFactoryScript(beanfactory);               
      } else {
          // Class BeanFactory
          try {
              Class bfclass = Class.forName(beanfactory);

              if (BeanFactory.class.isAssignableFrom(bfclass)) {
                  bf = (BeanFactory) bfclass.newInstance();             
              } else {
                  // the old construction for beans...
                  Constructor constMyView = bfclass.getConstructor(new Class[] {AppView.class});
                  Object bean = constMyView.newInstance(new Object[] {this});

                  bf = new BeanFactoryObj(bean);
              }

          } catch (Exception e) {
              // ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
              throw new BeanFactoryException(e);
          }
      }
      
      // cache the factory
      m_aBeanFactories.put(beanfactory, bf);         
      
      // Initialize if it is a BeanFactoryApp
      if (bf instanceof BeanFactoryApp) {
          ((BeanFactoryApp) bf).init(this);
      }
  }
  return bf.getBean();
}

private static String mapNewClass(String classname) {
    String newclass = m_oldclasses.get(classname);
    return newclass == null 
            ? classname 
            : newclass;
}

private static void initOldClasses() {
    m_oldclasses = new HashMap<String, String>();
    
    // update bean names from 2.00 to 2.20    
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportCustomers), StringConstants.getString(StringEnumerates._com_openbravo_reports_customers_bs));
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportCustomersB), StringConstants.getString(StringEnumerates._com_openbravo_reports_customersb_bs));
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportClosedPos), StringConstants.getString(StringEnumerates._com_openbravo_reports_closedpos_bs));
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportClosedProducts), StringConstants.getString(StringEnumerates._com_openbravo_reports_closedproducts_bs));
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JChartSales), StringConstants.getString(StringEnumerates._com_openbravo_reports_chartsales_bs));
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportInventory), StringConstants.getString(StringEnumerates._com_openbravo_reports_inventory_bs));
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportInventory2), StringConstants.getString(StringEnumerates._com_openbravo_reports_inventoryb_bs));
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportInventoryBroken), StringConstants.getString(StringEnumerates._com_openbravo_reports_inventorybroken_bs));
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportInventoryDiff), StringConstants.getString(StringEnumerates._com_openbravo_reports_inventorydiff_bs));
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportPeople), StringConstants.getString(StringEnumerates._com_openbravo_reports_people_bs));
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportTaxes), StringConstants.getString(StringEnumerates._com_openbravo_reports_taxes_bs));
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportUserSales), StringConstants.getString(StringEnumerates._com_openbravo_reports_usersales_bs));
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportProducts), StringConstants.getString(StringEnumerates._com_openbravo_reports_products_bs));
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_reports_JReportCatalog), StringConstants.getString(StringEnumerates._com_openbravo_reports_productscatalog_bs));
    
    // update bean names from 2.10 to 2.20
    m_oldclasses.put(StringConstants.getString(StringEnumerates.com_openbravo_pos_panels_JPanelTax), StringConstants.getString(StringEnumerates.com_openbravo_pos_inventory_TaxPanel));
   
}

@Override
public DeviceScale getDeviceScale() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public DeviceTicket getDeviceTicket() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public DeviceScanner getDeviceScanner() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Session getSession() {
	// TODO Auto-generated method stub
    return session;
}

@Override
public AppProperties getProperties() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setActiveCash(String value, int iSeq, Date dStart, Date dEnd) {
	// TODO Auto-generated method stub
	
}

@Override
public String getActiveCashIndex() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int getActiveCashSequence() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public Date getActiveCashDateStart() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Date getActiveCashDateEnd() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getInventoryLocation() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void waitCursorBegin() {
	// TODO Auto-generated method stub
	
}

@Override
public void waitCursorEnd() {
	// TODO Auto-generated method stub
	
}

@Override
public AppUserView getAppUserView() {
	// TODO Auto-generated method stub
	return null;
}

}

