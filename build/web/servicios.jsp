<%-- 
    Document   : servicios
    Created on : 4/06/2015, 10:30:57 PM
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  type="text/css" href="CSS/normalize.css" />    
        <link rel="stylesheet"  type="text/css" href="CSS/style.css" /> 
        <link rel="stylesheet" href="CSS/bootstrap.min.css">
        <link rel="stylesheet" href="CSS/bootstrap-theme.min.css">
        <script type="text/javascript" src="JS/jquery-1.10.2.min.js"></script>
        <script type="text/javascript" src="JS/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>        
        <header id="cabecera">
            <figure>
                <img src="Images/logo.png"/>
            </figure>
        </header>
        <nav id="menu2"> 
            <ul class="nav nav-tabs">
                <li role="presentation"> <a href="index.jsp">Inicio</a></li>
                <li role="presentation"> <a href="accesorios.html">Accesorios</a> </li>
                <li role="presentation"> <a href="soporte.jsp">Soporte</a> </li>
                <li role="presentation" class="active"> <a href="servicios.jsp">Servicios</a> </li>
                <li role="presentation"> <a href="consulta.jsp">Consultar Registros</a> </li>
                <li role="presentation"> <a href="acercadeEAT.html">acerca de EAT</a> </li>
            </ul>
        </nav>
        <section>
            <figure>
                <center><img src="Images/home_bg.jpg"/></center>
            </figure>
        </section>
        <div class="container">
            <section>
                <center><h1>Edificio Alta Tecnologia</h1></center>                
                <center><h2>Servicios</h2></center>
                <article>
                    <h3>Ventas de equipos y accesorios</h3>
                    <p>Ofrecemos una gran variedad de productos e insumos
                        tecnologicos acordes a sus necesidades.</p>
                    <ul class="list-group">
                        <li class="list-group-item">Computadoras portátiles y de mesa</li>
                        <li class="list-group-item">Tablets en marcas variadas</li>
                        <li class="list-group-item">Accesorios y partes para PC</li>
                        <li class="list-group-item">Impresoras de inyección de tinta, láser y matriz de punto</li>
                        <li class="list-group-item">Cámaras digitales</li>
                        <li class="list-group-item">Videocámaras</li>
                        <li class="list-group-item">Servicio de alquiler y venta de videobeam</li>
                        <li class="list-group-item">Venta de fotocopiadoras</li>
                        <li class="list-group-item">Toda clase de cartuchos para impresoras</li>
                        <li class="list-group-item">Discos duros externos</li>
                        <li class="list-group-item">Cargadores para portátiles</li>
                        <li class="list-group-item">Toda clase de cables</li>
                        <li class="list-group-item">Mesas y sillas para centros de cómputo (oficinas, hogar, café internet)</li>
                    </ul>
                    <h3>Diseño de circuito cerrado de televisión</h3>
                    <h3>Servicio técnico especializado</h3>
                </article>
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
