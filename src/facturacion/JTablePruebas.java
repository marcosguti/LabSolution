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
import clases.Prueba;
import controller.PacienteController;
import dao.PacienteDAOImpl;
import static facturacion.Interfaz_principal.jMenuItemPacienteNuevo;
import hibernateUtil.BussinessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
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
public class JTablePruebas extends javax.swing.JTable {

    public static DefaultTableModel dtm;

    public JTablePruebas() {
        initComponents();
        mostrar_tabla();

    }

    public void mostrar_tabla() {
        final PacienteController pacienteController = new PacienteController();
//        control_cliente control = new control_cliente("Documento","Tipo de documento","Nombres","Apellidos","Direccion","Ciudad","telefono");       
        String[] columnas = {"Prueba", "Valor", "Limites"};
        List<Paciente> pacientes = new ArrayList<Paciente>();

//        datostabla = control.consulta_clientes();
//     ;
        DefaultTableModel dtm = new DefaultTableModel(0, 0);

        dtm.setColumnIdentifiers(columnas);

//        Map<String, String> map = ...
        if (StaticVarsBusiness.mapPruebas != null) {
            for (Map.Entry<String, List<Prueba>> entry : StaticVarsBusiness.mapPruebas.entrySet()) {
                dtm.addRow(new Object[]{"Area de "+entry.getKey()});
                for (Prueba prueba : entry.getValue()) {
                    dtm.addRow(new Object[]{prueba.getNombre(), "", prueba.getLimites()});
                }
                System.out.println(entry.getKey() + "/" + entry.getValue());
            }
        }
        this.setModel(dtm);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        this.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {},
                    {},
                    {},
                    {}
                },
                new String[]{}
        ));

//        pack();
    }// </editor-fold>                        

}