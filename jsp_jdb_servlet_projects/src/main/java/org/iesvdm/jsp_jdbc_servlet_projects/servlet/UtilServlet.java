package org.iesvdm.jsp_jdbc_servlet_projects.servlet;

import jakarta.servlet.http.HttpServletRequest;
import org.iesvdm.jsp_jdbc_servlet_projects.model.Usuario;

import java.util.Objects;
import java.util.Optional;

public class UtilServlet {

    public static Optional<Usuario> validaGrabar(HttpServletRequest request) {

        //CÓDIGO DE VALIDACIÓN
        boolean valida = true;
        //int idUsuario = -1;
        String nombreUsuario = null;
        String passwordUsuario = null;

        try {
            //UTILIZO LOS CONTRACTS DE LA CLASE Objects PARA LA VALIDACIÓN
            //             v---- LANZA NullPointerException SI EL PARÁMETRO ES NULL
            Objects.requireNonNull(request.getParameter("nombreUsuarioCreado"));
            //CONTRACT nonBlank..
            //UTILIZO isBlank SOBRE EL PARÁMETRO DE TIPO String PARA CHEQUEAR QUE NO ES UN PARÁMETRO VACÍO "" NI CADENA TODO BLANCOS "    "
            //          |                                EN EL CASO DE QUE SEA BLANCO LO RECIBIDO, LANZO UNA EXCEPCIÓN PARA INVALIDAR EL PROCESO DE VALIDACIÓN
            //          -------------------------v                      v---------------------------------------|
            if (request.getParameter("nombreUsuarioCreado").isBlank()) throw new RuntimeException("Parámetro vacío o todo espacios blancos.");
            nombreUsuario = request.getParameter("nombreUsuarioCreado");


            //UTILIZO LOS CONTRACTS DE LA CLASE Objects PARA LA VALIDACIÓN
            //             v---- LANZA NullPointerException SI EL PARÁMETRO ES NULL
            Objects.requireNonNull(request.getParameter("pswdUsuarioCreado"));
            //CONTRACT nonBlank
            //UTILIZO isBlank SOBRE EL PARÁMETRO DE TIPO String PARA CHEQUEAR QUE NO ES UN PARÁMETRO VACÍO "" NI CADENA TODO BLANCOS "    "
            //          |                                EN EL CASO DE QUE SEA BLANCO LO RECIBIDO, LANZO UNA EXCEPCIÓN PARA INVALIDAR EL PROCESO DE VALIDACIÓN
            //          -------------------------v                      v---------------------------------------|
            if (request.getParameter("pswdUsuarioCreado").isBlank()) throw new RuntimeException("Parámetro vacío o todo espacios blancos.");
            passwordUsuario = request.getParameter("pswdUsuarioCreado");

            return Optional.of(new Usuario(-1, nombreUsuario, passwordUsuario));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //FIN CÓDIGO DE VALIDACIÓN
        return Optional.empty();
    }

    public static Optional<Usuario> validaEditar(HttpServletRequest request) {
        //CÓDIGO DE VALIDACIÓN
        String codigoStr = request.getParameter("idUsuario");
        boolean valida = true;
        int idUsuario = -1;
        String nombreUsuario = null;
        String passwordUsuario = null;

        try {
            //UTILIZO LOS CONTRACTS DE LA CLASE Objects PARA LA VALIDACIÓN
            //             v---- LANZA NullPointerException SI EL PARÁMETRO ES NULL
            Objects.requireNonNull(request.getParameter("nombreUsuarioEditar"));
            //CONTRACT nonBlank..
            //UTILIZO isBlank SOBRE EL PARÁMETRO DE TIPO String PARA CHEQUEAR QUE NO ES UN PARÁMETRO VACÍO "" NI CADENA TODO BLANCOS "    "
            //          |                                EN EL CASO DE QUE SEA BLANCO LO RECIBIDO, LANZO UNA EXCEPCIÓN PARA INVALIDAR EL PROCESO DE VALIDACIÓN
            //          -------------------------v                      v---------------------------------------|
            if (request.getParameter("nombreUsuarioEditar").isBlank()) throw new RuntimeException("Parámetro vacío o todo espacios blancos.");
            nombreUsuario = request.getParameter("nombreUsuarioEditar");


            //UTILIZO LOS CONTRACTS DE LA CLASE Objects PARA LA VALIDACIÓN
            //             v---- LANZA NullPointerException SI EL PARÁMETRO ES NULL
            Objects.requireNonNull(request.getParameter("pswdUsuarioEditar"));
            //CONTRACT nonBlank
            //UTILIZO isBlank SOBRE EL PARÁMETRO DE TIPO String PARA CHEQUEAR QUE NO ES UN PARÁMETRO VACÍO "" NI CADENA TODO BLANCOS "    "
            //          |                                EN EL CASO DE QUE SEA BLANCO LO RECIBIDO, LANZO UNA EXCEPCIÓN PARA INVALIDAR EL PROCESO DE VALIDACIÓN
            //          -------------------------v                      v---------------------------------------|
            if (request.getParameter("pswdUsuarioEditar").isBlank()) throw new RuntimeException("Parámetro vacío o todo espacios blancos.");
            passwordUsuario = request.getParameter("pswdUsuarioEditar");

            return Optional.of(new Usuario(Integer.parseInt(codigoStr), nombreUsuario, passwordUsuario));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //FIN CÓDIGO DE VALIDACIÓN
        return Optional.empty();
    }

    public static Optional<Integer> validaBorrar(HttpServletRequest request) {
        boolean valida = true;

        // Recepcion del parametro enviado por el formulario de borrar
        String codigoStr = request.getParameter("idUsuario");

        // Valida Parametro
        Integer codigo = null;

        try {
            // Recepcion del parametro enviado por el formulario de borrado
            codigo = Integer.parseInt(codigoStr);
            return Optional.of(codigo);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }

        return Optional.empty();
    }

}
