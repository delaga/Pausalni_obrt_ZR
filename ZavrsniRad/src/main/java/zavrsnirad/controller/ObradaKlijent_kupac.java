/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Klijent_kupac;
import zavrsnirad.utility.DelagaException;
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
    public Klijent_kupac create(Klijent_kupac entitet) throws DelagaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Klijent_kupac> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Klijent_kupac entitet) throws DelagaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Klijent_kupac entitet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
