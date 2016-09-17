/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Entidades.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SeguridadDao {

//    public static boolean esUsuarioValido(Usuario user) throws SQLException {
//        Connection conexion = null;
//        boolean esValido = false;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            String servidor = "jdbc:mysql://localhost/validacion";
//            String usuarioDB = "root";
//            String passwordDB = "12345";
//            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
//            System.out.println("conexion Exitosa");
//
//            Statement sta = conexion.createStatement();
//
//            String srtQuery = "SELECT * FROM usuario WHERE username ='" + user.getUsername().trim() + "'";
//
//            ResultSet rs = sta.executeQuery(srtQuery);
//
//            if (rs.next()) {
//                if (rs.getString("clave").equals(user.getPassword())) {
//                    user.setNombre(rs.getString("nombre"));
//                    esValido = true;
//                }
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(SeguridadDao.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(SeguridadDao.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if (conexion != null && !conexion.isClosed()) {
//                conexion.close();
//            }
//        }
//
//        return esValido;
//    }

    public static boolean registrar(Usuario reUsuario) throws SQLException {
        Connection conexion = null;
        boolean registrado = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/validacion";
            String usuarioDB = "root";
            String passwordDB = "12345";
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("conexion Exitosa");

            String sentenciaSQL = "insert into cliente values(0,'','','','','','');";
            
            PreparedStatement preparedSta = conexion.prepareStatement(sentenciaSQL);
            
            preparedSta.setString(1, reUsuario.getNombre());  //
            preparedSta.setString(2, reUsuario.getApellido()); //
            preparedSta.setString(3, reUsuario.getCedula()); ///
            preparedSta.setString(4, reUsuario.getOcupacion());  //
            preparedSta.setString(5, reUsuario.getTelefono());    ///
            preparedSta.setString(6, reUsuario.getCelular());  ///
            preparedSta.setString(7, reUsuario.getEmail());  ///
            
            
            
            if (!preparedSta.execute()) {
                registrado = true;
                System.out.println("Registros Insertados");
            } else {
                registrado = false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SeguridadDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SeguridadDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        }
        return registrado;
    }
    
    public static boolean consultar(Usuario user) throws SQLException {
        Connection conexion = null;
        boolean consultas = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/validacion";
            String usuarioDB = "root";
            String passwordDB = "12345";
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("conexion Exitosa");

            Statement sta = conexion.createStatement();

            String srtQuery = "SELECT * FROM cliente WHERE cc_cliente ='" + user.getCedula().trim() + "'";

            ResultSet rs = sta.executeQuery(srtQuery);

            if(rs.next()) {
                    user.setNombre(rs.getString("nombre"));
                    user.setApellido(rs.getString("apellidos"));
                    user.setCedula(rs.getString("numeroIdentificacion"));
                    user.setOcupacion(rs.getString("ocupacion"));
                    user.setTelefono(rs.getString("telFijo"));
                    user.setCelular(rs.getString("telMovil"));
                    user.setEmail(rs.getString("email"));                    
                    
                    consultas = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SeguridadDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SeguridadDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        }

        return consultas;
    }
    
    
}
