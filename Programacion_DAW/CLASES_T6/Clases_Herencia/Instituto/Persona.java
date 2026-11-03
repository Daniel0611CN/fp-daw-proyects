package CLASES_T6.Clases_Herencia.Instituto;

public class Persona {
    
    // ATRIBUTOS:
    private String nombre;
    private String telefono;
    private String email;


    // CONSTRUCTOR:
    public Persona(String nombre)
    {
        this.nombre = nombre;
    }

    public Persona(String nombre, String tlf, String mail)
    {
        this(nombre);
        this.telefono = tlf;
        this.email = mail;
    }


    // METODOS:
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString()
    {
        return "\nNombre: " + this.getNombre() + ", teléfono: " + this.getTelefono() + ", email: " + this.getEmail();
    }

    @Override
    public boolean equals(Object objeto)
    {
        boolean iguales = false;

        Persona persona = (Persona)objeto;

        return this.nombre.equals(persona.getNombre()) && this.email.equals(persona.getEmail());
    }

}
