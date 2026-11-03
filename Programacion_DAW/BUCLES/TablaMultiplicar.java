package BUCLES;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int repeticiones = 10;

        System.out.println("Tabla de multiplicar del número: ");
        num = sc.nextInt();

        for (int aux = 1; aux <= repeticiones; aux++)
        {
            System.out.println(aux + " x " + num + " = " + (aux*num));
        }

        sc.close();
    }
}
