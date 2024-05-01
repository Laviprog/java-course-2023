package edu.hw4.task6;

import edu.hw4.Animal;
import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask6 {
    @Test
    void test() {
        List<Animal> list = ListAnimals.getAnimalList();
        assertEquals(new AnimalStreams().task6(list),
                Map.of(
                        Animal.Type.DOG, list.getFirst(),
                        Animal.Type.CAT, list.get(3),
                        Animal.Type.SPIDER, list.get(6),
                        Animal.Type.FISH, list.get(7),
                        Animal.Type.BIRD, list.get(4)
                )
        );
    }
}
