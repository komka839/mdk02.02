package prac15.task3;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Practicum {
    public static void main(String[] args) {
        List<String> playedToday = List.of(
                "Песня А", "Песня Б", "Песня В", "Песня А",
                "Песня Б", "Песня Г", "Песня Д", "Песня Е",
                "Песня Ф", "Песня А"
        );

        Set<String> uniqueSongs = new LinkedHashSet<>(playedToday);
        for (String song : uniqueSongs) {
            System.out.println(song);
        }
    }
}
