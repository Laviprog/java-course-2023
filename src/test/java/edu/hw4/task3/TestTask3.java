package edu.hw4.task3;

import edu.hw4.Animal;
import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask3 {
    @Test
    void test() {
        List<Animal> list = ListAnimals.getAnimalList();
        assertEquals(new AnimalStreams().task3(list),
                Map.of(
                        Animal.Type.DOG, 2,
                        Animal.Type.CAT, 3,
                        Animal.Type.FISH, 2,
                        Animal.Type.BIRD, 1,
                        Animal.Type.SPIDER, 1
                )
        );
    }
}
