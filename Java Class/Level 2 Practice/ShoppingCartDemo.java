import java.util.ArrayList;

// CartItem class
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate cost of this item
    double getCost() {
        return price * quantity;
    }

    // Method to display item details
    void displayItem() {
        System.out.println(itemName + " (x" + quantity + ") - Rs. " + getCost());
    }
}

// ShoppingCart class
class ShoppingCart {
    ArrayList<CartItem> cartItems = new ArrayList<>();

    // Add an item
    void addItem(CartItem item) {
        cartItems.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    // Remove an item by name
    void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).itemName.equalsIgnoreCase(itemName)) {
                cartItems.remove(i);
                System.out.println(itemName + " removed from cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in cart.");
        }
    }

    // Display total cost
    void displayTotalCost() {
        double total = 0;
        System.out.println("\nCart Summary:");
        for (CartItem item : cartItems) {
            item.displayItem();
            total += item.getCost();
        }
        System.out.println("Total Cost: Rs. " + total);
    }
}

// Main class
public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items
        cart.addItem(new CartItem("Notebook", 50, 2));
        cart.addItem(new CartItem("Pen", 10, 5));
        cart.addItem(new CartItem("Bag", 700, 1));

        // Display total
        cart.displayTotalCost();

        // Remove an item
        cart.removeItem("Pen");
        cart.displayTotalCost();

        // Try removing item not in cart
        cart.removeItem("Shoes");
    }
}
