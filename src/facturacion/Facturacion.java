/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import clases.Paciente;
import controller.PacienteController;
import hibernateUtil.BussinessException;
import java.util.List;

/**
 *
 * @author ANDRES
 */
public class Facturacion {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws BussinessException {
        PacienteController pacienteController= new PacienteController();
          List<Paciente> a =pacienteController.getByCed("V-123");
          System.out.println(a.size());
    }

   
}
