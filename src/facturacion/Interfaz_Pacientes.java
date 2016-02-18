
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

//    control_existencias ctrl = new control_existencias();
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
        jtfApellido = new javax.swing.JTextField();
        jlbApellido = new javax.swing.JLabel();
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

        jtfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApellidoActionPerformed(evt);
            }
        });

        jlbApellido.setText("Apellidos");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbDocumento)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(comboTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlbNombre)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbApellido)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlbTelefono)
                                                .addGap(165, 165, 165)
                                                .addComponent(jlbSexo))
                                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addComponent(jlbComboEdad))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtfTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(registrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(224, 224, 224)
                                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(nuevoRegistroButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNombre)
                    .addComponent(jlbApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbDocumento)
                    .addComponent(jlbTelefono)
                    .addComponent(jlbSexo)
                    .addComponent(jlbComboEdad))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoRegistroButton)
                    .addComponent(registrarButton)
                    .addComponent(cancelarButton)
                    .addComponent(salirButton))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar()
    {
        
       jtfDocumento.setText("");
       comboTipoDoc.setName("");
       jtfNombre.setText("");
       jtfApellido.setText("");
//       dirclientejTextField4.setText("");
        
    }
   public void habilitarMenu(javax.swing.JMenuItem jmenu) {
       jmenu.setEnabled(true);
   }
    public void  bloquear_cajas()
    {
       jtfDocumento.setEnabled(false);
       comboTipoDoc.setEnabled(false);
       jtfNombre.setEnabled(false);
       jtfApellido.setEnabled(false);
//       dirclientejTextField4.setEnabled(false);       
//     comboEdadbo.setEnabled(false); 
       nuevoRegistroButton.setEnabled(true);
       registrarButton.setEnabled(false);
       cancelarButton.setEnabled(false);
       jtfTelefono.setEnabled(false);
       
    }
    public void  desbloquear()
    {
       jtfDocumento.setEnabled(true);
       comboTipoDoc.setEnabled(true);
       jtfNombre.setEnabled(true);
       jtfApellido.setEnabled(true);
//       dirclientejTextField4.setEnabled(true);       
//     comboEdadbo.setEnabled(true); 
       jtfTelefono.setEnabled(true);
       nuevoRegistroButton.setEnabled(false);
       registrarButton.setEnabled(true);
       cancelarButton.setEnabled(true);
       
    }
    
    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
       
       // GEN-FIRST:event_regclientejButton1ActionPerformed

		String doc, nom, ape, sexo, tipo, tel;
		int edad;
		doc = jtfDocumento.getText();
		tipo = comboTipoDoc.getSelectedItem().toString();
		String cedula = tipo + "-" + doc;
		nom = jtfNombre.getText();
		ape = jtfApellido.getText();
		sexo = comboSexo.getSelectedItem().toString();
		edad = Integer.parseInt(comboEdad.getSelectedItem().toString());
		tel = jtfTelefono.getText();
		PacienteController pacienteController = new PacienteController();
		Paciente paciente = new Paciente(cedula, nom, ape, tel,sexo, edad);
		if (!doc.equals("") && !tipo.equals("") && !nom.equals("")
				&& !ape.equals("")) {
			try {
				pacienteController.guardar(paciente);

				JOptionPane.showMessageDialog(null,
						"El cliente se registro con exito ", "Mensaje",
						JOptionPane.INFORMATION_MESSAGE);
				limpiar();
				bloquear_cajas();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this,
						"Error al registrar el cliente");
			}
		} else {
			JOptionPane.showMessageDialog(this, "Hay campos obligatorios");
		}

	
               
    }//GEN-LAST:event_registrarButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        Interfaz_buscarclientes.jButtonRegistrar.setEnabled(true);
        Interfaz_principal.jMenuItem4.setEnabled(true);
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

    private void jtfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApellidoActionPerformed
    jtfApellido.transferFocus();
    }//GEN-LAST:event_jtfApellidoActionPerformed

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
    private javax.swing.JLabel jlbApellido;
    private javax.swing.JLabel jlbComboEdad;
    private javax.swing.JLabel jlbDocumento;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbSexo;
    private javax.swing.JLabel jlbTelefono;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDocumento;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    private javax.swing.JButton nuevoRegistroButton;
    private javax.swing.JButton registrarButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables

}