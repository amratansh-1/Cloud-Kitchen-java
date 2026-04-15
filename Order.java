package cloudmarket;

import java.util.*;

public class Order {
    private static int counter = 1;
    private int orderId;
    private List<MenuItem> items;
    private double total;

    public Order() {
        this.orderId = counter++;
        this.items = new ArrayList<>();
        this.total = 0;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        total += item.getPrice();
    }

    public double getTotal() {
        return total;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        for (MenuItem item : items) {
            System.out.println(item.getName() + " - ₹" + item.getPrice());
        }
        System.out.println("Total: ₹" + total);
    }
}
