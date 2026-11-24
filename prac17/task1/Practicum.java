package prac17.task1;

public class Practicum {
    public static void main(String[] args) {
        StringBuilder hello = new StringBuilder("Привет! Меня зовут "); // начало
        hello.append("Иван");
        hello.append(". Я из города ");
        hello.append("Казань.");

        String asString = hello.toString();
        System.out.println(asString);
    }
}
