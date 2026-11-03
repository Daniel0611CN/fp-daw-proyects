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
    <title>Ejercicio 10</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/ej10/ej10.css">
</head>
<body>
    <h1><%= "Ejercicio 10" %></h1>
    <br/>
    <h3><%= "\n" +
            "Implementa una aplicación de  máquina de helados . El usuario indica los porcentajes de helado de chocolate, de fresa y de vainilla.<br/>" +
            "Los porcentajes deben ser números comprendidos entre 0 y 100. Si los porcentajes suman más de 100, se debe dar un mensaje<br/>" +
            "al usuario que diga “La suma de los porcentajes debe ser menor o igual que 100. Por favor, introduzca de nuevo los porcentajes”.<br/>" +
            "En caso de que los porcentajes sean correctos, se mostrará la tarrina con los sabores adecuados y los tamaños bien dimensionados<br/>" +
            "según los porcentajes, tal y como se muestra en los ejemplos. Hay que tener en cuenta que si los sabores no suman el 100% de la tarrina,<br/>" +
            "se debe mostrar el hueco correspondiente. En caso de que no se incluya algún sabor (sabor al 0%),<br/>" +
            "no debe aparecer ninguna referencia a dicho sabor en la tarrina." %></h3>
    <a href="../index.jsp">Lista Ejercicios</a>

    <!--Comienzo Ejercicio 10-->

    <form method="post" action="ej10Heladeria.jsp">
        <img src="../images/img1.png">
        <% out.println("<br/>Chocolate: "); %>
        <input type="number" name="PorcChoco">
        <% out.println("<br/>"); %>
        <img src="../images/img2.png">
        <% out.println("<br/>Fresa: "); %>
        <input type="number" name="PorcFresa">
        <% out.println("<br/>"); %>
        <img src="../images/img3.png">
        <% out.println("<br/>Vainilla: "); %>
        <input type="number" name="PorcVainilla">
        <% out.println("<br/>"); %>
        <input type="submit" value="Preparar Helado">
    </form>

</body>
</html>
