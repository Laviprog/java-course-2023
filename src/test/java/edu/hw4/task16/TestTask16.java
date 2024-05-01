package edu.hw4.task16;

import edu.hw4.Animal;
import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask16 {
    @Test
    void test() {
        List<Animal> list = ListAnimals.getAnimalList();
        assertEquals(
                new AnimalStreams().task16(list),
                List.of(
                        list.get(2),
                        list.get(8),
                        list.get(3),
                        list.get(0),
                        list.get(1),
                        list.get(4),
                        list.get(5),
                        list.get(7),
                        list.get(6)
                )
        );
    }
}
