package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ConsultaEquipo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t<title>Consulta Equipo</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"blurBg-false\" style=\"background-color:#EBEBEB\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Start Formoid form-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/ConsultaEquipo/formoid-biz-green.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"JS/ConsultaEquipo/jquery.min.js\"></script>\r\n");
      out.write("<form class=\"formoid-biz-green\" style=\"background-color:#1A2223;font-size:14px;font-family:'Open Sans','Helvetica Neue', 'Helvetica', Arial, Verdana, sans-serif;color:#ECECEC;max-width:480px;min-width:150px\" method=\"post\" action=\"ServletConsultarProducto\"><div class=\"title\"><h2>Consulta Equipo</h2></div>\r\n");
      out.write("\t<div class=\"element-number\"><label class=\"title\"><span class=\"required\">*</span></label><input class=\"large\" type=\"text\" min=\"0\" max=\"999999999\" name=\"cc_cliente\" required=\"required\" placeholder=\"Cedula\" value=\"\"/></div>\r\n");
      out.write("\t<div class=\"element-number\"><label class=\"title\"><span class=\"required\">*</span></label><input class=\"large\" type=\"text\" min=\"0\" max=\"999999999\" name=\"n_serie\" required=\"required\" placeholder=\"N° Serie\" value=\"\"/></div>\r\n");
      out.write("<div class=\"submit\"><input type=\"submit\" value=\"Buscar\"/></div></form><p class=\"frmd\"></p><script type=\"text/javascript\" src=\"JS/ConsultaEquipo/formoid-biz-green.js\"></script>\r\n");
      out.write("<!-- Stop Formoid form-->\r\n");
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
