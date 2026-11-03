package BUCLES;

import java.util.Scanner;

public class Frase_case_d {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String frase = "Hola, esto es un mesaje de prueba para ver si sale o no sale";
        String posiciones = "En la/s posicion/es: ";
        int contador = 0;
        int nuevaPosicion = 0;

        System.out.println(frase);
        System.out.println("¿Que caracter quieres buscar?");
        char caracterBuscado = sc.nextLine().charAt(0);
        // Limpio Buffer siempre después de leer un caracter:
        sc.nextLine();

        // Localizo el primer caracter:
        int posicionCaracterBuscado = frase.indexOf(caracterBuscado);
        System.out.println("primera posicion encontrada " + posicionCaracterBuscado);

        System.out.println("EMPIEZA EL BUCLE");
        // Bucle para buscar el resto de posiciones: (siempre que lo haya encontrado una primera vez)
        while (posicionCaracterBuscado >= 0)
        {
            contador++; // (Si entra es que ha encontrado una coincidencia)

            // Guardo su posición en un String y procedo para repetir el proceso:
            posiciones = posiciones + "" + posicionCaracterBuscado + ", ";

            // Parto la frase para obtener el trozo siguiente a la primera posición encontrada:
            String parteSiguiente = frase.substring(posicionCaracterBuscado+1);
            System.out.println("parte siguiente = \"" + parteSiguiente + "\"");

            //Vuelvo a hacer la búqueda desde esa posición (si no aparece cambia la condición de entrada del bucle)
            nuevaPosicion = parteSiguiente.indexOf(caracterBuscado);

            System.out.println("Nuevo valor posición " + (nuevaPosicion+1));






            // OPCION 2:
            // Si hago Indexof(CaracterBuscado, InicioBusqueda) -> empieza por donde yo le diga
            // Con un bucle puedo introducir como inicioBusqueda la última posición encontrada
            int contador2 = 0;
            int posicion2 = frase.indexOf(caracterBuscado);
            String posicionesEncontradas = "";

            while (contador2 != -1)
            {
                posicion2 = frase.indexOf(caracterBuscado, posicionCaracterBuscado+1); // De esta manera busco desde la ultima posicón encontrada.
                contador2++;
                posicionesEncontradas = posicionesEncontradas + " " + posicion2;
            }

            System.out.println("El caracter aparece" + contador2);
            System.out.println("En las posiciones: " + posicion2);






            // OPCION 3: (la güena)
            // Otra opción es charAt(contador) == 'a'
            int contadorApariciones = 0;
            String cadenaApariciones = "";

            for (int aux=0; aux <= frase.length(); aux++)
            {
                if (frase.charAt(aux) == caracterBuscado)
                {
                    contadorApariciones++;
                    cadenaApariciones = cadenaApariciones + " " + aux;
                }
            }
            System.out.println("El caracter buscado aparece " + contadorApariciones);
            System.out.println("En la/s posicion/es: " + cadenaApariciones);








            // Si lo ha encontrado lo añado al String declarado:
            if (nuevaPosicion > 0)
            {
                posicionCaracterBuscado = posicionCaracterBuscado + (nuevaPosicion+1); //Le sumo 1 porque cada vez que empiezo a contar empiezo por cero
                System.out.println("siguiente posicion: " + posicionCaracterBuscado);
            }
            else
            {
                posicionCaracterBuscado = nuevaPosicion; //Si no lo encuentra vuelco el valor negativo en la variable de entrada al bucle
            }
        }
        
        // Consición para imprimir:

        if (contador > 0)
        {
            System.out.println("El caracter \'" + caracterBuscado + "\' aparece " + contador + " veces.");

            System.out.println(posiciones);
        }
        else
        {
            System.out.println("El caracter introducido no está en la frase actual.");
        }

        sc.close();
    }
}
