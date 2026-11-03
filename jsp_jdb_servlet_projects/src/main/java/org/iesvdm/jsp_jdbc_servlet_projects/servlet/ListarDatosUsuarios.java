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

@WebServlet(name = "ListarDatosUsuarios", value = "/ListarDatosUsuarios")
public class ListarDatosUsuarios extends HttpServlet {

    private UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/listarUsuarios.jsp");

        List<Usuario> listado = this.usuarioDAO.getAll();
        request.setAttribute("listado", listado);

        dispatcher.forward(request, response);

    }

}
