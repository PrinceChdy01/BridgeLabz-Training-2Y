import java.util.Scanner;

public class Q14FactorialWhileLoop {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
            int counter = 1;

            while (counter <= number) {
                factorial *= counter;
                counter++;
            }

            System.out.println("Factorial of " + number + " is " + factorial);
        }

    }
    }
}
