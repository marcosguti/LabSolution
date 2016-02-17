/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author marcosguti
 */
@Entity
public class Resultado {
     @Id
    private int id;
    private Paciente paciente;
    private List<PruebaResultado> pruebasResultado ;
    private int precio;
    private String observaciones;
    private Timestamp fecha;
    
}
