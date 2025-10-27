public class Employee {
    private static String companyName = "Tech Solutions Inc.";
    private static int totalEmployees = 0;

    private final int id;  // final: cannot be changed after assignment
    private String name;
    private String designation;

    // Constructor using 'this' to initialize fields
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Display employee details with instanceof check
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Object is not an instance of Employee.");
        }
    }

    // Test main method
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Alice", "Developer");
        Employee emp2 = new Employee(102, "Bob", "Manager");

        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();

        System.out.println();
        Employee.displayTotalEmployees();

        // instanceof test with other object type
        Object obj = new Object();
        if (obj instanceof Employee) {
            ((Employee) obj).displayEmployeeDetails();
        } else {
            System.out.println("obj is not an instance of Employee.");
        }
    }
}
