package EXAMEN.examenClases_HectorLopez.material;

public class Avion {
    

    // ATRIBUTOS:
    private String matricula;
    private int potencia;
    private int capacidad;
    private int alturaMax;
    private boolean propiedad;


    // CONSTRUCTOR:
    public Avion (String matricula, int potencia, int plazas, int altura, boolean prop)
    {
        this.matricula = matricula;
        this.potencia = potencia;
        this.capacidad = plazas;
        this.alturaMax = altura;
        this.propiedad = prop;
    }


    // METODOS:
    @Override
    public String toString()
    {
        return "\nAvion: " + this.getMatricula() + " (" + this.getAlturaMax() + "m) Capacidad: " + this.getCapacidad() + " saltadores";
    }


    public String getMatricula() {
        return matricula;
    }


    public int getCapacidad() {
        return capacidad;
    }


    public int getAlturaMax() {
        return alturaMax;
    }


}
