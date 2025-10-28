public class Student {
    private static String universityName = "State University";
    private static int totalStudents = 0;

    private final int rollNumber;  // final: unique and immutable
    private String name;
    private String grade;

    // Constructor uses 'this' to resolve variable ambiguity
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    // Display student details
    public void displayStudentDetails() {
        if (this instanceof Student) { // instanceof check
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Object is not an instance of Student.");
        }
    }

    // Update grade safely after instanceof verification
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to " + newGrade + " for Roll Number " + rollNumber);
        } else {
            System.out.println("Invalid object, cannot update grade.");
        }
    }

    // Getters and setters
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    // Test main method
    public static void main(String[] args) {
        Student s1 = new Student(101, "John Doe", "A");
        Student s2 = new Student(102, "Emily Smith", "B");

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();
        System.out.println();

        Student.displayTotalStudents();

        System.out.println();

        // Update grade with instanceof check
        s1.updateGrade("A+");
        s1.displayStudentDetails();

        // instanceof test with non-student object
        Object obj = new Object();
        if (obj instanceof Student) {
            ((Student) obj).displayStudentDetails();
        } else {
            System.out.println("obj is not an instance of Student.");
        }
    }
}
