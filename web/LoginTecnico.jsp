<%-- 
    Document   : LoginTecnico
    Created on : 19/09/2016, 07:25:07 PM
    Author     : PcIsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>Login Tecnico</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body class="blurBg-false" style="background-color:#EBEBEB">



<!-- Start Formoid form-->
<link rel="stylesheet"  type="text/css" href="CSS/normalize.css" />        
<link rel="stylesheet"  type="text/css" href="CSS/style.css" /> 
<link rel="stylesheet" href="CSS/bootstrap.min.css">
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
            <figure>
                <center><img src="Images/consulta.jpg" height="200px"/></center>
            </figure>

        </section>
        <section> 
            <header>
                <h1>Acceder al formulario de registro de soporte</h1>
                <center><h3>introduce directamente su identificacion  y numeor de serie para iniciar la consulta.</h3></center>>
            </header>

<form class="formoid-biz-green" style="background-color:#1A2223;font-size:14px;font-family:'Open Sans','Helvetica Neue', 'Helvetica', Arial, Verdana, sans-serif;color:#ECECEC;max-width:480px;min-width:150px" method="post" action="ServletLoginTecnico"><div class="title"><h2>Login Tecnico</h2></div>
	<div class="element-input"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="large" type="text" name="Usuario" required="required" placeholder="Usuario"/><span class="icon-place"></span></div></div>
	<div class="element-number"><label class="title"><span class="required">*</span></label><input class="large" type="text"  name="contrasena" required="required" placeholder="Contraseña" value=""/></div>
<div class="submit"><input type="submit" value="Buscar"/></div></form><p class="frmd"></p><script type="text/javascript" src="JS/ConsultaEquipo/formoid-biz-green.js"></script>
<!-- Stop Formoid form-->

</body>
</html>
