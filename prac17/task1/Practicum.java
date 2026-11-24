package prac17.task1;

public class Practicum {
    public static void main(String[] args) {
        // Задание 1
        StringBuilder hello = new StringBuilder("Привет! Меня зовут "); // начало
        hello.append("Иван");                // <ваше имя>
        hello.append(". Я из города ");
        hello.append("Казань.");             // <ваш город>

        String asString = hello.toString();
        System.out.println(asString);
    }
}
