/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Conexion.SeguridadDao;
import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author luis
 */
public class Validacion extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispacher;
        try {
            String userName = request.getParameter("usuario");
            String userPass = request.getParameter("login");
            String strError = "";
            System.out.println(" " + userName);
            System.out.println(" " + userPass);
            //verificaciones
            if (userName != null && !userName.equalsIgnoreCase("") && userPass != null && !userPass.equalsIgnoreCase("")) {
                System.out.println("Datos completos");
                Usuario usuario = new Usuario();
                usuario.setUsername(userName);
                usuario.setPassword(userPass);

                boolean esValido = SeguridadDao.esUsuarioValido(usuario);

                if (esValido) {
                    dispacher = getServletContext().getRequestDispatcher("/Principal.jsp");
                    HttpSession sesion = request.getSession(true);
                    sesion.setAttribute("autUsuario", usuario);
                    dispacher.forward(request, response);
                } else {
                    strError = "Usuario y Password Incorrectos";
                    dispacher = getServletContext().getRequestDispatcher("/index.jsp");
                    HttpSession sesion = request.getSession(true);
                    sesion.setAttribute("auterror", strError);
                    dispacher.forward(request, response);
                }

            } else {
                strError = "Datos no validos";
                dispacher = getServletContext().getRequestDispatcher("/index.jsp");
                HttpSession sesion = request.getSession(true);
                sesion.setAttribute("auterror", strError);
                dispacher.forward(request, response);
            }



        } finally {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Validacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Validacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

