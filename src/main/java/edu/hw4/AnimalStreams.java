package edu.hw4;

import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings({"AvoidStarImport", "MagicNumber"})
public class AnimalStreams {
    public List<Animal> task1(List<Animal> animals) {
        return animals.stream()
                .sorted(Comparator.comparing(Animal::height))
                .toList();
    }

    public List<Animal> task2(List<Animal> animals, int k) {
        return animals.stream()
                .sorted(Comparator.comparing(Animal::weight).reversed())
                .limit(k)
                .toList();
    }

    public Map<Animal.Type, Integer> task3(List<Animal> animals) {
        return animals.stream()
                .collect(Collectors.groupingBy(Animal::type, Collectors.summingInt(x -> 1)));
    }

    public Animal task4(List<Animal> animals) {
        return animals.stream()
                .max(Comparator.comparingInt(animal -> animal.name().length()))
                .orElse(null);
    }

    public Animal.Sex task5(List<Animal> animals) {
        return animals.stream()
                .collect(Collectors.groupingBy(Animal::sex, Collectors.summingInt(x -> 1)))
                .entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .orElseThrow()
                .getKey();
    }

    public Map<Animal.Type, Animal> task6(List<Animal> animals) {
        return animals.stream()
                .collect(Collectors.groupingBy(Animal::type, Collectors.maxBy(Comparator.comparing(Animal::weight))))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, x -> x.getValue().orElseThrow()));
    }

    public Animal task7(List<Animal> animals, int k) {
        return animals.stream()
                .sorted(Comparator.comparing(Animal::age).reversed())
                .limit(k)
                .min(Comparator.comparing(Animal::age))
                .orElse(null);
    }

    public Optional<Animal> task8(List<Animal> animals, int k) {
        return animals.stream()
                .filter(x -> x.height() < k)
                .max(Comparator.comparing(Animal::weight));
    }

    public Integer task9(List<Animal> animals) {
        return animals.stream()
                .mapToInt(Animal::paws)
                .sum();
    }

    public List<Animal> task10(List<Animal> animals) {
        return animals.stream()
                .filter(x -> x.age() != x.paws())
                .toList();
    }

    public List<Animal> task11(List<Animal> animals) {
        return animals.stream()
                .filter(x -> x.bites() && x.height() > 100)
                .toList();
    }

    public Integer task12(List<Animal> animals) {
        return animals.stream()
                .filter(x -> x.weight() > x.height())
                .toList()
                .size();
    }

    public List<Animal> task13(List<Animal> animals) {
        return animals.stream()
                .filter(x -> x.name().split(" ").length > 2)
                .toList();
    }

    public Boolean task14(List<Animal> animals, int k) {
        return animals.stream()
                .anyMatch(x -> x.type() == Animal.Type.DOG && x.height() > k);
    }

    public Map<Animal.Type, Integer> task15(List<Animal> animals, int k, int l) {
        return animals.stream()
                .filter(x -> x.age() >= k && x.age() <= l)
                .collect(Collectors.groupingBy(Animal::type, Collectors.summingInt(Animal::weight)));
    }

    public List<Animal> task16(List<Animal> animals) {
        return animals.stream()
                .sorted(Comparator.comparing(Animal::type).thenComparing(Animal::sex).thenComparing(Animal::name))
                .toList();
    }

    public Boolean task17(List<Animal> animals) {
        return animals.stream()
                .filter(x -> x.type() == Animal.Type.SPIDER || x.type() == Animal.Type.DOG)
                .collect(Collectors.groupingBy(Animal::type, Collectors.summingInt(x -> x.bites() ? 1 : 0)))
                .entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .orElseThrow()
                .getKey() == Animal.Type.SPIDER;
    }

    public final Animal task18(List<Animal>... animals) {
        return Arrays.stream(animals)
                .map(x -> x.stream()
                        .filter(animal -> animal.type() == Animal.Type.FISH)
                        .max(Comparator.comparing(Animal::weight))
                        .orElse(null)
                )
                .max(Comparator.comparing(animal1 -> animal1 != null ? animal1.weight() : 0))
                .orElse(null);
    }
}
