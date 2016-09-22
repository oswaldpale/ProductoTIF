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
        <script src="JS/jquery-2.1.4.js" type="text/javascript"></script>
        <script type="text/javascript" src="JS/bootstrap.min.js"></script>
        <script src="JS/bootrapmodal.js" type="text/javascript"></script>

    </head>
    <body>
        <% ControllerMantenimientoPiezas mp = new ControllerMantenimientoPiezas();
            Tecnico tecnico = null;
            if (session.getAttribute("tecnicoLogin") != null) { // Evalua El estado de la session
                tecnico = (Tecnico) session.getAttribute("tecnicoLogin");
            } else {
                response.sendRedirect("/ProductoTIF/LoginTecnico.jsp"); // Si la session muere, redirecciono al login
            }
        %>

        <script type="text/javascript" >
            $(document).ready(function () {

                $('#sequipo').on('change', function () {
                    var idequipo = $(this).val();

                    $.post('ServletMantenimientoPiezas', {
                        idservicio: idequipo,
                        action: 'MostrarDetalle'
                    }, function (responseText) {
                        debugger;
                        $('#DetalleEquipo').html(responseText);
                    });
                });

                $('#NMOSTRAR').click(function (evt) {
                    var idequipo = $('#sequipo').val();
                    $.post('ServletMantenimientoPiezas', {
                        idservicio: idequipo,
                        action: 'Mostrar'
                    }, function (responseText) {
                         debugger;
                        $('#DetalleMantenimiento').html(responseText);
                    });
                });

                $('#NMANTENIMIENTO').click(function (evt) {
                    var nprueba = $('#NPRUEBA').val();
                    var nidservicio = $('#sequipo').val();
                    var ncambio = $('#NCAMBIO').val();
                    var nvalor = $('#NVALOR').val();
                    var ninforme = $('#NINFORME').val();
                    var nrecomendacion = $('#NRECOMENDACION').val()
                    $.post('ServletMantenimientoPiezas', {
                        prueba: nprueba,
                        idservicio: nidservicio,
                        cambio: ncambio,
                        valor: nvalor,
                        informe: ninforme,
                        recomendacion: nrecomendacion,
                        action: 'Insertar'
                    }, function (responseText) {

                    });
                });

            });
        </script>
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-1">
                    <div class="well well-sm">
                        <form class="form-horizontal ">
                            <legend class="text-center header bg-primary">Revisión del Equipo</legend>
                            <fieldset title="Cliente">
                                <legend class="text-left bg-primary">Seleccione Equipo</legend>
                                <fieldset>
                                    <div class="form-group">
                                        <div class="col-md-10">
                                            <%=mp.ConsultarEquiposParaRevision()%>
                                        </div>
                                    </div>
                                </fieldset>
                            </fieldset>    
                            <div id="DetalleEquipo">

                            </div>

                            <div>
                                <a data-toggle="modal" href="#MANTENIMIENTO" class="btn btn-primary btn-large">

                                    Agregar Mantenimiento

                                </a>
                                <a data-toggle="modal" id="NMOSTRAR" class="btn btn-primary btn-large">

                                    Consultar Mantenimientos

                                </a>
                            </div>
                            <div id="DetalleMantenimiento">
                               
                            </div>
                        </form>

                        <div id="MANTENIMIENTO" class="modal fade">
                            <div class="modal-dialog">   
                                <div class="modal-content"> 
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                            ×
                                        </button>
                                        <h3>REGISTRO DE MANTENIMIENTO</h3>
                                    </div>
                                    <div class="modal-body">
                                        <label for="inputName" class="control-label col-xs-5">Prueba Realizada:</label>
                                        <input id="NPRUEBA" name="NPRUEBA" type="text" class="form-control">
                                        <label for="inputName" class="control-label col-xs-5">Cambios de Partes:</label>
                                        <select class="form-control" id="NCAMBIO" name="NCAMBIO">
                                            <option value="NO">NO</option>
                                            <option value="SI">SI</option>
                                        </select>
                                        <label for="inputName"  class="control-label col-xs-5">Valor del Servicio:</label>
                                        <input id="NVALOR" name="NVALOR" type="text" class="form-control">
                                        <label for="inputName" class="control-label col-xs-5" >Informe Final:</label>
                                        <input id="NINFORME" name="NINFORME" type="text" class="form-control" height="100">
                                        <label for="inputName" class="control-label col-xs-5" >Recomendaciones:</label>
                                        <input id="NRECOMENDACION" name="NRECOMENDACION" type="text" class="form-control" height="100">
                                    </div>
                                    <div class="modal-footer">
                                        <a href="#" id="NMANTENIMIENTO" class="btn btn-success" data-dismiss="modal">Guardar</a>

                                        <a href="#" id="NCERRAR" data-dismiss="modal" class="btn">Cerrar</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
</body>
</html>
