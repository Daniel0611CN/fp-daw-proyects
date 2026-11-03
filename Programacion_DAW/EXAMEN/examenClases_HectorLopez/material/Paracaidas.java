package EXAMEN.examenClases_HectorLopez.material;

import EXAMEN.examenClases_HectorLopez.personal.Instructor;

public class Paracaidas {
    
    public enum Fabricante {MOLTEM, CAIDALIBRE, ALTUS};

    // ATRIBUTOS:
    private int codigo;
    static private int contadorCodigo;

    private int año;
    private Fabricante marca;
    private Instructor encargado;


    // CONSTRUCTOR:
    public Paracaidas(int año, Fabricante marca, Instructor encargado)
    {
        this.año = año;
        this.marca = marca;
        this.encargado = encargado;

        contadorCodigo++;
        this.codigo = contadorCodigo;
    }

    // METODOS:
    public int getCodigo() {
        return codigo;
    }


    public int getAño() {
        return año;
    }


    public Fabricante getMarca() {
        return marca;
    }


    public Instructor getEncargado() {
        return encargado;
    }

}
