<%-- 
    Document   : ConsultaEquipo
    Created on : 18/09/2016, 10:30:00 AM
    Author     : PcIsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>Consulta Equipo</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body class="blurBg-false" style="background-color:#EBEBEB">



<!-- Start Formoid form-->
<link rel="stylesheet" href="CSS/ConsultaEquipo/formoid-biz-green.css" type="text/css" />
<script type="text/javascript" src="JS/ConsultaEquipo/jquery.min.js"></script>
<form class="formoid-biz-green" style="background-color:#1A2223;font-size:14px;font-family:'Open Sans','Helvetica Neue', 'Helvetica', Arial, Verdana, sans-serif;color:#ECECEC;max-width:480px;min-width:150px" method="post" action="ServletConsultarProducto"><div class="title"><h2>Consulta Equipo</h2></div>
	<div class="element-number"><label class="title"><span class="required">*</span></label><input class="large" type="text" min="0" max="99999999999" name="cc_cliente" required="required" placeholder="Cedula" value=""/></div>
	<div class="element-number"><label class="title"><span class="required">*</span></label><input class="large" type="text" min="0" max="99999999999" name="n_serie" required="required" placeholder="N° Serie" value=""/></div>
<div class="submit"><input type="submit" value="Buscar"/></div></form><p class="frmd"></p><script type="text/javascript" src="JS/ConsultaEquipo/formoid-biz-green.js"></script>
<!-- Stop Formoid form-->

</body>
</html>
