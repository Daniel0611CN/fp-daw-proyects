package utils;

public class NoExisteDNIExcepcion extends Exception{


    public NoExisteDNIExcepcion(String nombre)
    {
        super("El alumno " + nombre + " no tiene DNI, no se puede procesar su información");
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
