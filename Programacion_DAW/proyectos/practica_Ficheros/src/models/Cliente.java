package models;

public class Cliente {
    
    private int codigo;
    private String nombre;
    private String direccion;
    private String email;

    public Cliente(){

    }

    @Override
    public String toString() 
    {
        return "\nCliente: cod: " + codigo + ", " + nombre + "\ndireccion: " + direccion + "\nemail: " + email + "\n";
    }

    @Override
    public int hashCode() {

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        
        return nombre.equals(((Cliente)obj).getNombre());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

}
