public class Vehicle {
    private static double registrationFee = 150.0;  // static fee common to all

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;  // final unique identifier

    // Constructor uses 'this' to initialize fields
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to $" + registrationFee);
    }

    // Display registration details, checking instanceof
    public void displayRegistrationDetails(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Object is not an instance of Vehicle.");
        }
    }

    // Getters and setters for encapsulation
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    // Test main
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John Doe", "Car", "REG123");
        Vehicle v2 = new Vehicle("Alice Smith", "Motorcycle", "REG456");

        v1.displayRegistrationDetails(v1);
        System.out.println();
        v2.displayRegistrationDetails(v2);
        System.out.println();

        Vehicle.updateRegistrationFee(200.0);
        v1.displayRegistrationDetails(v1);
        System.out.println();

        Object obj = new Object();
        v1.displayRegistrationDetails(obj);
    }
}
