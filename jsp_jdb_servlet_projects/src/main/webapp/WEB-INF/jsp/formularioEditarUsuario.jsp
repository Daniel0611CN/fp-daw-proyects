<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 15/12/2024
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario Editar Usuario</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <h1 class="text-center mb-4">Editar Usuario</h1>
            <form method="post" action="EditarUsuariosServlet" class="bg-light p-4 rounded shadow">
                <!-- Campo oculto para el ID del usuario -->
                <input type="hidden" name="idUsuario" value="<%= request.getParameter("idUsuario") %>">

                <div class="mb-3">
                    <label for="nombreUsuarioEditar" class="form-label">Nombre de Usuario</label>
                    <input type="text" class="form-control" id="nombreUsuarioEditar" name="nombreUsuarioEditar"
                           value="<%= request.getParameter("nombreUsuarioEditar") %>" required>
                </div>
                <div class="mb-3">
                    <label for="pswdUsuarioEditar" class="form-label">Contraseña</label>
                    <input type="password" class="form-control" id="pswdUsuarioEditar" name="pswdUsuarioEditar"
                           placeholder="Introduce una nueva contraseña" required>
                </div>
                <div class="d-grid">
                    <button type="submit" class="btn btn-success">Editar Usuario</button>
                </div>
            </form>
            <br><br>
            <div style="display:flex; justify-content: center; align-content: center;">
                <form action="ListarDatosAdministrador">
                    <button class="btn btn-primary" type="submit">Volver Atrás</button>
                </form>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS (opcional, para componentes interactivos como tooltips o modales) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
