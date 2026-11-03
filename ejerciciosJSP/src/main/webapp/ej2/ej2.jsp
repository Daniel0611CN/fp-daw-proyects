<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 15/11/2024
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejercicio 2</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/ej2/ej2.css">
</head>
<body>
    <h1><%= "Ejercicio 2" %></h1>
    <br/>
    <h3><%= "Escribe una aplicación que pida tu nombre y en la que puedas seleccionar que te salude en uno de tres idiomas:<br/>" +
            "Español, Portugués e Inglés. A continuación, mostrará “Hola” (en el idioma seleccionado) seguido del nombre introducido.<br/>" +
            "El nombre y el idioma se deben recoger mediante un formulario." %></h3>
    <a href="../index.jsp">Lista Ejercicios</a>

    <!--Comienzo Ejercicio 2-->
    <form method="post" action="ej2Traducir.jsp">
        <% out.println("<br><br>"); %>
        <input type="text" name="nombre" placeholder="Introduce tu nombre">
        <% out.println("<br><br>"); %>
        <input type="text" name="idioma" placeholder="Escoge un idioma (ES, PO, IN)">
        <% out.println("<br><br>"); %>
        <input type="submit" value="Traducir" id="btn">
    </form>
</body>
</html>
