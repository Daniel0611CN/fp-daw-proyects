package EXAMEN;

import java.util.Scanner;

public class BuscarCadenas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String frase = "la vaca lola esta loca de la cabeza";
        String cadenaBuscada = "la";
        int posicion = 0;
        int contador2 = 0;


        while (frase.toLowerCase().indexOf(cadenaBuscada, posicion) >= 0)
        {
                posicion = frase.toLowerCase().indexOf(cadenaBuscada, posicion);
                System.out.println("La cadena aparece en la posición: " + posicion);
                posicion++;
                contador2++;
        }
        System.out.println("La cadena \"" + cadenaBuscada + "\" aparece: " + contador2 + " veces");
        

        sc.close();
    }
}
