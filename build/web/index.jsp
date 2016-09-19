<%-- 
    Document   : index
    Created on : 26/05/2015, 09:44:06 PM
            <figure>
                <a href="JS/javascript:ponerURL()" target="_blank"> 
                    <center><img src="" name="banner" /></center>  
                </a>
            </figure>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Página web TIF</title>
    <link rel="stylesheet"  type="text/css" href="CSS/normalize.css" />        
    <link rel="stylesheet"  type="text/css" href="CSS/style.css" /> 
    <link rel="stylesheet" href="CSS/bootstrap.min.css">
    <link rel="stylesheet" href="CSS/bootstrap-theme.min.css">
    <script type="text/javascript" src="JS/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="JS/bootstrap.min.js"></script>
    <script type="text/javascript" src="JS/Funciones.js"></script>
</head>

<body> 
        <header id="cabecera">
            <figure>
                <img src="Images/logo.png"/>
            </figure>
        </header>
        <nav id="menu2"> 
            <ul class="nav nav-tabs">
                <li role="presentation" class="active"> <a href="index.jsp">Inicio</a></li>
                <li role="presentation"> <a href="accesorios.html">Accesorios</a> </li>
                <li role="presentation"> <a href="soporte.jsp">Soporte</a> </li>
                <li role="presentation"> <a href="servicios.jsp">Servicios</a> </li>
                <li role="presentation"> <a href="ConsultaEquipo.jsp">Consultar Registros</a> </li>
                <li role="presentation"> <a href="acercadeEAT.html">acerca de EAT</a> </li>
            </ul>
        </nav>
        <section id="miSlide" class="carousel slide">
            <ol class="carousel-indicators">
                <li data-target="#miSlide" data-slide-to="0" class="active"></li>
                <li data-target="#miSlide" data-slide-to="1"></li>
                <li data-target="#miSlide" data-slide-to="2"></li>
                <li data-target="#miSlide" data-slide-to="3"></li>
                <li data-target="#miSlide" data-slide-to="4"></li>
                <li data-target="#miSlide" data-slide-to="5"></li>
            </ol>
            <div class="carousel-inner">
                <div class="item active">
                    <img src="http://i.imgur.com/ZFB3U86.jpg?1" class="adaptar">
                </div>
                <div class="item">
                    <img src="http://i.imgur.com/BoLIVY0.jpg?1" class="adaptar">
                </div>
                <div class="item">
                    <img src="http://i.imgur.com/UTt26FY.jpg?1" class="adaptar">
                </div>
                <div class="item">
                    <img src="http://i.imgur.com/oQx7agU.jpg?1" class="adaptar">
                </div>
                <div class="item">
                    <img src="http://i.imgur.com/sZBkTwg.jpg?1" class="adaptar">
                </div>
                <div class="item">
                    <img src="http://i.imgur.com/RUbzLit.jpg?1" class="adaptar">
                </div>
            </div>
            <a href="#miSlide" class="left carousel-control" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
            </a>
            <a href="#miSlide" class="right carousel-control" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right"></span>
            </a>
        </section>
        <div class="container">       
        <section>  
            <article>                                      
                <div class="row">
                    <div class="col-md-12">
                        <h1 style="text-align: center;">Edificio Alta Tecnologia</h1>
                    </div>
                </div> 
                <HR align="center" size="2" width="100%" color="Red" noshade>
                <div class="row">
                    <div class="col-md-6"> 
                        <h3>Prepárate para empezar el colegio con éxito</h3>
                        <p>                        
                        Elige tu ordenador portátil, impresora y accesorios perfectos y propónte estar en el cuadro de honor. 
                        </p>
                    </div>
                    <div class="col-md-6">
                        <img src="Images/portada.png" WIDTH=500 HEIGHT=300 ORDER=0 VSPACE=2 HSPACE=2 ALT="Obra de K. Haring">
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6"> 
                        <img src="Images/Portailes 360.jpg" WIDTH=500 HEIGHT=300 ORDER=0 VSPACE=2 HSPACE=2 ALT="Obra de K. Haring">
                    </div>
                    <div class="col-md-6">
                        <p>Cuando hablamos de crecimiento  es muy importante puntualizar que en la zona comercial del municipio
                        de Florencia Caquetá, se identifica una mediana empresa del sector privado llamada Edificio de la Alta 
                        Tecnología, que cuenta con las instalaciones debidamente adecuadas en el centro de la ciudad, más 
                        específicamente en la dirección carrera 14 # 14 -19 centro; especialista en el sector mercantil durante más de 
                        15 años de experiencia, integrada por más de 15  funcionarios debidamente capacitados en todas sus dependencias
                        que trabajan en  forma coordinada para garantizar la eficiencia del funcionamiento empresarial en el sector 
                        comercial de la ciudad de Florencia</p>
                    </div>
                </div>                
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
