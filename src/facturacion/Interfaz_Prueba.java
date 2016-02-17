
package facturacion;

import clases.GrupoPruebas;
import clases.Paciente;
import clases.Prueba;
import controller.GrupoPruebasController;
import controller.PacienteController;
import controller.PruebaController;
import hibernateUtil.BussinessException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * 
 * @author eimar
 */
public final class Interfaz_Prueba extends javax.swing.JInternalFrame {
 public static Map<String,GrupoPruebas> mapGrupoPruebas=new HashMap<String,GrupoPruebas>();
//    control_existencias ctrl = new control_existencias();
    public Interfaz_Prueba() {
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
        jtfLimiteInf = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jlbNombre = new javax.swing.JLabel();
        jtfUnidad = new javax.swing.JTextField();
        jlbUnidad = new javax.swing.JLabel();
        comboGrupoPruebas = new javax.swing.JComboBox();
        nuevoRegistroButton = new javax.swing.JButton();
        jlbPrecio = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();
        jlbLimites = new javax.swing.JLabel();
        jlbLimitesInf = new javax.swing.JLabel();
        jlbLimitesSup = new javax.swing.JLabel();
        jtfLimiteSup = new javax.swing.JTextField();
        jlbArea = new javax.swing.JLabel();

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

        jtfLimiteInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLimiteInfActionPerformed(evt);
            }
        });

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        jlbNombre.setText("Nombre");

        jtfUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUnidadActionPerformed(evt);
            }
        });

        jlbUnidad.setText("Unidad");

        GrupoPruebasController grupoPruebasController = new GrupoPruebasController();
        List<GrupoPruebas> grupoPruebas=null;
        try{
            grupoPruebas =grupoPruebasController.getAll();
        }catch(Exception e){
        }
        String [] areas= new String [grupoPruebas.size()];

        for(int i=0;i< grupoPruebas.size();i++){
            areas[i]=grupoPruebas.get(i).getNombre();
            mapGrupoPruebas.put(grupoPruebas.get(i).getNombre(), grupoPruebas.get(i));
        }
        comboGrupoPruebas.setModel(new javax.swing.DefaultComboBoxModel(areas));
        comboGrupoPruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGrupoPruebasActionPerformed(evt);
            }
        });

        nuevoRegistroButton.setText(" Nuevo registro");
        nuevoRegistroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoRegistroButtonActionPerformed(evt);
            }
        });

        jlbPrecio.setText("Precio");

        jlbLimites.setText("Limites");

        jlbLimitesInf.setText("Inferior");

        jlbLimitesSup.setText("Superior");

        jtfLimiteSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLimiteSupActionPerformed(evt);
            }
        });

        jlbArea.setText("Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nuevoRegistroButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbLimitesInf)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfLimiteInf, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlbLimitesSup)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtfLimiteSup, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbNombre))
                                .addComponent(jlbLimites)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                .addComponent(jlbUnidad)
                                .addComponent(jlbPrecio)
                                .addComponent(jtfUnidad)))
                        .addGap(18, 18, 18)
                        .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbArea)
                    .addComponent(comboGrupoPruebas, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboGrupoPruebas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbLimites)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbLimitesSup)
                            .addComponent(jlbLimitesInf)
                            .addComponent(jtfLimiteInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfLimiteSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbUnidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbPrecio)
                        .addGap(10, 10, 10)
                        .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoRegistroButton)
                    .addComponent(registrarButton)
                    .addComponent(cancelarButton)
                    .addComponent(salirButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar()
    {
       jtfLimiteInf.setText("");
       comboGrupoPruebas.setName("");
       jtfNombre.setText("");
       jtfUnidad.setText("");
//       dirclientejTextField4.setText("");
        
    }
    
    public void  bloquear_cajas()
    {
       jtfLimiteInf.setEnabled(false);
       comboGrupoPruebas.setEnabled(false);
       jtfNombre.setEnabled(false);
       jtfUnidad.setEnabled(false);
//       dirclientejTextField4.setEnabled(false);       
//     comboEdadbo.setEnabled(false); 
       nuevoRegistroButton.setEnabled(true);
       registrarButton.setEnabled(false);
       cancelarButton.setEnabled(false);
       jtfPrecio.setEnabled(false);
       
    }
    public void  desbloquear()
    {
       jtfLimiteInf.setEnabled(true);
       comboGrupoPruebas.setEnabled(true);
       jtfNombre.setEnabled(true);
       jtfUnidad.setEnabled(true);
//       dirclientejTextField4.setEnabled(true);       
//     comboEdadbo.setEnabled(true); 
       jtfPrecio.setEnabled(true);
       nuevoRegistroButton.setEnabled(false);
       registrarButton.setEnabled(true);
       cancelarButton.setEnabled(true);
       
    }
 
    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
       
       // GEN-FIRST:event_regclientejButton1ActionPerformed

		String nom,unidad, lim, area;
		int precio;
		nom = jtfNombre.getText();
		unidad = jtfUnidad.getText();
		lim  = jtfLimiteInf.getText() + " - "+jtfLimiteSup.getText();
		precio = Integer.parseInt(jtfPrecio.getText());
		area= comboGrupoPruebas.getSelectedItem().toString();
                
		PruebaController pruebaController = new PruebaController();
                GrupoPruebas grupoPruebas=mapGrupoPruebas.get(area);
		Prueba prueba = new Prueba(nom, unidad, lim, grupoPruebas, precio);
		if (!nom.equals("") && !unidad.equals("") && !nom.equals("")
				&& !lim.equals("")) {
			try {
				pruebaController.guardar(prueba);

				JOptionPane.showMessageDialog(null,
						"El cliente se registro con exito ", "Mensaje",
						JOptionPane.INFORMATION_MESSAGE);
				limpiar();
				bloquear_cajas();
			} catch (Exception e) {
                            e.printStackTrace();
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
    jtfLimiteInf.requestFocus();
    }//GEN-LAST:event_nuevoRegistroButtonActionPerformed

    private void jtfLimiteInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLimiteInfActionPerformed
    jtfLimiteInf.transferFocus();
    }//GEN-LAST:event_jtfLimiteInfActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
    jtfNombre.transferFocus();
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUnidadActionPerformed
    jtfUnidad.transferFocus();
    }//GEN-LAST:event_jtfUnidadActionPerformed

    private void comboGrupoPruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGrupoPruebasActionPerformed
        

    }//GEN-LAST:event_comboGrupoPruebasActionPerformed

    private void jtfLimiteSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLimiteSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLimiteSupActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JComboBox comboGrupoPruebas;
    private javax.swing.JLabel jlbArea;
    private javax.swing.JLabel jlbLimites;
    private javax.swing.JLabel jlbLimitesInf;
    private javax.swing.JLabel jlbLimitesSup;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbPrecio;
    private javax.swing.JLabel jlbUnidad;
    private javax.swing.JTextField jtfLimiteInf;
    private javax.swing.JTextField jtfLimiteSup;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JTextField jtfUnidad;
    private javax.swing.JButton nuevoRegistroButton;
    private javax.swing.JButton registrarButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables

}