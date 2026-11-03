package CLASES_T6.Clases;

public class Gestor {
    
    public enum PuestoTrabajo {BECARIO, AYUDANTE, SENIOR}

    // ATRIBUTOS DE GESTOR:
    private String nombre;
    private String telefono;
    private double importe_max;

    private PuestoTrabajo puesto;

    // CONSTRUCTORES:
    public Gestor(String nombre, String tlf)
    {
        this.nombre = nombre;
        this.telefono = tlf;
        this.importe_max = 10000;
        
        this.puesto = PuestoTrabajo.BECARIO;
    }

    public Gestor(String nombre, String tlf, double importe)
    {
        this(nombre, tlf);
        this.importe_max = importe;
    }

    public Gestor(String nombre, String tlf, PuestoTrabajo puesto)
    {
        this(nombre, tlf);
        
        this.puesto = puesto;

        // Actualizo el importe máximo segun el puesto:
        switch(puesto)
        {
            case BECARIO:
                setImporte_max(10000);
                break;
            case AYUDANTE:
                setImporte_max(50000);
                break;
            case SENIOR:
                setImporte_max(200000);
                break;
            default:
                setImporte_max(10000);
        }
    }


    // METODOS:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    double getImporte_max() {
        return importe_max;
    }

    public void setImporte_max(double importe_max) {
        
        if(this.puesto == PuestoTrabajo.BECARIO && importe_max > 10000)
        {
            this.importe_max = 10000;
            System.out.println("El importe máximo para este gestor es 10.000€");
        }
        else if (this.puesto == PuestoTrabajo.AYUDANTE && importe_max > 50000)
        {
            this.importe_max = 50000;
            System.out.println("El importe máximo para este gestor es 50.000€");
        }
        else if (this.puesto == PuestoTrabajo.SENIOR && importe_max > 200000)
        {
            this.importe_max = 200000;
            System.out.println("El importe máximo para este gestor es 200.000€");
        }
        else 
        {
            this.importe_max = importe_max;
        }
    }

    public PuestoTrabajo getPuesto() {
        return puesto;
    }

    public void setPuesto(PuestoTrabajo puesto) {
        this.puesto = puesto;
    }



}
