package CLASES_T6.Clases;

public class HoraExacta extends Hora2{
    
    //ATRIBUTOS:
    private int segundos;
    

    // CONTRUCTOR:
    public HoraExacta(int hora, int minuto, int segundo)
    {
        super(hora, minuto);
        this.segundos = segundo;
    }


    // METODOS:
    public boolean setSegundo2(int segundo)
    {
        boolean setSeg = false;

        if(segundo>=0 && segundo<60)
        {
            this.segundos = segundo;
            setSeg = true;
        }

        return setSeg;
    }

    // public void inc()
    // {
    //     this.segundos++;

    //     if(this.segundos>=60)
    //     {
    //         this.setMinutos2(this.getMinutos2() + 1);

    //         this.segundos-=60;
    //     }
    // }

    public void inc()
    {
        if(!setSegundo2(this.segundos+1))
        {
            setSegundo2(0);
            super.inc();
        }
    }

    @Override
    public boolean equals(Object objeto)
    {
        HoraExacta hora = (HoraExacta)objeto;

        boolean iguales = super.equals(hora);

        if(!(this.segundos == hora.segundos))
        {
            iguales = false;
        }

        return iguales;
    }

    @Override
    public String toString()
    {
        return super.toString() + ":" + this.segundos;
    }

}
