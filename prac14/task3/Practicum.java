package prac14.task3;

import java.util.Map;
import java.util.TreeMap;

public class Practicum {

    static class Car implements Comparable<Car> {
        final String model;
        final int priceInRubles;

        Car(String model, int priceInRubles) {
            this.model = model;
            this.priceInRubles = priceInRubles;
        }

        @Override
        public int compareTo(Car o) {
            return Integer.compare(this.priceInRubles, o.priceInRubles);
        }

        @Override
        public String toString() {
            return model + " — " + priceInRubles + " руб.";
        }
    }

    public static void main(String[] args) {
        Map<Car, String> showroom = new TreeMap<>();
        showroom.put(new Car("Lada Granta", 700_000), "в наличии");
        showroom.put(new Car("Toyota Camry", 3_500_000), "под заказ");
        showroom.put(new Car("Lada Vesta", 1_200_000), "в наличии");
        showroom.put(new Car("BMW X5", 6_800_000), "под заказ");
        showroom.put(new Car("Kia Rio", 1_500_000), "в наличии");

        for (Map.Entry<Car, String> entry : showroom.entrySet()) {
            System.out.println(entry.getKey() + " — " + entry.getValue());
        }
    }
}
