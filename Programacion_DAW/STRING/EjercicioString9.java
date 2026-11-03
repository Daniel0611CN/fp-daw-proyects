package STRING;
import java.util.Scanner;

public class EjercicioString9 { // Añadir palabras a un texto
    
    public static void main(String[] args) {
        
        // Declaro el texto y lo muestro
        String texto = "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite";
        System.out.println(texto);

        Scanner sc = new Scanner(System.in);

        // Localizo el caracter donde quiero añadir los nombres introducidos
        char letraY = 'y';
        int posicionY = texto.indexOf(letraY);

        // Pregunto por el nombre a introducir
        System.out.println("¿Quién más estaba en casa de Juan?");
        String cadena = sc.nextLine();

        // Abro el Buffer
        StringBuffer nuevoBuffer = new StringBuffer(texto);

        // Inserto antes una coma y un espacio:
        // nuevoBuffer.insert(posicionY-1,", ");

        // Inserto la cadena en la posición siguiente: (antes he introducido dos posiciones más)

        // Aquí añado todo en un solo paso:
        nuevoBuffer.insert(posicionY-1, ", "+cadena);

        // Imprimo el resultado
        System.out.println(nuevoBuffer);

        // Tambien se puede hacer con subString
        String parteIzq = texto.substring(0, posicionY-1);
        String parteDcha = texto.substring(posicionY-1);
        String parteCentral = ", "+cadena;

        System.out.println(parteIzq+parteCentral+parteDcha);


        sc.close();
    }
}
