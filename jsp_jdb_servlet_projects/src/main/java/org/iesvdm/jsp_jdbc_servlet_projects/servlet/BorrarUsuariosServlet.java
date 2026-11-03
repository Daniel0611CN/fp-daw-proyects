package org.iesvdm.jsp_jdbc_servlet_projects.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.iesvdm.jsp_jdbc_servlet_projects.dao.UsuarioDAO;
import org.iesvdm.jsp_jdbc_servlet_projects.dao.UsuarioDAOImpl;
import org.iesvdm.jsp_jdbc_servlet_projects.model.Usuario;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet(name = "BorrarUsuariosServlet", value = "/BorrarUsuariosServlet")
public class BorrarUsuariosServlet extends HttpServlet {

    private UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = null;

        Optional<Integer> optionalCodigo = UtilServlet.validaBorrar(request);

        if (optionalCodigo.isPresent()) {
            int codigo = optionalCodigo.get();

            // Parametro Valido
            usuarioDAO.delete(codigo);

            // SI QUISIERA REDIRECCION DEL LADO DEL NAVEGADOR
            // response.sendRedirect("ListarSociosServlet");

            // QUIERO REDIRECCION INTERNA
            List<Usuario> listado = this.usuarioDAO.getAll();
            request.setAttribute("listado", listado);

            dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/listarUsuariosAdmin.jsp");
            dispatcher.forward(request, response);

        } else {
            // Parametro no valido
            response.sendRedirect("ListarDatosAdministrador?err-cod=1");
        }
    }
}
