package prac12.task1;

import java.util.ArrayList;
import java.util.List;

public class Practicum {

    public static void main(String[] args) {
        List<Stranger> strangers = new ArrayList<>();
        strangers.add(new Stranger("Анна", 25));
        strangers.add(new Stranger("Борис", 30));
        strangers.add(new Stranger("Виктория", 22));
        strangers.add(new Stranger("Глеб", 28));
        strangers.add(new Stranger("Даша", 26));
        strangers.add(new Stranger("Егор", 31));

        PairGenerator generator = new PairGenerator();
        List<List<Stranger>> pairs = generator.splitByPairs(strangers);

        System.out.println("Пары для Random Coffee:");
        for (List<Stranger> pair : pairs) {
            System.out.println(pair);
        }

        if (!strangers.isEmpty()) {
            System.out.println("Без пары остался: " + strangers);
        }
    }
}
