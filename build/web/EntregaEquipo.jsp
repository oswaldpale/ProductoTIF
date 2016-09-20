<%-- 
    Document   : EntregaEquipo
    Created on : 20/09/2016, 12:53:41 PM
    Author     : PcIsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>Entrega Equipo</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body class="blurBg-false" style="background-color:#EBEBEB">



<!-- Start Formoid form-->
<link rel="stylesheet" href="CSS/EntregaEquipo/formoid-flat-green.css" type="text/css" />
<script type="text/javascript" src="JS/EntregaEquipo/jquery.min.js"></script>
<form class="formoid-flat-green" style="background-color:#FFFFFF;font-size:14px;font-family:'Lato', sans-serif;color:#666666;max-width:480px;min-width:150px" method="post"><div class="title"><h2>Entrega Equipo</h2></div>
	<div class="element-select"><label class="title">Equipo Reparado</label><div class="large"><span><select name="select" >

		<option value="option 1">option 1</option>
		<option value="option 2">option 2</option>
		<option value="option 3">option 3</option></select><i></i></span></div></div>
	<div class="element-input"><label class="title">Estado Equipo:</label><input class="large" type="text" name="input" /></div>
	<div class="element-textarea"><label class="title">Diagnostico Tecnico</label><textarea class="medium" name="textarea" cols="20" rows="5" ></textarea></div>
	<div class="element-textarea"><label class="title">Recomendaciones</label><textarea class="medium" name="textarea1" cols="20" rows="5" ></textarea></div>
<div class="submit"><input type="submit" value="Enviar"/></div></form><p class="frmd"></p><script type="text/javascript" src="JS/EntregaEquipo/formoid-flat-green.js"></script>
<!-- Stop Formoid form-->



</body>
</html>
