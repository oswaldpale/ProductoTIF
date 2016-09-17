<%-- 
    Document   : Producto
    Created on : 17/09/2016, 10:36:13 AM
    Author     : oswaldpale
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controlador.ControllerTipoEquipo"%>
<%@page import="Controlador.ControllerMarca"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRAR PRODUCTO</title>
        <link rel="stylesheet"  type="text/css" href="CSS/normalize.css" />    
        <link rel="stylesheet"  type="text/css" href="CSS/style.css" /> 
        <link rel="stylesheet" href="CSS/bootstrap.min.css">
        <link rel="stylesheet" href="CSS/bootstrap-theme.min.css">
        <script type="text/javascript" src="JS/jquery-1.10.2.min.js"></script>
        <script type="text/javascript" src="JS/bootstrap.min.js"></script>
    </head>
    <body>
        <% ControllerTipoEquipo tipoEquipo = new ControllerTipoEquipo(); %>
        <% ControllerMarca marca = new ControllerMarca();%>
         <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-3">
                    <div class="well well-sm">
                        <form class="form-horizontal" method="post" action="ServletProducto">
                            <fieldset>
                                <legend class="text-center header">Información del Equipo</legend>
                                <div class="form-group">
                                    <label for="inputName" class="control-label col-xs-3">Tipo De Equipo:</label>
                                    <%= tipoEquipo.consultarTipoEquipo()%>
                                </div>
                               
                                <div class="form-group">
                                    <label for="inputName" class="control-label col-xs-3">Marca:</label>
                                      <%=marca.consultarMarca()%>
                                </div>
                                <div class="form-group">
                                    <label for="inputName" class="control-label col-xs-3">Serial:</label>
                                    <div class="col-xs-8">
                                        <input name="nserial" type="text" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputName" class="control-label col-xs-3">Modelo:</label>
                                    <div class="col-xs-8">
                                        <input id="lmodelo" name="nmodelo" type="text" class="form-control">
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
