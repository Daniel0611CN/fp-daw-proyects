
public class ExcepcionApareamientoImposible extends Exception{


    public ExcepcionApareamientoImposible(String nombre1, String nombre2)
    {
        super("El gato " + nombre1 + " no encaja con el gato " + nombre2);
    }


    @Override
    public String toString()
    {
        return this.getMessage();
    }
}
