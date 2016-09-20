/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Tecnico;
import Modelo.TecnicoDao;

/**
 *
 * @author oswaldpale
 */
public class ControllerTecnico {
    public TecnicoDao _tecnico = new TecnicoDao();
    
    
//     public String consultarTecnicos() {
//
//        ArrayList<Tecnico> dt = _tecnico.TecnicoLogin(t);
//
//        String html = "  <div class=\"col-xs-8\">\n"
//                      + "  <select class=\"form-control\" id=\"tecnico\" name=\"ntecnico\">";
//        html = html + "<option value='" + 0 + "'>" + "  " + "</option>";
//        for (Tecnico tec : dt) {
//            
//            html = html + "<option value='" + tec.getCodigo()+ "'>" + tec.getNombre()+ "</option>";
//
//        }
//        html = html + " </select>  \n"
//                    + "</div> ";
//        return html;
//    }
//    
//     public String prueba(String valor){
//      return "prueba";
//     }
    
    public boolean tecnico_Login(Tecnico t){
        return _tecnico.TecnicoLogin(t);
    }
}
