import java.util.Arrays;
import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                digits = Arrays.copyOf(digits, maxDigit);
            }
            digits[index++] = (int) (number % 10);
            number /= 10;
        }

        if (index == 0) {
            System.out.println("No digits entered.");
            scanner.close();
            return;
        }

        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            int digit = digits[i];
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest == -1 ? "None" : secondLargest));

        scanner.close();
    }
}
