/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 * 
 * */
package pt.ktc.openk.pos.data.loader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.BaseSentence;
import com.openbravo.data.loader.BatchSentence;
import com.openbravo.data.loader.DataResultSet;
import com.openbravo.data.loader.DataWrite;
import com.openbravo.data.loader.ImageUtils;
import com.openbravo.data.loader.LocalRes;
import com.openbravo.data.loader.PreparedSentence;
import com.openbravo.data.loader.SerializableWrite;
import com.openbravo.data.loader.SerializerWriteBuilder;
import com.openbravo.data.loader.Session;
import com.openbravo.data.loader.StaticSentence;
import com.openbravo.data.loader.BatchSentence.ExceptionsResultSet;

/**
*
* @author adrianromero
*/
public class BatchSentenceResource extends BatchSentence {

   private String m_sResScript;
   
   /** Creates a new instance of BatchSentenceResource */
   public BatchSentenceResource(Session s, String resscript) {
       super(s);
       m_sResScript = resscript;
   }
   
   protected Reader getReader() throws BasicException {
       
       InputStream in = BatchSentenceResource.class.getResourceAsStream(m_sResScript);
       
       if (in == null) {
           throw new BasicException(LocalRes.getIntString(StringConstants.getString(StringEnumerates.exception_nosentencesfile)));
       } else {  
           try {
               return new InputStreamReader(in, StringConstants.getString(StringEnumerates.UTF_8));
           } catch (UnsupportedEncodingException ex) {
               throw new BasicException(LocalRes.getIntString(StringConstants.getString(StringEnumerates.exception_nosentencesfile)), ex);
           }
       }
   }  
   
   //--------------------------------------------------------------------------------------
   // Alterar os metodos base
   public DataResultSet openExec(Object params) throws BasicException {

       BufferedReader br = new BufferedReader(getReader());

       String sLine;
       String sLineOrg;
       StringBuffer sSentence = new StringBuffer();
       List aExceptions = new ArrayList();
       boolean start_pgsql=false;

       try {
           while ((sLine = br.readLine()) != null) {
        	   sLineOrg=sLine;
               sLine = sLine.trim();
               if (!sLine.equals("") && !sLine.startsWith(StringConstants.getString(StringEnumerates._minus_minus))) {
                   // No es un comentario ni linea vacia
                   if (sLine.endsWith(StringConstants.getString(StringEnumerates._semicolon))) {
                	   
                	   List paramlist = new ArrayList();
                	   StringBuffer buf = new StringBuffer();
                	   if (sLine.contains(StringConstants.getString(StringEnumerates._dollar_dollar))) {
                		   // terminou o codigo pgsql da funcao
                		   start_pgsql=false;
                		   
	                       // ha terminado la sentencia
	                       sSentence.append(sLine.substring(0, sLine.length() - 1));  
	                       buf.append(sSentence);
                	   }
                	   else {
                    	   if (start_pgsql) {
                    		   // estamos dentro de codigo pgsql de uma funcao
                    		   // nao fazemos nada
                    		   sLine=sLineOrg;
                    	   }
                    	   else {
		                       // ha terminado la sentencia
		                       sSentence.append(sLine.substring(0, sLine.length() - 1));                             
		
		                       // File parameters
		                       Pattern pattern = Pattern.compile(StringConstants.getString(StringEnumerates.______w_______________));
		                       Matcher matcher = pattern.matcher(sSentence.toString());
		                       // List paramlist = new ArrayList();
		
		                       // Replace all occurrences of pattern in input
		                       // StringBuffer buf = new StringBuffer();
		                       while (matcher.find()) {
		                           if (StringConstants.getString(StringEnumerates.FILE).equals(matcher.group(1))) {
		                               paramlist.add(ImageUtils.getBytesFromResource(matcher.group(2)));
		                               matcher.appendReplacement(buf, StringConstants.getString(StringEnumerates._question_mark));
		                           } else {
		                               String replacement = m_parameters.get(matcher.group(1));
		                               if (replacement == null) {
		                                   matcher.appendReplacement(buf, Matcher.quoteReplacement(matcher.group(0)));
		                               } else {
		                                   paramlist.add(replacement);
		                                   matcher.appendReplacement(buf, StringConstants.getString(StringEnumerates._question_mark));
		                               }
		                           }
		                       }
		                       matcher.appendTail(buf);
                    	   }
                	   }
                       
                	   if (!start_pgsql) {
	                       // La disparo
	                       try {
	                           BaseSentence sent;
	                           if (paramlist.size() == 0) {
	                               sent = new StaticSentence(m_s, buf.toString());
	                               sent.exec();
	                           } else {
	                               sent = new PreparedSentence(m_s, buf.toString(), SerializerWriteBuilder.INSTANCE);
	                               sent.exec(new VarParams(paramlist));
	                           }
	                       } catch (BasicException eD) {
	                           aExceptions.add(eD);
	                       }
	                       sSentence = new StringBuffer();
                	   }
                	   else {
                           sSentence.append(sLine);
                	   }

                   } else {
                	   sLine=sLineOrg;
                	   
                	   if (sLine.contains(StringConstants.getString(StringEnumerates._dollar_dollar))) {
                		   if (!start_pgsql) start_pgsql=true;
                	   }
                	   
                       // la sentencia continua en la linea siguiente
                       sSentence.append(sLine);
                   }
               }
           }

           br.close();

       } catch (IOException eIO) {
           throw new BasicException(LocalRes.getIntString(StringConstants.getString(StringEnumerates.exception_noreadfile)), eIO);
       }

       if (sSentence.length() > 0) {
           // ha quedado una sentencia inacabada
           aExceptions.add(new BasicException(LocalRes.getIntString(StringConstants.getString(StringEnumerates.exception_nofinishedfile))));
       }   

       return new ExceptionsResultSet(aExceptions);
   }    
      
   private static class VarParams implements SerializableWrite {
       
       private List l;
       
       public VarParams(List l) {
           this.l = l;
       }
       
       public void writeValues(DataWrite dp) throws BasicException {
           for (int i = 0; i < l.size(); i++) {
               Object v = l.get(i);
               if (v instanceof String) {
                   dp.setString(i + 1, (String) v);
               } else if (v instanceof byte[]) {
                   dp.setBytes(i + 1, (byte[]) l.get(i));
               } else {
                   dp.setObject(i + 1, v);
               }                
           }
       }
   }
   
}

