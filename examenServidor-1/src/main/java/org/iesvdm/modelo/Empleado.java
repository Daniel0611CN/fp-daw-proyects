package org.iesvdm.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Empleado {

    @Id
    private int codigo;
    private String nif;
    private String nombre;
    private String apellido1;
    private String apellido2;

    @ManyToOne
    @JoinColumn(name = "codigo_departamento", referencedColumnName = "codigo")
    private Departamento departamento;

}
