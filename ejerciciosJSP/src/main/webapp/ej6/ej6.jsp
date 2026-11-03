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
    <title>Ejercicio 6</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/ej6/ej6.css">
</head>
<body>
    <h1><%= "Ejercicio 6" %></h1>
    <br/>
    <h3><%= "Realiza una aplicación que pida un número y que luego muestre la tabla de multiplicar de ese número.<br/>" +
            "El resultado se debe mostrar en una tabla ('table' en HTML)." %></h3>
    <a href="../index.jsp">Lista Ejercicios</a>

   <!--Comienzo Ejercicio 6-->
    <form method="post" action="ej6Tabla.jsp">
        <% out.println("<br><br>"); %>
        <input type="number" name="numero" placeholder="Introduzca un número">
        <% out.println("<br><br>"); %>
        <input type="submit" value="Calcular Tabla" id="btn">
    </form>
</body>
</html>
