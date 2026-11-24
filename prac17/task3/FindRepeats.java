package prac17.task3;

public class FindRepeats {

    int numberOfRepeats(String text, String substring) {
        int count = 0;
        if (substring.isEmpty()) {
            return 0;
        }
        StringBuilder sb = new StringBuilder(text);
        int index = sb.indexOf(substring);
        while (index != -1) {
            count++;
            // отрезаем всё от начала до конца найденного вхождения
            sb.delete(0, index + substring.length());
            index = sb.indexOf(substring);
        }
        return count;
    }

    public static void main(String[] args) {
        FindRepeats fr = new FindRepeats();
        System.out.println(fr.numberOfRepeats("abcabcabc", "abc")); // 3
        System.out.println(fr.numberOfRepeats("aaaa", "aa"));       // 2
        System.out.println(fr.numberOfRepeats("hello", "xyz"));     // 0
    }
}
