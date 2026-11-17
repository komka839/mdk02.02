package prac2.task2;

import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonAccount account = new PersonAccount();

        System.out.println("Введите имя:");
        account.name = scanner.nextLine();

        System.out.println("Открыть счёт в рублях? 1 — да, 2 — нет");
        if (scanner.nextInt() == 1) {
            account.rub = 0.0;
        }

        System.out.println("Открыть счёт в долларах? 1 — да, 2 — нет");
        if (scanner.nextInt() == 1) {
            account.usd = 0.0;
        }

        System.out.println("Открыть счёт в евро? 1 — да, 2 — нет");
        if (scanner.nextInt() == 1) {
            account.eur = 0.0;
        }

        System.out.println("Открытые счета:");
        if (account.rub != null) {
            System.out.println("RUB: " + account.rub);
        }
        if (account.usd != null) {
            System.out.println("USD: " + account.usd);
        }
        if (account.eur != null) {
            System.out.println("EUR: " + account.eur);
        }
    }
}
