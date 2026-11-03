package CLASES_T6.Clases;

public class Caja {

    public enum AccionesBanco {INGRESAR, RETIRAR};

    // ATRIBUTOS:
    private Cliente[] colaClientes;
    private double saldo;

    // CONSTRUCTOR:
    public Caja()
    {
        this.colaClientes = new Cliente[0];
        this.saldo = 1000;
    }

    public void cogerTurno(Cliente nuevoCliente)
    {
        Cliente[] nuevaCola = new Cliente[this.colaClientes.length+1];

        for (int i = 0; i < colaClientes.length; i++)
        {
            nuevaCola[i] = this.colaClientes[i];
        }

        nuevaCola[nuevaCola.length-1] = nuevoCliente;

        this.colaClientes = nuevaCola;
    }

    private Cliente desencolar()
    {
        Cliente clienteAtendido = this.colaClientes[0];

        Cliente[] nuevaCola = new Cliente[this.colaClientes.length-1];

        for (int i = 0; i < nuevaCola.length; i++)
        {
            nuevaCola[i] = colaClientes[i+1];
        }

        this.colaClientes = nuevaCola;

        return clienteAtendido;
    }

    public void atender()
    {
        Cliente clienteAtendido = desencolar();

        System.out.println("\nAtendiendo a: " + clienteAtendido.getNombre());

        if(clienteAtendido.getOperacion() == AccionesBanco.INGRESAR && clienteAtendido.getImporte() > 0)
        {
            this.saldo += clienteAtendido.getImporte();
        }
        else if(clienteAtendido.getOperacion() == AccionesBanco.RETIRAR && clienteAtendido.getImporte() > 0)
        {
            if (this.saldo - clienteAtendido.getImporte() >= 0)
            {
                this.saldo -= clienteAtendido.getImporte();
            }
            else 
            {
                System.out.println("No hay dinero suficiente en la caja, vuelva mañana por favor.");
            }
        }
    }

    public String saldo()
    {
        return "Saldo actual de la caja: " + this.getSaldo() + " euros.";
    }

    public void estadoCola()
    {
        for (int i = 0; i < colaClientes.length; i++)
        {
            System.out.print("cliente " + (i+1) + ": " + colaClientes[i].toString() + ", ");
        }
        System.out.println("");

    }

    public Cliente[] getColaClientes() {
        return colaClientes;
    }

    public void setColaClientes(Cliente[] colaClientes) {
        this.colaClientes = colaClientes;
    }

    public double getSaldo() {
        return saldo;
    }


    
    


}
