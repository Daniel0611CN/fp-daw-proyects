package FUNCIONES;

public class Recursiva_Array {
    public static void main(String[] args) {
        
        String frase = "La vaca Lola está loca de la cabeza";

        String[] palabras = frase.split(" ");

        System.out.println(recorrerArray(palabras));
    }



    static String recorrerArray(String[] lista)
    {
        String resultado = "";

        int posicion = lista.length;
        resultado = recorrerArray(lista, posicion-1);
    }

    static String recorrerArray(String[] lista, int posicion)
    {
        String resultado = "";

        if(posicion == 0) // CASO BASE
        {


        } 



    }



}
