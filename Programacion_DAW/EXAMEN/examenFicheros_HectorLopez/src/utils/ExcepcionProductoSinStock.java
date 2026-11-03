package utils;

public class ExcepcionProductoSinStock extends Exception{
    

    private String nombre;
    private int codigo;


    public ExcepcionProductoSinStock(String nombre, int codigo){

        this.nombre = nombre;
        this.codigo = codigo;
    }

    @Override
    public String toString()
    {
        return "El producto " + this.nombre + " con código " + this.codigo + " no tiene stock";
    }

}
