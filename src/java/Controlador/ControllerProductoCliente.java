/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Cliente_producto_Valoracion;
import Entidades.DetalleServicio;
import Entidades.Producto;
import Entidades.Usuario;
import Modelo.ClienteproductoDAO;
import java.util.ArrayList;

/**
 *
 * @author PcIsa
 */
public class ControllerProductoCliente {
    ClienteproductoDAO cpdDao = new ClienteproductoDAO(); 
   
    public boolean Cliente_Producto_Login(Usuario u, Producto p){
        return cpdDao.Cliente_Producto_Login(u, p);
    }
    public Usuario Consulta_Usuario(Usuario usu){
        return cpdDao.Consulta_Usuario(usu);
    }
    public Cliente_producto_Valoracion Consulta_Cliente_producto_valoracion(String codservicio){
        return cpdDao.Consulta_Cliente_producto_valoracion(codservicio);
    }
    
    public String ConsultarDetalleServicio(String p){
        
        ArrayList<DetalleServicio> det =  cpdDao.consultarDetalleServicio(p);
        String htmlcode="";
        int contador =0;
        for (DetalleServicio ds : det) {
            contador=contador + 1;
            htmlcode = htmlcode +  " <tr>\n" +
                                   "     <td>" + contador + " </td>\n" +
                                   "     <td>" + ds.getPruebaRealizada() + "</td>\n" +
                                   "     <td>" + ds.getCambioparte() + "</td>\n" +
                                   "     <td>" + ds.getValorservicio()+ "</td>\n" +
                                   " </tr>\n";
        }
        
      
        return htmlcode;
    }
    
    
}
