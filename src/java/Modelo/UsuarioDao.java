/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMysql;
import Entidades.Usuario;

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
}
