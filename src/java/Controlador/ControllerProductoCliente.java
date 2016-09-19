/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Producto;
import Entidades.Usuario;
import Modelo.ClienteproductoDAO;

/**
 *
 * @author PcIsa
 */
public class ControllerProductoCliente {
    ClienteproductoDAO cpdDao = new ClienteproductoDAO(); 
   
    public boolean Cliente_Producto_Login(Usuario u, Producto p){
        return cpdDao.Cliente_Producto_Login(u, p);
    }
    
    
}
