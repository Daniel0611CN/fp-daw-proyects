package EXAMEN;
import java.util.Scanner;

public class Tipo2 {

    public static void main(String[] args) {
        
        String texto = "Crearía un perfume que no sólo fuera humano, sino sobrehumano."+ 
        "Un aroma de ángel, tan indescriptiblemente bueno y pletórico de vigor"+ 
        "que quien lo oliera quedaría hechizado y no tendría más remedio que amar"+ 
        "a la persona que lo llevara, o sea, amarle a él, Grenouille,"+ 
        "con todo su corazón (El Perfume, Patrick Süskind)";

    //buscar caracter    
        int posicionAleatoria = (int) (Math.random() * texto.length() - 1);
        char posicion = texto.charAt(posicionAleatoria);

    //buscar palabra    
        String  [] palabra = texto.split(" ");
        int numeroPalabras = palabra.length;
        int palabraBuscada = (int) (Math.random() * numeroPalabras - 1);
        String buscar = palabra[palabraBuscada];


        System.out.println("En la posicion " + posicionAleatoria + " esta el carcater: " + posicion);
        System.out.println("La palabra es buscada es: " + buscar);

    System.out.println("---------------------------------");

        Scanner sc = new Scanner(System.in);

    //cambia la letra que introduzca por la 'a'
        System.out.println("Introcuce un caracter: ");
        char caracter = sc.nextLine().charAt(0);

        String textoModificado = texto.replace('a', caracter);

        System.out.println(textoModificado);

    System.out.println("---------------------------------");

        System.out.println("Introduzca una palabra: ");
        String palabraUsuario = sc.nextLine();

        texto = texto.toLowerCase();
        palabraUsuario = palabraUsuario.toLowerCase();
    
    //busca en el texto la palabra que a introducido el usuario
        int busca = texto.indexOf(palabraUsuario);

        System.out.println(((busca >0 ) ? palabraUsuario + " Si" : palabraUsuario + " No") + " esta en el texto");

        sc.close();

    }
    
}
