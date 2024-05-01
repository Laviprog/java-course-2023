package edu.hw4.task2;

import edu.hw4.Animal;
import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask2 {
    @Test
    void test() {
        List<Animal> list = ListAnimals.getAnimalList();
        assertEquals(new AnimalStreams().task2(list, 3),
                List.of(
                        list.get(0),
                        list.get(3),
                        list.get(7)
                )
        );
    }
}
