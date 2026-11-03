package EXAMEN.examenColecciones_Hector.elementosTienda;

public class Producto implements Comparable<Producto>{
    
    public enum Categoria {ELECTRONICA, MODA, HOGAR, DEPORTES};

    // ATRIBUTOS:
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private Categoria categoria;

    static private int idIncremental;

    // CONSTRUCTOR:
    public Producto(String nombre, String descripcion, double precio, String categoria)
    {
        Producto.idIncremental++;

        this.id = idIncremental;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = Categoria.valueOf(categoria.toUpperCase());
    }

    // METODOS:

    public String toString()
    {
        return "Producto{id="+id+", nombre='"+nombre+"', descripción='"+descripcion+"', precio="+precio+", categoría='"+categoria+"'}";
    }

    // Hago el compare con el ID para que la ordenación por defecto se haga por id
    @Override
    public int compareTo(Producto otro)
    {
        int dif = this.id - otro.id;

        return dif;
    }

    // Al hacer equals usando el nombre hago que dos productos sean el mismo 
    // si tienen el mismo nombre, de esta forma consigo que no se puedan
    // insertar en el Almacen de productos dos productos con el mismo nombre
    @Override
    public boolean equals(Object objeto)
    {
        boolean iguales = false;

        Producto comparado = (Producto)objeto;
        
        if(this.nombre == comparado.nombre)
        {
            iguales = true;
        }

        return iguales;
    }

    // GETTERS:
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

}
