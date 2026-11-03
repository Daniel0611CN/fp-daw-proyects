package EXAMEN.examenClases_HectorLopez.personal;

public abstract class Persona {
    

    // ATRIBUTOS:
    protected String nombre;
    protected String apellidos;


    // CONSTRUCTOR:
    public Persona(String nombre, String apellidos)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // METODOS:
    public abstract String informacion();

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public boolean equals(Object objeto)
    {
        Persona persona = (Persona)objeto;

        return this.nombre.equals(persona.getNombre()) && this.apellidos.equals(persona.getApellidos());
    }

}
