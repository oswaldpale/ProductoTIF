/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMysql;
import Entidades.MantenimientoPiezas;
import Entidades.Tecnico;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author oswaldpale
 */
public class MantenimientoPiezaDao {
    public ConexionMysql _conexion = new ConexionMysql();
    
    public ArrayList ConsultarMantenimientoPendiente(Tecnico tec) {
         
        String sql = "SELECT "
                        + "    vp.id_cliente_tecnico, "
                        + "    vp.fecha_ingreso, "
                        + "    ts.NombreServicio, "
                        + "    UPPER(CONCAT('(',c.cc_cliente,') ',c.nombre,' ',c.apellido)) AS nombreCliente, "
                        + "UPPER(CONCAT('(',tq.nombreEquipo,')')) AS nombrequipo, "
                        + "    tso.nombreSistema, "
                        + "    vp.diagnostico_inicial, "
                        + "    vp.fecha_revision "
                        + "FROM "
                        + "    valoracion_producto vp "
                        + "INNER JOIN tiposervicio ts "
                        + "ON "
                        + "    vp.id_tipo_servicio = ts.idservicio "
                        + "INNER JOIN tiposistemaoperativo tso "
                        + "ON "
                        + "    vp.id_sistema_operativo = tso.idsistema "
                        + "INNER JOIN cliente c "
                        + "ON vp.Cliente_cc_cliente = c.cc_cliente "
                        + "INNER JOIN producto p "
                        + "ON "
                        + "   vp.productoid = p.idproducto "
                        + "INNER JOIN marca m "
                        + "ON p.idmarca = m.idmarca "
                        + "INNER JOIN tipoequipo tq "
                        + "ON p.id_tipo_equipo = tq.idtipoequipo "
                        + "WHERE "
                        + "    id_cliente_tecnico='1' "
                        + "AND estado= 'revisado' "
                        + " OR estado='pendiente' "
                        + "AND estado_producto='A' "
                        + "AND tecnico_cc_tecnico = "
                        + "'" +tec.getCodigo() +"'";

        MantenimientoPiezas pa = new MantenimientoPiezas();
        ArrayList dt = _conexion.GetData(sql);
        return dt; 
                 
    }
}
