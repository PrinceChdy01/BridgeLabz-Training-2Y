// Employee.java
class Employee {
    // Instance variables with different access modifiers
    public int employeeId;        // public
    protected String department;  // protected
    private double salary;        // private

    // Constructor
    Employee(int employeeId, String department, double salary) {
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary (because it's private)
    public double getSalary() {
        return salary;
    }

    // Setter for salary (with validation)
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
    }

    // Display method
    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeId);   // public
        System.out.println("Department  : " + department);   // protected
        System.out.println("Salary      : " + salary);       // private via this class
    }
}

// Subclass to demonstrate protected access
class Manager extends Employee {
    private String project;

    Manager(int employeeId, String department, double salary, String project) {
        super(employeeId, department, salary);
        this.project = project;
    }

    public void displayManagerDetails() {
        // Can access employeeId (public) and department (protected)
        System.out.println("Manager ID   : " + employeeId);
        System.out.println("Department   : " + department);
        // salary is private, so we must use getter
        System.out.println("Salary       : " + getSalary());
        System.out.println("Project      : " + project);
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "IT", 50000);
        emp1.displayEmployeeDetails();

        System.out.println("\nUpdating Salary...");
        emp1.setSalary(55000);
        emp1.displayEmployeeDetails();

        System.out.println("\nManager Details:");
        Manager mgr = new Manager(201, "HR", 75000, "Recruitment Drive");
        mgr.displayManagerDetails();
    }
}
