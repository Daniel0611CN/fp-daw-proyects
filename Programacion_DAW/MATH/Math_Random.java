package MATH;

import java.util.Scanner;

public class Math_Random {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


    // Un random siempre genera un DECIMAL ENTRE 0 Y 1 (sin llegar ni a 0 ni a 1)
        double aleatorio1 = Math.random();
        System.out.println(aleatorio1);

        // Así se controlaría el resultado con lógica booleana
        String cercaDe1 = "El número aleatorio está más cerca de 1";
        String lejosDe1 = "El número aleatorio está más cerca de 0";
        System.out.println((aleatorio1 >= 0.5) ? cercaDe1 : lejosDe1);

    // ROUND -> Tambien se puede hacer con una función matemática Round (REDONDEAR)
        System.out.println("Está más cerca de: " + Math.round(aleatorio1));

        //-----------------------------------------------------------------------------

    // CEIL -> Inmediatamente superior:
        System.out.println("Escribe un número de segundos:");
        double segundosUsuario = sc.nextDouble();
        double minutos = segundosUsuario/60;
        // Si lo haces con un int, el valor minutos no tiene decimales y no se puede hacer ceil (siempre queda igual)

        System.out.println("Estamos en el minuto: " + Math.ceil(minutos));

        //-----------------------------------------------------------------------------

        // OBTENER LA PARTE ENTERA DE UN DECIMAL:

    // FLOOR -> Inmediatamente inferior:
        double PI = 3.141592653589793;
        System.out.println("Parte entera de PI: " + Math.floor(PI));

    // (INT) -> casteando el decimal a Int: (Pi a entero)
        int parteEntera = (int) Math.PI;
        System.out.println(parteEntera);

        //-----------------------------------------------------------------------------

    // RANDOM con rango definido: (casteado a entero)
        int jugador1 = (int) (Math.random()*6+1); // Numeros aleatorios entre 1 y 6:
        int jugador2 = (int) (Math.random()*6+1);
        int jugador3 = (int) (Math.random()*6+1);

    // MAX -> maximo entre dos valores (Uso una variable acumulador)
        int resultadoMaximo = Math.max(jugador1, jugador2);  
        resultadoMaximo = Math.max(resultadoMaximo, jugador3);

        // Tambien se podría hacer todo en una misma línea:
        int resultadoMax2 = Math.max(jugador3, Math.max(jugador1, jugador2));

        System.out.println("La tirada mayor es: " + resultadoMaximo);
        System.out.println("La tirada mayor es: " + resultadoMax2);

        //-----------------------------------------------------------------------------
        
    // MIN -> minimo entre dos numeros:
        double minimo = Math.min(parteEntera, PI);
        System.out.println("Entre decimal y parte entera, el mínimo es: "+minimo);

        //-----------------------------------------------------------------------------

    // POW -> Potencias:
        int numero = 4;
        int exponente = 3;
        System.out.println(Math.pow(numero, exponente));

        //-----------------------------------------------------------------------------

    // SQRT -> Raiz cuadrada:
        System.out.println(Math.sqrt(16));

        //-----------------------------------------------------------------------------

    // RANDOM REPASO:
        int numAleatorio = (int)(Math.random()*100+1); // Entre 1 y 100
        int ataqueConan = (int)(Math.random()*71); // Entre 0 y 70
        int numeroZombis = (int)(Math.random()*6+5); // Entre 5 y 10 -> 5,6,7,8,9,10 (6 valores)

        sc.close();
    }
}
