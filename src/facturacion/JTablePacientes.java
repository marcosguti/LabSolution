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
import static facturacion.Interfaz_principal.jMenuItemPacienteNuevo;
import hibernateUtil.BussinessException;
import java.awt.Font;
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
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
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
    public static Paciente paciente = null;

    public JTablePacientes(boolean isPrincipalTable) {
        initComponents();
        mostrar_tabla(isPrincipalTable);

    }

    public void mostrar_tabla(boolean isPrincipalTable) {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        try {
            pacientes = pacienteController.getAllOrdered();
        } catch (BussinessException ex) {
            Logger.getLogger(Interfaz_BuscarPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        if (isPrincipalTable) {

            final PacienteController pacienteController = new PacienteController();
//        control_cliente control = new control_cliente("Documento","Tipo de documento","Nombres","Apellidos","Direccion","Ciudad","telefono");       
            String[] columnas = {"Nombre", "Cedula"};

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
                boolean[] editable = new boolean[]{
                    false, false
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return editable[columnIndex];
                }
            };
            this.setModel(model);
            Font f1 = new Font("Times New Roman", Font.BOLD, 12);
            this.setFont(f1);
//        for (int a = 0; i < this.getColumnCount(); a++) {
//            TableColumn col = this.getColumnModel().getColumn(a);
//            col.setCellEditor(new MyTableCellEditor());
//            col.setHeaderValue("AS");
//        }
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
                    Paciente paciente = new Paciente();
                    try {
                        paciente = pacienteController.getByNombreCedula(n.toString(), c.toString());
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
                    Interfaz_Resultado.jLabelDireccionValor.setText(String.valueOf(paciente.getDireccion()));
//                    StaticVarsBusiness.mapPruebas.put
                }
            });
//        DefaultTableModel datos = new DefaultTableModel(datostabla,columnas);
//        this.setModel(datos);
        } else {

            String[] columnas = {"Nombre", "Cedula", "Edad", "Sexo", "Telefono", "Direccion"};
            datostabla = new Object[pacientes.size()][6];
            int i = 0;
            for (Paciente paciente : pacientes) {

                datostabla[i][0] = paciente.getNombres();
                datostabla[i][1] = paciente.getCedula();
                datostabla[i][2] = paciente.getEdad();
                datostabla[i][3] = paciente.getSexo();
                datostabla[i][4] = paciente.getTelefono();
                datostabla[i][5] = paciente.getDireccion();

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

                public boolean isCellEditable(int row, int column) {
                    return false;
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

                    try {
                        paciente = pacienteController.getByNombreCedula(n.toString(), c.toString());
                    } catch (BussinessException ex) {
                        Logger.getLogger(JTablePacientes.class.getName()).log(Level.SEVERE, null, ex);
                    }
//                                

                }
            });

        }
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
