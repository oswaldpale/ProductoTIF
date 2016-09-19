/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MarcaDao;
import Entidades.Marca;
import java.util.ArrayList;

/**
 *
 * @author oswaldpale
 */
public class ControllerMarca {
    public MarcaDao _marca = new MarcaDao();
    public String consultarMarca() {

        ArrayList<Marca> dt = _marca.ConsultarMarca();

        String html = "  <div class=\"col-xs-8\">\n"
                      + "  <select class=\"form-control\" id=\"marca_id\" name =\"nmarca\" >" ;
        html = html + "<option value='" + 0 + "'>" + "  " + "</option>";
        for (Marca marc : dt) {
            
            html = html + "<option value='" + marc.getIdmarca()+ "'>" + marc.getNombre() + "</option>";

        }
        html = html + " </select>  \n"
                + " </div> ";
        return html;
    }
}
