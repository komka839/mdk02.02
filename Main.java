import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ПЕРВОЕ ЗАДАНИЕ
        double rubles = 30002.7;
        double rateUSD = 78.5;
        double dollars = rubles / rateUSD;
        System.out.println("У вас на счету " + rubles + " рублей. В долларах это " + dollars + " долларов. Так держать!");

        // ВТОРОЕ ЗАДАНИЕ
        String weather = in.next();
        if (weather.equals("Дождь")) {
            System.out.println("Беру с собой зонт");
        } else {
            System.out.println("Иду налегке");
        }
        System.out.println("Люблю гулять!");

        // ТРЕТЬЕ ЗАДАНИЕ
        int eggs = in.nextInt();
        if (eggs >= 3) {
            System.out.println("Рекомендую приготовить омлет.");
        } else {
            System.out.println("Рекомендую позавтракать бутербродами.");
        }
        System.out.println("Приятного аппетита!");
    }
}