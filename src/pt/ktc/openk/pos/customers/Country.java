package pt.ktc.openk.pos.customers;

import com.openbravo.data.loader.IKeyed;

// Classe que implementa a informacao de cada elemento da tabela de paises para o SAFT
// ISO 3166 Ð 1-alpha-2.
@SuppressWarnings("rawtypes")
public class Country implements IKeyed, Comparable<Country> {
	private String m_Id;
	private String m_Name;
	
	// Ex: "Portugal", "PT"
	public Country(String name, String id) {
		m_Id=id;
		m_Name=name;
	}

	@Override
	public Object getKey() {
		// TODO Auto-generated method stub
		return m_Id;
	}
	
	@Override
	public String toString() {
		return m_Name;
	}

	@Override
	public int compareTo(Country o) {
		// TODO Auto-generated method stub
		//Country o2=(Country)o;
		return this.toString().compareTo(o.toString());
	}

}
