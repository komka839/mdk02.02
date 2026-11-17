package prac2.task3;

public class Practicum {

    public static void main(String[] args) {
        Float total = getMinKcalsSum("43", "30.2", "23.8", "32.1", "13.5");
        System.out.println("Калорийность рациона Пикселя за день: " + total);
        checkKcal(total);
    }

    public static Float getMinKcalsSum(String previousIntake, String beef, String chicken,
                                       String cream, String milk) {
        int previous = Integer.parseInt(previousIntake);
        Float mainCourse = Float.min(Float.parseFloat(beef), Float.parseFloat(chicken));
        Float dessert = Float.min(Float.parseFloat(cream), Float.parseFloat(milk));
        return previous + mainCourse + dessert;
    }

    public static void checkKcal(Float kcal) {
        if (kcal <= 100) {
            System.out.println("Лимит не превышен!");
        } else {
            System.out.println("Лимит превышен!");
        }
    }
}
