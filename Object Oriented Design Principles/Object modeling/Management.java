import java.util.ArrayList;
import java.util.List;

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

    // Enroll student in course (association)
    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void showCourses() {
        System.out.println(name + " is enrolled in courses:");
        for (Course c : courses) {
            System.out.println("  " + c.getCourseName());
        }
    }
}

// Professor class
class Professor {
    private String name;
    private List<Course> coursesTeaching;

    public Professor(String name) {
        this.name = name;
        this.coursesTeaching = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Assign professor to teach a course (association)
    public void assignCourse(Course course) {
        if (!coursesTeaching.contains(course)) {
            coursesTeaching.add(course);
            course.setProfessor(this);
        }
    }

    public void showCourses() {
        System.out.println("Professor " + name + " teaches courses:");
        for (Course c : coursesTeaching) {
            System.out.println("  " + c.getCourseName());
        }
    }
}

// Course class (aggregation with students and professor)
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("  " + s.getName());
        }
    }

    public void showProfessor() {
        if (professor != null) {
            System.out.println("Professor for " + courseName + ": " + professor.getName());
        } else {
            System.out.println("No professor assigned for " + courseName);
        }
    }
}

// Demonstration class
public class Management {
    public static void main(String[] args) {
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        Professor drSmith = new Professor("Dr. Smith");
        Professor drJones = new Professor("Dr. Jones");

        Course math = new Course("Mathematics");
        Course physics = new Course("Physics");

        // Assign professors to courses
        drSmith.assignCourse(math);
        drJones.assignCourse(physics);

        // Students enroll in courses
        alice.enrollCourse(math);
        alice.enrollCourse(physics);
        bob.enrollCourse(physics);

        // Display info
        alice.showCourses();
        bob.showCourses();

        math.showProfessor();
        physics.showProfessor();

        math.showStudents();
        physics.showStudents();

        drSmith.showCourses();
        drJones.showCourses();
    }
}
