package pausalniObrt;

public class Stavka {
	private int sifra;
	private int proizvod_id;
	private int racun_id;
	private double rabat;
	private double kolicina;
	
	
	
	
	public Stavka() {
		}
	
	public Stavka(int sifra, int proizvod_id, int racun_id, double rabat, double kolicina) {
		this.sifra = sifra;
		this.proizvod_id = proizvod_id;
		this.racun_id = racun_id;
		this.rabat = rabat;
		this.kolicina = kolicina;
	}
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public int getProizvod_id() {
		return proizvod_id;
	}
	public void setProizvod_id(int proizvod_id) {
		this.proizvod_id = proizvod_id;
	}
	public int getRacun_id() {
		return racun_id;
	}
	public void setRacun_id(int racun_id) {
		this.racun_id = racun_id;
	}
	public double getRabat() {
		return rabat;
	}
	public void setRabat(double rabat) {
		this.rabat = rabat;
	}
	public double getKolicina() {
		return kolicina;
	}
	public void setKolicina(double kolicina) {
		this.kolicina = kolicina;
	}
	
	
}
