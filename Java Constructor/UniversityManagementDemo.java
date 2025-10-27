// Student.java
class Student {
    // Instance variables
    public int rollNumber;       // Public: accessible anywhere
    protected String name;       // Protected: accessible in subclass
    private double CGPA;         // Private: accessible only within this class

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0.0 and 10.0");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("CGPA       : " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    String specialization;

    // Constructor
    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA); // Call parent constructor
        this.specialization = specialization;
    }

    // Method to display details including specialization
    public void displayPGDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number   : " + rollNumber); // public from parent
        System.out.println("Name          : " + name);       // protected from parent
        System.out.println("CGPA          : " + getCGPA());  // private via public method
        System.out.println("Specialization: " + specialization);
    }
}

// Main class
public class UniversityManagementDemo {
    public static void main(String[] args) {
        // Create a regular student
        Student s1 = new Student(101, "Alice", 8.5);
        s1.displayDetails();
        System.out.println();

        // Update CGPA using setter
        s1.setCGPA(9.0);
        System.out.println("After CGPA Update:");
        s1.displayDetails();
        System.out.println();

        // Create a postgraduate student
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 9.2, "Computer Science");
        pgStudent.displayPGDetails();
    }
}
