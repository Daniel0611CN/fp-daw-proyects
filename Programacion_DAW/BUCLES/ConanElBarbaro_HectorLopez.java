package BUCLES;

import java.util.Scanner;

public class ConanElBarbaro_HectorLopez {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // VARIABLES FIJAS:
        final int VIDA_CONAN = 4;
        final int ATAQUE_ZOMBI = 50;
        final int DEFENSA_ZOMBI = 70;
        final int ATAQUE_CONAN_1 = 61;
        final int DEFENSA_CONAN_1 = 41;
        final int ATAQUE_CONAN_2 = 71;
        final int DEFENSA_CONAN_2 = 31;
        final int ATAQUE_CONAN_3 = 31;
        final int DEFENSA_CONAN_3 = 71;

        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_RESET = "\u001B[0m";

        // VARIABLES:
        int arma = 0;
        boolean salir = false;
        int ataqueConan = 0;
        int defensaConan = 0;
        int maxAtaqueConan = 0;
        int maxDefensaConan = 0;
        int minDefensaConan = 0;
        int ataqueZombi = 0;
        int defensaZombi = 0;
        int numeroZombis = 0;
        int contadorVidasConan = 0;
        int contadorZombis = 0;
        char otraPartida = ' ';
        int contadorGanadas = 0;
        int contadorPerdidas = 0;

        // BUCLE PARTIDA:
        while (!salir)
        {
            contadorVidasConan = VIDA_CONAN; // Reinicio las vidas de Conan para cada partida
            contadorZombis = 1; // Inicializo el contador de Zombis para cada partida

                        // ELEGIR ARMA:
            // Espada a 2 Manos:        Ataque 60 y Defensa 40
            // Hacha:                   Ataque 70 y Defensa 30
            // Espada corta y escudo:   Ataque 30 y Defensa 70
            System.out.println(ANSI_PURPLE + "BIENVENIDO A LA BATALLA DE CONAN EL BÁRBARO");
            System.out.println("Conan debe conseguir el tesoro, y para ello deberá adentrarse en el castillo repleto de Zombies y salir con vida" + ANSI_RESET);

            System.out.println("Elije un arma para Conan:");
            System.out.println("Pulsa 1 para Espada a 2 manos");
            System.out.println("Pulsa 2 para Hacha");
            System.out.println("Pulsa 3 Espada corta y Escudo");
            arma = sc.nextInt();

            System.out.println(ANSI_GREEN + " * * BUENA SUERTE * * " + ANSI_RESET);

            // Declaro ataque y defensa para cada arma:
            switch (arma){
                case 1:
                    maxAtaqueConan = ATAQUE_CONAN_1;
                    maxDefensaConan = DEFENSA_CONAN_1;
                    break;
                case 2:
                    maxAtaqueConan = ATAQUE_CONAN_2;
                    maxDefensaConan = DEFENSA_CONAN_2;
                    break;
                case 3:
                    maxAtaqueConan = ATAQUE_CONAN_3;
                    maxDefensaConan = DEFENSA_CONAN_3;
                    minDefensaConan = 30; // Cuando lleva escudo declaro un minimo de defensa
                    break;
                default:
                    maxAtaqueConan = ATAQUE_CONAN_1;
                    maxDefensaConan = DEFENSA_CONAN_1;
                    break;
            }

            // nº Zombis:
            numeroZombis = (int)(Math.random()*6+5);

            // BATALLA
            boolean conanEstaAtacando = true;

            // DUELO CON CADA ZOMBI:
            while (contadorVidasConan > 0 && contadorZombis <= numeroZombis) // Termina cuando muere el zombi, o Conan pierda todas sus vidas
            {
                if (conanEstaAtacando)
                {
                    ataqueConan = (int)(Math.random()*maxAtaqueConan);
                    System.out.println("Conan ataca: " + ataqueConan);

                    defensaZombi = (int)(Math.random()*DEFENSA_ZOMBI);

                    if (ataqueConan >= maxAtaqueConan-10)
                    {
                        System.out.println(ANSI_RED + "¡¡FATALITY!!" + ANSI_RESET);
                        contadorZombis++;
                        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
                    }
                    else
                    {
                        System.out.println("Zombie \"" + contadorZombis + "\" defiende: " + defensaZombi);

                        if (ataqueConan > defensaZombi)
                        {
                            System.out.println("El zombie \"" + contadorZombis + "\" ha muerto");
                            System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
                            contadorZombis++;
                        }
                        else
                        {
                            conanEstaAtacando = false;
                        }
                    }
                }
                else
                {
                    ataqueZombi = (int)(Math.random()*ATAQUE_ZOMBI);
                    System.out.println("Zombie \"" + contadorZombis + "\" ataca: " + ataqueZombi);

                    defensaConan = Math.max((int)(Math.random()*maxDefensaConan), minDefensaConan); // Si sale valor menor de 30 me quedo con el mínimo establecido usando el max de 2 valores
                    System.out.println("Conan defiende: " + defensaConan);

                    if (ataqueZombi > defensaConan)
                    {
                        contadorVidasConan--;
                        System.out.println("Conan pierde una vida... le quedan " + contadorVidasConan + " vidas.");
                    }
                    conanEstaAtacando = true;
                }
            }
            
            if (contadorVidasConan > 0) // Añado contador de partidas ganadas y perdidas (los muestro solo al salir del juego)
            {
                System.out.println(" * * CONAN LOGRA EL TESORO TRAS ANIQUILAR A TODOS LOS ZOMBIES * * ");
                contadorGanadas++;
            }
            else if (contadorVidasConan == 0)
            {
                System.out.println(ANSI_RED + " * * * * * \n GAME OVER \n * * * * * " + ANSI_RESET);
                contadorPerdidas++;
            }

            // Limpio Buffer despues de leer nº
            sc.nextLine();

            System.out.println("¿Quieres jugar otra vez? (s para SI / n para NO)");
            otraPartida = sc.nextLine().toLowerCase().charAt(0);

            if (otraPartida == 'n')
            {
                salir = true;
                System.out.println("Has ganado " + contadorGanadas + " partidas, y perdido " + contadorPerdidas + " en total.");
            }
        }

        sc.close();
    }
}