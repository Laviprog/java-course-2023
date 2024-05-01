package edu.hw4;

import java.util.List;

public class ListAnimals {
    public static List<Animal> getAnimalList() {
        return List.of(
                new Animal("Dog1 Top super", Animal.Type.DOG, Animal.Sex.M, 10, 103, 100, true),
                new Animal("Dog2", Animal.Type.DOG, Animal.Sex.F, 9, 70, 50, false),
                new Animal("Cat1", Animal.Type.CAT, Animal.Sex.M, 11, 30, 40, false),
                new Animal("Cat2 Bot robot", Animal.Type.CAT, Animal.Sex.F, 1, 120, 90, true),
                new Animal("Bird", Animal.Type.BIRD, Animal.Sex.F, 5, 23, 34, false),
                new Animal("Fish1 top", Animal.Type.FISH, Animal.Sex.M, 8, 18, 19, false),
                new Animal("Spider", Animal.Type.SPIDER, Animal.Sex.M, 15, 2, 3, true),
                new Animal("Fish2", Animal.Type.FISH, Animal.Sex.F, 3, 49, 54, false),
                new Animal("Cat3", Animal.Type.CAT, Animal.Sex.M, 4, 32, 35, false)
        );
    }
}
