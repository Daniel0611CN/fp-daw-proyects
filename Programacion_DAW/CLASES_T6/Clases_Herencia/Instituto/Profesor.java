package CLASES_T6.Clases_Herencia.Instituto;

public abstract class Profesor extends Persona{
    

    // ATRIBUTOS:
    protected double salarioBase;
    protected String materia;
    protected boolean esTutor;
    
    // CONSTRUCTORES:
    public Profesor(String nombre, double salario, String materia, boolean tutor)
    {
        super(nombre);
        this.salarioBase = salario;
        this.materia = materia;
        this.esTutor = tutor;
    }
    public Profesor(String nombre, String tlf, String mail, double salario, String materia, boolean tutor)
    {
        super(nombre, tlf, mail);
        this.salarioBase = salario;
        this.materia = materia;
        this.esTutor = tutor;  
    }

    // METODOS:
    public abstract double getSalario();

}
