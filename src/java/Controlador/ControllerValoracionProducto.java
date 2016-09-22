/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.ValoracionProducto;
import Modelo.ValoracionProductoDao;

/**
 *
 * @author oswaldpale
 */
public class ControllerValoracionProducto {
    ValoracionProductoDao valoracion = new ValoracionProductoDao();
    
     public boolean insertarValoracionProducto(ValoracionProducto v){
        return valoracion.insertarValoracionProducto(v);
    }

    public String consultarServicio() {
        return valoracion.consultarServicio();
    }
}
