/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import controller.GrupoPruebasController;
import controller.PruebaController;
import static facturacion.Interfaz_principal.jDesktopPane1;
import hibernateUtil.BussinessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author marcosguti
 */
public class JMenuRootTree extends JPopupMenu {
   private static String prueba;
    public JMenuRootTree(String Prueba) {
        prueba=Prueba;
        
        JMenuItem jMenuItem = new JMenuItem("Agregar Area");
        jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemActionPerformed(evt);
            }
        });
        this.add(jMenuItem);
     
    }
   private void jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                           
            
        Interfaz_GrupoPruebas interfaz_GrupoPruebas= new Interfaz_GrupoPruebas();
       jDesktopPane1.add(interfaz_GrupoPruebas);
       interfaz_GrupoPruebas.show();          
            
    
    } 
   
   
//                    JOptionPane.showConfirmDialog (null, "Would You Like to Save your Previous Note First?","Warning",dialogButton);
    
}
