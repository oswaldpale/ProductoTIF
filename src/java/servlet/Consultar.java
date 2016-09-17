/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Conexion.SeguridadDao;
import Entidades.RegistrarUsuario;
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
 * @author luis
 */
public class Consultar extends HttpServlet {

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
            String numeroCedula = request.getParameter("numeroCedula");
            String numeroSerie = request.getParameter("numeroSerie");

            System.out.println("numero de Cedula " + numeroCedula);
            System.out.println("numero de Serie " + numeroSerie);
            
            RegistrarUsuario consulta = new RegistrarUsuario();
            
            if (numeroCedula != null && !numeroCedula.equalsIgnoreCase("")) {
                System.out.println("Consultar por número de Cedula");
                consulta.setnIdent(numeroCedula);
                
                boolean reconsulta = SeguridadDao.consultar(consulta);
                System.out.println("reconsulta" + reconsulta);
                if(reconsulta){
                    System.out.println("Se consulto exitosamente");
                    request.getSession().setAttribute("DatosUsuarios", consulta);
                  //  response.sendRedirect("/mostrarConsulta.jsp");
                     dispacher = getServletContext().getRequestDispatcher("/mostrarConsulta.jsp"); 
                     dispacher.forward(request, response);
                     System.out.println("final");
                }
                
                
            } else {
                if (numeroSerie != null && !numeroSerie.equalsIgnoreCase("")) {
                    System.out.println("Consultar por numero de servicio");
                    consulta.setNumeroSerie(numeroSerie);
                    
                }
            }




        } finally {
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
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
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
