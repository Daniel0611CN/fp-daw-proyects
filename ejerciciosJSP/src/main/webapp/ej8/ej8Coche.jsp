<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 16/11/2024
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejercicio 8 Coche</title>
</head>
<body>
<%
    String[] tapicerias = request.getParameterValues("tapiceria");
    String[] molduras = request.getParameterValues("moldura");
    String aux1 = "", aux2 = "";

    if (tapicerias != null && tapicerias.length == 1) {
        out.println("Opción de tapicería:<br>");
        for (String opcion : tapicerias) {
            out.println("- " + opcion + "<br>");
            aux1 = opcion;
        }
    } else if (tapicerias == null) {
        out.println("No se ha marcado ninguna opción de tapicería. <br>");
    } else {
        out.println("Has marcado más de una opción para las tapicerías. <br>");
    }

    if (molduras != null && molduras.length == 1) {
        out.println("Opción de moldura:<br>");
        for (String opcion : molduras) {
            out.println("- " + opcion + "<br>");
            aux2 = opcion;
        }
    } else if (molduras == null) {
        out.println("No se ha marcado ninguna opción de moldura.");
    } else {
        out.println("Has marcado más de una opción para las molduras.");
    }

    // -----------------------------------------------------------------

    if (aux1.equals("blanco") && aux2.equals("madera")) {
%>
    <img src="../images/Imagen 1.jpeg" width="400px">
<% } else if (aux1.equals("blanco") && aux2.equals("carbono")) { %>
    <img src="../images/Imagen 2.png" width="400px">
<% } else if (aux1.equals("negro") && aux2.equals("madera")) { %>
    <img src="../images/Imagen 3.png" width="400px">
<% } else if (aux1.equals("negro") && aux2.equals("carbono")) { %>
    <img src="../images/Imagen 4.png" width="400px">
<% } else if (aux1.equals("berenjena") && aux2.equals("madera")) { %>
    <img src="../images/Imagen 5.png" width="400px">
<% } else if (aux1.equals("berenjena") && aux2.equals("carbono")) { %>
    <img src="../images/Imagen 6.png" width="400px">
<% } %>
</body>
</html>
