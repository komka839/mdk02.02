package prac15.task2;

import java.util.HashSet;
import java.util.List;

public class Practicum {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Иван", "Пётр", "Мария", "Иван",
                "Сергей", "Анна", "Пётр", "Ольга",
                "Мария", "Дмитрий"
        );

        System.out.println("Всего имён: " + names.size());
        System.out.println("Уникальных имён: " + new HashSet<>(names).size());
    }
}
