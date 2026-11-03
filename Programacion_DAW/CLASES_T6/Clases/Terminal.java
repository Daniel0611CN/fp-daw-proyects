package CLASES_T6.Clases;

public class Terminal {
    
    //ATRIBUTOS:
    private String numero;
    private int segLlamadas;


    //CONSTRUCTORES:
    public Terminal(String numero)
    {
        this.numero = numero;
        this.segLlamadas = 0;
    }

    
    //METODOS:
    public String getNumero()
    {
        return numero;
    }

    public int getSegundos()
    {
        return segLlamadas;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSegLlamadas(int segLlamadas) {
        this.segLlamadas = segLlamadas;
    }

    public void llama(Terminal receptor, int tiempo)
    {
        this.setSegLlamadas(this.getSegundos() + tiempo);
        
        receptor.setSegLlamadas(receptor.getSegundos() + tiempo);
    }

    @Override
    public String toString()
    {
        String registro = "Nº " + this.numero + " - " + this.segLlamadas + "s de conversación";
        
        return registro;
    }

}

