<%-- 
    Document   : index
    Created on : 26/05/2015, 09:44:06 PM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
    <%
        HttpSession sesion = request.getSession();
        String strError = (String)sesion.getAttribute("auterror");
        if(strError!=null && !strError.equalsIgnoreCase("")){
            out.print("<script>alert('"+strError+"');</script>");
        }
        
        %>


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
                <li role="presentation" class="active"> <a href="soporte.jsp">Soporte</a> </li>
                <li role="presentation"> <a href="servicios.jsp">Servicios</a> </li>
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
            <div class="row">
                <div class="col-md-12">
                    <h1 style="text-align: center;">Registre su producto</h1>
                    <h3 style="text-align: center;">y disfrute de sus ventajas</h3>
                </div>
            </div>
            <form role="form" id="miformulario" method="post" action="Validacion">
                <div class="form-group"> 
                    <label for="nombre">Nombre de Usuario</label>
                    <input class="form-control" type="text" name="usuario" />
                </div> 
                <div class="form-group"> 
                    <label for="nombre">Password</label>
                    <input class="form-control" type="password" name="login" />
                </div>  
                <input type="submit" value="Enviar" class="btn">
            </form>
        </section>
         <%  if(strError!=null && !strError.equalsIgnoreCase("")){ %>
            <section>
                <h2> <%=strError %></h2>
            </section>
           <% } %>
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


