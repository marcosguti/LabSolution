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
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public final class TreeInterfazPrincipal extends JTree {

    private final JTree tree = this;

    public TreeInterfazPrincipal() {
        PruebaController pruebaController = new PruebaController();
        GrupoPruebasController grupoPruebasController = new GrupoPruebasController();
        List<GrupoPruebas> grupoPruebas = null;
        try {
            grupoPruebas = grupoPruebasController.getAll();
        } catch (BussinessException ex) {
            Logger.getLogger(TreeInterfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Prueba");
        if (grupoPruebas != null) {
            for (GrupoPruebas grupoPrueba : grupoPruebas) {
                try {
                    DefaultMutableTreeNode Area = new DefaultMutableTreeNode(grupoPrueba.getNombre());
                    List<Prueba> pruebas = pruebaController.getPruebas(grupoPrueba.getNombre());
                    if (pruebas != null) {
                        for (Prueba pruebaActual : pruebas) {
                            DefaultMutableTreeNode prueba = new DefaultMutableTreeNode(pruebaActual.getNombre());

                            Area.add(prueba);
                        }
                    } else {
                        continue;
                    }

                    root.add(Area);
                } catch (BussinessException ex) {
                    Logger.getLogger(TreeInterfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        //add the child nodes to the root node

        this.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
//    this.setComponentPopupMenu(menu);
        //create the tree by passing in the root node
        TreeModel treeModel = new DefaultTreeModel(root);
        this.setModel(treeModel);
//        this.addTreeSelectionListener(createSelectionListener());
//        this.setCellRenderer(new DefaultTreeCellRenderer() {
//            private Icon loadIcon = UIManager.getIcon("OptionPane.errorIcon");
//            private Icon saveIcon = UIManager.getIcon("OptionPane.informationIcon");
//            
//            @Override
//            public Component getTreeCellRendererComponent(JTree tree,
//                    Object value, boolean selected, boolean expanded,
//                    boolean isLeaf, int row, boolean focused) {
//                Component c = super.getTreeCellRendererComponent(tree, value,
//                        selected, expanded, isLeaf, row, focused);
//                if (selected) {
//                    setIcon(loadIcon);
//                } else {
//                    setIcon(saveIcon);
//                }
//                return c;
//            }
//        });
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    TreePath path = tree.getPathForLocation(e.getX(), e.getY());

//                        DefaultMutableTreeNode nodo= (DefaultMutableTreeNode) path.getLastPathComponent();
                    DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                    Rectangle pathBounds = tree.getUI().getPathBounds(tree, path);

                    if (pathBounds != null && pathBounds.contains(e.getX(), e.getY())) {
                        if (nodo.getLevel() == 0 && Interfaz_principal.jMenuItemPruebaNuevaArea.isEnabled()) {
                            String p = (String) nodo.getUserObject();
                            JMenuRootTree menu = new JMenuRootTree(p);

                            menu.show(tree, pathBounds.x + pathBounds.width, pathBounds.y);
                        }
                        if (nodo.getLevel() == 1) {
                            String p = (String) nodo.getUserObject();
                            JMenuGrupoPruebasTree menu = new JMenuGrupoPruebasTree(p);

                            menu.show(tree, pathBounds.x + pathBounds.width, pathBounds.y);
                        }
                        if (nodo.getLevel() == 2) {
                            String p = (String) nodo.getUserObject();
                            JMenuPruebaTree menu = new JMenuPruebaTree(p);

                            menu.show(tree, pathBounds.x + pathBounds.width, pathBounds.y);
                        }
                    }
                }
                if (e.getClickCount() == 2 && !e.isConsumed()) {
                    TreePath path = tree.getPathForLocation(e.getX(), e.getY());

//                        DefaultMutableTreeNode nodo= (DefaultMutableTreeNode) path.getLastPathComponent();
                    DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                    Rectangle pathBounds = tree.getUI().getPathBounds(tree, path);
                    if (pathBounds != null && pathBounds.contains(e.getX(), e.getY())) {
                        if (nodo.getLevel() == 2) {
                             String p = (String) nodo.getUserObject();
                            PruebaController pp = new PruebaController();
                            GrupoPruebasController gp = new GrupoPruebasController();

                            Prueba treePrueba = null;
                            try {
                                treePrueba = pp.get(p);
                            } catch (BussinessException ex) {
                                Logger.getLogger(TreeInterfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            List<Prueba> temp = new ArrayList<Prueba>();
                            List<Prueba> temp2 = new ArrayList<Prueba>();
//                            temp2 = StaticVarsBusiness.mapPruebas.get(treePrueba.getGrupoPruebas().getNombre());
                            if (StaticVarsBusiness.mapPruebas.get(treePrueba.getGrupoPruebas().getNombre()) == null) {
                                temp.add(treePrueba);
                                StaticVarsBusiness.PruebasEnTabla.put(treePrueba.getNombre(), treePrueba);
                                StaticVarsBusiness.mapPruebas.put(treePrueba.getGrupoPruebas().getNombre(), new ArrayList<Prueba>(temp));
                                if (Interfaz_Resultado.jLabelTotalValor.getText().equals("0 Bs")) {
                                    Interfaz_Resultado.jLabelTotalValor.setText(String.valueOf(treePrueba.getPrecio() + " Bs"));
                                } else {
                                    int precio = Integer.parseInt(Interfaz_Resultado.jLabelTotalValor.getText().replaceAll(" Bs", ""));
                                    precio += treePrueba.getPrecio();
                                    Interfaz_Resultado.jLabelTotalValor.setText(String.valueOf(precio) + " Bs");
                                }
                            } else {
//                 if ((StaticVarsBusiness.mapPruebas.get(treePrueba.getGrupoPruebas().getNombre())).indexOf(treePrueba)!=-1) {
                                temp = StaticVarsBusiness.mapPruebas.get(treePrueba.getGrupoPruebas().getNombre());
                                if (StaticVarsBusiness.PruebasEnTabla.get(treePrueba.getNombre()) == null) {
                                    temp.add(treePrueba);
                                    StaticVarsBusiness.PruebasEnTabla.put(treePrueba.getNombre(), treePrueba);
                                    StaticVarsBusiness.mapPruebas.put(treePrueba.getGrupoPruebas().getNombre(), new ArrayList<Prueba>(temp));
                                    if (Interfaz_Resultado.jLabelTotalValor.getText().equals("0 Bs")) {
                                        Interfaz_Resultado.jLabelTotalValor.setText(String.valueOf(treePrueba.getPrecio() + " Bs"));
                                    } else {
                                        int precio = Integer.parseInt(Interfaz_Resultado.jLabelTotalValor.getText().replaceAll(" Bs", ""));
                                        precio += treePrueba.getPrecio();
                                        Interfaz_Resultado.jLabelTotalValor.setText(String.valueOf(precio) + " Bs");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "Ya agrego esta prueba ", "Mensaje",
                                            JOptionPane.INFORMATION_MESSAGE);
                                }

                            }
                            Interfaz_Resultado.jScrollPane1.setViewportView(new JTablePruebas());
                        }
                    }
                    e.isConsumed();
                }
            }
        });
    }
}
