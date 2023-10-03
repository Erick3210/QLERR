<%-- 
    Document   : M_Reusabilidad2.jsp
    Created on : 26-mar-2023, 20:09:29
    Author     : efcas
--%>

<%@page import="controlesDBReusabilidad.obtenerReusabilidad"%>
<%@page import="controlesDBReusabilidad.obtenerAccesibilidad"%>
<%@page import="controlesDBReusabilidad.obtenerUsabilidad"%>
<%@page import="controlesDBReusabilidad.obtenerLegibilidad"%>
<%@page import="controlesDBReusabilidad.obtenerDisponibilidad"%>
<%@page import="controlesDBReusabilidad.obtenerCompletitud"%>
<%@page import="controlesDBReusabilidad.guardarReusabilidad"%>
<%@page import="controlesDBReusabilidad.obtenerTipoDeLetra"%>
<%@page import="controlesDBReusabilidad.obtenerTamañoFuenteReusabilidad"%>
<%@page import="controlesDBReusabilidad.obtenerColorDeFuenteReusabilidad"%>
<%@page import="controlesDBReusabilidad.obtenerColorDeFuenteReusabilidad"%>
<%@page import="controlesDBReusabilidad.obtenerColorDeFondoReusabilidad"%>
<%@page import="controlesDBReusabilidad.obtenerAlineacionReusabilidad"%>
<%@page import="controlesDBReusabilidad.obtenerCaracteristicasC"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Prueba</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>

            .table5 {
                width: 100%;
                margin-top: 10px;
                border-collapse: collapse;
                text-align: center;
                background-color: #fff;
                color: #333;
                font-size: 1.2rem;
            }

            .table5 th,
            .table5 td {
                padding: 10px;
                border: 1px solid #ccc;

            }

            .table5 th {
                background-color: #f2f2f2;
                font-weight: bold;
                text-align: center;
                height: -100000%;
            }





            .table3 {
                width: 100%;
                margin-top: 29px;
                border-collapse: collapse;
                text-align: center;
                background-color: #fff;
                color: #333;
                font-size: 1.2rem;
            }

            .table3 th,
            .table3 td {
                padding: 10px;
                border: 1px solid #ccc;
                height: 100px;
            }

            .table3 th {
                background-color: #f2f2f2;
                font-weight: bold;
                text-align: center;
                height: 10px;
            }



            .table {
                width: 100%;
                margin-top: 10px;
                border-collapse: collapse;
                text-align: center;
                background-color: #fff;
                color: #333;
                font-size: 1.2rem;
            }

            .table th,
            .table td {
                padding: 10px;
                border: 1px solid #ccc;

            }

            .table th {
                background-color: #D5D5D5;
                font-weight: bold;
                text-align: center;
                height: -100000%;
            }



            .table4 {
                width: 100%;
                height: 10px;
                margin-top: 42px;
                border-collapse: collapse;
                text-align: center;
                background-color: #fff;
                color: #333;
                font-size: 1.2rem;

            }

            .table4 th,
            .table4 td {
                padding: 10px;
                border: 1px solid #ccc;
            }

            .table4 th {
                background-color: #D5D5D5;
                font-weight: bold;
                text-align: center;
            }




            header {
                background-color: #FFFFFF;
                height: 120px;
                display: flex;
                align-items: center;
                justify-content: center;
            }

            header img {
                max-height: 100%;
                max-width: 100%;
            }

            #titulo {
                background-color: #ccc;
                height: 50px;
                display: flex;
                align-items: center;
                justify-content: center;
            }

            #seccion1, #seccion2, #seccion3 {
                overflow: hidden;
                overflow-x: auto;
                background-color: #8fbdf770;
                height: 730px;
                width: 100%;
                box-sizing: border-box;
                border: 1px solid #999;
                padding: 20px;
                scrollbar-width: none;
            }


            #seccion1::-webkit-scrollbar,
            #seccion2::-webkit-scrollbar,
            #seccion3::-webkit-scrollbar {
                display: none; /* oculta la barra de desplazamiento en navegadores webkit */
            }

            #boton-container {
                margin: 0 5%;
                top: 0cm;
                left: 2cm;
                height: 100%;
            }

            #miBoton {

                top: 0;
                left: 0;
                height: 100%;
                background-color: #ff0000;
                color: #fff;
                padding: 10px 20px;
                border: none;
                font-size: 16px;
                font-weight: bold;
                text-transform: uppercase;
            }

            .Formulario{

                margin-top: 200px;

            }

            .tentrada {
                display: flex;
                flex-direction: column;
                align-items: center;
            }

            .tentrada input[type="submit"] {
                margin-top: -12px;
            }

            @media screen and (min-width: 750px) {
                #seccion1, #seccion2, #seccion3 {
                    width: calc(100%/3);
                    float: left;
                }
            }

            @media (max-width: 750px) {
                h1{
                    font-size: 16px;
                }
                .table,
                .table3,
                .table4 {
                    font-size: 1rem;
                    overflow-x: auto;
                }
                .table th,
                .table td,
                .table3 th,
                .table3 td,
                .table4 th,
                .table4 td {
                    padding: 5px;
                }
            }

            .tooltip-content {
                display: none;
                position: absolute;
                background-color: #f9f9f9;
                border: 1px solid #ccc;
                padding: 10px;
                z-index: 1;
                height: 300px; /* Ajusta la altura según tus necesidades */
                overflow-y: auto; /* Agrega una barra de desplazamiento vertical si el contenido supera la altura */
            }




        </style>

        <script>
            function redirigir() {
                window.location.href = "Menu.jsp";
            }

            function Abrir_ventana2(url) {
                window.open(url, "_blank", "width=800, height=600");
            }

            function Direcciones(pagina) {
                var opciones = "toolbar=no, location=no, directories=no, status=yes, menubar=yes, scrollbars=no, resizable=yes, width=400, height=350, top=0, left=10";
                window.open(pagina, "", opciones);
            }

        </script>
    </head>
    <body>
        <header>
            <img src="Cabecera2.PNG" alt="Cabecera de la página">
        </header>

        <div id="titulo">
            <h1>¡CALCULA LA REUSABILIDAD DE TU RECURSO DE APRENDIZAJE!</h1>
            <div id="boton-container">
                <button id="miBoton"  onclick="redirigir()">SALIR</button>
            </div>
        </div>


        <%
            obtenerCaracteristicasC n = new obtenerCaracteristicasC();
            String i, i2, i3, i4, i5;
            i = n.ObtenerDatosCaracteristicasC().get(n.ObtenerDatosCaracteristicasC().size() - 1);
            i2 = n.ObtenerDatosCaracteristicasC().get(n.ObtenerDatosCaracteristicasC().size() - 2);
            i3 = n.ObtenerDatosCaracteristicasC().get(n.ObtenerDatosCaracteristicasC().size() - 3);
            i4 = n.ObtenerDatosCaracteristicasC().get(n.ObtenerDatosCaracteristicasC().size() - 4);
            i5 = n.ObtenerDatosCaracteristicasC().get(n.ObtenerDatosCaracteristicasC().size() - 5);

            String e, e2, e3, e4, e5;
            e = n.ObtenerDatosCaracteristicasC2().get(n.ObtenerDatosCaracteristicasC2().size() - 1);
            e2 = n.ObtenerDatosCaracteristicasC2().get(n.ObtenerDatosCaracteristicasC2().size() - 2);
            e3 = n.ObtenerDatosCaracteristicasC2().get(n.ObtenerDatosCaracteristicasC2().size() - 3);
            e4 = n.ObtenerDatosCaracteristicasC2().get(n.ObtenerDatosCaracteristicasC2().size() - 4);
            e5 = n.ObtenerDatosCaracteristicasC2().get(n.ObtenerDatosCaracteristicasC2().size() - 5);

            obtenerAlineacionReusabilidad ali = new obtenerAlineacionReusabilidad();
            int TParrafos = ali.ObtenerDatosAlineacion().get(ali.ObtenerDatosAlineacion().size() - 1);
            int PAdentro = ali.ObtenerDatosAlineacion().get(ali.ObtenerDatosAlineacion().size() - 2);
            int PAfuera = ali.ObtenerDatosAlineacion().get(ali.ObtenerDatosAlineacion().size() - 3);

            double porcentajeA = ali.ObtenerDatosAlineacion2().get(ali.ObtenerDatosAlineacion2().size() - 1);

            obtenerColorDeFondoReusabilidad fo = new obtenerColorDeFondoReusabilidad();

            double porcentajeFO = fo.ObtenerDatosAccesibilidad2();

            obtenerColorDeFuenteReusabilidad oa = new obtenerColorDeFuenteReusabilidad();
            int TF = oa.ObtenerDatosColorFuente().get(oa.ObtenerDatosColorFuente().size() - 1);
            int Negro = oa.ObtenerDatosColorFuente().get(oa.ObtenerDatosColorFuente().size() - 2);
            int OtrosColoresFuentes = oa.ObtenerDatosColorFuente().get(oa.ObtenerDatosColorFuente().size() - 3);

            double porcentajeCFue = oa.ObtenerDatosColorFuente2().get(oa.ObtenerDatosColorFuente2().size() - 1);

            obtenerTamañoFuenteReusabilidad tam = new obtenerTamañoFuenteReusabilidad();
            int TFuentes = tam.ObtenerDatosColorFuente().get(tam.ObtenerDatosColorFuente().size() - 1);
            int Rango1 = tam.ObtenerDatosColorFuente().get(tam.ObtenerDatosColorFuente().size() - 2);
            int Rango2 = tam.ObtenerDatosColorFuente().get(tam.ObtenerDatosColorFuente().size() - 3);
            int Rango3 = tam.ObtenerDatosColorFuente().get(tam.ObtenerDatosColorFuente().size() - 4);

            double porcentajeTM = tam.ObtenerDatosColorFuente2().get(tam.ObtenerDatosColorFuente2().size() - 1);

            obtenerTipoDeLetra Tfue = new obtenerTipoDeLetra();
            int totalF = Tfue.ObtenerDatosFuente().get(Tfue.ObtenerDatosFuente().size() - 5);
            int times = Tfue.ObtenerDatosFuente().get(Tfue.ObtenerDatosFuente().size() - 4);
            int Arial = Tfue.ObtenerDatosFuente().get(Tfue.ObtenerDatosFuente().size() - 3);
            int otrasf = Tfue.ObtenerDatosFuente().get(Tfue.ObtenerDatosFuente().size() - 2);
            int calibri = Tfue.ObtenerDatosFuente().get(Tfue.ObtenerDatosFuente().size() - 1);

            double porcentajeTL = Tfue.ObtenerDatosFuente2().get(Tfue.ObtenerDatosFuente2().size() - 1);

            guardarReusabilidad gr = new guardarReusabilidad();

            obtenerCompletitud oC = new obtenerCompletitud();
            obtenerDisponibilidad oD = new obtenerDisponibilidad();

            obtenerLegibilidad oL = new obtenerLegibilidad();
            obtenerUsabilidad oU = new obtenerUsabilidad();
            obtenerAccesibilidad oA = new obtenerAccesibilidad();

            obtenerReusabilidad oR = new obtenerReusabilidad();


        %>


        <div id="seccion1">

            <div class="Formulario">

                <p style="text-align: justify;" class="tooltip" onmouseover="showTooltip()" onmouseout="hideTooltip()">
                    <a href="javascript:Direcciones('PopUpDireccionesR.html')"><font size="5" >
                        Para evaluar la reusabilidad del recurso de aprendizaje ingresa la dirección del WSDL
                        Del Servicio Web de Aprendizaje que lo retorna.
                    </a></font></p>


                <form class="tentrada"  method="Post" action="DesviadorServletR">
                    <input type="text" name="variableR1" class="from-control mt-3" placeholder="WSDL" style="width: 100%" required>
                    <br>
                    <input type="submit" class="btn btn-primary btn-block mt-3" value="Evaluar">

                </form>



                <p style="text-align: justify; margin-top: 250px;"><font size="4" ><a href="Panelderegistrosreusabilidad.jsp">Historicos de mediciones</a></font></p>

                <p style="text-align: justify;"><font size="4" ><a href="GraficaReusabilidad.jsp">Grafica Estadistica</a></font></p>


            </div>

        </div>


        <%              double reusabilidad2 = oR.ObtenerDatosReusabilidad1();
            double disponibilidad2 = oD.ObtenerDatosDisponibilidad1();
            double completitud2 = oC.ObtenerDatosCompletitud1();

        %>


        <%                double usabilidad1 = oU.ObtenerDatosUsabilidad1();
            double legibilidad1 = oL.ObtenerDatosLegibilidad1();
            double accesibilidad1 = oA.ObtenerDatosAccesibilidad1();

        %>


        <div id="seccion2">

            <table style=" " class="table5 ">
                <tr>
                    <th colspan="3"><br><a href="javascript:Abrir_ventana2('PopUpR.html')"><p><font size="5" >Reusabilidad</font></p></a></th>


                </tr>

                <tr>

                    <td colspan="2"><center><span style="font-size: 22.9px;"><%=String.format("%.4f", reusabilidad2)%>%</span></center></td> 


                </tr>

                <tr>

                    <th><br><a href="javascript:Abrir_ventana2('PopUpRDD.html')"><h3>Disponibilidad</h3></a></th>
                    <th><br><a href="javascript:Abrir_ventana2('PopUpRC.html')"><h3>Informatividad</h3></a></th>
                </tr>

                <tr>
                    <td><center><span style="font-size: 22.9px;"><%= String.format("%.4f", disponibilidad2)%>%</span></center></td> 
                <td><center><span style="font-size: 22.9px;"><%= String.format("%.4f", completitud2)%>%</span></center></td> 

                </tr>
            </table>



            <table  class="table3 ">
                <tr>
                    <th><br><a href="javascript:Abrir_ventana2('PopUpRDU.html')"><h3>Usabilidad</h3></a></th>
                    <th><br><a href="javascript:Abrir_ventana2('PopUpRDA.html')"><h3>Accesibilidad</h3></a></th>
                    <th><br><a href="javascript:Abrir_ventana2('PopUpRDL.html')"><h3>Legibilidad</h3></a></th>
                </tr>

                <tr>   
                    <td><center><span style="font-size: 22.9px;"><%= String.format("%.4f", usabilidad1)%>%</span></center></td> 
                <td><center><span style="font-size: 22.9px;"><%= String.format("%.4f", accesibilidad1)%>%</span></center></td> 
                <td><center><span style="font-size: 22.9px;"><%= String.format("%.4f", legibilidad1)%>%</span></center></td>

                </tr>
            </table>



        </div>

        <div id="seccion3">


            <table class="table">
                <tr>
                    <th colspan="3"><a href="javascript:Abrir_ventana2('PopUpRC.html')"><h3>Sub-Atributos en Informatividad</h3></a></th>
                </tr>

                <tr>
                    <td style="background-color: #ECECEC;"><span style="font-size: 22.9px; ">Escolariodad</span></td>
                    <td style="background-color: #ECECEC;"><span style="font-size: 22.9px; "><center>Dominio</center></span></td>
                    <td style="background-color: #ECECEC;"><span style="font-size: 22.9px; "><center>Tema</center></span></td>
                </tr>

                <tr>
                    <td><span style="font-size: 22.9px;"><%=i5%>%</span></td>
                    <td><span style="font-size: 22.9px;"><center><%=i4%>%</center></span></td>
                    <td><span style="font-size: 22.9px;"><center><%=i3%>%</center></span></td>
                </tr>

                <tr>
                    <th colspan="3"></th>

                </tr>


                <tr>
                    <td style="background-color: #ECECEC;"><center><span style="font-size: 22.9px;">Tipo de Contenido</span></center></td>
                <td colspan="2" style="background-color: #ECECEC;"><center><span style="font-size: 22.9px;">Descripción del servicio</span></center></td> 
                </tr>

                <tr>
                    <td><center><span style="font-size: 22.9px;"><%=i2%>%</span></center></td>
                <td colspan="2"><center><span style="font-size: 22.9px;"><%=i%>%</span></center></td>
                </tr>
            </table>



            <table class="table4">
                <tr>
                    <th colspan="3"><a href="javascript:Abrir_ventana2('PopUpRU.html')"><h3>Sub-Atributos en Legibilidad y Accesibilidad</h3></a></th>
                </tr>

                <tr>
                    <td style="background-color: #ECECEC;"><span style="font-size: 22.9px;">Orientacion del Texto</span></td>
                    <td style="background-color: #ECECEC;"><span style="font-size: 22.9px;"><center>Tamaño de Fuente</center></span></td>
                    <td style="background-color: #ECECEC;"><span style="font-size: 22.9px;"><center>Tipo de Fuente</center></span></td>
                </tr>

                <tr>
                    <td><span style="font-size: 22.9px;"><%=  String.format("%.4f", porcentajeA)%>%</span></td>
                    <td><span style="font-size: 22.9px;"><center><%= String.format("%.4f", porcentajeTM)%>%</center></span></td>
                    <td><span style="font-size: 22.9px;"><center><%= String.format("%.4f", porcentajeTL)%>%</center></span></td>
                </tr>

                <tr>
                    <th colspan="3"></th>

                </tr>


                <tr>
                    <td style="background-color: #ECECEC;"><center><span style="font-size: 22.9px;">Color de Fuente</span></center></td>
                <td colspan="2" style="background-color: #ECECEC;"><center><span style="font-size: 22.9px;">Color del Fondo</span></center></td> 
                </tr>

                <tr>
                    <td><center><span style="font-size: 22.9px;"><%= String.format("%.4f", porcentajeCFue)%>%</span></center></td>
                <td colspan="2"><center><span style="font-size: 22.9px;"><%= String.format("%.4f", porcentajeFO)%>%</span></center></td>
                </tr>
            </table>




        </div>
    </body>
</html>
