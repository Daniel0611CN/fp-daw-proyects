public class Alumno implements Comparable<Alumno>{
    

    // ATRIBUTOS:
    private String sexo;
    private int edad;
    private double altura;
    private int nota1;
    private int nota2;
    private String calificacion; 

    // CONSTRUCTOR:
    public Alumno()
    {
        
    }

    public Alumno(String sexo, int edad, double altura, int nota1, int nota2, String calificacion)
    {
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.calificacion = calificacion; 
    }

    // METODOS:
    @Override
    public int compareTo(Alumno otro)
    {
        return this.edad - otro.getEdad();
    }

    @Override
    public String toString()
    {
        return "\nsexo: "+sexo+", edad: "+edad+", altura: "+altura+", nota1: "+nota1+", nota2: "+nota2+", calificacion: "+calificacion;
    }

    // GETTERS:
    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public String getCalificacion() {
        return calificacion;
    }

}
