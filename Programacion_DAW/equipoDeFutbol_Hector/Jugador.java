package equipoDeFutbol_Hector;

public class Jugador {

    public enum Posicion {PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO};

    // ATRIBUTOS:
    private String dni;
    private String nombre;
    private Posicion posicion;
    private Integer estatura;

    // CONSTRUCTOR:
    public Jugador(String dni, String nombre, Posicion posicion, Integer estatura)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
    }

    // METODOS:
    @Override
    public String toString()
    {
        return "Jugador: " + this.nombre + " con dni: " + this.dni + "\nJuega de " + this.posicion + " con sus " + this.estatura + "cm de altura.\n\n";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Integer getEstatura() {
        return estatura;
    }

    public void setEstatura(Integer estatura) {
        this.estatura = estatura;
    }

    
}
