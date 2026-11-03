package BUCLES;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int operacion = 0;
        double resultado = 0;
        int num1 = 0;
        int num2 = 0;

        do{
            System.out.println("ELIJE UNA OCIÓN:  (0 para salir del programa)");
            System.out.println("Suma (introduce 1)");
            System.out.println("Resta (2)");
            System.out.println("Multiplicación (3)");
            System.out.println("División (4)");
            operacion = sc.nextInt();
            
            if (operacion > 0 && operacion <= 4){
                System.out.println("Introduce el primer factor:");
                num1 = sc.nextInt();
                System.out.println("Introduce el segundo factor:");
                num2 = sc.nextInt();
            }

            switch (operacion){
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0){
                        resultado = num1 / num2;
                    }
                    else{
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Número erróneo");
                    break;
            }

            if (operacion > 0 && operacion <= 4){
                System.out.println("Resultado igual a: " + resultado);
            }

            sc.nextLine();
            System.out.println("Pulse una tecla para continuar");
            sc.nextLine();

        } while (operacion != 0);


        sc.close();
    }
}
