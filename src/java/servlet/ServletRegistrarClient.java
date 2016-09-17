/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Conexion.SeguridadDao;
import Entidades.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PcIsa
 */
public class ServletRegistrarClient extends HttpServlet {

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
            PrintWriter out = response.getWriter();
            RequestDispatcher dispacher;
        try {
            Usuario usu = new Usuario();
            usu.setCedula(request.getParameter("cc_cliente"));
            usu.setNombre(request.getParameter("nombre"));
            usu.setApellido(request.getParameter("apellido"));
            usu.setTelefono(request.getParameter("telefono"));
            usu.setCelular(request.getParameter("celular"));
            usu.setEmail(request.getParameter("email"));
            usu.setOcupacion(request.getParameter("ocupacion"));
            
            
            if(usu.getNombre() != null && !usu.getNombre().equalsIgnoreCase("") &&
               usu.getApellido() != null && !usu.getApellido().equalsIgnoreCase("") &&
               usu.getCedula() != null && !usu.getCedula().equalsIgnoreCase("") &&
               usu.getOcupacion() != null && !usu.getOcupacion().equalsIgnoreCase("") && 
               usu.getTelefono() != null && !usu.getTelefono().equalsIgnoreCase("") && 
               usu.getCelular() != null && !usu.getCelular().equalsIgnoreCase("") && 
               usu.getEmail() != null && !usu.getEmail().equalsIgnoreCase(""))
            {
                                  
                 boolean registrado = SeguridadDao.registrar(usu);
                  if (registrado) {
                    dispacher = getServletContext().getRequestDispatcher("/Principal.jsp");  
                    dispacher.forward(request, response);
                    System.out.println("Registrado correctamente pagina principal");
                  }
            }
        }finally{            
            out.close();
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
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
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


