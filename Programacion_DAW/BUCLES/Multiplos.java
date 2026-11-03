package BUCLES;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Hasta que número quieres saber los multiplos?");
        int ene = sc.nextInt();

        int contador = 0;

        for (int aux = 7; aux <= ene; aux+=7){
            contador++;
            System.out.println("Multiplo número " + contador + " igual a " + aux);
        }


        sc.close();
    }
}
