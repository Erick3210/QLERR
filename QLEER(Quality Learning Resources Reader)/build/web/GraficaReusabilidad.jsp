<%-- 
    Document   : GraficaReusabilidad2
    Created on : 11-feb-2023, 9:29:05
    Author     : efcas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="controlesDBReusabilidad.obtenerReusabilidad"%>
<%@page import="clienteDeServicios.serviciosEstadisticosClienteReusabilidad"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    </head>
    <body>


        <%
            serviciosEstadisticosClienteReusabilidad mR = new serviciosEstadisticosClienteReusabilidad();

            obtenerReusabilidad oR = new obtenerReusabilidad();

            double recursoActual = oR.ObtenerDatosReusabilidad1();

            double media = mR.ObtenerMediaReusabilidad(oR.ObtenerDatosReusabilidad2());

            double rango = mR.ObtenerRangoReusabilidad(oR.ObtenerDatosReusabilidad2());

            double desviacionE = mR.ObtenerDesviacionEstandarReusabilidad(oR.ObtenerDatosReusabilidad2());

            double mediana = mR.ObtenerMedianaReusabilidad(oR.ObtenerDatosReusabilidad2());

            double moda = mR.ObtenerModaReusabilidad(oR.ObtenerDatosReusabilidad2());

            double varianza = mR.ObtenerVarianzaReusabilidad(oR.ObtenerDatosReusabilidad2());

            double curtosis = mR.ObtenerCurtosisReusabilidad(oR.ObtenerDatosReusabilidad2());

            ArrayList<Double> listaValores = oR.ObtenerDatosReusabilidad2();
            ArrayList<Double> rangoMenorA50 = new ArrayList<Double>();
            ArrayList<Double> rango50a60 = new ArrayList<Double>();
            ArrayList<Double> rango60a70 = new ArrayList<Double>();
            ArrayList<Double> rango70a80 = new ArrayList<Double>();
            ArrayList<Double> rango80a90 = new ArrayList<Double>();
            ArrayList<Double> rango90a100 = new ArrayList<Double>();

            for (Double valor : listaValores) {
                if (valor < 50) {
                    rangoMenorA50.add(valor);
                } else if (valor >= 50 && valor < 60) {
                    rango50a60.add(valor);
                } else if (valor >= 60 && valor < 70) {
                    rango60a70.add(valor);
                } else if (valor >= 70 && valor < 80) {
                    rango70a80.add(valor);
                } else if (valor >= 80 && valor < 90) {
                    rango80a90.add(valor);
                } else if (valor >= 90 && valor <= 100) {
                    rango90a100.add(valor);
                }
            }


        %>


        <div id="titulo">
            <h1 style="margin-left:320px;">Análisis estadístico referente a reusabilidad </h1>

            <button id="miBoton"  style="margin-left:280px;" onclick="redirigir()">SALIR</button>

        </div>    



        <h2>Distribucion de los datos:</h2>
        <font size="5px"><p style="text-align: justify;">En esta sección se muestra mediante un histograma la distribución de los datos historicos 
            correspondientes al atributo de reusabilidad, para ello se clasificó los datos en los siguientes rangos:
            <50, 50-60, 60-70, 70-80, 80-90, 90-100.</p></font>
        <canvas id="barChart"></canvas>


        <h2>Funciones estadisticas:</h2>
        <font size="5px"><p style="text-align: justify;">En esta sección se muestra mediante una gráfica de barras los resultados de las funciones estadisticas en relación
            a los datos de los 30 recursos de aprendizaje evaluados, para ello se utilizo un conjunto de operaciones como:
            Media, Mediana, Moda, Rango, Varianza, Desviación Estandar, Curtosis.</p></font>
        <canvas id="myChart"></canvas>

        

        <script>
            function redirigir() {
                window.location.href = "Menu.jsp";
            }




            // Función para crear la gráfica de barras
            function createBarChart() {
                var rangoLabels = ["<50", "50-60", "60-70", "70-80", "80-90", "90-100"];
                var rangoTamaños = [
            <%= rangoMenorA50.size()%>,
            <%= rango50a60.size()%>,
            <%= rango60a70.size()%>,
            <%= rango70a80.size()%>,
            <%= rango80a90.size()%>,
            <%= rango90a100.size()%>
                ];

                var ctx = document.getElementById('barChart').getContext('2d');
                var barChart = new Chart(ctx, {
                    type: 'bar',
                    data: {
                        labels: rangoLabels,
                        datasets: [
                            {
                                label: 'Tamaño de los rangos',
                                data: rangoTamaños,
                                backgroundColor: 'rgba(54, 162, 235, 0.5)',
                                borderColor: 'rgba(54, 162, 235, 1)',
                                borderWidth: 1,
                                barPercentage: 0.8,
                                categoryPercentage: 0.8
                            },
                            {
                                label: 'Tamaño de los rangos (puntos)',
                                data: rangoTamaños,
                                backgroundColor: 'rgba(255, 99, 132, 0.5)',
                                borderColor: 'rgba(255, 99, 132, 1)',
                                borderWidth: 1,
                                pointBackgroundColor: 'rgba(255, 99, 132, 1)',
                                pointBorderColor: '#fff',
                                pointRadius: 5,
                                pointHoverRadius: 5,
                                type: 'line',
                                fill: false
                            }
                        ]
                    },
                    options: {
                        responsive: true,
                        scales: {
                            x: {
                                title: {
                                    display: true,
                                    text: 'Rango'
                                }
                            },
                            y: {
                                title: {
                                    display: true,
                                    text: 'Tamaño'
                                },
                                beginAtZero: true
                            }
                        }
                    }
                });
            }

            // Función para crear la gráfica de barras
            function createLineChart() {
                const ctx = document.getElementById("myChart").getContext("2d");
                ctx.font = "40px Arial";
                ctx.fillText("Bienvenido al canvas de HTML", 50, 100);
                const chart = new Chart(ctx, {
                    type: "bar",
                    data: {
                        labels: ["Media", "Mediana", "Moda", "Rango", "Varianza", "Desviacion Estandar", "Curtosis"],
                        datasets: [
                            {
                                label: " ",
                                data: [<%= media%>, <%= mediana%>, <%= moda%>, <%= rango%>, <%= varianza%>, <%= desviacionE%>, <%= curtosis%>],
                                backgroundColor: [
                                    "rgba(54, 162, 235, 0.2)",
                                    "rgba(54, 162, 235, 0.2)",
                                    "rgba(54, 162, 235, 0.2)",
                                    "rgba(54, 162, 235, 0.2)",
                                    "rgba(54, 162, 235, 0.2)",
                                    "rgba(54, 162, 235, 0.2)",
                                    "rgba(54, 162, 235, 0.2)"
                                ],
                                borderColor: [
                                    "rgba(54, 162, 235, 1)",
                                    "rgba(54, 162, 235, 1)",
                                    "rgba(54, 162, 235, 1)",
                                    "rgba(54, 162, 235, 1)",
                                    "rgba(54, 162, 235, 1)",
                                    "rgba(54, 162, 235, 1)",
                                    "rgba(54, 162, 235, 1)"
                                ],
                                borderWidth: 2
                            }
                        ]
                    },
                    options: {
                        scales: {
                            yAxes: [
                                {
                                    ticks: {
                                        beginAtZero: true
                                    }
                                }
                            ]
                        }
                    }
                });
            }

           
            // Llamar a las funciones para crear las gráficas
            createLineChart();
            createBarChart();
     
          
        </script>




    </body>
</html>
