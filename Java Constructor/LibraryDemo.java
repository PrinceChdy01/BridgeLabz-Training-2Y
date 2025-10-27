// Book.java
class Book {
    // Attributes
    String title;
    String author;
    double price;
    boolean availability;

    // Parameterized constructor
    Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow a book
    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently not available.");
        }
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : Rs. " + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }
}

// Main class
public class LibraryDemo {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 399.0, true);
        Book book2 = new Book("1984", "George Orwell", 350.0, false);

        // Display details
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
        System.out.println();

        // Borrow books
        book1.borrowBook(); // Available
        book2.borrowBook(); // Not available

        System.out.println();
        // Display details again to see updated availability
        book1.displayDetails();
        book2.displayDetails();
    }
}
