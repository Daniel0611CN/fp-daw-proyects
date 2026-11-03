package CLASES_T6.Clases;

public class Disco {
    
    // ATRIBUTOS:
    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    // CONSTRUCTORES:
    public Disco(String codigo, String autor, String titulo, String genero, int duracion)
    {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    // METODOS:
    @Override
    public String toString()
    {
        return ("\nDISCO: "+
                "\nCódigo: "+this.codigo+
                "\nAutor: "+this.autor+
                "\nTítulo: "+this.titulo+
                "\nGénero: "+this.genero+
                "\nDuración: "+this.duracion+" minutos.\n");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


}
