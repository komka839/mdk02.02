package prac14.task1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practicum {

    private static Map<String, String> films = new LinkedHashMap<>();

    public static void main(String[] args) {
        films.put("Побег из Шоушенка", "Фрэнк Дарабонт");
        films.put("Крёстный отец", "Фрэнсис Форд Коппола");
        films.put("Тёмный рыцарь", "Кристофер Нолан");
        films.put("Форрест Гамп", "Роберт Земекис");
        films.put("Начало", "Кристофер Нолан");

        for (Map.Entry<String, String> entry : films.entrySet()) {
            System.out.println(entry.getKey() + " — реж. " + entry.getValue());
        }
    }
}
