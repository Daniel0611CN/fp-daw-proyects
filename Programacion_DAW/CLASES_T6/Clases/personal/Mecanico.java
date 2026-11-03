package CLASES_T6.Clases.personal;

public class Mecanico {
    
    public enum Especialidad {frenos, hidraulica, electricidad, motor}

    // ATRIBUTOS:
    private String nombre;
    private String tlf;
    private Especialidad especialidad;

    //CONSTRUCTOR:
    public Mecanico(String nombre, String tlf, Especialidad tipo)
    {
        this.nombre = nombre;
        this.tlf = tlf;
        this.especialidad = tipo;
    }

    // METODOS:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


}
