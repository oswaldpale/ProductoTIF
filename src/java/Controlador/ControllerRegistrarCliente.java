/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Usuario;
import Modelo.UsuarioDao;

/**
 *
 * @author PcIsa
 */
public class ControllerRegistrarCliente {
    public UsuarioDao _u = new UsuarioDao();
    public boolean insertarCliente(Usuario usu){
        return _u.insertarCliente(usu);
    }
}
