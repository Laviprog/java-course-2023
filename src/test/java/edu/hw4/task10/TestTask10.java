package edu.hw4.task10;

import edu.hw4.Animal;
import edu.hw4.AnimalStreams;
import edu.hw4.ListAnimals;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask10 {
    @Test
    void test() {
        assertEquals(new AnimalStreams().task10(ListAnimals.getAnimalList()),
                List.of(
                        new Animal("Dog1 Top super", Animal.Type.DOG, Animal.Sex.M, 10, 103, 100, true),
                        new Animal("Dog2", Animal.Type.DOG, Animal.Sex.F, 9, 70, 50, false),
                        new Animal("Cat1", Animal.Type.CAT, Animal.Sex.M, 11, 30, 40, false),
                        new Animal("Cat2 Bot robot", Animal.Type.CAT, Animal.Sex.F, 1, 120, 90, true),
                        new Animal("Bird", Animal.Type.BIRD, Animal.Sex.F, 5, 23, 34, false),
                        new Animal("Fish1 top", Animal.Type.FISH, Animal.Sex.M, 8, 18, 19, false),
                        new Animal("Spider", Animal.Type.SPIDER, Animal.Sex.M, 15, 2, 3, true),
                        new Animal("Fish2", Animal.Type.FISH, Animal.Sex.F, 3, 49, 54, false)
                ));
    }
}
