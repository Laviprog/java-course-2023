package edu.hw4.task4;

import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask4 {
    @Test
    void test() {
        assertEquals(new AnimalStreams().task4(ListAnimals.getAnimalList()), ListAnimals.getAnimalList().getFirst());
    }
}
