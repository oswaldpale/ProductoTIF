/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMysql;
import Entidades.Producto;
import Entidades.Tecnico;
import Entidades.Usuario;
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
    
    public boolean TecnicoLogin(Tecnico t) {
        String sql = ""
                        + "select count(*) as existe from tecnico "
                        + "where Usuario = '"+t.getUsuario()+"' and contrasena = '"+t.getPass()+"';";
        
        ArrayList dt = _conexion.GetData(sql);
        for (Object object : dt) {            
            HashMap item = (HashMap) object;
            if(Integer.parseInt(item.get("existe").toString())>0){
                return true;
            }            
        }
        return false;
    }

    public String recuperaIDTecnico(Tecnico t) {
        String sql = "SELECT DISTINCT cc_tecnico FROM tecnico " 
                      + " WHERE Usuario = '"+ t.getUsuario() +"' AND  contrasena = '"  + t.getPass() + "'";
        
        ArrayList dt = _conexion.GetData(sql);
        for (Object object : dt) {            
            HashMap item = (HashMap) object;
            return item.get("cc_tecnico").toString();
        }
        return "";
    }
}
