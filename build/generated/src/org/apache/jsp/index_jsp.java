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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("    <title>Página web TIF</title>\n");
      out.write("    <link rel=\"stylesheet\"  type=\"text/css\" href=\"CSS/style.css\" />\n");
      out.write("    <script type=\"text/javascript\" src=\"JS/Funciones.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body onload=\"banner();\"> \n");
      out.write("    <div id=\"agrupar\">\n");
      out.write("        <header id=\"cabecera\">\n");
      out.write("            <figure>\n");
      out.write("                <img src=\"Images/logo.png\"/>\n");
      out.write("            </figure>\n");
      out.write("        </header>\n");
      out.write("        <nav id=\"menu2\"> \n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                <li> <a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("                <li> <a href=\"accesorios.html\">Accesorios</a> </li>\n");
      out.write("                <li> <a href=\"soporte.jsp\">Soporte</a> </li>\n");
      out.write("                <li> <a href=\"servicios.jsp\">Servicios</a> </li>\n");
      out.write("                <li> <a href=\"consulta.jsp\">Consultar Registros</a> </li>\n");
      out.write("                <li> <a href=\"acercadeEAT.html\">acerca de EAT</a> </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <figure>\n");
      out.write("                <a href=\"JS/javascript:ponerURL()\" target=\"_blank\"> \n");
      out.write("                    <center><img src=\"\" name=\"banner\" /></center>  \n");
      out.write("                </a>\n");
      out.write("            </figure>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <section>  \n");
      out.write("            <article>\n");
      out.write("                <header>\n");
      out.write("                    <h1> Edificio Alta Tecnologia </h1>\n");
      out.write("                    <p>Cuando hablamos de crecimiento  es muy importante puntualizar que en la zona comercial del municipio\n");
      out.write("                        de Florencia Caquetá, se identifica una mediana empresa del sector privado llamada Edificio de la Alta \n");
      out.write("                        Tecnología, que cuenta con las instalaciones debidamente adecuadas en el centro de la ciudad, más \n");
      out.write("                        específicamente en la dirección carrera 14 # 14 -19 centro; especialista en el sector mercantil durante más de \n");
      out.write("                        15 años de experiencia, integrada por más de 15  funcionarios debidamente capacitados en todas sus dependencias\n");
      out.write("                        que trabajan en  forma coordinada para garantizar la eficiencia del funcionamiento empresarial en el sector \n");
      out.write("                        comercial de la ciudad de Florencia</p>\n");
      out.write("                </header>\n");
      out.write("            </article>  \n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("    </div>  \n");
      out.write("\n");
      out.write("</body>\n");
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
