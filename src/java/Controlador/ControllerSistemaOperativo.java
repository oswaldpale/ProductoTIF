/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.SistemaOperativoDao;
import Entidades.SistemaOperativo;
import java.util.ArrayList;

/**
 *
 * @author oswaldpale
 */
public class ControllerSistemaOperativo {
    public SistemaOperativoDao _tipoEquipo = new SistemaOperativoDao();
    public String consultarSistemaOperativo() {

        ArrayList<SistemaOperativo> dt = _tipoEquipo.ConsultarSistemaOperativo();

        String html = "  <div class=\"col-xs-8\">\n"
                      + "  <select class=\"form-control\" id=\"sistemaoperativo_id\">";
        
        for (SistemaOperativo sistema : dt) {
            
            html = html + "<option value='" + sistema.getIdsistema()+ "'>" + sistema.getNombreSistema() + "</option>";

        }
        html = html + " </select>  \n"
                + "                    </div> ";
        return html;
    }
}
