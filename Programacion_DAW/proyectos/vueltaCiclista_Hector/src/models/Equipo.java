package models;

public class Equipo {
    
    // ATTRIBUTES:
    protected String codigo;
    protected String nombre;
    protected String nacionalidad;
    protected int presupuesto;

    // CONSTRUCTOR:
    public Equipo(String codigo, String nombre, String nacionalidad, int presupuesto){

        this.codigo = codigo;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.presupuesto = presupuesto;
    }

    // METHODS:
    @Override
    public String toString(){

        return this.nombre + " (" + this.codigo + ") - país: " + this.nacionalidad + " " + this.presupuesto + "M€"; 
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getPresupuesto() {
        return presupuesto;
    }
    
}
