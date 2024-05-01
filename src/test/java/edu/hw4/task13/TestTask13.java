package edu.hw4.task13;

import edu.hw4.Animal;
import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask13 {
    @Test
    void test() {
        List<Animal> list = ListAnimals.getAnimalList();
        assertEquals(
                new AnimalStreams().task13(list),
                List.of(
                        list.get(0),
                        list.get(3)
                )
        );
    }
}
