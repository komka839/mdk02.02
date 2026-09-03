import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long gold = 999999999L;
        byte silver = 99;
        short wood = 1586;
        long health = 99L;
        boolean hasHelper = true;
        Resources char_res = new Resources (
                gold,
                silver,
                wood,
                health,
                hasHelper
        );
        int characterGold = (int) char_res.gold;
        int chatacterSilver = char_res.silver * 100;
        double characterWood = char_res.wood;
        byte characterHealth = (byte) char_res.health;
        byte charecterHelpersNumber;

        if (char_res.hasHelper) {
            charecterHelpersNumber = 1;
        } else {
            charecterHelpersNumber = 0;
        }
        Character ch = new Character (
                characterGold,
                chatacterSilver,
                characterWood,
                characterHealth,
                charecterHelpersNumber
        );
        System.out.println("Персонаж создан успешно!");
        System.out.println("Количество золота: " + ch.gold);
        System.out.println("Количество серебра: " + ch.silver);
        System.out.println("Количество дерева: " + ch.wood);
        System.out.println("Здоровье: " + ch.health);
        System.out.println("Количество помощников: " + ch.helpersNumber);
        System.out.println("Навстречу приключениям!");
    }
}