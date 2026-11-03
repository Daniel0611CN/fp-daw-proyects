<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 15/11/2024
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejercicio 2 Traducir</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/ej2/ej2Traducir.css">
</head>
<body>
    <%
        String nombre = request.getParameter("nombre");
        String idioma = request.getParameter("idioma");
        String nombreES = "Hola " + nombre;
        String nombrePO = "Óla " + nombre;
        String nombreIN = "Hello " + nombre;

        if (!idioma.isEmpty() && !nombre.isEmpty()) {
            if (idioma.equalsIgnoreCase("es")) {
    %>
        <div>
            <h3><%= nombreES %></h3>
        </div>
    <% } else if (idioma.equalsIgnoreCase("po")) { %>
        <div>
            <h3><%= nombrePO %></h3>
        </div>
    <% } else if (idioma.equalsIgnoreCase("in")) { %>
        <div>
            <h3><%= nombreIN %></h3>
        </div>
    <% } else { %>
        <div>
            <h3><%= "Has introducido un idioma no válido" %></h3>
        </div>
    <% }} else { %>
        <div>
            <h3><%= "Debes rellenar todos los parámetros" %></h3>
        </div>
    <% } %>
</body>
</html>