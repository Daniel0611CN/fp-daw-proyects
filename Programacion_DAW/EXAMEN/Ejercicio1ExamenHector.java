package EXAMEN;
import java.util.Scanner;

public class Ejercicio1ExamenHector { 

    /* Dado el siguiente texto:
"El Viajero a través del Tiempo (pues convendrá llamarle así al hablar de él) nos exponía una misteriosa cuestión. Sus ojos grises brillaban lanzando centellas, y su rostro, habitualmente pálido, mostrábase
encendido y animado. El fuego ardía fulgurante y el suave resplandor de las lámparas incandescentes, en forma de lirios de plata, se prendía en las burbujas que destellaban y subían dentro de nuestras copas.
Nuestros sillones, construidos según sus diseños, nos abrazaban y acariciaban en lugar de someterse a que nos sentásemos sobre ellos; y había allí esa sibarítica atmósfera de sobremesa, cuando los pensamientos vuelan gráciles, libres de las trabas de la exactitud.(La maquina del tiempo, H.G.Wells)"

Debes:
a) Encontrar el carácter que se encuentra en una posición aleatoria. Si es un espacio mostrar espacio.
b) Leer un carácter y reemplazar todas las apariciones de 'e' por este nuevo carácter.
c) Indica al usuario que indique una palabra y busca dicha palabra en el texto. El programa debe indicar si está o no dicha palabra en el texto. Debe de no distinguir entre mayúsculas y minúsculas
     */

    public static void main(String[] args) {
        
        String texto = "El Viajero a través del Tiempo (pues convendrá llamarle así al hablar de él) nos exponía una misteriosa cuestión. Sus ojos grises brillaban lanzando centellas, y su rostro, habitualmente pálido, mostrábase encendido y animado. El fuego ardía fulgurante y el suave resplandor de las lámparas incandescentes, en forma de lirios de plata, se prendía en las burbujas que destellaban y subían dentro de nuestras copas. Nuestros sillones, construidos según sus diseños, nos abrazaban y acariciaban en lugar de someterse a que nos sentásemos sobre ellos; y había allí esa sibarítica atmósfera de sobremesa, cuando los pensamientos vuelan gráciles, libres de las trabas de la exactitud.(La maquina del tiempo, H.G.Wells)";
        System.out.println(texto);

        // Calculo el numero de caracteres totales y la última posición:
        int longitud = texto.length();
        int posicionMax = longitud-1;
        // Genero un numero aleatorio de 0 a la ultima posición:
        int numeroRandom = (int)(Math.random()*posicionMax);
        // Localizo el caracter en esa posición aleatoria:
        char caracter = texto.charAt(numeroRandom);
        
        // Controlo si es un espacio:
        boolean esEspacio = Character.isSpaceChar(caracter);

        // Lo imprimo mostrando la posición aleatoria y el control del espacio con una ternaria:
        System.out.println((esEspacio == true) ? "ESPACIO" : "El caracter en la posición "+numeroRandom+" es: \'"+caracter+"\'");

        Scanner sc = new Scanner(System.in);

        // Pido caracter:
        System.out.println("Introduce un caracter");
        char caracterUsuario = sc.nextLine().charAt(0);

        // Reemplazo la 'e':
        char charReemplazado = 'e';
        System.out.println(texto.replace(charReemplazado, caracterUsuario));

        // Pido la palabra a buscar:
        System.out.println("Introduce la palabra que quieres buscar:");
        String cadenaBuscada = sc.nextLine();

        // Todo a minusculas:
        String textoMinuscula = texto.toLowerCase();
        String cadenaMinuscula = cadenaBuscada.toLowerCase();

        // Veo si está o no:
        boolean esta = (textoMinuscula.indexOf(cadenaMinuscula) >= 0); 
        // Imprimo el resultado:
        System.out.println((esta) ? cadenaBuscada + " Sí aparece en el texto." : cadenaBuscada + " No está.");


        sc.close();
    }
}
