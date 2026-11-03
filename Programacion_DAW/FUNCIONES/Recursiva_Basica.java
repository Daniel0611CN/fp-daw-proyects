package FUNCIONES;

public class Recursiva_Basica {

    public static void main(String[] args) {
        
        int numero = 10;

        int sumatorio = suma(numero);

        System.out.println("Sumatorio de " + numero + " es igual a " + sumatorio);

        int factorial = factorial(numero);

        System.out.println("Factorial de " + numero + " es igual a " + factorial);

        int altura = 4;

        pintarPiramide(altura);
    }



    static void pintarPiramide(int altura)
    {
        if(altura > 1) // LLAMADA RECURSIVA
        {
            pintaFila(altura);
            System.out.println(); // salto de linea
            pintarPiramide(altura-1);
        }
        else // CASO BASE
        {
            System.out.println("*");
        }
    }

    static void pintaFila(int numero) //numero = asteriscos que me quedan por pintar
    {
        if(numero == 0) // CASO BASE
        {
            System.out.print("");
        }
        else // LLAMADA RECURSIVA
        {
            System.out.print("*");
            pintaFila(numero-1);
        }
    }

    static int suma(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        else
        {
            return n + suma(n-1);
        }
    }

    static int factorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }


}
