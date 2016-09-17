/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.TipoEquipoDao;
import Modelo.TipoEquipo;
import Modelo.TipoServicio;
import java.util.ArrayList;

/**
 *
 * @author oswaldpale
 */
public class ControllerTipoEquipo {
    public TipoEquipoDao _tipoEquipo = new TipoEquipoDao();
    public String consultarTipoEquipo() {

        ArrayList<TipoEquipo> dt = _tipoEquipo.ConsultarTipoEquipo();

        String html = "  <div class=\"col-xs-8\">\n"
                      + "  <select class=\"form-control\" id=\"tipoesquipo_id\" name =\"ntipoequipo\">";
        
        for (TipoEquipo equipo : dt) {
            
            html = html + "<option value='" + equipo.getIdtipoequipo()+ "'>" + equipo.getNombreTipo() + "</option>";

        }
        html = html + " </select>  \n"
                + "                    </div> ";
        return html;
    }
    
    public String EnviarDatos(String valor){
        String valor1  = valor;
        return valor1;
    }
    
    
}
