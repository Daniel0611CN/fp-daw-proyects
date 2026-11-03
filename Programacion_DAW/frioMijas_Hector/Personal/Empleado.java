package frioMijas_Hector.Personal;

public class Empleado {
    

    // ATRIBUTOS:
    private String nombre;
    private String apellidos;
    private int edad;
    private double salario;
    private String dni;
    private int codigo;
    
    static private int codigoIncremental;


    // CONTRUCTORES:
    public Empleado(String nombre, String apellido, int edad, double salario, String dni)
    {
        this.nombre = nombre;
        this.apellidos = apellido;
        this.edad = edad;
        this.salario = salario;
        this.dni = dni;
        codigoIncremental++;
        this.codigo = codigoIncremental;
    }


    // METODOS:
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString()
    {
        return "\nEmpleado con código " + this.getCodigo() + ": " + this.getNombre() + " " + this.getApellidos() + 
                ", con dni: " + this.getDni() + ", edad de " + this.getEdad() + " años, y " + this.getSalario() + " € de sueldo ";
    }

    @Override
    public boolean equals(Object objeto)
    {
        Empleado persona = (Empleado)objeto;
        boolean iguales = false;

        if(this.dni.equals(persona.getDni()))
        {
            iguales = true;
        }

        return iguales;
    }
}
