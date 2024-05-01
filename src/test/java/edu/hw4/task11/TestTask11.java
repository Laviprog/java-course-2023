package edu.hw4.task11;

import edu.hw4.Animal;
import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask11 {
    @Test
    void test() {
        List<Animal> list = ListAnimals.getAnimalList();
        assertEquals(
                new AnimalStreams().task11(list),
                List.of(
                        list.get(0),
                        list.get(3)
                )
        );
    }
}
