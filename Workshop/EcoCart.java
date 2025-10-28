import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double getDiscountedPrice();

    public void displayProductInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + price);
        System.out.println("Discounted Price: " + getDiscountedPrice());
        System.out.println();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product p = (Product) obj;
        return this.id == p.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
class OrganicProduct extends Product {
    public OrganicProduct(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice() * 0.90; // 10% discount
    }

    @Override
    public String toString() {
        return "Product ID: " + getId() +
               ", Name: " + getName() +
               ", Base Price: " + getPrice() +
               ", Discounted Price: " + getDiscountedPrice();
    }
}
class RecycledProduct extends Product {
    public RecycledProduct(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice() * 0.95; // 5% discount
    }

    @Override
    public String toString() {
        return "Product ID: " + getId() +
               ", Name: " + getName() +
               ", Base Price: " + getPrice() +
               ", Discounted Price: " + getDiscountedPrice();
    }
}

final class EcoRules {
    public static void showRules() {
        System.out.println("Use eco-friendly bags.");
        System.out.println("Recycle waste responsibly.");
    }
}

class Cart {
    private List<Product> products = new ArrayList<>();
    private static int totalCartsCreated = 0;
    public static final double TAX_RATE = 0.05; // 5%

    public Cart() {
        totalCartsCreated++;
    }

    public void addItem(Product product) {
        products.add(product);
        System.out.println("Added Product: " + product.getName());
    }

    public void addItem(Product... products) {
        for (Product p : products) {
            this.products.add(p);
            System.out.println("Added Product: " + p.getName());
        }
    }

    public void addItem(int productId, int quantity) {
        System.out.println("Added " + quantity + " units of Product ID " + productId);
    }

    public static int getCartCount() {
        return totalCartsCreated;
    }

    public void printCartItems() {
        System.out.println("Items in Cart:");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println();
    }

    public final void printBillHeader() {
        System.out.println("******* EcoCart Bill ********");
    }

    public void printBill() {
        printBillHeader();
        double grandTotal = 0.0;
        for (Product p : products) {
            double discounted = p.getDiscountedPrice();
            double tax = discounted * TAX_RATE;
            double total = discounted + tax;
            System.out.println("Item: " + p.getName() +
                               ", Price: " + discounted +
                               ", Tax: " + tax +
                               ", Total: " + total);
            grandTotal += total;
        }
        System.out.println("----------------------------");
        System.out.println("Grand Total: " + grandTotal);
        System.out.println();
    }
}

public class EcoCartDemo {
    public static void main(String[] args) {

        Product p1 = new OrganicProduct(101, "Organic Apple", 100);
        Product p2 = new RecycledProduct(201, "Recycled Notebook", 200);
        Product p3 = new OrganicProduct(102, "Organic Banana", 50);

        p1.displayProductInfo();
        p2.displayProductInfo();
        p3.displayProductInfo();

        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        cart1.addItem(p1);             
        cart1.addItem(p2, p3);        
        cart1.addItem(101, 3);

    
        cart1.printCartItems();

        System.out.println("Total carts created: " + Cart.getCartCount());
        System.out.println();

        cart1.printBill();

        EcoRules.showRules();
    }
}
