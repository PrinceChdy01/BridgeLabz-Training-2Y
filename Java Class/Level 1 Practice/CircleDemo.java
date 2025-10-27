// Circle.java
class Circle {
    // Attribute
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display results
    void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius         : " + radius);
        System.out.println("Area           : " + calculateArea());
        System.out.println("Circumference  : " + calculateCircumference());
    }
}

// Main class
public class CircleDemo {
    public static void main(String[] args) {
        // Create Circle object with radius 5
        Circle c1 = new Circle(5);

        // Display details
        c1.displayDetails();
    }
}
