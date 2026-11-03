package BUCLES;

import java.util.Scanner;

public class EjBucles10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int acumulador = 0;
        int numero = 0;
        // (float media = acumulador/contador;

        while (numero >= 0){
            System.out.println("Introduce un numero:");
            numero = sc. nextInt();
            
            if (numero > 0){
                acumulador = acumulador + numero;
                contador ++;
            }
            
        }

        if (contador > 0){
            System.out.println("La media de los " + contador + " números introducidos es " + (float)acumulador/contador);
        }
     
        sc.close();
    }
}
