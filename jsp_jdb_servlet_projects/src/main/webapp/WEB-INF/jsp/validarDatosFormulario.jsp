<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Validar Datos Formulario</title>
    <!-- Enlace a Bootstrap CSS -->
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-rbsA2VBKQF3BYTzO2jK8IDgf4M1A5s/p+h7U1z2imQs1lPcXvFiVfS7Go9fyk5Y2"
            crossorigin="anonymous">
    <style>
        * {
            font-family: sans-serif;
        }

        a {
            color: white;
            text-decoration-line: none;
        }

        .full-height {
            min-height: 100vh; /* Asegura que el contenedor ocupe toda la altura de la ventana */
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .center-content {
            text-align: center;
        }

        .btn-custom {
            background-color: #007bff; /* Azul personalizado */
            color: white;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 5px;
            transition: background-color 0.3s ease; /* Efecto de transición al pasar el mouse */
        }

        .btn-custom:hover {
            background-color: #0056b3; /* Azul más oscuro cuando se pasa el ratón */
        }
    </style>
</head>
<body>
<!-- Contenedor principal con clases para centrar contenido -->
<div class="container my-5 full-height">
    <div class="center-content">
        <%
            // CARGA DEL DRIVER Y CONEXIÓN CON LA BBDD
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "root");

            // UTILIZAR STATEMENT SÓLO EN QUERIES NO PARAMETRIZADAS.
            Statement s = conexion.createStatement();
            ResultSet listado = s.executeQuery("SELECT * FROM usuarios");

            boolean isInListado = false;

            while (listado.next()) {

                String nombreListado = listado.getString("nombreUsuario");
                String pswdListado = listado.getString("pswdUsuario");

                String nombreParam = request.getParameter("nombre");
                String pswdParam = request.getParameter("pswd");

                if (nombreParam.equals(nombreListado)
                && pswdParam.equals(pswdListado)
                && !nombreParam.equals("admin")) {
                    isInListado = true;
        %>
        <div class="alert alert-success text-center">
            <h3>Usuario <%= request.getParameter("nombre") %> ha iniciado sesión correctamente</h3>
        </div>

        <div class="text-center">
            <form method="post" action="FormularioPiramide">
                <input type="hidden" name="idUsuario" value="<%= listado.getString("idUsuario") %>">
                <input type="hidden" name="nombreUsuario" value="<%= nombreListado %>">
                <input type="hidden" name="pswdUsuario" value="<%= pswdListado %>">
                <!-- Botón estilizado -->
                <button type="submit" class="btn btn-custom">Formulario Piramide</button>
            </form>
        </div>
        <%
                } else if (nombreParam.equals(nombreListado)
                && pswdParam.equals(pswdListado)
                && nombreParam.equals("admin")) {
                    isInListado = true;
        %>
        <div class="alert alert-success text-center">
            <h3>Usuario <%= request.getParameter("nombre") %> ha iniciado sesión correctamente</h3>
        </div>

        <div class="text-center">
            <form method="post" action="FormularioPiramide">
                <input type="hidden" name="idUsuario" value="<%= listado.getString("idUsuario") %>">
                <input type="hidden" name="nombreUsuario" value="<%= nombreListado %>">
                <input type="hidden" name="pswdUsuario" value="<%= pswdListado %>">
                <!-- Botón estilizado -->
                <button type="submit" class="btn btn-custom">Formulario Piramide</button>
            </form>
        </div>

        <div class="text-center">
            <button class="btn btn-custom">
                <a href="ListarDatosAdministrador">Listar Datos Administrador</a>
            </button>
        </div>
        <%
                }
            }
            if (!isInListado) {
                response.sendRedirect("index.jsp");
            }

            listado.close();
            s.close();
            conexion.close();
        %>
    </div>
</div>

<!-- Bootstrap JS (opcional, para funcionalidades como dropdowns o modals) -->
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-EI4QK3KCz0irE4LVGFgZihhWlnf2Gpjm8xxlfNfw4Z6hLbprOsKGkdki9b9UPznn"
        crossorigin="anonymous"></script>
</body>
</html>
