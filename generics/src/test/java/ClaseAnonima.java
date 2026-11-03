import org.iesvdm.ejercicios.ej7.Clase;
import org.iesvdm.ejercicios.ej7.Operable;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ClaseAnonima<E> {

    @Test
    public void testClaseAnonima() {
        Operable<E> operable = new Operable<E>() {
            @Override
            public void suma(List<E> o, List<E> o2) {
                System.out.println("Suma de las operaciones");
            }

            @Override
            public void resta(List<E> o, List<E> o2) {
                System.out.println("Resta de las operaciones");
            }

            @Override
            public void multiplicacion(List<E> o, List<E> o2) {
                System.out.println("Multiplicacion de las operaciones");
            }

            @Override
            public void division(List<E> o, List<E> o2) {
                System.out.println("Division de las operaciones");
            }
        };
//        operable.suma();
//        operable.resta();
//        operable.multiplicacion();
//        operable.division();
    }

}
