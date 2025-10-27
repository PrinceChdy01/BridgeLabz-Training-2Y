import java.util.Scanner;

public class FactorialCalculator {

    private static int inputNumber(Scanner scanner) {
        System.out.print("Enter a non-negative integer: ");
        return scanner.nextInt();
    }

    private static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    private static void displayResult(int n, long factorial) {
        System.out.println("Factorial of " + n + " is " + factorial);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = inputNumber(scanner);
        if (n < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        } else {
            long fact = factorial(n);
            displayResult(n, fact);
        }

        scanner.close();
    }
}
