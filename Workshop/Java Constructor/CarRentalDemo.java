// CarRental.java
class CarRental {
    // Attributes
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    // Rate per day (for simplicity, fixed rate)
    final double RATE_PER_DAY = 1500.0;

    // Default constructor
    CarRental() {
        this("Unknown Customer", "Standard Car", 1);
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    // Method to calculate total cost
    void calculateTotalCost() {
        totalCost = rentalDays * RATE_PER_DAY;
    }

    // Method to display rental details
    void displayDetails() {
        System.out.println("Car Rental Details:");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : Rs. " + totalCost);
    }
}

// Main class
public class CarRentalDemo {
    public static void main(String[] args) {
        // Using default constructor
        CarRental rental1 = new CarRental();
        rental1.displayDetails();
        System.out.println();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Alice", "Toyota Corolla", 5);
        rental2.displayDetails();
    }
}
