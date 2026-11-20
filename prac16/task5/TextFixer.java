package prac16.task5;

import prac16.task4.Capitalizator;

public class TextFixer {
    public static String fixText(String text) {
        return Capitalizator.capitalize(
            text.trim()
                .replace("“", "«")
                .replace("”", "»")
                .replace("цевилизаций", "цивилизаций")
        );
    }

    public static void main(String[] args) {
        System.out.println(fixText("  “цевилизаций”  "));
        System.out.println(fixText("цевилизаций"));
    }
}
