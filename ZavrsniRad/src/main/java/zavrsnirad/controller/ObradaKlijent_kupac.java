/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.controller;

import java.util.ArrayList;
import java.util.List;
import zavrsnirad.model.Klijent_kupac;
import zavrsnirad.utility.DelagaException;
import zavrsnirad.utility.Kontrole;
import zavrsnirad.utility.ObradaInterface;

/**
 *
 * @author mirza
 */
public class ObradaKlijent_kupac extends Obrada<Klijent_kupac> implements ObradaInterface<Klijent_kupac>{

    public ObradaKlijent_kupac() {
        super();
    }
    
    

    @Override
    public Klijent_kupac create(Klijent_kupac kk) throws DelagaException {
        Kontrole.kontrolaNaziv(kk);
        Kontrole.kontrolaPostanskiBroj(kk);
        Kontrole.kontrolaOIB_JMBG(kk);
        dao.spremi(kk);
        return kk;
    }

    @Override
    public List<Klijent_kupac> read() {
        List<Klijent_kupac> kupci = new ArrayList<>();
        Klijent_kupac kk= new Klijent_kupac(1,"","","","","","");
        kupci.add(kk);
        return kupci;
    }

    @Override
    public void update(Klijent_kupac kk) throws DelagaException {
        Kontrole.kontrolaNaziv(kk);
        Kontrole.kontrolaPostanskiBroj(kk);
        Kontrole.kontrolaOIB_JMBG(kk);
        dao.spremi(kk);
    }

    @Override
    public boolean delete(Klijent_kupac kk) {
        System.out.println("Brišem kk");
        return true;
    }
    
}
