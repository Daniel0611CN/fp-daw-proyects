package CONDICIONALES;
import java.util.Scanner;

public class EjGranja {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double comidaDiaria = 0; // (kilos)
        int numAnimales = 0;
        double kilosPorAnimal = 0;
        double comidaNecesaria = 0;

        System.out.println("¿Cuantos kilos de comida tienes?");
        comidaDiaria = sc.nextDouble();

        System.out.println("¿Cuantos animales hay en la granja?");
        numAnimales = sc.nextInt();

        System.out.println("¿Cuantos kilos come cada animal?");
        kilosPorAnimal = sc.nextDouble();

        comidaNecesaria = numAnimales * kilosPorAnimal;

        if (comidaDiaria >= comidaNecesaria){
            System.out.println("Hay comida suficiente para todos los animales");
        }
        else{
            double pocaComida = comidaDiaria/numAnimales;
            System.out.println("Solo hay "+pocaComida+" kilos de comida para cada animal");
            System.out.println("Debes comprar "+ (comidaNecesaria-comidaDiaria) +" kilos de comida para llegar a la cantidad diaria necesaria.");
        }
        sc.close();
    }
}
