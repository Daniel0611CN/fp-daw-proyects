package STRING;
import java.util.Scanner;

public class EjercicioString5 { // Leer caracter y sustituirlo
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       String textoOriginal = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda. El resto della concluían sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo, y los días de entresemana se honraba con su vellorí de lo más fino. Tenía en su casa una ama que pasaba de los cuarenta y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza que así ensillaba el rocín como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta años. Era de complexión recia, seco de carnes, enjuto de rostro, gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre de «Quijada», o «Quesada», que en esto hay alguna diferencia en los autores que deste caso escriben, aunque por conjeturas verisímiles se deja entender que se llamaba «Quijana». Pero esto importa poco a nuestro cuento: basta que en la narración dél no se salga un punto de la verdad.";
        
       System.out.println("Introduce el texto que quieres buscar");
       String textoBuscado = sc.nextLine();

        int posicion1 = textoOriginal.indexOf(textoBuscado);
        int posicion2 = textoOriginal.indexOf(textoBuscado, posicion1+1);

        System.out.println("El texto \"" + textoBuscado + "\" está en la posición " + posicion1 + " y en la posición " + posicion2);

        /* Tambien podemos usar Split para crear un array 
        *  con todos los trozos iguales encontrados
        *  y así calcular el numero de veces que aparece de una sola vez */
       
        String[] trozos = textoOriginal.split(textoBuscado);
        int cantidadTrozos = trozos.length;

        System.out.println("El texto buscado aparece " + cantidadTrozos + " veces.");


        sc.close();
    }
}
