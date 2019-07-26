package pausalniObrt;

public class Usluga_Proizvod {
	private int sifra;
	private String naziv;
	private String opis;
	private String jedinica_mjere;
	private Double cijena;
	
	//puni konstruktor
	public Usluga_Proizvod(int sifra, String naziv, String opis, String jedinica_mjere, Double cijena) {
		this.sifra = sifra;
		this.naziv = naziv;
		this.opis = opis;
		this.jedinica_mjere = jedinica_mjere;
		this.cijena = cijena;
	}
	
	//prazni konstruktor
	public Usluga_Proizvod() {
	}

	//geteri i seteri
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
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public String getJedinica_mjere() {
		return jedinica_mjere;
	}
	public void setJedinica_mjere(String jedinica_mjere) {
		this.jedinica_mjere = jedinica_mjere;
	}
	public Double getCijena() {
		return cijena;
	}
	public void setCijena(Double cijena) {
		this.cijena = cijena;
	}
	
	
}
