/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.model;

import java.sql.Date;

/**
 *
 * @author mirza
 */
public class Racun {
        private int id;
	private String broj_racuna;
	private int klijent_kupac_id;
	private Date datum_izdavanja;
	private Date datum_dospijeca;
	private Date datum_isporuke;
	private int izdao_user_id;
	private String napomena;
	private String nacin_placanja;
	private Double iznos_racuna;

    public Racun() {
    }
        
        

    public Racun(int id, String broj_racuna, int klijent_kupac_id, Date datum_izdavanja, Date datum_dospijeca, Date datum_isporuke, int izdao_user_id, String napomena, String nacin_placanja, Double iznos_racuna) {
        this.id = id;
        this.broj_racuna = broj_racuna;
        this.klijent_kupac_id = klijent_kupac_id;
        this.datum_izdavanja = datum_izdavanja;
        this.datum_dospijeca = datum_dospijeca;
        this.datum_isporuke = datum_isporuke;
        this.izdao_user_id = izdao_user_id;
        this.napomena = napomena;
        this.nacin_placanja = nacin_placanja;
        this.iznos_racuna = iznos_racuna;
    }
        
        
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBroj_racuna() {
        return broj_racuna;
    }

    public void setBroj_racuna(String broj_racuna) {
        this.broj_racuna = broj_racuna;
    }

    public int getKlijent_kupac_id() {
        return klijent_kupac_id;
    }

    public void setKlijent_kupac_id(int klijent_kupac_id) {
        this.klijent_kupac_id = klijent_kupac_id;
    }

    public Date getDatum_izdavanja() {
        return datum_izdavanja;
    }

    public void setDatum_izdavanja(Date datum_izdavanja) {
        this.datum_izdavanja = datum_izdavanja;
    }

    public Date getDatum_dospijeca() {
        return datum_dospijeca;
    }

    public void setDatum_dospijeca(Date datum_dospijeca) {
        this.datum_dospijeca = datum_dospijeca;
    }

    public Date getDatum_isporuke() {
        return datum_isporuke;
    }

    public void setDatum_isporuke(Date datum_isporuke) {
        this.datum_isporuke = datum_isporuke;
    }

    public int getIzdao_user_id() {
        return izdao_user_id;
    }

    public void setIzdao_user_id(int izdao_user_id) {
        this.izdao_user_id = izdao_user_id;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public String getNacin_placanja() {
        return nacin_placanja;
    }

    public void setNacin_placanja(String nacin_placanja) {
        this.nacin_placanja = nacin_placanja;
    }

    public Double getIznos_racuna() {
        return iznos_racuna;
    }

    public void setIznos_racuna(Double iznos_racuna) {
        this.iznos_racuna = iznos_racuna;
    }
        
        
}
