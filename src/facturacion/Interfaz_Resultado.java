/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import clases.PruebaResultado;
import clases.Resultado;
import controller.PacienteController;
import controller.PruebaResultadoController;
import controller.ResultadoController;
import dao.ReportDaoImpl;
import static facturacion.Interfaz_principal.jDesktopPane1;
import hibernateUtil.BussinessException;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author ANDRES
 */
public class Interfaz_Resultado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Interfaz_actualizarstock
     */
    public Interfaz_Resultado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jPanelDatosPaciente = new javax.swing.JPanel();
        jLabelCedulaValor = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelIDValor = new javax.swing.JLabel();
        jLabelFechaValor = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelNombreValor = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelEdadValor = new javax.swing.JLabel();
        jLabelDireccionValor = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelSexoValor = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jLabelObservaciones = new javax.swing.JLabel();
        jLabelTelefonoValor = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldObservacionesValor = new javax.swing.JTextField();
        jButtonImrimir = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jButtonBorrarDatosPaciente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButtonBorrarDatosResultado = new javax.swing.JButton();

        setBackground(java.awt.Color.white);
        setTitle("Resultado");

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jPanelDatosPaciente.setBackground(java.awt.Color.white);
        jPanelDatosPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCedulaValor.setToolTipText("");
        jLabelCedulaValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelID.setText("ID");

        jLabelNombre.setText("Nombre");

        jLabelIDValor.setToolTipText("");
        jLabelIDValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelFechaValor.setToolTipText("");
        jLabelFechaValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelFecha.setText("Fecha");

        jLabelNombreValor.setToolTipText("");
        jLabelNombreValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelEdad.setText("Edad");

        jLabelDireccion.setText("Direccion");

        jLabelEdadValor.setToolTipText("");
        jLabelEdadValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelDireccionValor.setToolTipText("");
        jLabelDireccionValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelSexo.setText("Sexo");

        jLabelSexoValor.setToolTipText("");
        jLabelSexoValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCedula.setText("Cedula");

        jLabelObservaciones.setText("Observaciones");

        jLabelTelefonoValor.setToolTipText("");
        jLabelTelefonoValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTelefono.setText("Telefono");

        jTextFieldObservacionesValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldObservacionesValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosPacienteLayout = new javax.swing.GroupLayout(jPanelDatosPaciente);
        jPanelDatosPaciente.setLayout(jPanelDatosPacienteLayout);
        jPanelDatosPacienteLayout.setHorizontalGroup(
            jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosPacienteLayout.createSequentialGroup()
                        .addGroup(jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDatosPacienteLayout.createSequentialGroup()
                                .addGroup(jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombreValor, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelDatosPacienteLayout.createSequentialGroup()
                                        .addComponent(jLabelEdadValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabelSexo)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabelSexoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCedula)
                                    .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelCedulaValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelFechaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosPacienteLayout.createSequentialGroup()
                                .addComponent(jLabelDireccionValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelTelefono)))
                        .addGroup(jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosPacienteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelIDValor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosPacienteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTelefonoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelDatosPacienteLayout.createSequentialGroup()
                        .addComponent(jLabelObservaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldObservacionesValor)))
                .addContainerGap())
        );
        jPanelDatosPacienteLayout.setVerticalGroup(
            jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelNombreValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEdad)
                    .addComponent(jLabelEdadValor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSexo)
                    .addComponent(jLabelSexoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCedulaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCedula)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelIDValor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelID)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDireccion)
                    .addComponent(jLabelDireccionValor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefonoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelObservaciones)
                    .addComponent(jTextFieldObservacionesValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonImrimir.setText("Imprimir");
        jButtonImrimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImrimirActionPerformed(evt);
            }
        });

        jButtonBorrarDatosPaciente.setText("Borrar");
        jButtonBorrarDatosPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarDatosPacienteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(new JPanelPruebas(), BorderLayout.CENTER);

        jScrollPane1.setViewportView(new JTablePruebas());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonBorrarDatosResultado.setText("Borrar");
        jButtonBorrarDatosResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarDatosResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelDatosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBorrarDatosPaciente)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonImrimir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addComponent(jButtonSalir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonBorrarDatosResultado)
                                        .addContainerGap(49, Short.MAX_VALUE))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButtonBorrarDatosPaciente))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelDatosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonImrimir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jButtonBorrarDatosResultado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
        Interfaz_principal.jMenuItemResultadoNuevo.setEnabled(true);
        StaticVarsBusiness.mapPruebas.clear();
        StaticVarsBusiness.PruebasEnTabla.clear();
        Interfaz_principal.jButtonNuevoResultado.setEnabled(true);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonImrimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImrimirActionPerformed
        try {
            PruebaResultadoController pruebaResultadoController = new PruebaResultadoController();
            PacienteController pacienteController = new PacienteController();
            ReportDaoImpl reporDaoImpl = new ReportDaoImpl();
            ResultadoController resultadoController = new ResultadoController();
            HashMap<String, Object> reportMap = new HashMap<String, Object>();
            String sqlQuery = "";

//        StaticVarsBusiness.PruebasEnTabla
//        JTablePruebas.dtm
            Resultado resultado = new Resultado();
            resultado.setObservaciones(jTextFieldObservacionesValor.getText());
            resultado.setPaciente(pacienteController.getByNombreCedula(jLabelNombreValor.getText(), jLabelCedulaValor.getText()));
            java.util.Date date = new java.util.Date();
            Timestamp ts_now = new Timestamp(date.getTime());
            resultado.setFecha(ts_now);
            resultadoController.guardar(resultado);
            int precioTotal = 0;
            for (int i = 0; i < JTablePruebas.dtm.getRowCount(); i++) {
                PruebaResultado pruebaResultado = new PruebaResultado();
                if (JTablePruebas.dtm.getValueAt(i, 0).toString().contains("Area")) {
                    continue;
                } else {
                    String prueba = JTablePruebas.dtm.getValueAt(i, 0).toString();
                    prueba = prueba.replaceAll("     ", "");
                    pruebaResultado.setPrueba(StaticVarsBusiness.PruebasEnTabla.get(prueba));
                    pruebaResultado.setValor(JTablePruebas.dtm.getValueAt(i, 1).toString());
                    pruebaResultado.setResultado(resultado);
                    precioTotal += StaticVarsBusiness.PruebasEnTabla.get(prueba).getPrecio();
                }
                pruebaResultadoController.guardar(pruebaResultado);
            }
            resultado.setPrecio(precioTotal);
            resultadoController.guardar(resultado);
//        for (Object p : StaticVarsBusiness.PruebasEnTabla) {
//            sqlQuery += p + ",";
//        }

//        sqlQuery = sqlQuery.substring(0, sqlQuery.length() - 1);
//
        reportMap.put("resultado_id", resultado.getId());
        reportMap.put("paciente_id", Integer.parseInt(jLabelIDValor.getText()));
        try {
//            JInternalFrame jInternalFrame = new JInternalFrame();
            JFrame jInternalFrame=new JFrame();
            JasperPrint print = reporDaoImpl.generatePdfReport(getClass().getResource("../reports/LabReport.jrxml").getPath(), reportMap);
//              Interfaz_principal.jDesktopPane1.add(new JRViewer(print));
            jInternalFrame.getContentPane().add(new JRViewer(print));
            
//            Interfaz_principal.jDesktopPane1.add(jInternalFrame);
//            jInternalFrame.show();
            jInternalFrame.pack();
            jInternalFrame.setVisible(true);
            jInternalFrame.setSize(1000, 800);

//            reporDaoImpl.generatePdfReport(getClass().getResource("/reports/LabReport.jrxml").getPath(), reportMap);        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz_Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (BussinessException ex) {
            Logger.getLogger(Interfaz_Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonImrimirActionPerformed

    private void jButtonBorrarDatosPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarDatosPacienteActionPerformed
        jLabelNombreValor.setText("");
        jLabelCedulaValor.setText("");
        jLabelEdadValor.setText("");
        jLabelFechaValor.setText("");
        jLabelSexoValor.setText("");
        jLabelTelefonoValor.setText("");
        jLabelIDValor.setText("");        // TODO add your handling code here:
        jLabelDireccionValor.setText("");
        jTextFieldObservacionesValor.setText("");

    }//GEN-LAST:event_jButtonBorrarDatosPacienteActionPerformed

    private void jTextFieldObservacionesValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldObservacionesValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldObservacionesValorActionPerformed

    private void jButtonBorrarDatosResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarDatosResultadoActionPerformed
        // TODO add your handling code here:
        StaticVarsBusiness.mapPruebas.clear();
        StaticVarsBusiness.PruebasEnTabla.clear();
        Interfaz_Resultado.jScrollPane1.setViewportView(new JTablePruebas());
    }//GEN-LAST:event_jButtonBorrarDatosResultadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButtonBorrarDatosPaciente;
    private javax.swing.JButton jButtonBorrarDatosResultado;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonImrimir;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelCedula;
    public static javax.swing.JLabel jLabelCedulaValor;
    private javax.swing.JLabel jLabelDireccion;
    public static javax.swing.JLabel jLabelDireccionValor;
    private javax.swing.JLabel jLabelEdad;
    public static javax.swing.JLabel jLabelEdadValor;
    private javax.swing.JLabel jLabelFecha;
    public static javax.swing.JLabel jLabelFechaValor;
    private javax.swing.JLabel jLabelID;
    public static javax.swing.JLabel jLabelIDValor;
    private javax.swing.JLabel jLabelNombre;
    public static javax.swing.JLabel jLabelNombreValor;
    private javax.swing.JLabel jLabelObservaciones;
    private javax.swing.JLabel jLabelSexo;
    public static javax.swing.JLabel jLabelSexoValor;
    private javax.swing.JLabel jLabelTelefono;
    public static javax.swing.JLabel jLabelTelefonoValor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDatosPaciente;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldObservacionesValor;
    // End of variables declaration//GEN-END:variables
}
