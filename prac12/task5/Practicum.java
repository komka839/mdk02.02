package prac12.task5;

import java.util.ArrayList;
import java.util.List;

public class Practicum {

    public static void main(String[] args) {
        List<Potato> potatoes = new ArrayList<>();
        potatoes.add(new Potato(1, 100, 50, 40));
        potatoes.add(new Potato(2, 200, 60, 50));
        potatoes.add(new Potato(3, 50, 30, 20));
        potatoes.add(new Potato(4, 300, 70, 60));
        potatoes.add(new Potato(5, 150, 55, 45));

        List<Potato> experiment = findPotatoesForExperiment(potatoes);

        System.out.println("Картофель для эксперимента (от меньшего к большему):");
        for (Potato potato : experiment) {
            System.out.println(potato);
        }
    }

    public static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
        List<Potato> sorted = new ArrayList<>(potatoes);
        sorted.sort(null);

        int size = sorted.size();
        List<Potato> result = new ArrayList<>();
        result.add(sorted.get(0));
        result.add(sorted.get(1));
        result.add(sorted.get(size - 2));
        result.add(sorted.get(size - 1));
        return result;
    }
}
