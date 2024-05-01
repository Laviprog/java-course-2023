package edu.hw4.task14;

import edu.hw4.Animal;
import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTask14 {
    @Test
    void test() {
        List<Animal> list = ListAnimals.getAnimalList();
        assertTrue(new AnimalStreams().task14(list, 90));
        assertFalse(new AnimalStreams().task14(list, 104));
    }
}
