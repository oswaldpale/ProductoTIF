/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Tecnico;
import Modelo.MantenimientoPiezaDao;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author oswaldpale
 */
public class ControllerMantenimientoPiezas {
    
    public String ConsultarEquiposParaRevision(Tecnico tecnico) {
        MantenimientoPiezaDao man = new MantenimientoPiezaDao();
        ArrayList dt = man.ConsultarMantenimientoPendiente(tecnico);
         String htmlcode = "  <div class=\"col-xs-8\">\n"
                      + "  <select class=\"form-control\" id=\"sequipo\" name=\"ncliente\">";
        htmlcode = htmlcode + "<option value='" + 0 + "'>" + "  " + "</option>";
        for (Object object : dt) {
            HashMap item = (HashMap) object;
                htmlcode = htmlcode + "<option value='" +item.get("id_cliente_tecnico") + "'>" + item.get("nombrequipo")+ "</option>";
        }
                
        return htmlcode;
    }
    
  
}
