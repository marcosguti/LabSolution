/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.persistence.Id;

/**
 *
 * @author marcosguti
 */
public class PruebaResultado {
 
    private int id;
    private String valor;
    private Resultado resultado;
    private Prueba prueba;

    public PruebaResultado(){}

    public Prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    public PruebaResultado( String valor, Resultado resultado, Prueba prueba) {  
        this.valor = valor;
        this.resultado = resultado;
        this.prueba = prueba;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int ids) {
        this.id = ids;
    }

   
   

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

 
    
    
    
    
}
