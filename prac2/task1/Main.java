package prac2.task1;

public class Main {

    public static void main(String[] args) {
        Resources characterResources = new Resources();
        characterResources.gold = 200;
        characterResources.silver = 39;
        characterResources.wood = 2005;
        characterResources.health = 97;
        characterResources.hasHelper = true;

        Character character = new Character();
        character.gold = (int) characterResources.gold;
        character.silver = (int) (characterResources.silver * 100);
        character.wood = characterResources.wood;
        character.health = (byte) characterResources.health;
        if (characterResources.hasHelper) {
            character.helpersNumber = 1;
        } else {
            character.helpersNumber = 0;
        }

        System.out.println("Персонаж создан успешно!");
        System.out.println("Количество золота: " + character.gold);
        System.out.println("Количество серебра: " + character.silver);
        System.out.println("Количество дерева: " + character.wood);
        System.out.println("Здоровье: " + character.health);
        System.out.println("Количество помощников: " + character.helpersNumber);
        System.out.println("Навстречу приключениям!");
    }
}
