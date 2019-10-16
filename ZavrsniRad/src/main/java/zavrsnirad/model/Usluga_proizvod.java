/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.model;

/**
 *
 * @author mirza
 */
public class Usluga_proizvod {
        private int id;
	private String naziv;
	private String opis;
	private String jedinica_mjere;
	private Double cijena;

    public Usluga_proizvod() {
    }

    public Usluga_proizvod(int id, String naziv, String opis, String jedinica_mjere, Double cijena) {
        this.id = id;
        this.naziv = naziv;
        this.opis = opis;
        this.jedinica_mjere = jedinica_mjere;
        this.cijena = cijena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
