package ARRAY;

import java.util.Arrays;

public class UtilesPrueba {
    public static void main(String[] args) {
        
        int[] numerosPrueba = {2, 5, 6, 8, 15, 8, 7, 9, 11, 3, 4};

        numerosPrueba = UtilesArrayHector.limpiar(numerosPrueba);
        System.out.println("limpiar el array: \t\t" + Arrays.toString(numerosPrueba));

        numerosPrueba = UtilesArrayHector.rellenar(numerosPrueba, 6);
        System.out.println("rellenar con ceros: \t\t" + Arrays.toString(numerosPrueba));

        numerosPrueba = UtilesArrayHector.rellenar(numerosPrueba, 8, 10);
        System.out.println("rellenar con valor: \t\t" + Arrays.toString(numerosPrueba));

        numerosPrueba = UtilesArrayHector.insertarAlFinal(numerosPrueba, 5);
        System.out.println("insertar al final: \t\t" + Arrays.toString(numerosPrueba));

        numerosPrueba = UtilesArrayHector.insertarAlPrincipio(numerosPrueba, 5);
        System.out.println("insertar al principio: \t\t" + Arrays.toString(numerosPrueba));

        numerosPrueba = UtilesArrayHector.insertarEnPosicion(numerosPrueba, 88, 4);
        System.out.println("insertar en posicion: \t\t" + Arrays.toString(numerosPrueba));

        numerosPrueba = UtilesArrayHector.insertarOrdenado(numerosPrueba, 12);
        System.out.println("insertar ordenado: \t\t" + Arrays.toString(numerosPrueba));

        numerosPrueba = UtilesArrayHector.eliminarUltimo(numerosPrueba);
        System.out.println("eliminar último: \t\t" + Arrays.toString(numerosPrueba));

        numerosPrueba = UtilesArrayHector.eliminarPrimero(numerosPrueba);
        System.out.println("eliminar primero: \t\t" + Arrays.toString(numerosPrueba));

        numerosPrueba = UtilesArrayHector.eliminarPosicion(numerosPrueba, 5);
        System.out.println("eliminar posición: \t\t" + Arrays.toString(numerosPrueba));
        
        numerosPrueba = UtilesArrayHector.eliminar(numerosPrueba, 12);
        System.out.println("eliminar elemento: \t\t" + Arrays.toString(numerosPrueba));

        UtilesArrayHector.ordenar(numerosPrueba);
        System.out.println("ordenar el array: \t\t" + Arrays.toString(numerosPrueba));
        
        UtilesArrayHector.desordenar(numerosPrueba);
        System.out.println("desordenar array: \t\t" + Arrays.toString(numerosPrueba));

        numerosPrueba = UtilesArrayHector.invertir(numerosPrueba);
        System.out.println("invertir array: \t\t" + Arrays.toString(numerosPrueba));

    }
}
