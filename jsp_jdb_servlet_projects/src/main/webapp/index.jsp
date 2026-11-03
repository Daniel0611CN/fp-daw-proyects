<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP - Hello World</title>
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

        /* Contenedor del formulario */
        .form-container {
            max-width: 400px;
            margin: 0 auto;
            padding: 30px;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            background-color: #f9f9f9; /* Fondo claro */
        }

        /* Título */
        .form-container h1 {
            text-align: center;
            margin-bottom: 20px;
            font-size: 24px;
            color: #333;
        }

        /* Botón de aceptar */
        .btn-custom {
            background-color: #007bff; /* Azul personalizado */
            color: white;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
            width: 100%;
        }

        .btn-custom:hover {
            background-color: #0056b3; /* Azul más oscuro */
        }

        /* Estilo para el botón de listar usuarios */
        .btn-secondary-custom {
            background-color: #6c757d;
            color: white;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .btn-secondary-custom:hover {
            background-color: #5a6268; /* Gris más oscuro */
        }

        /* Enlace dentro del botón */
        .form-container button a {
            text-decoration: none;
            color: white;
        }

        .form-container button a:hover {
            color: white;
        }

        /* Estilos adicionales para el espacio */
        .mt-3 {
            margin-top: 20px;
        }

    </style>
</head>
<body>
<div class="container my-5">
    <div class="form-container">
        <h1>Hello World!</h1>
        <form method="post" action="ValidarDatosUsuarios">
            <div class="mb-3">
                <label for="nombre" class="form-label">Nombre</label>
                <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Introduzca el nombre">
            </div>
            <br>
            <div class="mb-3">
                <label for="pswd" class="form-label">Contraseña</label>
                <input type="password" class="form-control" id="pswd" name="pswd" placeholder="Introduzca la contraseña">
            </div>
            <br>
            <button type="submit" class="btn btn-custom">Aceptar</button>
        </form>
        <br>
        <div class="d-flex justify-content-center mt-3">
            <button class="btn-secondary-custom">
                <a href="ListarDatosUsuarios">Listar Usuarios</a>
            </button>
        </div>
    </div>
</div>

<!-- Bootstrap JS (opcional, para funcionalidades como dropdowns o modals) -->
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-EI4QK3KCz0irE4LVGFgZihhWlnf2Gpjm8xxlfNfw4Z6hLbprOsKGkdki9b9UPznn"
        crossorigin="anonymous"></script>
</body>
</html>
