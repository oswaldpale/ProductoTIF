/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMysql;
import Entidades.Producto;
import Entidades.Usuario;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author PcIsa
 */
public class ClienteproductoDAO {

    public ConexionMysql _conexion = new ConexionMysql();

    public ArrayList<Producto> Consulta_Cliente_producto_valoracion(Producto p) {

        String sql = ""
                    + "select vp.id_cliente_tecnico as numServicio,ts.NombreServicio as TipoServicio,  vp.fecha_ingreso as fechaIngreso, m.nombremarca as marca, vp.estado as estado, p.modelo as modelo, vp.estado_producto, te.nombreEquipo as nombreEquipo, vp.valor_total as precioMantenimiento from marca m "
                    + "inner join producto p "
                    + "on p.idmarca = m.idmarca "
                    + "inner join tipoequipo te "
                    + "on p.id_tipo_equipo = te.idtipoequipo "
                    + "inner join valoracion_producto vp "
                    + "on vp.productoid = p.idproducto "
                    + "inner join tiposistemaoperativo tp "
                    + "on vp.id_sistema_operativo = tp.idsistema "
                    + "inner join tiposervicio ts "
                    + "on vp.id_tipo_servicio = ts.idservicio "
                    + "where p.n_serie = "+p.getSerial()+";";

        ArrayList<Producto> SetServicio = new ArrayList<Producto>();
        ArrayList dt = _conexion.GetData(sql);

        for (Object object : dt) {
            
            Producto pa = new Producto();
            HashMap item = (HashMap) object;
            pa.setSerial(item.get("n_serie").toString());
            SetServicio.add(pa);
        }
        return SetServicio;

    }

    public ArrayList<Usuario> Consulta_Usuario(Usuario usu) {

        String sql = ""
                    + "select concat('c.nombre','c.apellido') as nombreCompleto, "
                    + " c.telefono, c.celular, c.ocupacion FROM cliente c "
                    + "where c.cc_cliente = '"+usu.getCedula()+"';";

        ArrayList<Usuario> SetServicio = new ArrayList<Usuario>();
        ArrayList dt = _conexion.GetData(sql);

        for (Object object : dt) {

            Usuario u = new Usuario();
            HashMap item = (HashMap) object;
            u.setCedula(item.get(usu.getCedula()).toString());
            SetServicio.add(u);
        }

        return SetServicio;

    }

    public boolean Cliente_Producto_Login(Usuario u, Producto p) {
        String sql = ""
                + "select count(*) as existe FROM cliente c "
                + "inner join valoracion_producto vp "
                + "on vp.Cliente_cc_cliente = c.cc_cliente "
                + "inner join producto p "
                + "on p.idproducto = vp.productoid "
                + "where c.cc_cliente = '"+u.getCedula()+"' and p.n_serie = '"+p.getSerial()+"' and vp.estado_producto='A';";
        
        ArrayList dt = _conexion.GetData(sql);
        for (Object object : dt) {            
            HashMap item = (HashMap) object;
            if(Integer.parseInt(item.get("existe").toString())>0){
                return true;
            }            
        }
        return false;
    }
}
