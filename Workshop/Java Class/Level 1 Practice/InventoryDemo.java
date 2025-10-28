// Item.java
class Item {
    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Code  : " + itemCode);
        System.out.println("Name  : " + itemName);
        System.out.println("Price : " + price);
    }

    // Method to calculate total cost for given quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

// Main class
public class InventoryDemo {
    public static void main(String[] args) {
        // Create an Item object
        Item item1 = new Item(101, "Notebook", 50.0);

        // Display item details
        item1.displayDetails();

        // Example: Calculate total cost for 5 units
        int quantity = 5;
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : " + totalCost);
    }
}
