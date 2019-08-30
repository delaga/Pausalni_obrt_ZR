/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.PodaciOObrtu;
import zavrsnirad.utility.DelagaException;
import zavrsnirad.utility.Kontrole;
import zavrsnirad.utility.ObradaInterface;

/**
 *
 * @author mirza
 */
public class ObradaPodaciOObrtu extends Obrada<PodaciOObrtu> implements ObradaInterface<PodaciOObrtu>{
    
    public ObradaPodaciOObrtu(){
        super();
    }

    @Override
    public PodaciOObrtu create(PodaciOObrtu poo) throws DelagaException {
       
       return poo;
    }

    @Override
    public List<PodaciOObrtu> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(PodaciOObrtu entitet) throws DelagaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(PodaciOObrtu entitet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
