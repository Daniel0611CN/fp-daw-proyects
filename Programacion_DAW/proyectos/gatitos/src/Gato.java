public class Gato {
    
    // ATRIBUTOS:
    private String nombre;
    private String raza;
    private String sexo;

    // CONSTRUCTOR:
    public Gato(String nombre, String raza, String sexo)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
    }

    // METODOS:
    public Gato apareaCon(Gato pareja)
    {
        Gato cria = null;


        try
        {
            if(this.sexo.equals(pareja.sexo))
            {


                throw new ExcepcionApareamientoImposible(this.nombre, pareja.nombre);
            }
            else 
            {
                String sexoCria = "Macho";
                if(Math.random()>=0.5)
                {
                    sexoCria = "Hembra";
                }
                cria = new Gato(this.nombre + " Junior", "Mezcla", sexoCria);
            }
        }
        catch (ExcepcionApareamientoImposible e)
        {
            System.out.println(e.getMessage());
        }

        return cria;
    }

    @Override
    public String toString()
    {
        return this.nombre + " de la raza " + this.raza + " y sexo: " + this.sexo;
    }
}
