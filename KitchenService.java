package cloudmarket;

import java.util.*;

public class KitchenService {
    private List<MenuItem> menu;
    private List<Order> orders;

    public KitchenService() {
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void showMenu() {
        System.out.println("\n--- MENU ---");
        for (MenuItem item : menu) {
            item.display();
        }
    }

    public MenuItem findItem(int id) {
        for (MenuItem item : menu) {
            if (item.getId() == id) return item;
        }
        return null;
    }

    public void placeOrder(Scanner sc) {
        Order order = new Order();

        while (true) {
            System.out.print("Enter item ID (0 to finish): ");
            int id = sc.nextInt();

            if (id == 0) break;

            MenuItem item = findItem(id);
            if (item != null) {
                order.addItem(item);
                System.out.println("Added!");
            } else {
                System.out.println("Item not found.");
            }
        }

        orders.add(order);
        System.out.println("Order placed successfully!");
        order.displayOrder();
    }

    public void showOrders() {
        for (Order order : orders) {
            order.displayOrder();
            System.out.println("------------------");
        }
    }
}