/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author eimar
 */
/**
 *
 * jasperreports-3.7.6.jar
 *
 * commons-digester-1.7.jar
 *
 * commons-logging-1.0.4.jar
 *
 * commons-collections-2.1.1.jar
 *
 * commons-beanutils-1.8.0.jar
 *
 */
import java.awt.CardLayout;

import java.sql.Connection;

import java.sql.DriverManager;

import java.util.HashMap;

import javax.swing.JButton;

import javax.swing.JFrame;

import net.sf.jasperreports.engine.JRException;

import net.sf.jasperreports.engine.JasperCompileManager;

import net.sf.jasperreports.engine.JasperFillManager;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;


import net.sf.jasperreports.view.JasperViewer;

/**
 *
 *
 *
 * @author beastieux
 *
 */
public class JasperReportClass extends JFrame {

    public JasperReportClass() {

        JButton btn1 = new JButton("Abrir Reporte");

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                btn1ActionPerformed(evt);

            }
        });

        this.add(btn1);

        this.setLayout(new CardLayout());

        this.setSize(200, 100);

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {

        abrirReporte(getClass().getResource("/reports/well.jrxml").getPath());

    }

    private void abrirReporte(String archivo) {
    Connection conn = null;
        try {

            JasperReport report = JasperCompileManager.compileReport(archivo);
            HashMap param = new HashMap();
            param.put("id", 2);

            JasperPrint print = JasperFillManager.fillReport(report, param, conn);

            JasperViewer.viewReport(print, false);

        } catch (JRException jRException) {

            System.out.println(jRException.getMessage());

        }

    }

    private Connection coneccionSQL() {

        try {


//                    Class.forName("com.mysql.jdbc.Driver");
// 
//                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebareportes", "root", "r00t");
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection("jdbc:postgresql://10.14.165.215:5432/pozosenero2016", "postgres", "postgres");

            return con;

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return null;

    }

    public static void main(String args[]) {

        JasperReportClass obj = new JasperReportClass();

        obj.setVisible(true);

    }
}