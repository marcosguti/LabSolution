/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import clases.Paciente;
import controller.PacienteController;
import controller.ResultadoController;
import dao.PacienteDAOImpl;
import static facturacion.Interfaz_principal.jMenuItemPacienteBuscar;
import static facturacion.Interfaz_principal.jMenuItemPacienteNuevo;
import hibernateUtil.BussinessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ANDRES
 */
public class Interfaz_BuscarResultados extends javax.swing.JInternalFrame {

    ResultadoController resultadoController = new ResultadoController();
    private Object[][] datostabla;
//    public static PacieSnte paciente = null;

    public Interfaz_BuscarResultados() {
        initComponents();
//        mostrar_tabla();

    }

//    public void mostrar_tabla() {
//
////        control_cliente control = new control_cliente("Documento","Tipo de documento","Nombres","Apellidos","Direccion","Ciudad","telefono");       
//        String[] columnas = {"Nombre", "Cedula", "Edad", "Sexo", "Telefono", "Direccion"};
//        List<Paciente> pacientes = new ArrayList<Paciente>();
//        try {
//            pacientes = pacienteController.getAllOrdered();
//        } catch (BussinessException ex) {
//            Logger.getLogger(Interfaz_BuscarPacientes.class.getName()).log(Level.SEVERE, null, ex);
//        }
////        datostabla = control.consulta_clientes();
////     ;
//        datostabla = new Object[pacientes.size()][6];
//        int i = 0;
//        for (Paciente paciente : pacientes) {
//
//            datostabla[i][0] = paciente.getNombres();
////            datostabla[i][1] = paciente.getApellidos();
//            datostabla[i][1] = paciente.getCedula();
//            datostabla[i][2] = paciente.getEdad();
//            datostabla[i][3] = paciente.getSexo();
//            datostabla[i][4] = paciente.getTelefono();
//            datostabla[i][5] = paciente.getDireccion();
//
//            i++;
//        }
//        DefaultTableModel model = new DefaultTableModel(datostabla, columnas) {
//            public Class getColumnClass(int column) {
//                Class returnValue;
//                if ((column >= 0) && (column < getColumnCount())) {
//                    returnValue = getValueAt(0, column).getClass();
//                } else {
//                    returnValue = Object.class;
//                }
//                return returnValue;
//            }
//
//            public boolean isCellEditable(int row, int column) {
//                return false;
//            }
//        };
//        jTable1.setModel(model);
//        sorter.setModel(model);
//        jTable1.setRowSorter(sorter);
//        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
//            @Override
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
////                if (SwingUtilities.isRightMouseButton(evt)) {
//                int row = jTable1.rowAtPoint(evt.getPoint());
//                int col = jTable1.columnAtPoint(evt.getPoint());
//                Object n = jTable1.getModel().getValueAt(row, 0);
//                Object c = jTable1.getModel().getValueAt(row, 1);
//                String ced = c.toString().replaceAll(" ", "");
//                System.out.println(n.toString() + "----- " + c.toString());
//
//                try {
//                    paciente = pacienteController.getByNombreCedula("Marco Gutierrez", ced);
//                } catch (BussinessException ex) {
//                    Logger.getLogger(JTablePacientes.class.getName()).log(Level.SEVERE, null, ex);
//                }
////                                
//
//            }
//        });
////        DefaultTableModel datos = new DefaultTableModel(datostabla,columnas);
////        jTable1.setModel(datos);
//
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar Resultados");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtfBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarPacienteActionPerformed(evt);
            }
        });
        jtfBuscarPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfBuscarPacienteKeyReleased(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = jtfBuscarPaciente.getText();
                if (text.length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter(text));
                }
            }
        });
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");

        jScrollPane2.setViewportView(new JTableResultados());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonBuscar)
                        .addGap(27, 27, 27)
                        .addComponent(jtfBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButtonBuscar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Interfaz_principal.jMenuItemResultadoBuscar.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarPacienteActionPerformed

    }//GEN-LAST:event_jtfBuscarPacienteActionPerformed

    private void jtfBuscarPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBuscarPacienteKeyReleased

    }//GEN-LAST:event_jtfBuscarPacienteKeyReleased

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
//        int dialogButton = JOptionPane.YES_NO_OPTION;
//
//        if (JTablePacientes.paciente != null) {
//            int respuesta = JOptionPane.showConfirmDialog(null, "Desea Eliminar el elemento Seleccionado", "", dialogButton);
//            if (respuesta == 0) {
//                try {
//                    resultadoController.delete(JTablePacientes.paciente.getId());
////                    mostrar_tabla();
//                    
//                    Interfaz_principal.jScrollPane2.setViewportView(new JTablePacientes(true));
//                    jScrollPane2.setViewportView(new JTablePacientes(false));
//                } catch (BussinessException ex) {
//                    JOptionPane.showMessageDialog(this,
//                            "Error al eliminar el paciente");
//                    Logger.getLogger(Interfaz_BuscarResultados.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        } else {
//            JOptionPane.showMessageDialog(this,
//                    "Por Favor Seleccione un Registro");
//        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    public static javax.swing.JScrollPane jScrollPane2;
    private final javax.swing.JTextField jtfBuscarPaciente = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
private final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>();
}
