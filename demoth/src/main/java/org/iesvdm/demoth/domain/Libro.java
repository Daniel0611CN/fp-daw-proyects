package org.iesvdm.demoth.domain;

// Constructor Canónico
public record Libro(Integer id, String titulo, String autor, String editorial) {

    /*
     * Además, los record son inmutables, es decir, que una vez que se setean, no se pueden cambiar.
     *
     * En este caso, se usa Integer, ya que es más fácil permitir que el id sea null,
     * es decir, que no se introduzca un valor par el id;
     */

    public Libro(String titulo, String autor, String editorial) {
        /*
         * Esto es un constructor no canónico, se usa para poder crear objetos de la clase Libro,
         * que contenga un id cuando solo se introduzca, si no se introduce el objeto no
         * tendría id. Esto es único de los record.
         */
        this(null, titulo, autor, editorial);
    }
}
