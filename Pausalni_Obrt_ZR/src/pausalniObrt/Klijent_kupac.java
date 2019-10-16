package pausalniObrt;

public class Klijent_kupac {
	private int sifra;
	private String naziv;
	private String adresa;
	private String postanski_broj;
	private String grad;
	private String drzava;
	private String oib;
	
		
	public Klijent_kupac() {
	}
	
	public Klijent_kupac(int sifra, String naziv, String adresa, String postanski_broj, String grad, String drzava,
			String oib) {
		this.sifra = sifra;
		this.naziv = naziv;
		this.adresa = adresa;
		this.postanski_broj = postanski_broj;
		this.grad = grad;
		this.drzava = drzava;
		this.oib = oib;
	}
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getPostanski_broj() {
		return postanski_broj;
	}
	public void setPostanski_broj(String postanski_broj) {
		this.postanski_broj = postanski_broj;
	}
	public String getGrad() {
		return grad;
	}
	public void setGrad(String grad) {
		this.grad = grad;
	}
	public String getDrzava() {
		return drzava;
	}
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}
	public String getOib() {
		return oib;
	}
	public void setOib(String oib) {
		this.oib = oib;
	}
	
	
	
}
