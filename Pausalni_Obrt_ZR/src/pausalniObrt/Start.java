package pausalniObrt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Start {
	
	
	public static void main(String[] args) {
		new SpajanjeNaBazu();
		citajIzBaze();
	}

	private static void citajIzBaze() {
			SpajanjeNaBazu spajanje=new SpajanjeNaBazu();
			spajanje.getVeza();
		
			try {
			
				PreparedStatement izraz=spajanje.veza.prepareStatement("select * from usluga_proizvod");
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
		}// TODO Auto-generated method stub
		
	}

