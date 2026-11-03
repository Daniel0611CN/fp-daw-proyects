<%@ page import="java.math.BigDecimal" %>
<%@ page import="java.math.RoundingMode" %><%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 16/11/2024
  Time: 0:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejercicio 5 Ecuación</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/ej5/ej5Ecuación.css">
</head>
<body>
    <%
        String a = request.getParameter("a");
        String b = request.getParameter("b");
        String c = request.getParameter("c");
        if (!request.getParameter("a").isEmpty() && !request.getParameter("b").isEmpty() && !request.getParameter("c").isEmpty()) {
            double a2 = Double.parseDouble(a);
            double b2 = Double.parseDouble(b);
            double c2 = Double.parseDouble(c);

            double contentSQRT = (Math.pow(b2, 2) - 4*a2*c2);
            double SQRT = (Math.sqrt(contentSQRT));

            if (contentSQRT > 0) {

                BigDecimal result1 = BigDecimal.valueOf(-b2+SQRT)
                        .divide(BigDecimal.TWO.multiply(BigDecimal.valueOf(a2))).setScale(4, RoundingMode.HALF_EVEN);
                BigDecimal result2 = BigDecimal.valueOf(-b2-SQRT)
                        .divide(BigDecimal.TWO.multiply(BigDecimal.valueOf(a2))).setScale(4, RoundingMode.HALF_EVEN);
    %>
    <div>
        <h3><%= "El resultado de la ecuación 1 es: " + result1 + " | El resultado de la ecuación 2 es: " + result2 %></h3>
    </div>
    <%
        } else {
    %>
    <div>
        <h3><%= "La ecuación no tiene solución" %></h3>
    </div>
    <%
        }}
        else {
    %>
    <div>
        <h3><%= "Los parámetros de la ecuación están vacíos" %></h3>
    </div>
    <% } %>
</body>
</html>

<!--

-->