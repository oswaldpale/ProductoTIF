/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Controlador.ControllerValoracionProducto;
import Entidades.ValoracionProducto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author oswaldpale
 */
public class ServletSolicitudRevision extends HttpServlet {
     ControllerValoracionProducto valoracion = new ControllerValoracionProducto();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
           Map<String, String[]> v = request.getParameterMap();
            
            ValoracionProducto  items= new ValoracionProducto(); 

            items.setCliente_cc_cliente(request.getParameter("ncliente"));
            items.setTecnico_cc_tecnico(request.getParameter("ntecnico"));
            items.setProductoid(request.getParameter("nproducto"));
            items.setId_sistema_operativo(request.getParameter("nsistemaoperativo"));
            items.setId_tipo_servicio(request.getParameter("nservicio"));
            items.setDiagnostico_inicial(request.getParameter("ndiagnostico"));
                      
            if(valoracion.insertarValoracionProducto(items)){
                   response.sendRedirect("/ProductoTIF/PrincipalFuncionario.jsp");
            }else{
                   response.sendRedirect("/ProductoTIF/PageError.jsp");
            }
            
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
