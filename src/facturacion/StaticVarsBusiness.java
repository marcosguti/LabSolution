/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import clases.Prueba;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author marcosguti
 */
public class StaticVarsBusiness {
   public static HashMap<String, List<Prueba>> mapPruebas= new HashMap<String, List<Prueba>>();
   public static HashMap<String, Prueba>  PruebasEnTabla= new HashMap<String, Prueba>();

    public StaticVarsBusiness() {
    }
    
}
