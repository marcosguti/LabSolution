/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;


import clases.GrupoPruebas;
import clases.Prueba;
import controller.GrupoPruebasController;
import controller.PruebaController;
import hibernateUtil.BussinessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
 
public class TreeInterfazPrincipal extends JTree 
{
    private JTree tree;
    public TreeInterfazPrincipal() 
    {
          PruebaController pruebaController = new PruebaController();
        GrupoPruebasController grupoPruebasController =new GrupoPruebasController();
      List<GrupoPruebas> grupoPruebas=null;
        try {
            grupoPruebas = grupoPruebasController.getAll();
        } catch (BussinessException ex) {
            Logger.getLogger(TreeInterfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Prueba");
        if(grupoPruebas!=null){
        for (GrupoPruebas grupoPrueba : grupoPruebas) {
              try {
                  DefaultMutableTreeNode Area = new DefaultMutableTreeNode(grupoPrueba.getNombre());
                  List<Prueba> pruebas= pruebaController.getPruebas(grupoPrueba.getNombre());
            if(pruebas!=null){
                for (Prueba pruebaActual : pruebas) {
                    DefaultMutableTreeNode prueba= new DefaultMutableTreeNode(pruebaActual.getNombre());
                    Area.add(prueba);
                }
            }else{
                continue;
            }
                  
                  root.add(Area);
              } catch (BussinessException ex) {
                  Logger.getLogger(TreeInterfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
     
        }
        //add the child nodes to the root node
        
         
        //create the tree by passing in the root node
         TreeModel treeModel =new  DefaultTreeModel(root);
        this.setModel(treeModel);
        
       
    
    }
      
}