package prac17.task6;

import java.util.ArrayList;
import java.util.List;

public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно":
                return "5";
            case "Потрясающе":
                return "4";
            case "Восхитительно":
                return "3";
            case "Прекрасно":
                return "2";
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        List<String> records = new ArrayList<>();
        for (String line : grades) {
            // "Вероника Чехова физика — Безупречно" -> [0]имя [1]фамилия [2]предмет [3]— [4]оценка
            String[] parts = line.split(" ");
            String record = String.join(",",
                    parts[0].toLowerCase(),
                    parts[1].toLowerCase(),
                    parts[2].toLowerCase(),
                    gradeStringToInt(parts[4]));
            records.add(record);
        }
        return String.join(";", records);
    }

    public static void main(String[] args) {
        String[] backup = {
                "Вероника Чехова физика — Безупречно",
                "Анна Строкова математика — Потрясающе",
                "Иван Петров геометрия — Безупречно"
        };
        System.out.println(new GradesReversed().serializeGrades(backup));
        // вероника,чехова,физика,5;анна,строкова,математика,4;иван,петров,геометрия,5
    }
}
