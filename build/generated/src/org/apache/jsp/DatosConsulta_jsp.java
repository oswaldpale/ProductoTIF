package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entidades.Cliente_producto_Valoracion;
import Entidades.Producto;
import Entidades.Usuario;
import Controlador.ControllerProductoCliente;

public final class DatosConsulta_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <title>Datos Consulta</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\"  type=\"text/css\" href=\"CSS/normalize.css\" />    \r\n");
      out.write("        <link rel=\"stylesheet\"  type=\"text/css\" href=\"CSS/style.css\" /> \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap-theme.min.css\">\r\n");
      out.write("        <script type=\"text/javascript\" src=\"JS/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"JS/bootstrap.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"blurBg-true\" style=\"background-color:#ebeaea\">\r\n");
      out.write("        ");
 ControllerProductoCliente pc = new ControllerProductoCliente();
            Usuario _usuario = new Usuario();
            Producto _producto = new Producto();
            Usuario _infCliente;
            Cliente_producto_Valoracion infProducto;
            _usuario.setCedula(request.getParameter("cc_cliente"));
            _producto.setSerial(request.getParameter("n_serial"));
            infProducto = pc.Consulta_Cliente_producto_valoracion(_producto);
            _infCliente = pc.Consulta_Usuario(_usuario);
           

        
      out.write("\r\n");
      out.write("        <!-- Start Formoid form-->\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-7 col-md-offset-3\">\r\n");
      out.write("                    <div class=\"well well-sm\">\r\n");
      out.write("                        <form class=\"form-horizontal\" method=\"post\" action=\"ServletProducto\">\r\n");
      out.write("                            <fieldset>\r\n");
      out.write("                                <legend class=\"text-center header bg-primary\">MANTENIMIENTO</legend>\r\n");
      out.write("                                <fieldset title=\"Cliente\">\r\n");
      out.write("                                    <legend class=\"text-left bg-primary\">Datos del Cliente</legend>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"inputName\" class=\"control-label col-xs-2\">Nombre</label>\r\n");
      out.write("                                        <div class=\"col-xs-10\">\r\n");
      out.write("                                            <input name=\"ncliente\" type=\"text\" class=\"form-control\" readonly=\"true\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"inputName\" class=\"control-label col-xs-2\">Telefono</label>\r\n");
      out.write("                                        <div class=\"col-xs-4\">\r\n");
      out.write("                                            <input name=\"ncliente\" type=\"text\" class=\"form-control\" readonly=\"true\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <label for=\"inputName\" class=\"control-label col-xs-2\">Celular</label>\r\n");
      out.write("                                        <div class=\"col-xs-4\">\r\n");
      out.write("                                            <input name=\"ncliente\" type=\"text\" class=\"form-control\" readonly=\"true\" value=\"");
      out.print(_infCliente.getCelular());
      out.write("\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                     <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"inputName\" class=\"control-label col-xs-2\">Ocupación</label>\r\n");
      out.write("                                        <div class=\"col-xs-10\">\r\n");
      out.write("                                            <input name=\"nocupacion\" type=\"text\" class=\"form-control\" readonly=\"true\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </fieldset>\r\n");
      out.write("                                <fieldset>\r\n");
      out.write("                                    <legend class=\"text-left bg-primary\">Información del Equipo</legend>\r\n");
      out.write("                                </fieldset>\r\n");
      out.write("                                \r\n");
      out.write("                               \r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"inputName\" class=\"control-label col-xs-3\">Marca:</label>\r\n");
      out.write("                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"inputName\" class=\"control-label col-xs-3\">Serial:</label>\r\n");
      out.write("                                    <div class=\"col-xs-8\">\r\n");
      out.write("                                        <input name=\"nserial\" type=\"text\" class=\"form-control\" readonly=\"true\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <div class=\"col-md-10 text-center\">\r\n");
      out.write("                                      \r\n");
      out.write("                                    <div class=\"col-md-5\">\r\n");
      out.write("                                        <label for=\"inputName\" class=\"control-label col-xs-2\">Modelo:</label>\r\n");
      out.write("                                        <input id=\"lmodelo\" name=\"nmodelo\" type=\"text\" class=\"form-control\" readonly>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\" col-md-5\">\r\n");
      out.write("                                        <label for=\"inputName\" class=\"control-label col-xs-2\">Modelo:</label>\r\n");
      out.write("                                        <input id=\"lmodelo\" name=\"nmodelo\" type=\"text\" class=\"form-control\" readonly/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <div class=\"col-md-12 text-center\">\r\n");
      out.write("                                         <i class=\"icon-bar\"></i>\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-danger\"  >Registrar</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </fieldset>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Stop Formoid form-->\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
