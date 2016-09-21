<%-- 
    Document   : Principal
    Created on : 1/06/2015, 10:36:56 PM
    
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet"  type="text/css" href="CSS/normalize.css" /> 
        <link rel="stylesheet" href="CSS/bootstrap.min.css">
        <link rel="stylesheet" href="CSS/bootstrap-theme.min.css">
        <script type="text/javascript" src="JS/jquery-1.10.2.min.js"></script>
        <script type="text/javascript" src="JS/bootstrap.min.js"></script>
        <style type="text/css">
            /* Formatear el formulario a dos columnas */
            body {
                font: 13px/1.6 Tahoma, sans-serif;
                background: #F5F5F5;
            }

            #agrupar{
                width:960px; 
                margin: 15px auto;
            }

            #cabecera{
                background-color: #003366;
                padding: 20px;

            }

            header figure img{
                width : 214px; 
                height : 124px;
            }

            .izquierda {
                float: left;
                clear: left;
            }

            .derecha {
                float: right;
                clear: right;
            }

            ul {
                list-style: none;
                margin: 0;
                padding: 0;
            }

            #contenedor {
                background: #FFF;
                border: 1px solid silver;
                margin: 1em auto;
                padding: 1em;
                width: 768px;
            }

            span.requerido {
                font-size: 1.3em;
                font-weight: bold;
                color: #C00;
            }

            h2 {
                font: normal 2em arial, sans-serif;
                margin: 0;
            }

            ul li.botones {
                border-top: 2px solid #CCC;
                clear: both;
                float: none;
                padding: 1em 0;
                margin-top: 1em;
                text-align: right;
                width: 100%;
            }

            ul li.botones input {
                font-size: 1.3em;
            }

            ul li {
                margin: 0.5em 0;
                padding: 0.5em;
                width: 46%;
            }

            ul li label.titulo {
                font-weight: bold;
            }

            ul li div span {
                float: left;
                padding: 0.3em 0;
            }

            ul li div span.completo {
                width: 100%;
            }

            ul li div span.mitad {
                width: 50%;
            }

            ul li div span.tercio {
                width: 33%;
            }

            ul li div span.dostercios {
                width: 66%;
            }

            ul li div span label {
                display: block;
                font: normal 0.8em arial, sans-serif;
                color: #333;
            }

            ul li p.ayuda {
                display: none;
            }

            ul li input {
                padding: 0.2em;
            }

            input#apellido1, input#apellido2, input#direccion, input#email {
                width: 260px;
            }

            input#codigopostal {
                width: 80px;
            }

            select#Marcas {
                width: 90px;
            }

            select#pais {
                width: 150px;
            }

            input#telefonofijo, input#telefonomovil {
                width: 135px;
            }

            /* Cambiar el color en el :hover y resaltar los campos en el :focus */
            ul li:hover {
                background-color: #B3F0FF;
            }

            ul li.botones:hover {
                background-color: transparent;
            }

            ul li input:focus {
                border: 2px solid #E6B700;
            }

            /* Formatear el formulario a una columna */
            ul li.izquierda, ul li.derecha {
                float: none;
                width: auto;
            }

            ul li {
                overflow: hidden;
            }

            ul li label.titulo {
                float: left;
                width: 150px;
            }

            ul li div {
                margin-left: 160px;
            }

            /* Aspecto final del formulario con los mensajes de ayuda */
            h2 {
                margin-bottom: 0.3em;
            }

            ul li {
                border-top: 1px solid #CCC;
                margin: 0;
                padding: 1em;
            }

            ul li.botones {
                margin: 0;
            }

            ul li label.titulo {
                text-align: right;
                width: 100px;
            }

            ul li div {
                margin-left: 110px;
                overflow: hidden;
            }

            ul li {
                position: relative;
            }

            ul li:hover p.ayuda {
                display: block;
                margin: 0.3em;
                position: absolute;
                top: 0;
                right: 0;
                width: 150px;
            }
        </style>
    </head>
    <body>       
            <header>
                <header id="cabecera">
                    <figure>
                        <img src="Images/logo.png"/>
                    </figure>
                </header>
            </header>
            <nav id="menu2"> 
                <ul class="nav nav-tabs">
                    <li role="presentation"> <a href="index.jsp">Inicio</a></li>
                    <li role="presentation"> <a href="accesorios.html">Accesorios</a> </li>
                    <li role="presentation"> <a href="soporte.jsp">Soporte</a> </li>
                    <li role="presentation"> <a href="servicios.jsp">Servicios</a> </li>
                    <li role="presentation" class="active"> <a href="consulta.jsp">Consultar Registros</a> </li>
                    <li role="presentation"> <a href="acercadeEAT.html">acerca de EAT</a> </li>
                </ul>
            </nav>
            <div class="container">
            <section>
                <header>
                
                    <h2>Datos De Cliente</h2>
                </header>
                <!-- Formulario para registrar Usuarios -->
                <form method="post" action="Registrar">
                    <ul>
                        <li class="izquierda">
                            <label class="titulo" for="nombre">Identificacion <span class="requerido"></span></label>
                            <div>
                                 <span class="mitad">
                                    <input id="cedula" name="cedula" value="" />
                                    <label for="cedula">Numero de Identificacion</label>
                                </span>
                                
                                <span class="mitad">
                                    <input id="nombre" name="nombre" />
                                    <label for="nombre">Nombre</label>
                                </span>

                                <span class="mitad">
                                    <input id="Apellidos" name="apellido" value="" />
                                    <label for="Apellidos">Apellidos</label>
                                </span>

                               

                                <span class="mitad">
                                    <input id="profesion" name="profesion" value="" />
                                            <label for="profesiopn">Ocupacion</label>
                                    </span>

                                    <span class="mitad">
                                    <input id="telefonofijo" name="telefonofijo" value="" />
                                           <label for="telefonofijo">Fijo</label>
                                       </span>

                                       <span class="mitad">
                                        <input id="telefonomovil" name="telefonomovil" value="" />
                                        <label for="telefonomovil">Móvil</label>
                                    </span>

                                    <span class="completo">
                                    <input id="email" name="email" value="" />
                                    <label for="Email">E-mail</label>
                                </span>
                            </div>
                            <p class="ayuda">No  olvide llenar todos los datos</p>
                        </li>
                        
                        
                        

	<li class="izquierda">
	<label class="titulo" for="nombre">Solicitud de Servicio<span class="requerido"></span></label>
	<div>
		<span class="mitad">
			<input id="N.Servicio" name="NumServ"/>
			<label for="N.Servicio">N.Servicio</label>
		</span>
 
		<span class="mitad">
			<input id="FechaIngres" name="FechaIngreso" />
			<label for="FechaIngreso">Fecha Ingreso</label>
		</span>  
    
		<span class="mitad">
			<input id="Elemento" name="Elemento" value="" />
			<label for="Elemento">Elemento</label>
		</span>
 
		<span class="mitad">
			<input id="T.Servicio" name="TServicio"/>
			<label for="T.Servicio">T.Servicioo</label>
		</span>
        
		<span class="mitad">
			<select id="Marcas" name="Marcas">
				<option value=""></option>
				<option value="HP">HP</option>
				<option value="Acer">Acer</option>
				<option value="Toshiba">Toshiba</option>
				<option value="Lenovo">Lenovo</option>
				<option value="Sony">Sony Vaio</option>
				<option value="Asus">Asus</option>
				<option value="otro">Otro</option>
			</select>
			<label for="Marcas">Marca</label>
		</span>
 
		<span class="mitad">
			<select id="S.O" name="SistemaOp">
				<option value=""></option>
				<option value="Mac">Mac</option>
				<option value="windows ">windows </option>
				<option value="linux">linux</option>
				<option value="otros">otros</option>
			</select>
		<label for="S.O">Sistema operativo</label>
		</span>
    
		<span class="mitad">
			<input id="N.Servicio" name="modeloEquipo" value="" />
			<label for="N.Servicio">Modelo</label>
		</span>
    
		<span class="mitad">
			<input id="FechaIngres" name="numeroSerie" value="" />
			<label for="FechaIngreso">No.Serie</label>
		</span>
    
		<span class="mitad">
			<textarea class="campos" rows="5" name="diagnosticoInicial"></textarea>
			<label for="DiagnosticoInicial">Diagnostico Inicial </label>  
		</span>
    
		<span class="mitad">
			<input id="TecnicoEncargado" name="TecnicoEncargado" value="" />
			<label for="TecnicoEncargado">Tecnico Encargado</label>
		</span>
	</div>   
    <p class="ayuda">El numero de servicio es imprescindible para poder aceptar el servicio</p>
	</li>
        
        
        
        <li class="izquierda">
	<label class="titulo" for="nombre">Reporte de Mantenimiento<span class="requerido"></span></label>
	<div>
		<span class="mitad">
			<input id="NServicio" name="NServicio2" value="" />
			<label for="NServicio">N.Servicio</label>
		</span>
 
		<span class="mitad">
			<input id="Cdeparte" name="cambioParte" value="" />
			<label for="Cdeparte">Cambio de parte</label>
		</span>  
    
		<span class="mitad">
			<textarea class="campos" rows="5" name="pruebasRealizadas"></textarea>
			<label for="PruebasRealizadas">Pruebas Realizadas</label>  
		</span>
 
		<span class="mitad">
			<textarea class="campos" rows="5" name="reporteFinal"></textarea>
			<label for="ReporteFinal">Reporte Final</label>  
		</span>
        
		<span class="mitad">
			<textarea class="campos" rows="5" name="recomendaciones"></textarea>
			<label for="Recomendaciones">Recomendaciones </label>  
		</span>
 
		<span class="mitad">
			<input id="V.Servicio" name="valorServicio" />
			<label for="V.Servicio">Valor Servicio</label>
		</span>
    
    </div>   
    <p class="ayuda">El numero de servicio es la identificacion del servicio</p>
	</li>
        
              
                        <li class="botones">
                            <input type="submit" value="Enviar" class="btn">
                            <input type="reset"  value="Borrar datos" class="btn">
                            <input type="hidden" name="id" value="">
                        </li>
                    </ul> 
                    <a href="index.jsp">Regresar</a>
                </form>
            </section>
            <section>

            </section>
        </div>
        <footer>
            <div class="row">
                <div class="col-md-4">
                    <h3>Pie 1</h3>
                    <p>Agregue aqui su contenido.</p>
                </div>
                <div class="col-md-4">
                    <h3>Pie 2</h3>
                    <p>Agregue aqui mas contenido.</p>
                </div>
                <div class="col-md-4">
                    <h3>Contacto</h3>
                    <p>CRA 14 No 14-19</p>
                    <p>TELEFONOS 4349353- 4348926</p>
                </div>
            </div>    
        </footer>
    </body>
</html>

