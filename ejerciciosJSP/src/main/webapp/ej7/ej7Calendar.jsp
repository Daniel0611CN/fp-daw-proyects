<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 16/11/2024
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejercicio 7 Calendario</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/ej7/ej7Caledar.css">
</head>
<body>
<%
    int year = Integer.parseInt(request.getParameter("año"));
    int month = Integer.parseInt(request.getParameter("mes")) - 1;

    if (month <= 11) {
    Calendar calendar = Calendar.getInstance();
    calendar.setFirstDayOfWeek(Calendar.MONDAY);
    calendar.set(year, month, 1);

    int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
    int spaces = (firstDayOfWeek == Calendar.SUNDAY) ? 6 : firstDayOfWeek - Calendar.MONDAY;

    int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    String[] days = {"L", "M", "X", "J", "V", "S", "D"};
%>
<div>
<h3>Calendario de <%= month + 1 %>/<%= year %></h3>
<table border="1">
    <tr>
        <% for (String day : days) { %>
        <th><%= day %></th>
        <% } %>
    </tr>
    <tr>
        <%
            for (int i = 0; i < spaces; i++) {
                out.print("<td></td>");
            }
            for (int day = 1; day <= daysInMonth; day++) {
                out.print("<td>" + day + "</td>");
                if ((spaces + day) % 7 == 0) {
                    out.print("</tr><tr>");
                }
            }
            int remainingCells = (spaces + daysInMonth) % 7;
            for (int i = 0; i < (7 - remainingCells) % 7; i++) {
                out.print("<td></td>");
            }
        %>
    </tr>
</table>
</div>
<% } else { %>
<div>
    <h3><%= "El mes introducido no es válido" %></h3>
</div>
<% } %>
</body>
</html>
