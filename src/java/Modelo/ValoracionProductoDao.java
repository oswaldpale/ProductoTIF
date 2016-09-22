/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMysql;
import Entidades.ValoracionProducto;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author oswaldpale
 */
public class ValoracionProductoDao {
    
   ConexionMysql _connection = new ConexionMysql();
   
    public boolean insertarValoracionProducto(ValoracionProducto v){
            String sql = "INSERT "
                            + "INTO "
                            + "    valoracion_producto "
                            + "    ( "
                            + "        fecha_ingreso, "
                            + "        id_tipo_servicio, "
                            + "        id_sistema_operativo, "
                            + "        diagnostico_inicial, "
                            + "        valor_total, "
                            + "        productoid, "
                            + "        Cliente_cc_cliente, "
                            + "        tecnico_cc_tecnico, "
                            + "        estado, "
                            + "        estado_producto "
                            + "    ) "
                            + "    VALUES "
                            + "    ( "
                            + "        now(), "
                            + "        " + v.getId_tipo_servicio() +","
                            + "        " + v.getId_sistema_operativo() +", "
                            + "       '" + v.getDiagnostico_inicial() +"', "
                            + "        0,"
                            + "        " + v.getProductoid() + ", "
                            + "       '" +v.getCliente_cc_cliente() +"', "
                            + "        " + v.getTecnico_cc_tecnico()+ ", "
                            + "        'pendiente', "
                            + "        'A' "
                            + "    )";
            return _connection.SetData(sql);
        }

    public String consultarServicio() {
       String sql = "SELECT MAX(vp.id_cliente_tecnico) AS codigo FROM valoracion_producto vp";
       ArrayList dt =  _connection.GetData(sql);
        for (Object object : dt) {
            HashMap item =(HashMap) object;
            String codigo = item.get("codigo").toString();
            return codigo;
        }
        return "";
    }
}
