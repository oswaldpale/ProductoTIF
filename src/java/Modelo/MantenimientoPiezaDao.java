/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMysql;
import Entidades.MantenimientoPiezas;
import java.util.ArrayList;

/**
 *
 * @author oswaldpale
 */
public class MantenimientoPiezaDao {
    public ConexionMysql _conexion = new ConexionMysql();
    
    public ArrayList<MantenimientoPiezas> ConsultarDetalleMantenimiento(MantenimientoPiezas servicio) {

        String sql = "";

        MantenimientoPiezas pa = new MantenimientoPiezas();
        ArrayList dt = _conexion.GetData(sql);

        for (Object object : dt) {
            
            
            HashMap item = (HashMap) object;
            pa.setNumServicio(item.get("id_cliente_tecnico").toString());
            pa.setTipoServicio(item.get("NombreServicio").toString());
            pa.setFechaIngreso(item.get("fecha_ingreso").toString());
            pa.setMarca(item.get("nombremarca").toString());
            pa.setEstado(item.get("estado").toString());
            pa.setModelo(item.get("modelo").toString());
            pa.setEstado_producto(item.get("estado_producto").toString());
            pa.setNombreEquipo(item.get("nombreEquipo").toString());
            pa.setPrecioMantenimiento(item.get("valor_total").toString());
        }
        return pa;

    }
}
