package EXAMEN;
import java.util.Scanner;

public class TareaPractica3 { // Para buscar por el parentesis tengo que escaparlo "\\("

    /*
     * Utilizando el texto siguiente realiza lo siguiente:

Muchos años después,
frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de
recordar aquella tarde remota en que su padre lo llevó a conocer el
hielo. (Cien años de soledad. G. García Márquez).

    Mostrar la información del libro sabiendo que aparece despues del simbolo '(' : "Libro: Cien años de soledad. G. García Márquez"
    Busca un número random entre 0 y el número total de caracters  y muestralo por pantalla. El caracter en la posicion X es:
    Trocea el texto en palabras y devuelve la palabra que esté en la posición que indique un número aleatorio entre 0 y el número de palabras. -> La palabra en la posición x es: XXXX
    Preguntar :¿Como se llamaba el coronel? y si responde su nombre o su apellido o ambos, sin tener en cuenta las  mayúsculas/minúsculas) indicar que se ha acertado la pregunta, en caso contrario, decir que no es esa la persona
     */

    public static void main(String[] args) {
        
        String texto = "Muchos años después, frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de recordar aquella tarde remota en que su padre lo llevó a conocer el hielo. (Cien años de soledad. G. García Márquez).";
        System.out.println(texto);


        // Busco el nombre del libro a partir del ( y lo muestro:
        int parentesis1 = texto.indexOf('(');
        int parentesis2 = texto.indexOf(')');
        String libro = texto.substring(parentesis1+1, parentesis2);
        System.out.println("Libro: "+libro);



        // Calculo el numero de caracteres totales y la última posición:
        int longitud = texto.length();
        int posicionMax = longitud-1;
        // Genero un numero aleatorio de 0 a la ultima posición:
        int numeroRandom = (int)(Math.random()*posicionMax);
        // Localizo el caracter en esa posición aleatoria:
        char caracter = texto.charAt(numeroRandom);
        // Lo imprimo mostrando la posición aleatoria y el caracter correspondiente:
        System.out.println("El caracter en la posición "+numeroRandom+" es: \'"+caracter+"\'");



        // Creo un Array de palabras separando por cada espacio
        String[] textoPalabras = texto.split(" ");
        // Cuento las partes del array y genero un numero aleatorio de 0 a ese numero
        int cantidadDePalabras = textoPalabras.length;
        int numeroPalabra = (int)(Math.random()*cantidadDePalabras);
        // Imprimo la palabra en la posición aleatoria:
        System.out.println("La palabra en la posición "+ numeroPalabra +" es: \""+ textoPalabras[numeroPalabra] +"\"");



        // Pregunto el nombre del coronel:
        System.out.println("¿Como se llamaba el coronel?");
        Scanner sc = new Scanner(System.in);
        String nombreBuscado = sc.nextLine();
        // Declaro como String las 3 posibilidades del nombre para comparar despues:
        String nombre1 = "Aureliano";
        String nombre2 = "Buendia";
        String nombre3 = "Aureliano Buendia";
        // Comparo en una ternaria el nombre introducido con las 3 posibilidades e imprimo:
        System.out.println((nombreBuscado.compareToIgnoreCase(nombre1) == 0) || (nombreBuscado.compareToIgnoreCase(nombre2) == 0) || (nombreBuscado.compareToIgnoreCase(nombre3) == 0) ? "Exacto, has acertado." : "Te equivocas, ese no es el coronel");

        sc.close();
    }
}
