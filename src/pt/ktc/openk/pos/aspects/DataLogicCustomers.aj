/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *   
 * */
package pt.ktc.openk.pos.aspects;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.Datas;
import com.openbravo.data.loader.PreparedSentence;
import com.openbravo.data.loader.QBFBuilder;
import com.openbravo.data.loader.SentenceList;
import com.openbravo.data.loader.SerializerRead;
import com.openbravo.data.loader.SerializerReadInteger;
import com.openbravo.data.loader.SerializerWriteBasic;
import com.openbravo.data.loader.StaticSentence;
import com.openbravo.pos.customers.CustomerInfo;

public privileged aspect DataLogicCustomers {
	
	// MACAddress do computador local: 58-55-CA-F8-BC-41
	// MACAddress do Windows 7 Virtual: 08-00-27-39-61-84
	// MACAddress do PC da Anabela: 00-0E-35-D0-33-EF
	// MACAddress do PC do Caipira: 00-13-8F-F1-C1-C4
	// MACAddress do PC do cafe Republica da Fruta: 00-23-54-BF-F7-36
	// MACAddress da loja Porto/Antas: 8C-89-A5-68-58-E0
	// MACAddress do computador dos miudos no KTC: 00-14-85-2F-C4-0A
	
	// Comecar a contar a partir do 0
	// Primeiro digito na posicao 5, segundo digito na posicao 11
	//                             -     -
	//static String id_posto_1="QHTCE0T823S0DFFDF";  // Caipira
	// static String id_posto_1="QHTCE0T823S0DFFDF"; // cafe
	// static String id_posto_1="QHTCE0T823S0DFFDF"; // pizaria
	// static String id_posto_1="QHTCE5T823S8DFFDF";  // Apple
	// static String id_posto_1="QHTCE0T823S8DFFDF";  // Windows 7 Virtual PC
	//static String id_posto_1="QHTCE0T823S0DFFDF";  // PC Anabela
	static String id_posto_1="QHTCE8T823SCDFFDF";  // Porto/Antas
	//static String id_posto_1="QHTCE0T823S0DFFDF";  // KTC Miudos
	
	// Terceiro digito na posicao 3, quarto digito na posicao 15
	//                           -           - 
	//static String id_posto_2="HBS163NAH9SK4ND3H";   // Caipira
	// static String id_posto_2="HBS263NAH9SK4ND3H";  // cafe
	//static String id_posto_2="HBS263NAH9SK4ND6H"; // pizaria
	//static String id_posto_2="HBS563NAH9SK4ND5H";   // Apple
	//static String id_posto_2="HBS063NAH9SK4ND0H";   // Windows 7 Virtual PC
	//static String id_posto_2="HBS063NAH9SK4NDEH";  // PC Anabela
	static String id_posto_2="HBS863NAH9SK4ND9H";   // Porto/Antas
	//static String id_posto_2="HBS163NAH9SK4ND4H";   // KTC Miudos
	
	// Quinto digito na posicao 13, sexto digito na posicao 2
	//                          _          -    
	//static String id_posto_3="ZNFDPEMC6723N8KY6";   // Caipira
	//static String id_posto_3="ZN4DPEMC6723N5KY6";  // Cafe
	//static String id_posto_3="ZN8DPEMC6723N1KY6"; // pizaria
	//static String id_posto_3="ZNADPEMC6723NCKY6";   // Apple
	//static String id_posto_3="ZN7DPEMC6723N2KY6";   // Windows 7 Virtual PC
	//static String id_posto_3="ZN5DPEMC6723N3KY6";   // PC Anabela
	static String id_posto_3="ZN5DPEMC6723NAKY6";   // Porto/Antas
	//static String id_posto_3="ZN5DPEMC6723N8KY6";   // KTC Miudos
	
	// Setimo digito na posicao 10, oitavo digito na posicao 5
	//                             _    _     
	//static String id_posto_4="PAMJF1G637FMC6H89";    // Caipira
	//static String id_posto_4="PAMJFFG637BMC6H89";  // Cafe
	//static String id_posto_4="PAMJF5G637EMC6H89"; // pizaria
	//static String id_posto_4="PAMJF8G637FMC6H89";    // Apple
	//static String id_posto_4="PAMJF9G6373MC6H89";    // Windows 7 Virtual PC
	//static String id_posto_4="PAMJF0G637DMC6H89";  // PC Anabela
	static String id_posto_4="PAMJF8G6376MC6H89";    // Porto/Antas
	//static String id_posto_4="PAMJFFG6372MC6H89";    // KTC Miudos
	
	// Nono digito na posicao 14, decimo digito na posicao 0
	//                        _             _   
	//static String id_posto_5="1XGDKIW452LOS9CPA";    // Caipira
	//static String id_posto_5="7XGDKIW452LOS9FPA";   // Cafe
	// static String id_posto_5="FXGDKIW452LOS99PA";  // pizaria
	//static String id_posto_5="CXGDKIW452LOS9BPA";    // Apple
	//static String id_posto_5="1XGDKIW452LOS96PA";    // Windows 7 Virtual PC
	//static String id_posto_5="3XGDKIW452LOS93PA";    // PC Anabela
	static String id_posto_5="8XGDKIW452LOS95PA";    // Porto/Antas
	//static String id_posto_5="4XGDKIW452LOS9CPA";    // KTC Miudos
	
	// decimo primeiro digito na posicao 6, decimo segundo digito byte na posicao 4 
	//                            _ _             
	//static String id_posto_6="HNSR4DCOM356SNHD9";   // Caipira
	//static String id_posto_6="HNSR6D3OM356SNHD9"; // Cafe
	//static String id_posto_6="HNSR3D9OM356SNHD9"; // pizaria
	//static String id_posto_6="HNSR1D4OM356SNHD9";   // Apple
	//static String id_posto_6="HNSR4D8OM356SNHD9";   // Windows 7 Virtual PC
	//static String id_posto_6="HNSRFDEOM356SNHD9";   // PC Anabela
	static String id_posto_6="HNSR0DEOM356SNHD9";   // Porto/Antas
	//static String id_posto_6="HNSRAD0OM356SNHD9";   // KTC Miudos
	
    public int com.openbravo.pos.customers.DataLogicCustomers.getCustomerTickets(String customerId) throws BasicException {
  
	    String cmd=StringConstants.getString(StringEnumerates.SELECT_COUNT____FROM_TICKETS_WHERE_CUSTOMER__)+customerId+StringConstants.getString(StringEnumerates._apostrophe);
		    
	    PreparedSentence selectSentence=new PreparedSentence(s
	            , cmd
	            , null
	            , SerializerReadInteger.INSTANCE);
	                    
	    Integer valor=(Integer)selectSentence.find();
	    
	    if (valor==null)
	    	return 0;
	    else
	    	return valor.intValue();
  }    
}
