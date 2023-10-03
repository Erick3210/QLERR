<%-- 
    Document   : RegistrarUsuarios
    Created on : 24 dic. 2022, 11:00:40
    Author     : Erick F. Castillo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="HojaRegistro.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="containerAbuelo">
            
            
            <div class="cabecera">
                    <img src="Cabecera.PNG" align="center" width="1500" height="150"> 
            </div>
            
            
        <center>

            <div class="container bg-success mb-3" style="width: 55rem; height: 29rem; margin-top: 65px;">
                <font color="white" ><h3 class="card-title">Bienvenido al Sistema QLERR(Quality Learning Resources Reader)</h3></font>
                <div class="container-xl" style="margin-top: -35px;">        
                    <form  method="Post" action="RegistrarControlador">
                        <div class="card" style="width: 30rem; height: 20rem; top: 5rem;">
                         <div class="card-body" >
                            <h3 class="card-title">¡Crea una cuenta!</h3>
                            <input type="type" name="username" class="from-control mt-3"  placeholder="Ingrese Usuario" >
                            <br>
                            <input type="type" name="password" class="from-control mt-3"  placeholder="Ingrese Clave" >
                            <br>
                            <input type="submit" class="btn btn-success btn-block mt-3" value="Registar Usuario" ">
                            <br>
                            <br>
                            <font color="white" ><a href="index.jsp" class="btn btn-danger"><h5>  Salir  </h5></a></font>
                        </div>    
                      </div> 
                    </form> 
                </div>  
             </div>
        </center>
    </body>
</html>
