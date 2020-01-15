/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * Based on:  
 * */
//Openbravo POS is a point of sales application designed for touch screens.
//Copyright (C) 2007-2009 Openbravo, S.L.
//http://www.openbravo.com/product/pos
//
//This file is part of Openbravo POS.
//
//Openbravo POS is free software: you can redistribute it and/or modify
//it under the terms of the GNU General Public License as published by
//the Free Software Foundation, either version 3 of the License, or
//(at your option) any later version.
//
//Openbravo POS is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.
//
//You should have received a copy of the GNU General Public License
//along with Openbravo POS.  If not, see <http://www.gnu.org/licenses/>.

package pt.ktc.openk.pos.customers;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.data.loader.TableDefinition;
import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.SentenceExec;
import com.openbravo.data.user.BrowsableEditableData;
import com.openbravo.data.user.SaveProvider;
import com.openbravo.pos.customers.DataLogicCustomers;

public class CustomersSaveProvider extends SaveProvider {

protected SentenceExec m_sentupdate;
protected SentenceExec m_sentinsert;
protected SentenceExec m_sentdelete;

private CustomersPanel m_cpanel;	// (ATB) para termos acesso ao objecto actual
private CustomersView m_view;		// (ATB) para acedermos aos controlos de edicao

/** Creates a new instance of SavePrSentence */
public CustomersSaveProvider(CustomersPanel cpanel, CustomersView view, SentenceExec sentupdate, SentenceExec sentinsert, SentenceExec sentdelete) {
super(sentupdate, sentinsert, sentdelete);
	m_sentupdate = sentupdate;
  m_sentinsert = sentinsert;
  m_sentdelete = sentdelete;
  m_cpanel=cpanel;
  m_view=view;
}
public CustomersSaveProvider(TableDefinition table) {
	super(table);
  m_sentupdate = table.getUpdateSentence();
  m_sentdelete = table.getDeleteSentence();
  m_sentinsert = table.getInsertSentence();
}
public CustomersSaveProvider(CustomersPanel cpanel, CustomersView view, TableDefinition table, int[] fields) {
	super(table, fields);
  m_sentupdate = table.getUpdateSentence(fields);
  m_sentdelete = table.getDeleteSentence();
  m_sentinsert = table.getInsertSentence(fields);
  m_cpanel=cpanel;
  m_view=view;
}

/* (ATB) */
public boolean customerWithTickets() {
	if (m_cpanel!=null) {
		
		Object value=m_cpanel.getBED().getCurrentElement2();
		
		Object[] customer = (Object[]) value;
		
		if (customer!=null) {
			//System.out.println((String) customer[0]+ " - "+(String) customer[1]);
			
			DataLogicCustomers dlCustomers = (DataLogicCustomers) m_cpanel.getApp().getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_customers_DataLogicCustomers));
			try {
				int ntickets=dlCustomers.getCustomerTickets((String)customer[0]);
				
				if (ntickets!=0) 
					m_view.setReadOnly();
				else
					m_view.setReadWrite();
				
				
				return ntickets!=0;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				m_view.setReadOnly();
				
				return true;
			}
			
			// Usar o id do customer para ver se existem documentos para este cliente, caso existam, nao se pode apagar o cliente
			
			// getCustomerTickets
		}
	}
	
	m_view.setReadOnly();
	
	return true;   // por omissao diz que tem documentos para nao deixar mexer
}

/* (ATB) Este metodo e invocado para se sabe se e possivel apagar o registo */
public boolean canDelete() {
	
	return !customerWithTickets();
		
	// return m_sentdelete != null;      
}

public int deleteData(Object value) throws BasicException {
  return m_sentdelete.exec(value);
}

public boolean canInsert() {
	// Nao basta que tenha o comando de insert inicializado, e' necessario que o NIF obedeca as regras de validacao do NIF!!!
	if (m_sentinsert==null) return false; 
	else {
		if (m_view!=null) {

			String taxId=m_view.getTaxIDText();
			
			if (taxId!=null) {
				if (taxId.isEmpty()) return false;
				else {
					// Vamos ainda ver se est‡ de acordo com o formato de um NIF (9 digitos)
					boolean val=taxId.matches(StringConstants.getString(StringEnumerates.___p_Digit___));
					if (!val) return false;
					if (taxId.length()!=9) return false;
					
					// (ATB) Teste...
					m_view.setTaxIDFromTaxIDText();
					
					return true;
				}
			}
		}
		return false;
	}
}

public int insertData(Object value) throws BasicException {
  return m_sentinsert.exec(value);
}

public boolean canUpdate() {
	//return false;		// (ATB)  TESTE!!
  return m_sentupdate != null;      
}    

public int updateData(Object value) throws BasicException {
  return m_sentupdate.exec(value);
}
}
