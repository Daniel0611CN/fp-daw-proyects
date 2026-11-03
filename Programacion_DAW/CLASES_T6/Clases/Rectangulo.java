package CLASES_T6.Clases;

public class Rectangulo {
    
    // ATRIBUTOS:
    private int base;
    private int altura;
    static private int rectangulosCreados;

    // CONSTRUCTORES:
    public Rectangulo(int base, int altura)
    {
        this.base = base;
        this.altura = altura;

        rectangulosCreados++;
    }

    // METODOS:
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    @Override
    public String toString()
    {
        String resultado = "";

        for (int i = 0; i < this.getAltura(); i++)
        {
            for (int j = 0; j < this.getBase(); j++)
            {
                resultado += "*"; 
            }
            resultado += "\n";
        }

        return resultado;
    }

}
