/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author mirza
 */
@Entity
public class Stavka extends Entitet implements Serializable {

    @ManyToOne
    private Usluga_proizvod proizvod_id;
    @ManyToOne
    private Racun racun_id;
    private double rabat;
    private double kolicina;

    public Stavka() {
        super();
    }

    public Stavka(Usluga_proizvod proizvod_id, Racun racun_id, double rabat, double kolicina, Integer Id, Date vrijemeKreiranja, Date vrijemePromjene) {
        super(Id, vrijemeKreiranja, vrijemePromjene);
        this.proizvod_id = proizvod_id;
        this.racun_id = racun_id;
        this.rabat = rabat;
        this.kolicina = kolicina;
    }

    public Usluga_proizvod getProizvod_id() {
        return proizvod_id;
    }

    public void setProizvod_id(Usluga_proizvod proizvod_id) {
        this.proizvod_id = proizvod_id;
    }

    public Racun getRacun_id() {
        return racun_id;
    }

    public void setRacun_id(Racun racun_id) {
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