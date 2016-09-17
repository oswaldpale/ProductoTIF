/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMysql;
import Modelo.Marca;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author oswaldpale
 */
public class MarcaDao {
    public ConexionMysql _conexion = new ConexionMysql();
     public ArrayList<Marca> ConsultarMarca(){
       
        String sql = "SELECT "
                        + "    idmarca, "
                        + "    nombremarca "
                        + "FROM "
                        + "    marca";
       
        ArrayList<Marca> SetServicio = new ArrayList<Marca>();
        ArrayList dt = _conexion.GetData(sql);
        
        for (Object object : dt) {
            
             Marca registro = new Marca();
             HashMap item =(HashMap) object;
             registro.setIdmarca(item.get("idmarca").toString());
             registro.setNombre(item.get("nombremarca").toString());
             SetServicio.add(registro);
        }

       return SetServicio; 
       
    }
}
