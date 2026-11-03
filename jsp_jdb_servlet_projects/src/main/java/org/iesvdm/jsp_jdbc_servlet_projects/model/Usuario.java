package org.iesvdm.jsp_jdbc_servlet_projects.model;

import java.util.Objects;

public class Usuario {

    private int idUsuario;
    private String nombreUsuario;
    private String pswdUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String pswdUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.pswdUsuario = pswdUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPswdUsuario() {
        return pswdUsuario;
    }

    public void setPswdUsuario(String pswdUsuario) {
        this.pswdUsuario = pswdUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idUsuario == usuario.idUsuario && Objects.equals(nombreUsuario, usuario.nombreUsuario) && Objects.equals(pswdUsuario, usuario.pswdUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, nombreUsuario, pswdUsuario);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", pswdUsuario='" + pswdUsuario + '\'' +
                '}';
    }
}
