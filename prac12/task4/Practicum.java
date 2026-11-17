package prac12.task4;

public class Practicum {

    public static void main(String[] args) {
        DateTime today = new DateTime(17, 11, 2026, 10, 0, 0);
        DateTime timeOfRent = new DateTime(10, 11, 2026, 12, 0, 0);
        DateTime timeOfReturn = new DateTime(20, 11, 2026, 12, 0, 0);

        RentedFilm film1 = new RentedFilm("Интерстеллар", timeOfRent, timeOfReturn);

        DateTimeComparator comparator = new DateTimeComparator();
        boolean overdue = comparator.compare(today, film1.getTimeOfReturn()) > 0;

        System.out.println("Фильм \"" + film1.getTimeOfReturn().day + "."
                + film1.getTimeOfReturn().month + "."
                + film1.getTimeOfReturn().year + "\" — просрочен: " + overdue);
    }
}
