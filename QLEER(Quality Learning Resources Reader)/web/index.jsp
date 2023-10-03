<%-- 
    Document   : index
    Created on : 17 dic. 2022, 10:17:16
    Author     : Erick F. Castillo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="HojaLogin.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    
    <body>
      
        
   
        
        <div class="containerAbuelo">
            
            
            <div class="cabecera">
                    <img src="Cabecera.PNG" align="center" width="1500" height="150"> 
            </div>
            
            
        <center>

            <div class="container bg-primary mb-3" style="width: 55rem; height: 29rem; margin-top: 65px;">
                <font color="white" ><h3 class="card-title">Bienvenido al Sistema QLERR(Quality Learning Resources Reader)</h3></font>
                <div class="container-xl" style="margin-top: -35px;">        
                    <form  method="Post" action="ValidarControlador">
                        <div class="card" style="width: 30rem; height: 22rem; top: 5rem;">
                         <div class="card-body" >
                            <h3 class="card-title">Iniciar Sesion</h3>
                            <input type="type" name="username" class="from-control mt-3" placeholder="Ingrese Usuario" required>
                            <br>
                            <input type="password" name="password" class="from-control mt-3" placeholder="Ingrese Clave" required>
                            <br>
                            <input type="submit" class="btn btn-primary btn-block mt-3" value="Ingresar" onclick="SubmitsEncry();">
                            <br>
                            <br>
                            <p class="card-title">¿No tienes cuenta con nosotros?</p>
                            <p class="card-title">¡Registrate Aqui!</p>
                            <a href="RegistrarUsuarios.jsp" class="btn btn-success"><h6>  Registrar  </h6></a>
                        </div>    
                      </div> 
                    </form> 
                </div>  
             </div>
        </center>
    </div>
  
   
 
 


    </body>
</html>
