package prac16.task1;

public class CleanInput {
    public static String fixString(String input) {
        if (input.isBlank()) {
            return "Вы ничего не ввели!";
        }
        return input.trim();
    }

    public static void main(String[] args) {
        System.out.println(fixString("   "));
        System.out.println(fixString("  привет  "));
        System.out.println(fixString("мир"));
    }
}
