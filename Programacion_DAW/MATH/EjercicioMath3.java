package MATH;

public class EjercicioMath3 {
    public static void main(String[] args) {
        
        double aleatorio1 = Math.random();
        System.out.println(aleatorio1);

        // Así se haría con lógica booleana

        String cercaDe1 = "El número aleatorio está más cerca de 1";
        String lejosDe1 = "El número aleatorio está más cerca de 0";

        System.out.println((aleatorio1 >= 0.5) ? cercaDe1 : lejosDe1);

        // Tambien se puede hacer con una función matemática Round

        System.out.println("Está más cerca de: " + Math.round(aleatorio1));


    }
}
