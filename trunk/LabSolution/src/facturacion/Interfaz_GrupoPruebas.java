
package facturacion;

import clases.GrupoPruebas;
import clases.Paciente;
import controller.GrupoPruebasController;
import controller.PacienteController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * 
 * @author eimar
 */
public final class Interfaz_GrupoPruebas extends javax.swing.JInternalFrame {

//    control_existencias ctrl = new control_existencias();
    public Interfaz_GrupoPruebas() {
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
        jtfNombre = new javax.swing.JTextField();
        jlbNombre = new javax.swing.JLabel();
        nuevoRegistroButton = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Area");

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

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        jlbNombre.setText("Nombre del Area");

        nuevoRegistroButton.setText(" Nuevo registro");
        nuevoRegistroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoRegistroButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbNombre)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevoRegistroButton)
                        .addGap(18, 18, 18)
                        .addComponent(registrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoRegistroButton)
                    .addComponent(registrarButton)
                    .addComponent(cancelarButton)
                    .addComponent(salirButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar()
    {
      jtfNombre.setText("");
//       dirclientejTextField4.setText("");
        
    }
    
    public void  bloquear_cajas()
    {
        jtfNombre.setEnabled(false);
//       dirclientejTextField4.setEnabled(false);       
//     comboEdadbo.setEnabled(false); 
       nuevoRegistroButton.setEnabled(true);
       registrarButton.setEnabled(false);
       cancelarButton.setEnabled(false);
  
       
    }
    public void  desbloquear()
    {
      
       jtfNombre.setEnabled(true);
     
//       dirclientejTextField4.setEnabled(true);       
//     comboEdadbo.setEnabled(true); 
      
       nuevoRegistroButton.setEnabled(false);
       registrarButton.setEnabled(true);
       cancelarButton.setEnabled(true);
       
    }
    
    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
       
       // GEN-FIRST:event_regclientejButton1ActionPerformed

		String  nom;
		
		nom = jtfNombre.getText();
		            GrupoPruebasController grupoPruebasController = new GrupoPruebasController();
            GrupoPruebas grupoPruebas= new GrupoPruebas(nom);
//            grupoPruebasController.guardar(grupoPruebas);
		
		if (!nom.equals("")) {
			try {
				grupoPruebasController.guardar(grupoPruebas);

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
        this.dispose();
    }//GEN-LAST:event_salirButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
    bloquear_cajas();  
    limpiar();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void nuevoRegistroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoRegistroButtonActionPerformed
    desbloquear();

    }//GEN-LAST:event_nuevoRegistroButtonActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
    jtfNombre.transferFocus();
    }//GEN-LAST:event_jtfNombreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JButton nuevoRegistroButton;
    private javax.swing.JButton registrarButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables

}