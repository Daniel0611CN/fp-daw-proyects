package STRING;
public class ManejoDeCadenas {
    
    // EJEMPLOS DE USO DE LOS METODOS DE LA CLASE STRING

    public static void main(String[] args) {
        
        String cadena = "En un lugar de la mancha";

        // charAt
        
        char caracter = cadena.charAt(3);
        System.out.println(caracter);

            // Tambien puedo declarar la posición como una variable,
            // pero tiene que ser una variable de tipo Int
        int indice = 4;
        char caracter2 = cadena.charAt(indice);
        System.out.println(caracter2);

            // Si me salgo de la cadena me dará error:

        //char caracter3 = cadena.charAt(300);
        //System.out.println(caracter3);

        // Comparación de dos cadenas

        String cadena1 = "Hola";
        String cadena2 = "HolA";

        System.out.println((cadena1 == cadena2) ? "IGUALES" : "DISTINTAS");
        //System.out.println((cadena1 == "Hola") ? "IGUALES" : "DISTINTAS");

        // compareTo

        // System.out.println(cadena1.compareTo(cadena2));

        // Si aparece 0 las cadenas son iguales, si aparece un numero equivale al valor Int de la letra diferente

        System.out.println((cadena1.compareTo(cadena2) == 0) ? "IGUALES" : "DISTINTAS");


        // COMPARAR IGNORANDO MAYUSCULAS Y MINUSCULAS:

            // compareToIgnoreCase

        System.out.println(cadena1.compareToIgnoreCase(cadena2)); // Si da 0 es true, si da un nº es false

            // Se puede hacer lo mismo con una ternaria
        System.out.println((cadena1.compareToIgnoreCase(cadena2) == 0) ? "IGUALES" : "DISTINTAS");

        // El nº indica la distancia entre los carcteres:

        String apellido1 = "Lopez";
        String apellido2 = "Garcia";

        System.out.println(apellido1.compareTo(apellido2)); // esto da 5
        System.out.println(apellido2.compareTo(apellido1)); // esto da -5

        System.out.println((apellido1.compareTo(apellido2)>0) ? apellido2 + " va antes que " + apellido1 : apellido1 + " va antes que " + apellido2);

        // vamos ahora a medir cadenas:

        int longitud = cadena.length();
        System.out.println("La cadena tiene longitud = " + longitud);

        // Sacar el ultimo caracter: Siempre es la longitud -1, porque la posición empieza por 0, así que tiene un valor menos que la longitud.

        char ultimo = cadena.charAt(longitud-1);
        System.out.println("El ultimo caracter es: " + ultimo);

        // sacar el primer caracter
        char primero = cadena.charAt(0);
        System.out.println("El primer caracter es: " + primero);

        // Buscar un caracter
        int posicionD = cadena.indexOf('d');
        System.out.println("La letra D está en la posición: " + posicionD);

        // Tambien se puede hacer asÍ:
        char letraD = 'd';
        int posicionDbis = cadena.indexOf(letraD);
        System.out.println("La letra D está en la posición: " + posicionDbis);


        char letraA = 'a';
        int posicionA = cadena.indexOf(letraA);
        int posicionAA = cadena.indexOf(letraA, posicionA+1);

        System.out.println("La letra a está en la posición: " + posicionA + " y " + posicionAA);


        // Convertir toda una cadena en mayusculas o en minusculas

        String cadenaMinuscula = cadena.toLowerCase();
        String cadenaMayuscula = cadena.toUpperCase();


        // Reemplazar trozos de una cadena por otros:

        // Eliminar espacios delante y detrás





    }

}
