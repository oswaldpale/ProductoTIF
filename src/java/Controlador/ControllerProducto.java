/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.ProductoDao;
import Modelo.Producto;

/**
 *
 * @author oswaldpale
 */
public class ControllerProducto {
    public ProductoDao _p = new ProductoDao();
    public boolean insertarProducto(Producto producto){
        return _p.insertarProducto(producto);
    }
}
