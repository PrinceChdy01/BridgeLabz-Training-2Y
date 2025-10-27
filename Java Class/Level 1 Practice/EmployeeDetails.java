// Employee.java
class Employee {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }
}

// Main class
public class EmployeeDetails {
    public static void main(String[] args) {
        // Creating Employee object
        Employee emp1 = new Employee("John Doe", 101, 50000.0);

        // Display employee details
        emp1.displayDetails();
    }
}
