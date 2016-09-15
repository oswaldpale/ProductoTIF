<%-- 
    Document   : index
    Created on : 26/05/2015, 09:44:06 PM
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
                <li role="presentation"> <a href="servicios.jsp">Servicios</a> </li>
                <li role="presentation" class="active"> <a href="consulta.jsp">Consultar Registros</a> </li>
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
            <form role="form" id="miformulario" method="post" action="Consultar">
                <div class="form-group"> 
                    <label for="nombre">Numero cedula cliente</label>
                    <input class="form-control" type="text" name="numeroCedula" />
                </div> 
                <div class="form-group"> 
                    <label for="nombre">Numero de Serie</label>
                    <input class="form-control" type="text" name="numeroSerie" />
                </div>  
                <input type="submit" value="Consultar" class="btn btn-default">
            </form>
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