/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.SistemaOperativo;
import Entidades.Usuario;
import Modelo.UsuarioDao;
import java.util.ArrayList;

/**
 *
 * @author PcIsa
 */
public class ControllerCliente {
    public UsuarioDao _cliente = new UsuarioDao();
    public boolean insertarCliente(Usuario usu){
        return _cliente.insertarCliente(usu);
    }
    public String consultarCliente() {

        ArrayList<Usuario> dt = _cliente.consultarClientes();

        String html = "  <div class=\"col-xs-8\">\n"
                      + "  <select class=\"form-control\" id=\"cliente\" name=\"ncliente\">";
        html = html + "<option value='" + 0 + "'>" + "  " + "</option>";
        for (Usuario usu : dt) {
            
            html = html + "<option value='" + usu.getCedula()+ "'>" + usu.getNombre()+ "</option>";

        }
        html = html + " </select>  \n"
                    + "</div> ";
        return html;
    }
}
