import java.util.Scanner;
public class InventoryManagementSystem {
    static class Product {
        int id;
        String name;
        int quantity;
        double price;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[100];
        int count = 0;
        while (true) {
            System.out.println("\n----- Inventory Management System -----");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Increase Stock");
            System.out.println("7. Decrease Stock");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    products[count] = new Product();
                    System.out.print("Enter Product ID: ");
                    products[count].id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    products[count].name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    products[count].quantity = sc.nextInt();
                    System.out.print("Enter Price: ");
                    products[count].price = sc.nextDouble();
                    count++;
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No products available.");
                    } 
                    else {
                        System.out.println("\nID\tName\tQuantity\tPrice");
                        for (int i = 0; i < count; i++) {
                            System.out.println(products[i].id + "\t"
                                    + products[i].name + "\t"
                                    + products[i].quantity + "\t\t"
                                    + products[i].price);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Product ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (products[i].id == searchId) {
                            System.out.println("Product Found");
                            System.out.println("ID: " + products[i].id);
                            System.out.println("Name: " + products[i].name);
                            System.out.println("Quantity: " + products[i].quantity);
                            System.out.println("Price: " + products[i].price);
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Product not found.");
                    break;
                case 4:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = sc.nextInt();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (products[i].id == updateId) {
                            sc.nextLine();
                            System.out.print("Enter New Name: ");
                            products[i].name = sc.nextLine();
                            System.out.print("Enter New Quantity: ");
                            products[i].quantity = sc.nextInt();
                            System.out.print("Enter New Price: ");
                            products[i].price = sc.nextDouble();
                            System.out.println("Product updated successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Product not found.");

                    break;
                case 5:
                    System.out.print("Enter Product ID to delete: ");
                    int deleteId = sc.nextInt();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (products[i].id == deleteId) {
                            for (int j = i; j < count - 1; j++) {
                                products[j] = products[j + 1];
                            }
                            products[count - 1] = null;
                            count--;
                            System.out.println("Product deleted successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Product not found.");
                    break;
                case 6:
                    System.out.print("Enter Product ID: ");
                    int addId = sc.nextInt();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (products[i].id == addId) {
                            System.out.print("Enter quantity to add: ");
                            int addQty = sc.nextInt();
                            products[i].quantity += addQty;
                            System.out.println("Stock updated.");
                            System.out.println("Current Quantity: " + products[i].quantity);
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Product not found.");
                    break;
                case 7:
                    System.out.print("Enter Product ID: ");
                    int removeId = sc.nextInt();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (products[i].id == removeId) {
                            System.out.print("Enter quantity to remove: ");
                            int removeQty = sc.nextInt();
                            if (removeQty <= products[i].quantity) {
                                products[i].quantity -= removeQty;
                                System.out.println("Stock updated.");
                                System.out.println("Current Quantity: " + products[i].quantity);
                            } else {
                                System.out.println("Insufficient stock.");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Product not found.");
                    break;
                case 8:
                    System.out.println("Thank you for using Inventory Management System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
