package ARRAY;

import java.util.Scanner;

public class EjArray8 {

    public static void main(String[] args) {

        double[] temperaturas = new double[12];

        String[] meses = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};

        rellenaTemperatura(meses, temperaturas);

        pintarValores(meses, temperaturas);

    }

    // FUNCIONES:

    // Pregunta temperaturas y rellena array con sus valores
    static void rellenaTemperatura(String[] arrayMeses, double[] arrayTemp)
    {
        Scanner sc = new Scanner(System.in);
        double temperatura = 0;

        for(int aux=0; aux < arrayMeses.length; aux++)
        {
            System.out.println("Introduce la temperatura media de " + arrayMeses[aux] + ":");
            temperatura = sc.nextDouble();

            arrayTemp[aux] = temperatura;
        }
        sc.close();  
    }

 
    // Función para pintarlo como columnas
    static void pintarValores(String[] arrayMeses, double[] arrayTemp)
    {
        for(int aux=0; aux < arrayMeses.length; aux++)
        {
            System.out.print(arrayMeses[aux]); // imprime el mes
            System.out.print("(" + arrayTemp[aux] + "):"); // imprime la temperatura
            
            for (int i = 1; i <= (int)(arrayTemp[aux]) ; i++) // imprime un asterisco por cada grado
            {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}