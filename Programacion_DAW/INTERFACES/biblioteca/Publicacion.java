package INTERFACES.biblioteca;

public abstract class Publicacion {
    
    // ATRIBUTOS:
    protected String isbn;
    protected String titulo;
    protected int año;

    // CONTRUCTOR:
    public Publicacion(String codigo, String nombre, int fecha)
    {
        isbn = codigo;
        titulo = nombre;
        año = fecha;
    }

    // METODOS:
    @Override
    public String toString()
    {
        return "ISBN: " + this.isbn + ", título: " + this.titulo + ", año de publicación: " + this.año;
    }

}
