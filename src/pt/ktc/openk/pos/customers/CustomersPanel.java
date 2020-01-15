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

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.ListCellRendererBasic;
import com.openbravo.data.loader.ComparatorCreator;
import com.openbravo.data.loader.TableDefinition;
import com.openbravo.data.loader.Vectorer;
import com.openbravo.data.user.BrowsableEditableData;
import com.openbravo.data.user.EditorRecord;
import com.openbravo.data.user.ListProvider;
import com.openbravo.data.user.ListProviderCreator;
import com.openbravo.data.user.SaveProvider;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.panels.JPanelTable;
import javax.swing.ListCellRenderer;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.pos.customers.DataLogicCustomers;

public class CustomersPanel extends JPanelTable {

	private TableDefinition tcustomers;
	private CustomersView jeditor;

	/** Creates a new instance of CustomersPanel */
	public CustomersPanel() {
	}

	protected void init() {
		DataLogicCustomers dlCustomers = (DataLogicCustomers) app
				.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_customers_DataLogicCustomers));
		tcustomers = dlCustomers.getTableCustomers();
		jeditor = new CustomersView(app, dirty);
	}

	@Override
	public void activate() throws BasicException {

		jeditor.activate();
		super.activate();
	}

	public ListProvider getListProvider() {
		return new ListProviderCreator(tcustomers);
	}

	public SaveProvider getSaveProvider() {
		// (ATB) Alterado para usar o CustomersSaveProvider
		return new CustomersSaveProvider(this, jeditor, tcustomers, new int[] { 0, 1, 2, 3, 4,
				5, 6, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 });
	}

	@Override
	public Vectorer getVectorer() {
		return tcustomers.getVectorerBasic(new int[] { 1, 2, 3, 4 });
	}

	@Override
	public ComparatorCreator getComparatorCreator() {
		return tcustomers.getComparatorCreator(new int[] { 1, 2, 3, 4 });
	}

	@Override
	public ListCellRenderer getListCellRenderer() {
		return new ListCellRendererBasic(
				// Pede para mostrar o campo 1 (NIF) e o campo 3 (Name)
				tcustomers.getRenderStringBasic(new int[] { 1, 3 }));
	}

	public EditorRecord getEditor() {
		return jeditor;
	}

	public String getTitle() {
		return AppLocal.getIntString(StringConstants.getString(StringEnumerates.Menu_CustomersManagement));
	}
	
	/* (ATB) */
	public BrowsableEditableData getBED() {
		return bd;
	}
	
	/* (ATB) */
	public AppView getApp() {
		return app;
	}
	
}

