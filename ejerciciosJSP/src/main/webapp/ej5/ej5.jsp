<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 15/11/2024
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejercicio 5</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/ej5/ej5.css">
</head>
<body>
    <h1><%= "Ejercicio 5" %></h1>
    <br/>
    <h3><%= "Realiza una aplicación que solucione la ecuación de 2º grado, utiliza operaciones BigDecimal." %></h3>
    <a href="../index.jsp">Lista Ejercicios</a>

    <!--Comienzo Ejercicio 5-->
    <form method="post" action="ej5Ecuación.jsp">
        <% out.println("<br><br>"); %>
        <input type="number" name="a" placeholder="Introduce el parámetro a">
        <% out.println("<br><br>"); %>
        <input type="number" name="b" placeholder="Introduce el parámetro b">
        <% out.println("<br><br>"); %>
        <input type="number" name="c" placeholder="Introduce el parámetro c">
        <% out.println("<br><br>"); %>
        <input type="submit" value="Calcular Ecuación" id="btn">
    </form>
</body>
</html>
