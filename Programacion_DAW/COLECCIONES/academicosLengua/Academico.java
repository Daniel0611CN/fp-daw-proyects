package COLECCIONES.academicosLengua;

public class Academico implements Comparable<Academico>{
    

    // ATRIBUTOS:
    public String nombre;
    public int ingreso;
    

    // CONSTRUCTOR:
    public Academico(String nombre, int año)
    {
        this.nombre = nombre;
        ingreso = año;
    }


    // METODOS:
    public String getNombre() {
        return nombre;
    }

    public int getIngreso() {
        return ingreso;
    }

    @Override
    public int compareTo(Academico o) {

        if(this.nombre.compareTo(o.getNombre()) == 0)
        {
            return (this.getIngreso() - o.getIngreso());
        }
        else 
        {
            return this.nombre.compareTo(o.getNombre());
        }
    }

    @Override
    public String toString(){

        return this.getNombre() + " - " + this.getIngreso();
    }

}
