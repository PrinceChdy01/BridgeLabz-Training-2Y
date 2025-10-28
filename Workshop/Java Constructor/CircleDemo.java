// Circle.java
class Circle {
    // Attribute
    double radius;

    // Default constructor
    Circle() {
        // Constructor chaining: calls parameterized constructor with default value
        this(1.0); // default radius = 1.0
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius : " + radius);
        System.out.println("Area   : " + calculateArea());
    }
}

// Main class
public class CircleDemo {
    public static void main(String[] args) {
        // Using default constructor
        Circle c1 = new Circle();
        c1.displayDetails();
        System.out.println();

        // Using parameterized constructor
        Circle c2 = new Circle(5.0);
        c2.displayDetails();
    }
}
