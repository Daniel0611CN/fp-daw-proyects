package EXAMEN;

import java.util.Scanner;

public class Ej2Exam2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int altura = 0;

        System.out.println("Introduce una altura:");
        altura = sc.nextInt();

        // Limpio Buffer despues de leer nº para leer luego texto
        sc.nextLine();

        System.out.println("Introduce una cadena de texto:");
        String texto = sc.nextLine();
        int largoTexto = texto.length();

        for (int aux = 1; aux <= altura; aux++)
        {
            if (aux%2==0)
            {
                for (int anc = 1; anc <= largoTexto+4; anc++)
                {
                    System.out.print("H");
                }
            }
            else
            {
                for (int anc = 1; anc <= largoTexto+4; anc++)
                {
                    System.out.print("A");
                }
            }
            System.out.println("");
        }

        System.out.println("XX" + texto + "XX");

        for (int aux = 1; aux <= altura; aux++)
        {
            if (aux%2==0)
            {
                for (int anc = 1; anc <= largoTexto+4; anc++)
                {
                    System.out.print("H");
                }
            }
            else
            {
                for (int anc = 1; anc <= largoTexto+4; anc++)
                {
                    System.out.print("A");
                }
            }
            System.out.println("");
        }

        sc.close();
    }   
}
