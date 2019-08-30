/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author mirza
 */
@Entity
public class Stavka implements Serializable{
        @Id
        private int id;
	private int proizvod_id;
	private int racun_id;
	private double rabat;
	private double kolicina;
			
	public Stavka() {
		}

    public Stavka(int id, int proizvod_id, int racun_id, double rabat, double kolicina) {
        this.id = id;
        this.proizvod_id = proizvod_id;
        this.racun_id = racun_id;
        this.rabat = rabat;
        this.kolicina = kolicina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
