/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.JTextComponent;

import com.openbravo.pos.forms.AppLocal;

public class DirectoryBackupEvent implements ActionListener {
    
    private JTextComponent m_jTxtField;
    private JFileChooser m_fc;
    
    /** Creates a new instance of DirectoryChooser */
    public DirectoryBackupEvent(JTextComponent TxtField) {
        m_jTxtField = TxtField;
        m_fc = new JFileChooser();
        
        m_fc.resetChoosableFileFilters();
        m_fc.addChoosableFileFilter(new FileFilter() {
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                } else {
                    String filename = f.getName();
                    return filename.endsWith(StringConstants.getString(StringEnumerates._tar));
//                        || filename.endsWith(".JAR")
//                        || filename.endsWith(".zip")
//                        || filename.endsWith(".ZIP");
                }
            }
            public String getDescription() {
                return AppLocal.getIntString(StringConstants.getString(StringEnumerates.filter_tarfile));
            }
        });
        m_fc.setFileSelectionMode(JFileChooser.FILES_ONLY );
    }
       
    public void actionPerformed(ActionEvent actionEvent) {
        
        m_fc.setCurrentDirectory(new File(m_jTxtField.getText()));      
        if (m_fc.showOpenDialog(m_jTxtField) == JFileChooser.APPROVE_OPTION) {
            m_jTxtField.setText(m_fc.getSelectedFile().getAbsolutePath());
        }
    }       

}
