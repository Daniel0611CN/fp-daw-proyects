package org.iesvdm;

/*
* @author Daniel Clavijo Núñez;
*/

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AlturaAlumnoTest {

    /* aniadeNombre */

    @Test void aniadeNombre (){

        /*given : */
        String[] array = {"dani"};
        String nombre = "jose";

        /*when : */
        String[] result = AlturaAlumno.aniadeNombre(array, nombre);

        /*then : */
        assertTrue(result[0] == array[0]); // comprueba pos 0 result == pos 0 array;
        assertTrue(result[result.length-1] == nombre); // comprueba last pos result == nombre;
        
    }

    /* aniadeAltura */

    @Test void aniadeAltura (){

        /*given : */
        double[] array = {2.1};
        double altura = 1.5;

        /*when : */
        double[] result = AlturaAlumno.aniadeAltura(array);
        result[result.length-1]=altura; // last pos result == altura;

        /*then : */
        assertTrue(array[0]==result[0]);
        assertTrue(result[result.length-1] == altura);

    }

    /* modificaAltura */

    @Test void modificaAltura (){

        /*given : */
        double[] array = {1.5, 2.3};
        double altura = 3.4;
        int pos = 1;

        /*when : */
        double[] result = AlturaAlumno.modificaAltura(array, pos, altura);

        /*then : */
        assertEquals(altura, array[pos]);
        assertTrue(result[pos] == altura);

    }

    @Test void modificaAlturaNoValido (){

        /*given : */
        double[] array = {1.5, 2.3, 3.2, 5.1, 7.6};
        double altura = 3.4;
        int pos = 8;

        if (pos>=0 && pos<= array.length){

            /*when : */
            double[] result = AlturaAlumno.modificaAltura(array, pos, altura);

            /*then : */
            assertTrue(array[0] == result[0]);
            assertTrue(result[pos] == altura);

        }

    }

    /* buscaNombre */

    @Test void buscaNombre (){

        /*given : */
        String[] nombres = {"jose","cesar","alan"};
        String nombre = "cesar";
        int indice = 1;

        /*when : */
        int result = AlturaAlumno.buscaNombre(nombres, nombre);

        /*then : */
        assertEquals(indice, result); // comprueba index == result;

    }

    @Test void buscaNombreNoEncontrado (){

        /*given : */
        String[] nombres = {"jose","cesar","alan"};
        String nombre = "cristina";
        int indice = -1;

        /*when : */
        int result =AlturaAlumno.buscaNombre(nombres, nombre);

        /*then : */
        assertEquals(indice, result);

    }

    /* mostrar */

    @Test void givenNamesAndHeightsWhenMostrarThenPrint () {

    /*attributes : */

    // Indica si el output del array ha sido true o false;
    final PrintStream standardOut = System.out;
    final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    System.setOut(new PrintStream(outputStreamCaptor));

    /*given : */
    String[] nombres = {"Angel", "Dani"}; // Array de String - Nombres;
    double[] alturas = {1.68, 1.75}; // Array de double - Alturas;

    /*when : */
    AlturaAlumno.mostrar(nombres, alturas); // Llamamos al método;

    /*then : */
    assertEquals("Angel" + "\t|   " + "1.68\r\n" +
            "Dani" + "\t|   " + "1.75\r\n", outputStreamCaptor.toString());
    assertTrue(outputStreamCaptor.toString().contains("Dani"));

    }

    /* calculaMaximo */

    @Test void calculaMaximo (){

        /*given : */
        int pos = 3; // double pos = 1;
        double[] array = {1.5, 4.2, 5.1, 8.3, 7.6};
        double maximo = array[pos]; // double maximo = array[1];

        /*when : */
        double[] result = AlturaAlumno.calculaMaximo(array);

        /*then : */
        assertTrue(array.length>0); // longitud array mayor a cero;
        assertTrue(pos>=0 && pos<array.length); // posición mayor que cero y menor que longitud del array;

        /* Lo más importante que debemos comprobar en este Test es que result[0]==pos, y result[1]==maximo; */
        assertEquals(result[0], pos);
        assertEquals(result[1], maximo);

    }

    @Test void calculaMaximoLongitudCero (){

        /*given : */
        double[] array = new double[0]; // posiciones = 0;

        /*when : */
        double[] result = AlturaAlumno.calculaMaximo(array); // creamos un array double - result;

        /*then : */
        assertEquals(result[0], 0.0); // pos 0 array = 0.0;
        assertEquals(result[1], 0.0);

    }

    /* calculaMedia */

    @Test void calculaMedia (){

        /*when : */
        double[] array = {5.0, 2.0};
        double media = 3.5; // suma elementos del array / array.length;

        /*do : */
        double result = AlturaAlumno.calculaMedia(array); // result == media;

        /*then : */
        assertTrue(array.length>0); // comprueba longitud array > 0;
        assertEquals(result, media); // comprueba result == media;

    }

    @Test void calculaMediaLongitudCero (){

        /*given : */
         double[] array = new double[0]; // posiciones = 0;

        /*when : */
        double result = AlturaAlumno.calculaMedia(array); // double result == array;

        /*then : */
        assertEquals(0.0, result); // comprueba result == 0.0;

    }

}
