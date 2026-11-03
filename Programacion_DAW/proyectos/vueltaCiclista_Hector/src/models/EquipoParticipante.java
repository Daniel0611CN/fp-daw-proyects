package models;

public class EquipoParticipante extends Equipo implements Comparable<EquipoParticipante>{


    // ATTRIBUTES:
    private int tiempoEquipo;

    // CONSTRUCTOR:
    public EquipoParticipante(Equipo e) {

        super(e.getCodigo(), e.getNombre(), e.getNacionalidad(), e.getPresupuesto());
        this.tiempoEquipo = 0;
    }

    // METHODS:
    @Override
    public int compareTo(EquipoParticipante o)
    {
        return this.tiempoEquipo-o.tiempoEquipo;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\t tiempo acumulado: " + this.tiempoEquipo + "s\n";
    }

    // GETTERS & SETTERS:
    public int getTiempoEquipo() {
        return tiempoEquipo;
    }

    public void setTiempoEquipo(int tiempoEquipo) {
        this.tiempoEquipo = tiempoEquipo;
    }
}
