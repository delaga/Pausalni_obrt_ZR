/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Usluga_proizvod;
import zavrsnirad.utility.DelagaException;


/**
 *
 * @author mirza
 */
public class ObradaUsluga_proizvod extends Obrada<Usluga_proizvod>{
    
    public ObradaUsluga_proizvod(){
        super();
    }

    

    @Override
    protected void kontrolaSpremi(Usluga_proizvod entitet) throws DelagaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaBrisi(Usluga_proizvod entitet) throws DelagaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usluga_proizvod> getEntiteti() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
