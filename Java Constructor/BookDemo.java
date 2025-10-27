// Book.java
class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}

// Main class
public class BookDemo {
    public static void main(String[] args) {
        // Using default constructor
        Book book1 = new Book();
        book1.displayDetails();
        System.out.println();

        // Using parameterized constructor
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 399.0);
        book2.displayDetails();
    }
}
