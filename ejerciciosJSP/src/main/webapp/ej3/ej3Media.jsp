<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 15/11/2024
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejercicio 3 Media</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/ej3/ej3Media.css">
</head>
<body>

    <%
        String nota1 = request.getParameter("nota1"), nota2 = request.getParameter("nota2"), nota3 = request.getParameter("nota3");
        double media = 0;
        if (!nota1.isEmpty() && !nota2.isEmpty() && !nota3.isEmpty()) {
            double nota1DoubleValue = Double.parseDouble(nota1), nota2DoubleValue = Double.parseDouble(nota2), nota3DoubleValue = Double.parseDouble(nota3);
            media = (nota1DoubleValue+nota2DoubleValue+nota3DoubleValue)/3;
    %>
    <div>
        <h3><%= "La media de " + nota1 + ", " + nota2 + " y " + nota3 + " es igual a " + media %></h3>
    </div>
    <%
        } else {
    %>
    <div>
        <h3><%= "Se ha producido un error , rellena todos los parámetros con un valor." %></h3>
    </div>
    <% } %>

</body>
</html>
