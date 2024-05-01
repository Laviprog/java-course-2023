package edu.hw4.task15;

import edu.hw4.Animal;
import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask15 {
    @Test
    void test() {
        List<Animal> list = ListAnimals.getAnimalList();
        assertEquals(
                new AnimalStreams().task15(list, 5, 15),
                Map.of(
                        Animal.Type.DOG, 150,
                        Animal.Type.CAT, 40,
                        Animal.Type.BIRD, 34,
                        Animal.Type.FISH, 19,
                        Animal.Type.SPIDER, 3
                )
        );
    }
}
