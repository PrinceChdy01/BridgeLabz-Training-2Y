import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int countDigits = 0;
        long temp = number;
        while (temp != 0) {
            temp /= 10;
            countDigits++;
        }

        int[] digits = new int[countDigits];
        temp = number;
        for (int i = 0; i < countDigits; i++) {
            digits[i] = (int) (temp % 10);
            temp /= 10;
        }

        System.out.print("Reversed number digits: ");
        for (int i = 0; i < countDigits; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        scanner.close();
    }
}
