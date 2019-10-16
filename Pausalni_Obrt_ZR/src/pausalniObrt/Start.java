package pausalniObrt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Start {
	
	
	public static void main(String[] args) {
		new Baza();
		citajIzBaze();
		
	}

	private static void citajIzBaze() {
			Baza spajanje=new Baza();
			spajanje.getVeza();
			
			String query="select * from usluga_proizvod";
			try {
			
				PreparedStatement izraz=spajanje.veza.prepareStatement(query);
				ResultSet rezultatCitanjaIzBaze=izraz.executeQuery();
				while (rezultatCitanjaIzBaze.next()) {
					System.out.println(rezultatCitanjaIzBaze.getInt("id")+" "+rezultatCitanjaIzBaze.getString("naziv")
					+" "+rezultatCitanjaIzBaze.getString("opis")+" "+rezultatCitanjaIzBaze.getString("jedinica_mjere")
					+" "+rezultatCitanjaIzBaze.getDouble("cijena"));
					
				}
				rezultatCitanjaIzBaze.close();
				spajanje.veza.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		
	}

