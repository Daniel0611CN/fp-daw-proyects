package COLECCIONES;

public class ColeccionGenerica<T>{
    
    // ATRIBUTOS:
    private T objeto;
    
    
    // METODOS:
    public void insertar(T nuevo)
    {
        objeto = nuevo;
    }

    public T extraer()
    {
        T resultado = objeto;

        objeto = null;

        return resultado;
    }
}
