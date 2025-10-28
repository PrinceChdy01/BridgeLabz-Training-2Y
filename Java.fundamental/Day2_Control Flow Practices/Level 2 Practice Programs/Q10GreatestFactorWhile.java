import java.util.Scanner;

public class Q10GreatestFactorWhile {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int greatestFactor = 1; 

        if (number > 1) {
            int counter = number - 1; 

            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; 
                }
                counter--;
            }

            System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        } else {
            System.out.println("The number " + number + " does not have factors other than itself.");
        }

    }
    }
}
