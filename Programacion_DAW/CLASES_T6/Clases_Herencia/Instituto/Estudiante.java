package CLASES_T6.Clases_Herencia.Instituto;

public class Estudiante extends Persona{
    

    // ATRIBUTOS:
    private int numCarnetEstudiante;
    private double notaMedia;

    // CONTRUCTOR:
    public Estudiante(String nombre, String tlf, String mail)
    {
        super(nombre, tlf, mail);
    }
    
    public Estudiante(String nombre, String tlf, String mail, int num, double media)
    {
        this(nombre, tlf, mail);
        this.numCarnetEstudiante = num;
        this.notaMedia = media;
    }


    // METODOS:
    public int getNumCarnetEstudiante() {
        return numCarnetEstudiante;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String toString()
    {
        return "\nEstudiante: " + super.toString() + " con número de carnet " + this.getNumCarnetEstudiante() + " y nota media: " + this.getNotaMedia();
    }

    @Override
    public boolean equals(Object objeto)
    {
        boolean iguales = false;

        Estudiante persona = (Estudiante)objeto;

        return super.equals(objeto) && this.numCarnetEstudiante == persona.numCarnetEstudiante;
    }

    
}
