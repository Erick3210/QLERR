<%-- 
    Document   : M_Legibilidad2
    Created on : 27-mar-2023, 12:23:27
    Author     : efcas
--%>

<%@page import="controlesDBLegibilidad.obtenerLegibilidad"%>
<%@page import="controlesDBLegibilidad.obtenerIdioma"%>
<%@page import="controlesDBLegibilidad.obtenerColorFondo"%>
<%@page import="controlesDBLegibilidad.obtenerTamFuente"%>
<%@page import="controlesDBLegibilidad.obtenerColorFuente"%>
<%@page import="controlesDBLegibilidad.obtenerFuentes"%>
<%@page import="controlesDBLegibilidad.obtenerAlineacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Prueba</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>

            .table {
                width: 100%;
                margin-top: 5px;
                border-collapse: collapse;
                text-align: center;
                background-color: #fff;
                color: #333;
                font-size: 0.1rem;
            }

            .table th,
            .table td {
                padding: 2px;
                border: 1px solid #ccc;
            }

            .table th {
                background-color: #D5D5D5;
                font-weight: bold;
                height: 3px;
            }



            .tableP {
                width: 100%;
                margin-top: -10px;
                border-collapse: collapse;
                text-align: center;
                background-color: #fff;
                color: #333;
                font-size: 0.1rem; /* Cambio en el tamaño de fuente */
            }

            .tableP th,
            .tableP td {
                padding: 1px; /* Reducción del padding */
                border: 0.5px solid #ccc; /* Reducción del borde */
            }

            .tableP th {
                background-color: #D5D5D5;
                font-weight: bold;
                height: 3px; /* Reducción de la altura del encabezado */
            }



            .tableM {
                width: 100%;
                margin-top: 80px;
                border-collapse: collapse;
                text-align: center;
                background-color: #fff;
                color: #333;
                font-size: 0.8rem;
            }

            .tableM th,
            .tableM td {
                padding: 2px;
                border: 1px solid #ccc;
            }

            .tableM th {
                background-color: #f2f2f2;
                font-weight: bold;
                height: 8px;
            }


            .tableU {
                width: 100%;
                margin-top: 50px;
                border-collapse: collapse;
                text-align: center;
                background-color: #fff;
                color: #333;
                font-size: 0.8rem;
            }

            .tableU th,
            .tableU td {
                padding: 2px;
                border: 1px solid #ccc;
            }

            .tableU th {
                background-color: #f2f2f2;
                font-weight: bold;
                height: 8px;
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
                height: 860px;
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
    </head>
    <body>
        <script type="text/javascript">
             function Direcciones(pagina) {
                var opciones = "toolbar=no, location=no, directories=no, status=yes, menubar=yes, scrollbars=no, resizable=yes, width=400, height=350, top=0, left=10";
                window.open(pagina, "", opciones);
            }
            function Abrir_ventana(pagina) {
                var opciones = "toolbar=no, location=no, directories=no, status=yes, menubar=yes, scrollbars=no, resizable=yes, width=1075, height=400, top=0, left=0";
                window.open(pagina, "", opciones);
            }
            function Abrir_ventana2(pagina) {
                var opciones = "toolbar=no, location=no, directories=no, status=yes, menubar=yes, scrollbars=no, resizable=yes, width=908, height=365, top=0, left=0";
                window.open(pagina, "", opciones);
            }
            function redirigir() {
                window.location.href = "Menu.jsp";
            }

        </script>


        <header>
            <img src="Cabecera2.PNG" alt="Cabecera de la página">
        </header>
        <div id="titulo">
            <h1>¡CALCULA LA LEGIBILIDAD DE TU RECURSO DE APRENDIZAJE!</h1>
            <div id="boton-container">
                <button id="miBoton"  onclick="redirigir()">SALIR</button>
            </div>
        </div>
        <div id="seccion1">

            <div class="Formulario">



                <p style="text-align: justify;" class="tooltip" onmouseover="showTooltip()" onmouseout="hideTooltip()">
                    <a href="javascript:Direcciones('PopUpDireccionesL.html')"><font size="5" >
                    Ingresa aqui la dirección local del
                    Recurso de Aprendizaje
                    (¡En formato PDF!)

                    </a></font></p>

                <form class="tentrada"  method="Post" action="guardarLServlet2">
                    <input type="text" name="variableRA1" class="from-control mt-3" placeholder="WSDL" style="width: 100%" required>
                    <br>
                    <input type="submit" class="btn btn-primary btn-block mt-3" value="Evaluar">

                </form>



                <p style="text-align: justify; margin-top: 250px;"><font size="4" ><a href="Panelderegistroslegibilidad.jsp">Historicos de mediciones</a></font></p>

                <p style="text-align: justify;"><font size="4" ><a href="GraficaLegibilidad.jsp">Grafica Estadistica</a></font></p>


            </div>

        </div>

        <%
            obtenerAlineacion oA = new obtenerAlineacion();

            double a1 = oA.ObtenerDatosAlineacion().get(oA.ObtenerDatosAlineacion().size() - 1);
            double a2 = oA.ObtenerDatosAlineacion().get(oA.ObtenerDatosAlineacion().size() - 2);
            double a3 = oA.ObtenerDatosAlineacion().get(oA.ObtenerDatosAlineacion().size() - 3);

            obtenerFuentes oF = new obtenerFuentes();

            double f1 = oF.ObtenerDatosFuentes().get(oF.ObtenerDatosFuentes().size() - 1);
            double f2 = oF.ObtenerDatosFuentes().get(oF.ObtenerDatosFuentes().size() - 2);
            double f3 = oF.ObtenerDatosFuentes().get(oF.ObtenerDatosFuentes().size() - 3);
            double f4 = oF.ObtenerDatosFuentes().get(oF.ObtenerDatosFuentes().size() - 4);

            obtenerColorFuente oCF = new obtenerColorFuente();

            double Cf1 = oCF.ObtenerDatosColorFuentes().get(oCF.ObtenerDatosColorFuentes().size() - 1);
            double Cf2 = oCF.ObtenerDatosColorFuentes().get(oCF.ObtenerDatosColorFuentes().size() - 2);
            double Cf3 = oCF.ObtenerDatosColorFuentes().get(oCF.ObtenerDatosColorFuentes().size() - 3);
            double Cf4 = oCF.ObtenerDatosColorFuentes().get(oCF.ObtenerDatosColorFuentes().size() - 4);
            double Cf5 = oCF.ObtenerDatosColorFuentes().get(oCF.ObtenerDatosColorFuentes().size() - 5);
            double Cf6 = oCF.ObtenerDatosColorFuentes().get(oCF.ObtenerDatosColorFuentes().size() - 6);

            obtenerTamFuente oTF = new obtenerTamFuente();

            double oTF1 = oTF.ObtenerDatosTamFuentes().get(oTF.ObtenerDatosTamFuentes().size() - 1);
            double oTF2 = oTF.ObtenerDatosTamFuentes().get(oTF.ObtenerDatosTamFuentes().size() - 2);
            double oTF3 = oTF.ObtenerDatosTamFuentes().get(oTF.ObtenerDatosTamFuentes().size() - 3);
            double oTF4 = oTF.ObtenerDatosTamFuentes().get(oTF.ObtenerDatosTamFuentes().size() - 4);
            double oTF5 = oTF.ObtenerDatosTamFuentes().get(oTF.ObtenerDatosTamFuentes().size() - 5);
            double oTF6 = oTF.ObtenerDatosTamFuentes().get(oTF.ObtenerDatosTamFuentes().size() - 6);

            obtenerColorFondo oCF2 = new obtenerColorFondo();

            double CF1 = oCF2.ObtenerDatosColorFondo().get(oCF2.ObtenerDatosColorFondo().size() - 1);
            double CF2 = oCF2.ObtenerDatosColorFondo().get(oCF2.ObtenerDatosColorFondo().size() - 2);
            double CF3 = oCF2.ObtenerDatosColorFondo().get(oCF2.ObtenerDatosColorFondo().size() - 3);

            obtenerIdioma i = new obtenerIdioma();
            double iT = i.ObtenerDatosIdioma().get(i.ObtenerDatosIdioma().size() - 1);
            double ii = i.ObtenerDatosIdioma().get(i.ObtenerDatosIdioma().size() - 2);
            double ie = i.ObtenerDatosIdioma().get(i.ObtenerDatosIdioma().size() - 3);
            double io = i.ObtenerDatosIdioma().get(i.ObtenerDatosIdioma().size() - 4);
        %>


        <%
            double tA = oA.ObtenerTotalAlineacion().get(oA.ObtenerTotalAlineacion().size() - 1);
            double tCF = oCF2.ObtenerTotalColorFondo().get(oCF2.ObtenerTotalColorFondo().size() - 1);
            double tCfue = oCF.ObtenerTotalColorFuentes().get(oCF.ObtenerTotalColorFuentes().size() - 1);
            double iTt = i.ObtenerTotalIdioma().get(i.ObtenerTotalIdioma().size() - 1);
            double Tt = oTF.ObtenerTotalTamFuentes().get(oTF.ObtenerTotalTamFuentes().size() - 1);
            double Tf = oF.ObtenerTotalFuentes().get(oF.ObtenerTotalFuentes().size() - 1);

            double porA = a2 / a1;
            double porF = (f4 + f3) / f1;
            double porCo = (Cf6 + Cf5 + Cf4 + Cf3) / f1;
            double porT = (oTF3 + oTF4) / oTF1;
            double porCF = CF3 / CF1;
            double pori = (ii + ie) / oTF1;

            obtenerLegibilidad Legibilidad = new obtenerLegibilidad();
        %>











        <div id="seccion2">

            <table style=" " class="tableM ">
                <tr>
                    <th colspan="3"><br><a href="javascript:Abrir_ventana('PopUpL.html')"><p><font size="5" >Legibilidad</font></p></a></th>


                </tr>

                <tr>


                    <td colspan="2"><center><span style="font-size: 22.9px;"><%= String.format("%.2f", Legibilidad.ObtenerLegibilidad1())%>%</span></center></td> 

                </tr>

                <tr>

                    <th><br><a href="javascript:Abrir_ventana2('PopUpLOT.html')"><p><font style="font-size: 23px;" >Orientacion del Texto</font></p></a></th>
                    <th><br><a href="javascript:Abrir_ventana2('PopUpLTL.html')"><p><font style="font-size: 23px;" >Tipo de Letra</font></p></a></th>
                </tr>

                <tr>
                    <td><center><span style="font-size: 22.9px;"><%= String.format("%.2f", tA)%>%</span></center></td> 
                <td><center><span style="font-size: 22.9px;"><%= String.format("%.2f", Tf)%>%</span></center></td> 

                </tr>
            </table>


            <table  class="tableU ">
                <tr>
                    <th><br><a href="javascript:Abrir_ventana2('PopUpLCF.html')"><p><font style="font-size: 23px;" >Color de la fuente</font></p></a></th>
                    <th><br><a href="javascript:Abrir_ventana2('PopUpLTF.html')"><p><font style="font-size: 23px;" >Tamaño de la fuente</font></p></a></th>

                </tr>

                <tr>   

                    <td><center><span style="font-size: 22.9px;"><%= String.format("%.2f", tCfue)%>%</span></center></td> 
                <td><center><span style="font-size: 22.9px;"><%= String.format("%.2f", Tt)%>%</span></center></td> 


                </tr>

                <tr>

                    <th><br><a href="javascript:Abrir_ventana2('PopUpLCFO.html')"><p><font style="font-size: 23px;" >Color de fondo</font></p></a></th>
                    <th><br><a href="javascript:Abrir_ventana2('PopUpRDL.html')"><p><font style="font-size: 23px;" >Idioma</font></p></a></th>
                </tr>

                <tr>     

                    <td><center><span style="font-size: 22.9px;"><%= String.format("%.2f", tCF)%>%</span></center></td> 
                <td><center><span style="font-size: 22.9px;"><%= String.format("%.2f", iTt)%>%</span></center></td> 

                </tr>
            </table>



        </div>

        <div id="seccion3">


            <table style=" " class="tableP">
                <tr>
                    <th colspan="5"><br><a href="javascript:Abrir_ventana2('PopUpR.html')"><p><font  style="font-size: 23px;" > Orientacion del Texto </font></p></a></th>


                </tr>

                <tr>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Porcentaje  Obtenido</p></td>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Parrafos Adentro</p></td>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Total de Parrafos</p></td>


                </tr>

                <tr>
                    <td ><center><span style="font-size: 20px; color: #0008B4; font-weight: 700;"> <%= String.format("%.4f", porA)%>%</span></center></td> 
                <td><center><span style="font-size: 20px;"> <%=a2%></span></center></td> 
                <td><center><span style="font-size: 20px;"> <%=a1%></span></center></td>

                </tr>

            </table>

            <table style=" " class="table ">
                <tr>
                    <th colspan="5"><br><a href="javascript:Abrir_ventana2('PopUpR.html')"><p><font style="font-size: 23px;" >Tipo de Letra </font></p></a></th>


                </tr>

                <tr>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Porcentaje Obtenido</p></td>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Fuentes en Arial</p></td>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Fuentes en Times Roman</p></td>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Total de Palabras</p></td>

                </tr>
                <tr>
                    <td><center><span style="font-size: 20px; color: #0008B4; font-weight: 700;"><%= String.format("%.4f", porF)%>%</span></center></td> 
                <td><center><span style="font-size: 20px;"><%=f3%></span></center></td> 
                <td><center><span style="font-size: 20px;"><%=f4%></span></center></td> 
                <td><center><span style="font-size: 20px;"><%=f1%></span></center></td> 

                </tr>

            </table>

            <table style=" " class="table ">
                <tr>
                    <th colspan="6"><br><a href="javascript:Abrir_ventana2('PopUpR.html')"><p><font style="font-size: 23px;" > Color de la fuente </font></p></a></th>


                </tr>
                <tr>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Porcentaje Obtenido</p></td>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Palabras en color Negro</p></td>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Palabras en color Azul</p></td>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Palabras en color Rojo</p></td>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Palabras en color Verde</p></td>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Total de Palabras</p></td>

                </tr>
                <tr>

                    <td style=" color: #0008B4; font-weight: 700;"><center><span style="font-size: 20px;"><%= String.format("%.4f", porCo)%>%</span></center></td> 
                <td><center><span style="font-size: 20px;"><%=Cf6%></span></center></td> 
                <td><center><span style="font-size: 20px;"><%=Cf4%></span></center></td> 
                <td><center><span style="font-size: 20px;"><%=Cf3%></span></center></td> 
                <td><center><span style="font-size: 20px;"><%=Cf5%></span></center></td> 
                <td><center><span style="font-size: 20px;"><%=f1%></span></center></td> 

                </tr>

            </table>


            <table style=" " class="table ">
                <tr>
                    <th colspan="6"><br><a href="javascript:Abrir_ventana2('PopUpR.html')"><p><font style="font-size: 23px;" > Tamaño de la fuente </font></p></a></th>


                </tr>

                <tr>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Porcentaje Obtenido</p></td>

                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Tamaño de 10 a 13</p></td>
                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Tamaño de 14 a 17</p></td>

                    <td style="text-align: center; font-size: 20px; background-color: #ECECEC;"><p>Total de Palabras</p></td>

                </tr>

                <tr>
                    <td style=" color: #0008B4; font-weight: 700;"><center><span style="font-size: 20px;"><%= String.format("%.4f", porT)%>%</span></center></td> 

                <td><center><span style="font-size: 20px;"><%=oTF4%></span></center></td> 
                <td><center><span style="font-size: 20px;"><%=oTF3%></span></center></td> 

                <td><center><span style="font-size: 20px;"><%=oTF1%></span></center></td> 

                </tr>

            </table>

            <table style=" " class="table ">
                <tr>
                    <th colspan="5"><br><a href="javascript:Abrir_ventana2('PopUpR.html')"><p><font style="font-size: 23px;" >Color de fondo</font></p></a></th>


                </tr>
                <tr>
                    <td style="background-color: #ECECEC;"><br><p><font size="4" > Porcentaje Obtenido </font></p></td>
                    <td style="background-color: #ECECEC;"><br><p><font size="4" > Fondos Blancos</font></p></td>
                    <td style="background-color: #ECECEC;"><br><p><font size="4" >Total de Fondos</font></p></td>
                </tr>
                <tr>

                    <td style=" color: #0008B4; font-weight: 700;"><center><span style="font-size: 20px;"><%= String.format("%.4f", porCF)%>%</span></center></td> 
                <td><center><span style="font-size: 20px;"><%=CF3%></span></center></td> 
                <td><center><span style="font-size: 20px;"><%=CF1%></span></center></td>

                </tr>

            </table>


            <table style=" " class="table ">
                <tr>
                    <th colspan="5"><br><a href="javascript:Abrir_ventana2('PopUpR.html')"><p><font style="font-size: 23px;" >Idioma</font></p></a></th>


                </tr>
                <tr>
                    <td style="background-color: #ECECEC;"><center><span style="font-size: 20px;">Porcentaje Obtenido</span></center></td>
                <td style="background-color: #ECECEC;"><center><span style="font-size: 20px;">Español</span></center></td>
                <td style="background-color: #ECECEC;"><center><span style="font-size: 20px;">Inglés</span></center></td>
                <td style="background-color: #ECECEC;"><center><span style="font-size: 20px;">Total de palabras</span></center></td>

                </tr>
                <tr>

                    <td style=" color: #0008B4; font-weight: 700;"><center><span style="font-size: 20px;"><%= String.format("%.4f", pori)%>%</span></center></td> 
                <td><center><span style="font-size: 20px;"><%=ie%></span></center></td> 
                <td><center><span style="font-size: 20px;"><%=ii%></span></center></td>
                <td><center><span style="font-size: 20px;"><%=oTF1%></span></center></td>  

                </tr>

            </table>


        </div>
    </body>
</html>
