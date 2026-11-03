<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 16/11/2024
  Time: 0:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejercicio 4 Dólares</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/ej4/ej4Dolares.css">
</head>
<body>
    <%
        String parameterEuros = request.getParameter("precio");
        if (!parameterEuros.isEmpty()) {
            double dolares = Double.parseDouble(parameterEuros) * 1.05;
    %>
    <div>
        <h3><%= "Los " + parameterEuros + " € son " + dolares + " $."%></h3>
    </div>
    <% } else { %>
    <div>
        <h3><%= "No has introducido ningún valor"%></h3>
    </div>
    <% } %>

</body>
</html>
