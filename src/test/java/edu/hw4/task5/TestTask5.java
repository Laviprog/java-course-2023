package edu.hw4.task5;

import edu.hw4.Animal;
import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask5 {
    @Test
    void test() {
        assertEquals(Animal.Sex.M, new AnimalStreams().task5(ListAnimals.getAnimalList()));
    }
}
