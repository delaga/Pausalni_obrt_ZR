/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.utility;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import zavrsnirad.model.Korisnik;

/**
 *
 * @author mirza
 */
public class Kontrole {
    
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
    
    public static void kontrolaPrezime(Korisnik k) throws DelagaException {
        if (k.getPrezime() != null) {
            k.setPrezime(k.getPrezime().trim());
        }
        if (k.getPrezime() == null || k.getPrezime().length() == 0) {
            throw new DelagaException("Prezime mora biti postavljeno");
        }
        if (k.getPrezime().length() > 33) {
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
        String url=k.getURL_potpisa();
        try {
            (new java.net.URL(url)).openStream().close();
            
            } 
        catch (Exception ex) { }
            throw new DelagaException("Ne valja URL");
    }
    
    
}
