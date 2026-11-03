package STRING;

public class EjString3y4 {
    public static void main(String[] args) {
        
        String texto = "Hola soy Hector y estoy aprendiendo Java";
        System.out.println(texto);

        // Posicion por la que cortar la cadena:
        int posicion = 15;
        
        // Controlamos que la posición es correcta:
        boolean posicionValida = (posicion < (texto.length()));

       // Declaramos las partes de la cadena:
        String parteIzq = texto.substring(0, posicion);
        String parteDcha = texto.substring(posicion);

        System.out.println((posicionValida==true)? "Parte izquierda: "+parteIzq+" y parte derecha: "+parteDcha : "Error, posicion no válida");

        // REEMPLAZAR UN CARACTER POR OTRO DADO:
        char reemplazado = 'H';
        char nuevoChar = 'm';
        System.out.println(texto.replace(reemplazado, nuevoChar));

    }
}
