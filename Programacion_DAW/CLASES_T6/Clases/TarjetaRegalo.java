package CLASES_T6.Clases;

import java.text.DecimalFormat;

public class TarjetaRegalo {
    

    //ATRIBUTOS
    private double saldo;
    private int codigo;

    //CONSTRUCTORES
    public TarjetaRegalo(double saldoInicial)
    {
        this.codigo = (int)(Math.random()*100000);
        this.saldo = saldoInicial;
    }

    //METODOS
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void gasta(double cantidad)
    {
        if(this.getSaldo()<cantidad)
        {
            System.out.println("No tiene suficiente saldo para gastar " + cantidad + "€");
        }
        else if(cantidad<0)
        {
            System.out.println("No puedes gastar una cantidad negativa");
        }
        else 
        {
            this.setSaldo(this.getSaldo() - cantidad);
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t2)
    {
        // sumo los saldos de las tarjetas:
        double total = this.getSaldo() + t2.getSaldo();

        // vuelco el total en una nueva tarjeta:
        TarjetaRegalo nueva = new TarjetaRegalo(total);

        // Borro el saldo de las dos tarjetas anteriores:
        this.setSaldo(0);
        t2.setSaldo(0);

        return nueva;
    }

    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        String desglose = "Tarjeta nº " + this.codigo + " - Saldo " + df.format(this.getSaldo()) + "€";
        
        return desglose;
    }

}
