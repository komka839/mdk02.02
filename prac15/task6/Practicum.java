package prac15.task6;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practicum {

    static class Letter {
        final String subject;
        final LocalDate dateReceived;

        Letter(String subject, LocalDate dateReceived) {
            this.subject = subject;
            this.dateReceived = dateReceived;
        }

        @Override
        public String toString() {
            return dateReceived + ": " + subject;
        }
    }

    public static void printOrderedByDateReceived(LinkedHashSet<Letter> letters) {
        TreeSet<Letter> orderedByDate = new TreeSet<>(Comparator.comparing(l -> l.dateReceived));
        orderedByDate.addAll(letters);
        for (Letter letter : orderedByDate) {
            System.out.println(letter);
        }
    }

    public static void main(String[] args) {
        LinkedHashSet<Letter> letters = new LinkedHashSet<>();
        letters.add(new Letter("Письмо C", LocalDate.of(2026, 11, 15)));
        letters.add(new Letter("Письмо A", LocalDate.of(2026, 11, 10)));
        letters.add(new Letter("Письмо B", LocalDate.of(2026, 11, 12)));

        printOrderedByDateReceived(letters);
    }
}
