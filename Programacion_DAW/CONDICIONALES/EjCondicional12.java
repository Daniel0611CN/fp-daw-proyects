package CONDICIONALES;
import java.util.Scanner;

public class EjCondicional12 { // Ej tipo TEST 5 preguntas de 2 puntos
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // declaro mi contador:
        float puntuacion = 0;
        int acertadas = 0;
        int falladas = 0;

        System.out.println("pregunta 1 (T/F)");
        String respuesta = sc.nextLine();

        if (respuesta.equals("T")){
            puntuacion = puntuacion +2;
            acertadas++;
        }
        else{
            puntuacion = puntuacion - 0.5f;
            falladas++;
        }

        System.out.println("pregunta 2 (T/F)");
        respuesta = sc.nextLine();
        if (respuesta.equals("T")){
            puntuacion = puntuacion +2;
            acertadas++;
        }
        else{
            puntuacion = puntuacion - 0.5f;
            falladas++;
        }

        System.out.println("pregunta 3 (T/F)");
        respuesta = sc.nextLine();
        if (respuesta.equals("T")){
            puntuacion = puntuacion +2;
            acertadas++;
        }
        else{
            puntuacion = puntuacion - 0.5f;
            falladas++;
        }

        System.out.println("pregunta 4 (T/F)");
        respuesta = sc.nextLine();
        if (respuesta.equals("T")){
            puntuacion = puntuacion +2;
            acertadas++;
        }
        else{
            puntuacion = puntuacion - 0.5f;
            falladas++;
        }

        System.out.println("pregunta 5 (T/F)");
        respuesta = sc.nextLine();
        if (respuesta.equals("T")){
            puntuacion = puntuacion +2;
            acertadas++;
        }
        else{
            puntuacion = puntuacion - 0.5f;
            falladas++;
        }

        // Controlo no tener notas negativas:
        if (puntuacion <0){
            puntuacion = 0;
        }

        System.out.println("nota: " + puntuacion);
        System.out.println("acertadas: " + acertadas);
        System.out.println("falladas: " + falladas);

        sc.close();
    }
}
