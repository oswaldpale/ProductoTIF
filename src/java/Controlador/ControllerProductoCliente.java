/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Producto;
import Entidades.Usuario;
import Modelo.Cliente_productoDAO;

/**
 *
 * @author PcIsa
 */
public class Controller_Producto_Cliente {
    Cliente_productoDAO cpdDao = new Cliente_productoDAO(); 
   
    public boolean Cliente_Producto_Login(Usuario u, Producto p){
        return cpdDao.Cliente_Producto_Login(u, p);
    }
    
    
}
