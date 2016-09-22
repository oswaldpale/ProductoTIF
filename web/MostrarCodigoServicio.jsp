<%-- 
    Document   : MostrarCodigoServicio
    Created on : 22/09/2016, 04:14:34 PM
    Author     : oswaldpale
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String codigoServicio = session.getAttribute("codigoservicio").toString();
            
        %>
        <h1>SU codigo para consultar el estado de su Equipo es:</h1>
        <h1 ><%=codigoServicio %></h1>
    </body>
</html>
