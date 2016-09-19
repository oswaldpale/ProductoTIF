/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Cliente_producto_Valoracion;
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
    public Cliente_producto_Valoracion Consulta_Cliente_producto_valoracion(Producto p){
        return cpdDao.Consulta_Cliente_producto_valoracion(p);
    }
    
    
}
