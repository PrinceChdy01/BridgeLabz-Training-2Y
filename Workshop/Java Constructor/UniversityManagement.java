import java.util.Scanner;

// Parent class: Student
class Student {
    public int rollNumber;       // public
    protected String name;       // protected
    private double CGPA;         // private

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0.0 and 10.0");
        }
    }

    // Display method
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("CGPA       : " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number   : " + rollNumber);  // public
        System.out.println("Name          : " + name);        // protected
        System.out.println("CGPA          : " + getCGPA());   // private via getter
        System.out.println("Specialization: " + specialization);
    }
}

// Main class
public class UniversityManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Regular Student
        System.out.println("Enter Regular Student Details:");
        System.out.print("Roll Number: ");
        int roll1 = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("CGPA: ");
        double cgpa1 = sc.nextDouble();

        Student s1 = new Student(roll1, name1, cgpa1);
        System.out.println("\nRegular Student:");
        s1.displayDetails();

        // Update CGPA
        System.out.print("\nEnter new CGPA for " + name1 + ": ");
        double newCgpa = sc.nextDouble();
        s1.setCGPA(newCgpa);
        System.out.println("After CGPA Update:");
        s1.displayDetails();

        // Input for Postgraduate Student
        sc.nextLine(); // consume newline
        System.out.println("\nEnter Postgraduate Student Details:");
        System.out.print("Roll Number: ");
        int roll2 = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("CGPA: ");
        double cgpa2 = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Specialization: ");
        String specialization = sc.nextLine();

        PostgraduateStudent pgStudent = new PostgraduateStudent(roll2, name2, cgpa2, specialization);
        System.out.println();
        pgStudent.displayPGDetails();

        sc.close();
    }
}
