package org.iesvdm.pruebas_clase;

public class ParImpl<K, V, U> implements Par<K, V> {

    private K key;
    private V value;
    private U u;

    public ParImpl(K key, V value) {
        this.key = key;
        this.u = u;
        this.value = value;
    }

    @Override
    public K getKey() {
        return null;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public V getValue() {
        return null;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public static void main(String[] args) {
        Par<String, Integer> parStrInt = new ParImpl<>("Dani", 18);
        System.out.println(parStrInt.getKey());

    }

}
