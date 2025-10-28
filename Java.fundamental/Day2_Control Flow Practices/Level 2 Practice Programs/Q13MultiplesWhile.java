import java.util.Scanner;

public class Q13MultiplesWhile {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter a number (less than 100): ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            int counter = 100;

            System.out.println("Multiples of " + number + " below 100 are:");

            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }

    }
    }
}
