package CLASES_T6.Clases;

public class Piramide {
    
    // ATRIBUTOS:
    private int altura;
    static private int piramidesCreadas;

    // CONSTRUCTORES:
    public Piramide(int altura)
    {
        this.altura = altura;

        piramidesCreadas++;
    }

    // MÉTODOS:
    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    @Override
    public String toString()
    {
        String piramide = "";

        for (int alturaActual = 1; alturaActual <= altura; alturaActual++)
        {
            for (int blancos = 1; blancos <= altura-alturaActual; blancos++)
            {
                piramide+= " ";
            }
            for (int asterisco = 1; asterisco <= (alturaActual*2)-1; asterisco++)
            {
                piramide+= "*";
            }
            piramide+= "\n";
        }

        return piramide;
    }

}
