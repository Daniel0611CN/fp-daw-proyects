package INTERFACES.jugadoresFutbol;

public class Jugador implements Jugar_I, Comparable<Jugador>{
    

    // ATRIBUTOS:
    protected String nombreCompleto;
    protected String apodo;
    protected int licencia; // parámetro de ordenación por defecto (CompareTo)
    protected int numGoles;
    protected int numFaltas;
    protected int regate;

    static private int contadorLicencia;


    // CONSTRUCTORES:
    public Jugador(String nombre, String apodo)
    {
        this.nombreCompleto = nombre;
        this.apodo = apodo;
        this.regate = generaRegate();

        contadorLicencia++;
        this.licencia = contadorLicencia;
    }

    public Jugador(String nombre, String apodo, int goles, int faltas)
    {
        this(nombre, apodo);
        this.numGoles = goles;
        this.numFaltas = faltas;
    }


    // METODOS:

    /**
     * Genera un número entero aleatorio que será la 
     * capacidad de regate mínima del Jugador
     * @return regateAleatorio
     */
    private int generaRegate()
    {
        return (int)(Math.random()*101);
    }

    @Override
    public String toString()
    {
        return "\n\t" + this.nombreCompleto + " (" + this.apodo + ")  \t  - Goles " +
        this.numGoles + " \t - Faltas " + this.numFaltas + " \t -> \t nº LICENCIA: " + this.getLicencia();
    }

    
    @Override
    public boolean equals(Object objeto)
    {
        boolean iguales = false;

        Jugador comparado = (Jugador)objeto;
        
        if(this.licencia == comparado.licencia)
        {
            iguales = true;
        }

        return iguales;
    }


    @Override
    public void hacerGol()
    {
        this.numGoles++;
        System.out.println("Gooooooooool de " + this.apodo + "!!");
    }


    @Override
    public void cometerFalta()
    {
        this.numFaltas++;
        System.out.println("Terrible falta de " + this.apodo + "!");
    }


    @Override
    public int compareTo(Jugador j)
    {
        
        int diferencia = this.licencia - j.licencia;
        
        return diferencia;
    }

    // GETTERS:
    public String getNombre() {
        return nombreCompleto;
    }

    public String getApodo() {
        return apodo;
    }

    public int getLicencia() {
        return licencia;
    }

    public int getGoles() {
        return numGoles;
    }

    public int getFaltas() {
        return numFaltas;
    }

    public int getRegate() {
        return regate;
    }

}
