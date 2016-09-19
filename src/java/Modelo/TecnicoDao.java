/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMysql;
import Entidades.Tecnico;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author oswaldpale
 */
public class TecnicoDao {
   public ConexionMysql _conexion = new ConexionMysql();
    public ArrayList<Tecnico> ConsultarTecnicos(){
       
        String sql = "SELECT "
                        + "    cc_tecnico, "
                        + "    CONCAT(nombre,' ',apellido)  AS nombre "
                        + "FROM "
                        + "    tecnico";
       
        ArrayList<Tecnico> SetServicio = new ArrayList<Tecnico>();
        ArrayList dt = _conexion.GetData(sql);
        
        for (Object object : dt) {
            
             Tecnico registro = new Tecnico();
             HashMap item =(HashMap) object;
             registro.setCodigo(item.get("cc_tecnico").toString());
             registro.setNombre(item.get("nombre").toString());
             SetServicio.add(registro
             );
        }

       return SetServicio; 
       
    }
}
