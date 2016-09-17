/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMysql;
import Entidades.SistemaOperativo;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author oswaldpale
 */
public class SistemaOperativoDao {
    public ConexionMysql _conexion = new ConexionMysql();
     public ArrayList<SistemaOperativo> ConsultarSistemaOperativo(){
       
        String sql = "SELECT "
                        + "    idsistema, "
                        + "    nombreSistema "
                        + "FROM "
                        + "    tiposistemaoperativo";
       
        ArrayList<SistemaOperativo> SetServicio = new ArrayList<SistemaOperativo>();
        ArrayList dt = _conexion.GetData(sql);
        
        for (Object object : dt) {
            
             SistemaOperativo registro = new SistemaOperativo();
             HashMap item =(HashMap) object;
             registro.setIdsistema(item.get("idsistema").toString());
             registro.setNombreSistema(item.get("nombreSistema").toString());
             SetServicio.add(registro);
        }

       return SetServicio; 
       
    }
}
