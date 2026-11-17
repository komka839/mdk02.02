package prac12.task2;

public class Practicum {

    public static void main(String[] args) {
        HandMadeArrayList<String> list = new HandMadeArrayList<>();

        list.add("Январь");
        list.add("Февраль");
        list.add("Март");
        list.add("Апрель");
        list.add("Май");

        System.out.println("Список: " + list);
        System.out.println("Размер: " + list.size());
        System.out.println("Элемент с индексом 2: " + list.get(2));
    }
}
