<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 15/11/2024
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejercicio 7</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/ej7/ej7.css">
</head>
<body>
    <h1><%= "Ejercicio 7" %></h1>
    <br/>
    <h3><%= "Escribe una aplicación que genere el calendario para un mes. Se pedirá el nombre del mes, el año.<br/>" +
            "El programa debe deducir estos datos del mes y el año. Pista: puedes usar la clase Calendar (java.util.Calendar)." %></h3>
    <a href="../index.jsp">Lista Ejercicios</a>

    <!--Comienzo Ejercicio 7-->

    <form method="post" action="ej7Calendar.jsp">
        <% out.println("<br><br>"); %>
        <input type="text" name="mes" placeholder="Introduce un mes">
        <% out.println("<br><br>"); %>
        <input type="text" name="año" placeholder="Introduce un año">
        <% out.println("<br><br>"); %>
        <input type="submit" value="Mostrar Calendario" id="btn">
    </form>

</body>
</html>
