<%-- 
    Document   : PrincipalFuncionario
    Created on : 19/09/2016, 08:02:35 PM
    Author     : PcIsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Principal Funcionario</title>

   
    <!-- Bootstrap Core CSS -->
    <link href="CSS/PrincipalFuncionario/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="CSS/PrincipalFuncionario/simple-sidebar.css" rel="stylesheet">
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
		<script>
			$(document).ready(function(){
	    		$('#producto').click(function(){
	       		$("#contenido").load("producto.jsp");
	    									 });

	    		$('#Django').click(function(){
	       		$("#contenido").load("c_django.html");
	    									 });

	    		$('#Jython').click(function(){
	       		$("#contenido").load("c_jython.html");
	    									 });
										});
		</script>

</head>

<!-- Start Formoid form-->
<link rel="stylesheet"  type="text/css" href="CSS/normalize.css" />        
<link rel="stylesheet"  type="text/css" href="CSS/style.css" /> 
<link rel="stylesheet" href="CSS/PrincipalFuncionario/bootstrap.min.css">
<link rel="stylesheet" href="CSS/bootstrap-theme.min.css">
<link rel="stylesheet" href="CSS/ConsultaEquipo/formoid-biz-green.css" type="text/css" />
<script type="text/javascript" src="JS/ConsultaEquipo/jquery.min.js"></script>

<header id="cabecera">
            <figure>
                <img src="Images/logo.png"/>
            </figure>
        </header>
        <nav id="menu2"> 
            <ul class="nav nav-tabs">
                <li role="presentation"> <a href="index.jsp">Inicio</a></li>
                <li role="presentation"> <a href="accesorios.html">Accesorios</a> </li>
                <li role="presentation" class="active"> <a href="LoginTecnico.jsp">Soporte</a> </li>
                <li role="presentation"> <a href="servicios.jsp">Servicios</a> </li>
                <li role="presentation"> <a href="ConsultaEquipo.jsp">Consultar Registros</a> </li>
                <li role="presentation"> <a href="acercadeEAT.html">acerca de EAT</a> </li>
            </ul>
        </nav>
        <div class="container">
        <section>
            

        </section></div>
<header

<body>

    <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="accesorios.html">Accesorios</a>
                </li>
                <li>
                    <a href="producto.jsp" id="producto">Registrar Producto</a>
                </li>
                <li>
                    <a href="#">Solicitar Mantenimiento</a>
                </li>
                <li>
                    <a href="#">Revisa Mantenimiento</a>
                </li>
                <li>
                    <a href="#">Entrega de Equipo</a>
                </li>
                <li>
                    <a href="#">Registrar Cliente</a>
                </li>
                <li>
                    <a href="#">Salir</a>
                </li>
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div id="contenido">                        
                                              
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="JS/PrincipalFuncionario/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="JS/PrincipalFuncionario/bootstrap.min.js"></script>
    <script src="JS/PrincipalFuncionario/bootstrap.js"></script>
    
    

</body>

</html>
