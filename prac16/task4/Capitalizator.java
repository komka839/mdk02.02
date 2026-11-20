package prac16.task4;

public class Capitalizator {
    public static String capitalize(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(capitalize("привет"));
        System.out.println(capitalize("мир"));
    }
}
