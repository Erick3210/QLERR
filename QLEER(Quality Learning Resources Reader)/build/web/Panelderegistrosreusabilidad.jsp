<%-- 
    Document   : Panelderegistrosreusabilidad2
    Created on : 05-mar-2023, 7:51:50
    Author     : efcas
--%>

<%@page import="controlesDBReusabilidad.getAndSetpdf"%>
<%@page import="controlesDBReusabilidad.getAndSetdocx"%>
<%@page import="controlesDBReusabilidad.obtenerArchivosPDF"%>
<%@page import="controlesDBReusabilidad.getAndSet2"%>
<%@page import="java.util.List"%>
<%@page import="controlesDBReusabilidad.obtenerReusabilidad"%>
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

                List<getAndSetpdf> datos3 = pdf.ObtenerDatosArchivoPDF1();
                List<getAndSetdocx> datos4 = pdf.ObtenerDatosArchivoDOCX1();

                obtenerReusabilidad oR = new obtenerReusabilidad();

                List<getAndSet2> datos2 = oR.ObtenerDatosReusabilidad5();


            %>

            <center>
                <div class="margen">

                    <table style="width:100%; height:100%; border: 3px solid black" class="table table-bordered">
                        <tr>
                            <th colspan="5"><center><h2>PANEL DE RESULTADOS EN REUSABILIDAD</h2></center></th>
                        </tr>
                        <tr>
                            <th colspan="5">

                                <form method="GET" >
                                    <img src="Lupa.PNG" align="center" width="60" height="50">
                                    <label for="search">BUSCAR POR FECHA O ID:</label>
                                    <input type="text" id="search" name="search">
                                    <button type="submit">Buscar</button>
                                    <button onclick="window.location.href = 'Panelderegistrosreusabilidad.jsp'">Mostrar Todo</button>
                                    <a class="btn-salir" href = 'Menu.jsp'">Salir</a>
                                </form>


                            </th>
                        </tr>



                        <tr>
                            <td><font size="4" ><h4><center> ID  </center></h4></font></td>
                            <td><font size="4" ><h4><center>  FECHA  </center></h4></font></td>
                            <td><font size="4" ><h4><center> NIVEL DE REUSABILIDAD  </center></h4></font></td>
                            <td><font size="4" ><h4><center> FORMATO  </center></h4></font></td>
                            <td><font size="4" ><h4><center> VER RECURSO </center></h4></font></td>
                        </tr>
                        <% for (getAndSet2 g : datos2) {

                                String search = request.getParameter("search");

                                if (search != null && !search.isEmpty()) {
                                    if (!String.valueOf(g.getId()).equals(search) && !g.getTime().toString().equals(search)) {
                                        continue;
                                    }
                                }


                        %>
                        <tr>
                            <td><font size="4" ><center><%= g.getId()%></center></font></td>
                        <td><font size="4" ><center><%= g.getTime()%></center></font></td>
                        <td><font size="4" ><center><%= g.getValorf()%>%</center></font></td>
                        <td><font size="4" ><center><%= g.getFormato()%></center></font></td>
                            <% if (g.getFormato().equalsIgnoreCase("pdf") && datos3.size() > 0) {%>
                        <td><font size="4" ><center><a href="recursosPDF/<%=datos3.get(0).getNombre()%>"><%= datos3.get(0).getNombre()%></a></center></font></td>
                            <% datos3.remove(0); %>
                            <% } else if (!g.getFormato().equalsIgnoreCase("pdf") && datos4.size() > 0) {%>
                        <td><font size="4" ><center><a href="recursosDOCX/<%=datos4.get(0).getNombre()%>"><%= datos4.get(0).getNombre()%></a></center></font></td>
                            <% datos4.remove(0); %>
                            <% } %>
                        </tr>
                        <%}%>

                        </tr>
                    </table>
                </div>
            </center>
        </div>  
    </body>
</html>
