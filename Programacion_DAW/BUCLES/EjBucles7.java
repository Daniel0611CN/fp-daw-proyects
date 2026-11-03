package BUCLES;

import java.util.Scanner;

public class EjBucles7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final int CONTRASENA = 1234;
        int contador = 0;
        int clave = 0;

        do {
            System.out.println("Introduce la contraseña de la caja fuerte:");
            clave = sc.nextInt();

            if (CONTRASENA == clave){

                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            }
            else{
                System.out.println("Lo siento, esa no es la combinación");
            }
            contador++;

        } while (CONTRASENA != clave &&  contador < 4);

        sc.close();
    }
}
