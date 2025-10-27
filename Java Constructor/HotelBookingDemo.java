// HotelBooking.java
class HotelBooking {
    // Attributes
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        this("Unknown Guest", "Standard", 1); // Calls parameterized constructor
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    void displayDetails() {
        System.out.println("Hotel Booking Details:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Nights    : " + nights);
    }
}

// Main class
public class HotelBookingDemo {
    public static void main(String[] args) {
        // Using default constructor
        HotelBooking booking1 = new HotelBooking();
        booking1.displayDetails();
        System.out.println();

        // Using parameterized constructor
        HotelBooking booking2 = new HotelBooking("Alice", "Deluxe", 3);
        booking2.displayDetails();
        System.out.println();

        // Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayDetails();
    }
}
