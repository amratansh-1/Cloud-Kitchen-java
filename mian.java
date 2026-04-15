package cloudmarket;

import java.util.*;

public class mian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KitchenService service = new KitchenService();

        // Sample Menu
        service.addMenuItem(new MenuItem(1, "Burger", 120));
        service.addMenuItem(new MenuItem(2, "Pizza", 250));
        service.addMenuItem(new MenuItem(3, "Pasta", 180));

        while (true) {
            System.out.println("\n1. Show Menu");
            System.out.println("2. Place Order");
            System.out.println("3. View Orders");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.showMenu();
                    break;
                case 2:
                    service.placeOrder(sc);
                    break;
                case 3:
                    service.showOrders();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
