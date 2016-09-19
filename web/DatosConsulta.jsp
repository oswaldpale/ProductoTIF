<%-- 
    Document   : DatosConsulta
    Created on : 18/09/2016, 01:26:07 PM
    Author     : PcIsa
--%>

<%@page import="Controlador.Controller_Producto_Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>Datos Consulta</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body class="blurBg-true" style="background-color:#ebeaea">
    <% Controller_Producto_Cliente pc = new Controller_Producto_Cliente();
        
    %>
<!-- Start Formoid form-->
<link rel="stylesheet" href="CSS/DatosConsultaTodo/formoid-flat-green.css" type="text/css" />
<script type="text/javascript" src="JS/DatosConsultaTodo/jquery.min.js"></script>
<form class="formoid-flat-green" style="background-color:#e3e3e3;font-size:14px;font-family:'Lato', sans-serif;color:#666666;max-width:680px;min-width:150px" method="post"><div class="title"><h2>Datos Consulta</h2></div>
	<div class="element-name"><label class="title"></label><span class="nameFirst"><input  type="text" size="8" name="name[first]" /><label class="subtitle">Nombre</label></span><span class="nameLast"><input  type="text" size="14" name="name[last]" /><label class="subtitle">Apellido</label></span></div>
	<div class="element-number"><label class="title">Cedula</label><input class="large" type="text" min="0" max="99999999" name="number"  value=""/></div>
	<div class="element-input"><label class="title">Ocupacion</label><input class="large" type="text" name="input" /></div>
	<div class="element-number"><label class="title">celular</label><input class="large" type="text" min="0" max="99999999" name="number2"  value=""/></div>
	<div class="element-number"><label class="title">Telefono</label><input class="large" type="text" min="0" max="99999999" name="number1"  value=""/></div>
	<div class="element-email"><label class="title">Email</label><input class="large" type="email" name="email" value="" /></div>
	<div class="element-number"><label class="title">N_Servicio</label><input class="large" type="text" min="0" max="99999999" name="number3"  value=""/></div>
	<div class="element-input"><label class="title">fecha_Ingreso</label><input class="large" type="text" name="input1" /></div>
	<div class="element-input"><label class="title">Elemento</label><input class="large" type="text" name="input2" /></div>
	<div class="element-input"><label class="title">Tipo de servicio</label><input class="large" type="text" name="input3" /></div>
	<div class="element-input"><label class="title">Marca</label><input class="large" type="text" name="input6" /></div>
	<div class="element-input"><label class="title">Sistema Operativo</label><input class="large" type="text" name="input5" /></div>
	<div class="element-input"><label class="title">Modelo</label><input class="large" type="text" name="input4" /></div>
	<div class="element-number"><label class="title">N_Servicio2</label><input class="large" type="text" min="0" max="99999999" name="number4"  value=""/></div>
	<div class="element-input"><label class="title">Cambio de parte ?</label><input class="large" type="text" name="input7" /></div>
	<div class="element-input"><label class="title">Pruba Realizada</label><input class="large" type="text" name="input8" /></div>
	<div class="element-input"><label class="title">Reporte final</label><input class="large" type="text" name="input9" /></div>
	<div class="element-textarea"><label class="title">Recomendaciones</label><textarea class="medium" name="textarea" cols="20" rows="5" ></textarea></div>
	<div class="element-number"><label class="title">Valor Servicio</label><input class="large" type="text" min="0" max="99999999" name="number5"  value=""/></div>
<div class="submit"><input type="submit" value="Aceptar"/></div></form><p class="frmd"><a href="http://formoid.com/v29.php">javascript form</a> Formoid.com 2.9</p><script type="text/javascript" src="JS/DatosConsultaTodo/formoid-flat-green.js"></script>
<!-- Stop Formoid form-->



</body>
</html>
