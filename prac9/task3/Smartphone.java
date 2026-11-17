package prac9.task3;

public class Smartphone extends MobilePhone {
    private final String email;

    public Smartphone(String number, String email) {
        super(number);
        this.email = email;
    }

    public void makeCall(String targetNumber, String appName) {
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
    }

    public void sendEmail(String messageText, String email) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }
}