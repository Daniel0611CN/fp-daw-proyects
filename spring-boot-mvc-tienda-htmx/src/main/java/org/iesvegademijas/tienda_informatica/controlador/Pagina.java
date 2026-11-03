package org.iesvegademijas.tienda_informatica.controlador;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pagina<T> {

    private int inicioRangoDePagina;
    private int finalRangoDePagina;
    private int totalElementos;
    private int tamanio;
    private int numeroDePagina;
    private int numeroTotalDePaginas;
    private List<T> listado;

    public int getNumeroDePaginaPrevia() {
        return numeroDePagina -1;
    }

    public int getNumeroDePaginaSiguiente() {
        return numeroDePagina + 1;
    }


}
