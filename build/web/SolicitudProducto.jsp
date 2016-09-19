
<%@page import="Controlador.ControllerProducto"%>
<%@page import="java.util.Map"%>
<%@page import="Controlador.ControllerSistemaOperativo"%>
<%@page import="Controlador.ControllerTecnico"%>
<%@page import="Controlador.ControllerCliente"%>
<%@page import="Controlador.ControllerTipoServicio"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SOLICITUD PRODUCTO</title>
        <link rel="stylesheet"  type="text/css" href="CSS/normalize.css" />    
        <link rel="stylesheet"  type="text/css" href="CSS/style.css" /> 
        <link rel="stylesheet" href="CSS/bootstrap.min.css">
        <link rel="stylesheet" href="CSS/bootstrap-theme.min.css">
        <script type="text/javascript" src="JS/jquery-1.10.2.min.js"></script>
        <script type="text/javascript" src="JS/bootstrap.min.js"></script>
    </head>
    <body>
        <% ControllerTipoServicio servicio = new ControllerTipoServicio();
            ControllerCliente cliente = new ControllerCliente();
            ControllerTecnico tecnico = new ControllerTecnico();
            ControllerSistemaOperativo sistema = new ControllerSistemaOperativo();
            ControllerProducto producto = new ControllerProducto();
            String valor = request.getParameter("valor");
            System.out.println(valor);
        %>
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-3">
                    <div class="well well-sm">
                        <form class="form-horizontal" method="post" action="ServletSolicitudRevision">
                            <fieldset>
                                <legend class="text-center header">Solicitud de Revisión</legend>
                                <div class="form-group">
                                    <label for="inputName" class="control-label col-xs-3">Cliente:</label>
                                    <%= cliente.consultarCliente()%>
                                </div>
                                <div class="form-group">
                                    <label for="inputName" class="control-label col-xs-3">Tecnico:</label>
                                    <%= tecnico.consultarTecnicos()%>
                                </div>
                                <fieldset>
                                    <legend class="text-center header">Información del Equipo</legend>
                                     <div class="form-group">
                                        <label for="inputName" class="control-label col-xs-3">Nombre Equipo:</label>
                                        <%=producto.consultarProducto() %>
                                    </div>
                                    <div class="form-group">
                                        <label for="inputName" class="control-label col-xs-3">Sistema Operativo:</label>
                                        <%= sistema.consultarSistemaOperativo()%>
                                    </div>
                                    <div class="form-group">
                                        <label for="inputName" class="control-label col-xs-3">Tipo Servicio:</label>
                                        <%= servicio.consultarTipoServicio()%>
                                    </div>
                                    <div class="form-group">
                                        <span class="col-md-1 col-md-offset-2 text-center"></span>
                                        <div class="col-md-8">
                                            <textarea class="form-control" id="diagnostico" name="ndiagnostico" placeholder="Fallos que presenta el dispositivo." rows="7"></textarea>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-12 text-center">
                                            <i class="icon-bar"></i>
                                            <button type="submit" class="btn btn-danger"  >Registrar</button>
                                        </div>
                                    </div>
                                </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
