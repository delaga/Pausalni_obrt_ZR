/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.controller;

import java.util.List;
import org.hibernate.Session;
import zavrsnirad.utility.DelagaException;
import zavrsnirad.utility.HibernateUtil;

/**
 *
 * @author mirza
 */
public abstract  class Obrada<T> {
    protected abstract void kontrolaSpremi(T entitet)throws DelagaException;
    protected abstract void kontrolaBrisi(T entitet)throws DelagaException;
    public abstract List<T> getEntiteti();
    
    protected Session session;
    public Obrada() {
        this.session = HibernateUtil.getSession();
    }
    public T spremi(T entitet) throws DelagaException{
        kontrolaSpremi(entitet);
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
        return entitet;
    }
    
    public void brisi(T entitet)throws DelagaException{
        kontrolaBrisi(entitet);
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
    }
    
}
