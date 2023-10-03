<%-- 
    Document   : Panel de registros reusabilidad
    Created on : 17-feb-2023, 9:24:20
    Author     : efcas
--%>

<%@page import="controlesDBLegibilidad.getAndSet"%>
<%@page import="controlesDBLegibilidad.obtenerArchivosPDF"%>

<%@page import="controlesDBLegibilidad.getAndSet"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlesDBLegibilidad.obtenerLegibilidad"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="HojaPanelR1.css">
        <title>JSP Page</title>
    
    <style>
    .btn-salir {
      background-color: red;
      color: white;
      border: none;
      padding: 12px 20px;
      cursor: pointer;
      border-radius: 4px;
      margin-left: 680px;
    }
  </style>
    
    </head>

    


    <body>

        <div class="panel1">
            <div class="cabecera">
                <img src="Cabecera.PNG" align="center" width="1500" height="140"> 
            </div>

            <%
                obtenerArchivosPDF pdf = new obtenerArchivosPDF();
                List<getAndSet> datos3 = pdf.ObtenerLegibilidad2();

                obtenerLegibilidad oL = new obtenerLegibilidad();
                List<getAndSet> datos = oL.ObtenerDatosLegibilidad3();

               
            %>

            <center>
                <div class="margen">
                    <table style="width:100%; height:100%; border: 3px solid black" class="table table-bordered">
                        <tr>
                            <th colspan="5"><center><h2>PANEL DE RESULTADOS EN LEGIBILIDAD</h2></center></th>
                        </tr>

                        <tr>
                            <th colspan="5">
                                <form method="GET" >
                                    <img src="Lupa.PNG" align="center" width="60" height="50">
                                    <label for="search">BUSCAR POR FECHA O ID:</label>
                                    <input type="text" id="search" name="search">
                                    <button type="submit">Buscar</button>
                                    <button onclick="window.location.href = 'Panelderegistroslegibilidad.jsp'">Mostrar Todo</button>
                                    <a class="btn-salir" href = 'Menu.jsp'">Salir</a>
                                </form>
                            </th>
                        </tr>

                        <tr>
                            <td><font size="4"><h4><center>ID</center></h4></font></td>
                            <td><font size="4"><h4><center>FECHA</center></h4></font></td>
                            <td><font size="4"><h4><center>NIVEL DE LEGIBILIDAD</center></h4></font></td>
                            <td><font size="4"><h4><center>FORMATO</center></h4></font></td>
                            <td><font size="4"><h4><center>VER RECURSO</center></h4></font></td>
                        </tr>

                        <%
                            for (getAndSet g : datos) {

                                String search = request.getParameter("search");

                                if (search != null && !search.isEmpty()) {
                                    if (!String.valueOf(g.getId()).equals(search) && !g.getTime().toString().equals(search)) {
                                        continue;
                                    }
                                }
                        %>

                        <tr>
                            <td><font size="4"><center><%= g.getId()%></center></font></td>
                        <td><font size="4"><center><%= g.getTime()%></center></font></td>
                        <td><font size="4"><center><%= g.getValorf()%>%</center></font></td>
                        <td><font size="4"><center><%= g.getFormato()%>%</center></font></td>
                        <td><font size="4"><center><a href="recursosPDFLegibilidad/<%=datos3.get(0).getNombre()%>"><%= datos3.get(0).getNombre()%></a></center></font></td>
                            <% datos3.remove(0); %>
                        </tr>

                        <% }%>  
                    </table>
                </div>
            </center>
        </div>  
    </body>
</html>
