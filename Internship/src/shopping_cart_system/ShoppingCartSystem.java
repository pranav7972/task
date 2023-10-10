package shopping_cart_system;
import java.util.Scanner;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add a product to the cart");
            System.out.println("2. Remove a product from the cart");
            System.out.println("3. View cart contents");
            System.out.println("4. Calculate total cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int productQuantity = scanner.nextInt();
                    Product productToAdd = new Product(productName, productPrice, productQuantity);
                    cart.addProduct(productToAdd);
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    String productToRemove = scanner.nextLine();
                    cart.removeProduct(productToRemove);
                    break;
                case 3:
                    cart.displayCartContents();
                    break;
                case 4:
                    double totalCost = cart.calculateTotalCost();
                    System.out.println("Total cost of the cart: $" + totalCost);
                    break;
                case 5:
                    System.out.println("Exiting the shopping cart program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
