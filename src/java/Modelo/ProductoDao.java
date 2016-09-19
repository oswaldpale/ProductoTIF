/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMysql;
import Entidades.Producto;
import java.util.ArrayList;
import java.util.HashMap;


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

    public ArrayList<Producto> consultarProductos() {
        String sql = "SELECT "
                        + " idproducto, UPPER(CONCAT( tq.nombreEquipo,' ',m.nombremarca,' ', p.modelo, ' ', p.n_serie)) AS nombre "
                        + "FROM "
                        + " producto p "
                        + "INNER JOIN "
                        + " marca m ON "
                        + " p.idmarca = m.idmarca "
                        + "INNER JOIN "
                        + "tipoequipo tq ON "
                        + "tq.idtipoequipo = p.id_tipo_equipo";
        
         ArrayList<Producto> SetServicio = new ArrayList<Producto>();
        ArrayList dt = _conexion.GetData(sql);
        
        for (Object object : dt) {
            
             Producto registro = new Producto();
             HashMap item =(HashMap) object;
             registro.setCodigo(item.get("idproducto").toString());
             registro.setModelo(item.get("nombre").toString());
             SetServicio.add(registro);
        }

       return SetServicio; 
    }
   
  
   
   
}
