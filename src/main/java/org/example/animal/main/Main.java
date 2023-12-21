package org.example.animal.main;

import org.example.animal.animal.Animal;
import org.example.animal.task.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Коровка", 1));
        animals.add(new Animal("Свинка", 2));
        animals.add(new Animal("Котик", 3));
        animals.add(new Animal("Песель", 4));
        animals.add(new Animal("Утка", 5));
        animals.add(new Animal("Тигренок", 6));
        animals.add(new Animal("Зебра", 7));
        animals.add(new Animal("Слоник", 8));
        animals.add(new Animal("Гиппопотам", 9));
        animals.add(new Animal("Лошадка", 10));
//  если раскомментировать эту строку, львенок выводится
//         animals.add(new Animal("Львенок", 18));
        try {
            int lionAge = Tasks.findLionAge(animals);
            System.out.println("Возраст царя зверей: " + lionAge);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("_____________");
        System.out.println("Сортируем животных по возрасту:");
        Tasks.printAnimalsInAscendingOrder(animals);
        System.out.println("_____________");
        long countAnimalsAboveFour = Tasks.countAnimalsAboveAge(animals, 4);
        System.out.println("Количество животных, у которых возраст больше 4: " + countAnimalsAboveFour);
        System.out.println("_____________");
        Map<String, Animal> animalMap = Tasks.createAnimalMap(animals);
        System.out.println("Мапа животных:");
        Tasks.printAnimalMap(animalMap);
        System.out.println("_____________");
        String allAnimalNames = Tasks.getAllAnimalNames(animals);
        System.out.println("Названия животных: " + allAnimalNames);
    }
}

