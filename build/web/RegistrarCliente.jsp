<%-- 
    Document   : Form_Registro_cliente
    Created on : 17/09/2016, 12:03:19 PM
    Author     : PcIsa
--%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>Registro Cliente</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body class="blurBg-false" style="background-color:#EBEBEB">



<!-- Start Formoid form-->
<link rel="stylesheet" href="CSS/formoid-solid-green.css" type="text/css" />
<script type="text/javascript" src="JS/jquery.min.js"></script>
<form class="formoid-solid-green" style="background-color:#1A2223;font-size:14px;font-family:'Roboto',Arial,Helvetica,sans-serif;color:#34495E;max-width:480px;min-width:150px" method="post" action="ServletRegistrarClient"><div class="title"><h2>Registro Cliente</h2></div>
	<div class="element-name"><label class="title"><span class="required">*</span></label><span class="nameFirst"><input placeholder=" Nombres" type="text" size="7" name="nombre" required="required"/><span class="icon-place"></span></span><span class="nameLast"><input placeholder=" apellidos" type="text" size="13" name="apellido" required="required"/><span class="icon-place"></span></span></div>
	<div class="element-number"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="large" type="text" min="0" max="99999999999" name="cedula" required="required" placeholder="Cedula" value=""/><span class="icon-place"></span></div></div>
	<div class="element-phone"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="large" type="tel" pattern="[+]?[\.\s\-\(\)\*\#0-9]{3,}" maxlength="24" name="celular" required="required" placeholder="Celular" value=""/><span class="icon-place"></span></div></div>
	<div class="element-phone"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="large" type="tel" pattern="[+]?[\.\s\-\(\)\*\#0-9]{3,}" maxlength="24" name="telefono" required="required" placeholder="telefono fijo" value=""/><span class="icon-place"></span></div></div>
	<div class="element-email"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="large" type="email" name="email" value="" required="required" placeholder="Email"/><span class="icon-place"></span></div></div>
	<div class="element-input"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="large" type="text" name="ocupacion" required="required" placeholder="ocupacion"/><span class="icon-place"></span></div></div>
<div class="submit"><input type="submit" value="Guardar"/></div></form><p class="frmd"><a href="http://formoid.com/v29.php">html form</a> Formoid.com 2.9</p><script type="text/javascript" src="JS/formoid-solid-green.js"></script>
<!-- Stop Formoid form-->



</body>
</html>

