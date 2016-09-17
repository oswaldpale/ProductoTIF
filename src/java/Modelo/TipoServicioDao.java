/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Conexion.ConexionMysql;
import Modelo.TipoServicio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author oswaldpale
 */
public class TipoServicioDao {
    
    public ConexionMysql _conexion = new ConexionMysql();
    
    public ArrayList<TipoServicio> ConsultarTipoServicio(){
       
        String sql = "SELECT "
                        + "    idservicio     AS Codigo, "
                        + "    NombreServicio AS NombreServicio "
                        + "FROM "
                        + "    tiposervicio";
       
        ArrayList<TipoServicio> SetServicio = new ArrayList<TipoServicio>();
        ArrayList dt = _conexion.GetData(sql);
        
        for (Object object : dt) {
            
             TipoServicio registro = new TipoServicio();
             HashMap item =(HashMap) object;
             registro.setCodigo(item.get("idservicio").toString());
             registro.setNombreServicio(item.get("NombreServicio").toString());
             SetServicio.add(registro);
        }

       return SetServicio; 
       
    }
}
