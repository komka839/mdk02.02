package prac12.task4;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime o1, DateTime o2) {
        int result = Integer.compare(o1.year, o2.year);
        if (result != 0) {
            return result;
        }
        result = Integer.compare(o1.month, o2.month);
        if (result != 0) {
            return result;
        }
        result = Integer.compare(o1.day, o2.day);
        if (result != 0) {
            return result;
        }
        result = Integer.compare(o1.hours, o2.hours);
        if (result != 0) {
            return result;
        }
        result = Integer.compare(o1.minutes, o2.minutes);
        if (result != 0) {
            return result;
        }
        return Integer.compare(o1.seconds, o2.seconds);
    }
}
