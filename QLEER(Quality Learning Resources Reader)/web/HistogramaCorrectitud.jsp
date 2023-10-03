<%-- 
    Document   : HistogramaCorrectitud
    Created on : 21-may-2023, 21:37:22
    Author     : efcas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="controlesDBCorrectitud.obtenerCorrectitud"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    </head>
    <body>
    <center><h2>Distribución de los datos con respecto a Correctitud</h2></center>
        <%

            obtenerCorrectitud oC = new obtenerCorrectitud();

            ArrayList<Double> listaValores = oC.ObtenerCorrectitud2();
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

    <canvas id="barChart"></canvas>

    <script>
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
    </script>


</body>
</html>
