import java.util.Scanner;

public class Ejercicio12 { // ¿Podemos salir a la calle?
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Cumplir que no esté lloviendo y que hayamos terminado nuestras tareas
        // Si vamos a la biblioteca podemos salir siempre
        // Hay que hacer las 3 preguntas

        System.out.println("¿Está lloviendo?");
        boolean Llueve = sc.nextBoolean();

        System.out.println("¿Has terminado las tareas?");
        boolean Tareas = sc.nextBoolean();

        System.out.println("¿Necesitas ir a la biblioteca?");
        boolean Biblioteca = sc.nextBoolean();


        boolean SalesALaCalle = (!Llueve && Tareas) || Biblioteca;

        System.out.println("PUEDES IR A LA CALLE: " + SalesALaCalle);

        // Introcimos una ternaria en el mismo mensaje

        System.out.println((SalesALaCalle) ? "Puedes salir" : "Te quedas en casa");


        sc.close();
    }
}
