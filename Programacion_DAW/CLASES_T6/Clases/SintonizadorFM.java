package CLASES_T6.Clases;

public class SintonizadorFM {
    
    // ATRIBUTOS:
    private float emisora;


    // CONTRUSTORES:
    public SintonizadorFM()
    {
        setFrecuencia(80);
    }

    public SintonizadorFM(float emisora)
    {
        setFrecuencia(emisora);
    }

    // METODOS:
    public float getFrecuencia() {
        return emisora;
    }

    public void setFrecuencia(float emisora) {
        
        if (emisora > 108)
        {
            setFrecuencia(108);
        }
        else if(emisora < 80)
        {
            setFrecuencia(80);
        }
        else 
        {
            this.emisora = emisora;  
        }
    }

    public void up()
    {
        if(emisora + 0.5f > 108)
        {
            setFrecuencia(80);
        }
        else 
        {
            setFrecuencia(getFrecuencia()+0.5f);
        }
    }

    public void down()
    {
        if(emisora - 0.5f < 80)
        {
            setFrecuencia(108);
        }
        else 
        {
            setFrecuencia(getFrecuencia() - 0.5f);
        }
    }

    public void display()
    {
        System.out.println(getFrecuencia() + " MHz");
    }

}
