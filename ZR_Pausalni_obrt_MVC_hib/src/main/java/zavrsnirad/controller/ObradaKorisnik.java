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
import zavrsnirad.model.Klijent_kupac;
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
        kontrolaIme(k);
        kontrolaPrezime(k);
        kontrolaEmail(k);
        //kontrolaLozinka(k);
        kontrolaMobitel(k);
        kontrolaURL_potpis(k);
        dao.spremi(k);
        return k;
    }

    @Override
    public void update(Korisnik k) throws DelagaException {

        kontrolaIme(k);
        kontrolaPrezime(k);
        kontrolaEmail(k);
        //kontrolaLozinka(k);
        kontrolaMobitel(k);
        kontrolaURL_potpis(k);
        dao.spremi(k);
    }

    @Override
    public boolean delete(Korisnik k) {

        System.out.println("Brišem korisnika");

        return true;
    }
    public static void kontrolaIme(Korisnik k) throws DelagaException{
         if (k.getIme() != null) {
            k.setIme(k.getIme().trim());
        }
        if (k.getIme() == null || k.getIme().length() == 0) {
            throw new DelagaException("Ime mora biti postavljeno");
        }
        if (k.getIme().length() > 33) {
            throw new DelagaException("Mora biti kraće od 50 znakova");
        }
    }
    public static void kontrolaPrezime(Korisnik k) throws DelagaException{
         if (k.getPrezime()!= null) {
            k.setPrezime(k.getPrezime().trim());
        }
        if (k.getPrezime()== null || k.getPrezime().length() == 0) {
            throw new DelagaException("Prezime mora biti postavljeno");
        }
        if (k.getPrezime().length() > 33) {
            throw new DelagaException("Mora biti kraće od 50 znakova");
        }
    }
    public static void kontrolaNaziv(Klijent_kupac kk) throws DelagaException {
        if (kk.getNaziv()!= null) {
            kk.setNaziv(kk.getNaziv().trim());
        }
        if (kk.getNaziv() == null || kk.getNaziv().length() == 0) {
            throw new DelagaException("Naziv mora biti postavljen");
        }
        if (kk.getNaziv().length() > 33) {
            throw new DelagaException("Mora biti kraće od 50 znakova");
        }
    }
    public static void kontrolaEmail(Korisnik k) throws DelagaException {
        String email = k.getEmail();
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            throw new DelagaException("Nije validan e-mail");
        }
    }
    public static void kontrolaMobitel(Korisnik k) throws DelagaException {
        String broj=k.getMobitel();
        for (char c : broj.toCharArray()) {
            if(!Character.isDigit(c)){
                throw new DelagaException("Slova nisu tel.broj");
            }
        }
    }
    public static void kontrolaURL_potpis(Korisnik k) throws DelagaException {
        String url=k.getPotpis_URL();
        try {
            (new java.net.URL(url)).openStream().close();
            
            } 
        catch (Exception ex) { }
            throw new DelagaException("Ne valja URL");
    }
    
    
    
        
}
