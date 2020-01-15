/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.editor;

import com.openbravo.format.Formats;

public class JEditorPercentage extends com.openbravo.editor.JEditorNumber {
	    
		private static final long serialVersionUID = 5096754100573262804L;
		
		/** Creates a new instance of JEditorCurrency */
	    public JEditorPercentage() {
	    }
	    
	    protected Formats getFormat() {
	        return Formats.PERCENT;
	    }
	    protected int getMode() {
	        return com.openbravo.editor.EditorKeys.MODE_DOUBLE;
	    }  
	}

