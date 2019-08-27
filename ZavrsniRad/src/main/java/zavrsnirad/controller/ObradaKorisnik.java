/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.controller;

import java.util.ArrayList;
import java.util.List;
import zavrsnirad.model.Korisnik;
import zavrsnirad.utility.DelagaException;
import zavrsnirad.utility.ObradaInterface;

/**
 *
 * @author mirza
 */
public class ObradaKorisnik extends Obrada<Korisnik> implements ObradaInterface<Korisnik>{
    
    public ObradaKorisnik(){
    super();
    }
    
    public List<Korisnik> read (){
        List<Korisnik> korisnici= new ArrayList<>();
        Korisnik k=new Korisnik(1,"Pero","Peric","mail@mail.com","nekiPass");
        korisnici.add(k);
        return korisnici;
    }
    public Korisnik create(Korisnik k) throws DelagaException{
        kontrolaImena(k);
        dao.spremi(k);
        return k;
    }
    public void update(Korisnik k) throws DelagaException{
        
        kontrolaImena(k);
        
        dao.spremi(k);
    }
    public boolean delete(Korisnik k){
        
        System.out.println("Brišem korisnika");
        
        return true;
    }

    private void kontrolaImena(Korisnik k) throws DelagaException{
        if(k.getIme()!=null){
            k.setIme(k.getIme().trim());
        }
        if(k.getIme()== null || k.getIme().length()==0){
            throw new DelagaException("Ime mora biti postavljeno");
        }
        if(k.getIme().length()>50){
            throw new DelagaException("Mora biti kraće od 50 znakova");
        }
    }
    
}
