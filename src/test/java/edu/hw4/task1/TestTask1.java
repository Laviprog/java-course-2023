package edu.hw4.task1;

import edu.hw4.Animal;
import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask1 {
    @Test
    public void test1() {
        List<Animal> list = ListAnimals.getAnimalList();
        assertEquals(new AnimalStreams().task1(list),
                List.of(
                        list.get(6),
                        list.get(5),
                        list.get(4),
                        list.get(2),
                        list.get(8),
                        list.get(7),
                        list.get(1),
                        list.get(0),
                        list.get(3)
                )
        );
    }
}
