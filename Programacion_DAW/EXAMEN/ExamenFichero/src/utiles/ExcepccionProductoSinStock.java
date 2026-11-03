package utiles;

public class ExcepccionProductoSinStock extends Exception {

    public ExcepccionProductoSinStock(int codigo, String nombre)
    {
        super("El producto" + nombre + " con codigo " + codigo + " NO tiene Stock");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
