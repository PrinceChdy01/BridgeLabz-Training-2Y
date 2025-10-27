import java.util.Scanner;

public class Q11SumUntilZeroOrNegative {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        int sum = 0;
        int number;

        System.out.println("Enter numbers to add (enter 0 or a negative number to stop):");

        while (true) {
            number = sc.nextInt();

            if (number <= 0) {
                break;
            }

            sum += number;
        }

        System.out.println("The sum of numbers is " + sum);

}
    }
}
