package prac15.task4;

import java.util.Comparator;
import java.util.TreeSet;

public class Practicum {

    static class Ticket {
        final String destination;
        final int priceInUsd;

        Ticket(String destination, int priceInUsd) {
            this.destination = destination;
            this.priceInUsd = priceInUsd;
        }

        @Override
        public String toString() {
            return destination + " — $" + priceInUsd;
        }
    }

    public static void main(String[] args) {
        Comparator<Ticket> byPrice = Comparator.comparingInt(t -> t.priceInUsd);
        TreeSet<Ticket> tickets = new TreeSet<>(byPrice);

        tickets.add(new Ticket("Москва", 120));
        tickets.add(new Ticket("Токио", 450));
        tickets.add(new Ticket("Берлин", 200));
        tickets.add(new Ticket("Нью-Йорк", 350));
        tickets.add(new Ticket("Лондон", 180));

        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }
}
