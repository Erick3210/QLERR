<%-- 
    Document   : PanelDeError
    Created on : 21 dic. 2022, 07:13:01
    Author     : Erick F. Castillo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          if (session.getAttribute("name")!=null || session.getAttribute("clave")!=null) {
                  
        %>
        <h1> Error Usuario No Registrado: <%
        String usuario="", clave="", Mensaje=""; 
        usuario= (String) session.getAttribute("name");
        clave= (String) session.getAttribute("clave");   
            if (usuario != null) {
                   Mensaje=usuario; 
            }else{Mensaje="";}out.print(Mensaje);
            
        %></h1>
        
        <form  method="Post" action="CerrarSesion">
            
            <input type="submit" class="btn btn-danger" value="Cerrar Sesion" onclick="SubmitsEncry();">
            
        </form>
       
        <%}else{%>
        
        <div class="alert">
            
            <div class="alert-danger">
                
                <h5>¡Error usted no tiene permiso para acceder a esta pagina!</h5>
                <a href="index.jsp" class="btn btn-danger">Volver al Inicio</a>
                
            </div>
                
        </div>
        
        
        <%}%>
    </body>
</html>
