package CLASES_T6.Clases.personal;

import java.time.LocalDate;

public class JefeEstacion {
    
    // ATRIBUTOS:
    private String nombre;
    private String dni;
    private LocalDate fAntiguedad;

    // CONSTRUCTOR:
    public JefeEstacion(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getfAntiguedad() {
        return fAntiguedad;
    }

    public void modificarFechaCargo(int año, int mes, int dia)
    {
        this.fAntiguedad = LocalDate.of(año, mes, dia);
    }
    
    @Override
    public String toString()
    {
        String resultado = this.getNombre() + ", con dni: " + this.getDni();

        return resultado;
    }

}
