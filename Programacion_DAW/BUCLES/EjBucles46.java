package BUCLES;

import java.util.Scanner;

public class EjBucles46 { // Rectángulo
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la anchura del rectángulo (mínimo 2):");
        int ancho = sc.nextInt();

        System.out.println("Introduce la altura del rectángulo (mínimo 2):");
        int alto = sc.nextInt();

        if (ancho == 2 || alto == 2)
        {
            System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo es igual a 2");
        }
        else
        {
            





        }

        sc.close();
    }
}
