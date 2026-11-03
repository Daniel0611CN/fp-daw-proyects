<%@ page import="java.sql.*" %>
<%@ page import="org.iesvdm.jsp_jdbc_servlet_projects.servlet.FormularioPiramide" %><%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 12/12/2024
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Piramide Gatos</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 20px;
            text-align: center;
            width: 80%;
            max-width: 100%;
            overflow-x: auto; /* Permite el desbordamiento horizontal si es necesario */
        }

        h1 {
            color: #333;
            font-size: 24px;
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .gato-img {
            margin: 5px;
            width: 50px;  /* Mantiene un tamaño fijo para las imágenes */
            height: 50px;
            display: inline-block; /* Esto hace que las imágenes se alineen en línea */
        }

        .back-button {
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            text-decoration: none;
            display: inline-block;
        }

        .back-button:hover {
            background-color: #0056b3;
        }

        .back-button:focus {
            outline: none;
        }

        .gato-row {
            white-space: nowrap; /* Evita que las imágenes se ajusten automáticamente */
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Pirámide de Gatos</h1>
    <%
        if (!request.getParameter("altura").isEmpty()) {
            int altura = Integer.parseInt(request.getParameter("altura"));
            int contador = 0;
            for (int i = 0; i < altura; i++) {
                // Generar los espacios para centrar los gatos usando &nbsp;
                String aux = "";
                for (int j = 0; j < altura - contador - 1; j++) {
                    aux += "&nbsp;"; // Espacios antes de los gatos
                }

                // Imprimir los espacios seguidos por los gatos
                out.print(aux); // Espacios iniciales

                // Imprimir los gatos en la fila
                out.print("<div class='gato-row'>"); // Contenedor para los gatos en la fila
                for (int j = 0; j < contador * 2 + 1; j++) {
                    out.print("<img src='img/gatoIMG.png' class='gato-img' />");
                }
                out.print("</div>"); // Fin del contenedor de la fila
                out.print("<br/>");
                contador++;
            }
        } else {
            response.sendRedirect("index.jsp");
        }

        if (!request.getParameter("nombreUsuario").equals("admin")) {
    %>
        <!-- Botón de volver a inicio -->
        <div>
            <a href="index.jsp" class="back-button">Volver a Inicio</a>
        </div>
    <%
        } else if (request.getParameter("nombreUsuario").equals("admin")) {
    %>
        <!-- Botón de volver a inicio -->
        <div>
            <a href="ListarDatosAdministrador" class="back-button">Listar Datos Administrador</a>
        </div>
    <%
        }
    %>
</div>
</body>
</html>
