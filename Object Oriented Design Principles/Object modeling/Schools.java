import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    private String courseName;
    private List<Student> students;

    public Course(String name) {
        this.courseName = name;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this);  // maintain bi-directional association
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName + " Enrolled Students:");
        for (Student s : students) {
            System.out.println("  " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

// Student class
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        course.enrollStudent(this); // association (many-to-many)
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("  " + c.getCourseName());
        }
    }
}

// School class (aggregation)
class School {
    private String schoolName;
    private List<Student> students;

    public School(String name) {
        this.schoolName = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students at " + schoolName + ":");
        for (Student s : students) {
            System.out.println("  " + s.getName());
        }
    }
}

// Demonstration
public class Schools {
    public static void main(String[] args) {
        School school = new School("Springfield High");

        Student s1 = new Student("Bart Simpson");
        Student s2 = new Student("Lisa Simpson");

        Course maths = new Course("Mathematics");
        Course science = new Course("Science");
        Course english = new Course("English");

        // Aggregation: School has students
        school.addStudent(s1);
        school.addStudent(s2);

        // Association: Students enroll in courses (many-to-many)
        s1.enrollInCourse(maths);
        s1.enrollInCourse(english);

        s2.enrollInCourse(maths);
        s2.enrollInCourse(science);

        // Student views their courses
        s1.showCourses();
        s2.showCourses();

        // Course views enrolled students
        maths.showEnrolledStudents();
        science.showEnrolledStudents();
        english.showEnrolledStudents();

        // School views its students
        school.showStudents();
    }
}
