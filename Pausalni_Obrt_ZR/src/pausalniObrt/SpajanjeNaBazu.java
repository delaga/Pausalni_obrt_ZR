package pausalniObrt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SpajanjeNaBazu {
	
	private Connection veza;

	public Connection getVeza() {
		return veza;
	}

	public void setVeza(Connection veza) {
		this.veza = veza;
	}
	
	public SpajanjeNaBazu() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");	
			veza=DriverManager.getConnection("jdbc:mariadb://134.209.23.129/pausalni_obrt","edunova","edunova");
			System.out.println(veza.getMetaData().getCatalogTerm());			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
		citajIzBaze();

	}
	
	private void citajIzBaze() {
		try {
			PreparedStatement izraz=veza.prepareStatement("select * from usluga_proizvod");
			ResultSet rezultatCitanjaIzBaze=izraz.executeQuery();
			while (rezultatCitanjaIzBaze.next()) {
				System.out.println(rezultatCitanjaIzBaze.getInt("id")+" "+rezultatCitanjaIzBaze.getString("naziv")
				+" "+rezultatCitanjaIzBaze.getString("opis")+" "+rezultatCitanjaIzBaze.getString("jedinica_mjere")
				+" "+rezultatCitanjaIzBaze.getDouble("cijena"));
				
			}
			rezultatCitanjaIzBaze.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

	public static void main(String[] args) {
		new SpajanjeNaBazu();
	}
}
	
