// Course.java
class Course {
    // Instance variables
    String courseName;
    int duration; // in weeks
    double fee;

    // Class variable (common for all courses)
    static String instituteName = "ABC Institute";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    void displayCourseDetails() {
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration + " weeks");
        System.out.println("Fee           : Rs. " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update institute name
    static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }
}

// Main class
public class CourseManagementDemo {
    public static void main(String[] args) {
        // Create course objects
        Course course1 = new Course("Java Programming", 12, 15000);
        Course course2 = new Course("Python Programming", 10, 12000);

        // Display course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();

        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
        System.out.println();

        // Update institute name
        Course.updateInstituteName("XYZ Academy");
        System.out.println();

        // Display course details again after institute name change
        System.out.println("Course 1 Details After Update:");
        course1.displayCourseDetails();
        System.out.println();

        System.out.println("Course 2 Details After Update:");
        course2.displayCourseDetails();
    }
}
