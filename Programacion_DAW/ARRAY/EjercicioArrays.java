package ARRAY;


public class EjercicioArrays {
    
    public static void main(String[] args) {
        
        int[] array = null;

        array = UtilesArrayHector.rellenar(array, 10);
        
        UtilesArrayHector.imprimir(array);
        
        array =UtilesArrayHector.limpiar();
        
        array =UtilesArrayHector.insertarAlPrincipio(array, 10);

        array =UtilesArrayHector.insertarAlPrincipio(array, 20);

        array =UtilesArrayHector.insertarAlPrincipio(array, 30);

        array =UtilesArrayHector.insertarAlPrincipio(array, 40);

        array =UtilesArrayHector.insertarAlPrincipio(array, 50);

        array =UtilesArrayHector.insertarAlPrincipio(array, 7);

        array =UtilesArrayHector.insertarAlPrincipio(array, 9);

        array =UtilesArrayHector.insertarAlPrincipio(array, 98);

        array =UtilesArrayHector.insertarAlFinal(array, 5);

        boolean ordenado = UtilesArrayHector.estaOrdenado(array);

        System.out.println("Esta ordenado: " + ordenado);

        UtilesArrayHector.imprimir(array);

        array =UtilesArrayHector.eliminarPrimero(array);

        UtilesArrayHector.imprimir(array);

        array =UtilesArrayHector.eliminar(array, 30);

        UtilesArrayHector.imprimir(array);

        array =UtilesArrayHector.ordenar(array);

        UtilesArrayHector.imprimir(array);

        array =UtilesArrayHector.insertarOrdenado(array, 15);

        UtilesArrayHector.imprimir(array);
        
        int posicion15 =UtilesArrayHector.buscar(array, 15);

        System.out.println("El elemento 15 está en la posicion: " + posicion15);

        int posicion99 =UtilesArrayHector.buscar(array, 99);

        System.out.println("El elemento 99 está en la posicion: " + posicion99);

        array = UtilesArrayHector.invertir(array);

        System.out.print("Invierto el array:  ");
        UtilesArrayHector.imprimir(array);

        array =UtilesArrayHector.partirPor(array, 2,5);

        System.out.println("Parto el array por 2 y 5");
        UtilesArrayHector.imprimir(array);

    }
}
