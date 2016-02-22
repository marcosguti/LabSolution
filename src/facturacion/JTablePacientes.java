/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import clases.Paciente;
import controller.PacienteController;
import dao.PacienteDAOImpl;
import static facturacion.Interfaz_principal.jMenuItem4;
import hibernateUtil.BussinessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ANDRES
 */
public class JTablePacientes extends javax.swing.JTable {

    private Object[][] datostabla;

    private static JMenuItem jMenuItem = new JMenuItem("Agregar");
    private static JPopupMenu jPopupMenu = new JPopupMenu();
    private static String nombre, cedula;
    PacienteController pacienteController = new PacienteController();

    public JTablePacientes() {
        initComponents();
        mostrar_tabla();

    }

    public void mostrar_tabla() {
        final PacienteController pacienteController = new PacienteController();
//        control_cliente control = new control_cliente("Documento","Tipo de documento","Nombres","Apellidos","Direccion","Ciudad","telefono");       
        String[] columnas = {"Nombre", "Cedula"};
        List<Paciente> pacientes = new ArrayList<Paciente>();
        try {
            pacientes = pacienteController.getAll();
        } catch (BussinessException ex) {
            Logger.getLogger(Interfaz_BuscarPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
//        datostabla = control.consulta_clientes();
//     ;
        datostabla = new Object[pacientes.size()][5];
        int i = 0;
        for (Paciente paciente : pacientes) {

            datostabla[i][0] = paciente.getNombres();
//            datostabla[i][1] = paciente.getApellidos();
            datostabla[i][1] = paciente.getCedula();
//            datostabla[i][3]= paciente.getEdad();
//            datostabla[i][4] = paciente.getTelefono();

            i++;
        }
        DefaultTableModel model = new DefaultTableModel(datostabla, columnas) {
            public Class getColumnClass(int column) {
                Class returnValue;
                if ((column >= 0) && (column < getColumnCount())) {
                    returnValue = getValueAt(0, column).getClass();
                } else {
                    returnValue = Object.class;
                }
                return returnValue;
            }
        };
        this.setModel(model);
        sorter.setModel(model);
        this.setRowSorter(sorter);

        this.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                if (SwingUtilities.isRightMouseButton(evt)) {
                int row = rowAtPoint(evt.getPoint());
                int col = columnAtPoint(evt.getPoint());
                Object n = getModel().getValueAt(row, 0);
                Object c = getModel().getValueAt(row, 1);
                String ced=c.toString().replaceAll(" ","");
                System.out.println(n.toString() + "----- " + c.toString());
                Paciente paciente = new Paciente();
                try {
                    paciente = pacienteController.getByNombreCedula("Marco Gutierrez", ced);
                } catch (BussinessException ex) {
                    Logger.getLogger(JTablePacientes.class.getName()).log(Level.SEVERE, null, ex);
                }
//                                
                Interfaz_Resultado.jLabelNombreValor.setText(paciente.getNombres());
                Interfaz_Resultado.jLabelCedulaValor.setText(paciente.getCedula());
                Interfaz_Resultado.jLabelEdadValor.setText(String.valueOf(paciente.getEdad()));
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String date = sdf.format(new Date()); 
                Interfaz_Resultado.jLabelFechaValor.setText(date);
                Interfaz_Resultado.jLabelSexoValor.setText(paciente.getSexo());
                Interfaz_Resultado.jLabelTelefonoValor.setText(paciente.getTelefono());
                  Interfaz_Resultado.jLabelIDValor.setText(String.valueOf(paciente.getId()));
                  jPopupMenu.add(jMenuItem);
                jMenuItem.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                            Paciente paciente = pacienteController.getByNombreCedula(nombre, cedula);

                            Interfaz_Resultado.jLabelNombreValor.setText(paciente.getNombres());
//                                        jLabelCedulaValor
//                                        jLabelDireccionValor
//                                                jLabelEdadValor
//                                                jLabelFechaValor
//                                                        jLabelSexoValor
//                                                        jLabelTelefonoValor
                        } catch (BussinessException ex) {
                            Logger.getLogger(JTablePacientes.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                });
//                }
            }
        });
//        DefaultTableModel datos = new DefaultTableModel(datostabla,columnas);
//        this.setModel(datos);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButtonBuscar = Interfaz_principal.jButtonBuscar;
        buscarcliente = Interfaz_principal.jtfBuscarPaciente;

        this.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {},
                    {},
                    {},
                    {}
                },
                new String[]{}
        ));

        buscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarclienteActionPerformed(evt);
            }
        });
        buscarcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarclienteKeyReleased(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = buscarcliente.getText();
                if (text.length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter(text));
                }
            }
        });

//        pack();
    }// </editor-fold>                        

//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//    this.dispose();
//    }                                        
    private void buscarclienteActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void buscarclienteKeyReleased(java.awt.event.KeyEvent evt) {

    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField buscarcliente;

    private javax.swing.JButton jButtonBuscar;

    // End of variables declaration                   
    private final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>();
}
