<%-- 
    Document   : Extension
    Created on : 08-sep-2023, 19:16:17
    Author     : efcas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <style>
        /* Estilo para centrar el formulario y aplicar un color azul pastel */
        body {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #add8e6; /* Azul pastel */
            margin: 0;
        }
        form {
            text-align: center;
            padding: 20px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }
        /* Estilo para el div */
        div {
            margin-top: 20px; /* Agrega espacio entre el formulario y el div */
            background-color: #f0f0f0;
            padding: 10px;
            border-radius: 5px;
            text-align: center;
        }
    </style>
</head>
<body>
    <form action="ServExt" method="GET">

        <h2>INGRESA LA URL DE LOS RECURSOS A CONSUMIR</h2>
        <label for="parametro1">URL:</label>
        <input type="text" name="URL" id="URL" required>
        <br>
        <br>

        <button type="submit">Consumir Recurso</button>
    </form>

    <div>
        <tr>
            <td><font size="4"><%= request.getAttribute("apiResult") %></font></td>
        </tr>
    </div>
</body>
</html>