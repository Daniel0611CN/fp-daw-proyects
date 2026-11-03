package EXAMEN.examenClases_HectorLopez;

import java.time.LocalDate;

import EXAMEN.examenClases_HectorLopez.material.Avion;
import EXAMEN.examenClases_HectorLopez.material.Paracaidas;
import EXAMEN.examenClases_HectorLopez.personal.Cliente;
import EXAMEN.examenClases_HectorLopez.personal.Piloto;
import EXAMEN.examenClases_HectorLopez.personal.Saltador;

public class Vuelo {
    

    // ATRIBUTOS:
    private int numeroSalto;
    static private int contadorSaltos;

    private Cliente[] saltadores;
    private Piloto piloto;
    private Avion avion;
    private LocalDate fechaSalto;


    // CONSTRUCTOR:
    public Vuelo(Avion avion, Piloto piloto)
    {
        this.avion = avion;
        this.piloto = piloto;
        this.saltadores = new Cliente[0];
        this.fechaSalto = LocalDate.now();

        contadorSaltos++;
        this.numeroSalto = contadorSaltos;
    }

    // METODOS:

    public void addSaltador(Cliente cliente, Paracaidas para1, Paracaidas para2)
    {
        // Comprobamos si caben mas saltadores:
        if(this.saltadores.length >= this.avion.getCapacidad())
        {
            System.out.println("No caben más saltadores en el avion");

        } // Comprobamos que la altura de salto del cliente no supera la altura maxima del avión:
        else if(this.avion.getAlturaMax() < cliente.getAlturaSalto())
        {
            System.out.println("La altura de salto del cliente es superior a la altura máxima del avión");
        }
        else
        {
            // Comprobamos si el cliente ya está en el avion:
            boolean yaEsta = false;
            for (int i = 0; i < this.saltadores.length; i++)
            {
                if(cliente.equals(this.saltadores[i]))
                {
                    yaEsta = true;
                }
            }

            // En caso contrario creamos el nuevo array y añadimos al cliente
            if(yaEsta)
            {
                System.out.println("Este saltador ya se encuentra dentro del avión");
            }
            else
            {
                Cliente[] nuevo = new Cliente[this.saltadores.length+1];

                for (int i = 0; i < this.saltadores.length; i++)
                {
                    nuevo[i] = this.saltadores[i];
                }

                // Añadimos al saltador en la posición nueva creada:
                nuevo[nuevo.length-1] = new Saltador(cliente, para1, para2);
        
                this.saltadores = nuevo;
            }
        }
    }


    public void salto()
    {
        Cliente saltador = null;

        if(this.saltadores.length>0)
        {
            Cliente[] nuevoArray = new Cliente[this.saltadores.length-1];

            for (int i = 0; i < nuevoArray.length; i++)
            {
                nuevoArray[i] = this.saltadores[i];    
            }
    
            saltador = this.saltadores[this.saltadores.length-1];
    
            this.saltadores = nuevoArray;

            System.out.println("El saltador " + saltador.informacion() + " ha saltado");
        }
        else 
        {
            System.out.println("No quedan saltadores en el avion");
        }
    }

    public String saltadores()
    {
        String resultado = "Saltadores\n";

        for (int i = 0; i < saltadores.length; i++)
        {
            resultado += saltadores[i].informacion() + "\n";
        }
        return resultado;
    }

    public String informacionVuelo()
    {
        return "\n\n----- Vuelo -------\n" + "Codigo: " + this.numeroSalto + this.piloto.informacion() + 
        this.avion + "\nFecha del vuelo: " + this.fechaSalto + "\nSaltadores: " + 
        this.saltadores.length + "\n-------------------------------------------------\n" + saltadores();
    }

    public String ordenSalto()
    {
        String resultado = "";

        for (int i = saltadores.length-1; i >=0 ; i--)
        {
            resultado += saltadores[i].getNombre() + " (" + saltadores[i].getAlturaSalto() + ")  |  ";
        }

        return resultado;
    }

}
