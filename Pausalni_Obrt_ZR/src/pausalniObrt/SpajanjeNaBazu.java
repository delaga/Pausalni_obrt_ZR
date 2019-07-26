package pausalniObrt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SpajanjeNaBazu {
	
	public Connection veza;

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
		//citajIzBaze();

	}
	
	
		


}
	
