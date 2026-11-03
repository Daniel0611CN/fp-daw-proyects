public class Municipio implements Comparable<Municipio>{
    

    // ATRIBUTOS:
    private String cod_postal;
    private String nombre;
    private String año;
    private int poblacion;


    // CONSTRUCTOR:
    public Municipio(String cp, String nombre, String año, int poblacion)
    {
        this.cod_postal = cp;
        this.nombre = nombre;
        this.año = año;
        this.poblacion = poblacion;
    }

    // METODOS:
    @Override
    public int compareTo(Municipio otro)
    {
        int dif = this.nombre.compareTo(otro.nombre);

        if(dif == 0)
        {
            dif = Integer.valueOf(this.año) - Integer.valueOf(otro.año);
        }

        return dif;
    }

    @Override
    public boolean equals(Object otro)
    {
        boolean iguales = false;

        if(this.compareTo((Municipio)otro) == 0)
        {
            iguales = true;
        }

        return iguales;
    }

    @Override
    public String toString()
    {
        return this.nombre + " (" + this.año + ") : " + this.poblacion + "\n"; 
    }


    // GETTERS:
    public String getCod_postal() {
        return cod_postal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAño() {
        return año;
    }

    public int getPoblacion() {
        return poblacion;
    }
    
}
