package org.iesvdm.pruebas_clase;

public class Util {

    public static <K, V> boolean equals(Par<K, V> par1, Par<K, V> par2) {
        return par1.getValue().equals(par2.getValue()) && par1.getKey().equals(par2.getKey());
    }

    public static int obtener(Integer entrada) {
        return entrada;
    }

    public static int obtener(String entrada) {
        return entrada.length();
    }

    public static void main(String[] args) {
        Par<Integer, String> par1 = new ParImpl<>(1, "Dani");
        Par<Integer, String> par2 = new ParImpl<>(1, "Dani");

        boolean iguales = Util.equals(par1, par2);
        System.out.println(iguales);

        Par<String, Integer> parStrInt1 = new ParImpl<>("Dani", 1);
        Par<String, Integer> parStrInt2 = new ParImpl<>("Dani", 2);

        boolean iguales2 = Util.<String, Integer>equals(parStrInt1, parStrInt2);
        // Aquí, se pone parStrInt1, ya que le hemos puesto que debe ser String, Integer

        // Pero en iguales, como no se le pone nada, entra Integer, String, ya que en el metodo no estaban puesto los valores;

        // Es por eso, que se podría poner: boolean iguales3 = Util.equals(parStrInt1, parStrInt2);

        System.out.println(iguales2);

    }

}
