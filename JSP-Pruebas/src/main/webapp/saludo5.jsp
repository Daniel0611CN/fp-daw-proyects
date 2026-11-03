<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 11/11/2024
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        for ( int i = 1; i < 7; i++) {

            out.println("<h" + (7-i) + ">");
    %>
    <i>
        <%= i %>
    </i>
    <%
            out.println("</h" + (7-i) + ">");
        }
    %>
</body>
</html>
