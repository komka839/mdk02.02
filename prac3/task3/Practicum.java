package prac3.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("chinchilla");
        animals.add("crocodile");
        animals.add("lion");
        animals.add("bear");
        animals.add("elephant");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Показать всех животных");
            System.out.println("2. Добавить животное");
            System.out.println("3. Удалить животное");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить наличие животного");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                for (String animal : animals) {
                    System.out.println(animal);
                }
            } else if (choice == 2) {
                System.out.print("Имя животного: ");
                animals.add(scanner.next());
            } else if (choice == 3) {
                if (!animals.isEmpty()) {
                    System.out.print("Имя животного для удаления: ");
                    animals.remove(scanner.next());
                }
            } else if (choice == 4) {
                if (!animals.isEmpty()) {
                    animals.clear();
                }
            } else if (choice == 5) {
                System.out.print("Имя животного: ");
                String name = scanner.next();
                System.out.println("Есть такое животное? " + animals.contains(name));
            }
        }
    }
}
