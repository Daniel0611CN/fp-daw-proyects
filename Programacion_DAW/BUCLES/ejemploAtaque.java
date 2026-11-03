package BUCLES;

public class ejemploAtaque {
    public static void main(String[] args) {
        

        // VARIABLES FIJAS:
        final int VIDA_CONAN = 4;
        final int ATAQUE_ZOMBI = 50;
        final int DEFENSA_ZOMBI = 70; 

        // VARIABLES:
        int arma = 0;
        boolean salir = false;
        int ataqueConan = 0;
        int defensaConan = 0;
        int ataqueZombi = 0;
        int defensaZombi = 0;
        int numeroZombis = 0;
        int vidaZombi = 0;
        int contadorVidasConan = VIDA_CONAN;
        int contadorZombis = 1;
        char otraPartida = ' ';

        int ataqueC = 0;
        int defensaZ = 0;



       ataqueConan = 61;
       defensaConan = 41;

       ataqueC = (int) (Math.random() * ataqueConan);
       System.out.println("Conan ataca: " + ataqueC);

       defensaZ = (int) (Math.random() * DEFENSA_ZOMBI);
       System.out.println("Zombie \"" + contadorZombis + "\" defiende: " + defensaZ);



    }
}
