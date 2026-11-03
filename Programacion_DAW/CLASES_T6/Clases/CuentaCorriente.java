package CLASES_T6.Clases;

public class CuentaCorriente {
    
    // ATRIBUTOS DE LA CLASE:
    String dni;
    String nombreTitular;
    double saldo;
    Gestor miGestor;

    // CONSTRUCTORES:
    public CuentaCorriente(String dni, String nombre)
    {
        this.dni = dni;
        this.nombreTitular = nombre;
        this.saldo = 0;
    }

    public CuentaCorriente(String dni, double saldoInicial)
    {
        this.dni = dni;
        this.saldo = saldoInicial;
    }

    public CuentaCorriente(String dni, String nombre, double saldoInicial)
    {
        this(dni, nombre);
        this.saldo = saldoInicial;
    }


    // METODOS:



    
    public void sacarDinero(double dineroASacar)
    {
        if(dineroASacar < this.saldo)
        {
            // puedo sacar dinero
            this.saldo -= dineroASacar;
        }
        else 
        {
            System.out.println("No hay saldo suficiente");
        }
    }

    public void ingresarDinero(double dineroAIngresar)
    {
        if(dineroAIngresar >= 0)
        {
            this.saldo += dineroAIngresar;
        }
    }

    public String mostrarInformacion()
    {
        String resultado = this.nombreTitular + "(" + this.dni + ") : " + this.saldo;
        return resultado;
    }

    @Override
    public String toString()
    {
        return mostrarInformacion();
    }

    
}
