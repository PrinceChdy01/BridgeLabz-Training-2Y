import java.util.Scanner;

public class Q2EmployeeBonus {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus;

        if (years > 5) {
            bonus = salary * 0.05; 
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus as years of service is " + years);
        }

}
    }
}
