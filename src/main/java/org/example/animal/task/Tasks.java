package org.example.animal.task;

import org.example.animal.animal.Animal;

import java.util.*;
import java.util.stream.Collectors;

public class Tasks {
    public static int findLionAge(List<Animal> animals) {
        return animals.stream()
                .filter(animal -> animal.getName().equalsIgnoreCase("львенок"))
                .findFirst()
                .map(Animal::getAge)
                .orElseThrow(() -> new IllegalArgumentException("Львенок не найден"));
    }

    public static void printAnimalsInAscendingOrder(List<Animal> animals) {
        animals.stream()
                .sorted(Comparator.comparingInt(Animal::getAge))
                .forEach(animal -> System.out.println(animal.getName() + ": " + animal.getAge()));
    }

    public static long countAnimalsAboveAge(List<Animal> animals, int age) {
        return animals.stream()
                .filter(animal -> animal.getAge() > age)
                .count();
    }

    public static Map<String, Animal> createAnimalMap(List<Animal> animals) {
        return animals.stream()
                .collect(Collectors.toMap(Animal::getName, animal -> animal));
    }

    public static void printAnimalMap(Map<String, Animal> animalMap) {
        animalMap.forEach((name, animal) -> System.out.println(name + ": " + animal.getAge()));
    }

    public static String getAllAnimalNames(List<Animal> animals) {
        return animals.stream()
                .map(Animal::getName)
                .reduce((name1, name2) -> name1 + ", " + name2)
                .orElse("");
    }
}
