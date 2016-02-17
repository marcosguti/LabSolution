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
public class PruebaResultado extends Prueba{
 
    private int id;
    private String valor;
    private Resultado resultado;

    public PruebaResultado(){}
    
    public PruebaResultado(int id, String valor, Resultado resultado) {
        super();
        this.id = id;
        this.valor = valor;
        this.resultado = resultado;
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
