<%-- 
    Document   : DatosConsulta
    Created on : 18/09/2016, 01:26:07 PM
    Author     : PcIsa
--%>

<%@page import="Entidades.Cliente_producto_Valoracion"%>
<%@page import="Entidades.Producto"%>
<%@page import="Entidades.Usuario"%>
<%@page import="Controlador.ControllerProductoCliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Datos Consulta</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet"  type="text/css" href="CSS/normalize.css" />    
        <link rel="stylesheet"  type="text/css" href="CSS/style.css" /> 
        <link rel="stylesheet" href="CSS/bootstrap.min.css">
        <link rel="stylesheet" href="CSS/bootstrap-theme.min.css">
        <script type="text/javascript" src="JS/jquery-1.10.2.min.js"></script>
        <script type="text/javascript" src="JS/bootstrap.min.js"></script>
    </head>
    <body class="blurBg-true" style="background-color:#ebeaea">
        <% ControllerProductoCliente pc = new ControllerProductoCliente();
            Usuario _usuario = new Usuario();
            Producto _producto = new Producto();
            Cliente_producto_Valoracion infProducto = new Cliente_producto_Valoracion();
            Usuario _infCliente = new Usuario();
            _usuario.setCedula(request.getParameter("cc_cliente"));
            _producto.setSerial(request.getParameter("n_serial"));
            _infCliente =(Usuario) pc.Consulta_Usuario(_usuario);
            infProducto = (Cliente_producto_Valoracion) pc.Consulta_Cliente_producto_valoracion(_producto);

        %>
        <!-- Start Formoid form-->
      <div class="container">
            <div class="row">
                <div class="col-md-7 col-md-offset-3">
                    <div class="well well-sm">
                        <form class="form-horizontal" method="post" action="ServletProducto">
                            <fieldset>
                                <legend class="text-center header bg-primary">MANTENIMIENTO</legend>
                                <fieldset title="Cliente">
                                    <legend class="text-left bg-primary">Datos del Cliente</legend>
                                    <div class="form-group">
                                        <label for="inputName" class="control-label col-xs-2">Nombre</label>
                                        <div class="col-xs-10">
                                            <input name="ncliente" type="text" class="form-control" readonly="true" value="<%=_infCliente.getNombre() %>">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="inputName" class="control-label col-xs-2">Telefono</label>
                                        <div class="col-xs-4">
                                            <input name="ncliente" type="text" class="form-control" readonly="true" value="<%=_infCliente.getTelefono()%>">
                                        </div>
                                        <label for="inputName" class="control-label col-xs-2">Celular</label>
                                        <div class="col-xs-4">
                                            <input name="ncliente" type="text" class="form-control" readonly="true" value="<%=_infCliente.getCelular()%>">
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label for="inputName" class="control-label col-xs-2">Ocupación</label>
                                        <div class="col-xs-10">
                                            <input name="nocupacion" type="text" class="form-control" readonly="true" value="<%=_infCliente.getOcupacion() %>">
                                        </div>
                                    </div>
                                </fieldset>
                                <fieldset>
                                    <legend class="text-left bg-primary">Información del Mantenimiento</legend>
                                </fieldset>
                                      <div class="form-group">
                                        <label for="inputName" class="control-label col-xs-2">Equipo</label>
                                        <div class="col-xs-10">
                                            <input name="ncliente" type="text" class="form-control" readonly="true" value="<%=infProducto.getNombreEquipo() %>">
                                        </div>
                                    </div>
                                <div class="form-group">
                                    <label for="inputName" class="control-label col-xs-3">Marca:</label>
                                    
                                </div>
                                <div class="form-group">
                                    <label for="inputName" class="control-label col-xs-3">Serial:</label>
                                    <div class="col-xs-8">
                                        <input name="nserial" type="text" class="form-control" readonly="true">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-10 text-center">
                                      
                                    <div class="col-md-5">
                                        <label for="inputName" class="control-label col-xs-2">Modelo:</label>
                                        <input id="lmodelo" name="nmodelo" type="text" class="form-control" readonly>
                                    </div>
                                    <div class=" col-md-5">
                                        <label for="inputName" class="control-label col-xs-2">Modelo:</label>
                                        <input id="lmodelo" name="nmodelo" type="text" class="form-control" readonly/>
                                    </div>
                                  </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12 text-center">
                                         <i class="icon-bar"></i>
                                        <button type="submit" class="btn btn-success"  >Solicitar Confirmación del Arreglo</button>
                                    </div>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- Stop Formoid form-->

    </body>
</html>
