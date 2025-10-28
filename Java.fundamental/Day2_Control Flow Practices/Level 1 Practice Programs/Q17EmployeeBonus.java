import java.util.Scanner;

public class Q17EmployeeBonus {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the years of service: ");
        int years = sc.nextInt();

        double bonus = 0;

        if (years > 5) {
            bonus = 0.05 * salary;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus (service less than or equal to 5 years).");
        }

    }
    }
}
