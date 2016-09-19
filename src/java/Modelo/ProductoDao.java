/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMysql;
import Entidades.Producto;


/**
 *
 * @author oswaldpale
 */
public class ProductoDao {
    public ConexionMysql _conexion = new ConexionMysql();
   public boolean insertarProducto(Producto p){
       String sql = "INSERT "
                        + "INTO "
                        + "    producto "
                        + "    ( "
                        + "        id_tipo_equipo, "
                        + "        idmarca, "
                        + "        modelo, "
                        + "        n_serie "
                        + "    ) "
                        + "    VALUES "
                        + "    ( "
                        + "        " + p.getIdtipoequipo() +", "
                        + "        " + p.getIdmarca() + ", "
                        + "       '" + p.getModelo()  + "', "
                        + "       '" + p.getSerial() + "'"
                        + "    )";
       return _conexion.SetData(sql);
   }
   
   
  
   
   
}
