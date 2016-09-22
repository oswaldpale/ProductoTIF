/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Controlador.ControllerMantenimientoPiezas;
import Entidades.MantenimientoPiezas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entidades.Tecnico;
import Entidades.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.http.HttpSession;

/**
 *
 * @author oswaldpale
 */
@WebServlet(name = "ServletMantenimientoPiezas", urlPatterns = {"/ServletMantenimientoPiezas"})
public class ServletMantenimientoPiezas extends HttpServlet {

    ControllerMantenimientoPiezas m= new ControllerMantenimientoPiezas();
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
            throws ServletException, IOException, ScriptException {
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
        try {
            processRequest(request, response);
        } catch (ScriptException ex) {
            Logger.getLogger(ServletMantenimientoPiezas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
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
        try {
            processRequest(request, response);
        } catch (ScriptException ex) {
            Logger.getLogger(ServletMantenimientoPiezas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          PrintWriter out = response.getWriter();
          HttpSession session = request.getSession();
          Map<String, String[]> v =   request.getParameterMap();
          Tecnico tec = (Tecnico) session.getAttribute("tecnicoLogin");
          String action = request.getParameter("action");
          String idservicio = request.getParameter("idservicio");
          if (tec != null) { // Evalua El estado de la session
              if ((!"".equals(action))){
                  
                  if (action.equals("MostrarDetalle")){
                      ArrayList dt =  m.MostrarDetalleProducto(idservicio);
                      for (Object object : dt) {
                          HashMap item = (HashMap) object;
                          out.println("<legend class=\"text-left bg-primary\">Detalle Equipo</legend>\n" +
"                                    <div class=\"form-group\" >\n" +
"                                        <label for=\"inputName\" class=\"control-label col-xs-2\">Fecha Ing</label>\n" +
"                                        <div class=\"col-xs-3\">\n" +
"                                            <input id=\"NFECHA\" name=\"NFECHA\" type=\"text\" class=\"form-control\" readonly=\"true\" value=\""+ item.get("fecha_ingreso")+"\">\n" +
"                                        </div>\n" +
"                                        <label for=\"inputName\" class=\"control-label col-xs-1\">S.O</label>\n" +
"                                        <div class=\"col-xs-5\">\n" +
"                                            <input id=\"NSISTEMA\" name=\"NSISTEMA\" type=\"text\" class=\"form-control\" readonly=\"true\" value=\"" + item.get("nombreSistema") + "\">\n" +
"                                        </div>\n" +
"                                    </div\n" +
"                                    <div class=\"form-group left\" >\n" +
"                                        <label for=\"inputName\" class=\"control-label col-xs-4\">Tipo de Servicio</label>\n" +
"                                        <div class=\"col-md-8\">\n" +
"                                            <input id=\"NSERVICIO\" name=\"NSERVICIO\" type=\"text\" class=\"form-control\" readonly=\"true\" value=\"" + item.get("NombreServicio") +"\">\n" +
"                                        </div>\n" +
"                                        <label for=\"inputName\" class=\"control-label col-xs-4\">Diagnostico Inicial</label>\n" +
"                                        <div class=\"col-md-8\">\n" +
"                                            <input id=\"NDIAGNOSTICO\" name=\"NDIAGNOSTICO\" type=\"text\" class=\"form-control\" readonly=\"true\" value=\"" + item.get("diagnostico_inicial")+ "\">\n" +
"                                        </div>\n" +
"                                    </div>");
                         
                      }
                  }else if(action.equals("Insertar")){
                      MantenimientoPiezas mp = new MantenimientoPiezas();
                      mp.setCambioparte(request.getParameter("cambio"));
                      mp.setIdproductovaloracion(request.getParameter("idservicio"));
                      mp.setPruebasrealizadas(request.getParameter("prueba"));
                      mp.setRecomendacion(request.getParameter("recomendacion"));
                      mp.setReportefinal(request.getParameter("informe"));
                      mp.setValor_servicio(request.getParameter("valor"));
                      String codservicio = mp.getIdproductovaloracion();
                      if(m.RegistrarMantenimiento(mp)==true){
                         ArrayList dt = m.mostrarDetalleMantenimiento(codservicio);
                         
                          String html = "<legend class=\"text-success left bg-success\">Detalle Mantenimiento</legend>"
                                            + " <fieldset title=\"Detalle Servicio\">\n" +
         "                                    <table class=\"table table-bordered\">\n" +
         "                                        <thead>\n" +
         "                                            <tr>\n" +
         "                                                <th>No</th>\n" +
         "                                                <th>Prueba Realizada</th>\n" +
         "                                                <th>Cambio de Partes</th>\n" +
         "                                                <th>Precio</th>\n" +
         "                                            </tr>\n" +
         "                                        </thead>\n" +
         "                                        <tbody>";
   
                          int count = 0;
                          for (Object object : dt) {
                              count = count + 1;
                              HashMap item = (HashMap) object;
                              html = html +  " <tr>\n" +
                                   "     <td>" + count + " </td>\n" +
                                   "     <td>" + item.get("pruebas_realizadas").toString() + "</td>\n" +
                                   "     <td>" + item.get("cambio_de_parte").toString() + "</td>\n" +
                                   "     <td>" + item.get("valor_servicio").toString()+ "</td>\n" +
                                   " </tr>\n";
                          
                          }
                          html = html + "</tbody>\n" +
"                                    </table\n" +
"                                </fieldset>";
                         out.println(html);
                      }
                  }else if(action.equals("Mostrar")){
                      ArrayList dt = m.mostrarDetalleMantenimiento(idservicio);
                         
                          String html = "<legend class=\"text-success left bg-success\">Detalle Mantenimiento</legend>"
                                            + " <fieldset title=\"Detalle Servicio\">\n" +
         "                                    <table class=\"table table-bordered\">\n" +
         "                                        <thead>\n" +
         "                                            <tr>\n" +
         "                                                <th>No</th>\n" +
         "                                                <th>Prueba Realizada</th>\n" +
         "                                                <th>Cambio de Partes</th>\n" +
         "                                                <th>Precio</th>\n" +
         "                                            </tr>\n" +
         "                                        </thead>\n" +
         "                                        <tbody>";
   
                          int count = 0;
                          for (Object object : dt) {
                              count = count + 1;
                              HashMap item = (HashMap) object;
                              html = html +  " <tr>\n" +
                                   "     <td>" + count + " </td>\n" +
                                   "     <td>" + item.get("pruebas_realizadas").toString() + "</td>\n" +
                                   "     <td>" + item.get("cambio_de_parte").toString() + "</td>\n" +
                                   "     <td>" + item.get("valor_servicio").toString()+ "</td>\n" +
                                   " </tr>\n";
                          
                          }
                          html = html + "</tbody>\n" +
"                                    </table\n" +
"                                </fieldset>";
                         out.println(html);
                  }
                  
              }
          } else {
              response.sendRedirect("/ProductoTIF/PageError.jsp"); // Si la session muere, redirecciono a l principal
          }
          
          out.close();
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
