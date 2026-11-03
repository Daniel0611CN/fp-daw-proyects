package frioMijas_Hector;

import frioMijas_Hector.Material.Equipo;
import frioMijas_Hector.Personal.Empleado;
import frioMijas_Hector.Personal.Jefe;

public class Sede {

    // ATRIBUTOS:
    static private int cod_Incremental;

    private String ciudad;
    private String direccion;
    private int cp;
    private int codigoSede;
    private Jefe jefeSede;
    private Empleado[] empleados_Sede;
    private Equipo[] equipos_Sede;


    // CONSTRUCTORES:
    public Sede(String ciudad, String direccion, int cp)
    {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.cp = cp;
        cod_Incremental++;
        this.codigoSede = cod_Incremental;
        this.empleados_Sede = new Empleado[0];
        this.equipos_Sede = new Equipo[0];
    }

    public Sede(String ciudad, String direccion, int cp, Jefe jefeSede)
    {
        this(ciudad, direccion, cp);
        this.jefeSede = jefeSede;
    }
    

    // METODOS:

    /**
     * Inserta un equipo al final del array
     * @param nuevoEquipo
     */
    public void addEquipo(Equipo nuevoEquipo)
    {
        Equipo[] nuevo = new Equipo[this.equipos_Sede.length+1];

        for (int i = 0; i < this.equipos_Sede.length; i++)
        {
            nuevo[i] = this.equipos_Sede[i];
        }

        nuevo[nuevo.length-1] = nuevoEquipo;

        this.equipos_Sede = nuevo;
    }

    /**
     * Inserta un empleado al final del array
     * @param nuevoEmpleado
     */
    public void addEmpleado(Empleado nuevoEmpleado)
    {
        boolean yaEsta = false;

        // Comprobamos si el empleado ya trabaja en esta sede:
        for (int i = 0; i < this.empleados_Sede.length; i++)
        {
            if(nuevoEmpleado.equals(this.empleados_Sede[i]))
            {
                yaEsta = true;
            }
        }

        if(!yaEsta)// En caso contrario creamos el nuevo array y añadimos al empleado
        {
            Empleado[] nuevo = new Empleado[this.empleados_Sede.length+1];

            for (int i = 0; i < this.empleados_Sede.length; i++)
            {
                nuevo[i] = this.empleados_Sede[i];
            }
    
            nuevo[nuevo.length-1] = nuevoEmpleado;
    
            this.empleados_Sede = nuevo;
        }
        else
        {
            System.out.println("Empleado duplicado");
        }
    }

    public void setJefe(Jefe jefeSede) {
        this.jefeSede = jefeSede;
    }
    
    @Override
    public String toString()
    {
        String resultado = "";

        resultado+= "\nSede con código " + this.codigoSede + ", ubicada en: " + this.direccion + ", CP:" + this.cp + " (" + this.ciudad + ") " +
                    "\nJefe: " + this.jefeSede.toString();

                    // Imprimimos a cada empleado:
                    resultado+= "\nEmpleados de la sede:";
                    for (int i = 0; i < this.empleados_Sede.length; i++)
                    {
                        resultado+= this.empleados_Sede[i].toString();
                    }

                    // Imprimimos los equipos frigorificos de la sede:
                    resultado+= "\nEquipos de la sede:";

                    for (int i = 0; i < equipos_Sede.length; i++)
                    {
                        resultado+= this.equipos_Sede[i].toString();
                    }

        return resultado;
    }

    public Empleado[] getEmpleados_Sede() {
        return this.empleados_Sede;
    }

    
}
