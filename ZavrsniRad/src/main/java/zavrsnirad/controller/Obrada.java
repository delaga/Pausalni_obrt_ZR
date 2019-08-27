/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.controller;

import zavrsnirad.utility.DAO;

/**
 *
 * @author mirza
 */
public class Obrada<T> {
    protected DAO<T> dao;
    public Obrada(){
        dao= new DAO<>();
    }
}
