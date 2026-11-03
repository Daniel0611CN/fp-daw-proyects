package org.iesvdm.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Entity
@Data
public class Departamento implements java.io.Serializable {

    @Id
    private int codigo;
    private String nombre;
    private double presupuesto;
    private double gastos;

    @OneToMany(mappedBy = "departamento", fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Empleado> empleados;

}
