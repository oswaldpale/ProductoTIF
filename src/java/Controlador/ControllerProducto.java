/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ProductoDao;
import Entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author oswaldpale
 */
public class ControllerProducto {
<<<<<<< HEAD
    ProductoDao _p = new ProductoDao();
=======
    public ProductoDao _p = new ProductoDao();
>>>>>>> pamo
    
    public boolean insertarProducto(Producto producto){
        return _p.insertarProducto(producto);
    }
    
   public String consultarProducto() {

        ArrayList<Producto> dt = _p.consultarProductos();

        String html = "  <div class=\"col-xs-8\">\n"
                      + "  <select class=\"form-control\" id=\"marca_id\" name =\"nproducto\" >" ;
        html = html + "<option value='" + 0 + "'>" + "  " + "</option>";
        for (Producto prod : dt) {
            
            html = html + "<option value='" + prod.getCodigo()+ "'>" + prod.getModelo()+ "</option>";

        }
        html = html + " </select>  \n"
                + " </div> ";
        return html;
    }
}
