package CONDICIONALES;
public class Notas {
    public static void main(String[] args) {
        
        /*
         * Dada una nota numérica de 0 a 100
         * imprima su nota en letra
         * 0-4.9 -> Suspenso
         * 5-6.9 -> Aprobado
         * 7-8.9 -> Notable
         * 9-9.9 -> Sobresaliente
         * 10 -> Matrícula de Honor
         * CONTROLA QUE LA NOTA ES UN NUMERO ENTRE 0 Y 10
         */

        double notaAleatoria = Math.random()*10;

        if (notaAleatoria>=0 && notaAleatoria<=10) {

            if (notaAleatoria >= 0 && notaAleatoria <= 4.9){
                System.out.println("Suspenso");
            }
            if (notaAleatoria >= 5 && notaAleatoria <= 6.9){
                System.out.println("Aprobado");
            }
            if (notaAleatoria >= 7 && notaAleatoria <= 8.9){
                System.out.println("Notable");
            }
            if (notaAleatoria >= 9 && notaAleatoria <= 9.9){
                System.out.println("Sobresaliente");
            }
            if (notaAleatoria == 10){
                System.out.println("Matrícula de Honor");
            }

        }
        else {
            System.out.println("La nota introducida no es válida");
        }

        // OTRA FORMA DE HACERLO MUCHO MÁS SIMPLE (y sin anidar):

        String nota = ""; 
        String error = "";

        if (notaAleatoria < 5){
            nota = "Suspenso";
        }
        else if (notaAleatoria < 7){
            nota = "Aprobado";
        }
        else if (notaAleatoria < 9){
            nota = "Notable";
        }
        else if (notaAleatoria < 9.9){
            nota = "Sobresaliente";
        }
        else if (notaAleatoria == 10){
            nota = "Matrícula de Honor";
        }
        else {
            error = "La nota numerica no está bien";
        }
        System.out.println(notaAleatoria);

        // Muestro el resultado:
        if (error.length() > 0){
            System.out.println("error");
        }
        else{
            System.out.println("La nota es "+ notaAleatoria + "y has obtenido un "+ nota);
        }

    }
}
