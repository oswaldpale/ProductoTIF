/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMysql;
import Entidades.Cliente_producto_Valoracion;
import Entidades.MantenimientoPiezas;
import Entidades.Tecnico;
import Entidades.ValoracionProducto;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author oswaldpale
 */
public class MantenimientoPiezaDao {
    public ConexionMysql _conexion = new ConexionMysql();
    
    public ArrayList ConsultarMantenimientoPendiente() {
        String sql = "SELECT "
                        + "    vp.id_cliente_tecnico, "
                        + "UPPER(CONCAT('(',tq.nombreEquipo,') ',m.nombremarca,' MODELO: ',p.modelo,' #SERIE: ',p.n_serie)) AS nombrequipo "
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
                        + "estado= 'revisado' "
                        + " OR estado='pendiente' "
                        + "AND estado_producto='A' ";
  
        ArrayList dt = _conexion.GetData(sql);
       
        return dt; 
                 
    }
    public ArrayList MostrarDetalleProducto(String idservicio){
        String sql = "SELECT "
                        + "    vp.id_cliente_tecnico, "
                        + "    vp.fecha_ingreso, "
                        + "    ts.NombreServicio, "
                        + "    UPPER( CONCAT(t.nombre,' ',t.apellido)) AS nombreTecnico, "
                        + "    vp.id_sistema_operativo, "
                        + "    vp.diagnostico_inicial, "
                        + "    vp.tecnico_cc_tecnico, "
                        + "    so.nombreSistema "
                        + "FROM "
                        + "    valoracion_producto vp "
                        + "INNER JOIN tiposervicio ts "
                        + "ON "
                        + "    vp.id_tipo_servicio = ts.idservicio "
                        + "INNER JOIN tecnico t "
                        + "ON "
                        + "    vp.tecnico_cc_tecnico = t.cc_tecnico "
                        + "INNER JOIN serviciotecnico.tiposistemaoperativo so "
                        + "ON "
                        + "    vp.id_sistema_operativo = so.idsistema "
                        + "WHERE "
                        + "    vp.id_cliente_tecnico =" + idservicio;
         ArrayList dt = _conexion.GetData(sql);
         return dt;
        
    }

    public boolean RegistrarMantenimiento(MantenimientoPiezas m) {
        String sql = "INSERT "
                        + "INTO "
                        + "    mantenimiento_piezas "
                        + "    ( "
                        + "        pruebas_realizadas, "
                        + "        cambio_de_parte, "
                        + "        reporte_final, "
                        + "        recomendaciones, "
                        + "        estado, "
                        + "        valor_servicio, "
                        + "        fecha_revision, "
                        + "        valoracion_producto_id_cliente_tecnico "
                        + "    ) "
                        + "    VALUES "
                        + "    ( "
                        + "        '" + m.getPruebasrealizadas() + "', "
                        + "        '" + m.getCambioparte() + "', "
                        + "        '" + m.getReportefinal() + "', "
                        + "        '" + m.getRecomendacion()+ "', "
                        + "        'A', "
                        + "         " + m.getValor_servicio() + ", "
                        + "        now(), "
                        + "        " + m.getIdproductovaloracion() +" "
                        + "    )";
        return _conexion.SetData(sql);
    }
    public ArrayList MostrarMantenimiento(String idservicio){
        String sql ="SELECT "
                        + "    pruebas_realizadas, "
                        + "    cambio_de_parte, "
                        + "    valor_servicio "
                        + "FROM "
                        + "    mantenimiento_piezas "
                        + "WHERE valoracion_producto_id_cliente_tecnico=" + idservicio;
        return _conexion.GetData(sql);
    }
}
