package CLASES_T6.Clases.maquinaria;


class Vagon {
    
    // ATRIBUTOS:
    private int id;
    private int maxCarga;
    private int cargaActual;
    private String tipoCarga;
    static private int contadorIncremental;

    // CONSTRUCTORES:
    public Vagon(int maxCarga, int carga, String tipoCarga)
    {
        this.id = contadorIncremental+1;
        this.maxCarga = maxCarga;
        this.cargaActual = carga;
        this.tipoCarga = tipoCarga;

    }

    public int getId() {
        return id;
    }

    public int getMaxCarga() {
        return maxCarga;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }
}

