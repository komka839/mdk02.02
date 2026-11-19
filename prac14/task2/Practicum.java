package prac14.task2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Practicum {

    static class User {
        final int userId;
        final String name;

        User(int userId, String name) {
            this.userId = userId;
            this.name = name;
        }

        @Override
        public String toString() {
            return "userId=" + userId + ", имя=" + name;
        }
    }

    public static void main(String[] args) {
        Comparator<User> byName = Comparator.comparing(user -> user.name);

        Map<User, String> users = new TreeMap<>(byName);
        users.put(new User(5, "Елена"), "младший аналитик");
        users.put(new User(2, "Алексей"), "ведущий разработчик");
        users.put(new User(8, "Мария"), "дизайнер");
        users.put(new User(1, "Иван"), "менеджер");
        users.put(new User(3, "Ольга"), "тестировщик");

        for (Map.Entry<User, String> entry : users.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
