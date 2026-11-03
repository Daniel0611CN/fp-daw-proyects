package CLASES_T6.Clases;

public class Guitarra extends Instrumento{

        // ATRIBUTOS:
    // No tiene atributos, porque lo que especifica cada instrumento es como se interpretan las notas en este caso.

    // CONSTRUCTOR:
    // Llama al constructor del padre:
    public Guitarra()
    {
        super();
    }


    // METODOS:
    public void interpretar()
    {
        for (Notas notas : melodia)
        {
            switch(notas)
            {
                case DO:
                    System.out.println("Dooooooo ");
                    break;
                case RE:
                    System.out.println("Reeeeeee ");
                    break;
                case MI:
                    System.out.println("Miiiiiii ");
                    break;
                case FA:
                    System.out.println("Faaaaaaa ");
                    break;
                case SOL:
                    System.out.println("Sooooool ");
                    break;
                case LA:
                    System.out.println("Laaaaaa ");
                    break;
                case SI:
                    System.out.println("Siiiiii ");
                    break;
            }       
        }
    }
    
    
}
