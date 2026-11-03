<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 15/11/2024
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejercicio 4</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/ej4/ej4.css">
</head>
<body>
    <h1><%= "Ejercicio 4" %></h1>
    <br/>
    <h3><%= "Realiza un conversor de dólares a euros." %></h3>
    <a href="../index.jsp">Lista Ejercicios</a>

    <!--Comienzo Ejercicio 4-->
    <form method="post" action="ej4Dolares.jsp">
        <% out.println("<br><br>"); %>
        <input type="number" name="precio" placeholder="Introduce un precio en Euros">
        <% out.println("<br><br>"); %>
        <input type="submit" value="Convertir a Dólares" id="btn">
    </form>

</body>
</html>
















