package prac14.task4;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) {
        List<String> actors = List.of(
                "Шон Коннери",
                "Джордж Лэзенби",
                "Роджер Мур",
                "Шон Коннери",
                "Тимоти Далтон",
                "Пирс Броснан",
                "Джордж Лэзенби",
                "Даниэль Крейг"
        );

        Map<String, Integer> actorsMap = new LinkedHashMap<>();
        for (String actor : actors) {
            actorsMap.put(actor, actorsMap.getOrDefault(actor, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : actorsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " фильмов");
        }
    }
}
