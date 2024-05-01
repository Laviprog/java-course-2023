package edu.hw4.task9;

import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask9 {
    @Test
    void test() {
        assertEquals(30, new AnimalStreams().task9(ListAnimals.getAnimalList()));
    }
}
