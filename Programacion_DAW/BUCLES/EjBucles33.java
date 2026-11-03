package BUCLES;

import java.util.Scanner;

public class EjBucles33 { // U con asteriscos
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduca la altura de la U:");
        int altura = sc.nextInt();

        // PRIMER BUCLE QUE NOS DA LA ALTURA DE LA U:
        for (int alt = 1; alt <= altura; alt++)
        {
            for (int ancho = 1; ancho <= altura; ancho++) //BUCLE QUE PINTA CADA LÍNEA:
            {
                if (alt != altura && (ancho == 1 || ancho == altura))
                {
                    System.out.print("*");
                }
                else if (alt != altura && ancho > 1 && ancho < altura)
                {
                    System.out.print(" ");
                }

                if (alt == altura && (ancho == 1 || ancho == altura))
                {
                    System.out.print(" ");
                }
                else if (alt == altura && ancho > 1 && ancho < altura)
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }


        sc.close();
    }
}
