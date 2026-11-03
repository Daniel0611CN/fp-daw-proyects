<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 15/11/2024
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Paso de cadena</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
Me gusta mucho comer
<% out.print(request.getParameter("cadena"));%>
</body>
</html>