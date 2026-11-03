package EXAMEN.examenClases_HectorLopez.personal;

import EXAMEN.examenClases_HectorLopez.material.Paracaidas;

public class Saltador extends Cliente{


    // ATRIBUTOS:
    private Paracaidas principal;
    private Paracaidas emergencias;


    // CONSTRUCTOR:
    public Saltador(Cliente cliente, Paracaidas uno, Paracaidas dos)
    {
        super(cliente.nombre, cliente.apellidos, cliente.getTlf(), cliente.getAlturaSalto(), cliente.isSeguro());

        this.principal = uno;
        this.emergencias = dos;
    }

}
