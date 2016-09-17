package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.ControllerTipoEquipo;
import Controlador.ControllerMarca;

public final class Producto_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>REGISTRAR PRODUCTO</title>\n");
      out.write("        <link rel=\"stylesheet\"  type=\"text/css\" href=\"CSS/normalize.css\" />    \n");
      out.write("        <link rel=\"stylesheet\"  type=\"text/css\" href=\"CSS/style.css\" /> \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap-theme.min.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"JS/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"JS/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 ControllerTipoEquipo tipoEquipo = new ControllerTipoEquipo(); 
      out.write("\n");
      out.write("        ");
 ControllerMarca marca = new ControllerMarca();
      out.write("\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8 col-md-offset-3\">\n");
      out.write("                    <div class=\"well well-sm\">\n");
      out.write("                        <form class=\"form-horizontal\" method=\"post\" action=\"ServletProducto\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <legend class=\"text-center header\">Información del Equipo</legend>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputName\" class=\"control-label col-xs-3\">Tipo De Equipo:</label>\n");
      out.write("                                    ");
      out.print( tipoEquipo.consultarTipoEquipo());
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                               \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputName\" class=\"control-label col-xs-3\">Marca:</label>\n");
      out.write("                                      ");
      out.print(marca.consultarMarca());
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputName\" class=\"control-label col-xs-3\">Serial:</label>\n");
      out.write("                                    <div class=\"col-xs-8\">\n");
      out.write("                                        <input name=\"nserial\" type=\"text\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputName\" class=\"control-label col-xs-3\">Modelo:</label>\n");
      out.write("                                    <div class=\"col-xs-8\">\n");
      out.write("                                        <input id=\"lmodelo\" name=\"nmodelo\" type=\"text\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12 text-center\">\n");
      out.write("                                         <i class=\"icon-bar\"></i>\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-danger\"  >Registrar</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
