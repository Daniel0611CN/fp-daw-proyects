package org.iesvdm.jsp_jdbc_servlet_projects.dao;

import org.iesvdm.jsp_jdbc_servlet_projects.model.Usuario;

import java.util.List;

public interface UsuarioDAO {

    public void create(Usuario usuario);
    public List<Usuario> getAll();
    public void update(Usuario usuario);
    public void delete(int id);

}
