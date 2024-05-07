package edu.hw4.task17;

import edu.hw4.Animal;
import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTask17 {
    @Test
    void test() {
        List<Animal> list = ListAnimals.getAnimalList();
        //assertFalse(new AnimalStreams().task17(list));
        List<Animal> list2 = List.of(
                new Animal("Dog1 Top super", Animal.Type.DOG, Animal.Sex.M, 10, 103, 100, false),
                new Animal("Dog2", Animal.Type.DOG, Animal.Sex.F, 9, 70, 50, false),
                new Animal("Spider", Animal.Type.SPIDER, Animal.Sex.M, 15, 2, 3, true)
        );
        assertTrue(new AnimalStreams().task17(list2));
    }
}
