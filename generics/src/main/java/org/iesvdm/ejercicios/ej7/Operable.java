package org.iesvdm.ejercicios.ej7;

import java.util.List;

public interface Operable<E> {

    void suma(List<E> o, List<E> o2);
    void resta(List<E> o, List<E> o2);
    void multiplicacion(List<E> o, List<E> o2);
    void division(List<E> o, List<E> o2);

}
