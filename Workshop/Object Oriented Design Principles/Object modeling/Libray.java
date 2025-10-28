import java.util.ArrayList;
import java.util.List;

// Book class, can exist independently
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

// Library class aggregates Book objects
class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

// Demonstration of aggregation
public class Libray {
    public static void main(String[] args) {
        // Create books (they exist independently)
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Clean Code", "Robert C. Martin");

        // Create libraries
        Library cityLibrary = new Library("City Library");
        Library universityLibrary = new Library("University Library");

        // Add books to libraries (same book can belong to multiple libraries)
        cityLibrary.addBook(b1);
        cityLibrary.addBook(b2);

        universityLibrary.addBook(b2);
        universityLibrary.addBook(b3);

        // Show books in each library
        cityLibrary.showBooks();
        universityLibrary.showBooks();
    }
}
