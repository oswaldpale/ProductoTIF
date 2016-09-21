/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Controlador.ControllerMantenimientoPiezas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entidades.Tecnico;
import Entidades.Usuario;
import javax.servlet.http.HttpSession;

/**
 *
 * @author oswaldpale
 */
@WebServlet(name = "ServletMantenimientoPiezas", urlPatterns = {"/ServletMantenimientoPiezas"})
public class ServletMantenimientoPiezas extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    ControllerMantenimientoPiezas mantenimiento = new ControllerMantenimientoPiezas();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            Tecnico tec = (Tecnico) session.getAttribute("tecnicoLogin");
            String action = request.getAttribute("action").toString();
            if (tec != null) { // Evalua El estado de la session
                mantenimiento.ConsultarEquiposParaRevision(tec);
                if ((!"".equals(action))){
                     String htmlcode ="";
                     if (action.equals("MostrarDetalle")){
                         
                     }else if(action.equals("InsertPieza")){
                    
                     }else if(action.equals("UpdateDetalle")){
                     
                     }
                     
                }
            } else {
                response.sendRedirect("/ProductoTIF/LoginTecnico.jsp"); // Si la session muere, redirecciono a l principal
            }
            out.println("<h1>Servlet ServletMantenimientoPiezas at " + request.getContextPath() + "</h1>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
