<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 26/11/2024
  Time: 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    .tarrina {
        width: 150px;
        height: 200px;
        display: flex;
        flex-direction: column;
        justify-content: flex-end;
        border-left: 2px solid darkred;
        border-right: 2px solid darkred;
        border-bottom: 2px solid darkred;
        border-radius: 0 0 5px 5px;
        overflow: hidden;
        background-color: white;
    }

    .sabor-1 {
        background-color: #54341d;
    }
    .sabor-2 {
        background-color: #eaadd7;
    }
    .sabor-3 {
        background-color: #f5d991;
    }
</style>
<body>
    <h4>Aquí esta tu helado</h4>
    <%
        int chocolate = Integer.parseInt(request.getParameter("PorcChoco"));
        int fresa = Integer.parseInt(request.getParameter("PorcFresa"));
        int vainilla = Integer.parseInt(request.getParameter("PorcVainilla"));
        if (chocolate+fresa+vainilla<=100) {
    %>
    <div class="tarrina">
        <div class="sabor-1" style="height: <%= chocolate %>%;"></div>
        <div class="sabor-2" style="height: <%= fresa %>%;"></div>
        <div class="sabor-3" style="height: <%= vainilla %>%"></div>
    </div>
    <% } else { %>
    <h3>La suma de los porcentajes debe ser menor o igual que 100. Por favor, introduzca de nuevo los porcentajes.</h3>
    <% } %>
</body>
</html>
