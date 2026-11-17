package prac3.task2;

import java.util.ArrayList;
import java.util.List;

public class Practicum {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("chinchilla");
        animals.add("crocodile");
        animals.add("lion");
        animals.add("bear");
        animals.add("elephant");

        System.out.println("Животные в зоопарке:");
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println("Количество животных: " + animals.size());

        System.out.println("График кормления:");
        System.out.println("1. " + animals.get(1)); // крокодил
        System.out.println("2. " + animals.get(4)); // слон
        System.out.println("3. " + animals.get(0)); // чинчилла
        System.out.println("4. " + animals.get(2)); // лев
        System.out.println("5. " + animals.get(3)); // медведь
    }
}
