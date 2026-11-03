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
<h1>Pasando una cadena de caracteres</h1>
<form method="post" action="respuesta/frase.jsp">
    Introduzca el nombre de una fruta:
    <input type="text" name="cadena">
    <input type="submit" value="Enviar">
</form>
</body>
</html>
