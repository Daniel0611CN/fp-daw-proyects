package EXAMEN.examenClases_HectorLopez.personal;


public class Cliente extends Persona{
    
    // ATRIBUTOS:
    private String tlf;
    private int alturaSalto;
    private boolean seguro;


    // CONTRUCTOR:
    public Cliente(String nombre, String apellidos, String tlf, int altura)
    {
        super(nombre, apellidos);
        this.tlf = tlf;
        this.alturaSalto = altura;
        this.seguro = false;
    }

    public Cliente(String nombre, String apellidos, String tlf, int altura, boolean seguro)
    {
        this(nombre, apellidos, tlf, altura);
        this.seguro = seguro;
    }


    // METODOS:
    public String informacion()
    {
        return super.getNombre() + " " + super.getApellidos() + " --> " + this.alturaSalto + " metros";
    }

    @Override
    public boolean equals(Object objeto)
    {
        Cliente nuevo = (Cliente)objeto;

        return super.equals(objeto) && this.tlf.equals(nuevo.tlf);
    }

    public int getAlturaSalto() {
        return alturaSalto;
    }

    public String getTlf() {
        return tlf;
    }

    public boolean isSeguro() {
        return seguro;
    }
    
}
