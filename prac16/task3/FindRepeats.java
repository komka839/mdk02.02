package prac16.task3;

public class FindRepeats {
    public static int numberOfRepeats(String text, String substring) {
        int count = 0;
        while (text.contains(substring)) {
            int index = text.indexOf(substring);
            count++;
            text = text.substring(index + substring.length());
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfRepeats("абра-кадабра", "абра"));
        System.out.println(numberOfRepeats("aaaa", "aa"));
        System.out.println(numberOfRepeats("hello", "z"));
    }
}
