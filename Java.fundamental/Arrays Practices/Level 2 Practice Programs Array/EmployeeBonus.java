import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; ) { // i incremented inside loop to handle invalid input
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            double years = scanner.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Salary must be positive and years cannot be negative. Please re-enter.");
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years;
            i++;
        }

        for (int i = 0; i < 10; i++) {
            double bonusPercent = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercent;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.printf("Total bonus payout: %.2f%n", totalBonus);
        System.out.printf("Total old salary: %.2f%n", totalOldSalary);
        System.out.printf("Total new salary: %.2f%n", totalNewSalary);

        scanner.close();
    }
}
