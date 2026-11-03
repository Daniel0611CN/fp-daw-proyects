package MATH;

public class EjercicioMath7{ // Tres jugadores tiran un dado (1 al 6)

    // Muestra la tirada de cada uno de ellos y quien ha sacado el numero mayor:

    // Si hay empate muestra EMPATE
    
    public static void main(String[] args) {
    
        // Genero tres numeros aleatorios entre 1 y 6:
        int jugador1 = (int) (Math.random()*6+1);
        int jugador2 = (int) (Math.random()*6+1);
        int jugador3 = (int) (Math.random()*6+1);

        // Muestro las 3 tiradas:
        System.out.println("El jugador 1 saca: " + jugador1);
        System.out.println("El jugador 2 saca: " + jugador2);
        System.out.println("El jugador 3 saca: " + jugador3);

        // Busco el máximo: (Uso una variable acumulador)
        int resultadoMaximo = Math.max(jugador1, jugador2);  
        resultadoMaximo = Math.max(resultadoMaximo, jugador3);

        // Tambien se podría hacer todo en una misma línea:
        // int resultadoMax2 = Math.max(jugador3, Math.max(jugador1, jugador2));

        System.out.println("La tirada mayor es: " + resultadoMaximo);

        // Busco si hay un empate:
        boolean empate = (jugador1 == jugador2) || (jugador2 == jugador3) || (jugador1 == jugador3);

        System.out.println((empate)? "Hay un empate en las tiradas" : "");


    
}
}
