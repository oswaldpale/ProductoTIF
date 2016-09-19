package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.Controller_Producto_Cliente;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t<title>Datos Consulta</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"blurBg-true\" style=\"background-color:#ebeaea\">\r\n");
      out.write("    ");
 Controller_Producto_Cliente pc = new Controller_Producto_Cliente();
        
    
      out.write("\r\n");
      out.write("<!-- Start Formoid form-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/DatosConsultaTodo/formoid-flat-green.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"JS/DatosConsultaTodo/jquery.min.js\"></script>\r\n");
      out.write("<form class=\"formoid-flat-green\" style=\"background-color:#e3e3e3;font-size:14px;font-family:'Lato', sans-serif;color:#666666;max-width:680px;min-width:150px\" method=\"post\"><div class=\"title\"><h2>Datos Consulta</h2></div>\r\n");
      out.write("\t<div class=\"element-name\"><label class=\"title\"></label><span class=\"nameFirst\"><input  type=\"text\" size=\"8\" name=\"name[first]\" /><label class=\"subtitle\">Nombre</label></span><span class=\"nameLast\"><input  type=\"text\" size=\"14\" name=\"name[last]\" /><label class=\"subtitle\">Apellido</label></span></div>\r\n");
      out.write("\t<div class=\"element-number\"><label class=\"title\">Cedula</label><input class=\"large\" type=\"text\" min=\"0\" max=\"99999999\" name=\"number\"  value=\"\"/></div>\r\n");
      out.write("\t<div class=\"element-input\"><label class=\"title\">Ocupacion</label><input class=\"large\" type=\"text\" name=\"input\" /></div>\r\n");
      out.write("\t<div class=\"element-number\"><label class=\"title\">celular</label><input class=\"large\" type=\"text\" min=\"0\" max=\"99999999\" name=\"number2\"  value=\"\"/></div>\r\n");
      out.write("\t<div class=\"element-number\"><label class=\"title\">Telefono</label><input class=\"large\" type=\"text\" min=\"0\" max=\"99999999\" name=\"number1\"  value=\"\"/></div>\r\n");
      out.write("\t<div class=\"element-email\"><label class=\"title\">Email</label><input class=\"large\" type=\"email\" name=\"email\" value=\"\" /></div>\r\n");
      out.write("\t<div class=\"element-number\"><label class=\"title\">N_Servicio</label><input class=\"large\" type=\"text\" min=\"0\" max=\"99999999\" name=\"number3\"  value=\"\"/></div>\r\n");
      out.write("\t<div class=\"element-input\"><label class=\"title\">fecha_Ingreso</label><input class=\"large\" type=\"text\" name=\"input1\" /></div>\r\n");
      out.write("\t<div class=\"element-input\"><label class=\"title\">Elemento</label><input class=\"large\" type=\"text\" name=\"input2\" /></div>\r\n");
      out.write("\t<div class=\"element-input\"><label class=\"title\">Tipo de servicio</label><input class=\"large\" type=\"text\" name=\"input3\" /></div>\r\n");
      out.write("\t<div class=\"element-input\"><label class=\"title\">Marca</label><input class=\"large\" type=\"text\" name=\"input6\" /></div>\r\n");
      out.write("\t<div class=\"element-input\"><label class=\"title\">Sistema Operativo</label><input class=\"large\" type=\"text\" name=\"input5\" /></div>\r\n");
      out.write("\t<div class=\"element-input\"><label class=\"title\">Modelo</label><input class=\"large\" type=\"text\" name=\"input4\" /></div>\r\n");
      out.write("\t<div class=\"element-number\"><label class=\"title\">N_Servicio2</label><input class=\"large\" type=\"text\" min=\"0\" max=\"99999999\" name=\"number4\"  value=\"\"/></div>\r\n");
      out.write("\t<div class=\"element-input\"><label class=\"title\">Cambio de parte ?</label><input class=\"large\" type=\"text\" name=\"input7\" /></div>\r\n");
      out.write("\t<div class=\"element-input\"><label class=\"title\">Pruba Realizada</label><input class=\"large\" type=\"text\" name=\"input8\" /></div>\r\n");
      out.write("\t<div class=\"element-input\"><label class=\"title\">Reporte final</label><input class=\"large\" type=\"text\" name=\"input9\" /></div>\r\n");
      out.write("\t<div class=\"element-textarea\"><label class=\"title\">Recomendaciones</label><textarea class=\"medium\" name=\"textarea\" cols=\"20\" rows=\"5\" ></textarea></div>\r\n");
      out.write("\t<div class=\"element-number\"><label class=\"title\">Valor Servicio</label><input class=\"large\" type=\"text\" min=\"0\" max=\"99999999\" name=\"number5\"  value=\"\"/></div>\r\n");
      out.write("<div class=\"submit\"><input type=\"submit\" value=\"Aceptar\"/></div></form><p class=\"frmd\"><a href=\"http://formoid.com/v29.php\">javascript form</a> Formoid.com 2.9</p><script type=\"text/javascript\" src=\"JS/DatosConsultaTodo/formoid-flat-green.js\"></script>\r\n");
      out.write("<!-- Stop Formoid form-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
