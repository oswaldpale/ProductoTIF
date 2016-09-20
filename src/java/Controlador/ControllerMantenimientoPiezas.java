/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Tecnico;
import Modelo.MantenimientoPiezaDao;
import java.util.ArrayList;

/**
 *
 * @author oswaldpale
 */
public class ControllerMantenimientoPiezas {
    
    public String ConsultarEquiposParaRevision(Tecnico tecnico) {
        MantenimientoPiezaDao man = new MantenimientoPiezaDao();
        ArrayList dt = man.ConsultarMantenimientoPendiente(tecnico);
        String htmlcode = "";
        for (Object object : dt) {
            
        }
                
        return htmlcode;
    }
    
  
}
