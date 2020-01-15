/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.backup;

import java.io.FileReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.pt1_01.Pt1_01Factory;
import oecd.standard.audit.file.tax.pt1_01.util.Pt1_01ResourceFactoryImpl;
import oecd.standard.audit.file.tax.pt1_01.util.Pt1_01ResourceImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;

//import pt.ktc.openk.pos.security.Cipher;
import pt.ktc.openk.pos.utils.DirectoryBackupEvent;
import pt.ktc.openk.pos.utils.FileBackupEvent;
import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;
import pt.ktc.openk.pos.validade.ValidateXML;

import com.openbravo.basic.BasicException;
import com.openbravo.beans.JCalendarDialog;
import com.openbravo.data.loader.SentenceList;
import com.openbravo.format.Formats;
import com.openbravo.pos.customers.CustomerInfo;
import com.openbravo.pos.customers.CustomerInfoExt;
import com.openbravo.pos.customers.DataLogicCustomers;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppProperties;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.pos.forms.JPanelView;
import com.openbravo.pos.ticket.FindTicketsInfo;
import com.openbravo.pos.ticket.ProductInfoExt;
import com.openbravo.pos.ticket.TaxInfo;
import com.openbravo.pos.ticket.TicketInfo;
import com.openbravo.pos.ticket.TicketLineInfo;

public class JPanelBackup extends JPanel implements JPanelView {
	
	private static Logger logger = Logger.getLogger(StringConstants.getString(StringEnumerates.pt_ktc_openk_pos_backup_JPanelBackup));

	private AppView m_oApp;

	/** Creates new form JPanelConfiguration */
	public JPanelBackup(AppView oApp) {
		this(oApp.getProperties());
		m_oApp=oApp;
	}

	public JPanelBackup(AppProperties props) {

		//config = new AppConfig(props.getConfigFile());

		myInitComponents();
	}

	public JComponent getComponent() {
		return this;
	}

	public String getTitle() {
		return AppLocal.getIntString(StringConstants.getString(StringEnumerates.Menu_Backup));
	} 

	public void activate() throws BasicException {
		//loadProperties();        
	}

	public boolean deactivate() {

		return true;
	}      

	private void myInitComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		m_jBackupOptions = new javax.swing.JPanel();

		m_jBackupOptions.setLayout(new javax.swing.BoxLayout(m_jBackupOptions, javax.swing.BoxLayout.Y_AXIS));
		jScrollPane1.setViewportView(m_jBackupOptions);

		//---------------
		javax.swing.JPanel jPanel1 = new javax.swing.JPanel();

		//jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(AppLocal.getIntString("Label.Database"))); // NOI18N

		bGenerate = new javax.swing.JButton();
		bGenerate.setText(StringConstants.getString(StringEnumerates.Gerar_Copia_de_Seguranca));
		bGenerate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtnGenerate(evt);
			}
		});  
		
		jtxtBackupFile = new javax.swing.JTextField();
		bSelFile = new javax.swing.JButton();
		bSelFile.setText(StringConstants.getString(StringEnumerates.Seleccionar_ficheiro));
//		bSelFile.addActionListener(new DirectoryBackupEvent(jtxtBackupFile));
		bSelFile.addActionListener(new FileBackupEvent(jtxtBackupFile));
				
//		bLoadFile = new javax.swing.JButton();
//		bLoadFile.setText("Repor Cópia de Segurança");
//		bLoadFile.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(java.awt.event.ActionEvent evt) {
//				jbtnLoadFile(evt);
//			}
//		});  
		
		// Label para ter a animacao de progresso...
		jlblProgress=new javax.swing.JLabel();
		
		// Para o output do processo
		jtxtOutput = new javax.swing.JTextArea();
		jtxtOutput.setEditable(false);
		
		// Scroll para o output
		jScrollPaneFile = new JScrollPane(jtxtOutput);
		//--------------------

		javax.swing.JPanel jPanel2 = new javax.swing.JPanel();

		GroupLayout layout2 = new GroupLayout(jPanel2);

		jPanel2.setLayout(layout2);

		// Disposicao horizontal
		GroupLayout.SequentialGroup hGroup = layout2.createSequentialGroup();
		//----------------

		// Disposicao vertical
		GroupLayout.SequentialGroup vGroup = layout2.createSequentialGroup();
		//----------------

		javax.swing.JPanel jPanel3 = new javax.swing.JPanel();

		jPanel3.add(bGenerate);
		jPanel3.add(jtxtBackupFile);
		jPanel3.add(bSelFile);
//		jPanel3.add(bLoadFile);
		jPanel3.add(jlblProgress);
		
		URL imgUrl=this.getClass().getResource(StringConstants.getString(StringEnumerates._pt_ktc_openk_pos_images_work_in_progress_jpg));
		//imgUrl=this.getClass().getResource("/pt/ktc/openk/images/refund.png");
	    ImageIcon ii = new ImageIcon(imgUrl);
		jlblProgress.setIcon(ii);
		jlblProgress.setVisible(true);

		GroupLayout layout3 = new GroupLayout(jPanel3);

		jPanel3.setLayout(layout3);

		// Disposicao horizontal
		hGroup = layout3.createSequentialGroup();
		// Coluna 1
		hGroup.addContainerGap();
		// Coluna 2
		hGroup.addGroup(layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(bSelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(bGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE));
		// Coluna 3
		hGroup.addGap(5);
		// Coluna 4
		hGroup.addGroup(layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jtxtBackupFile, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
//				.addComponent(bLoadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
				);
		// Coluna 5
		hGroup.addGap(5);
		// Coluna 6
		hGroup.addGroup(layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jlblProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE));	
		layout3.setHorizontalGroup(hGroup);
		//----------------

		// Disposicao vertical
		vGroup = layout3.createSequentialGroup();
		// Linha 1
		vGroup.addContainerGap();
		// Linha 2
		vGroup.addGroup(layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(bSelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jtxtBackupFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jlblProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE));
		// Linha 3
		vGroup.addGap(5);
		// Linha 4
		vGroup.addGroup(layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(bGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
//				.addComponent(bLoadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
				);
		layout3.setVerticalGroup(vGroup);
		//----------------
		
		// Um painel para o output
		javax.swing.JPanel jPanel4 = new javax.swing.JPanel();

		//jPanel3.add(jtxtOutput);
		jPanel4.add(jScrollPaneFile);

		GroupLayout layout4 = new GroupLayout(jPanel4);

		jPanel4.setLayout(layout4);

		// Disposicao horizontal
		hGroup = layout4.createSequentialGroup();
		// Coluna 1
		hGroup.addContainerGap();
		// Coluna 2
		hGroup.addGroup(layout4.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPaneFile, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE));
		layout4.setHorizontalGroup(hGroup);
		//----------------

		// Disposicao vertical
		vGroup = layout4.createSequentialGroup();
		// Linha 1
		vGroup.addContainerGap();
		// Linha 2
		vGroup.addGroup(layout4.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPaneFile, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE));
		layout4.setVerticalGroup(vGroup);
		//----------------
		
		//--------------------------

		m_jBackupOptions.add(jPanel1);
		//jPanel1.setLayout(new BorderLayout());
		jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
		//jPanel1.add(jPanel2, BorderLayout.WEST);
		//jPanel1.add(bGenerate, BorderLayout.WEST);
		jPanel2.setAlignmentX(LEFT_ALIGNMENT);
		jPanel1.add(jPanel2);
		jPanel3.setAlignmentX(LEFT_ALIGNMENT);
		jPanel1.add(jPanel3);
		jPanel4.setAlignmentX(LEFT_ALIGNMENT);
		jPanel1.add(jPanel4);
		
		//bGenerate.setAlignmentX(LEFT_ALIGNMENT);
		//jPanel1.add(bGenerate);

		// Para o scroll
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
						)
						.addContainerGap()
				)
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addContainerGap()
				)
		);
	}

	private String trimGUID(String s) {
		String s2;

		s2=s.substring(0,8)+s.substring(9, 13)+s.substring(14, 18)+s.substring(19, 23)+s.substring(24, 34);

		return s2;
	}

	private void jbtnLoadFile(java.awt.event.ActionEvent evt) {
		// Restaurar o ficheiro de backup
		boolean sair=false;

		String tarfile="";
		{
			// Validar o ficheiro de geracao
			tarfile=this.jtxtBackupFile.getText();
			if ((tarfile==null) || (tarfile.isEmpty())) {
				jtxtOutput.append(StringConstants.getString(StringEnumerates.Deve_ser_introduzido_o_nome_do_ficheiro_a_restaurar__n));
				sair=true;
			}
		}
		//-----------------------------------------------

		if (!sair) {
			
			jtxtOutput.setText("");
			
			// Vamos usar uma thread...
			RestoreBackup gRestore=new RestoreBackup(tarfile, jtxtOutput, m_oApp, jlblProgress);
			
			Thread tRestore=new Thread(gRestore);
			
			tRestore.start();
			
			// generateSaftPt_1_01_01(date1, date2, xmlfile);
		}
	}

	private void jbtnGenerate(java.awt.event.ActionEvent evt) {
		// Gerar o ficheiro de backup
		boolean sair=false;

		String tarfile="";
		{
			// Validar o ficheiro de geracao
			tarfile=this.jtxtBackupFile.getText();
			if ((tarfile==null) || (tarfile.isEmpty())) {
				jtxtOutput.append(StringConstants.getString(StringEnumerates.Deve_ser_introduzido_o_nome_do_ficheiro_a_gerar__n));
				sair=true;
			}
		}
		//-----------------------------------------------

		if (!sair) {
			
			jtxtOutput.setText("");
			
			// Vamos usar uma thread...
			GenerateBackup2 gBackup=new GenerateBackup2(tarfile, jtxtOutput, m_oApp, jlblProgress);
			
			Thread tBackup=new Thread(gBackup);
			
			tBackup.start();
			
			// generateSaftPt_1_01_01(date1, date2, xmlfile);
		}
	}

	//	Simon Spacey wrote:
	//
	//	    I'm using EMF for the 1st time and have a problem relating to the use of capitalized attribute names in XML docs that I'm loading. 
	//
	//
	//	Hi Simon,
	//
	//
	//	EMF does some remapping to turn XML element and attribute names into conventional Ecore attribute and reference names (i.e. conventional Java field names). It annotates the model with the original XML names (and a bunch of other information from the schema that can't be represented in Ecore) via the ExtendedMetaData interface. Resources must use this information to save and load conformant instance documents.
	//
	//	Look in the util package of the generated model code and you'll find a resource factory implementation, LibraryResourceFactoryImpl. This factory returns instances of XMLResource with a few non-default options set. Most importantly, it enables the use of ExtendedMetaData.
	//
	//	When you're running the editor under Eclipse, the platform will process the model plug-in's manifest file, plugin.xml, which contains the following:
	//
	//	<extension point="org.eclipse.emf.ecore.extension_parser">
	//	 <parser type="library"
	//	   class="org.eclipse.example.library.util.LibraryResourceFactoryImpl"/>
	//	</extension>
	//
	//
	//	As you might guess, this registers the custom resource factory to provide resources to be used for filenames with a ".library" extension.
	//
	//	Here's the registration from the tutorial.
	//
	//
	//	      // Register the default resource factory -- only needed for stand-alone!
	//	      resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	//	        Resource.Factory.Registry.DEFAULT_EXTENSION,
	//	        new XMIResourceFactoryImpl());
	//
	//
	//	Try replacing that line with this:
	//
	//
	//	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	//	  "library",
	//	  new LibraryResourceFactoryImpl());
	//
	//
	//	That should fix your problem by making the same kind of registration as in the manifest file.
	//
	//	(There's a small difference: the manifest-based registration is done in the global resource factory registry, while this registration is in the registry local to the resource set. So, it only affects resource creation done through that resource set. Global registrations are done through Resource.Factory.Registry.INSTANCE.)
	//
	//	Cheers,
	//	Dave

	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JPanel m_jBackupOptions;

	private javax.swing.JButton bGenerate;
	private javax.swing.JButton bSelFile;
//	private javax.swing.JButton bLoadFile;	
	private javax.swing.JTextField jtxtBackupFile;
	private javax.swing.JScrollPane jScrollPaneFile; 
	private javax.swing.JTextArea jtxtOutput;
	private javax.swing.JLabel jlblProgress;
	
	// Para um icone animado:   
	// add the image label
    // ImageIcon ii = new ImageIcon(this.getClass().getResource("src/pr/ktc/openk/images/work_in_progress.gif"));
	// imageLabel.setIcon(ii);
	//
}
