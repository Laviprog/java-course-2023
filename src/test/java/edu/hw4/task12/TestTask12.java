package edu.hw4.task12;

import edu.hw4.Animal;
import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask12 {
    @Test
    void test() {
        List<Animal> list = ListAnimals.getAnimalList();
        assertEquals(
                6, new AnimalStreams().task12(list)
        );
    }
}
