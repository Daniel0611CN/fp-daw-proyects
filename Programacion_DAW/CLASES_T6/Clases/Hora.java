package CLASES_T6.Clases;

public class Hora {
    
    // ATRIBUTOS:
    private int hora;
    private int minutos;
    private int segundos;


    // CONSTRUCTORES:
    public Hora(int h)
    {
        this.hora = h;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Hora(int h, int seg)
    {
        if(hora>=0 && hora<=23)
        {
            this.hora = h;
        }
        else 
        {
            this.hora = 0;
        }
        this.minutos = 0;
        this.segundos = 0;
    }


    // METODOS:
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora<=23)
        {
            this.hora = hora;
        }
        else 
        {
            setHora(0);
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        
        if(minutos<60)
        {
            this.minutos = minutos;
        }
        else 
        {
            setHora(getHora()+1);
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos)
    {
        if(segundos<60)
        {
            this.segundos = segundos;
        }
        else 
        {
            this.segundos = 0;
            setMinutos(getMinutos()+1);
        }
    }


        @Override
    public String toString()
    {
        String horaActual = hora + ":" + minutos + ":" + segundos;
        
        return horaActual;
    }




}
