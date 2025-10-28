public class Book {
    private static String libraryName = "Central Library";

    private String title;
    private String author;
    private final String isbn;  // final unique identifier

    // Constructor uses 'this' to initialize fields
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Display book details with instanceof check
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Object is not a Book instance.");
        }
    }

    // Test main method
    public static void main(String[] args) {
        Book.displayLibraryName();

        Book book1 = new Book("1984", "George Orwell", "ISBN1234");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN5678");

        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();

        // instanceof check with different object
        Object obj = new Object();
        if (obj instanceof Book) {
            ((Book) obj).displayBookDetails();
        } else {
            System.out.println("obj is not an instance of Book");
        }
    }
}
