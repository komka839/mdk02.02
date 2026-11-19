package prac14.task5;

import java.util.HashMap;
import java.util.Map;

/*
 * Пример из урока: собственная таблица на базе HashMap с логированием put().
 */
public class YandexPracticumMap<K, V> extends HashMap<K, V> {

    @Override
    public V put(K key, V value) {
        System.out.println("Сохранение значения " + value + " в ключе " + key);
        return super.put(key, value);
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new YandexPracticumMap<>();
        map.put("Яндекс", 1);
        map.put("Практикум", 2);
    }
}
