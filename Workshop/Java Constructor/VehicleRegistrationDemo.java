// Vehicle.java
class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (shared for all vehicles)
    static double registrationFee = 5000.0;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : Rs. " + registrationFee);
    }

    // Class method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: Rs. " + registrationFee);
    }
}

// Main class
public class VehicleRegistrationDemo {
    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorbike");

        // Display vehicle details
        System.out.println("Vehicle 1 Details:");
        v1.displayVehicleDetails();
        System.out.println();

        System.out.println("Vehicle 2 Details:");
        v2.displayVehicleDetails();
        System.out.println();

        // Update registration fee
        Vehicle.updateRegistrationFee(6000.0);
        System.out.println();

        // Display vehicle details again after fee update
        System.out.println("Vehicle 1 Details After Update:");
        v1.displayVehicleDetails();
        System.out.println();

        System.out.println("Vehicle 2 Details After Update:");
        v2.displayVehicleDetails();
    }
}
