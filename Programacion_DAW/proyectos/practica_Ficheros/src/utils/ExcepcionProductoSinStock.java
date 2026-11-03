package utils;

public class ExcepcionProductoSinStock extends Exception{


    public ExcepcionProductoSinStock(String param1, String param2)
    {
        super("El producto " + param1 + " con código " + param2 + " no tiene stock");
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
