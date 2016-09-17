/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Conexion.SeguridadDao;
import Entidades.Usuario;
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

/**
 *
 * 
 */
public class Registrar extends HttpServlet {

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
            String NumTipoPer = request.getParameter("idTipoPersona");
            String numIdent = request.getParameter("identificacion");
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellido");
            String ocupacion = request.getParameter("correo");
            String telFijo = request.getParameter("telefono");
            String telMovil = request.getParameter("telefono_celular");
            String email = request.getParameter("direccion");
            
            String numDeServicio = request.getParameter("NumServ");
            String fechaIngreso = request.getParameter("FechaIngreso");
            String elemento = request.getParameter("Elemento");
            String tipoDeServicio = request.getParameter("TServicio");
            
            String marca = request.getParameter("Marcas"); //Ojo revisar seleccion comboBox
            String sistemaOpe = request.getParameter("SistemaOp"); //Ojo revisar seleccion comboBox
            
            String modeloEquipo = request.getParameter("modeloEquipo");
            String numeroDeSerie = request.getParameter("numeroSerie");
            String diagnosticoInicial = request.getParameter("diagnosticoInicial");
            String tecnicoEncargado = request.getParameter("TecnicoEncargado");
            String numDeServicio2 = request.getParameter("NServicio2");
            String cambioParte = request.getParameter("cambioParte");
            String pruebasRealizadas = request.getParameter("pruebasRealizadas");
            String reporteFinal = request.getParameter("reporteFinal");
            String recomendaciones = request.getParameter("recomendaciones");
            String valorServicio = request.getParameter("valorServicio");
            
            
            System.out.println(" Nombre " + nombre);
            System.out.println(" Apellidos " + apellidos);
            System.out.println(" numIdent " + numIdent);
            System.out.println(" ocupacion " + ocupacion);
            System.out.println(" telefono Fijo " + telFijo);
            System.out.println(" telefono Movil " + telMovil);
            System.out.println(" email " + email);
            
            System.out.println(" NumeroDeServicio " + numDeServicio);
            System.out.println(" fecha de Ingreso " + fechaIngreso);
            System.out.println(" Elemento " + elemento);
            System.out.println(" tipo de servicio " + tipoDeServicio);
            System.out.println(" Marca Seleccionada " + marca);
            System.out.println(" sistema Operativo " + sistemaOpe);
            System.out.println(" modelo de equipo " + modeloEquipo);
            System.out.println(" numero de serie " + numeroDeSerie);
            System.out.println(" diagnostico Inicial " + diagnosticoInicial);
            System.out.println(" tecnico encargado " + tecnicoEncargado);
            System.out.println(" numero de servicio2 " + numDeServicio2);
            System.out.println(" cambio parte " + cambioParte);
            System.out.println(" Pruebas Realizadas " + pruebasRealizadas);
            System.out.println(" Reporte Final " + reporteFinal);
            System.out.println(" Recomendaciones " + recomendaciones);
            System.out.println(" Valor Servicio " + valorServicio);
            
            if(nombre != null && !nombre.equalsIgnoreCase("") &&
               apellidos != null && !apellidos.equalsIgnoreCase("") &&
               numIdent != null && !numIdent.equalsIgnoreCase("") &&
               ocupacion != null && !ocupacion.equalsIgnoreCase("") && 
               telFijo != null && !telFijo.equalsIgnoreCase("") && 
               telMovil != null && !telMovil.equalsIgnoreCase("") && 
               email != null && !email.equalsIgnoreCase("") && 
               numDeServicio != null && !numDeServicio.equalsIgnoreCase("") && 
               fechaIngreso != null && !fechaIngreso.equalsIgnoreCase("") && 
               elemento != null && !elemento.equalsIgnoreCase("") &&
               tipoDeServicio != null && !tipoDeServicio.equalsIgnoreCase("") &&
               marca != null && !marca.equalsIgnoreCase("") &&   
               sistemaOpe != null && !sistemaOpe.equalsIgnoreCase("") &&  
               modeloEquipo != null && !modeloEquipo.equalsIgnoreCase("") && 
               numeroDeSerie != null && !numeroDeSerie.equalsIgnoreCase("") &&
               diagnosticoInicial != null && !diagnosticoInicial.equalsIgnoreCase("") &&
               tecnicoEncargado != null && !tecnicoEncargado.equalsIgnoreCase("") &&   
               numDeServicio2 != null && !numDeServicio2.equalsIgnoreCase("") &&  
               cambioParte != null && !cambioParte.equalsIgnoreCase("") &&  
               pruebasRealizadas != null && !pruebasRealizadas.equalsIgnoreCase("") && 
               reporteFinal != null && !reporteFinal.equalsIgnoreCase("") &&  
               recomendaciones != null && !recomendaciones.equalsIgnoreCase("") &&  
               valorServicio != null && !valorServicio.equalsIgnoreCase(""))
            {
                 System.out.println("Datos completos");
                 Usuario reUsuario = new Usuario();
                 reUsuario.setNombre(nombre);
//                 reUsuario.setApellidos(apellidos);
//                 reUsuario.setnIdent(numIdent);
//                 reUsuario.setOcupacion(ocupacion);
//                 reUsuario.setFijo(telFijo);
//                 reUsuario.setMovil(telMovil);
//                 reUsuario.setEmail(email);
//                 reUsuario.setNumeroServicio(numDeServicio);
//                 reUsuario.setFechaIngreso(fechaIngreso);
//                 reUsuario.setElemento(elemento);
//                 reUsuario.setTipoServicio(tipoDeServicio);
//                 reUsuario.setMarca(marca);
//                 reUsuario.setSistemaOperativo(sistemaOpe);
//                 reUsuario.setModelo(modeloEquipo);
//                 reUsuario.setNumeroSerie(numeroDeSerie);
//                 reUsuario.setDiagnosticoInicial(diagnosticoInicial);
//                 reUsuario.setTecnicoEncargado(tecnicoEncargado);
//                 reUsuario.setNumeroServicio2(numDeServicio2);
//                 reUsuario.setCambioParte(cambioParte);
//                 reUsuario.setPruebasRealizadas(pruebasRealizadas);
//                 reUsuario.setReporteFinal(reporteFinal);
//                 reUsuario.setRecomendaciones(recomendaciones);
//                 reUsuario.setValorServicio(valorServicio);
                 
                 boolean registrado = SeguridadDao.registrar(reUsuario);
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
