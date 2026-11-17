package prac4.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OrdersManager {

    private HashMap<String, ArrayList<Double>> customersOrders = new LinkedHashMap<>();

    public OrdersManager() {
        addCustomer("Александр Т.", 325.9);
        addCustomer("Александр Р.", 253.54, 420.5);
        addCustomer("Иван И.", 154.43, 5453.98, 8776.65);
        addCustomer("Екатерина О.", 780.54, 420.5, 36343.54, 2000.5);
        addCustomer("Ольга С.", 25343.54, 420.5);
    }

    private void addCustomer(String customer, double... orders) {
        ArrayList<Double> customerOrders = new ArrayList<>();
        for (double order : orders) {
            customerOrders.add(order);
        }
        customersOrders.put(customer, customerOrders);
    }

    public void printAllOrders() {
        for (String customer : customersOrders.keySet()) {
            System.out.println("Заказы " + customer + ":");
            System.out.println(customersOrders.get(customer));
        }
    }

    public double getOrdersSum() {
        double sum = 0;
        for (ArrayList<Double> customerOrders : customersOrders.values()) {
            for (double order : customerOrders) {
                sum += order;
            }
        }
        return sum;
    }

    public void printCustomerOrders(String customerName) {
        if (customersOrders.containsKey(customerName)) {
            System.out.println("Заказы " + customerName + ":");
            System.out.println(customersOrders.get(customerName));
        }
    }

    public String getMaxOrderCustomerName() {
        double maxOrder = 0;
        String customerName = "";
        for (String customer : customersOrders.keySet()) {
            double sum = 0;
            for (double order : customersOrders.get(customer)) {
                sum += order;
            }
            if (sum > maxOrder) {
                maxOrder = sum;
                customerName = customer;
            }
        }
        return customerName;
    }

    public void removeUnprofitableOrders() {
        List<String> toRemove = new ArrayList<>();
        for (String customer : customersOrders.keySet()) {
            double sum = 0;
            for (double order : customersOrders.get(customer)) {
                sum += order;
            }
            if (sum < 5000) {
                toRemove.add(customer);
            }
        }
        for (String customer : toRemove) {
            customersOrders.remove(customer);
            System.out.println("Клиента " + customer + " больше нет в таблице.");
        }
    }
}
