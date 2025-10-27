// MobilePhone.java
class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}

// Main class
public class MobilePhoneDemo {
    public static void main(String[] args) {
        // Create MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S24", 80000.0);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 16", 120000.0);

        // Display details of phones
        phone1.displayDetails();
        System.out.println();
        phone2.displayDetails();
    }
}
