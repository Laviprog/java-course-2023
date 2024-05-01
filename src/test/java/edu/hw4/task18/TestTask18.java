package edu.hw4.task18;

import edu.hw4.Animal;
import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask18 {
    @Test
    void test() {
        List<Animal> list = ListAnimals.getAnimalList();
        List<Animal> list2 =
                List.of(
                        new Animal("Fish34 top", Animal.Type.FISH, Animal.Sex.M, 10, 100, 80, false),
                        new Animal("Fishop", Animal.Type.FISH, Animal.Sex.M, 19, 18, 29, false),
                        new Animal("Spider", Animal.Type.SPIDER, Animal.Sex.M, 15, 2, 3, true),
                        new Animal("Fish23", Animal.Type.FISH, Animal.Sex.F, 8, 49, 55, false)
                );
        List<Animal> list3 =
                List.of(
                        new Animal("Fish0001", Animal.Type.FISH, Animal.Sex.M, 11, 99, 83, true)
                );
        assertEquals(
                new AnimalStreams().task18(list, list2, list3),
                list3.getFirst()
        );
        assertEquals(
                new AnimalStreams().task18(list, list2),
                list2.getFirst()
        );
    }
}
