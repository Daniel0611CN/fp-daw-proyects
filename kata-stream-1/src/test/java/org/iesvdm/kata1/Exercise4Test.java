

package org.iesvdm.kata1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Math.abs;


public class  Exercise4Test extends PetDomainForKata
{
    @Test
    @Tag("KATA")
    public void getAgeStatisticsOfPets()
    {
        //TODO
        // Replace by stream of petAges
        var petAges = people.stream()
                .flatMap(p -> p.getPets().stream().map(Pet::getAge))
                .collect(Collectors.toSet());

        var expectedSet = Set.of(1, 2, 3, 4);
        Assertions.assertEquals(expectedSet, petAges);

        //TODO
        // Replace by stream
        // IntSummaryStatistics is a class in JDK 8 use it over petAges
        var stats = petAges.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println(stats);

        //TODO
        // Replace 0 by stream over petAges
        Assertions.assertEquals(1, stats.getMin());
        Assertions.assertEquals(4, stats.getMax());
        Assertions.assertEquals(10, stats.getSum());
        Assertions.assertEquals(2.5, stats.getAverage(), 0.0);
        Assertions.assertEquals(4, stats.getCount());

        //TODO
        // Replace by correct stream
        // All age > 0
        Assertions.assertTrue(stats.getMin() > 0);
        //TODO
        // No one ages == 0
        Assertions.assertFalse(stats.getMin() == 0);
        //TODO
        // No one age < 0
        Assertions.assertTrue(!(stats.getMin() < 0));
    }

    @Test
    @Tag("KATA")
    @DisplayName("bobSmithsPetNamesAsString - 🐱 🐶")
    public void bobSmithsPetNamesAsString()
    {
        //TODO
        // find Bob Smith
        Person person = people.stream()
                .filter(p -> p.getFullName().equals("Bob Smith")).findFirst().get();

        //TODO
        // get Bob Smith's pets' names
        String names = person.getPets().stream().map(Pet::getName).collect(Collectors.joining(" & "));
        Assertions.assertEquals("Dolly & Spot", names);
    }

    @Test
    @Tag("KATA")
    public void immutablePetCountsByEmoji()
    {
        //TODO
        // Unmodificable map of counts
        Map<String, Long> countsByEmoji = people.stream()
                .flatMap(p -> p.getPets().stream())
                .collect(Collectors.groupingBy(p -> String.valueOf(p.getType()), Collectors.counting()));

        Assertions.assertEquals(
                Map.of("🐱", 2L, "🐶", 2L, "🐹", 2L, "🐍", 1L, "🐢", 1L, "🐦", 1L),
                countsByEmoji
        );
    }

    /**
     * The purpose of this test is to determine the top 3 pet types.
     */
    @Test
    @Tag("KATA")
    @DisplayName("topThreePets - 🐱 🐶 🐹")
    public void topThreePets()
    {
        //TODO
        // Obtain three top pets
        var favorites = people.stream()
                .flatMap(p -> p.getPets().stream())
                .collect(Collectors.groupingBy(Pet::getType, Collectors.counting()))
                .entrySet().stream()
                    .sorted(Map.Entry.<PetType, Long>comparingByValue().reversed())
                    .limit(3).toList();

        Assertions.assertEquals(3, favorites.size());

        Assertions.assertTrue(favorites.contains(new AbstractMap.SimpleEntry<>(PetType.CAT, Long.valueOf(2))));
        Assertions.assertTrue(favorites.contains(new AbstractMap.SimpleEntry<>(PetType.DOG, Long.valueOf(2))));
        Assertions.assertTrue(favorites.contains(new AbstractMap.SimpleEntry<>(PetType.HAMSTER, Long.valueOf(2))));

    }

    @Test
    @Tag("KATA")
    public void getMedianOfPetAges()
    {
//        Assertions.fail("Refactor to stream. Don't forget to comment this out or delete it when you are done.");

        //TODO
        // Obtain pet ages
        var petAges = people.stream()
                .flatMap(p -> p.getPets().stream().map(Pet::getAge))
                .toList();

        System.out.println(petAges);

        //TODO
        // sort pet ages
        var sortedPetAges = petAges.stream()
                .sorted(Comparator.comparing(p -> p))
                .toList();

        System.out.println(sortedPetAges);

        double median;
        if (0 == sortedPetAges.size() % 2)
        {
            //TODO
            //
            // The median of a list of even numbers is the average of the two middle items
            median = (double) (sortedPetAges.get((sortedPetAges.size() / 2) - 1) + sortedPetAges.get(sortedPetAges.size() / 2)) / 2;
        }
        else
        {
            // The median of a list of odd numbers is the middle item
            median = sortedPetAges.get(abs(sortedPetAges.size() / 2)).doubleValue();
        }

        Assertions.assertEquals(2.0, median, 0.0);
    }
}
