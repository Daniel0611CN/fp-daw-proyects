package CLASES_T6.Clases.maquinaria;

import CLASES_T6.Clases.personal.Mecanico;

public class Locomotora {
    

    // ATRIBUTOS:
    private String matricula;
    private int potencia;
    private int año;
    private Mecanico mecanico;

    // CONSTRUCTOR:
    public Locomotora(String matricula, int potencia)
    {
        this.matricula = matricula;
        this.potencia = potencia;
    }

    public Locomotora(String matricula, int potencia, int año)
    {
        this(matricula, potencia);
        this.año = año;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    @Override
    public String toString()
    {
        String resultado = "Locomotora: " + this.getMatricula() + "(" + this.getPotencia() + "Cv)";

        return resultado;
    }
    
}
