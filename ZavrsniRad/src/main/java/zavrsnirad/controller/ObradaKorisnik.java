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
        kontrolaImena(k);
        kontrolaPrezimena(k);
        kontrolaEmail(k);
        dao.spremi(k);
        return k;
    }

    @Override
    public void update(Korisnik k) throws DelagaException {

        kontrolaImena(k);
        kontrolaPrezimena(k);
        kontrolaEmail(k);

        dao.spremi(k);
    }

    @Override
    public boolean delete(Korisnik k) {

        System.out.println("Brišem korisnika");

        return true;
    }

    private void kontrolaImena(Korisnik k) throws DelagaException {
        if (k.getIme() != null) {
            k.setIme(k.getIme().trim());
        }
        if (k.getIme() == null || k.getIme().length() == 0) {
            throw new DelagaException("Ime mora biti postavljeno");
        }
        if (k.getIme().length() > 50) {
            throw new DelagaException("Mora biti kraće od 50 znakova");
        }
    }

    private void kontrolaPrezimena(Korisnik k) throws DelagaException {
        if (k.getPrezime() != null) {
            k.setPrezime(k.getPrezime().trim());
        }
        if (k.getPrezime() == null || k.getPrezime().length() == 0) {
            throw new DelagaException("Prezime mora biti postavljeno");
        }
        if (k.getPrezime().length() > 50) {
            throw new DelagaException("Mora biti kraće od 50 znakova");
        }
    }

    private static void kontrolaEmail(Korisnik k) throws DelagaException {
        String email = k.getEmail();
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            throw new DelagaException("Nije validan e-mail");
        }
    }
    //obrada Password kada skužim kako
}
