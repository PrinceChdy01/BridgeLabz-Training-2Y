// Product.java
class Product {
    // Instance variables
    String productName;
    double price;

    // Class variable (static)
    static int totalProducts = 0;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products whenever a new product is created
    }

    // Instance method to display product details
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price       : Rs. " + price);
    }

    // Class method to display total products
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

// Main class
public class ProductInventoryDemo {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Smartphone", 20000);
        Product p3 = new Product("Headphones", 1500);

        // Display individual product details
        System.out.println("Product 1 Details:");
        p1.displayProductDetails();
        System.out.println();

        System.out.println("Product 2 Details:");
        p2.displayProductDetails();
        System.out.println();

        System.out.println("Product 3 Details:");
        p3.displayProductDetails();
        System.out.println();

        // Display total products using class method
        Product.displayTotalProducts();
    }
}
