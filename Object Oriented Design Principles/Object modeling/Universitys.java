import java.util.ArrayList;
import java.util.List;

// Faculty class (aggregation: can exist independently)
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String toString() {
        return "Faculty: " + name;
    }
}

// Department class (composition: owned by University)
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String toString() {
        return "Department: " + name;
    }
}

// University class
class University {
    private String name;
    private List<Department> departments; // composition
    private List<Faculty> facultyMembers; // aggregation

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void showUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println("  " + d);
        }
        System.out.println("Faculty Members:");
        for (Faculty f : facultyMembers) {
            System.out.println("  " + f);
        }
    }

    public void deleteUniversity() {
        departments.clear(); // composition: removes all departments
        System.out.println("University '" + name + "' deleted. All departments removed.");
        // Faculty members, as aggregation, are not affected by university deletion
    }
}

// Demo
public class Universitys {
    public static void main(String[] args) {
        University uni = new University("Global University");
        Faculty profJohn = new Faculty("Dr. John Smith");
        Faculty profAlice = new Faculty("Dr. Alice Walker");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mathematics");

        uni.addFaculty(profJohn);
        uni.addFaculty(profAlice);

        // Faculties can exist independently
        Faculty profBob = new Faculty("Dr. Bob Brown"); // not part of university, but exists

        uni.showUniversity();

        // Delete university (composition)
        uni.deleteUniversity();
        // Faculties outside university continue to exist
        System.out.println("Prof Bob exists: " + profBob);
    }
}
