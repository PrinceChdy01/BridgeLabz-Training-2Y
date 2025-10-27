import java.util.Scanner;

public class Q15FactorialForLoop {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + number + " is " + factorial);
        }

    }
    }
}
