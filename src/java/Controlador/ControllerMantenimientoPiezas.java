/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.MantenimientoPiezas;
import Entidades.Tecnico;
import Modelo.MantenimientoPiezaDao;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author oswaldpale
 */
public class ControllerMantenimientoPiezas {
    public MantenimientoPiezaDao man = new MantenimientoPiezaDao();
    public String ConsultarEquiposParaRevision() {
        
        ArrayList dt = man.ConsultarMantenimientoPendiente();
         String htmlcode = 
                      "  <select class=\"form-control\" id=\"sequipo\" name=\"ncliente\">";
        htmlcode = htmlcode + "<option value='" + 0 + "'>" + "  " + "</option>";
        for (Object object : dt) {
            HashMap item = (HashMap) object;
                htmlcode = htmlcode + "<option value='" +item.get("id_cliente_tecnico") + "'>" + item.get("nombrequipo")+ "</option>";
        }
        htmlcode = htmlcode + "</select>";   
        return htmlcode;
    }
    
    public ArrayList MostrarDetalleProducto(String idservicio){
        return man.MostrarDetalleProducto(idservicio);
    }
    public boolean RegistrarMantenimiento(MantenimientoPiezas m){
        return man.RegistrarMantenimiento(m);
    
    }

    public ArrayList mostrarDetalleMantenimiento(String codservicio) {
        return man.MostrarMantenimiento(codservicio);
    }
    
    
  
}
