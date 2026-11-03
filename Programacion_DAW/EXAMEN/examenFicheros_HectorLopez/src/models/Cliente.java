package models;

public class Cliente implements Comparable<Cliente>{

    private int codigo;
    private String nombre;
    private String direccion;
    private String email;

    // CONSTRUCTOR:
    public Cliente() {

    }

    // METHODS:
    @Override
    public int compareTo(Cliente c)
    {
        return this.nombre.compareTo(c.nombre);
    }

    @Override
    public boolean equals(Object otro){

        boolean iguales = false;
        
        if(this.compareTo((Cliente)otro) == 0)
        {
            iguales = true;
        }

        return iguales;
    }

    @Override
    public int hashCode(){

        return 0;
    }

    @Override
    public String toString(){

        return "\ncódigo: " + codigo + " Nombre: " + nombre + "\nDirección: " + direccion + "\nEmail: " + email + "\n";
    }

    // GETTERS & SETTERS:
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

}
