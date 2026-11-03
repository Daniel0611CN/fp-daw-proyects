package frioMijas_Hector.Personal;

public class Jefe extends Empleado{
    
    // ATRIBUTOS:
    private Password clave;


    // CONSTRUCTORES:
    public Jefe(String nombre, String apellido, int edad, double salario, String dni)
    {
        super(nombre, apellido, edad, salario, dni);

        this.clave = new Password();
    }


    // METODOS:
    public void generaPassword()
    {
        this.clave.generaPassword();
    }

    public void generaPassword(int i)
    {
        this.clave.generaPassword(i);
    }

    public boolean esFuerte()
    {
        return this.clave.esFuerte();
    }
 
    public String getContraseña() {
        return this.clave.getContraseña();
    }


    @Override
    public String toString()
    {
        return super.toString() + " Jefe con contraseña: " + this.clave.getContraseña();
    }

}
