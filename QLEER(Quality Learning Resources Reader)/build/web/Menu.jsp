<%-- 
    Document   : reusabilidad
    Created on : 17 dic. 2022, 18:31:15
    Author     : Erick F. Castillo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="HojaMenu3.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>

    <center>

        <div class="containerAbuelo">

            <div class="cabecera">
                <img src="Cabecera.PNG" align="center" width="1500" height="150"> 
            </div>

            <div class="containerPadre">
                <h2>¡Menu de operaciones del sistema QLERR!</h2>

                <div class="container">

                    <div class="d-grid gap-4 col-5 mx-auto" style="margin-top: 70px; width:300px"> 

                        <center><font color="white"><h3>Evaluadores de Calidad</h3></font></center>

                        
                        <font color="white"><a href="DescripcionReusabilidad2.jsp"><input type="submit" class="btn btn-secondary btn-lg dropdown-toggle"  style="font-size: 25px" value="Evaluar la Reusabilidad"></a></font>
                        <font color="white"><a href="DescripcionLegibilidad2.jsp"><input type="submit" class="btn btn-secondary btn-lg dropdown-toggle" style="font-size: 25px" value="Evaluar la Legibilidad"></a></font>
                        <font color="white"><a href=""><input type="submit" class="btn btn-secondary btn-lg dropdown-toggle" style="font-size: 25px" value="Evaluar la Correctitud"></a></font>
                        

                    </div>

                    <div class="d-grid gap-4 col-5 mx-auto" style="margin-top: 70px;  width:300px"> 

                        <center><font color="white"><h3>Resultados estadísticos</h3></font></center>


                        <div class="dropdown">

                            <a class="btn btn-secondary btn-lg dropdown-toggle" style="font-size: 25px" href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="false">
                                Gráficas
                            </a>

                            <ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                                <li><font color="white" size="4"><a class="dropdown-item" href="GraficaReusabilidad.jsp">Graficar la Reusabilidad</a></font></li>
                                <li><font color="white" size="4"><a class="dropdown-item" href="GraficaLegibilidad.jsp">Graficar la Legibilidad</a></font></li>
                                <li><font color="white" size="4"><a class="dropdown-item" href="GraficaCorrectitud.jsp">Graficar la Correcitud</a></li>
                                 <li><font color="white" size="4"><a class="dropdown-item" href="GráficaCorrelación.jsp">Correlacion Legibilidad - Reusabilidad</a></li>
                            </ul>


                        </div> 


                        <br>



                        <div class="dropdown">

                            <a class="btn btn-secondary btn-lg dropdown-toggle" style="font-size: 25px" href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="false">
                                Historicos
                            </a>

                            <ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                                <li><font color="white" size="4"><a class="dropdown-item" href="Panelderegistrosreusabilidad.jsp">Historicos Reusabilidad</a></font></li>
                                <li><font color="white" size="4"><a class="dropdown-item" href="Panelderegistroslegibilidad.jsp">Historicos Legibilidad</a></font></li>
                                <li><font color="white" size="4"><a class="dropdown-item" href="Panelderegistroscorrectitud.jsp">Historicos Correctitud</a></font></li>
                                <li><font color="white" size="4"><a class="dropdown-item" href="#"></a></li>
                            </ul>


                        </div> 

                    </div>

                    <br>
                    <br>
                    <br>
                    <div class="botondiv">

                        <font color="white" ><a style = "align-self: center; margin-top:50px  " href="index.jsp" class="btn  btn-lg size-xl btn-danger"><h4>  Salir  </h4></a></font>
                    </div>           


                </div>





            </div>
        </div>

    </center>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
