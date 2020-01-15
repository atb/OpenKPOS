/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *
 * */
package pt.ktc.openk.pos.sales;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.pos.sales.JPanelTicket;
import com.openbravo.pos.sales.JPanelTicketEdits;
import com.openbravo.pos.sales.JTicketsBag;
import com.openbravo.pos.ticket.ProductInfoExt;

public class JPanelTicketReplaceSale extends JPanelTicket {
    
    private JTicketCatalogLines m_catandlines;
    
    /** Creates a new instance of JPanelTicketRefunds */
    public JPanelTicketReplaceSale() {
    }
    
    public String getTitle() {
        return null;
    }
    
    @Override
    public void activate() throws BasicException {      
        super.activate();
        m_catandlines.loadCatalog();
    }

    public void showCatalog() {
        m_jbtnconfig.setVisible(true);
        m_catandlines.showCatalog();
    }
    
    public void showRefundLines(List aRefundLines) {
        // anado las lineas de refund
        // m_reflines.setLines(aRefundLines);
        m_jbtnconfig.setVisible(false);
        m_catandlines.showRefundLines(aRefundLines);
    }
    
    protected JTicketsBag getJTicketsBag() {
    
//        return new JTicketsBagTicket(m_App, this);
    	// Isto ainda nao compila
    	return null;
    }

    protected Component getSouthComponent() {

//        m_catandlines = new JTicketCatalogLines(m_App, this,                
//        		StringConstants.getString(StringEnumerates._true).equals(m_jbtnconfig.getProperty(StringConstants.getString(StringEnumerates.pricevisible))),
//        		StringConstants.getString(StringEnumerates._true).equals(m_jbtnconfig.getProperty(StringConstants.getString(StringEnumerates.taxesincluded))),
//                Integer.parseInt(m_jbtnconfig.getProperty(StringConstants.getString(StringEnumerates.img_width), StringConstants.getString(StringEnumerates._64))),
//                Integer.parseInt(m_jbtnconfig.getProperty(StringConstants.getString(StringEnumerates.img_height), StringConstants.getString(StringEnumerates._54))));
//        m_catandlines.setPreferredSize(new Dimension(
//                0,
//                Integer.parseInt(m_jbtnconfig.getProperty(StringConstants.getString(StringEnumerates.cat_height), StringConstants.getString(StringEnumerates._245)))));
//        m_catandlines.addActionListener(new CatalogListener());
//        return m_catandlines;
    	// Isto ainda nao compila
    	m_catandlines=null;
    	return m_catandlines;
    } 

    protected void resetSouthComponent() {
    }
    
    private class CatalogListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            buttonTransition((ProductInfoExt) e.getSource());
        }  
    }  
       
}
