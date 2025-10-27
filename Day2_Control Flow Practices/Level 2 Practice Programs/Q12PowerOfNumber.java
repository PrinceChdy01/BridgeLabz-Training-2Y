import java.util.Scanner;

public class Q12PowerOfNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power (positive integer): ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Power must be a positive integer!");
        } else {
            int result = 1;

            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

    }
    }
}
