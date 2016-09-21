<%-- 
    Document   : PrincipalFuncionario2
    Created on : 20/09/2016, 05:47:55 PM
    Author     : oswaldpale
--%>

<%@page import="Entidades.Tecnico"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet"  type="text/css" href="CSS/style.css" /> 
        <link rel="stylesheet" href="CSS/bootstrap.min.css">
        <link rel="stylesheet" href="CSS/bootstrap-theme.min.css">
        
        
       
        <link href="CSS/sb-admin-2.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/morris.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/font-awesome.min.css" rel="stylesheet" type="text/css"/>
         <script src="JS/jquery-2.1.4.js" type="text/javascript"></script>
        <title>JSP Page</title>
       
    </head>
    <body>
        
         <% 
           Tecnico tec = (Tecnico) session.getAttribute("tecnicoLogin");
          String Usuario =  tec.getUsuario();
        %>
        
        <script type="text/javascript">
            $(document).ready(function () {
                $('#producto').click(function () {
                    $("#page-wrapper").load("Producto.jsp");
                });
                 $('#solicitud').click(function () {
                    $("#page-wrapper").load("SolicitudProducto.jsp");
                });
                 $('#cliente').click(function () {
                    $("#page-wrapper").load("RegistrarCliente.jsp");
                });
                 $('#revision').click(function () {
                    $("#page-wrapper").load("MantenimientoPiezas.jsp");
                });
               
            });
        </script>
        
        
        
        <header>
                <header id="cabecera">
                    <figure>
                        <img src="Images/logo.png"/>
                    </figure>
                </header>
            </header>
            <nav id="menu2"> 
               <ul class="nav nav-tabs">
                <li role="presentation" class="active"> <a href="index.jsp">Inicio</a></li>
                <li role="presentation"> <a href="accesorios.html">Accesorios</a> </li>
                <li role="presentation"> <a href="LoginTecnico.jsp">Soporte</a> </li>
                <li role="presentation"> <a href="servicios.jsp">Servicios</a> </li>
                <li role="presentation"> <a href="ConsultaEquipo.jsp">Consultar Registros</a> </li>
                <li role="presentation"> <a href="acercadeEAT.html">acerca de EAT</a> </li>
            </ul>
            </nav>
        
          <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#"><%=tec.getUsuario()%></a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">

                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="LoginTecnico.jsp"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li>
                            <a href="#" id="producto" ><i class="fa fa-dashboard fa-fw" ></i> Registrar Equipo</a>
                        </li>
                       
                        <li>
                            <a href="#" id="solicitud" ><i class="fa fa-edit fa-fw"></i>Solicitud Revisión</a>
                        </li>
                         <li>
                            <a href="#" id="revision" ><i class="fa fa-edit fa-fw"></i>Registro del Informe Tecnico.</a>
                        </li>
                         <li>
                            <a href="#" id="cliente" ><i class="fa fa-edit fa-fw"></i>Registrar Cliente</a>
                        </li>

                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper">

            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
   
    <script src="CSS/metisMenu.min.js" type="text/javascript"></script>
    <!-- Bootstrap Core JavaScript -->
   
    
    <script type="text/javascript" src="JS/bootstrap.min.js"></script>
    

    <!-- Morris Charts JavaScript -->
 
    <script src="JS/raphael.js" type="text/javascript"></script>
    <script src="JS/morris.js" type="text/javascript"></script>
    <script src="JS/morris-data.js" type="text/javascript"></script>
    <!-- Custom Theme JavaScript -->
    <script src="JS/sb-admin-2.js" type="text/javascript"></script>
    </body>
</html>
