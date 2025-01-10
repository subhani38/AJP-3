package com.inventory;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        InventoryService service = new InventoryService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Management System:");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Remove Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    service.addProduct(new Product(id, name, category, quantity, price));
                    System.out.println("Product added successfully!");
                    break;
                case 2:
                    System.out.println("\nAvailable Products:");
                    for (Product product : service.viewProducts()) {
                        System.out.println(product);
                    }
                    break;
                case 3:
                    System.out.print("Enter Product ID to Update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter New Quantity: ");
                    int newQuantity = scanner.nextInt();
                    System.out.print("Enter New Price: ");
                    double newPrice = scanner.nextDouble();
                    service.updateProduct(updateId, newQuantity, newPrice);
                    System.out.println("Product updated successfully!");
                    break;
                case 4:
                    System.out.print("Enter Product ID to Remove: ");
                    String removeId = scanner.nextLine();
                    service.deleteProduct(removeId);
                    System.out.println("Product removed successfully!");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
