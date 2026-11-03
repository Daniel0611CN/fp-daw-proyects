<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 15/11/2024
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejercicio 8</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/ej8/ej8.css">
</head>
<body>
    <h1><%= "Ejercicio 8" %></h1>
    <br/>
    <h3><%= "Realiza un configurador del interior de un vehículo. El usuario puede elegir, mediante un formulario,<br>" +
            "el color de la tapicería – blanco, negro o berenjena - y el material de las molduras – madera o carbono. <br>" +
            "Se debe mostrar el interior del coche tal y como lo quiere el usuario." %></h3>
    <a href="../index.jsp">Lista Ejercicios</a>

    <!--Comienzo Ejercicio 8-->

    <form method="post" action="ej8Coche.jsp">
        <% out.println("<br>Elige un color para la tapicería: <br>"); %>
        <label><input type="checkbox" name="tapiceria" value="blanco"> Blanco </label><br>
        <label><input type="checkbox" name="tapiceria" value="negro"> Negro </label><br>
        <label><input type="checkbox" name="tapiceria" value="berenjena"> Berenjena </label><br>
        <% out.println("<br>Elige un material para las molduras: <br>"); %>
        <label><input type="checkbox" name="moldura" value="madera"> Madera </label><br>
        <label><input type="checkbox" name="moldura" value="carbono"> Carbono </label><br>
        <% out.println("<br>"); %>
        <input type="submit" value="Mostrar Interior" id="btn">
    </form>

</body>
</html>
