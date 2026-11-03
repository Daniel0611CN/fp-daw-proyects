package INTERFACES.biblioteca;

public class Libro extends Publicacion implements Prestable_I{


    // ATRIBUTOS:
    private boolean prestado;


    // CONSTRUCTOR:
    public Libro(String codigo, String nombre, int fecha)
    {
        super(codigo, nombre, fecha);
        this.prestado = false;
    }


    // METODOS:
    @Override
    public void presta()
    {
        if(this.estaPrestado())
        {
            System.out.println("Lo siento, ese libro ya está prestado.");
        }
        else 
        {
            this.prestado = true;
        }
    }

    @Override
    public void devuelve()
    {
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado()
    {
        return this.prestado;
    }
    
}
