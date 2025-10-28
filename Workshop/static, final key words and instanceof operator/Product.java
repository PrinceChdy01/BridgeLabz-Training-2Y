public class Product {
    private static double discount = 10.0;  // Static discount shared by all products

    private final int productID;  // final: unique identifier
    private String productName;
    private double price;
    private int quantity;

    // Constructor uses 'this' to initialize fields
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "% for all products.");
    }

    // Display product details after validating with instanceof
    public void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after discount: $" + calculateDiscountedPrice());
        } else {
            System.out.println("Object is not an instance of Product.");
        }
    }

    // Calculate discounted price
    public double calculateDiscountedPrice() {
        return price * quantity * (1 - discount/100);
    }

    // Getters and setters (optional for encapsulation)
    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Test main method
    public static void main(String[] args) {
        Product prod1 = new Product(101, "Laptop", 1200.50, 1);
        Product prod2 = new Product(102, "Smartphone", 800, 2);

        prod1.displayProductDetails(prod1);
        System.out.println();
        prod2.displayProductDetails(prod2);
        System.out.println();

        // Update discount for all products
        Product.updateDiscount(15);

        prod1.displayProductDetails(prod1);
    }
}
