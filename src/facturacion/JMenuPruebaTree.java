/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import clases.Prueba;
import controller.PruebaController;
import static facturacion.Interfaz_principal.jDesktopPane1;
import hibernateUtil.BussinessException;
import java.util.ArrayList;
import java.util.List;
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
public class JMenuPruebaTree extends JPopupMenu {

    private static String prueba;
    private static PruebaController pruebaController = new PruebaController();

    public JMenuPruebaTree(String Prueba) {
        prueba = Prueba;
        JMenuItem jMenuItem2 = new JMenuItem("Eliminar");
        JMenuItem jMenuItem3 = new JMenuItem("Usar->");
        JMenuItem jMenuItem = new JMenuItem("Modificar");
        jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemActionPerformed(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jMenuItem2ActionPerformed(evt);
                } catch (BussinessException ex) {
                    Logger.getLogger(JMenuPruebaTree.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jMenuItem3ActionPerformed(evt);

            }
        });
        this.add(jMenuItem3);

        this.add(jMenuItem);
        this.add(jMenuItem2);
    }

    private void jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {

        Interfaz_Prueba interfaz_Prueba = new Interfaz_Prueba();
        jDesktopPane1.add(interfaz_Prueba);
        interfaz_Prueba.show();

    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) throws BussinessException {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int respuesta = JOptionPane.showConfirmDialog(null, "Desea Eliminar el elemento Seleccionado", "", dialogButton);
        if (respuesta == 0) {
            pruebaController.delete(prueba);
            Interfaz_principal.jScrollPane1.setViewportView(new TreeInterfazPrincipal());
        }

    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        PruebaController pp = new PruebaController();
        try {
            Prueba treePrueba = pp.get(prueba);
            List<Prueba> temp = new ArrayList<Prueba>();

                if (StaticVarsBusiness.mapPruebas.get("Hematologia") == null) {
                    
                    temp.add(treePrueba);
                    StaticVarsBusiness.mapPruebas.put("Hematologia", new ArrayList<Prueba>(temp));
                } else {
                   
                    temp = StaticVarsBusiness.mapPruebas.get("Hematologia");
                    temp.add(treePrueba);
                    StaticVarsBusiness.mapPruebas.put("Hematologia", new ArrayList<Prueba>(temp));
                }
                temp.clear();
            Interfaz_Resultado.jScrollPane1.setViewportView(new JTablePruebas());
            
//           JTablePruebas.dtm.addRow(new Object[]{treePrueba.getNombre(), "", treePrueba.getLimites()});
        } catch (BussinessException ex) {
            Logger.getLogger(JMenuPruebaTree.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//                    JOptionPane.showConfirmDialog (null, "Would You Like to Save your Previous Note First?","Warning",dialogButton);
}
