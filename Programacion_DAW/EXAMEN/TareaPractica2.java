package EXAMEN;
import java.util.Scanner;

public class TareaPractica2 { // 1 vs 1 Baloncesto

/* Vamos a simular un 1 contra 1 en baloncesto para ello necesitamos saber:

    Nombre del jugador atacante y del jugador defensor
    El % de acierto de 2  y de 3 del jugador atacante.
    El numero de veces que el jugador defensor logra hacer que su atacante falle (número de 0 a 10)
    Y si el jugador atacante decide tirar de 2 o de 3.

Para saber si mete canasta utilizaremos esta fórmula:

(numeroAlAzarAtaque * %AciertoTipoSeleccionado) > (numeroAlAzarDefensa * EficaciaDefensa * 10)

    Debes mostrar al finalizar el siguiente mensaje según: Ejemplo de salida:

El jugador "XXXXXXX" ha encestado de 2 sobre el jugador "YYYYYY" (xxx > yyyy)
El jugardor "XXXXXX" NO ha encestado contra el jugador "YYYYY" (xxxx< yyyyy)
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Pido todos los datos necesarios para calcular la probabilida de acierto:
        System.out.println("Introduce el nombre del Jugador Atacante");
        String atacante = sc.nextLine();

        System.out.println("Introduce el nombre del Jugador Defensor");
        String defensor = sc.nextLine();

        System.out.println("Porcentaje de acierto de 2");
        int acierto2 = sc.nextInt();

        System.out.println("Porcentaje de acierto de 3");
        int acierto3 = sc.nextInt();

        System.out.println("Eficacia del Jugador Defensor");
        int eficaciaDefensa = sc.nextInt();

        System.out.println("Desde donde tira el Jugador Atacante");
        int tipoAtaque = sc.nextInt();

        // Lanzo los números al azar y calculo si hay acierto o no:
        double azarAtaque = (Math.random());
        double azarDefensa = (Math.random());

        // Con una ternaria elijo el tipo de tiro:
        int porcentajeAtaque = ((tipoAtaque == 2) ? acierto2 : acierto3);
        // Calculo el acierto o no
        boolean canasta = (azarAtaque*porcentajeAtaque) > (azarDefensa*eficaciaDefensa*10);
        // Declaro las frases para acierto y fallo:
        String canastaSi = "El jugador "+atacante+ " ha encestado de "+tipoAtaque+" sobre el jugador "+defensor+" ("+(int)(azarAtaque*porcentajeAtaque)+"% > "+(int)(azarDefensa*eficaciaDefensa*10)+ "%)";
        String canastaNo = "El jugador "+atacante+ " NO ha encestado contra el jugador "+defensor+" ("+(int)(azarAtaque*porcentajeAtaque)+"% < "+(int)(azarDefensa*eficaciaDefensa*10)+ "%)";
        // Imprimo segun el resultado de canasta:
        System.out.println((canasta == true) ? canastaSi : canastaNo);


        sc.close();
    }
}
