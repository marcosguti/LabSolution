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
import java.awt.Dimension;
import java.awt.Toolkit;
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
        Interfaz_principal interfaz_principal = new Interfaz_principal();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        interfaz_principal.setBounds(0, 0, screenSize.width, screenSize.height-50);
        interfaz_principal.setVisible(true);
//        SplashScreen sp = new SplashScreen();
//        sp.setLocationRelativeTo(null);
//        sp.setVisible(true);

    }

}
