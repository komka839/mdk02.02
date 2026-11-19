package prac14.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practicum {

    static class User {
        final Long id;
        final String name;

        User(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "User(id=" + id + ", имя=" + name + ")";
        }
    }

    public static void main(String[] args) {
        int usersCount = 1_000_000;
        long targetId = 999_999;

        List<User> usersList = new ArrayList<>(usersCount);
        Map<Long, User> usersMap = new HashMap<>(usersCount);

        for (long i = 1; i <= usersCount; i++) {
            User user = new User(i, "Пользователь " + i);
            usersList.add(user);
            usersMap.put(i, user);
        }

        // Поиск в списке — перебор всех элементов до совпадения по ID.
        long listStart = System.nanoTime();
        User foundInList = null;
        for (User user : usersList) {
            if (user.id.equals(targetId)) {
                foundInList = user;
                break;
            }
        }
        long listTime = System.nanoTime() - listStart;

        // Поиск в хеш-таблице — доступ к ключу напрямую.
        long mapStart = System.nanoTime();
        User foundInMap = usersMap.get(targetId);
        long mapTime = System.nanoTime() - mapStart;

        double speedup = (double) listTime / mapTime;

        System.out.println("Ищем пользователя с id=" + targetId);
        System.out.println("Найден в списке:  " + foundInList);
        System.out.println("Найден в карте:   " + foundInMap);
        System.out.println("Время списка:  " + listTime + " нс");
        System.out.println("Время карты:   " + mapTime + " нс");
        System.out.println("Ускорение:     " + String.format("%.2f", speedup) + " раз");
    }
}
