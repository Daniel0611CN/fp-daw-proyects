<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 12/12/2024
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulario Pirámide</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 300px;
            text-align: center;
        }

        h1 {
            color: #333;
            font-size: 24px;
            margin-bottom: 20px;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        input[type="submit"]:active {
            background-color: #388e3c;
        }

        .form-group {
            margin-bottom: 15px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Formulario Pirámide</h1>
    <form method="post" action="ConstruirPiramideGatos">
        <div class="form-group">
            <input type="hidden" name="idUsuario" value="<%= request.getParameter("idUsuario") %>">
            <input type="hidden" name="nombreUsuario" value="<%= request.getParameter("nombreUsuario") %>">
            <input type="hidden" name="pswdUsuario" value="<%= request.getParameter("pswdUsuario") %>">
        </div>
        <div class="form-group">
            <input type="text" name="altura" placeholder="Introduce la altura de la pirámide" required>
        </div>
        <div class="form-group">
            <input type="submit" name="btn" value="Enviar Datos Pirámide">
        </div>
    </form>
</div>
</body>
</html>
