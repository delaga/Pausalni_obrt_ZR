/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad;

import javax.swing.JOptionPane;
import zavrsnirad.controller.ObradaKorisnik;
import zavrsnirad.model.Korisnik;
import zavrsnirad.utility.DelagaException;

/**
 *
 * @author mirza
 */
public class Start {
    public static void main(String[] args) {
        Korisnik k = new Korisnik();
        k.setIme(JOptionPane.showInputDialog("Unesi ime novog korisnika"));
        
        ObradaKorisnik okk= new ObradaKorisnik();
        try {
            okk.create(k);
        } catch (DelagaException ex) {
            System.out.println(ex.getPoruka());
        }
    }
}
