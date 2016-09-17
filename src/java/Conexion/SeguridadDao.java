/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Entidades.RegistrarUsuario;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SeguridadDao {

    public static boolean esUsuarioValido(Usuario user) throws SQLException {
        Connection conexion = null;
        boolean esValido = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/validacion";
            String usuarioDB = "root";
            String passwordDB = "12345";
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("conexion Exitosa");

            Statement sta = conexion.createStatement();

            String srtQuery = "SELECT * FROM usuario WHERE username ='" + user.getUsername().trim() + "'";

            ResultSet rs = sta.executeQuery(srtQuery);

            if (rs.next()) {
                if (rs.getString("clave").equals(user.getPassword())) {
                    user.setNombre(rs.getString("nombre"));
                    esValido = true;
                }
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

        return esValido;
    }

    public static boolean registrar(RegistrarUsuario reUsuario) throws SQLException {
        Connection conexion = null;
        boolean registrado = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/validacion";
            String usuarioDB = "root";
            String passwordDB = "12345";
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("conexion Exitosa");

            String sentenciaSQL = "INSERT INTO DatosUsuarios(nombre,apellidos,numeroIdentificacion,ocupacion,telFijo,telMovil,email,"
                    + "numeroServicio,fechaIngreso,elemento,tipoServicio,marca,sistemaOperativo,modelo,numeroSerie,diagnosticoInicial"
                    + ",tecnicoEncargado,numeroServicio2,cambioParte,pruebasRealizadas,reporteFinal,recomendaciones,valorServicio) VALUES "
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement preparedSta = conexion.prepareStatement(sentenciaSQL);
            
            preparedSta.setString(1, reUsuario.getNombre());  //
            preparedSta.setString(2, reUsuario.getApellidos()); //
            preparedSta.setString(3, reUsuario.getnIdent()); ///
            preparedSta.setString(4, reUsuario.getOcupacion());  //
            preparedSta.setString(5, reUsuario.getFijo());    ///
            preparedSta.setString(6, reUsuario.getMovil());  ///
            preparedSta.setString(7, reUsuario.getEmail());  ///
            
            preparedSta.setString(8, reUsuario.getNumeroServicio()); ///
            preparedSta.setString(9, reUsuario.getFechaIngreso());  ////
            preparedSta.setString(10, reUsuario.getElemento()); /// 
            preparedSta.setString(11, reUsuario.getTipoServicio()); ///
            preparedSta.setString(12, reUsuario.getMarca()); ///
            preparedSta.setString(13, reUsuario.getSistemaOperativo()); ///
            preparedSta.setString(14, reUsuario.getModelo());  ///
            
            preparedSta.setString(15, reUsuario.getNumeroSerie()); ///
            preparedSta.setString(16, reUsuario.getDiagnosticoInicial()); ///
            preparedSta.setString(17, reUsuario.getTecnicoEncargado()); ////
            preparedSta.setString(18, reUsuario.getNumeroServicio2()); ///
            preparedSta.setString(19, reUsuario.getCambioParte()); ///
            preparedSta.setString(20, reUsuario.getPruebasRealizadas()); ///
            preparedSta.setString(21, reUsuario.getReporteFinal());  ///
            
            preparedSta.setString(22, reUsuario.getRecomendaciones()); ///
            preparedSta.setString(23, reUsuario.getValorServicio()); ///
            
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
    
    public static boolean consultar(RegistrarUsuario user) throws SQLException {
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

            String srtQuery = "SELECT * FROM DatosUsuarios WHERE numeroIdentificacion ='" + user.getnIdent().trim() + "'";

            ResultSet rs = sta.executeQuery(srtQuery);

            if(rs.next()) {
                    user.setNombre(rs.getString("nombre"));
                    user.setApellidos(rs.getString("apellidos"));
                    user.setnIdent(rs.getString("numeroIdentificacion"));
                    user.setOcupacion(rs.getString("ocupacion"));
                    user.setFijo(rs.getString("telFijo"));
                    user.setMovil(rs.getString("telMovil"));
                    user.setEmail(rs.getString("email"));
                    user.setNumeroServicio(rs.getString("numeroServicio"));
                    user.setFechaIngreso(rs.getString("fechaIngreso"));
                    user.setElemento(rs.getString("elemento"));
                    user.setTipoServicio(rs.getString("tipoServicio"));
                    user.setMarca(rs.getString("marca"));
                    user.setSistemaOperativo(rs.getString("sistemaOperativo"));
                    user.setModelo(rs.getString("modelo"));
                    user.setNumeroSerie(rs.getString("numeroSerie"));
                    user.setDiagnosticoInicial(rs.getString("diagnosticoInicial"));
                    user.setTecnicoEncargado(rs.getString("tecnicoEncargado"));
                    user.setNumeroServicio2(rs.getString("numeroServicio2"));
                    user.setCambioParte(rs.getString("cambioParte"));
                    user.setPruebasRealizadas(rs.getString("pruebasRealizadas"));
                    user.setReporteFinal(rs.getString("reporteFinal"));
                    user.setRecomendaciones(rs.getString("recomendaciones"));
                    user.setValorServicio(rs.getString("valorServicio"));
                    
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
