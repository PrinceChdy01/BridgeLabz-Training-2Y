import java.util.Scanner;

public class Q14PowerWhile {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        // Take inputs
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        // While loop to compute power
        while (counter < power) {
            result = result * number;
            counter++;
        }

        System.out.println(number + " raised to the power " + power + " is: " + result);

    }
    }
}
