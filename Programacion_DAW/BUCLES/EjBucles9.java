package BUCLES;

import java.util.Scanner;

public class EjBucles9 { // contador de dígitos
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        
        System.out.println("Introduce un número");
        int numero = sc.nextInt();

        while (numero > 0){
            numero = (int)(numero/10);
            contador ++;
        }

        System.out.println("Numero de digitos: " + contador);

        sc.close();
    }
}
