/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import clases.Prueba;
import dao.PruebaDAO;
import dao.PruebaDAOImpl;
import hibernateUtil.BussinessException;
import java.util.List;

/**
 *
 * @author marcosguti
 */
public class PruebaController {
    
    PruebaDAO grupoPruebasDAO;

    public PruebaController() {
        grupoPruebasDAO=new PruebaDAOImpl();
    }

    public void guardar(Prueba grupoPruebas) throws BussinessException {

    	grupoPruebasDAO.saveOrUpdate(grupoPruebas);
    }
    
    public List< Prueba >getAll( ) throws BussinessException {

    	return grupoPruebasDAO.findAll();
    }
    public List<Prueba> getPruebas(String nombre) throws BussinessException{
        return grupoPruebasDAO.getPruebas(nombre);
    }
}
