package assigment1.a1;

import java.util.Scanner;

public class CafeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a cafe
        Cafe cafe = new Cafe();

        // Add menu items dynamically
        System.out.println("Enter details for 3 menu items:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter name for item " + i + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter price for item " + i + ": ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter category for item " + i + ": ");
            String category = scanner.nextLine();

            MenuItem menuItem = new MenuItem(name, price, category);
            if (i == 1) cafe.addMenuItem1(menuItem);
            else if (i == 2) cafe.addMenuItem2(menuItem);
            else if (i == 3) cafe.addMenuItem3(menuItem);
        }

        // Display the menu
        System.out.println("\nCafe Menu:");
        cafe.displayMenu();

        // Create an order
        order order = new order();
        System.out.println("\nPlace your order (choose up to 3 items by number):");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter item number to add to order (or 0 to skip): ");
            int choice = scanner.nextInt();
            if (choice == 0) break;

            if (choice == 1) order.addItem1(cafe.getMenuItem1());
            else if (choice == 2) order.addItem2(cafe.getMenuItem2());
            else if (choice == 3) order.addItem3(cafe.getMenuItem3());
        }

        // Display the order details
        System.out.println("\nOrder Details:");
        order.calculateTotal();
        order.displayOrderDetails();

        scanner.close();
    }
}