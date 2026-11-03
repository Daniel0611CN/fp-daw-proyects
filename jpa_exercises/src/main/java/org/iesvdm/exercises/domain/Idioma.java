package org.iesvdm.exercises.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder

@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id", scope = Idioma.class)
public class Idioma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    private String nombre;

    @OneToMany(mappedBy = "idioma", fetch = FetchType.EAGER)
    @Builder.Default
    //@JsonIgnore
    //@JsonManagedReference
    private Set<Pelicula> peliculas = new HashSet<>();


    @OneToMany(mappedBy = "idiomaOriginal")
    @Builder.Default
    //@JsonIgnore
    //@JsonManagedReference
    private Set<Pelicula> peliculasIdiomaOriginal = new HashSet<>();

}
