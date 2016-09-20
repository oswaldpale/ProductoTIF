package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t<title>Registro Cliente</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"blurBg-false\" style=\"background-color:#EBEBEB\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Start Formoid form-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/formoid-solid-green.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"JS/jquery.min.js\"></script>\r\n");
      out.write("<form class=\"formoid-solid-green\" style=\"background-color:#1A2223;font-size:14px;font-family:'Roboto',Arial,Helvetica,sans-serif;color:#34495E;max-width:480px;min-width:150px\" method=\"post\" action=\"ServletRegistrarClient\"><div class=\"title\"><h2>Registro Cliente</h2></div>\r\n");
      out.write("\t<div class=\"element-name\"><label class=\"title\"><span class=\"required\">*</span></label><span class=\"nameFirst\"><input placeholder=\" Nombres\" type=\"text\" size=\"8\" name=\"nombre\" required=\"required\"/><span class=\"icon-place\"></span></span><span class=\"nameLast\"><input placeholder=\" apellidos\" type=\"text\" size=\"14\" name=\"apellido\" required=\"required\"/><span class=\"icon-place\"></span></span></div>\r\n");
      out.write("\t<div class=\"element-number\"><label class=\"title\"><span class=\"required\">*</span></label><div class=\"item-cont\"><input class=\"large\" type=\"text\" min=\"0\" max=\"99999999999\" name=\"cedula\" required=\"required\" placeholder=\"Cedula\" value=\"\"/><span class=\"icon-place\"></span></div></div>\r\n");
      out.write("\t<div class=\"element-phone\"><label class=\"title\"><span class=\"required\">*</span></label><div class=\"item-cont\"><input class=\"large\" type=\"tel\" pattern=\"[+]?[\\.\\s\\-\\(\\)\\*#0-9]{3,}\" maxlength=\"24\" name=\"celular\" required=\"required\" placeholder=\"Celular\" value=\"\"/><span class=\"icon-place\"></span></div></div>\r\n");
      out.write("\t<div class=\"element-phone\"><label class=\"title\"><span class=\"required\">*</span></label><div class=\"item-cont\"><input class=\"large\" type=\"tel\" pattern=\"[+]?[\\.\\s\\-\\(\\)\\*#0-9]{3,}\" maxlength=\"24\" name=\"telefono\" required=\"required\" placeholder=\"telefono fijo\" value=\"\"/><span class=\"icon-place\"></span></div></div>\r\n");
      out.write("\t<div class=\"element-email\"><label class=\"title\"><span class=\"required\">*</span></label><div class=\"item-cont\"><input class=\"large\" type=\"email\" name=\"email\" value=\"\" required=\"required\" placeholder=\"Email\"/><span class=\"icon-place\"></span></div></div>\r\n");
      out.write("\t<div class=\"element-input\"><label class=\"title\"><span class=\"required\">*</span></label><div class=\"item-cont\"><input class=\"large\" type=\"text\" name=\"ocupacion\" required=\"required\" placeholder=\"ocupacion\"/><span class=\"icon-place\"></span></div></div>\r\n");
      out.write("<div class=\"submit\"><input type=\"submit\" value=\"Guardar\"/></div></form><p class=\"frmd\"><a href=\"http://formoid.com/v29.php\">html form</a> Formoid.com 2.9</p><script type=\"text/javascript\" src=\"JS/formoid-solid-green.js\"></script>\r\n");
      out.write("<!-- Stop Formoid form-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
