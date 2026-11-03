package CLASES_T6.Clases;

import java.text.DecimalFormat;

public class Movil extends Terminal{

    public enum Tarifa{RATA, MONO, BISONTE}


    // ATRIBUTOS:
    private Tarifa tarifa;
    private int tiempoTarificado;


    // CONSTRUCTORES:
    public Movil(String numero, String tarifa)
    {
        super(numero);

        this.tarifa = Tarifa.valueOf(tarifa.toUpperCase());

        this.tiempoTarificado = 0;
    }
    

    // METODOS:
    @Override
    public void llama(Terminal receptor, int tiempo)
    {
        super.llama(receptor, tiempo);

        this.tiempoTarificado+= tiempo;
    }

    private double calculaCoste()
    {
        double coste = 0;

        switch(tarifa)
        {
            case RATA:
                coste = (this.tiempoTarificado*0.06)/60;
                break;
            case MONO:
                coste = (this.tiempoTarificado*0.12)/60;
                break;
            case BISONTE: 
                coste = (this.tiempoTarificado*0.3)/60;
                break;
            default:
                break;
        }
        return coste;
    }

    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("0.00");

        return super.toString() + " - tarificados " + df.format(this.calculaCoste()) + " euros"; 
    }

    
}
