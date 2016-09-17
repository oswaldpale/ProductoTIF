<%-- 
    Document   : SolicitudProducto
    Created on : 16/09/2016, 03:54:03 PM
    Author     : oswaldpale
--%>


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
       %>
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-3">
                    <div class="well well-sm">
                        <form class="form-horizontal" method="post">
                            <fieldset>
                                <legend class="text-center header">Información del Equipo</legend>
                                <div class="form-group">
                                    <label for="inputName" class="control-label col-xs-3">Tipo Servicio:</label>
                                    <%= servicio.consultarTipoServicio()%>
                                </div>
                                <div class="form-group">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                                    <div class="col-md-8">
                                        <input id="lname" name="name" type="text" placeholder="Last Name" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>
                                    <div class="col-md-8">
                                        <input id="email" name="email" type="text" placeholder="Email Address" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-pencil-square-o bigicon"></i></span>
                                    <div class="col-md-8">
                                        <textarea class="form-control" id="diagnostico" name="diagnostico" placeholder="Fallos que presenta el dispositivo." rows="7"></textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-md-12 text-center">
                                         <i class="icon-bar"></i>
                                        <button type="submit" class="btn btn-danger">Registrar</button>
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
