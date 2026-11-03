package CLASES_T6.Clases.maquinaria;

import CLASES_T6.Clases.personal.Maquinista;

public class Tren {
 
    // ATRIBUTOS:
    private Locomotora locomotora;
    private Vagon[] vagones;
    private Maquinista responsable;

    // CONSTRUCTOR:
    public Tren(Locomotora locomotora, Maquinista responsable)
    {
        this.locomotora = locomotora;
        this.responsable = responsable;
        this.vagones = new Vagon[0];
    }

    // METODOS:
    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    private Vagon[] getVagones() {
        return vagones;
    }

    public Maquinista getResponsable() {
        return responsable;
    }

    public void setResponsable(Maquinista responsable) {
        this.responsable = responsable;
        
    }

    public void enganchaVagon(int max, int carga, String descripcion)
    {
        if(carga <= max)
        {
            Vagon nuevo = new Vagon(max, carga, descripcion);

            this.vagones = añadeVagon(this.vagones, nuevo);
        }
        else 
        {
            System.out.println("No se puede enganchar, supera la carga máxima");

        }

    }
    
    /**
     * Inserta un elemento al final del array
     * @param array,nuevoVagon
     * @return nuevo
     */
    public Vagon[] añadeVagon(Vagon[] array, Vagon nuevoVagon)
    {
        if(array.length < 5) // Comprobamos que se puede anganchar el vagón
        {
            Vagon[] nuevo = new Vagon[array.length+1];

            for (int i = 0; i < array.length; i++)
            {
                nuevo[i] = array[i];
            }
    
            nuevo[nuevo.length-1] = nuevoVagon;
            
            return nuevo;
        }
        else
        {
            System.out.println("No se puede enganchar, ya hay 5 vagones");

            return array;
        }
    }

    @Override
    public String toString()
    {
        String resultado = this.locomotora.toString();

        if(vagones.length>0)
        {
            int cargaTotal = 0;

            for (int i = 0; i < vagones.length; i++)
            {
                resultado += " - [V" + (i+1) + " - " + vagones[i].getCargaActual() + "kgs de " + 
                            vagones[i].getMaxCarga() + vagones[i].getTipoCarga() + "]";


                cargaTotal += vagones[i].getCargaActual();
            }

            resultado += " = " + cargaTotal + "kgs de Carga total";
        }

        resultado += " - " + this.responsable.toString();

        return resultado;
    }


}
