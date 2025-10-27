import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    private static int generateGuess(int low, int high) {
        return low + random.nextInt(high - low + 1);
    }

    private static String getUserFeedback(int guess) {
        System.out.println("Is the guess " + guess + "? Enter 'high', 'low', or 'correct':");
        return scanner.nextLine().trim().toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100.");

        int low = 1, high = 100;
        int guess;
        String feedback;

        while (true) {
            guess = generateGuess(low, high);
            feedback = getUserFeedback(guess);

            if (feedback.equals("correct")) {
                System.out.println("The computer guessed your number: " + guess);
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input, please respond with 'high', 'low', or 'correct'.");
            }

            if (low > high) {
                System.out.println("Inconsistent feedback. Game over.");
                break;
            }
        }
        scanner.close();
    }
}
