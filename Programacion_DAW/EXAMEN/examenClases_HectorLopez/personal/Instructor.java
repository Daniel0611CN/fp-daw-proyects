package EXAMEN.examenClases_HectorLopez.personal;

public class Instructor extends Persona{
    

    // ATRIBUTOS:
    private double sueldo;

    // CONSTRUCTOR:
    public Instructor(String nombre, String apellidos)
    {
        super(nombre, apellidos);
    }

    public Instructor(String nombre, String apellidos, double sueldo)
    {
        this(nombre, apellidos);
        this.sueldo = sueldo;
    }

    // METODOS:
    public String informacion()
    {
        return super.getNombre() + " " + super.getApellidos();
    }
}
