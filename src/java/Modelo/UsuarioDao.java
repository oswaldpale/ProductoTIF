/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMysql;
import Entidades.Marca;
import Entidades.Usuario;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author oswaldpale
 */
public class UsuarioDao {
    ConexionMysql _connection = new ConexionMysql();
    
    public boolean insertarCliente(Usuario usu){
            String sql = "INSERT "
                             + "INTO "
                             + "    cliente "
                             + "    VALUES "
                             + "    ( "
                             + "       '" + usu.getCedula() +"', "
                             + "       '" + usu.getNombre() + "', "
                             + "       '" + usu.getApellido()  + "', "
                             + "       '" + usu.getTelefono() + "',"
                             + "       '" + usu.getCelular()+ "', "
                             + "       '" + usu.getEmail()  + "', "
                             + "       '" + usu.getOcupacion() + "'"
                             + "    )";
            return _connection.SetData(sql);
        }

    public ArrayList<Usuario> consultarClientes() {
        String sql = "SELECT "
                        + "    cc_cliente, "
                        + "    CONCAT(nombre,' ',apellido)  AS nombre "
                        + "FROM "
                        + "    cliente";
        ArrayList<Usuario> SetServicio = new ArrayList<Usuario>();
        ArrayList dt = _connection.GetData(sql);
        
        for (Object object : dt) {
            
             Usuario registro = new Usuario();
             HashMap item =(HashMap) object;
             registro.setCedula(item.get("cc_cliente").toString());
             registro.setNombre(item.get("nombre").toString());
             SetServicio.add(registro);
        }

       return SetServicio; 
    }
}
