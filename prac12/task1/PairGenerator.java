package prac12.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PairGenerator {

    public List<List<Stranger>> splitByPairs(List<Stranger> strangers) {
        List<List<Stranger>> pairs = new ArrayList<>();
        while (strangers.size() >= 2) {
            pairs.add(getRandomPair(strangers));
        }
        return pairs;
    }

    private List<Stranger> getRandomPair(List<Stranger> strangers) {
        int indexOne = ThreadLocalRandom.current().nextInt(strangers.size());
        Stranger strangerOne = strangers.get(indexOne);

        int indexTwo;
        Stranger strangerTwo;
        do {
            indexTwo = ThreadLocalRandom.current().nextInt(strangers.size());
            strangerTwo = strangers.get(indexTwo);
        } while (indexTwo == indexOne);

        List<Stranger> pair = List.of(strangerOne, strangerTwo);
        strangers.removeAll(pair);
        return pair;
    }
}
