/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import controller.GrupoPruebasController;
import controller.PacienteController;
import controller.PruebaController;
import facturacion.Interfaz_principal;
import hibernateUtil.BussinessException;
import java.util.List;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author ANDRES
 */
public class Aplication {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws BussinessException {
       new Interfaz_principal().setVisible(true);
//            GrupoPruebasController grupoPruebasController = new GrupoPruebasController();
//            GrupoPruebas grupoPruebas= new GrupoPruebas("HEMATOLOGIA");
//            grupoPruebasController.guardar(grupoPruebas);
//             List<GrupoPruebas> a= grupoPruebasController.getAll();
//		GrupoPruebas b= a.get(0);
//                PruebaController pruebaController= new PruebaController();
//                Prueba prueba=new Prueba("TGP", "lb/s", "21-22", b, 2000);
//                pruebaController.guardar(prueba);
    }

   
}
