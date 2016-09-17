/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Modelo.Usuario;
import Conexion.ConexionMysql;
import java.util.ArrayList;

/**
 *
 * @author oswaldpale
 */
public class UsuarioDao {
    private  ConexionMysql _connection = new ConexionMysql();
    public ArrayList consultarUsuario(Usuario _usuario){
    String sql = "SELECT "
                    + "    NOMBRE, "
                    + "    APELLIDOS, "
                    + "    CONTRASENA "
                    + "FROM "
                    + "    usuario "
                    + "WHERE LOGIN='" + _usuario.getPassword() + "'";
    
        return null;
    }
}
