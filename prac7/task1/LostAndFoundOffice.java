package prac7.task1;
import java.util.ArrayList;

public class LostAndFoundOffice {
    // создаём список
    ArrayList<Object> things = new ArrayList<>();

    // метод put
    public void put(Object element) {
        things.add(element);
    }

    // метод check
    public boolean check(Object target) {
        if (target == null) {
            return false;
        }

        for (Object object : things) { // логика проверки
            if (object.equals(target)) {
                return true;
            }
        }

        return false;
    }
}