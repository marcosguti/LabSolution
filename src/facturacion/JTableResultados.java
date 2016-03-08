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
import clases.Resultado;
import controller.PacienteController;
import controller.ResultadoController;
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
public class JTableResultados extends javax.swing.JTable {

    private Object[][] datostabla;

    private static JMenuItem jMenuItem = new JMenuItem("Agregar");
    private static JPopupMenu jPopupMenu = new JPopupMenu();
    private static String nombre, cedula;
     private static ResultadoController resultadoController = new ResultadoController();
    public static Resultado resultado = null;

    public JTableResultados() {
        initComponents();
        mostrar_tabla();

    }

    public void mostrar_tabla() {
        List<Resultado> resultados = new ArrayList<Resultado>();
        try {
            resultados = resultadoController.gelAllOrdered();
        } catch (BussinessException ex) {
            Logger.getLogger(Interfaz_BuscarPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        String[] columnas = {"Fecha", "Nombre", "Cedula", "Precio", "N°"};
        String output;
        SimpleDateFormat formatter;

        formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        output = formatter.format(today);
        datostabla = new Object[resultados.size()][5];
        int i = 0;
        for (Resultado resultado : resultados) {
            datostabla[i][0] = formatter.format(resultado.getFecha());
            datostabla[i][1] = resultado.getPaciente().getNombres();
            datostabla[i][2] = resultado.getPaciente().getCedula();
            datostabla[i][3] = resultado.getPrecio();
            datostabla[i][4] = resultado.getId();
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
                false, false, false,false,false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return editable[columnIndex];
            }
        };
        this.setModel(model);
        Font f1 = new Font("Times New Roman", Font.BOLD, 12);
        this.setFont(f1);
        this.getColumn("Fecha").setMaxWidth(90);
        this.getColumn("Fecha").setMinWidth(90);
        this.getColumn("Fecha").setWidth(90);
        this.getColumn("Nombre").setMaxWidth(200);
        this.getColumn("Nombre").setMinWidth(200);
        this.getColumn("Nombre").setWidth(200);
        this.getColumn("Cedula").setMaxWidth(100);
        this.getColumn("Cedula").setMinWidth(100);
        this.getColumn("Cedula").setMinWidth(100);
        this.getColumn("Precio").setMaxWidth(70);
        this.getColumn("Precio").setMinWidth(70);
        this.getColumn("Precio").setMinWidth(70);
//        for (int a = 0; i < this.getColumnCount(); a++) {
//            TableColumn col = this.getColumnModel().getColumn(a);
//            col.setCellEditor(new MyTableCellEditor());
//            col.setHeaderValue("AS");
//        }
//            sorter.setModel(model);
//            this.setRowSorter(sorter);
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                if (SwingUtilities.isRightMouseButton(evt)) {
//                if (evt.getClickCount() == 2 && !evt.isConsumed()) {
                    int row = rowAtPoint(evt.getPoint());
//                    int col = columnAtPoint(evt.getPoint());
//                    Object n = getModel().getValueAt(row, 0);
                    Object id = getModel().getValueAt(row, 4);
                     resultado = new Resultado();
                    try {
                        resultado = resultadoController.get(Integer.parseInt(id.toString()));
                    } catch (BussinessException ex) {
                        Logger.getLogger(JTableResultados.class.getName()).log(Level.SEVERE, null, ex);
                    }
//                                
//                    StaticVarsBusiness.mapPruebas.put
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
