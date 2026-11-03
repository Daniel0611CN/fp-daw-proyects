<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 12/12/2024
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listado Usuarios Administrador</title>
    <!-- Enlace a Bootstrap CSS -->
    <link rel="stylesheet" href="css/styles.css">
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-rbsA2VBKQF3BYTzO2jK8IDgf4M1A5s/p+h7U1z2imQs1lPcXvFiVfS7Go9fyk5Y2"
            crossorigin="anonymous">
    <style>
        /* Estilo para dividir el ancho de las columnas en 50% */
        .table th, .table td {
            width: 50%; /* Asegura que las columnas se repartan 50% y 50% */
            text-align: center; /* Centra el texto dentro de cada celda */
        }
    </style>
</head>
<body>
<div class="container my-5">
    <h1 class="text-center mb-4">Listado de Usuarios Administrador</h1>
    <%
        // CARGA DEL DRIVER Y CONEXIÓN CON LA BBDD
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "root");

        // UTILIZAR STATEMENT SÓLO EN QUERIES NO PARAMETRIZADAS.
        Statement s = conexion.createStatement();
        ResultSet listado = s.executeQuery("SELECT * FROM users.usuarios");
    %>
    <div>
        <form method="get" action="GrabarUsuariosServlet">
            <input class="btn btn-primary" type="submit" value="Crear Usuario">
        </form>
    </div>
    <br>
    <table class="table table-bordered table-striped">
        <thead class="table-dark">
        <tr>
            <th>Nombre</th>
            <th>Contraseña</th>
            <th>Editar</th>
            <th>Borrar</th>
        </tr>
        </thead>
        <tbody>
        <%
            while (listado.next()) {
        %>
        <tr>
            <td><%= listado.getString("nombreUsuario") %></td>
            <td><%= listado.getString("pswdUsuario") %></td>
            <td>
                <form class="d-inline" method="get" action="EditarUsuariosServlet">
                    <input type="hidden" name="idUsuario" value="<%= listado.getInt("idUsuario") %>"/>
                    <input type="hidden" name="nombreUsuarioEditar" value="<%= listado.getString("nombreUsuario") %>"/>
                    <input type="hidden" name="pswdUsuarioEditar" value="<%= listado.getString("pswdUsuario") %>" />
                    <input class="btn btn-primary"  type="submit" value="Editar">
                </form>
            </td>
            <td>
                <form class="d-inline" method="post" action="BorrarUsuariosServlet">
                    <input type="hidden" name="idUsuario" value="<%= listado.getInt("idUsuario") %>"/>
                    <input class="btn btn-primary"  type="submit" value="Borrar">
                </form>
            </td>
        </tr>
        <%
            }
            listado.close();
            s.close();
            conexion.close();
        %>
        </tbody>
    </table>
</div>
<div style="display: flex; justify-content: center; align-items: center; height: 100px;">
    <button>
        <a href="index.jsp">Volver a Inicio</a>
    </button>
</div>

<!-- Bootstrap JS (opcional, para funcionalidad como dropdowns o modals) -->
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-EI4QK3KCz0irE4LVGFgZihhWlnf2Gpjm8xxlfNfw4Z6hLbprOsKGkdki9b9UPznn"
        crossorigin="anonymous"></script>
</body>
</html>

