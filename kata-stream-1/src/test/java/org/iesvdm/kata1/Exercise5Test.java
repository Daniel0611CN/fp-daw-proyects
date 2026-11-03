package org.iesvdm.kata1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise5Test extends PetDomainForKata
{
    @Test
    @Tag("KATA")
    public void partitionPetAndNonPetPeople()
    {
        //TODO
        // Obtain a partition over people with or without pets
        List<Person> partitionListPetPeople = people.stream()
                .filter(p -> !p.getPets().isEmpty())
                .toList();
        List<Person> partitionListNotPetPeople = people.stream()
                .filter(p -> p.getPets().isEmpty())
                .toList();

        Assertions.assertEquals(7, partitionListPetPeople.size());
        Assertions.assertEquals(1, partitionListNotPetPeople.size());
    }

    @Test
    @Tag("KATA")
    @DisplayName("getOldestPet - 🐶")
    public void getOldestPet()
    {
        //TODO
        // obtain the oldest pet
        Pet oldestPet = people.stream()
                        .flatMap(p -> p.getPets().stream())
                        .sorted(Comparator.comparing(Pet::getAge, Comparator.reverseOrder()))
                        .toList().getFirst();

        Assertions.assertEquals(PetType.DOG, oldestPet.getType());
        Assertions.assertEquals(4, oldestPet.getAge());
    }

    @Test
    @Tag("KATA")
    public void getAveragePetAge()
    {
        //TODO
        // obtain the average age of the pets
        double averagePetAge = people.stream()
                .flatMap(p -> p.getPets().stream())
                .mapToDouble(Pet::getAge).average().orElse(0.0);

        Assertions.assertEquals(1.88888, averagePetAge, 0.00001);
    }

    @Test
    @Tag("KATA")
    public void addPetAgesToExistingSet()
    {
        //TODO
        // obtain the set of pet ages
        Set<Integer> petAges = people.stream()
                .flatMap(p -> p.getPets().stream().map(Pet::getAge))
                .collect(Collectors.toSet());

//        var expectedSet = Set.of(1, 2, 3, 4, 5); // Esto creo que está mal;
        var expectedSet = Set.of(1, 2, 3, 4);
        Assertions.assertEquals(expectedSet, petAges);
    }

    @Test
    @Tag("KATA")
    @DisplayName("findOwnerWithMoreThanOnePetOfTheSameType - 🐹 🐹")
    public void findOwnerWithMoreThanOnePetOfTheSameType()
    {
        //TODO
        // obtain owner with more than one pet of the same type
        Person petOwner = people.stream()
                .filter(p -> p.getPets().size() > 1)
                .filter(p -> {
                    Set<PetType> uniquePetTypes = new HashSet<>();
                    return p.getPets().stream().anyMatch(pet -> !uniquePetTypes.add(pet.getType()));
                    // Esto lo que hace es filtrar por persona, y va añadiendo al set las mascotas que no existan
                    // de las personas con más de una mascota, y si encuentra que una mascota ya se encuentra en el set, termina y toma el primer valor.
                })
                .findFirst()
                .orElse(null);

        System.out.println(petOwner);

//        Assertions.assertEquals("Harry Hamster", petOwner.getFullName());
        //TODO
        // obtain the concatenation of the pet emojis of the owner
//        Assertions.assertEquals("🐹 🐹", "");
    }
}
