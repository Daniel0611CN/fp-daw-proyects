package BUCLES;

import java.util.Scanner;

public class RelojArena {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean salida = false;
        int altura = 0;

        System.out.println("Introduce la altura del reloj (número impar mayor o igual a 3)");

        do{ // CONTROL DE VALOR CORRECTO DE ENTRADA:
            altura = sc.nextInt();

            if (altura >=3 && altura%2!=0)
            {
                salida = true;
            }
            else
            {
                System.out.println("Número erróneo, introduce otro:");
            }
        }while(!salida);

        System.out.println("altura elegida " + altura);




        

        sc.close();
    }
}
