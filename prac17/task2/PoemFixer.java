package prac17.task2;

public class PoemFixer {

    public String[] readPoem() {
        return new String[]{
                "   Это кто там ложку «ложит»?",
                "",
                "   ",
                "Знай, такого быть не может!",
                "  Ложку мы на стол кладём,  ",
                "",
                "А тебя – к обеду ждём."
        };
    }

    public String fixPoem(String[] poem) {
        StringBuilder sb = new StringBuilder();
        for (String line : poem) {
            if (!line.isBlank()) {          // isBlank() покрывает и пустые, и из одних пробелов
                sb.append(line.trim()).append("\n");
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);  // убираем последний перенос строки
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        PoemFixer poemFixer = new PoemFixer();
        String[] poem = poemFixer.readPoem();
        String poemAsString = poemFixer.fixPoem(poem);
        System.out.println(poemAsString);
    }
}
