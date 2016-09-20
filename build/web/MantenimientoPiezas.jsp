<%-- 
    Document   : MantenimientoPiezas
    Created on : 18/09/2016, 06:12:27 PM
    Author     : oswaldpale
--%>

<%@page import="Entidades.Tecnico"%>
<%@page import="Modelo.TecnicoDao"%>
<%@page import="Controlador.ControllerMantenimientoPiezas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento Piezas</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet"  type="text/css" href="CSS/normalize.css" />    
        <link rel="stylesheet"  type="text/css" href="CSS/style.css" /> 
        <link rel="stylesheet" href="CSS/bootstrap.min.css">
        <link rel="stylesheet" href="CSS/bootstrap-theme.min.css">
        <script type="text/javascript" src="JS/jquery-1.10.2.min.js"></script>
        <script type="text/javascript" src="JS/bootstrap.min.js"></script>
    </head>
    <body>
        <% ControllerMantenimientoPiezas mp = new ControllerMantenimientoPiezas(); 
           Tecnico tecnico =new Tecnico();
           tecnico.setCodigo(request.getParameter("tecnico"));
           
        %>
         <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-3">
                    <div class="well well-sm">
                        <form class="form-horizontal" method="post" action="ServletSolicitudRevision">
                            <fieldset>
                                <legend class="text-center header">Revisión del Equipo</legend>
                               
                                <div class="form-group">
                                    <label for="inputName" class="control-label col-xs-3">Equipo:</label>
                                    <%=mp.ConsultarEquiposParaRevision(tecnico) %>
                                </div>
                                <fieldset>
                                    <div class="form-group">
                                        <label for="inputName" class="control-label col-xs-3">Piezas Cambiadas</label>
                                       
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
