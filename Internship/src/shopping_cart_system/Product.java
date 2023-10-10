package shopping_cart_system;
import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class ShoppingCart {
    private ArrayList<Product> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cart.add(product);
        System.out.println(product.getName() + " added to the cart.");
    }

    public void removeProduct(String productName) {
        for (Product product : cart) {
            if (product.getName().equalsIgnoreCase(productName)) {
                cart.remove(product);
                System.out.println(productName + " removed from the cart.");
                return;
            }
        }
        System.out.println("Product not found in the cart.");
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : cart) {
            totalCost += product.getPrice() * product.getQuantity();
        }
        return totalCost;
    }

    public void displayCartContents() {
        if (cart.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Cart Contents:");
            for (Product product : cart) {
                System.out.println("Name: " + product.getName() + ", Price: $" + product.getPrice() + ", Quantity: " + product.getQuantity());
            }
        }
    }
}
