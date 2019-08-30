/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad;

import zavrsnirad.utility.HibernateUtil;



/**
 *
 * @author mirza
 */
public class Start {
    public static void main(String[] args) {
        HibernateUtil.getSession();
    }
}
