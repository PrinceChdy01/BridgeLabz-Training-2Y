import java.util.HashMap;
import java.util.Map;

// GradeCalculator class
class GradeCalculator {
    public String calculateGrade(Map<String, Integer> marks) {
        // Calculate average marks
        int total = 0;
        for (int mark : marks.values()) {
            total += mark;
        }
        double average = (double) total / marks.size();

        // Determine grade based on average
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

// Student class
class Student {
    private String name;
    private Map<String, Integer> marks;
    private GradeCalculator gradeCalculator;

    public Student(String name, GradeCalculator gradeCalculator) {
        this.name = name;
        this.marks = new HashMap<>();
        this.gradeCalculator = gradeCalculator;
    }

    public void addMark(String subject, int mark) {
        marks.put(subject, mark);
    }

    public void requestGrade() {
        String grade = gradeCalculator.calculateGrade(marks);
        System.out.println("Student: " + name + ", Grade: " + grade);
    }
}

// Main class to demonstrate
public class SchoolResult {
    public static void main(String[] args) {
        GradeCalculator gradeCalculator = new GradeCalculator();
        Student john = new Student("John", gradeCalculator);

        john.addMark("Maths", 90);
        john.addMark("Science", 85);

        // Student requests grade calculation
        john.requestGrade();
    }
}
