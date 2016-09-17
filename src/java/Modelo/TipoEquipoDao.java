/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMysql;
import Entidades.TipoEquipo;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author oswaldpale
 */
public class TipoEquipoDao {
    public ConexionMysql _conexion = new ConexionMysql();
    
    public ArrayList<TipoEquipo> ConsultarTipoEquipo(){
       
        String sql = "SELECT "
                        + "    idtipoequipo, "
                        + "    nombreEquipo "
                        + "FROM "
                        + "    tipoequipo";
       
        ArrayList<TipoEquipo> SetServicio = new ArrayList<TipoEquipo>();
        ArrayList dt = _conexion.GetData(sql);
        
        for (Object object : dt) {
            
             TipoEquipo registro = new TipoEquipo();
             HashMap item =(HashMap) object;
             registro.setIdtipoequipo(item.get("idtipoequipo").toString());
             registro.setNombreTipo(item.get("nombreEquipo").toString());
             SetServicio.add(registro);
        }

       return SetServicio; 
       
    }
}
