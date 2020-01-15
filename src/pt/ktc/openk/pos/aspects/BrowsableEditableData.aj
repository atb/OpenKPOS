/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.aspects;

public privileged aspect BrowsableEditableData {
	
    public final Object com.openbravo.data.user.BrowsableEditableData.getCurrentElement2() {           
        return (m_iIndex >= 0 && m_iIndex < m_bd.getSize()) ? m_bd.getElementAt(m_iIndex) : null;
    } 

}
