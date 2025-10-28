// MovieTicket.java
class MovieTicket {
    // Attributes
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    // Method to book a ticket
    void bookTicket(int seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat already booked!");
        }
    }

    // Method to display ticket details
    void displayTicket() {
        if (isBooked) {
            System.out.println("Movie Ticket Details:");
            System.out.println("Movie Name : " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price      : " + price);
        } else {
            System.out.println("No ticket booked yet for movie: " + movieName);
        }
    }
}

// Main class
public class MovieBookingDemo {
    public static void main(String[] args) {
        // Create MovieTicket object
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame");

        // Display before booking
        ticket1.displayTicket();
        System.out.println();

        // Book the ticket
        ticket1.bookTicket(12, 250.0);
        ticket1.displayTicket();
        System.out.println();

        // Try booking again for same seat
        ticket1.bookTicket(15, 300.0);
    }
}
