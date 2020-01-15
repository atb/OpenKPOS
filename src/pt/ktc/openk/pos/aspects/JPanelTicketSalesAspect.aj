package pt.ktc.openk.pos.aspects;

import java.awt.Component;
import java.awt.Dimension;

import com.openbravo.pos.catalog.JCatalog;
import com.openbravo.pos.sales.JTicketCatalogLines;


public privileged aspect JPanelTicketSalesAspect {
	
    public Component com.openbravo.pos.sales.JPanelTicketSales.getSouthComponent2() {
        m_cat = new JCatalog(dlSales,
                "true".equals(m_jbtnconfig.getProperty("pricevisible")),
                "true".equals(m_jbtnconfig.getProperty("taxesincluded")),
                Integer.parseInt(m_jbtnconfig.getProperty("img-width", "64")),
                Integer.parseInt(m_jbtnconfig.getProperty("img-height", "54")));
        m_cat.addActionListener(new CatalogListener());
        m_cat.getComponent().setPreferredSize(new Dimension(
        		Integer.parseInt(m_jbtnconfig.getProperty("cat-width", "300")),
                Integer.parseInt(m_jbtnconfig.getProperty("cat-height", "300"))));
        return m_cat.getComponent();
    }

//   	pointcut initComponentsPointcut(com.openbravo.pos.catalog.JCatalog catalog) : target(catalog) && args() && execution(void com.openbravo.pos.catalog.JCatalog.initComponents()); 
	pointcut getSouthComponent(com.openbravo.pos.sales.JPanelTicketSales tSales): within(com.openbravo.pos.sales.JPanelTicketSales) && target(tSales) && execution(Component com.openbravo.pos.sales.JPanelTicketSales.getSouthComponent());

	Component around(com.openbravo.pos.sales.JPanelTicketSales tSales) : getSouthComponent(tSales) {
		return tSales.getSouthComponent2();
	}
	
	pointcut setPreferredSize(java.awt.Component catalog, java.awt.Dimension dimension) : within(com.openbravo.pos.sales.JPanelTicketSales) && target(catalog) && args(dimension) && call(void java.awt.Component.setPreferredSize(java.awt.Dimension)); 

	/* (ATB)(2013-06-11)
	void around (java.awt.Component catalog, java.awt.Dimension dimension) : setPreferredSize(catalog, dimension)  {
	
        catalog.setPreferredSize(new Dimension(
                200,
                Integer.parseInt("245")));
		
	}
   */
	
	/*
	 *         m_jCategories.setMaximumSize(new java.awt.Dimension(275, 600));

	         m_jCategories.setPreferredSize(new java.awt.Dimension(275, 600));
	pointcut setListCategoriesSize(com.openbravo.pos.catalog.JCatalog) : within(com.openbravo.pos.catalog.JCatalog) && call(void com.openbravo.pos.catalog.initComponents());

	 */
	
}
