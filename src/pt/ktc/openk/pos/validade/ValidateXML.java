/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.validade;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class ValidateXML {

	//private static final String SCHEMA = "schema.xsd";
	private String schema = "/media/data/develop/workspaces/openbravo/pos/devel/saftmodel/model/saf-t-pt.xsd";
	
	//private static final String DOCUMENT = "document.xml";
	private String document = "/media/data/develop/workspaces/openbravo/pos/devel/saftmodel/model/exemplo.saft";

	public void validate(String pDocument, String pSchema) {
		schema=pSchema;
		document=pDocument;
		validate();
	}

	private void validate() {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);

		try {
			DocumentBuilder parser = dbf.newDocumentBuilder();
			Document doc = parser.parse(new File(document));
			SchemaFactory factory = SchemaFactory
					.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

			Schema sch = null;
			sch = factory.newSchema(new File(schema));
			Validator validator = sch.newValidator();
			validator.validate(new DOMSource(doc));
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
	}
}
