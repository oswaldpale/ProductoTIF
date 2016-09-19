/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.TipoServicioDao;
import Entidades.TipoServicio;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author oswaldpale
 */
public class ControllerTipoServicio {

    public TipoServicioDao _Servicio = new TipoServicioDao();

    public String consultarTipoServicio() {

        ArrayList<TipoServicio> dt = _Servicio.ConsultarTipoServicio();

        String html = "  <div class=\"col-xs-8\">\n"
                      + "  <select class=\"form-control\" id=\"state_id\" name=\"nservicio\">";
        html = html + "<option value='" + 0 + "'>" + "  " + "</option>";
        for (TipoServicio service : dt) {
            
            html = html + "<option value='" + service.getCodigo() + "'>" + service.getNombreServicio() + "</option>";

        }
        html = html + " </select>  \n"
                + "                    </div> ";
        return html;
    }

}
