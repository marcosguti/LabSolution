/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import controller.GrupoPruebasController;
import controller.PacienteController;
import controller.PruebaController;
import facturacion.Interfaz_principal;
import facturacion.SplashScreen;
import hibernateUtil.BussinessException;
import java.util.List;
import javax.swing.UIManager;
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
        
        SplashScreen sp = new SplashScreen();
        sp.setSize(700, 500);
        sp.setLocationRelativeTo(null);
        sp.setVisible(true);
//            GrupoPruebasController grupoPruebasController = new GrupoPruebasController();
//        PruebaController pruebaController=new PruebaController();
//            GrupoPruebas grupoPruebas= new GrupoPruebas("HEMATOLOGIA");
//            grupoPruebasController.guardar(grupoPruebas);
//             List<Prueba> a= pruebaController.getPruebas("HEMATOLOGIA");
//             System.out.println(a.size());
//		GrupoPruebas b= a.get(0);
//                PruebaController pruebaController= new PruebaController();
//                Prueba prueba=new Prueba("TGP", "lb/s", "21-22", b, 2000);
//                pruebaController.guardar(prueba);
    }
    
}
