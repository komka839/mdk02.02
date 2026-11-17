package prac4.task3;

import java.util.Locale;

public class Practicum {

    public static void main(String[] args) {
        OrdersManager manager = new OrdersManager();

        manager.printAllOrders();

        System.out.printf(Locale.ROOT, "Всего заказов на сумму: %.2f%n", manager.getOrdersSum());

        System.out.println("Самая большая сумма заказов у " + manager.getMaxOrderCustomerName());
        manager.printCustomerOrders("Екатерина О.");

        manager.removeUnprofitableOrders();
    }
}
