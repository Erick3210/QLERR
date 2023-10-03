<%-- 
    Document   : GráficaCorrelación2
    Created on : 11-jun-2023, 0:41:33
    Author     : efcas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="controlesDBReusabilidad.obtenerReusabilidad"%>
<%@page import="clienteDeServicios.Correlacion"%>
<%@page import="controlesDBLegibilidad.obtenerLegibilidad"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
        <script src="http://code.highcharts.com/highcharts.js"></script>
        <style>

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

            #titulo {
                background-color: #ccc;
                height: 50px;
                display: flex;
                align-items: center;
                justify-content: center;
            }

            #boton-container {
                position: relative;
                margin-left:auto;
            }


        </style>


        <script>
            function redirigir() {
                window.location.href = "Menu.jsp";
            }
        </script>

    </head>
    <body>

        <div id="titulo">
            <h1 style="margin-left:320px;">Correlacion Legibilidad -- Reusabilidad</h1>

            <button id="miBoton"  style="margin-left:280px;" onclick="redirigir()">SALIR</button>

        </div> 




        <%
            obtenerLegibilidad oL = new obtenerLegibilidad();
            obtenerReusabilidad oR = new obtenerReusabilidad();

            ArrayList<Double> datosY = oL.ObtenerLegibilidad2();
            ArrayList<Double> datosX = oR.ObtenerDatosReusabilidad2();

            if (datosY.size() == datosX.size()) {

                Correlacion cO = new Correlacion();
        %>




    <center><h3>Correlacion: <%= cO.ObtenerCorrelacion(oL.ObtenerLegibilidad2(), oR.ObtenerDatosReusabilidad2())%> </h3></center>

    <div id="chartContainer" style="width: 100%; height: 400px;"></div>

    <script>
        // Datos de reusabilidad
        var reusabilidadData = [
        <%
            int halfSize = (int) Math.ceil(datosX.size() / 2.0);
            for (int i = 0; i < halfSize; i++) {
                double datoX = datosX.get(i);
                out.print(datoX);
                if (i < halfSize - 1) {
                    out.print(",");
                }
            }
        %>
        ];

        // Datos de legibilidad
        var legibilidadData = [
        <%
            int halfSize2 = (int) Math.ceil(datosY.size() / 2.0);
            for (int i = 0; i < halfSize2; i++) {
                double datoY = datosY.get(i);
                out.print(datoY);
                if (i < halfSize2 - 1) {
                    out.print(",");
                }
            }
        %>
        ];

        // Crear el gráfico de dispersión
        Highcharts.chart('chartContainer', {
            chart: {
                type: 'scatter',
                zoomType: 'xy'
            },
            title: {
                text: 'Gráfico de Dispersión - Reusabilidad vs. Legibilidad'
            },
            xAxis: {
                title: {
                    text: 'CANTIDAD DE RECURSOS DE APRENDIZAJE EVALUADOS'
                }
            },
            yAxis: {
                title: {
                    text: 'NIVELES DE LEGIBILIDAD Y REUSABILIDAD'
                }
            },
            plotOptions: {
                scatter: {
                    marker: {
                        states: {
                            hover: {
                                enabled: false // Deshabilitar el cambio de color al pasar el mouse
                            }
                        }
                    }
                }
            },
            series: [{
                    name: 'Reusabilidad',
                    data: reusabilidadData,
                    marker: {
                        symbol: 'circle', // Usar forma de círculo para los puntos
                        radius: 5, // Tamaño de los puntos
                        fillColor: 'rgba(0, 0, 255, .5)', // Color de los puntos de reusabilidad (azul)
                        lineColor: 'rgba(0, 0, 255, 1)', // Color del borde de los puntos de reusabilidad (azul)
                        lineWidth: 1 // Grosor del borde de los puntos de reusabilidad
                    }
                }, {
                    name: 'Legibilidad',
                    data: legibilidadData,
                    marker: {
                        symbol: 'circle', // Usar forma de círculo para los puntos
                        radius: 5, // Tamaño de los puntos
                        fillColor: 'rgba(255, 0, 0, .5)', // Color de los puntos de legibilidad (rojo)
                        lineColor: 'rgba(255, 0, 0, 1)', // Color del borde de los puntos de legibilidad (rojo)
                        lineWidth: 1 // Grosor del borde de los puntos de legibilidad
                    }
                }]
        });
    </script>



    <%            } else {
    %>

    <br><!-- comment -->
    <br>
    <div id="banner" style="background-color: red; color: white; padding: 20px; text-align: center; font-size: 24px; font-weight: bold;">
        Los conjuntos de datos son desiguales
    </div>


    <% }%>
</body>
</html>
