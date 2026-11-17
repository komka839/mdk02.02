package prac4.task1;

import java.util.HashMap;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) {
        Map<String, Double> orders = new HashMap<>();
        orders.put("Иванов", 100000.0);
        orders.put("Петров", 250000.5);
        orders.put("Сидоров", 300000.75);
        orders.put("Кузнецов", 150000.01);
        orders.put("Смирнов", 200000.0);
        orders.put("Васильев", 140780.0);

        double total = 0;
        for (double order : orders.values()) {
            total += order;
        }

        System.out.println("Всего было совершено заказов на сумму: " + total);
    }
}
