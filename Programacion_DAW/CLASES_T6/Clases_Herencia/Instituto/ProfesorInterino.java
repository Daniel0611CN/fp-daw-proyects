package CLASES_T6.Clases_Herencia.Instituto;

public class ProfesorInterino extends Profesor{
    

    // CONSTRUCTOR:
    public ProfesorInterino(String nombre, double salario, String materia, boolean tutor)
    {
        super(nombre, salario, materia, tutor);
    }

    public ProfesorInterino(String nombre, String tlf, String mail, double salario, String materia, boolean tutor)
    {
        super(nombre, tlf, mail, salario, materia, tutor);
    }

    @Override
    public double getSalario()
    {
        int extraTutor = (this.esTutor?25:0);

        return (this.salarioBase + extraTutor);
    }

    @Override
    public String toString()
    {
        return "\nProfesor interino: " + super.toString() + ". Imparte " + this.materia;
    }

    @Override
    public boolean equals(Object objeto)
    {
        ProfesorInterino profe = (ProfesorInterino)objeto;

        return super.equals(objeto) && this.materia.equals(profe.materia);
    }

}
