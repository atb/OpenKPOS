/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.company;

import javax.swing.ListCellRenderer;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.data.gui.ListCellRendererBasic;
import com.openbravo.data.loader.ComparatorCreator;
import com.openbravo.data.loader.TableDefinition;
import com.openbravo.data.loader.Vectorer;
import com.openbravo.data.user.EditorRecord;
import com.openbravo.data.user.ListProvider;
import com.openbravo.data.user.ListProviderCreator;
import com.openbravo.data.user.SaveProvider;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.panels.JPanelTable;

public class CompanyPanel extends JPanelTable {

	private TableDefinition tcompany;
    private CompanyView jeditor;

    /** Creates a new instance of LocationsPanel */
    public CompanyPanel() {
    }    
	
	@Override
	public String getTitle() {
        return AppLocal.getIntString(StringConstants.getString(StringEnumerates.Menu_Company));
	}

	@Override
	protected void init() {
        DataLogicSales dlSales = (DataLogicSales) app.getBean(StringConstants.getString(StringEnumerates.com_openbravo_pos_forms_DataLogicSales));          
        tcompany = dlSales.getTableCompany();
        jeditor = new CompanyView(dirty);
	}

	@Override
	public EditorRecord getEditor() {
        return jeditor;
	}

	@Override
	public ListProvider getListProvider() {
        return new ListProviderCreator(tcompany);
	}

	@Override
	public SaveProvider getSaveProvider() {
        return new SaveProvider(tcompany);        
	}

	/*
	 * Os seguintes metodos permite ter uma lista de navegacao de registos no painel.
	 * (non-Javadoc)
	 * @see com.openbravo.pos.panels.JPanelTable#getVectorer()
	 */
	
    @Override
    public Vectorer getVectorer() {
        return tcompany.getVectorerBasic(new int[]{1, 2});
    }
    
    @Override
    public ComparatorCreator getComparatorCreator() {
        return tcompany.getComparatorCreator(new int[] {1, 2});
    }
    
    @Override
    public ListCellRenderer getListCellRenderer() {
        return new ListCellRendererBasic(tcompany.getRenderStringBasic(new int[]{1}));
    }	
	
}
