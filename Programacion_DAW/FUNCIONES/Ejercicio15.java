package FUNCIONES;

public class Ejercicio15 { // Primos entre 1 y 1000
    public static void main(String[] args) {
        
        System.out.println("Números primos entre 1 y 1000:\n");

        int primo = 1;
        System.out.println(primo);

        while (primo<1000)
        {
            primo = UtilesParaNumeros.siguientePrimo(primo);

            if(primo<1000)
            {
                System.out.println(primo);
            }
        }



        
    }        
}
