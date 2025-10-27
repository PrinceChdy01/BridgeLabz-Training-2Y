// Student.java
class Student {
    // Attributes
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade
    String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F (Fail)";
        }
    }

    // Method to display student details and grade
    void displayDetails() {
        System.out.println("Student Report:");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
    }
}

// Main class
public class StudentReportDemo {
    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student("Alice", 101, 92.5);
        Student s2 = new Student("Bob", 102, 74.0);
        Student s3 = new Student("Charlie", 103, 48.0);

        // Display reports
        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
        System.out.println();
        s3.displayDetails();
    }
}
