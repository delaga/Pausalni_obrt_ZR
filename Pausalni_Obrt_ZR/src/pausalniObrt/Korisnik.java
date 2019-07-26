package pausalniObrt;

public class Korisnik {
	private int sifra;
	private String ime;
	private String prezime;
	private String email;
	private String password;
		
	
	public Korisnik() {
	}


	public Korisnik(int sifra, String ime, String prezime, String email, String password) {
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.password = password;
	}


	public int getSifra() {
		return sifra;
	}


	public void setSifra(int sifra) {
		this.sifra = sifra;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	//pitaj Tomislava
	@Override
	public int hashCode() {
		int id = ime.hashCode()+prezime.hashCode()+ password.hashCode();
		return id;
	}
	
}
