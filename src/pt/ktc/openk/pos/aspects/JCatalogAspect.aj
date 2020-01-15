/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.aspects;


import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import pt.ktc.openk.pos.company.CompanyGlobal;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;
import com.openbravo.pos.ticket.TaxInfo;


public privileged aspect JCatalogAspect {
	
	
	public String com.openbravo.pos.catalog.JCatalog.getProductLabel2(com.openbravo.pos.ticket.ProductInfoExt product) {
        if (pricevisible) {
            if (taxesincluded) {
                TaxInfo tax = taxeslogic.getTaxInfo(product.getTaxCategoryID());
                return StringConstants.getString(StringEnumerates._html__center_) + product.getName() + StringConstants.getString(StringEnumerates._br_) + product.printPriceSellTax(tax);
            } else {
                return StringConstants.getString(StringEnumerates._html__center_) + product.getName() + StringConstants.getString(StringEnumerates._br_) + product.printPriceSell();
            }
        } else {
            return StringConstants.getString(StringEnumerates._html__center_)+product.getCode()+StringConstants.getString(StringEnumerates._br_)+product.getName();
        }		
	}

	pointcut getProductLabel(com.openbravo.pos.catalog.JCatalog catalog, com.openbravo.pos.ticket.ProductInfoExt product) : target(catalog) && args(product) && call(String com.openbravo.pos.catalog.JCatalog.getProductLabel(com.openbravo.pos.ticket.ProductInfoExt)); 

	String around(com.openbravo.pos.catalog.JCatalog catalog, com.openbravo.pos.ticket.ProductInfoExt product): getProductLabel(catalog, product)  {
		return catalog.getProductLabel2(product);
	}

    private class ConfigurationHandler extends DefaultHandler {  
    	
    	private Properties m_props;
    	
    	ConfigurationHandler(Properties props) {
    		m_props=props;
    	}
    	
        @Override
        public void startDocument() throws SAXException {}
        @Override
        public void endDocument() throws SAXException {}    
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
            if ("button".equals(qName)){
            } else if ("event".equals(qName)) {
            } else {
                String value = attributes.getValue("value");
                if (value != null) {                  
                    m_props.setProperty(qName, attributes.getValue("value"));
                }
            }
        }      
        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {}
        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {}
    }
    
//	// (ATB)(2012-04-13) Tentar diminuir o espaco das categorias para alargar o dos produtos
  	pointcut initComponentsPointcut(com.openbravo.pos.catalog.JCatalog catalog) : target(catalog) && args() && execution(void com.openbravo.pos.catalog.JCatalog.initComponents()); 

 	after(com.openbravo.pos.catalog.JCatalog catalog): initComponentsPointcut(catalog)  {
 		
 		//catalog.initComponents();

 		//catalog.m_jCategories.setMaximumSize(new java.awt.Dimension(225, 600));
        //catalog.m_jCategories.setPreferredSize(new java.awt.Dimension(225, 600));	
 		
 		//JPanelButtons m_jbtnconfig = new JPanelButtons("Ticket.Buttons", this);
 		
 		// Para ler a propriedades de configuracao das dimensoes da janela de catalogo
        Properties props = new Properties();
        
        com.openbravo.pos.forms.DataLogicSystem dls=(com.openbravo.pos.forms.DataLogicSystem)CompanyGlobal.getCompanyGlobal().getJRootApp().getBean("com.openbravo.pos.forms.DataLogicSystem");
        
        String sConfigRes = dls.getResourceAsXML("Ticket.Buttons");
        SAXParser m_sp=null;
        if (sConfigRes != null) {
            try {
                if (m_sp == null) {
                    SAXParserFactory spf = SAXParserFactory.newInstance();
                    m_sp = spf.newSAXParser();
                }
                
                m_sp.parse(new InputSource(new StringReader(sConfigRes)), new ConfigurationHandler(props));

            } catch (ParserConfigurationException ePC) {
                //logger.log(Level.WARNING, LocalRes.getIntString("exception.parserconfig"), ePC);
            } catch (SAXException eSAX) {
                //logger.log(Level.WARNING, LocalRes.getIntString("exception.xmlfile"), eSAX);
            } catch (IOException eIO) {
                //logger.log(Level.WARNING, LocalRes.getIntString("exception.iofile"), eIO);
            }
        }   
 		
        try {
        	int altura=Integer.parseInt(props.getProperty("cat-height", "600"));
        	int largura=Integer.parseInt(props.getProperty("cat-width", "245"));
	 		catalog.m_jCategories.setMaximumSize(new java.awt.Dimension(largura, altura));
	        catalog.m_jCategories.setPreferredSize(new java.awt.Dimension(largura, altura));
        }
        catch (Exception ex) {
        	// Nao se faz nada...
        }
	}

 	// Para remover as imagens default das categorias e dos produtos na area do catalogo
	pointcut newThumbNailBuilder(com.openbravo.pos.util.ThumbNailBuilder thumbnailbuilder, int width, int height, String image) : target(thumbnailbuilder) && args(width, height, image) && execution(public com.openbravo.pos.util.ThumbNailBuilder.new(int, int, String)); 

	void around(com.openbravo.pos.util.ThumbNailBuilder thumbnailbuilder, int width, int height, String image): newThumbNailBuilder(thumbnailbuilder, width, height, image) {
		if (image.compareTo(StringConstants.getString(StringEnumerates.com_openbravo_images_package_png))==0) {
			proceed(thumbnailbuilder, width, height, StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_images_package_png));
		}
		else {
		if ((image.compareTo(StringConstants.getString(StringEnumerates.com_openbravo_images_folder_yellow_png))==0) || (image.compareTo(StringConstants.getString(StringEnumerates.com_openbravo_images_package_png))==0)) {
			proceed(thumbnailbuilder, width, height, image);
		} else {
			proceed(thumbnailbuilder, width, height, image);
		}
		}
	}

	//------------- Para garantir que as categorias aparecem sempre da mesma "forma"
	public ImageIcon com.openbravo.pos.catalog.JCatalog.getCategoriesIcon() {
		return new ImageIcon(tnbcat.getThumbNail(null));
	}

	pointcut selectIndicatorPanel(com.openbravo.pos.catalog.JCatalog jCatalog, Icon icon, String label) : 
		target(jCatalog) && withincode(void com.openbravo.pos.catalog.JCatalog.showSubcategoryPanel(com.openbravo.pos.ticket.CategoryInfo)) && args(icon, label) && call(private void com.openbravo.pos.catalog.JCatalog.selectIndicatorPanel(Icon, String)); 


	void around(com.openbravo.pos.catalog.JCatalog jCatalog, Icon icon, String label) : selectIndicatorPanel(jCatalog, icon, label) {
		proceed(jCatalog, jCatalog.getCategoriesIcon(), label);				
	}
}
