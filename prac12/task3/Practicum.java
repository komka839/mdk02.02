package prac12.task3;

import java.util.NoSuchElementException;

public class Practicum {

    public static void main(String[] args) {
        HandMadeLinkedList<String> list = new HandMadeLinkedList<>();

        list.addFirst("второй");
        list.addFirst("первый");
        list.addLast("третий");

        System.out.println("Список: " + list);
        System.out.println("Первый: " + list.getFirst());
        System.out.println("Последний: " + list.getLast());
        System.out.println("Размер: " + list.size());

        HandMadeLinkedList<String> empty = new HandMadeLinkedList<>();
        try {
            empty.getLast();
        } catch (NoSuchElementException e) {
            System.out.println("getLast() из пустого списка бросил NoSuchElementException");
        }
    }
}
