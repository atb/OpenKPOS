package pt.ktc.openk.pos.panels;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.loader.QBFCompareEnum;
import com.openbravo.data.loader.SentenceList;
import com.openbravo.format.Formats;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.forms.JPanelView;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.panels.PaymentsModel;
import com.openbravo.pos.printer.DeviceFiscalPrinter;
import com.openbravo.pos.printer.DevicePrinter;
import com.openbravo.pos.printer.DeviceTicket;
import com.openbravo.pos.printer.TicketParser;
import com.openbravo.pos.printer.TicketPrinterException;
import com.openbravo.pos.reports.JParamsDatesInterval;
import com.openbravo.pos.scripting.ScriptEngine;
import com.openbravo.pos.scripting.ScriptException;
import com.openbravo.pos.scripting.ScriptFactory;


/*
 * A QUERY PARA OBTER A LISTAGEM DOS PRODUTOS VENDIDOS
 * 
SELECT PRODUCTS.REFERENCE, PRODUCTS.NAME, (PRODUCTS.PRICESELL*(1+TAXES.RATE)) AS PVPUNIT, SUM(TICKETLINES.UNITS) AS UNITS,
 SUM(TICKETLINES.UNITS * (TICKETLINES.PRICE*(1+TAXES.RATE))) AS TOTALPVP
 FROM RECEIPTS, TICKETS, TAXES, TICKETLINES LEFT OUTER JOIN PRODUCTS ON TICKETLINES.PRODUCT = PRODUCTS.ID 
      WHERE RECEIPTS.ID = TICKETS.ID AND TICKETS.ID = TICKETLINES.TICKET 
            AND TICKETLINES.TAXID=TAXES.ID
            AND TICKETS.TICKETTYPE<>3 
             GROUP BY PRODUCTS.REFERENCE, PRODUCTS.NAME, PRODUCTS.PRICESELL, TAXES.RATE
             ORDER BY PRODUCTS.NAME
*/

/**
 *
 * @author alexandrebraganca
 */
public class JPanelProductSalesRPrinter extends JPanel implements JPanelView {
	
	private AppView m_App=null;
	private DataLogicSales m_dlSales=null;
	
	JParamsDatesInterval m_panelDatesInterval;
	
    private DataLogicSystem m_dlSystem = null;
    
    private DeviceTicket m_TP;   	// Impressora especifica deste painel 
    private TicketParser m_TTP;    
    private TicketParser m_TTP2; 

    /** Creates new form JPrinter */
    public JPanelProductSalesRPrinter(AppView oApp) {
    	
    	m_App=oApp;
    	
		m_dlSales = (DataLogicSales) m_App.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSales));
    	
    	m_panelDatesInterval=new JParamsDatesInterval();
    	
    	m_panelDatesInterval.init(oApp);
       
        initComponents();

        
//        if (oApp.getDeviceTicket().getDeviceDisplay().getDisplayComponent() != null) {
//            m_jDisplay.add(oApp.getDeviceTicket().getDeviceDisplay().getDisplayComponent());
//        }  
        
        // Vamos criar uma impressora de ecra especifica para este painel
        
        m_dlSystem = (DataLogicSystem) oApp.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSystem));

        
        // Inicializo la impresora...
        m_TP = new DeviceTicket();
   
        // Inicializo el parser de documentos de ticket
        m_TTP = new TicketParser(m_TP, m_dlSystem); // para visualizar o ticket - aparece no ecra
        m_TTP2 = new TicketParser(oApp.getDeviceTicket(), m_dlSystem); // para imprimir o ticket - na impressora definida na configuracao
 
        DevicePrinter printer = m_TP.getDevicePrinter("1");

        m_jPrinters.add(printer.getPrinterName(), printer.getPrinterComponent());
    }

    public JComponent getComponent() {
        return this;
    }
    public String getTitle() {
        return AppLocal.getIntString("Menu.Printer");
    }        
    public void activate() throws BasicException {
    }
    public boolean deactivate() {
        return true;
    }
    
    boolean validateParams(Date date1, Date date2) {
		
		//-----------------------------------------------
		// Codigo das validacoes:
		//jtxtOutput.setText("");
		if ((date1==null) || (date2==null)) {
			JOptionPane.showMessageDialog(null, StringConstants.getString(StringEnumerates.Deve_introduzir_valor_para_as_duas_datas_que_definem_o_intervalo__n));
			//jtxtOutput.append(StringConstants.getString(StringEnumerates.Deve_introduzir_valor_para_as_duas_datas_que_definem_o_intervalo__n));
			//sair=true;
			return false;
		}
		else {
			if (date1.compareTo(date2)>=0) {
				JOptionPane.showMessageDialog(null, StringConstants.getString(StringEnumerates.A_primeira_data_deve_ser_anterior_a_segunda_data__n));
				//jtxtOutput.append(StringConstants.getString(StringEnumerates.A_primeira_data_deve_ser_anterior_a_segunda_data__n));
				//sair=true;
				return false;
			}
//			else {
//				// as datas devem ser do mesmo ano!
//				GregorianCalendar c1=new GregorianCalendar();
//				c1.setTime(date1);
//				GregorianCalendar c2=new GregorianCalendar();
//				c2.setTime(date2);
//				if (c1.get(Calendar.YEAR)!=c2.get(Calendar.YEAR)) {
//					//jtxtOutput.append(StringConstants.getString(StringEnumerates.As_duas_datas_devem_pertencer_ao_mesmo_ano__n));
//					//sair=true;
//					return;
//				}
//			}
		}    	
    	return true;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	Object[] objs=null;
    	
    	try {
    		objs= (Object[]) m_panelDatesInterval.createValue();
    	} catch (BasicException ex) {
    		return;
    	}
    	
		// E' necessario ir buscar as datas....
		Date date1;
		Date date2;
		try {
			
			//date1 = (Date) Formats.TIMESTAMP.parseValue(jtxtDataInicio.getText());
			date1=(Date)objs[1];
			//date2 = (Date) Formats.TIMESTAMP.parseValue(jtxtDataFim.getText());
			date2=(Date)objs[3];
		} catch (Exception e) {
			date1 = null;
			date2 = null;
		}
    	
    	if (!validateParams(date1, date2)) return;
		
        printReport(m_TTP, "Printer.ProductSales", date1, date2);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	Object[] objs=null;
    	
    	try {
    		objs= (Object[]) m_panelDatesInterval.createValue();
    	} catch (BasicException ex) {
    		return;
    	}
    	
		// E' necessario ir buscar as datas....
		Date date1;
		Date date2;
		try {
			
			//date1 = (Date) Formats.TIMESTAMP.parseValue(jtxtDataInicio.getText());
			date1=(Date)objs[1];
			//date2 = (Date) Formats.TIMESTAMP.parseValue(jtxtDataFim.getText());
			date2=(Date)objs[3];
		} catch (Exception e) {
			date1 = null;
			date2 = null;
		}
    	
    	if (!validateParams(date1, date2)) return;
	
    	printReport(m_TTP2, "Printer.ProductSales", date1, date2);
        
    }

    private void printReport(TicketParser tp, String report, Date d1, Date d2) {
        
        String sresource = m_dlSystem.getResourceAsXML(report);
        if (sresource == null) {
            MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.cannotprintticket"));
            msg.show(this);
        } else {
            try {
            	//----- 
            	
    			SentenceList lSales=m_dlSales.getProductsSalesByDate(d1, d2);
    			
    			List<ProductsSalesInfo> lSales2=(List<ProductsSalesInfo>)lSales.list();
    			
    			ProductSalesReportInfo repData=new ProductSalesReportInfo();
    			repData.setSales(lSales2);
    			repData.setDate1(d1);
    			repData.setDate2(d2);
            	
                // LoadData  ... TESTE!!!!
                PaymentsModel m_PaymentsToClose = null;
                m_PaymentsToClose = PaymentsModel.loadInstance(m_App);
            	
                ScriptEngine script = ScriptFactory.getScriptEngine(ScriptFactory.VELOCITY);
                //script.put("payments", m_PaymentsToClose);
                script.put("sales", repData);
                //m_TTP.printTicket(script.eval(sresource).toString());
                tp.printTicket(script.eval(sresource).toString());
                
            } catch (ScriptException e) {
                MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.cannotprintticket"), e);
                msg.show(this);
            } catch (TicketPrinterException e) {
                MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.cannotprintticket"), e);
                msg.show(this);
            } catch (BasicException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }    

    private void jToggleFilterActionPerformed(java.awt.event.ActionEvent evt) {

        jPanelFilter.setVisible(jToggleFilter.isSelected());
    
    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
//        m_jDisplay = new javax.swing.JPanel();
        //jPanel1 = new javax.swing.JPanel();
        
        
        //----------------
        
        jPanelHeader = new javax.swing.JPanel();
        jPanelFilter = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jToggleFilter = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setLayout(new java.awt.BorderLayout());

        jPanelHeader.setLayout(new java.awt.BorderLayout());

        jPanelFilter.setLayout(new java.awt.BorderLayout());

        //setLayout(new java.awt.BorderLayout());
        jPanelFilter.add(this.m_panelDatesInterval, java.awt.BorderLayout.NORTH);
        
        jPanelHeader.add(jPanelFilter, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jToggleFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/1downarrow.png"))); // NOI18N
        jToggleFilter.setSelected(true);
        jToggleFilter.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/1uparrow.png"))); // NOI18N
        jToggleFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleFilterActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleFilter);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/launch.png"))); // NOI18N
        jButton1.setText(AppLocal.getIntString("Button.ExecuteReport")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ktc/openk/pos/images/print.png"))); // NOI18N
        jButton2.setText(StringConstants.getString(StringEnumerates.Imprimir_Relatorio)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        
        jPanelHeader.add(jPanel1, java.awt.BorderLayout.SOUTH);

        add(jPanelHeader, java.awt.BorderLayout.NORTH);

        m_jPrinters = new javax.swing.JTabbedPane();
        add(m_jPrinters, java.awt.BorderLayout.CENTER);

        //---------------

        //jPanel1.setLayout(new java.awt.BorderLayout());

        //jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
 
        //add(jPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelFilter;
    private javax.swing.JToggleButton jToggleFilter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    //private javax.swing.JPanel m_jDisplay;
    private javax.swing.JTabbedPane m_jPrinters;
    // End of variables declaration//GEN-END:variables
    
}