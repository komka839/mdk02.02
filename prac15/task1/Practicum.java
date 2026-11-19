package prac15.task1;

import java.util.HashSet;

public class Practicum {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Москва");

        System.out.println("Есть ли Москва во множестве?");
        System.out.println(cities.contains("Москва"));
    }
}
