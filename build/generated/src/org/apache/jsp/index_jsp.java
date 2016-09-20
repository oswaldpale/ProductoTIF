package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <title>Página web TIF</title>\r\n");
      out.write("    <link rel=\"stylesheet\"  type=\"text/css\" href=\"CSS/normalize.css\" />        \r\n");
      out.write("    <link rel=\"stylesheet\"  type=\"text/css\" href=\"CSS/style.css\" /> \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/bootstrap-theme.min.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"JS/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"JS/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"JS/Funciones.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body> \r\n");
      out.write("        <header id=\"cabecera\">\r\n");
      out.write("            <figure>\r\n");
      out.write("                <img src=\"Images/logo.png\"/>\r\n");
      out.write("            </figure>\r\n");
      out.write("        </header>\r\n");
      out.write("        <nav id=\"menu2\"> \r\n");
      out.write("            <ul class=\"nav nav-tabs\">\r\n");
      out.write("                <li role=\"presentation\" class=\"active\"> <a href=\"index.jsp\">Inicio</a></li>\r\n");
      out.write("                <li role=\"presentation\"> <a href=\"accesorios.html\">Accesorios</a> </li>\r\n");
      out.write("                <li role=\"presentation\"> <a href=\"LoginTecnico.jsp\">Soporte</a> </li>\r\n");
      out.write("                <li role=\"presentation\"> <a href=\"servicios.jsp\">Servicios</a> </li>\r\n");
      out.write("                <li role=\"presentation\"> <a href=\"ConsultaEquipo.jsp\">Consultar Registros</a> </li>\r\n");
      out.write("                <li role=\"presentation\"> <a href=\"acercadeEAT.html\">acerca de EAT</a> </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <section id=\"miSlide\" class=\"carousel slide\">\r\n");
      out.write("            <ol class=\"carousel-indicators\">\r\n");
      out.write("                <li data-target=\"#miSlide\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                <li data-target=\"#miSlide\" data-slide-to=\"1\"></li>\r\n");
      out.write("                <li data-target=\"#miSlide\" data-slide-to=\"2\"></li>\r\n");
      out.write("                <li data-target=\"#miSlide\" data-slide-to=\"3\"></li>\r\n");
      out.write("                <li data-target=\"#miSlide\" data-slide-to=\"4\"></li>\r\n");
      out.write("                <li data-target=\"#miSlide\" data-slide-to=\"5\"></li>\r\n");
      out.write("            </ol>\r\n");
      out.write("            <div class=\"carousel-inner\">\r\n");
      out.write("                <div class=\"item active\">\r\n");
      out.write("                    <img src=\"http://i.imgur.com/ZFB3U86.jpg?1\" class=\"adaptar\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"http://i.imgur.com/BoLIVY0.jpg?1\" class=\"adaptar\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"http://i.imgur.com/UTt26FY.jpg?1\" class=\"adaptar\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"http://i.imgur.com/oQx7agU.jpg?1\" class=\"adaptar\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"http://i.imgur.com/sZBkTwg.jpg?1\" class=\"adaptar\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <img src=\"http://i.imgur.com/RUbzLit.jpg?1\" class=\"adaptar\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"#miSlide\" class=\"left carousel-control\" data-slide=\"prev\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-left\"></span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"#miSlide\" class=\"right carousel-control\" data-slide=\"next\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </section>\r\n");
      out.write("        <div class=\"container\">       \r\n");
      out.write("        <section>  \r\n");
      out.write("            <article>                                      \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <h1 style=\"text-align: center;\">Edificio Alta Tecnologia</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div> \r\n");
      out.write("                <HR align=\"center\" size=\"2\" width=\"100%\" color=\"Red\" noshade>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6\"> \r\n");
      out.write("                        <h3>Prepárate para empezar el colegio con éxito</h3>\r\n");
      out.write("                        <p>                        \r\n");
      out.write("                        Elige tu ordenador portátil, impresora y accesorios perfectos y propónte estar en el cuadro de honor. \r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <img src=\"Images/portada.png\" WIDTH=500 HEIGHT=300 ORDER=0 VSPACE=2 HSPACE=2 ALT=\"Obra de K. Haring\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6\"> \r\n");
      out.write("                        <img src=\"Images/Portailes 360.jpg\" WIDTH=500 HEIGHT=300 ORDER=0 VSPACE=2 HSPACE=2 ALT=\"Obra de K. Haring\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <p>Cuando hablamos de crecimiento  es muy importante puntualizar que en la zona comercial del municipio\r\n");
      out.write("                        de Florencia Caquetá, se identifica una mediana empresa del sector privado llamada Edificio de la Alta \r\n");
      out.write("                        Tecnología, que cuenta con las instalaciones debidamente adecuadas en el centro de la ciudad, más \r\n");
      out.write("                        específicamente en la dirección carrera 14 # 14 -19 centro; especialista en el sector mercantil durante más de \r\n");
      out.write("                        15 años de experiencia, integrada por más de 15  funcionarios debidamente capacitados en todas sus dependencias\r\n");
      out.write("                        que trabajan en  forma coordinada para garantizar la eficiencia del funcionamiento empresarial en el sector \r\n");
      out.write("                        comercial de la ciudad de Florencia</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>                \r\n");
      out.write("            </article> \r\n");
      out.write("        </section>\r\n");
      out.write("        </div> \r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <h3>Pie 1</h3>\r\n");
      out.write("                <p>Agregue aqui su contenido.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <h3>Pie 2</h3>\r\n");
      out.write("                <p>Agregue aqui mas contenido.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <h3>Contacto</h3>\r\n");
      out.write("                    <p>CRA 14 No 14-19</p>\r\n");
      out.write("                    <p>TELEFONOS 4349353- 4348926</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>    \r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
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
