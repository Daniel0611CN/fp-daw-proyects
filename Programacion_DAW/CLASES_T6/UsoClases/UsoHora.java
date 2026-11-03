package CLASES_T6.UsoClases;

import java.util.Scanner;

import CLASES_T6.Clases.Hora;

public class UsoHora {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que horas quieres crear?");
        int horas = sc.nextInt();

        System.out.println("¿Cuantos segundos quieres mostrar?");
        int segundos = sc.nextInt();


        Hora nuevaHora = new Hora(horas);

        for (int i = 0; i <= segundos; i++)
        {
            System.out.println(nuevaHora);

            nuevaHora.setSegundos(nuevaHora.getSegundos()+1);
        }

    }

    // FUNCIONES:

    static void horas(String turno)
    {

    }




}
