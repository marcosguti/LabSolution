package facturacion;

import clases.Paciente;
import controller.PacienteController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author eimar
 */
public final class Interfaz_Pacientes extends javax.swing.JInternalFrame {
PacienteController pacienteController = new PacienteController();
private static Paciente paciente=null;
//    control_existencias ctrl = new control_existencias();
    public Interfaz_Pacientes(Paciente p) {
        this.paciente=p;
        initComponents();
        jtfNombre.setText(p.getNombres());
        jtfDocumento.setText(p.getCedula().substring(2));
        jtfTelefono.setText(p.getTelefono());
        jtfDireccion.setText(p.getDireccion());
        //"V", "E", "J"
        comboTipoDoc.setSelectedItem(paciente.getCedula().substring(0, 1));
        comboEdad.setSelectedItem(paciente.getEdad());
        comboSexo.setSelectedItem(paciente.getSexo());
        remove(nuevoRegistroButton); 
       remove(cancelarButton);
       registrarButton.setText("Guardar");     
    }
    public Interfaz_Pacientes() {
        initComponents();
        limpiar();
        bloquear_cajas();

//        Object[] tipo_doc = ctrl.combox("tipo_de_documento","id_tipo_documento");
//        comboTipoDoc.removeAllItems();
//        for(int i=0;i<tipo_doc.length;i++){
//        comboTipoDoc.addItem(tipo_doc[i]);
//        
//    }
//        
//        Object[] ciu = ctrl.combox("ciudad","Codigo_ciudad");
//        comboEdad.removeAllItems();
//        for(int i=0;i<ciu.length;i++){
//        comboEdad.addItem(ciu[i]);
//        
//    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        jtfDocumento = new javax.swing.JTextField();
        jlbDocumento = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlbNombre = new javax.swing.JLabel();
        comboTipoDoc = new javax.swing.JComboBox();
        comboEdad = new javax.swing.JComboBox();
        List<Integer> age = new ArrayList<Integer>();
        for (int i = 1; i <= 100; ++i) {
            age.add(i);
        }
        comboEdad.setModel(new javax.swing.DefaultComboBoxModel(age.toArray()));
        jlbComboEdad = new javax.swing.JLabel();
        nuevoRegistroButton = new javax.swing.JButton();
        jlbTelefono = new javax.swing.JLabel();
        jtfTelefono = new javax.swing.JTextField();
        jlbSexo = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox();
        jtfDireccion = new javax.swing.JTextField();
        jlbTelefono1 = new javax.swing.JLabel();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Paciente");

        registrarButton.setText("Registrar");
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        jtfDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDocumentoActionPerformed(evt);
            }
        });

        jlbDocumento.setText("Documento");

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        jlbNombre.setText("Nombres");

        comboTipoDoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "V", "E", "J" }));
        comboTipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoDocActionPerformed(evt);
            }
        });

        comboEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEdadActionPerformed(evt);
            }
        });

        jlbComboEdad.setText("Edad");

        nuevoRegistroButton.setText(" Nuevo registro");
        nuevoRegistroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoRegistroButtonActionPerformed(evt);
            }
        });

        jlbTelefono.setText("Telefono");

        jlbSexo.setText("Sexo");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F", }));
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });

        jlbTelefono1.setText("Dirección");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbNombre))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlbDocumento)))
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbTelefono)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbSexo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbComboEdad)
                            .addComponent(comboEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbTelefono1)
                            .addComponent(jtfDireccion))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(registrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nuevoRegistroButton))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNombre)
                    .addComponent(jlbDocumento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbSexo)
                            .addComponent(jlbComboEdad)
                            .addComponent(jlbTelefono1))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbTelefono)
                .addGap(8, 8, 8)
                .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoRegistroButton)
                    .addComponent(registrarButton)
                    .addComponent(cancelarButton)
                    .addComponent(salirButton))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar() {

        jtfDocumento.setText("");
        comboTipoDoc.setName("");
        jtfNombre.setText("");

//       dirclientejTextField4.setText("");
    }

    public void habilitarMenu(javax.swing.JMenuItem jmenu) {
        jmenu.setEnabled(true);
    }

    public void bloquear_cajas() {
        jtfDocumento.setEnabled(false);
        comboTipoDoc.setEnabled(false);
        jtfNombre.setEnabled(false);
        jtfDireccion.setEnabled(false);
//       dirclientejTextField4.setEnabled(false);       
//     comboEdadbo.setEnabled(false); 
        nuevoRegistroButton.setEnabled(true);
        registrarButton.setEnabled(false);
        cancelarButton.setEnabled(false);
        jtfTelefono.setEnabled(false);
         comboSexo.setEnabled(false);
         comboEdad.setEnabled(false);
    }

    public void desbloquear() {
        jtfDocumento.setEnabled(true);
        comboTipoDoc.setEnabled(true);
        jtfNombre.setEnabled(true);
        jtfDireccion.setEnabled(true);
//       dirclientejTextField4.setEnabled(true);       
//     comboEdadbo.setEnabled(true); 
        jtfTelefono.setEnabled(true);
        nuevoRegistroButton.setEnabled(false);
        registrarButton.setEnabled(true);
        cancelarButton.setEnabled(true);
       comboSexo.setEnabled(true);
         comboEdad.setEnabled(true);
    }

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed

       // GEN-FIRST:event_regclientejButton1ActionPerformed
       if(registrarButton.getText().equals("Guardar")){
       Paciente paciente = new Paciente();
       paciente.setNombres(title);
       }
       
        String doc, nom, dir, sexo, tipo, tel;
        int edad;
        doc = jtfDocumento.getText();
        tipo = comboTipoDoc.getSelectedItem().toString();
        String cedula = tipo + "-" + doc;
        nom = jtfNombre.getText();
        dir = jtfDireccion.getText();
        sexo = comboSexo.getSelectedItem().toString();
        edad = Integer.parseInt(comboEdad.getSelectedItem().toString());
        tel = jtfTelefono.getText();
        
        Paciente paciente = new Paciente(cedula, nom, tel, sexo, dir, edad);
        if (!doc.equals("") && !tipo.equals("") && !nom.equals("")
                && !dir.equals("")) {
            try {
                pacienteController.guardar(paciente);

                JOptionPane.showMessageDialog(null,
                        "El cliente se registro con exito ", "Mensaje",
                        JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                bloquear_cajas();
                Interfaz_principal.jScrollPane2.setViewportView(new JTablePacientes(true));
                if(Interfaz_BuscarPacientes.jScrollPane2!=null)
                Interfaz_BuscarPacientes.jScrollPane2.setViewportView(new JTablePacientes(false));

//                                Interfaz_BuscarPacientes.mostrar
            } catch (Exception e) {
                System.out.println(e.getMessage()+" asdasds");
                JOptionPane.showMessageDialog(this,
                        "Error al registrar el cliente");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Hay campos obligatorios");
        }


    }//GEN-LAST:event_registrarButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        if (Interfaz_BuscarPacientes.jButtonRegistrar != null) {
            Interfaz_BuscarPacientes.jButtonRegistrar.setEnabled(true);
        }
        if (Interfaz_principal.jMenuItemPacienteNuevo != null) {
            Interfaz_principal.jMenuItemPacienteNuevo.setEnabled(true);
        }
        Interfaz_principal.jMenuItemPacienteBuscar.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_salirButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        bloquear_cajas();
        limpiar();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void nuevoRegistroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoRegistroButtonActionPerformed
        desbloquear();
        jtfDocumento.requestFocus();
    }//GEN-LAST:event_nuevoRegistroButtonActionPerformed

    private void jtfDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDocumentoActionPerformed
        jtfDocumento.transferFocus();
    }//GEN-LAST:event_jtfDocumentoActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        jtfNombre.transferFocus();
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void comboTipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoDocActionPerformed


    }//GEN-LAST:event_comboTipoDocActionPerformed

    private void comboEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEdadActionPerformed

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JComboBox comboEdad;
    private javax.swing.JComboBox comboSexo;
    private javax.swing.JComboBox comboTipoDoc;
    private javax.swing.JLabel jlbComboEdad;
    private javax.swing.JLabel jlbDocumento;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbSexo;
    private javax.swing.JLabel jlbTelefono;
    private javax.swing.JLabel jlbTelefono1;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfDocumento;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    private javax.swing.JButton nuevoRegistroButton;
    private javax.swing.JButton registrarButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables

}
