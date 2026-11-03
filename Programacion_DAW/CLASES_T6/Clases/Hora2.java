package CLASES_T6.Clases;

public class Hora2 {
    
    // ATRIBUTOS:
    private int hora;
    private int minutos;


    // CONSTRUCTORES:
    public Hora2(int h, int minutos)
    {
        if(hora>=0 && hora<=23)
        {
            this.hora = h;
        }
        else 
        {
            this.hora = 0;
        }

        if(minutos>=0 && minutos<60)
        {
            this.minutos = minutos;
        }
        else 
        {
            this.minutos = 0;
        }
    }


    // METODOS:
    public int getHora2()
    {
        return hora;
    }

    public int getMinutos2()
    {
        return minutos;
    }

    public void inc()
    {
        this.minutos++;

        if(this.minutos>=60)
        {
            this.hora++;

            this.minutos-=60;
        }
    }

    public boolean setHora2(int hora)
    {

        boolean setHora = false;

        if(hora<=23)
        {
            this.hora = hora;
            setHora = true;
        }

        return setHora;
    }

    public boolean setMinutos2(int minutos)
    {
        
        boolean setMin = false;

        if(minutos<60 && minutos>=0)
        {
            this.minutos = minutos;
            setMin = true;
        }

        return setMin;
    }

    @Override
    public String toString()
    {
        String horaActual = hora + ":" + minutos;
        
        return horaActual;
    }

    @Override
    public boolean equals(Object objeto)
    {
        Hora2 hora = (Hora2)objeto;

        boolean iguales = true;

        if(!(this.hora == hora.getHora2()))
        {
            iguales = false;
        }
        else if(!(this.minutos == hora.getMinutos2()))
        {
            iguales = false;
        }

        return iguales;
    }

}
