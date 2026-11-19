package prac15.task5;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practicum {

    public static Set<String> findUniquePurchases(List<String> allPurchases) {
        return new HashSet<>(allPurchases);
    }

    public static void main(String[] args) {
        List<String> allPurchases = List.of(
                "Хлеб", "Молоко", "Яйца", "Хлеб",
                "Сыр", "Молоко", "Яйца", "Хлеб"
        );

        Set<String> unique = findUniquePurchases(allPurchases);
        System.out.println("Куплено уникальных продуктов: " + unique.size());
    }
}
