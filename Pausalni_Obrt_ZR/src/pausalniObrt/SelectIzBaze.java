package pausalniObrt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class SelectIzBaze {
	
	private static void ispisiTablice() {
		Baza spajanje=new Baza();
		spajanje.getVeza();
		PreparedStatement izraz;
		
		try {
			System.out.println();
			izraz = spajanje.veza.prepareStatement("show tables");
			ResultSet tablice=izraz.executeQuery();
			int i=1;
			System.out.println("Odaberi tablicu:");
			while (tablice.next()) {
				
				String t=tablice.getString("Tables_in_pausalni_obrt");
				System.out.println(i+". "+t);
				i++;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("0. Izlaz");
		int key=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		System.out.println();
		switch (key) {
		case 1:
			try {
				izraz=spajanje.veza.prepareStatement("SELECT * FROM klijent_kupac");
				ResultSet rs=izraz.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt("id")+" "+rs.getString("naziv"));
				}
				rs.close();
				spajanje.veza.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				izraz=spajanje.veza.prepareStatement("SELECT * FROM korisnik");
				ResultSet rs=izraz.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt("id")+" "+rs.getString("ime")+" "+rs.getString("prezime"));
				}
				rs.close();
				spajanje.veza.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				izraz=spajanje.veza.prepareStatement("SELECT * FROM podaci_o_obrtu");
				ResultSet rs=izraz.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString("naziv")+" "+rs.getString("vlasnik")+" "+rs.getString("adresa"));
				}
				rs.close();
				spajanje.veza.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 4:
			try {
				izraz=spajanje.veza.prepareStatement(" select racun.broj_racuna,klijent_kupac.naziv,racun.vrijeme_idavanja, korisnik.ime "
						+ "from racun inner join klijent_kupac on racun.klijent_kupac_id=klijent_kupac.id "
						+ "inner join korisnik on racun.izdao_korisnik_id=korisnik.id;");
				ResultSet rs=izraz.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString("racun.broj_racuna")+" "+rs.getString("klijent_kupac.naziv")+" "+rs.getString("racun.vrijeme_idavanja")
					+" "+rs.getString("korisnik.ime"));
				}
				rs.close();
				spajanje.veza.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		case 5:
			try {
				izraz=spajanje.veza.prepareStatement("select stavka.id,usluga_proizvod.naziv,racun.broj_racuna,rabat,kolicina from stavka "
						+ "inner join usluga_proizvod on stavka.usluga_proizvod_id=usluga_proizvod.id inner join racun on stavka.racun_id=racun.id");
				ResultSet rs=izraz.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt("stavka.id")+" "+rs.getString("usluga_proizvod.naziv")+" "+
							rs.getString("racun.broj_racuna")+" "+rs.getDouble("rabat")+" "+rs.getDouble("kolicina"));
				}
				rs.close();
				spajanje.veza.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 6:
			
			break;
		case 0:
			
			break;
		default:
			//ide while da mora odabrati
			break;
		
		}
		
		
		
		
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		ispisiTablice();
	}

}
