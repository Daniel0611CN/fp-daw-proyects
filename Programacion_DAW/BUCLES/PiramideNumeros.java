package BUCLES;

import java.util.Scanner;

public class PiramideNumeros { // Piramide de números
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número (altura de la pirámide):");
        int n = sc.nextInt();

        for (int contador = 1; contador <= n; contador++) //Altura de la Piramide:
        {
            // Bucle ESPACIOS
            for (int espacios = n-contador; espacios >= 1; espacios--)
            {
                System.out.print(" ");
            }
            // Bucle PARTE IZQUIERDA
            for (int parteIzq = 1; parteIzq <= contador; parteIzq++)
            {
                System.out.print(parteIzq);
            }
            // Bucle PARTE DERECHA
            for (int parteDcha = contador-1; parteDcha >= 1; parteDcha--)
            {
                System.out.print(parteDcha);
            }
            System.out.println("");
        }

        sc.close();

    }
}
