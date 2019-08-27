/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.controller;

import java.util.ArrayList;
import java.util.List;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import zavrsnirad.model.Korisnik;
import zavrsnirad.utility.DelagaException;
import zavrsnirad.utility.Kontrole;
import zavrsnirad.utility.ObradaInterface;

/**
 *
 * @author mirza
 */
public class ObradaKorisnik extends Obrada<Korisnik> implements ObradaInterface<Korisnik> {

    public ObradaKorisnik() {
        super();
    }

    @Override
    public List<Korisnik> read() {
        List<Korisnik> korisnici = new ArrayList<>();
        Korisnik k = new Korisnik(1, "Pero", "Peric", "mail@mail.com", "nekiPass", "0914510004", "https//nekaDomena.com/slika.png");
        korisnici.add(k);
        return korisnici;
    }

    @Override
    public Korisnik create(Korisnik k) throws DelagaException {
        Kontrole.kontrolaIme(k);
        Kontrole.kontrolaPrezime(k);
        Kontrole.kontrolaEmail(k);
        //kontrolaLozinka(k);
        Kontrole.kontrolaMobitel(k);
        Kontrole.kontrolaURL_potpis(k);
        dao.spremi(k);
        return k;
    }

    @Override
    public void update(Korisnik k) throws DelagaException {

        Kontrole.kontrolaIme(k);
        Kontrole.kontrolaPrezime(k);
        Kontrole.kontrolaEmail(k);
        //kontrolaLozinka(k);
        Kontrole.kontrolaMobitel(k);
        Kontrole.kontrolaURL_potpis(k);
        dao.spremi(k);
    }

    @Override
    public boolean delete(Korisnik k) {

        System.out.println("Brišem korisnika");

        return true;
    }

    }
    
    

