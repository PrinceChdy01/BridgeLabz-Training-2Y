import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String name;
    private double quantity; // amount in kg, liters, etc.
    private double pricePerUnit;

    public Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    @Override
    public String toString() {
        return name + " (" + quantity + " units at $" + pricePerUnit + " per unit)";
    }
}

// Customer class - composition owns products
class Customer {
    private String name;
    private List<Product> products;

    public Customer(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}

// BillGenerator class
class BillGenerator {
    public double generateTotalBill(Customer customer) {
        double total = 0;
        System.out.println("Generating bill for customer: " + customer.getName());
        for (Product p : customer.getProducts()) {
            double productTotal = p.getTotalPrice();
            System.out.println(p + " - Total: $" + productTotal);
            total += productTotal;
        }
        System.out.println("Total Bill Amount: $" + total);
        return total;
    }
}

// Demo Main class
public class Grocery {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice");
        alice.addProduct(new Product("Apples", 2, 3));  // 2 kg at $3 per kg
        alice.addProduct(new Product("Milk", 1, 2));    // 1 liter at $2 per liter

        BillGenerator billGenerator = new BillGenerator();

        // Customer checks out and bill is generated
        billGenerator.generateTotalBill(alice);
    }
}
