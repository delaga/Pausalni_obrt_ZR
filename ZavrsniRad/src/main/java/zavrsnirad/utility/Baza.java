/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mirza
 */
public class Baza {
    public Connection veza;
	
	

	public Connection getVeza() {
		return veza;
	}

	public void setVeza(Connection veza) {
		this.veza = veza;
	}
	
	public Baza() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");	
			veza=DriverManager.getConnection("jdbc:mariadb://134.209.23.129/pausalni_obrt","edunova","edunova");
			//System.out.println(veza.getMetaData().getCatalogTerm());			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
}
