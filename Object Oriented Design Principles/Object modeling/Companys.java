import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee: " + name;
    }
}

// Department class (owned by Company)
class Department {
    String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    public void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            System.out.println("  " + e);
        }
    }
}

// Company class (composition owner)
class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public Department getDepartment(String deptName) {
        for (Department d : departments) {
            if (d.name.equals(deptName)) {
                return d;
            }
        }
        return null;
    }

    public void showCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    public void deleteCompany() {
        // Demonstrate composition: clear out all references
        departments.clear();
        System.out.println("Company '" + name + "' deleted. All departments and employees removed.");
    }
}

// Demonstration of composition
public class Companys {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        comp.addDepartment("Engineering");
        comp.addDepartment("HR");

        Department eng = comp.getDepartment("Engineering");
        Department hr = comp.getDepartment("HR");

        eng.addEmployee("Alice");
        eng.addEmployee("Bob");
        hr.addEmployee("Carol");

        comp.showCompany();

        // Delete company (composition)
        comp.deleteCompany();
        // Trying to showCompany after deletion should not show any departments/employees
        comp.showCompany();
    }
}
