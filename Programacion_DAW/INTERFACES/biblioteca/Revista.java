package INTERFACES.biblioteca;

public class Revista extends Publicacion{
    

    // ATRIBUTOS:
    private int numPaginas;


    // CONSTRUCTOR:
    public Revista(String codigo, String nombre, int año, int paginas)
    {
        super(codigo, nombre, año);
        numPaginas = paginas;
    }


    // METODOS:
    @Override
    public String toString()
    {
        return super.toString();
    }

}
