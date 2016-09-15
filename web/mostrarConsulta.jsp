<%-- 
    Document   : mostrarConsulta
    Created on : 4/06/2015, 08:52:03 PM
--%>



<%@page import="Modelo.RegistrarUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%  RegistrarUsuario registro = (RegistrarUsuario) session.getAttribute("DatosUsuarios");%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  type="text/css" href="CSS/normalize.css" />
        <link rel="stylesheet"  type="text/css" href="CSS/Estilos.css" />
        <link rel="stylesheet" href="CSS/bootstrap.min.css">
        <link rel="stylesheet" href="CSS/bootstrap-theme.min.css">
        <script type="text/javascript" src="JS/jquery-1.10.2.min.js"></script>
        <script type="text/javascript" src="JS/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
    <div id="agrupar"> 
        <header id="cabecera">
            <figure>
                <img src="Images/logo.png"/>
            </figure>
        </header>   
        <section>
            <header>
                <h1>Datos Consulta Realizada</h1>
            </header>
            <p>Nombre : <%=registro.getNombre()%></p>
            <p>Apellidos : <%=registro.getApellidos()%></p>
            <p>Número De Identificación : <%=registro.getnIdent()%></p>
            <p>Ocupación : <%=registro.getOcupacion()%></p>
            <p>Telefono Fijo : <%=registro.getFijo()%></p>
            <p>Telefono Movil : <%=registro.getMovil()%></p>
            <p>Email : <%=registro.getEmail()%></p>
            <p>Número de Servicio : <%=registro.getNumeroServicio()%></p>
            <p>Fecha de Ingreso : <%=registro.getFechaIngreso()%></p>
            <p>Elemento : <%=registro.getElemento()%></p>
            <p>Tipo de Servicio : <%=registro.getTipoServicio()%></p>
            <p>Marca : <%=registro.getMarca()%></p>
            <p>Sistema Operativo : <%=registro.getSistemaOperativo()%></p>
            <p>Modelo : <%=registro.getModelo()%></p>
            <p>Número de Serie : <%=registro.getNumeroSerie()%></p>
            <p>Diagnostico Inicial : <%=registro.getDiagnosticoInicial()%></p>
            <p>Tecnico Encargado : <%=registro.getTecnicoEncargado()%></p>
            <p>Numero de Servicio2 : <%=registro.getNumeroServicio2()%></p>
            <p>Cambio de parte : <%=registro.getCambioParte()%></p>
            <p>Pruebas Realizadas : <%=registro.getPruebasRealizadas()%></p>
            <p>Reporte Final : <%=registro.getReporteFinal()%></p>
            <p>Recomendaciones : <%=registro.getRecomendaciones()%></p>
            <p>Valor de Servicio : <%=registro.getValorServicio()%></p>
            
            <a href="consulta.jsp">Regresar</a>
        </section>
              
    </div> 
    <footer>
        <div class="row">
            <div class="col-md-4">
                <h3>Pie 1</h3>
                <p>Agregue aqui su contenido.</p>
            </div>
            <div class="col-md-4">
                <h3>Pie 2</h3>
                <p>Agregue aqui mas contenido.</p>
            </div>
            <div class="col-md-4">
                <h3>Contacto</h3>
                <p>CRA 14 No 14-19</p>
                <p>TELEFONOS 4349353- 4348926</p>
            </div>
        </div>    
    </footer>
    </body>
</html>
