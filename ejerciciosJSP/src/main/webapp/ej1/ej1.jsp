<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 15/11/2024
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejercicio 1</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/ej1/ej1.css">
</head>
<body>
    <h1><%= "Ejercicio 1" %></h1>
    <br/>
    <h3><%= "Crea una aplicación web en Java que muestre tu nombre y tus datos personales por pantalla,<br/>" +
            "de tal forma que la apariencia de la página web que muestra el navegador luzca más bonita mediante<br/>" +
            "la utilización de CSS (utiliza siempre ficheros independientes para CSS para no mezclarlo con HTML)" %></h3>
    <a href="../index.jsp">Lista Ejercicios</a>

    <!--Comienzo Ejercicio 1-->

    <p id="personalData"><%= "Daniel Clavijo Núñez - dclanun0611@g.educaand.es" %></p>
</body>
</html>
