/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.utility;

import java.util.List;

/**
 *
 * @author mirza
 */
public interface ObradaInterface<T> {
    public T create(T entitet) throws DelagaException;
    public List<T> read();
    public void update(T entitet) throws DelagaException;
    public boolean delete(T entitet);
    
}
