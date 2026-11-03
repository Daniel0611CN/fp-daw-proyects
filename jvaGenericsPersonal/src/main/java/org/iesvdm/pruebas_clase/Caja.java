package org.iesvdm.pruebas_clase;

public class Caja<T> {

    // <T> Puede ser cualquier clase, es una clase genérica;

    private T value;

    public Caja(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        var cajaStr = new Caja<>("Luis"); // No es necesario volver a poner el String en el segundo <>; A no ser que no esté en el primero (Ya que es var);

        // Si la versión jdk es superior o igual a java 10, se permite el uso de var;

        String valor = cajaStr.getValue();
        System.out.println(valor);

        // Autoboxing
        var cajaInt = new Caja<>(1); // Aquí, al leer el valor double, convertirá la cajaInt a Double (Clase);
        System.out.println(cajaInt.getValue());
        // Para forzar el double, se pone una d (1.01d);

//        cajaInt.setValue();
    }

}
