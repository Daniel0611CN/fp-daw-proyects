package CLASES_T6.Clases_Herencia.Instituto;

public class ProfesorTitular extends Profesor{
 
    // ATRIBUTOS:
    private int antiguedad;
    

    // CONSTRUCTOR:
    public ProfesorTitular(String nombre, double salario, String materia, boolean tutor, int antiguedad)
    {
        super(nombre, salario, materia, tutor);
        this.antiguedad = antiguedad;
    }

    public ProfesorTitular(String nombre, String tlf, String mail, double salario, String materia, boolean tutor, int antiguedad)
    {
        super(nombre, tlf, mail, salario, materia, tutor);
        this.antiguedad = antiguedad;
    }

    @Override
    public double getSalario()
    {
        int extraTutor = (this.esTutor?30:0);

        return (this.salarioBase + (10*this.antiguedad) + extraTutor);
    }

    @Override
    public boolean equals(Object objeto)
    {
        ProfesorTitular profe = (ProfesorTitular)objeto;

        return super.equals(objeto) && this.antiguedad == profe.antiguedad;
    }

    @Override
    public String toString()
    {
        return "\nProfesor Titular: " + super.toString() + ". Imparte " + this.materia + ", y tiene " + this.antiguedad + " años de antiguedad.";
    }
    
}
