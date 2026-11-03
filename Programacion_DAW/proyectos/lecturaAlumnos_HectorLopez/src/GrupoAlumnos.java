import java.util.ArrayList;

public class GrupoAlumnos extends Alumno{
    

    // ATRIBUTOS:
    private ArrayList<Alumno> grupo;

    // CONSTRUCTOR:
    public GrupoAlumnos()
    {
        this.grupo = new ArrayList<>();
    }

    // METODOS:
    public double mediaEdades()
    {
        double edadMedia = 0.0;

        for (Alumno alumno : this.grupo) {
            
            edadMedia+= alumno.getEdad();
        }

        return edadMedia/this.grupo.size();
    }

    public int cantidadAlumnos()
    {
        return this.grupo.size();
    }

    public int numeroSuspensos()
    {
        int numero = 0;

        for (Alumno alumno : this.grupo)
        {
            if(alumno.getCalificacion().equalsIgnoreCase("suspenso"))
            {
                numero++;
            }
        }
        return numero;
    }

    public int numeroMujeres()
    {
        int mujeres = 0;

        for (Alumno alumno : this.grupo)
        {
            if(alumno.getSexo().equalsIgnoreCase("mujer"))
            {
                mujeres++;
            }
        }
        return mujeres;
    }

    public int numMujeresSuspensas()
    {
        int suspendida = 0;

        for (Alumno alumno : this.grupo)
        {
            if(alumno.getSexo().equalsIgnoreCase("mujer") && alumno.getCalificacion().equalsIgnoreCase("suspenso"))
            {
                suspendida++;
            }
        }
        return suspendida;
    }

    // GETTER:
    public ArrayList<Alumno> getGrupo() {
        return grupo;
    }
    
}
