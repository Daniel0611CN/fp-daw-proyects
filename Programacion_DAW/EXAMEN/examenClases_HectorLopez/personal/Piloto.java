package EXAMEN.examenClases_HectorLopez.personal;

public class Piloto extends Persona{
    

    // ATRIBUTOS:
    private int año;

    // CONTRUCTOR:
    public Piloto(String nombre, String apellidos, int año)
    {
        super(nombre, apellidos);
        this.año = año;
    }


    // METODOS:
    @Override
    public String informacion()
    {
        return "\nPiloto: " + super.getNombre() + " " + super.getApellidos() + " Titulo: " + this.getAño();
    }

    public int getAño() {
        return año;
    }

}
